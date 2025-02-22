package tn.esprit.spring.Repository;


import org.springframework.stereotype.Repository;

import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Entities.Voyage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface IVoyageRepository extends JpaRepository<Voyage, Integer>{
	List<Voyage> findBySubject(String subject);
	@Query(value="SELECT * FROM voyage v WHERE v.entreprise_id=:id", nativeQuery = true)
    public List<Voyage> FindEntreprise(@Param("id")User id);
	
	//Voyage findAllById(int idVoyage);
	List<Voyage> findByDestination(String destination);
}
