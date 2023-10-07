package com.example.demo.JPA.repository;

import com.example.demo.JPA.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhachHangRepository extends JpaRepository<KhachHang,Long> {
    KhachHang findKhachHangsByMaKhachHang(Long maKhachHang);
}
