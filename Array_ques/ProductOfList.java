package Array_ques;

import java.util.ArrayList;

public class ProductOfList {
	public static int product(ArrayList<Integer> ar,int i) {
		if(i==ar.size())
			return 1;
		int curr = ar.get(i);
		return curr * product(ar,i+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> ar = new ArrayList<>();
ar.add(1);
ar.add(5);
ar.add(10);
ar.add(4);
ar.add(6);
int res = product(ar,0);
System.out.println("Product of list : "+res);
	}

}
