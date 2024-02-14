package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@RequestMapping("/home")
    public  String home(Model model){
		//use of model
        System.out.println("this is home url");
        model.addAttribute("name", "Ankita Rana");
        List<String> friends = new ArrayList<String>();
        friends.add("Ankita");
        friends.add("Ankit");
        model.addAttribute("f", friends);
        return "index";
    }
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		//Use of ModelAndView
		System.out.println("This is help controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Siddharth");
		LocalDateTime time= LocalDateTime.now();
		modelAndView.addObject("time", time);
		//marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(99);
		list.add(80);
		modelAndView.addObject("marks", list);
		//Setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
		
	}


}
