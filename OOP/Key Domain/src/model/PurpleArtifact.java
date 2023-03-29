package model;

public class PurpleArtifact extends Artifact {

	private String bonusStatus;

	public PurpleArtifact(String name, String type, int baseAttack, String bonusStatus) {
		super(name, type, baseAttack);
		this.bonusStatus = bonusStatus;
	}

	@Override
	public String getBonusStatus() {
		return bonusStatus;
	}

	@Override
	public double getMultiplier() {
		return 0;
	}







}
