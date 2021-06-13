package com.project.springboot.bank.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.springboot.bank.Alien;
import com.project.springboot.bank.Repositories.AlienRepo;

//@Controller
@RestController
public class ControllerMain {

	@RequestMapping("/home1")
	// @ResponseBody
	public String method1() {

		System.out.println("Controller method1");
		return "home1";
	}

	@RequestMapping("/home2")
	// @ResponseBody
	public String method2(@RequestParam("name2") String name2, HttpSession session) {
		session.setAttribute("name2", name2);
		System.out.println("Controller method2");
		return "home2";
	}

	@RequestMapping("/home3")
	// @ResponseBody
	public ModelAndView method3(@RequestParam("name3") String name3) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("name3", name3);
		mv.setViewName("home3");
		System.out.println("Controller method3");
		return mv;
	}

	
	  @RequestMapping("/") 
	  //@ResponseBody 
	  public ModelAndView methodHome(Alien alien1) {
	  
		  ModelAndView mv= new ModelAndView(); 
		  mv.addObject("alienTemp",alien1);
		  mv.setViewName("home"); 
		  System.out.println("Controller method main home");
		  return mv; 
	  }
	 

	/*
	 * @RequestMapping("/") //@ResponseBody public String methodHome() {
	 * System.out.println("Controller method main home2"); return "home"; }
	 */
	  @Autowired
	  AlienRepo repo;
	  
	  @RequestMapping("/addAlien")
	  public String addAlien(Alien alien) {
		  repo.save(alien);
		  return "addAlienStatus";
	  }
	  
	  @Autowired
	  AlienRepo repo2;
	  @RequestMapping("/getAliens")
	  public ModelAndView getAliens() {
		  ModelAndView mv= new ModelAndView();
		  List<Alien> alienList = repo2.getAliens();
		  mv.addObject(alienList);
		  mv.setViewName("getAliensStatus"); 
		  System.out.println(repo2.getAliens());
		  return mv;
	  }
	  
	  
	  
	  @Autowired
	  AlienRepo repo3;
	  @RequestMapping("/getTopTwoAliens")
	  public ModelAndView getTopTwoAliens2() {
		  ModelAndView mv2= new ModelAndView();
		  List<Alien> ttalienList = repo3.getTopTwoAliens();
		  mv2.addObject("ttalienList",ttalienList);  // Unless i add this two params, its not working, but working correctly for above single param. Not Sure why
		  mv2.setViewName("getTopTwoAliens"); 
		  System.out.println(repo3.getTopTwoAliens());
		  return mv2;
	  }
	  
	  @RequestMapping("/aliens")
	  @ResponseBody
	  public String Aliens() {
		  return repo3.getAliens().toString();
	  }
	  
	  @RequestMapping("/alien/{aid}")
	  @ResponseBody
	  public Alien AlienById(@PathVariable("aid") int aid) {
		  return repo3.getAlienByID(aid);
	  }
	  
	  @PostMapping("/addAlien")
	  public Alien addAlienPost(Alien alien) {
		  repo.save(alien);
		  return alien;
	  }
	  

}
