import java.io.*;
import java.util.*;

public  class pallindromicSubstrings{

	public static boolean isPalindrome(String str)
    {
        
        int start =0;
		int end = str.length()-1;
		boolean result = false;
		        
		        while(start<=end)
		        {
		            if(str.charAt(start) == str.charAt(end))
		            {
		                start++;
		                end--;
		                
		                if(start>=end)
		                {
		                    result = true;
							break;
		                }
		            }
		            else
					{ 
						result= false;
						break;
					}
		        }
		return result;
		            
	}
		        



public static void solution(String str)
	{
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		        String sub = "";
		        sub = str.substring(i,j);
		        
		        boolean ans = isPalindrome(sub);
		        if(ans)
		        {
		            System.out.println(sub);
		        }
		    }
		}
		
		
	}

public static void main(String[] args)
{
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
    
}
}

