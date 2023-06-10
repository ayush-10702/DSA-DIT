package recusrion;

public class palindrome {

	public static int palindrome(int num , int ans) {
		if(num ==0 )
			return ans;
		return palindrome(num/10,ans*10+num%10);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12212;
		int res = palindrome(n,0);
if(n == res)
	System.out.print(n+ " is palindrome");
else
	System.out.print(n+ " is not palindrome");
	}

}
