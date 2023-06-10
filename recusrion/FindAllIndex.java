package recusrion;
public class FindAllIndex {
	public static int find(int arr[] , int val ,int size,int[] output ) {
		if(size == -1)
			return 0;
		int c = find(arr , val, size-1,output);
		if(arr[size] == val)
		output[c++] = size;
		return c ;
	}
	public static void main(String[] args) {
int arr[] = {10,20,30,10,20,20,50,60};
int val = 20;
int size = 8;
int output[] = new int[size];
int n = find(arr,val,size-1,output);
System.out.print(val +" found at index : ");
for(int i=0;i<n;i++)
	System.out.print(output[i]+" ");
if(n == 0)
	System.out.println(val + " not present in array");
	}

}
