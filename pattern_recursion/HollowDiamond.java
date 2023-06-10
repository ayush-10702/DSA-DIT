package pattern_recursion;
//*******
//*** ***
//**   **
//*     *
//**   **
//*** ***
//*******
public class HollowDiamond {
public static void printstar(int star)
{
	if(star==0)
		return;
	System.out.print("*");
	printstar(star-1);
}
public static void printline(int line,int sp) {
	if(line==0)return;
	printstar(line);
	printspace(2*sp);
	printstar(line);
	System.out.println();
	printline(line-1,sp+1);
}
public static void printspace(int sp) {
	if(sp==0)return;
	System.out.print(" ");
	printspace(sp-1);
}
public static void printline2(int line,int sp,int star) {
	if(line==0)
		return ;
	printstar(star);
	printspace(2*sp);
	printstar(star);
	System.out.println();
	printline2(line-1,sp-1,star+1);
}
public static void main(String[] args) {
printline(4,0);	
printline2(3,2,2);
}
}
