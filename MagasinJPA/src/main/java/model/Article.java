package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="articles")
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	int CodeArticle;
	String Designation;
	int Stock;
	double prix;
	String Categorie;
	String photo;
	public Article(int code, String designation, int stock, double prix, String categorie, String photo) {
		super();
		this.CodeArticle = code;
		this.Designation = designation;
		this.Stock = stock;
		this.prix = prix;
		this.Categorie = categorie;
		this.photo = photo;
	}
	public int getCode() {
		return CodeArticle;
	}
	public void setCode(int code) {
		this.CodeArticle = code;
	}
	public String getDesignation() {
		return Designation;
	}
	@Override
	public String toString() {
		return "Article [code=" + CodeArticle + ", designation=" + Designation + ", stock=" + Stock + ", prix=" + prix
				+ ", categorie=" + Categorie + "]";
	}
	public void setDesignation(String designation) {
		this.Designation = designation;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		this.Stock = stock;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		this.Categorie = categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
