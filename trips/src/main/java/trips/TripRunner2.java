package trips;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TripRunner2 {

	public static void main(String[] args) {
		

				EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
				EntityManager entityManager = emf.createEntityManager();
				EntityTransaction eTransaction = entityManager.getTransaction();

				try {
					eTransaction.begin();
					Integer id = 4;
				    TripEntity entity = new TripEntity();
					TripEntity tripValue = entityManager.find(TripEntity.class, id);
					
					

					entityManager.remove(tripValue);
					eTransaction.commit();

				} catch (Exception e) {
					
					 if (eTransaction.isActive()) {
			                eTransaction.rollback();
			            }
					e.printStackTrace();

				} finally {
					entityManager.close();
	}

}
}