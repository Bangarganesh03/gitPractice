package com.rest2.entity;

import javax.persistence.*;

@Entity
@Table(name = "Item") 
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name = "item_name")
	private String itemName;
	private String type;
	private double price;

	public Item() {

	}

	public Item(int id, String itemName, String type, double price) {

		Id = id;
		this.itemName = itemName;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [Id=" + Id + ", itemName=" + itemName + ", type=" + type + ", price=" + price + "]";
	}

}
