/**
 * String With Difference Of Every Two Consecutive Characters
 * 
 */
import java.io.*;
import java.util.*;

public class differenceOfTwoConsecutiveCharacters {

	public static String solution(String str){
		String result ="";
		for(int i=0;i<str.length()-1;i++)
		{
		    result= result + str.charAt(i);
		    result +=   (str.charAt(i+1) - str.charAt(i));
		}
		
		result+= str.charAt(str.length()-1);
		

		return result;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}