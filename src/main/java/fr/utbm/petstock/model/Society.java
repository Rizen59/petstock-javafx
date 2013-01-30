package fr.utbm.petstock.model;

public class Society {
	private String name;
	private float rate;
	private float variation;
	private int volume;
	private float higher;
	
	
	public Society(String name, float rate, float variation, int volume, float higher) {
		this.name = name;
		this.rate = rate;
		this.variation = variation;
		this.volume = volume;
		this.higher = higher;
	}
	
	public String getName() {
		return name;
	}
	
	public float getRate() {
		return rate;
	}
	
	public float getVariation() {
		return variation;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public float getHigher() {
		return higher;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public void setVariation(float variation) {
		this.variation = variation;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void setHigher(float higher) {
		this.higher = higher;
	}
}
