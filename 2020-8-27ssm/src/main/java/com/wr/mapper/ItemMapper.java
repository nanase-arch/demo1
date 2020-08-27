package com.wr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wr.bean.Items;

public interface ItemMapper {
	@Select("SELECT * FROM items")
	List<Items> findAll();
	@Select("SELECT * FROM items WHERE id=#{id}")
	Items findItemById(int id);
	@Update("update items SET name = #{name} , price = #{price} , detail = #{detail} , pic = #{pic} , createtime = #{createtime} WHERE id = #{id}")
	void update(Items items);

}
