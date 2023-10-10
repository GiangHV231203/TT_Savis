package com.example.demo.JPA.Service;

import com.example.demo.JPA.entity.DiaChi;
import com.example.demo.JPA.entity.PhieuGiaoHang;

import java.util.List;
import java.util.UUID;

public interface DiachiService {
    public List<DiaChi> getAll();

    public void save(DiaChi bp);

    public void delete(UUID id);

    public DiaChi edit(UUID id);
}
