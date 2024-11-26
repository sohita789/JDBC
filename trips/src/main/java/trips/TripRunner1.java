package trips;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TripRunner1 {
	public static void main(String[] args) {
		

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("xyz");
		EntityManager eManager = emFactory.createEntityManager();
		EntityTransaction et = eManager.getTransaction();

		try {
			et.begin();
			
			
			TripEntity entity = new TripEntity(10,"AgumbeGhat",2,3500,"bus");
			

			eManager.persist(entity);
			et.commit();

		} catch (Exception e) {
			
			 if (et.isActive()) {
	                et.rollback();
	            }
			e.printStackTrace();

		} finally {
			eManager.close();
}
}}