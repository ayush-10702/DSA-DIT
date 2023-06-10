package number_system;

public class DecimalToBinary {

	public static int number(int d) {
		if(d==0)
			return 0;
		return d%2 + 10*number(d/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res = number(5);
System.out.print(res);
	}

}
