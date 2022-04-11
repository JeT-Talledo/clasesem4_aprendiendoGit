package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.usuario;

public class Demo04 {

	public static void main(String[] args) {
		// encontrar y devolver los datos de un usuario, segun su codigo

		// 1. fabrica -> DAO
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");

		// 2. manejador de entidades
		EntityManager em = fabrica.createEntityManager();

		// proceso de busqueda
		
		//select... where id..
		usuario u = em.find(usuario.class, 40); //find = devuelve un obj o entidad , si encuentra el id, sino devuelve null
		
		if (u == null) {
			System.out.println("usuario no existe");
		}else {
			System.out.println(u);
		}

		em.close();
	}
}
