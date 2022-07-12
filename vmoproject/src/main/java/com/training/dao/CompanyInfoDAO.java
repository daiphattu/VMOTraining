package com.training.dao;

import com.training.entities.CompanyInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoDAO extends MongoRepository<CompanyInfo,String> {
}
