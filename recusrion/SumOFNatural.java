package recusrion;

public class SumOFNatural {

	public static int sum(int n) {
		if(n==1)
			return 1;
		return n + sum(n-1);
//	return n*(n+1)/2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Sum of N natural Numbers is : "+ sum(15));
	}

}
