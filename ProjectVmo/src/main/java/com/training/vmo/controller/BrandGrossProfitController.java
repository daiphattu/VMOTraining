package com.training.vmo.controller;


import com.training.vmo.dto.BrandGrossProfitDTO;
import com.training.vmo.service.BrandGrossProfitService;
import com.training.vmo.serviceImpl.BrandGrossProfitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/brands")
public class BrandGrossProfitController {
    @Autowired
    private BrandGrossProfitService brandGrossProfitService;

    @GetMapping("/{brandId}/gross-profit")
    public ResponseEntity<BrandGrossProfitDTO> getBrandGrossProfit(@PathVariable("brandId") String brandId) {
        return ResponseEntity.ok().body(brandGrossProfitService.findByBrandId(brandId));
    }

    @PostMapping("/gross-profit")
    public ResponseEntity<BrandGrossProfitDTO> createBrandGrossProfit(@Valid @RequestBody BrandGrossProfitDTO brandGrossProfitDTO) {
        brandGrossProfitService.createBrandGrossProfit(brandGrossProfitDTO);
        return ResponseEntity.ok().body(brandGrossProfitDTO);
    }

}
