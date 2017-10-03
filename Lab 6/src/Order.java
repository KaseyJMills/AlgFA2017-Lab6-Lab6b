/*
 *
 *
 *CS 2003 Lab 6
 *@author Kasey Mills
 *
 */



public class Order {

	 public String creationDate;
	 public String shipmentDate;
	 public int orderNumber;
	 public int totaledOrder;
	
	 
	 private String getCreationDate (String xCreationDate) {
		 creationDate = xCreationDate;
		 return creationDate;
	}
	
	 private String getShipmentDate (String xShipmentDate) {
			shipmentDate = xShipmentDate;
			return shipmentDate;
	}
	 
	 private int getOrderNumber (int xOrderNumber) {
			orderNumber = xOrderNumber;
			return orderNumber;
	}
	 private int getTotaledOrder (int xTotaledOrder ) {
			totaledOrder = xTotaledOrder;
			return totaledOrder;
	}
	 
	 
}
