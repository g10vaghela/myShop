package com.myshop.main;

import com.myshop.dao.service.CompanyInfoService;
import com.myshop.dao.service.impl.CompanyInfoServiceImpl;
import com.myshop.model.Address;
import com.myshop.model.CompanyInfo;

public class MyShop {
	
	public static void main(String[] args) {
		System.out.println("Hello my frame");
		CompanyInfoService companyInfoService = new CompanyInfoServiceImpl();
		
		CompanyInfo companyInfo = new CompanyInfo();
		companyInfo.setCompanyName("Mahir Industries");
		companyInfo.setCompanyTagLine("Pure flange");
		companyInfo.setCompanyGSTIN("24ABAFM3639AZ1Q");
		companyInfo.setCompanyPAN("abcde1234e");
		
		Address officeAddress = new Address();
		officeAddress.setStreet("Street1");
		officeAddress.setLandmark("landmark1");
		officeAddress.setCity("ahmedabad");
		officeAddress.setState("gujarat");
		officeAddress.setPincode("364275");
		officeAddress.setActiveStatus(false);
		
		
		Address officeAddress1 = new Address();
		officeAddress1.setStreet("abc");
		officeAddress1.setLandmark("pqr");
		officeAddress1.setCity("asldk");
		officeAddress1.setState("rajsthan");
		officeAddress1.setPincode("369258");
		officeAddress1.setActiveStatus(true);
		
		companyInfo.getListOfAddress().add(officeAddress);
		companyInfo.getListOfAddress().add(officeAddress1);
		companyInfoService.saveCompanyInfo(companyInfo);
	}
}

