package com.wr.bean;

public class Book {
private int id;
private String bname;
private String sellPoint;
private int price;
private String pic;
private String des;
private Categroy ca;
@Override
public String toString() {
	return "Book [id=" + id + ", bname=" + bname + ", sellPoint=" + sellPoint + ", price=" + price + ", pic=" + pic
			+ ", des=" + des  +"]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getSellPoint() {
	return sellPoint;
}
public void setSellPoint(String sellPoint) {
	this.sellPoint = sellPoint;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public String getDes(){
	return des;
}
public void setDes(String des) {
	this.des = des;
}
public Categroy getCa() {
	return ca;
}
public void setCa(Categroy ca) {
	this.ca = ca;
}

}
