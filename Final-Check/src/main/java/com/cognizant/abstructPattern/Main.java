package com.cognizant.abstructPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Main {
	private static final Logger LOGGER=LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		LOGGER.debug("Ordered: "+OrderFactory.makeOrder(ProductType.Electronic, Chennel.E_commercewebsite));
		LOGGER.debug("Ordered: "+OrderFactory.makeOrder(ProductType.Toys, Chennel.Tele_caller_Agents_Application));
		LOGGER.debug("Ordered: "+OrderFactory.makeOrder(ProductType.Furniture, Chennel.E_commercewebsite));
	}
}
