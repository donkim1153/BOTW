package botw.generator;

import java.util.ArrayList;
import java.util.List;

import botw.domain.Item;

public class ItemGenerator {
	public static List<Item> generateMaterial() {
		List<Item> itemList = new ArrayList<Item>();
		itemList.add(new Item(0, "Baked Apple", "Direct heat has softened and sweetened this apple. "
				+ "Eat it to restore three quarters of a heart.", "Heal 3/4 heart", "40px-BotW_Baked_Apple_Icon.png"));
		
		itemList.add(new Item(1, "Baked Fortified Pumpkin", "This fortified pumpkin has been roasted whole. "
				+ "The hard rind serves as a container for the steamed pumpkin flesh inside.", "Heal 3/4 heart",
				"40px-BotW_Baked_Fortified_Pumpkin_Icon.png"));
		
		itemList.add(new Item(2, "Baked Palm Fruit", "This palm fruit was broiled with direct heat, resulting in "
				+ "steamed flesh inside the rind. Best served at the moment the juices emerge while roasting..", 
				"Heal 1 1/2 heart", "40px-BotW_Baked_Palm_Fruit_Icon.png"));
		
		itemList.add(new Item(3, "Toasty Chillshroom", "A fully roasted chillshroom. It's evenly toasted and "
				+ "tastes a low better than when eaten raw. Eating it will restore a bit of health.", "Heal 3/4 heart"
				,"40px-BotW_Toasty_Chillshroom_Icon.png"));
		
		itemList.add(new Item(4, "Apple Pie", "The crispy, flaky pie crust and sweet apples are a match made in heaven.", 
				"--", "40px-BotW_Apple_Pie_Icon.png"));
		
		itemList.add(new Item(5, "Spiced Meat Skewer", "A special Goron spice covers up the scent of the meat, "
				+ "allowing its flavor to shine.", "--", "40px-BotW_Spiced_Meat_Skewer_Icon.png"));
		
		return itemList;
	}
}
