package com.chainsys.unittest;
import com.chainsys.encapsulation.Customer;
public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
				Customer c1=new Customer();		
				//c1.setCustomerID(123);
				c1.setName("Tom"+(char)91);
				c1.setAddress("Some where in India");
				c1.setCity("Chennai");
				c1.setMobileNo(8888444411d);
				
				c1.echo();
				c1.placeOrder();
				c1.getFeedback();		
			}
		}

