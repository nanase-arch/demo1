package com.wr.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.wr.bean.Items;
import com.wr.service.ItemService;

@Controller
@RequestMapping("/item")
public class ItemController {
	@Autowired
	private ItemService is;
	@RequestMapping("/itemList")
public ModelAndView findAll() {
	List<Items> l=is.findAll();
	ModelAndView andView = new ModelAndView();
	andView.setViewName("itemList");
	andView.addObject("itemList", l);
	return andView;
}
	@RequestMapping("//itemEdit")
	public String findItemById(int id,Model model) {
		Items i=is.findItemById(id);
		model.addAttribute("item", i);
		return "editItem";
	}
	@RequestMapping("/updateitem")
	public String update(Items items,MultipartFile pictureFile) {
		SimpleDateFormat sdf=new SimpleDateFormat("y-M-d");
		String folder = sdf.format(new Date());
		File file = new File("D://up/"+folder);
		if (!file.exists()) {
			file.mkdir();
		}
		String filename = pictureFile.getOriginalFilename();
		String newfn=UUID.randomUUID()+filename.substring(filename.lastIndexOf("."));
		try {
			pictureFile.transferTo(new File(file,newfn));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		items.setPic("http://localhost:48/"+folder+"/"+newfn);
		is.update(items);
		return "redirect:/item/itemList.action";
	}
}
