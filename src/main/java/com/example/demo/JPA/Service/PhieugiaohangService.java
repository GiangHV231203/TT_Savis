package com.example.demo.JPA.Service;

import com.example.demo.JPA.entity.PhieuGiaoHang;

import java.util.List;
import java.util.UUID;

public interface PhieugiaohangService {
    public List<PhieuGiaoHang> getAll();

    public void save(PhieuGiaoHang bp);

    public void delete(UUID id);

    public PhieuGiaoHang edit(UUID id);
}
