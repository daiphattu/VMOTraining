package com.training.vmo.mapper;

import com.training.vmo.dto.BrandGrossProfitDTO;
import com.training.vmo.entity.BrandGrossProfit;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {})
public interface BrandGrossProfitMapper extends EntityMapper<BrandGrossProfitDTO, BrandGrossProfit>{
    @Override
    BrandGrossProfit toEntity(BrandGrossProfitDTO dto);

    @Override
    BrandGrossProfitDTO toDto(BrandGrossProfit entity);

}
