package com.evolvusion.rest.restapi.bean;

import java.io.Serializable;
import java.util.Set;

import javax.management.relation.Role;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "TA_EMPLOYEE")
public class Employee implements Serializable {
	/*
	 * @Id
	 * 
	 * @GeneratedValue(generator = )
	 * 
	 * @Column(name = "TA_EMPLOYEE_ID")
	 */
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TA_EMPLOYEE_ID")
	private Long Id;

	@Column(name = "FIRST_NAME")
	private String fname;

	@Column(name = "LAST_NAME")
	private String lName;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	//@Cascade({CascadeType.ALL})
	@JoinColumn(name = "TA_ADRESS_ID")
	private Adress adress;
	 
	
	
	public Long getEmployId() {
		return Id;
	}
	
	
	public void setEmployId(Long employId) {
		this.Id = employId;
	}	 
	
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	
	
	
}
