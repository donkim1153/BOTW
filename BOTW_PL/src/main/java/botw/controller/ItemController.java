package botw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import botw.domain.Item;

@Controller
public class ItemController {
	//for logging purposes
	Logger log = LoggerFactory.getLogger(GreetingController.class);
	//makes a get request when you use the url/item
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	
	public String itemForm(Model model) {
		Item item = new Item();
		model.addAttribute("item", item);
		log.info("in itemForm");
		return "item";
	}
	/*
	@RequestMapping(value = "/greeting", method = RequestMethod.POST)
	public String greetingSubmit(@Valid @ModelAttribute Greeting greeting, BindingResult result) {
		log.info("" + greeting.getId());
		log.info(greeting.getContent());
		if(result.hasErrors()) {
			return "greeting";
		}
		return "result";
	}
	*/
}
