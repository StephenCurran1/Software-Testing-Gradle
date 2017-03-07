import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class Customer_Tester
{
   private Customer testRec = new Customer("stephencurrangmail.com", "0877718912");
   
   @Test
   public void TestemailAddress()
   {
     testRec.EmailAddress("stephencurran@Gmail.com");
     assertEquals("stephencurran@Gmail.com", testRec.getemailAddress());
   }
   @Test(expected = IllegalArgumentException.class)
   public void Test_email_address_contains_at_symbol()
   {
     testRec.EmailAddress("stephencurran@Gmail.com");
     assertEquals("stephencurranGmail.com", testRec.getemailAddress());
   }
   @Test
   public void Test_phone_num_for_plus()
   {
	   testRec.aaphoneNumber("+353 0487123");
	   assertEquals("+353 0487123", testRec.getPhoneNum());
	   
   }
   @Test
   public void Test_phone_num_for_08()
   {
	   testRec.aaphoneNumber("0877718912");
	   assertEquals("0877718912", testRec.getPhoneNum());
	   
   }
   
}