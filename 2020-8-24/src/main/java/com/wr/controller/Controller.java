package com.wr.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wr.bean.Book;
import com.wr.bean.Categroy;
import com.wr.service.CategroyService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Controller {
	@Autowired
	private CategroyService cs;
	@Test
	public void name() {
		cs.addCategory(new Categroy("##","$$"));
	}
	@Test
	public void name1() {
		cs.deleteCategory(8);
	}
	@Test
	public void name2() {
		cs.updateCategory(new Categroy(9,"44","55"));
	}
	@Test
	public void name3() {
		Categroy findOneCategory = cs.findOneCategory(9);
		System.out.println(findOneCategory);
	}
	@Test
	public void name4() {
		List<Categroy> findAllCategory = cs.findAllCategory(new Categroy("言情类","e"));
		System.out.println(findAllCategory);
	}
	@Test
	public void name5() {
		cs.getCategory("玄");
	}
//	@Test
//	public void name6() {
//		Categroy findC = cs.findC(7);
//		System.out.println(findC);
//		System.out.println(findC.getBooks());
//	}
	@Test
	public void name6() {
		 Book findC = cs.findC(7);
		System.out.println(findC);
		System.out.println(findC.getCa());
	}
}
