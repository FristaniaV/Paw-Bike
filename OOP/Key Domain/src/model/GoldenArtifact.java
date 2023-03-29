package model;

public class GoldenArtifact extends Artifact {

	private double multiplier;
	
	public GoldenArtifact(String name, String type, int baseAttack, double multiplier) {
		super(name, type, baseAttack);
		this.multiplier = multiplier;
	}

	@Override
	public String getBonusStatus() {
		return null;
	}

	@Override
	public double getMultiplier() {
		return multiplier;
	}




}
