package grocery;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GroceryRunner1 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em .getTransaction();
		
		Integer id = 2;
		GroceryEntity grocery = em.find(GroceryEntity.class, id);
		
		System.out.println("grocery:" +grocery.getAppName());
		System.out.println("grocery:" +grocery.getProductName());
		System.out.println("grocery:" +grocery.getProductType());
		System.out.println("grocery:" +grocery.getCost());
		System.out.println("grocery:" +grocery.getQuantity());
		System.out.println("grocery:" +grocery.getLocation());
		System.out.println("grocery:" +grocery.getQuantity());
		

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
