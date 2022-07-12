package com.training.vmo.dao;

;
import com.training.vmo.entity.CompanyInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyInfoDAO extends MongoRepository<CompanyInfo,String> {
}
