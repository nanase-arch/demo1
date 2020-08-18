package com.wr.service.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wr.Dao.IdolDao;
import com.wr.service.IdolService;
@Service
public class IdolServiceimpl implements IdolService {
	@Autowired
	private IdolDao ids;
	public void addIdol() {
		System.out.println("service");
		ids.addIdol();
	}

}
