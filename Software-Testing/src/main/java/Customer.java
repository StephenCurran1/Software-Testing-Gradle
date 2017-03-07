
/**
 * Name: Stephen Curran
 * Student Number: L00107244
 * Date 05/11/2015
 * Assignment Stage 2
 */

import java.io.Serializable;
import java.util.Scanner;
@SuppressWarnings("serial")
public class Customer extends Person implements Serializable
{
	// INHERITANCE - Customer IS-A Person
		 // Customer has name & phoneNumber from Person

private static final String emailRequirement = "@";
private static final String phoneRequirement1 = "+";
private static final String phoneRequirement2 ="08";
private String emailAddress = null;
private String phoneNumber = null;
private int CustomerID;
private static int ID;




// Default Constructor
// Called when object is created like this ==> 
 protected Customer()
 {
  		// NOTE:Don't need to call super()
  this.emailAddress=null;
  this.phoneNumber=null;
  this.CustomerID = ID++;
 }

// Initialization Constructor
// Called when object is created like this ==>
 protected  Customer(String pNo, String email)
 {
// Call super class constructor - Passing parameters required by Person ONLY!

// And then initialise Customers own instance variables
  this.emailAddress=email;
  this.phoneNumber=pNo;
  this.CustomerID = ID++;
 }
//reads in the details of the user
	//calls in scanner class for an int
	@SuppressWarnings({ "resource", "unused" })
	Scanner KBin = new Scanner(System.in);
	//creates string scanner class
	@SuppressWarnings("resource")
	Scanner KBString = new Scanner(System.in);
	//creates name scanner class
	@SuppressWarnings({ "resource", "unused" })
	Scanner KBName = new Scanner(System.in);
	//allows user to enter in name
	//aloows user to enter in e-mail
	
	 //exception handling for email if email does not contain @ error message will occur
	 public void EmailAddress(String emailAddress1)
	 {
        	  try
        	  {
        		  System.out.println("\n\nEnter Customer E-mail: ");
        			emailAddress1 =KBString.nextLine();
        			
        			throw new IllegalArgumentException("EMAIL IS INVALID.");
        	  }
          catch(IllegalArgumentException iEA)
          {
        	do{
        	  if(!emailAddress.contains(emailRequirement))
        	  {
        		  
				System.out.println("Incorrect please enter a personal email Address");
				System.out.println("Example stephen@gmail.com");
				
				System.out.print("\n\nRE-enter email:");
				emailAddress1 = KBString.nextLine();
        	  }
        	}while(!emailAddress.contains(emailRequirement));
          }
          catch(Exception e)
        	{
				System.out.println("An Error Occurred.");
			}
        emailAddress = emailAddress1;
	 }
	 public String getemailAddress()
	 {
		 return emailAddress;
	 }
	 public void aaphoneNumber(String phoneNum)
	 {
  
      	  try
      	  {
      		  
      		System.out.println("\n\nCustomer phone Number: "); 
      		phoneNumber = KBString.nextLine();
      	  throw new IllegalArgumentException("PHONE NUMBER IS INVALID.");
      	  }
        catch(IllegalArgumentException iEA)
        {
        	do{
        	  if(!phoneNumber.contains(phoneRequirement1) && !phoneNumber.contains(phoneRequirement2))
        	  {
				System.out.println("Incorrect please enter a phone number again");
				System.out.println("+353 74 55512349 or 0877718912");
				
				System.out.print("\n\nRE-enter phone number:");
				phoneNumber = KBString.nextLine();
        	  }
        	}while(!phoneNumber.contains(phoneRequirement1) && !phoneNumber.contains(phoneRequirement2));
      	  
        }
        catch(Exception e)
      	{
				System.out.println("An Error Occurred.");
			}
 
           phoneNumber = phoneNum;
	  }
	 public String getPhoneNum()
	 {
		 return phoneNumber;
	 }

//returns the id of the user
protected final int getID()
{
	return CustomerID;
}

}