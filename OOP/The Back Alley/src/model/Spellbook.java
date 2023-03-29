package model;

public class Spellbook extends MagicItem {

	private String sLevel;

	public Spellbook(String name, int damage, String element, char rank, String sLevel) {
		super(name, damage, element, rank);
		this.sLevel = sLevel;
	}

	@Override
	public int getDurability() {
		return 0;
	}

	@Override
	public String getSLevel() {
		return sLevel;
	}
	
	
}
