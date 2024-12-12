package com.xworkz.musicRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import com.xworkz.music.entity.MusicEntity;

@Repository
public class MusicRepoImpl implements MusicRepository {

	@Override
	public boolean save(MusicEntity musicEntity) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("xyz");
        EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(musicEntity);
			et.commit();
			
		} catch (Exception e) {
			if (et.isActive()) {
				et.rollback();
			}
		} finally {
			em.close();
			emf.close();
		}

		return true;
	}

}
	
	
	


