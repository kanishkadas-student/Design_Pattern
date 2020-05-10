package com.cognizant.abstructPattern;

public abstract class Order {

	private Chennel channel =null;
	private ProductType productType = null;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(ProductType productType, Chennel channel) {
		this.setChannel(channel);
		this.setProductType(productType);
	}
	public Chennel getChannel() {
		return channel;
	}
	public void setChannel(Chennel channel) {
		this.channel = channel;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	@Override
	public String toString() {
		return "Orderchannel :" + channel + "  order :" + productType;
	}
	
	public abstract void processOrder();
	
	
	
		
	
}
