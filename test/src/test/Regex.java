package test;
import java.util.*;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Pattern.matches("[a-zA-z0-9]{2}[_][a-zA-Z0-9]{3}[_][a-zA-Z0-9]{1}[_][a-zA-Z0-9]{1}[@][a-zA-z0-9]{7}[.][a-zA-z0-9]{2}[.][a-zA-z0-9]{2}","ve_nug_o_p@gmailga.co.in"));
		System.out.println(Pattern.matches("[A-Za-z0-9]+[@][a-zA-Z]+[.][A-Za-z]{3}","mvgr982317@gmail.com"));
		System.out.println(Pattern.matches("[0-9]{10}","968607378"));
	}

}
