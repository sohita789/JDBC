package appliance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class ApplianceRunner {

	public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();

		try {
			et.begin();
			ApplianceEntity app = new ApplianceEntity();
			
			app.setId(1);
			app.setApplianceName("HairDryer");
			app.setBrand("Philips");
			app.setCost(1600);
			
			app.setId(2);
			app.setApplianceName("washingMachine");
			app.setBrand("Samsung");
			app.setCost(26000);
			
			app.setId(3);
			app.setApplianceName("Refrigerator");
			app.setBrand("LG");
			app.setCost(18000);
			
			app.setId(4);
			app.setApplianceName("MicrowaveOven");
			app.setBrand("IFB 23L");
			app.setCost(11790);
			
			app.setId(5);
			app.setApplianceName("AirConditioner");
			app.setBrand("Goorej");
			app.setCost(31240);
			
			app.setId(5);
			app.setApplianceName("Television");
			app.setBrand("Sony");
			app.setCost(26000);
			
		    entityManager.persist(app);
			entityManager.merge(app);
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





