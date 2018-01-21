package botw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/don")
public class DonTestController {
	Logger log = LoggerFactory.getLogger(DonTestController.class);
	
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
		log.info("Inside helloWorld()");
		
		Long sysTime = System.currentTimeMillis();
		log.info("The current timestamp is [] right now", sysTime);
		
		model.addAttribute("sysTime", sysTime);
		model.addAttribute("content", "donHelloWorld");
		
		
		return "main";
	}
	
}
