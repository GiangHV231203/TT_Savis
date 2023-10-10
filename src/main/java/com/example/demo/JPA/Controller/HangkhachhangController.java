package com.example.demo.JPA.Controller;

import com.example.demo.JPA.Service.HangkhachhangService;
import com.example.demo.JPA.Service.Impl.DiachiServiceImpl;
import com.example.demo.JPA.Service.Impl.HangkhachhangServiceImpl;
import com.example.demo.JPA.entity.DiaChi;
import com.example.demo.JPA.entity.HangKhachHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/hangkhachhang")
public class HangkhachhangController {
    @Autowired
    HangkhachhangServiceImpl hangkhachhangService;
    @PostMapping("/add")

    public void add(@RequestBody HangKhachHang hangKhachHang) {
        hangkhachhangService.save(hangKhachHang);
    }
    @GetMapping
    public List<HangKhachHang> getAll() {

        return hangkhachhangService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {

        hangkhachhangService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody HangKhachHang hangKhachHang) {

        hangkhachhangService.save(hangKhachHang);
    }
    @GetMapping("/edit/{id}")
    public HangKhachHang findbyID(@PathVariable Long id) {

        return hangkhachhangService.edit(id);
    }
}
