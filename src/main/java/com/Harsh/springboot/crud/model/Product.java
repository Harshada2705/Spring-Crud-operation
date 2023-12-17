package com.Harsh.springboot.crud.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Product_tbl")
public class Product {
   @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int productid;

	@Column(name = "product_name")
	private String productname;

	@Column(name = "product_quantity")
	private String productQuantity;

	
	@ManyToOne
	@JoinColumn(name = "Category_id")
	private Category category;


	public int getProductid() {
		return productid;
	}


	public void setProductid(int productid) {
		this.productid = productid;
	}


	public String getProductname() {
		return productname;
	}


	public void setProductname(String productname) {
		this.productname = productname;
	}


	public String getProductQuantity() {
		return productQuantity;
	}


	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Product(int productid, String productname, String productQuantity, Category category) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productQuantity = productQuantity;
		this.category = category;
	}
	
	
	
}
