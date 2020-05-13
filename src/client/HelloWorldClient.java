
package client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Message;

public class HelloWorldClient {
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("message");

		
		//First-level Caching
		//In thus case if we want to retrieve the already cahed Object then it will not Issues Select command to database
		//because Each EntityManager has its own cache,also known as First-Level Caching
		/*
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Message message1 = em.find(Message.class, 1L);
		Message message2 = em.find(Message.class, 1L);
		
		em.getTransaction().commit();
		em.close();
		*/


		// Is First-level Caching still going work?
		//In thus case if we want to retrieve the Object then each time it  Issues Select command to database
		//because Each EntityManager has its own cache,also known as First-Level Caching
		//and after closing the EntityManager its scope will also comes to end 
		
		EntityManager em1 = emf.createEntityManager();
		em1.getTransaction().begin();

		Message message1 = em1.find(Message.class, 1L);

		em1.getTransaction().commit();
		em1.close();

		EntityManager em2 = emf.createEntityManager();
		em2.getTransaction().begin();

		Message message2 = em2.find(Message.class, 1L);

		em2.getTransaction().commit();
		em2.close();

	}
}
















