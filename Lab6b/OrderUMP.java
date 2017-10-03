/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 57 "Lab6.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int creationDate;
  private int shipmentDate;
  private int orderNumber;
  private int totaledOrder;

  //Order Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aCreationDate, int aShipmentDate, int aOrderNumber, int aTotaledOrder, Account aAccount)
  {
    creationDate = aCreationDate;
    shipmentDate = aShipmentDate;
    orderNumber = aOrderNumber;
    totaledOrder = aTotaledOrder;
    boolean didAddAccount = setAccount(aAccount);
    if (!didAddAccount)
    {
      throw new RuntimeException("Unable to create order due to account");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCreationDate(int aCreationDate)
  {
    boolean wasSet = false;
    creationDate = aCreationDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setShipmentDate(int aShipmentDate)
  {
    boolean wasSet = false;
    shipmentDate = aShipmentDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrderNumber(int aOrderNumber)
  {
    boolean wasSet = false;
    orderNumber = aOrderNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setTotaledOrder(int aTotaledOrder)
  {
    boolean wasSet = false;
    totaledOrder = aTotaledOrder;
    wasSet = true;
    return wasSet;
  }

  public int getCreationDate()
  {
    return creationDate;
  }

  public int getShipmentDate()
  {
    return shipmentDate;
  }

  public int getOrderNumber()
  {
    return orderNumber;
  }

  public int getTotaledOrder()
  {
    return totaledOrder;
  }

  public Account getAccount()
  {
    return account;
  }

  public boolean setAccount(Account aAccount)
  {
    boolean wasSet = false;
    if (aAccount == null)
    {
      return wasSet;
    }

    Account existingAccount = account;
    account = aAccount;
    if (existingAccount != null && !existingAccount.equals(aAccount))
    {
      existingAccount.removeOrder(this);
    }
    account.addOrder(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Account placeholderAccount = account;
    this.account = null;
    placeholderAccount.removeOrder(this);
  }

  // line 65 "Lab6.ump"
   private String getCreationDate(String xCreationDate){
    creationDate = xCreationDate;
		 return creationDate;
  }

  // line 70 "Lab6.ump"
   private String getShipmentDate(String xShipmentDate){
    shipmentDate = xShipmentDate;
			return shipmentDate;
  }

  // line 75 "Lab6.ump"
   private int getOrderNumber(int xOrderNumber){
    orderNumber = xOrderNumber;
			return orderNumber;
  }

  // line 79 "Lab6.ump"
   private int getTotaledOrder(int xTotaledOrder){
    totaledOrder = xTotaledOrder;
			return totaledOrder;
  }


  public String toString()
  {
    return super.toString() + "["+
            "creationDate" + ":" + getCreationDate()+ "," +
            "shipmentDate" + ":" + getShipmentDate()+ "," +
            "orderNumber" + ":" + getOrderNumber()+ "," +
            "totaledOrder" + ":" + getTotaledOrder()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}