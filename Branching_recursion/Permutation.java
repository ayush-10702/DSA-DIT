package Branching_recursion;

public class Permutation {
	  static void printPermut(String str, String ans)
	    {
	 
	        // If string is empty
	        if (str.length() == 0) {
	            System.out.print(ans + " ");
	            return;
	        }
	 
	        for (int i = 0; i < str.length(); i++) {
	 
	            // ith character of str
	            char ch = str.charAt(i);
	 
	            // Rest of the string after excluding
	            // the ith character
	            String small = str.substring(0, i) +
	                        str.substring(i + 1);
	 
	            // Recursive call
	            printPermut(small, ans + ch);
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
printPermut("abcd","");
	}

}
