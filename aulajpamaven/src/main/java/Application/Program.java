package Application;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
	
		
		Pessoa p1 =  new Pessoa(null, "Josiane Souza", "josiane@gmail.com");
		Pessoa p2=  new Pessoa(null, "Alcimar Souza", "alcimar@gmail.com");
		Pessoa p3 =  new Pessoa(null, "Mateus Souza", "mateus@gmail.com");
	 
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		
		em.getTransaction().commit();
		
		System.out.println("Pronto"); 
	
	}
	

}
