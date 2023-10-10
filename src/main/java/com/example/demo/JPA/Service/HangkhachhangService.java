package com.example.demo.JPA.Service;

import com.example.demo.JPA.entity.HangKhachHang;
import com.example.demo.JPA.entity.PhieuGiaoHang;

import java.util.List;
import java.util.UUID;

public interface HangkhachhangService {
    public List<HangKhachHang> getAll();

    public void save(HangKhachHang bp);

    public void delete(Long id);

    public HangKhachHang edit(Long id);
}
