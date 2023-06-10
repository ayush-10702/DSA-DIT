package recusrion;

public class InsertBETWEEN {

	public static String insert(String st , int index,String str) {
		if(index == st.length()-1)
			return str;
		if(st.charAt(index)==st.charAt(index+1)) {
			str = str +st.charAt(index)+'*'+st.charAt(index+1);
			return insert(st , index+1,str);
		}
			return insert(st , index+1, str);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ans = insert("aaabbcc",0,"");
System.out.print(ans);
	}

}
