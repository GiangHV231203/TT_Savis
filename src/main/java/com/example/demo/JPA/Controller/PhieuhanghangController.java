package com.example.demo.JPA.Controller;

import com.example.demo.JPA.Service.Impl.DiachiServiceImpl;
import com.example.demo.JPA.Service.Impl.PhieugiaohangServiceImpl;
import com.example.demo.JPA.Service.PhieugiaohangService;
import com.example.demo.JPA.entity.DiaChi;
import com.example.demo.JPA.entity.PhieuGiaoHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
public class PhieuhanghangController {

    @Autowired
    PhieugiaohangServiceImpl phieugiaohangService;
    @PostMapping("/add")

    public void add(@RequestBody PhieuGiaoHang phieuGiaoHang) {

        phieugiaohangService.save(phieuGiaoHang);
    }
    @GetMapping
    public List<PhieuGiaoHang> getAll() {

        return phieugiaohangService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id) {

        phieugiaohangService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody PhieuGiaoHang phieuGiaoHang) {

        phieugiaohangService.save(phieuGiaoHang);
    }
    @GetMapping("/edit/{id}")
    public PhieuGiaoHang findbyID(@PathVariable UUID id) {

        return phieugiaohangService.edit(id);
    }
}
