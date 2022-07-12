package com.training.mapper;

import com.training.dto.BrandGrossProfitDTO;
import com.training.entities.BrandGrossProfit;
import org.mapstruct.Mapper;
@Mapper(componentModel = "spring", uses = {})
public interface BrandGrossProfitMapper extends EntityMapper<BrandGrossProfitDTO, BrandGrossProfit>{
}
