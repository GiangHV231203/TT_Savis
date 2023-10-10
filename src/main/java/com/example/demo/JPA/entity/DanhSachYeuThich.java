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
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "DanhSachYeuThich")
@Entity
public class DanhSachYeuThich {
    @Id
    @Column(name = "MaDanhSach")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID maDanhSach;

    @Column(name = "NgayTao")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date ngayTao;

    @Column(name = "NgayCapNhap")
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private Date ngayCapNhap;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KhachHang",referencedColumnName = "MaKhachHang")
    private KhachHang khachHang;

    @Column(name = "GhiChu")
    private String ghiChu;

    @Column(name = "TrangThai")
    private Integer trangThai;
}
