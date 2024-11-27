package grocery;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ElectronicsRunner {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em .getTransaction();
		
		List<ElectronicsEntity> entity = new ArrayList<ElectronicsEntity>();
		entity.add(new ElectronicsEntity("sohita","refrigerator","gray",1,"good",25000,"Bangalore","phonepe",25));
		entity.add(new ElectronicsEntity("swapna","washingMachine","black",1,"LG",35000,"Mangalore","phonepe",35));
		entity.add(new ElectronicsEntity("Bhagya","IronBox","silver",2,"philips",2000,"Ckikkmangalore","googlepay",15));
		entity.add(new ElectronicsEntity("shanta","AC","white",2,"Samsung",45000,"Bangalore","cash",10));
		entity.add(new ElectronicsEntity("renuka","kettle","gray",1,"pigeon",1200,"hyderabad","phonepe",5));
		entity.add(new ElectronicsEntity("kalpana","Fan","brown",4,"crompton",2900,"Bangalore","phonepe",7));
		entity.add(new ElectronicsEntity("pushpa","mobile","blue",1,"galaxyA31",23000,"kalaburagi","cash",10));
		entity.add(new ElectronicsEntity("bhavya","hairstraightner","pink",1,"philips",3000,"Bangalore","phonepe",2));
		entity.add(new ElectronicsEntity("sneha","laptop","silver",1,"Dell",45000,"Mysore","phonepe",15));
		entity.add(new ElectronicsEntity("megha","tab","white",3,"samsung",25000,"Bangalore","cash",10));
		
		
		

		for(ElectronicsEntity dto : entity) {
			
			ElectronicsEntity electronics = new ElectronicsEntity();
			
			electronics.setName(dto.getName());
			electronics.setProductName(dto.getProductName());
			electronics.setColor(dto.getColor());
			electronics.setNoOfItems(dto.getNoOfItems());
			electronics.setQuality(dto.getQuality());
			electronics.setCost(dto.getCost());
			electronics.setLocation(dto.getLocation());
			electronics.setPaymentType(dto.getPaymentType());
			electronics.setDiscount(dto.getDiscount());
			
			em.persist(electronics);
			
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



