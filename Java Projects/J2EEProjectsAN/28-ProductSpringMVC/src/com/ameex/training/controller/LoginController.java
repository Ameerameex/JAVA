package com.ameex.training.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.ameex.training.business.User;
import com.ameex.training.db.SpringUserDAOImpl;
import com.ameex.training.db.UserDAO;

@Controller
@SessionAttributes(value = { "user" })
public class LoginController {

	@RequestMapping(value = "/")
	public String loginScreen(Model model) {
		User user = new User();

		model.addAttribute("userCmd", user);

		return "LoginPage";
	}

	@RequestMapping(value = "validateUser")
	public String validateUser(@ModelAttribute(value = "userCmd") User user, ModelMap modelMap,
			HttpServletRequest request) {
		System.out.println("\t\t [ " + user + " ]");

		WebApplicationContext applicationContext = null;
		ServletContext context = request.getServletContext();
		applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(context);

		UserDAO dao = (UserDAO) applicationContext.getBean("loginDao");

		if (user.equals(dao.FindUser(user.getUserName()))) {
			modelMap.put("user", user);

			return "redirect:ProductPortal/";
		} else {
			modelMap.put("message", "Invalid Login Credentials");

			return "StatusDisplayer";
		}

	}

}
