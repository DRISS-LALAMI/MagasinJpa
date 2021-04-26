package model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Compte {
@Id
private int Id;
private String Nom;
private String Prenom;
private String mail;
private String Adresse;
private String password;

}
