package com.training.servicesImpl;

import com.training.dao.BrandGrossProfitDAO;
import com.training.dto.BrandGrossProfitDTO;
import com.training.entities.BrandGrossProfit;
import com.training.mapper.BrandGrossProfitMapper;
import com.training.services.BrandGrossProfitService;
import org.springframework.beans.factory.annotation.Autowired;

public class BrandGrossProfitServiceImpl implements BrandGrossProfitService {

    @Autowired
    private BrandGrossProfitDAO brandGrossProfitDAO;

    @Autowired
    private BrandGrossProfitMapper brandGrossProfitMapper;

    @Override
    public BrandGrossProfitDTO createBrandGrossProfit(BrandGrossProfitDTO brandGrossProfitDTO) {
        BrandGrossProfit brandGrossProfit = brandGrossProfitMapper.toEntity(brandGrossProfitDTO);
        brandGrossProfitDAO.save(brandGrossProfit);
        return brandGrossProfitDTO;
    }
//
//    @Override
//    public BrandGrossProfitDTO findByBrandId(String BrandId) {
//        brandGrossProfitDAO.findById(BrandId);
//        return brandGrossProfitDAO;
//    }
}
