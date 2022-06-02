package com.springcore.springapp.SpringCoreAssignment;

public class ShoppingCart {
	private Item item;

	@Override
	public String toString() {
		return "ShoppingCart [item=" + item + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
