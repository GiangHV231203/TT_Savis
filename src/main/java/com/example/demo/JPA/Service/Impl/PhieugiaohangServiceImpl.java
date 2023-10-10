package com.example.demo.JPA.Service.Impl;

import com.example.demo.JPA.Repository.PhieugiaohangRepository;
import com.example.demo.JPA.Service.PhieugiaohangService;
import com.example.demo.JPA.entity.PhieuGiaoHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PhieugiaohangServiceImpl implements PhieugiaohangService {
    @Autowired
    PhieugiaohangRepository phieugiaohangRepository;
    @Override
    public List<PhieuGiaoHang> getAll() {
        return phieugiaohangRepository.findAll();
    }

    @Override
    public void save(PhieuGiaoHang bp) {
    phieugiaohangRepository.save(bp);
    }

    @Override
    public void delete(UUID id) {
    phieugiaohangRepository.delete(phieugiaohangRepository.findById(id).get());
    }

    @Override
    public PhieuGiaoHang edit(UUID id) {
        return phieugiaohangRepository.findById(id).get();
    }
}
