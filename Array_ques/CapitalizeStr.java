package Array_ques;

public class CapitalizeStr {

	public static String[] capital(String s[],int i) {
		if(i==s.length)
			return new String[0];
		String st = s[i];
		s[i]= st.toUpperCase();
		return capital(s,i+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String words[]= {"foo","bar","world"};
capital(words,0);
for(int i=0;i<words.length;i++)
	System.out.print(words[i]+" ");
	}

}
