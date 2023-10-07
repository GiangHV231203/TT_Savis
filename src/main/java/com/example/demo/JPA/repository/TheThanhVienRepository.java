package com.example.demo.JPA.repository;

import com.example.demo.JPA.entity.TheThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheThanhVienRepository extends JpaRepository<TheThanhVien,String> {
    TheThanhVien findTheThanhVienByMaThe(String maThe);
}
