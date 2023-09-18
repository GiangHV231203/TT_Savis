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

import java.math.BigDecimal;
import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "PhieuGiaoHang")
@Entity
public class PhieuGiaoHang {
    @Id
    @Column(name = "MaPhieuGiao")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID maPhieuGiaoHang;

    @Column(name = "NguoiNhan")
    private String nguoiNhan;

    @Column(name = "SdtNhan")
    private String sdtNhan;

    @Column(name = "NguoiGiao")
    private String nguoiGiao;

    @Column(name = "SdtGiao")
    private String sdtGiao;

    @Column(name = "NgayGiao")
    private Date ngayGiao;

    @Column(name = "NgayNhan")
    private Date ngayNhan;

    @Column(name = "NguoiTao")
    private String nguoiTao;

    @Column(name = "PhiGiaoHang")
    private BigDecimal phiGiaoHang;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "HoaDonGiao",referencedColumnName = "MaHoaDon")
    private HoaDon hoaDon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DiaChiGiao",referencedColumnName = "MaDiaChi")
    private DiaChi diaChi;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "TrangThai")
    private int trangThai;
}
