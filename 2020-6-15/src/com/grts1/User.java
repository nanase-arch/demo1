package com.grts1;

public class User {
private String name;
public User(String name, String passWord) {
	super();
	this.name = name;
	this.passWord = passWord;
}
private String passWord;
public String getName() {
	return name;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((passWord == null) ? 0 : passWord.hashCode());
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
	User other = (User) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (passWord == null) {
		if (other.passWord != null)
			return false;
	} else if (!passWord.equals(other.passWord))
		return false;
	return true;
}
public void setName(String name) {
	this.name = name;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
@Override
public String toString() {
	return "姓名：" + name + ", 密码：" + passWord + "]";
}
}
