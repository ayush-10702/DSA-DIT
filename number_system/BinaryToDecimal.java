package number_system;

public class BinaryToDecimal {
	public static int number(int d,int i) {
		if(d==0)
			return 0;
		int sd = d%10;
		return sd*(int)Math.pow(2,i) + number(d/10,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int res = number(1010,0);
System.out.print(res);}
}
