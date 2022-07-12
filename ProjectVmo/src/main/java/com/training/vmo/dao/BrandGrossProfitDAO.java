package com.training.vmo.dao;

import com.training.vmo.entity.BrandGrossProfit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandGrossProfitDAO extends MongoRepository<BrandGrossProfit,String> {
    BrandGrossProfit findBrandGrossProfitByBrandId(String brand_id);
}
