package grocery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ElectronicsRunner1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em .getTransaction();
		
	
		Integer id = 5;
		ElectronicsEntity entity = em.find(ElectronicsEntity.class, id);
		
		System.out.println("entity:" +entity.getName());
		System.out.println("entity:" +entity.getProductName());
		System.out.println("entity:" +entity.getColor());
		System.out.println("entity:" +entity.getCost());
        System.out.println("entity:" +entity.getNoOfItems());
		System.out.println("entity:" +entity.getLocation());
		System.out.println("entity:" +entity.getDiscount());
		

	try {
			et.begin();
			
			
			
			et.commit();

		} catch (Exception e) {
			
			 if (et.isActive()) {
	                et.rollback();
	            }
			e.printStackTrace();


	}
	}

	}


