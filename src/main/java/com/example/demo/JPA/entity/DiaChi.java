package com.example.demo.JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "DiaChi")
@Entity
public class DiaChi {
    @Id
    @Column(name = "MaDiaChi")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID maDiaChi;

    @Column(name = "TenDiaChi")
    private String tenDiaChi;

    @Column(name = "MoTaChiTiet")
    private String moTaChiTiet;

    @Column(name = "TinhThanhPho")
    private String tinhThanhPho;

    @Column(name = "QuanHuyen")
    private String quanHuyen;

    @Column(name = "PhuongXa")
    private String phuongXa;

    @Column(name = "DuongPho")
    private String duongPho;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHang",referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;
}
