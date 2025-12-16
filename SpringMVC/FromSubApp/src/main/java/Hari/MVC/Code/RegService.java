package Hari.MVC.Code;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Service("regService")


public class RegService {

	@Autowired
	
	RegRepo regrepo;
	
	public boolean isRegister(Register model) {
		
		return regrepo.isSave(model);
		
	}
	
	
	
}
