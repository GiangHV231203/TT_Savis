package com.example.demo.JPA.controller;

import com.example.demo.JPA.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class KhachHangController {
    @Autowired
    private KhachHangService khachHangService;

}
