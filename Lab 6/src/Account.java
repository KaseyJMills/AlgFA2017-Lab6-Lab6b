/*
 *
 *
 *CS 2003 Lab 6
 *@author Kasey Mills
 *
 */


public class Account {

	private int accountNumber;
	private int paymentNumber;
	private String accountName;
	private String shipmentAddress;
	
	 private int getAccountNumber (int xAccountNumber) {
			accountNumber = xAccountNumber;
			return accountNumber;
	}
	 private int getPaymentNumber(int xPaymentNumber) {
			paymentNumber = xPaymentNumber;
			return paymentNumber;
	}
	 private String getAccountName(String xAccountName ) {
			accountName = xAccountName;
			return accountName;
	}
	 private String getShipmentAddress (String xShipmentAddress ) {
			shipmentAddress = xShipmentAddress;
			return shipmentAddress;
	}
	
	
}
