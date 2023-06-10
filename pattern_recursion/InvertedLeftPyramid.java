package pattern_recursion;

public class InvertedLeftPyramid {
	public static void printstar(int star)
	{
		if(star==0)
			return;
		System.out.print("*");
		printstar(star-1);
	}
	public static void printLine(int line) {
		if(line == 0)
			return;
		printstar(line);
		System.out.println();
		printLine(line-1);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	printLine(5);
		}

	}

