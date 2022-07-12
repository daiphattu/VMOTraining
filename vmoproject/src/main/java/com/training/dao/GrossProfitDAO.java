package com.training.dao;

import com.training.entities.GrossProfit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrossProfitDAO extends MongoRepository<GrossProfit,Double> {
}
