package recusrion;

public class SearchFromLast {

	public static int find(int arr[] , int val ,int size ) {
		if(size == 0)
			return -1;
		if(arr[size] == val)
			return size;
		return find(arr , val, size-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {10,20,30,10,40,20,50,60};
int val = 70;
int size = 8;
int index = find(arr,val,size-1);
if(index!=-1)
	System.out.print(val +" fount at last index : "+index);
else
	System.out.println(val + " not present in array");
	}

}
