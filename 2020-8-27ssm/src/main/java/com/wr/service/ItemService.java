package com.wr.service;

import java.util.List;

import com.wr.bean.Items;

public interface ItemService {

	List<Items> findAll();

	Items findItemById(int id);

	void update(Items items);

}
