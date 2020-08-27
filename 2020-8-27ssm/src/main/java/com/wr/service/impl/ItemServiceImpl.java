package com.wr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wr.bean.Items;
import com.wr.mapper.ItemMapper;
import com.wr.service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper im;
	
	public List<Items> findAll() {
		List<Items> l=im.findAll();
		return l;
	}

	@Override
	public Items findItemById(int id) {
		Items i=im.findItemById(id);
		return i;
	}

	@Override
	public void update(Items items) {
		im.update(items);
		
	}
}
