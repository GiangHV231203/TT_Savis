package com.example.demo.controller;



import com.example.demo.JPA.entity.NhaSanXuat;
import com.example.demo.dbo.NhaSanXuatRequest;
import com.example.demo.service.NhaSanXuatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/NhaSanXuat")
public class NhaSanXuatController {

    @Autowired
    private NhaSanXuatService service;

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
    public ResponseEntity<?> add(@RequestBody NhaSanXuatRequest request){
        return ResponseEntity.ok(service.add(request));
    }

    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody NhaSanXuat nhaSanXuat){
        return ResponseEntity.ok(service.update(nhaSanXuat, ma));
    }
}
