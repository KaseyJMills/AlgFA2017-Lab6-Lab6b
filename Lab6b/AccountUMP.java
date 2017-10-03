/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/


import java.util.*;

// line 28 "Lab6.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private int accountNumber;
  private int paymentNumber;
  private int accountName;
  private int shipmentAddress;

  //Account Associations
  private List<Order> orders;
  private Customer customer;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(int aAccountNumber, int aPaymentNumber, int aAccountName, int aShipmentAddress, Customer aCustomer)
  {
    accountNumber = aAccountNumber;
    paymentNumber = aPaymentNumber;
    accountName = aAccountName;
    shipmentAddress = aShipmentAddress;
    orders = new ArrayList<Order>();
    if (aCustomer == null || aCustomer.getAccount() != null)
    {
      throw new RuntimeException("Unable to create Account due to aCustomer");
    }
    customer = aCustomer;
  }

  public Account(int aAccountNumber, int aPaymentNumber, int aAccountName, int aShipmentAddress, String aAccountNameForCustomer, String aAddressForCustomer, String aPaymentNumberForCustomer, String aPhoneForCustomer)
  {
    accountNumber = aAccountNumber;
    paymentNumber = aPaymentNumber;
    accountName = aAccountName;
    shipmentAddress = aShipmentAddress;
    orders = new ArrayList<Order>();
    customer = new Customer(aAccountNameForCustomer, aAddressForCustomer, aPaymentNumberForCustomer, aPhoneForCustomer, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccountNumber(int aAccountNumber)
  {
    boolean wasSet = false;
    accountNumber = aAccountNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setPaymentNumber(int aPaymentNumber)
  {
    boolean wasSet = false;
    paymentNumber = aPaymentNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setAccountName(int aAccountName)
  {
    boolean wasSet = false;
    accountName = aAccountName;
    wasSet = true;
    return wasSet;
  }

  public boolean setShipmentAddress(int aShipmentAddress)
  {
    boolean wasSet = false;
    shipmentAddress = aShipmentAddress;
    wasSet = true;
    return wasSet;
  }

  public int getAccountNumber()
  {
    return accountNumber;
  }

  public int getPaymentNumber()
  {
    return paymentNumber;
  }

  public int getAccountName()
  {
    return accountName;
  }

  public int getShipmentAddress()
  {
    return shipmentAddress;
  }

  public Order getOrder(int index)
  {
    Order aOrder = orders.get(index);
    return aOrder;
  }

  public List<Order> getOrders()
  {
    List<Order> newOrders = Collections.unmodifiableList(orders);
    return newOrders;
  }

  public int numberOfOrders()
  {
    int number = orders.size();
    return number;
  }

  public boolean hasOrders()
  {
    boolean has = orders.size() > 0;
    return has;
  }

  public int indexOfOrder(Order aOrder)
  {
    int index = orders.indexOf(aOrder);
    return index;
  }

  public Customer getCustomer()
  {
    return customer;
  }

  public static int minimumNumberOfOrders()
  {
    return 0;
  }

  public Order addOrder(int aCreationDate, int aShipmentDate, int aOrderNumber, int aTotaledOrder)
  {
    return new Order(aCreationDate, aShipmentDate, aOrderNumber, aTotaledOrder, this);
  }

  public boolean addOrder(Order aOrder)
  {
    boolean wasAdded = false;
    if (orders.contains(aOrder)) { return false; }
    Account existingAccount = aOrder.getAccount();
    boolean isNewAccount = existingAccount != null && !this.equals(existingAccount);
    if (isNewAccount)
    {
      aOrder.setAccount(this);
    }
    else
    {
      orders.add(aOrder);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeOrder(Order aOrder)
  {
    boolean wasRemoved = false;
    //Unable to remove aOrder, as it must always have a account
    if (!this.equals(aOrder.getAccount()))
    {
      orders.remove(aOrder);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addOrderAt(Order aOrder, int index)
  {  
    boolean wasAdded = false;
    if(addOrder(aOrder))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOrders()) { index = numberOfOrders() - 1; }
      orders.remove(aOrder);
      orders.add(index, aOrder);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveOrderAt(Order aOrder, int index)
  {
    boolean wasAdded = false;
    if(orders.contains(aOrder))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfOrders()) { index = numberOfOrders() - 1; }
      orders.remove(aOrder);
      orders.add(index, aOrder);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addOrderAt(aOrder, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    for(int i=orders.size(); i > 0; i--)
    {
      Order aOrder = orders.get(i - 1);
      aOrder.delete();
    }
    Customer existingCustomer = customer;
    customer = null;
    if (existingCustomer != null)
    {
      existingCustomer.delete();
    }
  }

  // line 35 "Lab6.ump"
   private int getAccountNumber(String xAccountNumber){
    accountNumber = xAccountNumber;
      return accountNumber;
  }

  // line 40 "Lab6.ump"
   private int getPaymentNumber(int xPaymentNumber){
    paymentNumber = xPaymentNumber;
     return paymentNumber;
  }

  // line 45 "Lab6.ump"
   private String getAccountName(String xAccountName){
    accountName = xAccountName;
			return accountName;
  }

  // line 50 "Lab6.ump"
   private String getShipmentAddress(String xShipmentAddress){
    shipmentAddress = xShipmentAddress;
			return shipmentAddress;
  }


  public String toString()
  {
    return super.toString() + "["+
            "accountNumber" + ":" + getAccountNumber()+ "," +
            "paymentNumber" + ":" + getPaymentNumber()+ "," +
            "accountName" + ":" + getAccountName()+ "," +
            "shipmentAddress" + ":" + getShipmentAddress()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "customer = "+(getCustomer()!=null?Integer.toHexString(System.identityHashCode(getCustomer())):"null");
  }
}