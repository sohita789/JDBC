package grocery;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class GroceryRunner {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em .getTransaction();
		
		List<GroceryEntity> entity = new ArrayList<GroceryEntity>();
		entity.add(new GroceryEntity("zepto","ghee","diaryproduct",2,1,700,"Rajajinagar","cash",20));
		entity.add(new GroceryEntity("zomato","burger","snacks",1,10,90,"vijaynagar","online",10));
		entity.add(new GroceryEntity("flipkart","cashew","dryFruit",3,100,200,"biddapurColony","cash",30));
		entity.add(new GroceryEntity("BigBasket","potato","vegetable",20,200,70,"jaynagar","online",15));
		entity.add(new GroceryEntity("amazon","pineapple","fruit",2,100,90,"majestic","cash",5));
		entity.add(new GroceryEntity("zeto10","bingo","chips",2,1,30,"godutaiNagar","online",25));
		entity.add(new GroceryEntity("swiggy","pizza","food",1,2,259,"ashoknagar","cash",34));
		entity.add(new GroceryEntity("delivery","biryani","meal",2,1,250,"Rajajinagar","cash",30));
		entity.add(new GroceryEntity("JioMart","wheat","grain",200,11,900,"hebbal","online",50));
		entity.add(new GroceryEntity("Zomato","kitKatShake","cooldrinks",140,3,120,"SjrPg","paytm",10));
		
		for(GroceryEntity dto : entity) {
			
			GroceryEntity grocery = new GroceryEntity();
			
			grocery.setAppName(dto.getAppName());
			grocery.setProductName(dto.getProductName());
			grocery.setProductType(dto.getProductType());
			grocery.setNoOfItems(dto.getNoOfItems());
			grocery.setQuantity(dto.getQuantity());
			grocery.setCost(dto.getCost());
			grocery.setLocation(dto.getLocation());
			grocery.setPaymentType(dto.getPaymentType());
			grocery.setDiscount(dto.getDiscount());
			
			em.persist(grocery);
			
		}
			try {
				et.begin();
				
				
				
				et.commit();

			} catch (Exception e) {
				
				 if (et.isActive()) {
		                et.rollback();
		            }
				e.printStackTrace();

			} finally {
				em.close();
	}
	}
	}
