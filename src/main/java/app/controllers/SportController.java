package app.controllers;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import app.model.Sport;
import app.repository.SportRepository;

@RestController
@RequestMapping("/sport")
public class SportController {

	@Autowired
	private SportRepository sportRepository;

	@RequestMapping(method = RequestMethod.POST)
	public Map<String, Object> createSport(@RequestBody Sport sport) {
		Map<String, Object> response = new LinkedHashMap<String, Object>();

		if (sport != null) {
			sportRepository.save(sport);
			response.put("message", "Sport created successfully");
			response.put("sport", sport);
		} else {
			response.put("message", "Sport is null");

		}
		return response;
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Sport> getSports() {
		return sportRepository.findAll();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{sportId}")
	public Sport getSportById(@PathVariable("sportId") String sportId) {
		return sportRepository.findOne(sportId);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{sportId}")
	public String removeSport(@PathVariable("sportId") String sportId) {
		sportRepository.delete(sportId);
		return "removed";
	}

}
