package com.cg.test;

import javax.persistence.*;

import org.junit.Test;

import com.cg.entity.Product;

public class TestProduct2 {
	@Test
	public void testDetached() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager mgr = factory.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		txn.begin();
		Product p= (Product) mgr.find(Product.class, 4);
		txn.commit();
		mgr.close();
		
		mgr = factory.createEntityManager();
		txn = mgr.getTransaction();
		txn.begin();
		p.setStock(70);
		mgr.merge(p);
		txn.commit();
		mgr.close();
	}
	
	@Test
	public void testMerge() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		EntityManager mgr = factory.createEntityManager();
		EntityTransaction txn = mgr.getTransaction();
		txn.begin();
		Product p= new Product();
		p.setCode(123);
		p.setName("Realme");
		p.setPrice(5000);
		p.setStock(10);
		mgr.merge(p);
		txn.commit();
		mgr.close();
	}
}
