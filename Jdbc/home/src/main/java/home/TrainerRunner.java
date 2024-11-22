package home;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;

public class TrainerRunner {

	public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			TrainerEntity train = new TrainerEntity();
			train.setId(7);
			train.setName("Sunil");
			train.setEmail("sunil@gmail.com");
			train.setAge(31);
			train.setBranch("BTECH");
			train.setCompany("infosys");
			train.setDesignation("Data Analyst");
			train.setSalary(850000);
			train.setExperience(6);
			train.setCity("Bellary");
			
			entityManager.persist(train);
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


