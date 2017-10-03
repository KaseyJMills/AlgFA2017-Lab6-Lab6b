/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 1 "Lab6.ump"
public class Customer
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Customer Attributes
  private String accountName;
  private String address;
  private String paymentNumber;
  private String phone;

  //Customer Associations
  private Account account;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Customer(String aAccountName, String aAddress, String aPaymentNumber, String aPhone, Account aAccount)
  {
    accountName = aAccountName;
    address = aAddress;
    paymentNumber = aPaymentNumber;
    phone = aPhone;
    if (aAccount == null || aAccount.getCustomer() != null)
    {
      throw new RuntimeException("Unable to create Customer due to aAccount");
    }
    account = aAccount;
  }

  public Customer(String aAccountName, String aAddress, String aPaymentNumber, String aPhone, int aAccountNumberForAccount, int aPaymentNumberForAccount, int aAccountNameForAccount, int aShipmentAddressForAccount)
  {
    accountName = aAccountName;
    address = aAddress;
    paymentNumber = aPaymentNumber;
    phone = aPhone;
    account = new Account(aAccountNumberForAccount, aPaymentNumberForAccount, aAccountNameForAccount, aShipmentAddressForAccount, this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccountName(String aAccountName)
  {
    boolean wasSet = false;
    accountName = aAccountName;
    wasSet = true;
    return wasSet;
  }

  public boolean setAddress(String aAddress)
  {
    boolean wasSet = false;
    address = aAddress;
    wasSet = true;
    return wasSet;
  }

  public boolean setPaymentNumber(String aPaymentNumber)
  {
    boolean wasSet = false;
    paymentNumber = aPaymentNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setPhone(String aPhone)
  {
    boolean wasSet = false;
    phone = aPhone;
    wasSet = true;
    return wasSet;
  }

  public String getAccountName()
  {
    return accountName;
  }

  public String getAddress()
  {
    return address;
  }

  public String getPaymentNumber()
  {
    return paymentNumber;
  }

  public String getPhone()
  {
    return phone;
  }

  public Account getAccount()
  {
    return account;
  }

  public void delete()
  {
    Account existingAccount = account;
    account = null;
    if (existingAccount != null)
    {
      existingAccount.delete();
    }
  }

  // line 8 "Lab6.ump"
   private String getAccountName(String xAccountName){
    accountName = xAccountName;
			return accountName;
  }

  // line 12 "Lab6.ump"
   private String getAddress(String xAddress){
    address = xAddress;
			return address;
  }

  // line 16 "Lab6.ump"
   private int getPaymentNumber(int xPaymentNumber){
    paymentNumber = xPaymentNumber;
			return paymentNumber;
  }

  // line 20 "Lab6.ump"
   private String getPhone(String xPhone){
    phone = xPhone;
			return phone;
  }


  public String toString()
  {
    return super.toString() + "["+
            "accountName" + ":" + getAccountName()+ "," +
            "address" + ":" + getAddress()+ "," +
            "paymentNumber" + ":" + getPaymentNumber()+ "," +
            "phone" + ":" + getPhone()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "account = "+(getAccount()!=null?Integer.toHexString(System.identityHashCode(getAccount())):"null");
  }
}