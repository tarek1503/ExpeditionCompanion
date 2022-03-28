package tn.esprit.spring.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.Entities.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long>{

	@Query(value = "select * from Profile  where "
			+ " (profession like CONCAT('%',:value,'%')) ", nativeQuery = true)
	public CharSequence findByProfession(@Param("value") String value);
}
