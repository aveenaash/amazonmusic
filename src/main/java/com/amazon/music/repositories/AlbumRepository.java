package com.amazon.music.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.music.entities.AlbumEntity;

@Repository
@Transactional
public class AlbumRepository extends AbstractRepository {

	public void save(AlbumEntity albumEntity) {
		entityManager.persist(albumEntity);
	}
	
}
