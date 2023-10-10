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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SanPham")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SanPham {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSanPham")
    private Long maSP;

    @Column(name = "TenSanPham")
    private String tenSP;

    @Column(name = "ChatLieu")
    private String chatLieu;

    @Column(name = "GiaHienHanh")
    private Double giaHienHanh;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "MoTa")
    private String mota;

    @Column(name = "TrangThai")
    private Integer trangThai;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_loaiDe", referencedColumnName = "MaLoaiDe")
    private LoaiDe loaiDe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_mauSac", referencedColumnName = "MauMauSac")
    private MauSac mauSac;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_nhaSanXuat", referencedColumnName = "MaNSX")
    private NhaSanXuat nhaSanXuat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ma_loaiSanPham", referencedColumnName = "MaLoaiSp")
    private LoaiSanPham loaiSanPham;

}
