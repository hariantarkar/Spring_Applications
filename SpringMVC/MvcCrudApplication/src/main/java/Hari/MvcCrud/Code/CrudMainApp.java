package Hari.MvcCrud.Code;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import CrudCode.Service.EmpService;
import CurdCode.Model.Employee;
import org.springframework.web.bind.annotation.GetMapping;



@Controller 
public class CrudMainApp {

	
	@Autowired
	EmpService empService;
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
		public String NavBarPage() {
			return "Navbar";
			
		}
		
	@RequestMapping(value="/addemp", method=RequestMethod.GET)
	public String AddEmployee() {
		return "addEmp";
		
	}
   @RequestMapping(value="/viewEmp",method=RequestMethod.GET)
   public String ViewEmployee(Map<String,List<Employee>>map ) {
	   
	    List<Employee>list=empService.getAllEmployee();
	   map.put("emplist",list);
	   
	   
	   
	   return "ViewEmp";
	   
   }
   
   @RequestMapping(value="saveEmp", method=RequestMethod.POST)
   public String SaveEmployee(Employee emp ,Map map) {
	   
	   boolean b=empService.issave(emp);
	   if(b) {
		   map.put("msg","employeee values  save");
	   }
	   else
	   {
		   map.put("msg" ,"employee data not save");
		   
	   }
	   return "addEmp";
   }
   
   
   @GetMapping("/delEmp")
   public RedirectView delEmpById(@RequestParam("Id")Integer Id) {
	   System.out.println("nnbhjbdh"+Id);
	   
	   empService.EmpDeleteById(Id);
	   RedirectView rv=new RedirectView("viewEmp");
	  
       return rv;
       
       
   }
   
   
  @GetMapping("UpdateEmp")
  public ModelAndView UpdateEmployee(@RequestParam("Id")Integer Id ,@RequestParam("name")String name,@RequestParam("email")String email ,@RequestParam("contact")Integer contact) {
	  
	  ModelAndView  mv=new ModelAndView();
	  mv.addObject("Id",Id);
	  mv.addObject("name",name);
	  mv.addObject("email",email);
	  mv.addObject("contact",contact);
	  mv.setViewName("UpdateEmp");
      return mv;
      
      
  }
   
  @RequestMapping(value="/search", method=RequestMethod.GET)
   @ResponseBody 
  public  List<Employee> SearchData(@RequestParam("d") String data) {
	 
	  
	  List<Employee> list=empService.Search(data);
	  
	  
	  
      return list;
  }
  
   
   
   
   
   
   
   
   
   
	
	

}
