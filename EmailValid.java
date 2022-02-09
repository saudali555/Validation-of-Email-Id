package com.EmailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValid {
    static String [] email= {"Abc@reddit.com","Xya@gmail.com","Sam@outlook.net"};

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String userID;
		while (true){
	     System.out.println("Enter your Email ID ");
	     userID = sc.next();
	     while(VerfiyFormate(userID))
	     {
		     System.out.println("Formate error Ex:----> example@domain.com \n");
		     userID = sc.next();
	     }
	     VerfiyID(userID);
	     System.out.println("");
		}
	}
	
	private static void VerfiyID(String ID)
	{
		boolean flag= false;
	     for(String id : email)
	     {
	    	 if(ID.equalsIgnoreCase(id))
	    	 {
	    		 flag=true;
		    	 System.out.println("Valid Email ID ");
	    		 break;
	    	 }   	 	 
	     }
	     if(flag==false)
	     {
	    	 System.out.println("Invalid Email ID "); 
	     }
	}
	
	private static boolean VerfiyFormate(String ID)
	{
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(ID);

		if(!matcher.matches())
		{
			return true;
			
		}else 
		{
			return false;	
		}	
	}
}