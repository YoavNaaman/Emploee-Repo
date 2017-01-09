package com.hello.main.starter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmploeeController{

	@Autowired
	 private EmploeeService emploeeService;
	 
	@RequestMapping("/emploees")
	    public List<Emploee> getEmploees(){
	    		return emploeeService.getEmploees();
	    }
	
	@RequestMapping(method = RequestMethod.POST, value = "/emploees")	
    public boolean addEmploee(@RequestBody Emploee emp){
    		return emploeeService.addEmploee(emp);
    }
	
	@RequestMapping(method = RequestMethod.PUT, value = "/emploees/{id}")	
    public boolean updateEmploee(@RequestBody Emploee emp){
    		return emploeeService.updateEmploee(emp);
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "/emploees/{id}")	
    public Emploee getName(@PathVariable String id){
    		return emploeeService.getEmploee(id);
    }
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/emploees/{id}")	
    public boolean removeEmploee(@PathVariable String id){
    		return emploeeService.removeEmploee(id);
    }	
	
	
	 @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }
	 
}
