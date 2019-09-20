package com.amazon.music.repositories;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.music.entities.ArtistEntity;

@Repository
@Transactional
public class ArtistRepository extends AbstractRepository {

	
	public void save(ArtistEntity artistEntity) {
		entityManager.persist(artistEntity);
	}
	
}
