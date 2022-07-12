package com.training.controller;

import com.training.dto.BrandGrossProfitDTO;
import com.training.services.BrandGrossProfitService;
import com.training.servicesImpl.BrandGrossProfitServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BrandGrossProfitController {

    private final BrandGrossProfitServiceImpl brandGrossProfitService;

    public BrandGrossProfitController(BrandGrossProfitServiceImpl brandGrossProfitService) {
        this.brandGrossProfitService = brandGrossProfitService;
    }

    @PostMapping("/createBrandGrossProfit")
    public ResponseEntity<BrandGrossProfitDTO> createBrandGrossProfit(@Valid @RequestBody BrandGrossProfitDTO brandGrossProfitDTO) {
        BrandGrossProfitDTO grossProfitDTO = brandGrossProfitService.createBrandGrossProfit(brandGrossProfitDTO);
        return ResponseEntity.ok().body(grossProfitDTO);
    }

}
