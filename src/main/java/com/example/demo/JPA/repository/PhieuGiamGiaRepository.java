package com.example.demo.JPA.repository;

import com.example.demo.JPA.entity.PhieuGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuGiamGiaRepository extends JpaRepository<PhieuGiamGia,String> {
    PhieuGiamGia findPhieuGiamGiaByMaPhieu(String maPhieu);
}
