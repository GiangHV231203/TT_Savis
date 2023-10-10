package com.example.demo.JPA.service;

import com.example.demo.JPA.entity.SanPham;

import java.util.List;

public interface SanPhamService {

    List<SanPham> getList();

    void save(SanPham sanPham);

    void update(SanPham sanPham,Long maSp);

    void delete(Long maSP);
}
