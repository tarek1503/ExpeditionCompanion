package tn.esprit.spring.Entities;

import static javax.persistence.GenerationType.AUTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity 
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
	Role role;
  
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