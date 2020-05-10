package com.cognizant.abstructPattern;

public class EcommerceFactory {

	public static Order makeOrder(ProductType productType) {
		Order order = null;
		switch (productType) {
		case Electronic:
			order = new ElectronicOrder(Chennel.E_commercewebsite);
			break;
			
		case Toys:
			order = new ToysOrder(Chennel.E_commercewebsite);
			break;

		case Furniture:
			order = new FurnitureOrder(Chennel.E_commercewebsite);
			break;
			
		default:
			break;
		}
		return order;
	}
}
