package com.example.demo.JPA.controller;

import com.example.demo.JPA.entity.DanhSachYeuThich;
import com.example.demo.JPA.service.DanhSachYeuThichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/danh-sach-yeu-thich/api/")
public class DanhSachYeuThichController {

    @Autowired
    private DanhSachYeuThichService danhSachYeuThichService;

    @GetMapping("view-all")
    public List<DanhSachYeuThich> getAll() {
        return danhSachYeuThichService.getList();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable UUID id) {
        danhSachYeuThichService.delete(id);
    }

    @PostMapping("create")
    public void create(@RequestBody DanhSachYeuThich danhSachYeuThich){
        danhSachYeuThichService.save(danhSachYeuThich);
    }

    @PutMapping("/update")
    public void update(@RequestBody DanhSachYeuThich danhSachYeuThich) {

        danhSachYeuThichService.save(danhSachYeuThich);
    }
    @GetMapping("/edit/{id}")
    public DanhSachYeuThich findbyID(@PathVariable UUID id) {

        return danhSachYeuThichService.update(id);
    }
}
