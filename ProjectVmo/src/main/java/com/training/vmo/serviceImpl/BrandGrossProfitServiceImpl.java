package com.training.vmo.serviceImpl;


import com.training.vmo.dao.BrandGrossProfitDAO;
import com.training.vmo.dto.BrandGrossProfitDTO;
import com.training.vmo.entity.BrandGrossProfit;
import com.training.vmo.mapper.BrandGrossProfitMapper;
import com.training.vmo.mapper.BrandGrossProfitMapperImpl;
import com.training.vmo.service.BrandGrossProfitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandGrossProfitServiceImpl implements BrandGrossProfitService {

    @Autowired
    private BrandGrossProfitDAO brandGrossProfitDAO;

    @Autowired
    private BrandGrossProfitMapper brandGrossProfitMapper;
    private BrandGrossProfitMapperImpl brandGrossProfitMapperImpl;

    @Override
    public BrandGrossProfitDTO createBrandGrossProfit(BrandGrossProfitDTO brandGrossProfitDTO) {
        BrandGrossProfit brandGrossProfit = brandGrossProfitMapper.toEntity(brandGrossProfitDTO);

        brandGrossProfitDAO.save(brandGrossProfit);
        brandGrossProfitDTO.setId(brandGrossProfit.getId());
        return brandGrossProfitDTO;
    }

    @Override
    public BrandGrossProfitDTO findByBrandId(String BrandId) {
        return brandGrossProfitMapper.toDto(brandGrossProfitDAO.findBrandGrossProfitByBrandId(BrandId));
    }
}