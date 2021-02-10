/**
 * 1. You are given a string that contains only lowercase and uppercase alphabets. 
 * 2. You have to toggle the case of every character of the given string.
 * 
 * 
 */

import java.io.*;
import java.util.*;

public class toggleCase {

	public static String toggleCase(String str)
	{
	    String result = "";
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)>='a')
	        {
	           int x = 'A'+str.charAt(i)-'a';
	           result = result + (char)x;
	        }
	        else
	        {
	            int x = 'a'+str.charAt(i)-'A';
	            result = result + (char)x;
	        }
	    }
		

		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}

