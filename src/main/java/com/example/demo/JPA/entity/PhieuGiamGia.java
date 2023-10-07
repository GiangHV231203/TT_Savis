package com.example.demo.JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "PhieuGiamGia")
@Entity
public class PhieuGiamGia {
    @Id
    @Column(name = "MaPhieu")
    private String maPhieu;

    @Column(name = "TenPhieu")
    private String tenPhieu;

    @Column(name = "NgayBatDau")
    private Date ngayBatDau;

    @Column(name = "NgayKetThuc")
    private Date ngayKetThuc;

    @Column(name = "GiaTriGiam")
    private BigDecimal giaTriGiam;

    @Column(name = "GiaTriGiamToiDa")
    private BigDecimal giaTriGiamToiDa;

    @Column(name = "HinhThucGiam")
    private Boolean hinhThucGiam;

    @Column(name = "TrangThai")
    private int trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NguoiSoHuu",referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;
}
