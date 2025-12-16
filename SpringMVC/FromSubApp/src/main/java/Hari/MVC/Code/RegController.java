package Hari.MVC.Code;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class RegController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String Home() {
		return "Reg";
	}
	
	//@RequestMapping(value="/save", method=RequestMethod.POST)
	/*public String acceptData(Register reg, Map<String , Register> map) {
	
		map.put("r",reg);
		
	return "ViewData";
	*/
	/*
	 * @RequestMapping("/save") public String acceptData(Register reg, Model model)
	 * { model.addAttribute("r", reg); return "ViewData"; }
	 */
	
	@Autowired
	RegService regservice;
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveData(Register model,Map<String,String> map) {
		
		boolean b=regservice.isRegister(model);
		
		if(b) {
			map.put("msg","regitartion success");
			
		}
		else
		{
			map.put("msg","regitartion failed");
			
		}
		return "Reg";
		
		}
		
		
		
	
	
	
}
