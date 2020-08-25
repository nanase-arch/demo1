package com.wr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wr.bean.Book;
import com.wr.bean.Categroy;
import com.wr.mapper.CategroyMapper;
import com.wr.service.CategroyService;

@Service
public class CategroyServiceImpl implements CategroyService {
	@Autowired
	private CategroyMapper cm;

	public void addCategory(Categroy categroy) {
		int addCategory = cm.addCategory(categroy);
		if (addCategory == 0) {
			System.out.println("添加失败");
			return;
		}
		System.out.println("添加成功");
	}

	public void updateCategory(Categroy categroy) {
		int updateCategory = cm.updateCategory(categroy);
		if (updateCategory == 0) {
			System.out.println("修改失败");
			return;
		}
		System.out.println("修改成功");
	}

	public void deleteCategory(int i) {
		int deleteCategory = cm.deleteCategory(i);
		if (deleteCategory == 0) {
			System.out.println("删除失败");
			return;
		}
		System.out.println("删除成功");
	}

	public Categroy findOneCategory(int i) {
		Categroy findOneCategory = cm.findOneCategory(i);
		return findOneCategory;
	}

	public List<Categroy> findAllCategory(Categroy c) {
		List<Categroy> findAllCategory = cm.findAllCategory(c);
		return findAllCategory;
	}

	public void getCategory() {

	}

	public List<Categroy> getCategory(String string) {
		List<Categroy> category = cm.getCategory(string);
return category;
	}

	public Book findC(int i) {
		 Book findC = cm.findC(i);
		return findC;
	}

}
