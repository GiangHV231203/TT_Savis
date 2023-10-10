package com.example.demo.controller;



import com.example.demo.JPA.entity.MauSac;
import com.example.demo.dbo.MauSacRequest;
import com.example.demo.service.MauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/MauSac")
public class MauSacController {

    @Autowired
    private MauSacService mauSac;

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(mauSac.getAll());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(mauSac.delete(id)){
            return ResponseEntity.ok("Xoa thanh cong");
        }else {
            return ResponseEntity.ok("Xoa that bai");
        }
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody MauSacRequest request){
        return ResponseEntity.ok(mauSac.add(request));
    }

    @PutMapping("/update/{ma}")
    public ResponseEntity<?> update(@PathVariable Long ma, @RequestBody MauSac ms){
        return ResponseEntity.ok(mauSac.update(ms, ma));
    }
}
