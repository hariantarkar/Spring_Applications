package hari.mvccode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homecontroller {

	@RequestMapping("/")
	public String homepage() {
		return "register";
	}
	
}
