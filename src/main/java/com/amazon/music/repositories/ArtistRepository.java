package com.amazon.music.repositories;


import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.music.entities.ArtistEntity;

@Repository
@Transactional
public class ArtistRepository extends AbstractRepository {

	public void save(ArtistEntity artistEntity) {
		entityManager.persist(artistEntity);
	}
	
	public ArtistEntity findById(Long id) {
		return entityManager.find(ArtistEntity.class, id);
	}
	
	public List<ArtistEntity> findByName(String name){
		Query query = entityManager
				.createQuery("select a from ArtistEntity a where a.name= :name");
		query.setParameter("name", name);
		return query.getResultList();
	}
	
}
