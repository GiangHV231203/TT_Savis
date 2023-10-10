package com.example.demo.JPA.service.impl;

import com.example.demo.JPA.entity.SanPham;
import com.example.demo.JPA.repository.SanPhamRepo;
import com.example.demo.JPA.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SanPhamServiceImpl implements SanPhamService {

    @Autowired
    private SanPhamRepo sanPhamRepo;

    @Override
    public List<SanPham> getList() {
        return sanPhamRepo.findAll();
    }

    @Override
    public void save(SanPham sanPham) {
        SanPham sp = SanPham.builder()
                .maSP(sanPham.getMaSP())
                .tenSP(sanPham.getTenSP())
                .chatLieu(sanPham.getChatLieu())
                .giaHienHanh(sanPham.getGiaHienHanh())
                .soLuongTon(sanPham.getSoLuongTon())
                .mota(sanPham.getMota())
                .trangThai(sanPham.getTrangThai())
                .loaiDe(sanPham.getLoaiDe())
                .mauSac(sanPham.getMauSac())
                .nhaSanXuat(sanPham.getNhaSanXuat())
                .loaiSanPham(sanPham.getLoaiSanPham())
                .build();
        sanPhamRepo.save(sp);
    }

    @Override
    public void update(SanPham sanPham, Long maSp) {
        SanPham findSp = sanPhamRepo.findById(maSp).orElse(null);
        findSp= SanPham.builder()
                .maSP(sanPham.getMaSP())
                .tenSP(sanPham.getTenSP())
                .chatLieu(sanPham.getChatLieu())
                .giaHienHanh(sanPham.getGiaHienHanh())
                .soLuongTon(sanPham.getSoLuongTon())
                .mota(sanPham.getMota())
                .trangThai(sanPham.getTrangThai())
                .loaiDe(sanPham.getLoaiDe())
                .mauSac(sanPham.getMauSac())
                .nhaSanXuat(sanPham.getNhaSanXuat())
                .loaiSanPham(sanPham.getLoaiSanPham())
                .build();
        sanPhamRepo.save(findSp);
    }

    @Override
    public void delete(Long maSP) {
        sanPhamRepo.deleteById(maSP);
    }
}
