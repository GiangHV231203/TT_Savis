package com.example.demo.JPA.controller;

import com.example.demo.JPA.entity.SanPham;
import com.example.demo.JPA.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/san-pham/api/")
public class SanPhamController {

    @Autowired
    private SanPhamService sanPhamService;

    @GetMapping("view-all")
    public void getAll(){
        sanPhamService.getList();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        sanPhamService.delete(id);
    }

    @PostMapping("create")
    public void create(@RequestBody SanPham sanPham){
        sanPhamService.save(sanPham);
    }

    @PutMapping("edit/{is}")
    public void edit(@RequestBody SanPham sanPham, @RequestParam Long id){
        sanPhamService.update(sanPham,id);
    }

}
