package com.example.demo.JPA.service.impl;

import com.example.demo.JPA.entity.DanhSachYeuThich;
import com.example.demo.JPA.repository.DanhSachYeuThichRepo;
import com.example.demo.JPA.service.DanhSachYeuThichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service

public class DanhSachYeuThichServiceImpl implements DanhSachYeuThichService {

    @Autowired
    private DanhSachYeuThichRepo danhSachYeuThichRepo;

    @Override
    public List<DanhSachYeuThich> getList() {
        return danhSachYeuThichRepo.findAll();
    }

    @Override
    public void save(DanhSachYeuThich dsyt) {
        danhSachYeuThichRepo.save(dsyt);
    }

    @Override
    public DanhSachYeuThich update(UUID id) {
        return danhSachYeuThichRepo.findById(id).get();
    }

    @Override
    public void delete(UUID id) {
        danhSachYeuThichRepo.deleteById(id);
    }
}
