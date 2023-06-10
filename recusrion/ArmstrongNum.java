package recusrion;

public class ArmstrongNum {

	public static int armstrong(int num) {
		if(num == 0)
			return 0;
		return (int)Math.pow(num%10,3) + armstrong(num/10);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 123;
if(n == armstrong(n))
	System.out.print(n+" is an armstrong number");
else
	System.out.print(n+" is not an armstrong number");
	}

}
