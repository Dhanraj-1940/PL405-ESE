package com.pl405.invoice;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="invoice")
public class Invoice {
	
	@Id @GeneratedValue(generator = "newGenerator")
	@GenericGenerator(name = "newGenerator", strategy="foreign", parameters = {@Parameter(value="cust", name="property")})
	private Integer Id;
	private String customer_name;
	private Integer invoiceId;
	private Integer totalAmt;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Id")
	private Customer cust;

	public Integer getId() {
		return Id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public void setId(Integer Id) {
		this.Id = Id;
	}

	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Integer getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(Integer totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	
}
