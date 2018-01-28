package botw.bl.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import botw.domain.Item;

@RestController
@RequestMapping("/REST")
public class BOTWController {
	/*Logger will display the line number, class name, date and the message
	helps debug on the server */
	Logger log = LoggerFactory.getLogger(BOTWController.class);
	

	@RequestMapping("/getItem")
	@ResponseBody()
	public Item getItem(@RequestBody String requestId) {
		Item item = new Item(1, "Name_1", "Description_1", "Effect_1");
		return item;
	}
}
