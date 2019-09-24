package com.amazon.music.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.amazon.music.entities.AlbumEntity;
import com.amazon.music.entities.SongEntity;

@Repository
@Transactional
public class SongRepository extends AbstractRepository {

	public void save(SongEntity songEntity) {
		entityManager.persist(songEntity);
	}
	
}
