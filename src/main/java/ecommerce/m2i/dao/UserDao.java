package ecommerce.m2i.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ecommerce.m2i.model.User;

public class UserDao {
	EntityManager em;

	public UserDao() {
		super();
		em = DbConnection.getInstance();

	}

	public List<User> getUsers() throws ClassNotFoundException {
		return em.createQuery("from User", User.class).getResultList();
	}
}