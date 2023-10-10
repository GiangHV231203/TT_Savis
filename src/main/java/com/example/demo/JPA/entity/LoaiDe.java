package com.example.demo.JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "LoaiDe")
@Entity
public class LoaiDe {

    @Id
    @Column(name = "MaLoaiDe")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maLoaiDe;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "MoTa")
    private String moTa;
}
