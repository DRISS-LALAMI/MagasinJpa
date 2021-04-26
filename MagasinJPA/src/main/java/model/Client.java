package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="clients")
public class Client {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY) 
private int Id;	
@Column(name="Email")
private String mail;
private String Nom;
private String Prenom;
private String Adresse;
private int CodePostal;
private String Ville;
private String Tel;
private String MotPasse;

public int getId() {
	return Id;
}

public void setId(int id) {
	Id = id;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getNom() {
	return Nom;
}

public void setNom(String nom) {
	Nom = nom;
}

public String getPrenom() {
	return Prenom;
}

public void setPrenom(String prenom) {
	Prenom = prenom;
}

public String getAdresse() {
	return Adresse;
}

public void setAdresse(String adresse) {
	Adresse = adresse;
}

public int getCodepostal() {
	return CodePostal;
}

public void setCodepostal(int codepostal) {
	CodePostal = codepostal;
}

public String getVille() {
	return Ville;
}

public void setVille(String ville) {
	this.Ville = ville;
}

public String getTel() {
	return Tel;
}

public void setTel(String tel) {
	this.Tel = tel;
}

public String getMotpasse() {
	return MotPasse;
}

public void setMotpasse(String motpasse) {
	MotPasse = motpasse;
}
public Client(String mail, String motpasse) {
	super();
	this.mail = mail;
	MotPasse = motpasse;
}

public Client( String mail, String nom, String prenom, String adresse, int codepostal, String ville, String tel,
		String motpasse) {
	super();
	
	this.mail = mail;
	Nom = nom;
	Prenom = prenom;
	Adresse = adresse;
	CodePostal = codepostal;
	this.Ville = ville;
	this.Tel = tel;
	MotPasse = motpasse;
}

public Client() {
	super();
	// TODO Auto-generated constructor stub
}

}
