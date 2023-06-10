package recusrion;

public class PrimeNum {

	public static int prime(int num,int i) {
		if(num==i-1)
			return 0;
		if(num%i==0)
			return 1 + prime(num,i+1);
		return prime(num , i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 19;
		if(prime(n,1)==2)
System.out.print(n + " is prime");
else
	System.out.print(n+ " is not prime" );
	}

}
