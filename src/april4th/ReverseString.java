package april4th;

public class ReverseString {
	
	
	public static void main(String[] args) {
		
		String x="Hi i AM Himanshu";
		String res="";
		for(int i=x.length()-1;i>=0;i--){
			res+=x.charAt(i);
		}
		
		System.out.println(res);
		
	}

}
