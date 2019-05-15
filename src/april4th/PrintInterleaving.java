package april4th;

public class PrintInterleaving {
	public static void main(String[] args) {
		String x="ab";
		String y="de";
		
		printall(x,y,"",x.length(),y.length());
	}

	private static void printall(String x, String y,String res, int length, int length2) {
		// TODO Auto-generated method stub
//		String res="a";
		if(length==0 && length2==0){
			System.out.println(res);
//			res="";
			return;
		}
		
		if(length!=0){
			
			
			printall(x.substring(1), y,res+x.charAt(0),length-1 , length2);
		}
		
		if(length2!=0){
//			res+y.charAt(0);
			printall(x, y.substring(1), res+y.charAt(0),length, length2-1);
		}

	}

}
