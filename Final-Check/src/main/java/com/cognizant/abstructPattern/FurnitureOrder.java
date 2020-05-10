package com.cognizant.abstructPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class FurnitureOrder extends Order{

	private static final Logger LOGGER=LoggerFactory.getLogger(FurnitureOrder.class);
	public FurnitureOrder(Chennel channel) {
		super(ProductType.Furniture, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		LOGGER.info("Furniture Products Ordered");
	}

}
