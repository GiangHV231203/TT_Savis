package com.example.demo.service;

import com.example.demo.dbo.LoaiSanPhamCustom;
import com.example.demo.dbo.LoaiSanPhamRequest;
import com.example.demo.dbo.MauSacRequest;


import java.util.List;

public interface LoaiSanPhamService {

    List<LoaiSanPhamCustom> getAll();
    com.example.demo.JPA.entity.LoaiSanPham add(LoaiSanPhamRequest request);
    Boolean delete(Long id);
    com.example.demo.JPA.entity.LoaiSanPham update (com.example.demo.JPA.entity.LoaiSanPham sanPham, Long ma);
}
