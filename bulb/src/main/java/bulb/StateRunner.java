package bulb;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class StateRunner {

	public static void main(String[] args) {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		
		try {
			et.begin();
			
			StateEntity states = new StateEntity();
			
			states.setId(1);
			states.setName("Karnataka");
			states.setChiefMinister("Siddaramaiyya");
			states.setEducationMinister("Nagendra prasad Kalmadi");
			states.setPopulation(68260000);
			states.setNoofdistricts(31);
			states.setArea(191791);
			states.setCapitalcity("Bangalore");
			states.setFamoussweet("MysorePak");
			states.setForestarea(43356470);
			
			
			entityManager.persist(states);
			et.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			emf.close();
			
		}
			
		}
			
			
			

	}


