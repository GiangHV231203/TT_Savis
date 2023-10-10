package com.example.demo.controller;

import com.example.demo.JPA.entity.LoaiDe;
import com.example.demo.dbo.LoaiDeRequest;
import com.example.demo.service.LoaiDeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/loaiDe")
public class LoaiDeController {

    @Autowired
    private LoaiDeService service;

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
    public ResponseEntity<?> add(@RequestBody LoaiDeRequest request){
        return ResponseEntity.ok(service.add(request));
    }

    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody LoaiDe loaiDe){
        return ResponseEntity.ok(service.update(loaiDe, ma));
    }
}
