package april4th;

import java.util.HashMap;

public class PrintDecodings {

	static HashMap<Integer, Character> hm=new HashMap<>();
	
	{
		System.out.println("inst");
		
	}
	static
	{
		System.err.println("stat");
	}
	
	public PrintDecodings() {
		// TODO Auto-generated constructor stub
		
		System.out.println("aaa");
	}
	
	final void x(int y){
		System.out.println("int");
	}
	
	final void x(double y){
		System.out.println("float");
	}
	
	final void x(long y){
		System.out.println("long");
	}

	
	public static void main(String[] arg) {
		
		PrintDecodings pd= new PrintDecodings();
		PrintDecodings pd1= new PrintDecodings();
		pd.x(1222228888);
		
		String x="123444444";
		hm.put(1, 'a');
		hm.put(2, 'b');
		hm.put(3, 'c');
		hm.put(4, 'd');
		hm.put(5, 'e');
		hm.put(6, 'f');
		hm.put(7, 'g');
		hm.put(8, 'h');
		hm.put(9, 'i');
		hm.put(10, 'j');
		hm.put(11, 'k');
		hm.put(12, 'l');
		hm.put(13, 'm');
		hm.put(14, 'n');
		hm.put(15, 'o');
		hm.put(16, 'p');
		hm.put(17, 'q');
		hm.put(18, 'r');
		hm.put(19, 's');
		hm.put(20, 't');
		hm.put(21, 'u');
		hm.put(22, 'v');
		hm.put(23, 'w');
		hm.put(24, 'x');
		hm.put(25, 'y');
		hm.put(26, 'z');
		
		System.out.println(countDecode(x,"",0));
		

	}

	private static int countDecode(String x, String result, int length) {
		// TODO Auto-generated method stub
		
		int count=0;
		if(length>=x.length()){
			
			System.out.println(result);
			
			result="";
			return 1;
		}
		
		else {
			
			if(x.charAt(length)>'0'){
				
				count=countDecode(x,result+hm.get(Integer.parseInt(x.charAt(length)+"")),length+1);
				
			}
			
			
			
			if(x.charAt(length)=='1' || x.charAt(length)=='2'&& length+1<x.length() && x.charAt(length+1)<'7'){
				String ss=x.charAt(length)+""+x.charAt(length+1)+"";
			

				count+=countDecode(x,result+hm.get(Integer.parseInt(ss)), length+2);

			}
			
			
			
		}
		return count;
	}
}
