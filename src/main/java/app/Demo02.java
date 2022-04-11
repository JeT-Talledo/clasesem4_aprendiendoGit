package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.usuario;

public class Demo02 {

	public static void main(String[] args) {
		
		//modificar un usuario
		usuario u = new usuario();
		u.setCodigo(10);
		u.setNombre("Keren");
		u.setApellido("Vaca");
		u.setUsuario("u0010@gmail.com");
		u.setClave("10002");
		u.setFchnacim("2002/03/01");
		u.setTipo(2);
		u.setEstado(1);
		
		//proceso de actualizacion
		
		// 1. fabrica el acceso a los datos
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		
		// 2. crea el manejador de entidades
		EntityManager em = fabrica.createEntityManager();

		// 3. empezar mi transacción
		em.getTransaction().begin();	
		try {		
			// 4. actualizar usuario (procesos)
			em.merge(u);
		
			// 5. confirmar la transacción
			em.getTransaction().commit();
		}catch (Exception e){
			System.out.println("Error al actualizar..." + e.getMessage());
		}
		em.close();
		
		System.out.println("terminó...");

	}

}
