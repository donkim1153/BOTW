package botw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tim")
public class TimTestController {
	/*Logger will display the line number, class name, date and the message
	helps debug on the server */
	Logger log = LoggerFactory.getLogger(TimTestController.class);
	
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
		log.info("inside your helloWorld()");
		Long sysTime = System.currentTimeMillis();
		log.info("the current time stamp is [] right now", sysTime);
		
		model.addAttribute("sysTime", sysTime);
		return "timHelloWorld";
	}
}
