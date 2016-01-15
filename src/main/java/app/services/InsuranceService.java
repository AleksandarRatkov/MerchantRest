package app.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.model.Insurance;
import app.repository.InsuranceRepository;

@Service ("insuranceService")
public class InsuranceService {
	
	@Autowired
	private InsuranceRepository insuranceRepository;

	public Map<String, Object> validateInsurance(Insurance insurance) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();
		if (insurance == null) {
			response.put("message", "Error.Insurance is null.");
		}else if( insurance.getTravel() == null){
			response.put("message", "Error.Travel Insurance is null.");
		}else {
			//dodati validacije 
			insuranceRepository.save(insurance);
			response.put("message", "Insurance created successfully");
			response.put("insurance", insurance);
		}
		return response;
	}
	
	public Insurance getInsurance(String insId) {
		return insuranceRepository.findOne(insId);
	}
	
	public List<Insurance> getAllInsurance() {
		return insuranceRepository.findAll();
	}
}
