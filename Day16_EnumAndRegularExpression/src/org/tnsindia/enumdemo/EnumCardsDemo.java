package org.tnsindia.enumdemo;

//we can implement interface using enum
public enum EnumCardsDemo implements InterfaceCardsDemo{
	HEART,CLUS,DIAMOND,SPADES;
	
	@Override
	public void print() {
		System.out.println("Shapes in the cards are: "+this);
	}
	
	
}