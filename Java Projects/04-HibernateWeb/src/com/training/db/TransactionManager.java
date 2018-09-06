package com.training.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class TransactionManager {
	
	public static Transaction createTransaction(Session session) {
		return session.beginTransaction();
	}

	public static void closeTransaction(Transaction transaction) {
		 transaction.commit();
	}

}
