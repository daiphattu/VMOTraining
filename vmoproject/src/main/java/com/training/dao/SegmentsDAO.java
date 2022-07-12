package com.training.dao;

import com.training.entities.Segments;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentsDAO extends MongoRepository<Segments,String> {
}
