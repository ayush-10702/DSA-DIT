package number_system;

public class DecimalTohexa {
	static char[] hexChar = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
	  
	  static String strHex = "";
	public static String number(int d) {
		if(d==0)
			return strHex;
		strHex = hexChar[d%16] + strHex;
		return number(d/16);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String res = number(15);
System.out.print(res);}
}
