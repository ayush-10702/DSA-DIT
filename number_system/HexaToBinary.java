package number_system;

public class HexaToBinary {
	static String hex ="0123456789ABCDEF";
	  
	  static String strHex = "";
	public static int  number(String d) {
		int ans =0;
		if(d.length()>0)
			{
		int i = hex.indexOf(d.charAt(0));
		 ans = i*(int)Math.pow(16,d.length()-1)+ number(d.substring(1));
	}return ans;}
	public static int binary(int d) {
		if(d==0)
			return 0;
		return d%2 + 10*binary(d/2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method s
		int r = number("FF");
		int res = binary(r);
System.out.print(res);}
}
