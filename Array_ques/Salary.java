package Array_ques;

public class Salary {

	public static double[] addtax(double a[],int i,double tax) {
		if(i==a.length)
			return a;
		a[i] = a[i] + (0.1)*tax;
		return addtax(a,i+1,tax);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double sal[] = {10000,15000,30000,40000,35000};
double tax = 1000;
System.out.println("Salary before tax is  : ");
for(double x:sal)
	System.out.print(x+" ");
addtax(sal,0,tax);
System.out.println("\nSalary after tax is : ");
for(double x:sal)
	System.out.print(x+" ");

	}

}
