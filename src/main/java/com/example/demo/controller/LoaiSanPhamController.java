package com.example.demo.controller;

import com.example.demo.JPA.entity.LoaiSanPham;
import com.example.demo.dbo.LoaiSanPhamRequest;
import com.example.demo.service.LoaiSanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loaiSanPham")
public class LoaiSanPhamController {

    @Autowired
    private LoaiSanPhamService service;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(service.delete(id)){
            return ResponseEntity.ok("Xoa thanh cong");
        }else {
            return ResponseEntity.ok("Xoa that bai");
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody LoaiSanPhamRequest request){
        return ResponseEntity.ok(service.add(request));
    }
    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody LoaiSanPham loaiSanPham){
        return ResponseEntity.ok(service.update(loaiSanPham, ma));
    }
}
