package com.myshop.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="ms_company")
public class CompanyInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long companyId;
	
	@Column (name="COMPANY_NAME")
	private String companyName;
	
	@Column (name="GST_NO")
	private String companyGSTIN;
	
	@Column (name="PAN_NO")
	private String companyPAN;
	
	@Column (name="TAG_LINE")
	private String companyTagLine;
	
	@ElementCollection
	@JoinTable(name="MS_COMPANY_ADDRESS",
				joinColumns = @JoinColumn(name="COMPANY_ID")
			)
	@GenericGenerator(name="hilo-gen", strategy="hilo")
	@CollectionId(columns={@Column(name="ADDRESS_ID")},generator="hilo-gen", type=@Type(type="long") )
	private Collection<Address> listOfAddress = new ArrayList<Address>();

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyGSTIN() {
		return companyGSTIN;
	}

	public void setCompanyGSTIN(String companyGSTIN) {
		this.companyGSTIN = companyGSTIN;
	}

	public String getCompanyPAN() {
		return companyPAN;
	}

	public void setCompanyPAN(String companyPAN) {
		this.companyPAN = companyPAN;
	}

	public String getCompanyTagLine() {
		return companyTagLine;
	}

	public void setCompanyTagLine(String companyTagLine) {
		this.companyTagLine = companyTagLine;
	}

	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	@Override
	public String toString() {
		return "CompanyInfo [companyId=" + companyId + ", companyName=" + companyName + ", companyGSTIN=" + companyGSTIN
				+ ", companyPAN=" + companyPAN + ", companyTagLine=" + companyTagLine + ", listOfAddress="
				+ listOfAddress + "]";
	}
}
