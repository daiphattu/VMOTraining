package com.training.vmo.service;


import com.training.vmo.dto.BrandGrossProfitDTO;
import org.springframework.stereotype.Service;


public interface BrandGrossProfitService {
    BrandGrossProfitDTO createBrandGrossProfit (BrandGrossProfitDTO brandGrossProfitDTO );
//
    BrandGrossProfitDTO findByBrandId (String BrandId);
}
