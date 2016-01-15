package app.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import app.model.Insurance;

@Repository("insuranceRepository")
public interface InsuranceRepository extends MongoRepository<Insurance,String> {

	
}
