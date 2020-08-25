package com.wr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wr.bean.Book;
import com.wr.bean.Categroy;

public interface CategroyMapper {

	int addCategory(Categroy categroy);

	int updateCategory(Categroy categroy);

	int deleteCategory(int i);

	Categroy findOneCategory(@Param("id")int i);

	List<Categroy> findAllCategory(Categroy c);

	List<Categroy> getCategory(@Param("string")String string);

	Book findC(@Param("id")int i);

}
