package com.grts;

import java.util.Comparator;

public class Student implements Comparator<Student>{
private String name;
private int attack;
private int defense;

@Override
public String toString() {
	return "名字：" + name + ", 攻击力：" + attack + ", 防御力：" + defense + ", 敏捷：" + agile + ", 生命值："
			+ health;
}
public Student(String name, int attack, int defense, int agile, int health) {
	super();
	this.name = name;
	this.attack = attack;
	this.defense = defense;
	this.agile = agile;
	this.health = health;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + agile;
	result = prime * result + attack;
	result = prime * result + defense;
	result = prime * result + health;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
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
	Student other = (Student) obj;
	if (agile != other.agile)
		return false;
	if (attack != other.attack)
		return false;
	if (defense != other.defense)
		return false;
	if (health != other.health)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
private int agile;
private int health;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAttack() {
	return attack;
}
public void setAttack(int attack) {
	this.attack = attack;
}
public int getDefense() {
	return defense;
}
public void setDefense(int defense) {
	this.defense = defense;
}
public int getAgile() {
	return agile;
}
public void setAgile(int agile) {
	this.agile = agile;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}

@Override
public int compare(Student o1, Student o2) {
	if (o1.getName().compareTo(o2.getName())>0) {
		return 1;
	}
	if (o1.getName().compareTo(o2.getName())>0) {
		return 1;
	}
	return 0;
}
}

