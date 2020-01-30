package com.repositoryrest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Xiaomi {

	@Id
	@GeneratedValue
	private int modelno;
	private String modelname;
	private String price;

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Xiaomi [modelNo=" + modelno + ", modelName=" + modelname + ", price=" + price + "]";
	}

}
