package app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.usuario;

public class Demo07 {
	public static void main(String[] args) {

		// listar usuarios segun el tipo

		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("mysql");
		EntityManager em = fabrica.createEntityManager();

		
		TypedQuery<usuario> consulta = em.createQuery("select u from usuario u where tipo = :xtipo", usuario.class);
		
		//establecer parametros
		consulta.setParameter("xtipo", 2);

		List<usuario> lstUsuarios = consulta.getResultList();

		for (usuario u : lstUsuarios) {
			System.out.println(u);
		}

		em.close();
	}
}
