package app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.AgeGroup;


public interface AgeGroupRepository extends MongoRepository<AgeGroup,String> {

}
