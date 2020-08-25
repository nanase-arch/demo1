package com.wr.service;

import java.util.List;

import com.wr.bean.Book;
import com.wr.bean.Categroy;

public interface CategroyService {

	void addCategory(Categroy categroy);

	void updateCategory(Categroy categroy);

	void deleteCategory(int i);

	Categroy findOneCategory(int i);

	List<Categroy> findAllCategory(Categroy c);

	void getCategory();

	List<Categroy> getCategory(String string);

	Book findC(int i);

}
