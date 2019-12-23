package com.evolvusion.rest.restapi.bean;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "TA_ADRESS")
public class Adress implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TA_ADRESS_ID")
	private Long id;

	@Column(name = "ADRESS_LINE1")
	private String fstLine;

	@Column(name = "ADRESS_LINE2")
	private String sndLine;
	
	/*
	 * @OneToOne(cascade = CascadeType.ALL) private Employee employee;
	 */
	
	//private Long employeeId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getFstLine() {
		return fstLine;
	}

	public void setFstLine(String fstLine) {
		this.fstLine = fstLine;
	}
	
	
	public String getSndLine() {
		return sndLine;
	}

	public void setSndLine(String sndLine) {
		this.sndLine = sndLine;
	}
	
	/*
	 * public Employee getEmployee() { return employee; }
	 * 
	 * public void setEmployee(Employee employee) { this.employee = employee; }
	 */

}
