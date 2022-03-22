package tn.esprit.spring.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import tn.esprit.spring.Entities.User;
import tn.esprit.spring.Entities.Voyage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static javax.persistence.FetchType.*;
import static javax.persistence.GenerationType.*;


@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = EAGER,cascade=CascadeType.ALL)
    private Collection<Role> roles = new ArrayList<>();
    @JsonIgnore
	@OneToMany(mappedBy="entreprise")
	List<Voyage> voyagesEntre;
    @JsonIgnore
	@ManyToMany(mappedBy = "employees", cascade = CascadeType.ALL)
	List<Voyage> voyagesEmpl;
    @JsonIgnore
    @ManyToMany
    private List<User> friends;
}