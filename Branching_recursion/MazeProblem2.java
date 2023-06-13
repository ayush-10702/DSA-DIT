package Branching_recursion;

import java.util.ArrayList;

public class MazeProblem2 {

	static ArrayList<String> getMaze(int row,int col,int endrow,int endcol){
		if(col>endcol||row>endrow) {
			ArrayList<String> list = new ArrayList<>();
			return list;
		}
		if(col==endcol&&row==endrow) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		ArrayList<String> res = new ArrayList<>();
//		for right move
		ArrayList<String> right = getMaze(row,col+1,endrow,endcol);
		for(String t:right)
			res.add("R"+t);
//		for down move
		ArrayList<String> down = getMaze(row+1,col,endrow,endcol);
		for(String t:down)
			res.add("D"+t);
//		for diagonal move
		ArrayList<String> diagonal = getMaze(row+1,col+1,endrow,endcol);
		for(String t:diagonal)
			res.add("I"+t);
		return res;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4*4 matrix
ArrayList<String> li = getMaze(0,0,3,3);
for(String a:li )
	System.out.print(a+" ");
	}

}
