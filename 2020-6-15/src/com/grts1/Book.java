package com.grts1;

public class Book {
private String name;
private String price;
private int amount;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + amount;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((price == null) ? 0 : price.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (amount != other.amount)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (price == null) {
		if (other.price != null)
			return false;
	} else if (!price.equals(other.price))
		return false;
	return true;
}
@Override
public String toString() {
	return "书名：" + name + ", 单价：" + price + ", 库存：" + amount;
}
public Book(String name, String price, int amount) {
	super();
	this.name = name;
	this.price = price;
	this.amount = amount;
}

}
