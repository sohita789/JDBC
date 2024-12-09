package com.xworkz.flightdatas.runner;


	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

    import com.xworkz.flightdatas.Entity.FlightEntity;

    import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
	import java.util.ArrayList;
	import java.util.List;

	public class FlightInsertData1 {

	    public static void main(String[] args) {

	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
	        EntityManager em = emf.createEntityManager();
	        EntityTransaction et = em.getTransaction();

	        try {

	            List<FlightEntity> list = new ArrayList<FlightEntity>();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	            list.add(new FlightEntity("Sohita", "sohita@gmail.com", 23, 80.36, 40f, LocalDateTime.parse("07-03-2024 17:30:50", formatter), 2600, 748307990, false));
	            list.add(new FlightEntity("Shreya", "shreya@gmail.com", 22, 120.5, 45.5f, LocalDateTime.parse("08-03-2024 10:15:20", formatter), 3000, 658307990, true));
	            list.add(new FlightEntity("Tejaswini", "teju@gmail.com", 25, 110.75, 50.8f, LocalDateTime.parse("09-03-2024 14:45:55", formatter), 2800, 948307990, false));
	            list.add(new FlightEntity("Swapna", "swapna@gmail.com", 20, 40.36, 41f, LocalDateTime.parse("07-03-2024 17:30:50", formatter), 2700, 748307990, false));
	            list.add(new FlightEntity("Shravya", "shravya@gmail.com", 32, 120.5, 65.5f, LocalDateTime.parse("05-03-2024 10:15:20", formatter), 3000, 758307990, true));
	            list.add(new FlightEntity("Tanushree", "tanu@gmail.com", 26, 110.65, 49.8f, LocalDateTime.parse("10-03-2024 14:45:55", formatter), 2800, 948307999, false));
	            list.add(new FlightEntity("Suresh", "suresh@gmail.com", 33, 50.36, 61f, LocalDateTime.parse("07-03-2024 17:30:50", formatter), 3700, 748307991, false));
	            list.add(new FlightEntity("Sachin", "sachin@gmail.com", 24, 120.5, 55.5f, LocalDateTime.parse("05-03-2024 10:15:20", formatter), 6000, 758307992, true));
	            list.add(new FlightEntity("Tanisha", "tanisha@gmail.com", 21, 110.65, 59.8f, LocalDateTime.parse("10-03-2024 14:45:55", formatter), 5800, 948307993, false));
	            list.add(new FlightEntity("Santosh", "santosh@gmail.com", 19, 120.5, 40.5f, LocalDateTime.parse("05-03-2024 10:15:20", formatter), 6000, 758307992, true));
	            list.add(new FlightEntity("keerti", "keerti@gmail.com", 18, 110.65, 38.6f, LocalDateTime.parse("10-03-2024 14:45:55", formatter), 5800, 948307993, false));

	            et.begin();
	            for (FlightEntity entity : list) {
	                em.persist(entity);
	            }
	            et.commit();

	        } catch (Exception e) {
	            if (et.isActive()) {
	                et.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            em.close();
	            emf.close();
	        }
	    }
	}


