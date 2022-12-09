package com.deva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.deva.model.Mob;
import com.deva.repo.MobRepo;

@Controller
public class MobController {
	
	@Autowired
	private MobRepo mobRepo;
	
	@RequestMapping("/")
	public String home()
	{
		return "reg";
	}
	 @RequestMapping("/register")
	 public String register(
			 		   @RequestParam Integer modelNo,
			 		   @RequestParam String modelName,
			 		   @RequestParam String company,
	 				   @RequestParam Double ram,
	 				   @RequestParam Double rom,
	 				   @RequestParam String processor,
	 				   @RequestParam String os,
	 				   @RequestParam Long imeiNo,
	 				   @RequestParam Double price,
	 				   @RequestParam String manufactureDate,
			 		   Mob mob, Model model)
	 {
		/* model.addAttribute(id);
		 model.addAttribute(modelName);
		 model.addAttribute(company);
		 model.addAttribute(ram);
		 model.addAttribute(rom);
		 model.addAttribute(processor);
		 model.addAttribute(os);
		 model.addAttribute(imeiNo);
		 model.addAttribute(price);
		 model.addAttribute(manufactureDate);*/
		Mob m1=mobRepo.save(mob); 
		 return "msg"; 
	 }
	 
	 /* It provides list of employees in model object */    
	    @RequestMapping("/viewmob")    
	    public String viewmob(Model model){    
	        model.addAttribute("mobs",mobRepo.findAll());
	        return "viewmob";   
	    }    
	    
	    @RequestMapping(value="/deletemob/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable Integer id){    
	    	mobRepo.deleteById(id);    
	        return "redirect:/viewmob";    
	    }     
	    
	    @RequestMapping(value="/editmob/{id}")    
	    public String edit(@PathVariable Integer id, Model m){    
	        Mob mob=mobRepo.findById(id).get();    
	        m.addAttribute("command",mob);  
	        return "editmob";    
	    }    
	    /* It updates model object */    
	    @RequestMapping(value="/editu",method = RequestMethod.POST)    
	    public String editsave(@RequestParam Integer id,
		 		   			   @RequestParam String modelName,
		 		   			   @RequestParam String company,
		 		   			   @RequestParam Double ram,
		 		   			   @RequestParam Double rom,
		 		   			   @RequestParam String processor,
		 		   			   @RequestParam String os,
			 				   @RequestParam Long imeiNo,
			 				   @RequestParam Double price,
			 				   @RequestParam String manufactureDate,
	    					   Mob mob, Model model){    
	    	mobRepo.save(mob);    
	        return "redirect:/viewmob";    
	    }    

}
