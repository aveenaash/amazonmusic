package com.amazon.music.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractRepository {

	protected EntityManager entityManager;

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
		
}
