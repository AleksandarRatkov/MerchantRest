package app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.VehicleInsPackage;

public interface VehicleInsPackRepository extends MongoRepository<VehicleInsPackage, String>{

}
