package recusrion;

public class CountOccurences {
	public static int count(int arr[] , int val ,int size ) {
		if(size == -1)
			return 0;
		if(arr[size] == val)
			return 1 + count(arr,val,size-1);
		return count(arr , val, size-1);
	}
	public static void main(String[] args) {
int arr[] = {10,20,30,10,20,20,50,60};
int val = 70;
int size = 8;
int count = count(arr,val,size-1);
if(count!=-0)
	System.out.print(val +" found  : "+ count+" times.");
else
	System.out.println(val + " not present in array");
	}
}
