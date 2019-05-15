package april4th;

public class CountDecodings {

	
	public static void main(String[] arg) {
		String x="123";
		
		System.out.println(countDecode(x,0));
	}

	private static int countDecode(String x, int length) {
		// TODO Auto-generated method stub
		
		int count=0;
		if(length>=x.length()-1){
			return 1;
		}
		
		else {
			
			if(x.charAt(length)>'0')
				count=countDecode(x, length+1);
			
			
			
			if(x.charAt(length)=='1' || x.charAt(length)=='2' && x.charAt(length+1)<'7'){
				count+=countDecode(x, length+2);
			}
			
			
			
		}
		return count;
	}
}
