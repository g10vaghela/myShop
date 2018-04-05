package com.myshop.dao;

import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.myshop.model.CompanyInfo;

public class CompanyInfoDao extends BaseDao {
	
	public void saveCompanyInfo(CompanyInfo companyInfo) throws IllegalStateException, SystemException{
		Session session = getSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(companyInfo);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.out.println("Error :: "+e.getMessage());
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally{
			closeSession(session);
		}
	}

}
