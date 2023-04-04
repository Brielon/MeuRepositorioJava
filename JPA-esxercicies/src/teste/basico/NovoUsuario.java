package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios.jpa");
		EntityManager em =emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Teresa","teresinha@br.com");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}