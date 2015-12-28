package app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.Region;


public interface RegionRepository extends MongoRepository<Region,String>{

}
