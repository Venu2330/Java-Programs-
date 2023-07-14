package test;
import java.util.*;
import java.util.regex.Pattern;

public class amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		    Scanner sc = new Scanner (System.in);
		    String user_name = "mvgr982317@gmail.in";
		    String password = "venu1234";
		    short otp = 1234;
		    boolean a = true;
		    boolean valid=false;
		    while (a)
		      {
			System.out.println ("Enter the email id");
			String email = sc.nextLine ();
			 valid=Pattern.matches("[A-Za-z0-9]+[@][a-zA-Z]+[.][A-Za-z]{0,3}",email);
			if (valid && user_name.equals(email))
			  {
			    System.out.println ("Enter the password");
			    String pass = sc.nextLine ();
			    if (password.equals (pass))
			      {
				System.out.println ("Enter The otp");
				short otp1 = sc.nextShort ();
				if (otp == otp1)
				  {
				    
				    a = false;
				  }
			      }
			    else
			      {
				System.out.println ("Please Enter Valid password");
			      }
			  }
			else
			  {
			    System.out.println ("Please Enter Valid Email id");
			  }
		      }

	}

}
