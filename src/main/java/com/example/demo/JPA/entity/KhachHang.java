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

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "KhachHang")
@Entity
public class KhachHang {
    @Id
    @Column(name = "MaKhachHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maKhachHang;

    @Column(name = "TenKhachHang")
    private String tenKhachHang;

    @Column(name = "SinhNhat")
    private Date sinhNhat;

    @Column(name = "DiaChi")
    private String diaChi;

    @Column(name = "SoDienThoai")
    private String soDienThoai;

    @Column(name = "Email")
    private String email;

    @Column(name = "GioiTinh")
    private Boolean gioiTinh;

    @Column(name = "ChungMinhThu")
    private String chungMinhThu;

    @Column(name = "SoCanCuoc")
    private String soCanCuoc;

    @Column(name = "AnhDaiDien")
    private String anhDaiDien;

    @Column(name = "TrangThai")
    private int trangTHai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HangKhachHang",referencedColumnName = "MaHang")
    private HangKhachHang hangKhachHang;
}
