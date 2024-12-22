package spring_Boot_Login_Jsp.DevCode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import spring_Boot_Login_Jsp.DevCode.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
//value is used specify the url pattern

	@Autowired
	LoginService service;

	@GetMapping("/login")
	public String viewLoginPage(ModelMap map) {
		return "login";

	}

	@PostMapping("/login")
	public String showWelcomePage(ModelMap map, @RequestParam String name, @RequestParam String password) {
		boolean isValidUser = service.validateUser(name, password);
		if (!isValidUser) {
			map.put("errormessage", "Acces Denied , Invalid Credentials");
			return "login";
		}
		map.put("name", name);
		map.put("password", password);

		return "welcome";
	}

	@GetMapping("/logout")
	public String showLogoutpage(ModelMap map) {
		return "login";
	}
}
