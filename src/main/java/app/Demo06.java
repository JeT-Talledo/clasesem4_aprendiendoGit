package app;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.usuario;

public class Demo06 {
	public static void main(String[] args) {
		
		//listado de todos los usuarios
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();
		
		TypedQuery<usuario> consulta = em.createQuery("select u from usuario u", usuario.class);
		
		List<usuario> lstUsuarios = consulta.getResultList();
		
		for (usuario u : lstUsuarios) {
			System.out.println(u);
		}
		
		em.close();
	}
}
