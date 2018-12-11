package com.cg.capstore.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.dto.Inventory;
import com.cg.capstore.service.ICapStoreService;


@Controller
public class InventoryController {
	
	@Autowired
	ICapStoreService productservice;


	@RequestMapping(value = "AddProducts",method = RequestMethod.GET)
	public String addProductsMerchants(@ModelAttribute("my") Inventory in,BindingResult result, Map<String, Object> model) {
		
			List<String> myList = new ArrayList<>();			
			myList.add("Electronics");
			myList.add("Home");		
			myList.add("Clothing");
			model.put("cato", myList);
			 
			List<String> sublist = new ArrayList<>();
			sublist.add("Mobile");
			sublist.add("TV");			
			sublist.add("AC");
			sublist.add("Men");
			sublist.add("Women");
			sublist.add("Kids");
			sublist.add("Kitchen,Dining&Tools");
			sublist.add("Furniture");
			sublist.add("Decor");
			model.put("subcato", sublist);
			

			return "AddProducts";
		
	}
	
	@RequestMapping(value = "ProductView", method = RequestMethod.GET)
	public ModelAndView showProducts()
	{
		List<Inventory> prodList = productservice.getProductList();
		return new ModelAndView("ProductView", "data", prodList);
	}
	
	@RequestMapping(value = "UpdateProducts",method = RequestMethod.GET)
	public ModelAndView updateProducts(@ModelAttribute("yy") Inventory in)
	{
		List<Inventory> prodList = productservice.getProductList();
		return new ModelAndView("UpdateProducts", "data",prodList);
	}
	
	@RequestMapping("ProductUpdate")
	public ModelAndView productUpdate(@ModelAttribute("yy") Inventory in,@RequestParam("product_id") String id)
	{	
		
		Inventory invent=productservice.updateProducts(in);		
		return new ModelAndView("ProductUpdate", "data", invent);
		//return "ProductUpdate";
	}
	
	@RequestMapping(value = "DeleteProducts",method = RequestMethod.GET)
	public ModelAndView deleteProducts(@ModelAttribute("yy") Inventory in)
	{
		List<Inventory> prodList = productservice.getProductList();
		return new ModelAndView("DeleteProducts", "data",prodList);
	}
	@RequestMapping("DelProduct")
	public ModelAndView delProduct(@ModelAttribute("yy") String product_id,Model model)
	{	
		
		List<Inventory> invent= productservice.deleteProducts(product_id);		
		model.addAttribute("list",invent);
		//return "ProductUpdate";
		return new ModelAndView("DeleteProducts");
	}
	
	@RequestMapping(value="Success",method=RequestMethod.POST)
	public String Success(@ModelAttribute("yy") Inventory in,@RequestParam("product_id") String id)
	{	
		
		//Inventory invent=productservice.updateProducts(in);
		//System.out.println(invent);		
		return "Success";

	
	}
	
	@RequestMapping(value="Success1",method=RequestMethod.POST)
	public String Success1(@ModelAttribute("yy") Inventory in,@RequestParam("product_id") String id)
	{	
		productservice.addProducts(in);	
		
		return "Success";
	}
}
