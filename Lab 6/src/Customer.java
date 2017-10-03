/*
 *
 *
 *CS 2003 Lab 6
 *@author Kasey Mills
 *
 */

public class Customer {

	public String accountName;
	public String address;
	public int paymentNumber;
	public String phone;
	
	 private String getAccountName(String xAccountName ) {
			accountName = xAccountName;
			return accountName;
	}
	 private String getAddress (String xAddress ) {
			address = xAddress;
			return address;
	}
	 private int getPaymentNumber(int xPaymentNumber) {
			paymentNumber = xPaymentNumber;
			return paymentNumber;
	}
	 private String getPhone(String xPhone) {
			phone = xPhone;
			return phone;
	}
	 
	
}
