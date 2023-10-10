package com.example.demo.JPA.Controller;

import com.example.demo.JPA.Service.Impl.DiachiServiceImpl;
import com.example.demo.JPA.entity.DiaChi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/diachi")
public class DiachiController {
    @Autowired
    DiachiServiceImpl diachiService;
    @PostMapping("/add")

    public void add(@RequestBody DiaChi dc) {
      diachiService.save(dc);
    }
    @GetMapping
    public List<DiaChi> getAll() {

        return diachiService.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable UUID id) {

        diachiService.delete(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody DiaChi dc) {

         diachiService.save(dc);
    }
    @GetMapping("/edit/{id}")
    public DiaChi findbyID(@PathVariable UUID id) {

        return diachiService.edit(id);
    }
}
