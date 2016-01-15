package app.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.Insurance;
import app.repository.InsuranceRepository;
import app.services.InsuranceService;

@RestController
@RequestMapping("/insurance")
@CrossOrigin(origins = "http://localhost:8081")
public class InsuranceController {

	@Autowired
	private InsuranceRepository insuranceRepository;

	@Autowired
	private InsuranceService insuranceService;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createinsurance(@RequestBody Insurance insurance) {
		return insuranceService.validateInsurance(insurance);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{userId}")
	public Insurance getInsuranceById(@PathVariable("userId") String insId) {
		return insuranceService.getInsurance(insId);
	}


	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Insurance> getAll() {
		return insuranceService.getAllInsurance();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{insuranceId}")
	public String removeInsurance(@PathVariable("insuranceId") String insId) {
		insuranceRepository.delete(insId);
		return "removed";
	}

}
