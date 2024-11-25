package gadgets;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GadgetsRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			GadgetsEntity gadget = new GadgetsEntity();
			
			gadget.setId(1);
			gadget.setName("HeadPhones");
			gadget.setBrand("Boat");
			gadget.setPrice(1499);
			gadget.setQuantity(1);
			gadget.setWarranty(2);
			
		    gadget.setId(2);
			gadget.setName("smartWatch");
			gadget.setBrand("Fastrack");
			gadget.setPrice(1199);
			gadget.setQuantity(2);
			gadget.setWarranty(3);
			
			gadget.setId(3);
		    gadget.setName("powerBanks");
		    gadget.setBrand("Mi");
			gadget.setPrice(999);
			gadget.setQuantity(1);
			gadget.setWarranty(2);
			
		    gadget.setId(2);
			gadget.setName("earphones");
		    gadget.setBrand("One plus");
			gadget.setPrice(1799);
			gadget.setQuantity(2);
			gadget.setWarranty(2);
					
					
		    gadget.setId(4);
			gadget.setName("LaptopSpeakers");
			gadget.setBrand("Zebronics");
	        gadget.setPrice(900);
			gadget.setQuantity(1);
			gadget.setWarranty(4);
			
		    gadget.setId(5);
			gadget.setName("phoneGuard");
			gadget.setBrand("samsungGalaxyS23");
			gadget.setPrice(399);
			gadget.setQuantity(1);
			gadget.setWarranty(4);
			
			 gadget.setId(6);
	        gadget.setName("Charger");
			gadget.setBrand("c_pin");
			gadget.setPrice(249);
			gadget.setQuantity(2);
			gadget.setWarranty(8);
			
			
					
		   entityManager.persist(gadget);
		   entityManager.merge(gadget);
			et.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
			emf.close();
			
		}		}
	}


