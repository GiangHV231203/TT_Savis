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
@Table(name = "LoaiSp")
@Entity
public class LoaiSanPham {

    @Id
    @Column(name = "MaLoaiSp")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maLoaiSanPham;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "MoTa")
    private String moTa;



}
