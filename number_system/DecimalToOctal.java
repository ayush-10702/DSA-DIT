package number_system;

public class DecimalToOctal {
	public static int number(int d) {
		if(d==0)
			return 0;
		return d%8 + 10*number(d/8);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res = number(9);
System.out.print(res);
	}
}
