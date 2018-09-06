package com.ameex.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ameex.training.business.Category;
import com.ameex.training.business.Product;
import com.ameex.training.service.ProductService;

@Controller
@RequestMapping(value="/ProductPortal")
public class ProductController {

	@Autowired
	ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@RequestMapping(value={"/","/menu"})
	public String getMenu(){
		
		
		return "MenuPage";
	}
	
	@RequestMapping(value="/NewProductScreen")
	public String getNewProductInputScreen(Model model){
		
		Category category=new Category('A', "Air Conditioner");
		Category category2=new Category('L', "Laptop");
		Category category3=new Category('M', "Mobile");
		Category category4=new Category('T', "Television");
		List<Category> categories=new ArrayList<>();
		categories.add(category);
		categories.add(category2);
		categories.add(category3);
		categories.add(category4);
		
		model.addAttribute("productCmd",new Product());
		model.addAttribute("categories",categories);

		return "ProductNewInput";
	}
	@RequestMapping(value="/ProductListing")
	public String getAllProducts(ModelMap map){
		
		try {
			List<Product> products=productService.getAllProducts();
			map.put("productList", products);
		} catch (Throwable e) {

			e.printStackTrace();
		}
		return "ProductListDisplayer";
	}
	@RequestMapping(value="/DeleteInputScreen")
	public ModelAndView getDeleteScreen(){
		ModelAndView modelAndView=new ModelAndView();
		
		try {
			List<Product> products=productService.getAllProducts();
			modelAndView.addObject("productList", products);
		} catch (Throwable e) {

			e.printStackTrace();
		}
		modelAndView.setViewName("ProductDeleteInput");
		return modelAndView;
	}
	@RequestMapping(value="/EditInputScreen")
	public ModelAndView getEditScreen(){
		ModelAndView modelAndView=new ModelAndView();
		
		try {
			List<Product> products=productService.getAllProducts();
			modelAndView.addObject("productList", products);
		} catch (Throwable e) {

			e.printStackTrace();
		}
		modelAndView.setViewName("ProductEditInput");
		return modelAndView;
	}
	@RequestMapping(value="/SearchProductScreen")
	public ModelAndView getSearchScreen(){
		ModelAndView modelAndView=new ModelAndView();
		
		try {
			List<Product> products=productService.getAllProducts();
			modelAndView.addObject("productList", products);
		} catch (Throwable e) {

			e.printStackTrace();
		}
		modelAndView.setViewName("ProductSearchInput");
		return modelAndView;
	}
	@RequestMapping("/Logout")
	public String logout(Model model){
		model.addAttribute("userCmd", new User());
		
		return "LoginPage";
	}
	//operations
	
	@RequestMapping(value="/addNewProduct")
	public String addProduct(@ModelAttribute(value="productCmd") Product product,Model model){
		try {
			boolean status=productService.addProduct(product);
			if(status){
				model.addAttribute("statusString", "Product Added Successfully");
			}
			else{
				model.addAttribute("statusString", "Product Not Added ");

			}
		} catch (Throwable e) {
			model.addAttribute("statusString", "Product  Not Added Due to Exception");

			e.printStackTrace();
		}
		return "StatusDisplayer";
	}
	@RequestMapping(value="/deleteProduct")
	public String deleteProduct(@RequestParam(value="txt_id") int id,Model model){
		
		Product product=new Product();
		product.setId(id);
		try {
			boolean status=productService.deleteProduct(product);
			if(status){
				model.addAttribute("statusString", "Product Deleted Successfully");
			}
			else{
				model.addAttribute("statusString", "Product Not Delete ");

			}
		} catch (Throwable e) {
			model.addAttribute("statusString", "Product  Not Deleted Due to Exception");

			e.printStackTrace();
		}
		return "StatusDisplayer";
	}
	@RequestMapping("/searchProduct")
	public String findProduct(@RequestParam("txt_id") int id,Model model){
		
		
		Product product=null;
		
		try {
			product=productService.findProduct(id);
			model.addAttribute("statusString", "Product Found");
		} catch (Throwable e) {
			model.addAttribute("statusString", "There is some problem to finding a product");
			e.printStackTrace();
		}
		if(product==null){
			model.addAttribute("statusString", "No Products Found");	
		}
		else{
			model.addAttribute("product", product);	
			return "ProductDisplayer";

		}
		
		return "StatusDisplayer";
		
	}
	
	@RequestMapping("/editProduct")
	public String editProduct1(@RequestParam("txt_id") int id,Model model){
		
		Product product=null;
	
		try {
			product=productService.findProduct(id);
		} catch (Throwable e) {
			model.addAttribute("statusString", "There is some problem to finding a product to edit");
			e.printStackTrace();
		}
		if(product==null){
			model.addAttribute("statusString", "No Products Found");	
		}
		else{
			model.addAttribute("productList", product);	
			
			
			Category category1 = new Category('L', "LAPTOP");
			Category category2 = new Category('M', "MOBILE PHONE");
			Category category3 = new Category('T', "TELEVISION");
			Category category4 = new Category('A', "AIR CONDITIONER");

			List<Category> categories = new ArrayList<Category>();
			categories.add(category1);
			categories.add(category2);
			categories.add(category3);
			categories.add(category4);
			model.addAttribute("productEditCmd", new Product());

			model.addAttribute("categories", categories);	

			
			
			return "ProductEdit";

		}
		
		return "StatusDisplayer";
		
	
	}
	@RequestMapping("/updateProduct")
	public String editProduct2(@ModelAttribute("productEditCmd") Product product,Model model){
		
		
		boolean status;
		try {
			status = productService.updateProduct(product);
			if(status==true){
			model.addAttribute("statusString", "Product updated Successfully");	
				
			}
			else{
				
				model.addAttribute("statusString", "Product Not Updated");	

			}
		} catch (Throwable e) {
			model.addAttribute("statusString", "Product Not Updated due to some Exception");	
			e.printStackTrace();
		}
		
		return "StatusDisplayer";
		
	}
	 
}
