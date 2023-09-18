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
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "GioHang")
@Entity
public class GioHang {
    @Id
    @Column(name = "MaGioHang")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID maGioHang;

    @Column(name = "NgayTao")
    private Date ngayTao;

    @Column(name = "NgayCapNhap")
    private Date ngayCapNhap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NguoiSoHuu",referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "TrangThai")
    private int trangThai;
}
