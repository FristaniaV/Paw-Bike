package model;

public abstract class Artifact {

	private String name;
	private String type;
	private int baseAttack;
	
	public Artifact(String name, String type, int baseAttack) {
		super();
		this.name = name;
		this.type = type;
		this.baseAttack = baseAttack;
	}
	
	public abstract String getBonusStatus();
	
	public abstract double getMultiplier();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBaseAttack() {
		return baseAttack;
	}

	public void setBaseAttack(int baseAttack) {
		this.baseAttack = baseAttack;
	}
	
	


	
	
	
	

}
