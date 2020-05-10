package com.cognizant.abstructPattern;

public class OrderFactory {

	private OrderFactory(){}
	public static Order makeOrder(ProductType productType, Chennel chennel) {
		Order order = null;
		switch (chennel) {
		case E_commercewebsite:
			order = EcommerceFactory.makeOrder(productType);
			break;
			
		case Tele_caller_Agents_Application:
			order = TeleFactory.makeOrder(productType);
			break;
			
		default:
			break;
		}
		return order;
	}
}
