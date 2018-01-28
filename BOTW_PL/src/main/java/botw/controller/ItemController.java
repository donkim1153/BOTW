package botw.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import botw.domain.Item;
import botw.generator.ItemGenerator;

@Controller
public class ItemController {
	//for logging purposes
	Logger log = LoggerFactory.getLogger(ItemController.class);
	//makes a get request when you use the url/item
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public String itemForm(Model model) {
		Item searchItem = new Item();
		model.addAttribute("searchItem",searchItem);
		model.addAttribute("content","item");
		List<Item> item = ItemGenerator.generateMaterial();
		model.addAttribute("items", item);
		log.info("in itemForm");
		return "main";
	}
}
