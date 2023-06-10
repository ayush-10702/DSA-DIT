package pattern_recursion;
public class StarSquare {
	public static void printstar(int star) {
		if(star==0)
			return ;
		System.out.print("*");
		printstar(star-1);
	}
	public static void printline(int line,int star) {
		if(line==0)
			return ;
		printstar(star);
		System.out.println();
		printline(line-1,star);
	}
	public static void main(String[] args) {
printline(5,5);
	}

}

