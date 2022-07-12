package com.training.dao;

import com.training.entities.BrandGrossProfit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandGrossProfitDAO extends MongoRepository<BrandGrossProfit,String> {
}
