/*
 * The class that checks whether an input string is properly nested.
 * It has a time complexity of O(N).
 */

import java.lang.IllegalArgumentException; //Illegal Character in String

class StringChecker
{
    public boolean propNested(String S) 
    {
        if (S.length()==0) //If Empty String
            return true; //Return True
		else if ((S.length()&1)==1) //If Odd Number of Characters
			return false; //Automatically Not Properly Nested
        
        int N = S.length(); //Length of String
        int clp = 0; //Count of Left Parenthesis to be Matched
        
        //General Case
        for (int i=0; i<N; i++) //Loop Through Each Character in String
        {
            char tmp = S.charAt(i); //Store Current Character
            
            if (tmp=='(') //If Left Parenthesis
                clp++; //Increment Count to be Matched
            else if (tmp==')') //If Right Parenthesis
                clp--; //Decrement Count
            else //Not Needed Per Given Assumptions, but I Put in Anyway for Program Evolution
                throw new IllegalArgumentException(); //Illegal Character in String
				//return false //Could Just do This
            
            if (clp<0) //If Count is Negative, Misplaced Right Parenthesis,
                return false; //Improper Nesting
        }
        
        if (clp!=0) //If Left Parenthesis Left to Match
            return false; //Improper Nesting
            
        return true; //If Here, Properly Nested
    }
}