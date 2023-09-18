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

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "TheThanhVien")
@Entity
public class TheThanhVien {
    @Id
    @Column(name = "MaThe")
    private String maThe;

    @Column(name = "MauThe")
    private String mauThe;

    @Column(name = "LoaiThe")
    private String loaiThe;

    @Column(name = "NgayPhatHanh")
    private Date ngayPhatHanh;

    @Column(name = "NgayHuy")
    private Date ngayHuy;

    @Column(name = "TrangThai")
    private int trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NguoiSoHuu",referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;
}
