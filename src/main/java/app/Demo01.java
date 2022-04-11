package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.usuario;

public class Demo01 {

	public static void main(String[] args) {
		
		//agregar un nuevo usuario
		usuario u = new usuario();
		u.setCodigo(10);
		u.setNombre("Eren");
		u.setApellido("Yeager");
		u.setUsuario("eren@gmail.com");
		u.setClave("tatakae");
		u.setFchnacim("2000/01/01");
		u.setTipo(1);
		u.setEstado(1);
		
		//proceso de registro
		
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

		// 3. empezar mi transacción
		em.getTransaction().begin();	
		try {		
			// 4. registrar usuario (procesos)
			em.persist(u);
		
			// 5. confirmar la transacción
			em.getTransaction().commit();
		}catch (Exception e){
			System.out.println("Error al registrar..." + e.getMessage());
		}
		em.close();
		
		System.out.println("terminó...");

	}

}
