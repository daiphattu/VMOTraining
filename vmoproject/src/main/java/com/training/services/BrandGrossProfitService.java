package com.training.services;

import com.training.dto.BrandGrossProfitDTO;
import org.springframework.stereotype.Service;

@Service
public interface BrandGrossProfitService {
    BrandGrossProfitDTO createBrandGrossProfit (BrandGrossProfitDTO brandGrossProfitDTO);
//
//    BrandGrossProfitDTO findByBrandId (String BrandId);
}
