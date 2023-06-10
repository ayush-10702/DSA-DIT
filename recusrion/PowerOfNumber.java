package recusrion;

public class PowerOfNumber {

	public static int power(int num,int pow) {
		if(pow ==0)
			return 1;
		return num * power(num,pow-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Power of number = "+ power(3,5));

	}

}
