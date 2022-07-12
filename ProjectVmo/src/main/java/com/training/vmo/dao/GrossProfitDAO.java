package com.training.vmo.dao;


import com.training.vmo.entity.GrossProfit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrossProfitDAO extends MongoRepository<GrossProfit,Double> {
}
