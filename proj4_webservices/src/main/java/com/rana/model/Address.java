package com.rana.model;

public class Address {
	private String vill;
	private String town;
	private int pin;
	public Address() {
		super();
	}
	public String getVill() {
		return vill;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public int getPin() {
		return pin;
	}
	@Override
	public String toString() {
		return "Address [vill=" + vill + ", town=" + town + ", pin=" + pin + "]";
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
