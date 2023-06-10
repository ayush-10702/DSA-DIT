package pattern_recursion;
//*
//**
//***
//****
//*****
public class LeftPyramid {
		public static void printstar(int star) {
			if(star==0)return;
			System.out.print("*");
			printstar(star-1);
		}
		public static void printline(int line,int star) {
			if(line==0)
				return;
			printstar(star);
			System.out.println();
			printline(line-1,star+1);
		
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	printline(5,1);
		}

	}

