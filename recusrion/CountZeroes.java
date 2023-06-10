package recusrion;

public class CountZeroes {

//	public static int countZeroes(int num,int count) {
//		if(num==0)
//			return count;
//		int singleDigit = num%10;
//		if(singleDigit==0)
//			return countZeroes(num/10,count+1);
//		return countZeroes(num/10,count);	
//		
//	}
	public static int countZeroes(int num) {	
		if(num==0)
			return 0;
		int singleDigit = num%10;
		if(singleDigit==0) {
			return 1+ countZeroes(num/10);
		}
		
		return countZeroes(num/10);	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c = countZeroes(1011037002);
System.out.println("no of zeroes = "+c);
	}
}
