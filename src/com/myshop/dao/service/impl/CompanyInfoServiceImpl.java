package com.myshop.dao.service.impl;

import javax.transaction.SystemException;

import com.myshop.dao.CompanyInfoDao;
import com.myshop.dao.service.CompanyInfoService;
import com.myshop.model.CompanyInfo;

public class CompanyInfoServiceImpl implements CompanyInfoService{
	CompanyInfoDao companyinfoDao = new CompanyInfoDao();
	public void saveCompanyInfo(CompanyInfo companyInfo) {
			try {
				companyinfoDao.saveCompanyInfo(companyInfo);
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (SystemException e) {
				e.printStackTrace();
			}
	}
}
