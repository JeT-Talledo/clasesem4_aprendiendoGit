package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.usuario;

public class Demo05 {
	public static void main(String[] args) {

		// version mejorada de eliminar

		// 1. fabrica -> DAO
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

		// 2. manejador de entidades
		EntityManager em = fabrica.createEntityManager();
		
		em.getTransaction().begin();
		
		usuario u = new usuario();
		u.setCodigo(10);

		usuario usu = em.find(usuario.class, u.getCodigo());

		if (usu == null) {
			System.out.println("usuario no existe");
		} else {
			em.remove(usu);
			em.getTransaction().commit();
			System.out.println("eliminado corractamente");
		}

		em.close();
	}
}
