package recusrion;

public class ReplaceElements {
		public static void findReplace(int arr[] , int val ,int size , int new_val ) {
			if(size == -1)
				return ;
			if(arr[size] == val)
				arr[size] = new_val ;
			findReplace(arr , val, size-1,new_val);
		}
		public static void main(String[] args) {
	int arr[] = {10,20,30,10,40,20,50,60};
	int val = 10;
	int size = 8;
	int new_val = 70;
	System.out.print("Array before replacing "+val +" with "+new_val+" : ");
	for(int b : arr)
		System.out.print(b+" ");
	findReplace(arr,val,size-1, new_val);
	System.out.print("\nArray After : ");
	for(int a :arr)
		System.out.print(a+" ");
}
}