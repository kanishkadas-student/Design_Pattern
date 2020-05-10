package com.cognizant.abstructPattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ElectronicOrder extends Order{
	
	private static final Logger LOGGER=LoggerFactory.getLogger(ElectronicOrder.class);
	public ElectronicOrder(Chennel chennel) {
		super(ProductType.Electronic, chennel);
		processOrder();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void processOrder() {
		// TODO Auto-generated method stub
		LOGGER.info("Order Electronic Products");
	}

}
