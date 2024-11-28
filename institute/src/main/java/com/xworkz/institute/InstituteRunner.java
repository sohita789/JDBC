package com.xworkz.institute;


	
	import java.util.ArrayList;
	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class InstituteRunner {

		public static void main(String[] args) {
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
			EntityManager em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			
			List<InstituteEntity> entity = new ArrayList<InstituteEntity>();
			entity.add(new InstituteEntity("Xworkz","Chethan","raj@gmail.com",25, 997299717));
			entity.add(new InstituteEntity("Qspiders","mahantesh","qspider@gmail.com",30, 997299719));
			entity.add(new InstituteEntity("Jspiders","mamatha","jspider@gmail.com",27, 997299718));
			entity.add(new InstituteEntity("Besant","harisha","besant0@gmail.com",29, 997299715));
			entity.add(new InstituteEntity("Pyspiders","kousalya","py00@gmail.com",28, 997299716));
			entity.add(new InstituteEntity("XworkzBTM","amulya","btm@gmail.com",31, 997299714));
			
	      	for(InstituteEntity dto : entity) {
				
				InstituteEntity ins = new InstituteEntity();
				
				ins.setName(dto.getName());
				ins.setTrainerName(dto.getTrainerName());
				ins.setEmail(dto.getEmail());
				ins.setAge(dto.getAge());
				ins.setPhoneNumber(dto.getPhoneNumber());
	             em.persist(ins);
				
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
		}}}


