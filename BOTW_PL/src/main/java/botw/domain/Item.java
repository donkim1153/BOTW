package botw.domain;

public class Item {
	private int id;
	private String itemName;
	private String itemDescription;
	private String effect;
	private String imageUrl;
	
	public Item() {
		
	}
	
	public Item(int id, String name, String description, String effect, String imageUrl) {
		this.id = id;
		itemName = name;
		itemDescription = description;
		this.effect = effect;
		this.imageUrl = imageUrl;
	}
	
	public int getId() {
		return id;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public String getItemDescription() {
		return itemDescription;
	}

	public String getEffect() {
		return effect;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
