package tn.esprit.spring.Service;

import java.io.IOException;
import java.util.List;

import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Entities.Voyage;

public interface IVoyageService {
	String ajoutVoyage(Voyage voyage);
	String suppVoyage(int id);
	String modifierVoyage(int id, Voyage voyage);
	List<Voyage> getAllVoyage();
	List<Voyage> findByDestination(String destination);
	String addEmployeeToVoyage(Long id,int idVoyage);
	List<Voyage> findVoyageFromdate(String month,int year);
	StringBuffer getpricefromdate(String month,int year,Long idEntreprise);
	StringBuffer getprice(Long idEntreprise);
/*	List<Voyage> getVoyageFromProfession(Long id);*/
	List<User> GetEmployeeOfVoyage(int idVoyage);
	String MatchingUsers(Long idUserOnline, Long idToMatch);
	void eventpdf(Long id);
	List<User> SuggestionUser(Long id) throws IOException;


	}
