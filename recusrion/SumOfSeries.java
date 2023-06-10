package recusrion;
//1/1^1 + 2/2^2 + 3/3^3 + ...
public class SumOfSeries {
	public static double power(int num,int pow) {
		if(pow ==0)
			return 1;
		return num * power(num,pow-1);
	}
	public static double sum(int n) {
		if(n==0)
			return 0;
		System.out.print("1/"+power(n,n-1)+" + ");
		return (1/power(n,n-1)) + sum(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double ans = sum(6);
System.out.print("\nSum of series = " + ans);
	}

}
