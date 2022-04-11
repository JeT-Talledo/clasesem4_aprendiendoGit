package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.usuario;

public class Demo03 {

	public static void main(String[] args) {
		
		//eliminar un usuario
		usuario u = new usuario();
		u.setCodigo(10);
		
		//proceso de eliminacion
		
		// 1. fabrica -> DAO
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		// 2. manejador de entidades
		EntityManager em = fabrica.createEntityManager();

		// 3. empezar el proceso
		em.getTransaction().begin();	
		
		//proceso		
		em.remove(u); //--> necesita un objeto que se debe devolver
		
		// 5. confirmar la transacción
		em.getTransaction().commit();
		
		em.close();

	}

}
