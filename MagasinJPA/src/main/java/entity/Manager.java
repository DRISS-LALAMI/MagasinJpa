package entity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Article;
import model.Client;

public class Manager {
	EntityManagerFactory entitymanagerfactory=null;
	EntityManager entitymanager=null;
public Manager() {
	entitymanagerfactory =Persistence.createEntityManagerFactory("GI4");
	entitymanager = entitymanagerfactory.createEntityManager();	
	
		// TODO Auto-generated constructor stub
	}

public EntityManager getManager() {
	entitymanagerfactory =Persistence.createEntityManagerFactory("GI4");
	entitymanager = entitymanagerfactory.createEntityManager();
	return entitymanager;
}
public void AjouterClient(Client client) {	
	entitymanager.getTransaction().begin();
	entitymanager.persist(client);
	entitymanager.getTransaction().commit();	
}
public List<Article> getArticle(int num){
	entitymanager.getTransaction().begin();
	Query q= entitymanager.createQuery("select a from Article a "
			+ " where a.CodeArticle=:code");
	q.setParameter("code", num);
	List<Article> articles = q.getResultList();
			for(Article article: articles ) {
				System.out.println(article);
			}	
			entitymanager.getTransaction().commit();
	return articles;
}
public List<Article> MontrerCatalogue(){
	entitymanager.getTransaction().begin();
	Query q= entitymanager.createQuery("select a from Article a ");
	List<Article> articles = q.getResultList();
			for(Article article: articles ) {
				System.out.println(article);
			}	
			entitymanager.getTransaction().commit();
	return articles;
}
public boolean Check(Client C) {
	entitymanager.getTransaction().begin();
	Query q=entitymanager.createQuery("select c from Client c where c.mail=:Email");
	q.setParameter("Email", C.getMail());
	List<Client> clients=q.getResultList();
	if(clients.size()!=0) {
		return true;
	}
	return false;
}

}
