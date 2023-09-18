package com.example.demo.JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
