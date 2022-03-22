package tn.esprit.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.Entities.Voyage;
import tn.esprit.spring.Service.IVoyageService;

@RestController
@RequestMapping("/voyage")
public class VoyageController {
@Autowired
IVoyageService voyageservice;

@PostMapping("/addvoyage")
public Voyage saveVoyage(@RequestBody Voyage voyage){
	return voyageservice.saveVoyage(voyage);
}
@PostMapping("/addVoyages")
public List<Voyage> addVoyages(@RequestBody List<Voyage> voyages){
	return voyageservice.saveVoyages(voyages);
}
@GetMapping("/voyages")
public List<Voyage> finAllVoyages(){
	return voyageservice.getVoyages();
}
@GetMapping("/voyageById/{id_voyage}")
public Voyage findVoyageById(@PathVariable int id_voyage){
	
	return voyageservice.getVoyageById(id_voyage);
}

@GetMapping("/voyageByDestination/{destination}")
public Voyage findVoyageByDestination(@PathVariable String destination){
	return voyageservice.getVoyageByName(destination);
	
}
@PutMapping("/updateVoyage")
public Voyage updateVoyage(@RequestBody Voyage voyage){
	return voyageservice.updateVoyage(voyage);
}

@DeleteMapping("/delete/{id}")
public String deleteVoyage(@PathVariable ("id") int id_voyage){
	return voyageservice.deleteVoyage(id_voyage);
}

}
