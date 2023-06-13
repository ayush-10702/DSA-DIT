package Array_ques;

public class FindHighestElement {

	public static int highest(int a[],int i,int max) {
		if(i==a.length)
			return max;
		if(a[i]>max)
			return highest(a,i+1,a[i]);
		return highest(a,i+1,max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1,2,5,4,7,6,9,3};

System.out.print("Max element is : "+highest(a,0,0) );
	}

}
