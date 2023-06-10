package recusrion;

public class ReplaceStringAdjacentWithHash {

	public static String replace(String st , int index,String str) {
		if(index == st.length()-1)
			return str;
		if(st.charAt(index)==st.charAt(index+1)) {
			str = str +st.charAt(index)+'#';
			return replace(st , index+1,str);
		}
			return replace(st , index+1, str);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ans = replace("aabbcc" , 0 , "");
System.out.print(ans);
	}

}
