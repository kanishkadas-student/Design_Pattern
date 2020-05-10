package com.cognizant.abstructPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ToysOrder extends Order{

	
	private static final Logger LOGGER=LoggerFactory.getLogger(ToysOrder.class);
	public ToysOrder(Chennel channel) {
		super(ProductType.Toys, channel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		LOGGER.info("Toy Products Ordered");
	}

}
