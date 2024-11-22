package dessert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HotelRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		
		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction et = entityManager.getTransaction();
		
		try {
			et.begin();
			HotelEntity hotel = new HotelEntity();
			hotel.setId(7);
			hotel.setCustomerName("Kalpana");
			hotel.setHotelName("Hyderabad");
			hotel.setDish("Chicken");
			hotel.setQuantity(1);
			hotel.setPrice(420);
			hotel.setLocation("gandhi Nagar");
			hotel.setCity("Hyderabad");
			hotel.setHotelType("Non Vegetarian");
			hotel.setSpecialRecipe("chicken");
			
			
			
			
			
			entityManager.persist(hotel);
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
