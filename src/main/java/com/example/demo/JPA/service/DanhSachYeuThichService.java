package com.example.demo.JPA.service;

import com.example.demo.JPA.entity.DanhSachYeuThich;

import java.util.List;
import java.util.UUID;

public interface DanhSachYeuThichService {

    List<DanhSachYeuThich> getList();

    void save(DanhSachYeuThich dsyt);

    DanhSachYeuThich update(UUID id);

    void delete(UUID id);

}
