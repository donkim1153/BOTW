package botw.enums;

public enum ActionCode {
	None("No actions are available"),
	Heal("Heal action is available");
	private String description;
	ActionCode(String description){
		this.setDescription(description);
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
