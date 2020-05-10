package com.cognizant.abstructPattern;

public class TeleFactory {

	public static Order makeOrder(ProductType productType) {
		Order order = null;
		switch (productType) {
		case Electronic:
			order = new ElectronicOrder(Chennel.Tele_caller_Agents_Application);
			break;
			
		case Toys:
			order = new ToysOrder(Chennel.Tele_caller_Agents_Application);
			break;

		case Furniture:
			order = new FurnitureOrder(Chennel.Tele_caller_Agents_Application);
			break;
			
		default:
			break;
		}
		return order;
	}
}
