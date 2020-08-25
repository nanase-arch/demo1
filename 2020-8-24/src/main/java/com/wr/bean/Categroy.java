package com.wr.bean;

import java.util.List;

public class Categroy {
	private int id;
	private String cname;
	private String cdes;
	private List<Book> Books;
	public List<Book> getBooks() {
		return Books;
	}
	public void setBooks(List<Book> books) {
		Books = books;
	}
	public Categroy( String cname, String cdes) {
		super();
		this.cname = cname;
		this.cdes = cdes;
	}
	public Categroy(int id, String cname, String cdes) {
		super();
		this.id = id;
		this.cname = cname;
		this.cdes = cdes;
	}
	
	public Categroy() {
		super();
	}
	@Override
	public String toString() {
		return "categroy [id=" + id + ", cname=" + cname + ", cdes=" + cdes + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCdes() {
		return cdes;
	}
	public void setCdes(String cdes) {
		this.cdes = cdes;
	}
}
