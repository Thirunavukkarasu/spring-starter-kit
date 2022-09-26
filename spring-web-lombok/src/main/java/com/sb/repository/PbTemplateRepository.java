package com.sb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sb.model.PbTemplate;

@Repository
public interface PbTemplateRepository extends MongoRepository<PbTemplate, String> {

}
