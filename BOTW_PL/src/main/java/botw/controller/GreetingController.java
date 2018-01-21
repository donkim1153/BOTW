package botw.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import botw.domain.Greeting;

@Controller
public class GreetingController {
	Logger log = LoggerFactory.getLogger(GreetingController.class);
	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String greetingForm(Model model) {
		Greeting greeting = new Greeting();
		greeting.setId(500);
		model.addAttribute("greeting", greeting);
		log.info("id in get request" + greeting.getId());
		return "greeting";
	}
	
	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public String greetingSubmit(@Valid @ModelAttribute Greeting greeting, BindingResult result) {
		log.info("" + greeting.getId());
		log.info(greeting.getContent());
		if(result.hasErrors()) {
			return "greeting";
		}
		return "result";
	}
}
