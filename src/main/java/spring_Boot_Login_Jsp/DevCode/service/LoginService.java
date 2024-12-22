package spring_Boot_Login_Jsp.DevCode.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String name, String password) {
		// TODO Auto-generated method stub
		return name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password");
	}

}
