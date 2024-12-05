package com.xworkz.ApplicationEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mysql.cj.Query;

public class ApplicationRunner1 {
	public static void main(String[] args) {
		
		EntityManagerFactory emFactory=Persistence.createEntityManagerFactory("app");
		EntityManager eManager=emFactory.createEntityManager();
		EntityTransaction eTrans=eManager.getTransaction();
		
		Query query=(Query) eManager.createNamedQuery("findByProductId");
		Object obj=((javax.persistence.Query) query).getSingleResult();
		
		ApplicationEntity entity=(ApplicationEntity) obj;
		System.out.println("Value : "+entity.toString());
		System.out.println("--------------");
		
		Query query2=(Query) eManager.createNamedQuery("findByProductName");
		Object obj2=((javax.persistence.Query) query2).getSingleResult();
		
		ApplicationEntity entity2=(ApplicationEntity) obj2;
		System.out.println("Value :"+entity2.toString());
		System.out.println("---------------");
		
		Query query3=(Query) eManager.createNamedQuery("findById");
		Object obj3=((javax.persistence.Query) query3).getSingleResult();
		
		ApplicationEntity entity3=(ApplicationEntity) obj3;
		System.out.println("Value :"+entity3.toString());
		System.out.println("----------------");
		
		Query query4=(Query) eManager.createNamedQuery("findByProductId&ProductName");
		Object obj4= ((javax.persistence.Query) query4).getResultList();
		
		List<ApplicationEntity> res = ((javax.persistence.Query) query4).getResultList();
		
		for(ApplicationEntity ecom : res) {
			System.out.println("Values :"+ecom.getProductId() + " , " + ecom.getProductName());
		}
		System.out.println("-----------------");
		
		Query query5=(Query) eManager.createNamedQuery("findByProductName&Category");
		Object obj5=((javax.persistence.Query) query5).getResultList();
		
		List<ApplicationEntity> res2=((javax.persistence.Query) query5).getResultList();
		
		for(ApplicationEntity ecomm : res2) {
			System.out.println("Values :"+ ecomm.getProductName() + " , "+ ecomm.getCategory());
		}
		
		try {
			eTrans.begin();
			eTrans.commit();
			
		} catch (Exception e) {
			if(eTrans.isActive()) {
				eTrans.rollback();
			}
		}
		finally {
			eManager.close();
			emFactory.close();
		}
	}

}
