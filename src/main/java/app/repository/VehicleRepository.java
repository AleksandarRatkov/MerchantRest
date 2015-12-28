package app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.Vehicle;

public interface VehicleRepository  extends MongoRepository<Vehicle,String>  {

}
