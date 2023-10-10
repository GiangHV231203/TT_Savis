package com.example.demo.JPA.Repository;

import com.example.demo.JPA.entity.HangKhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HangkhachhangRepository extends JpaRepository<HangKhachHang, Long> {
}
