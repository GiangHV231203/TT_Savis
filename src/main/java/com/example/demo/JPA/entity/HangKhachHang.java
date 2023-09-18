package com.example.demo.JPA.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "HangKhachHang")
@Entity
public class HangKhachHang {
    @Id
    @Column(name = "MaHang")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maHang;

    @Column(name = "TenHang")
    private String tenHang;

    @Column(name = "MoTa")
    private String moTa;

    @Column(name = "DiemToiThieu")
    private int diemToiThieu;

    @Column(name = "TrangThai")
    private int trangThai;
}
