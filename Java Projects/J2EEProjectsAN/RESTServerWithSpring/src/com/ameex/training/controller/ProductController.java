package com.ameex.training.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ameex.training.business.Category;
import com.ameex.training.business.Product;
import com.ameex.training.business.User;
import com.ameex.training.service.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
	

	@Autowired
	ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	
	@RequestMapping(value="/listing", method=RequestMethod.GET)
	public @ResponseBody  List<Product> getAllProducts(){
		try {
			List<Product> products=productService.getAllProducts();
			return products;
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	// operations
	
	@RequestMapping(value="/add/{id}/{name}/{price}/{cat}",method=RequestMethod.POST)
	public @ResponseBody boolean addProduct(@PathVariable("id") int id, @PathVariable("name") String name, @PathVariable("price")double price, @PathVariable("cat") char cat){
		try {
			Product product=new Product(id, name, price, new Date(), cat);
			
			boolean status=productService.addProduct(product);
			return status;
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public @ResponseBody boolean deleteProduct(@PathVariable("id") int id){
		Product product=new Product();
		product.setId(id);
		try {
			boolean status=productService.deleteProduct(product);
			return status;
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	
	
}
