package com.example.demo.repository;

import com.example.demo.JPA.entity.MauSac;
import com.example.demo.dbo.MauSauCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MauSacRepository extends JpaRepository<MauSac, Long> {

    @Query(value = "select MauSac.Ten from MauSac",nativeQuery = true)
    List<MauSauCustom>getAllMauSac();
}
