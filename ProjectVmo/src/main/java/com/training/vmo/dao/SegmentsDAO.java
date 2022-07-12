package com.training.vmo.dao;


import com.training.vmo.entity.Segments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentsDAO extends MongoRepository<Segments,String> {
}
