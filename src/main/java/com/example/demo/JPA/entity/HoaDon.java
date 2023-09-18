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
@Table(name = "HoaDon")
@Entity
public class HoaDon {

    @Id
    @Column(name = "MaHoaDon")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maHoaDon;

    @Column(name = "NgayLap")
    private Date ngayLap;

    @Column(name = "NgaySua")
    private Date ngaySua;

    @Column(name = "NguoiLap")
    private String nguoiLap;

    @Column(name = "NguoiSua")
    private String nguoiSua;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "NgayThanhToan")
    private Date ngayThanhToan;

    @Column(name = "TrangThai")
    private int trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NguoiMua",referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;
}
