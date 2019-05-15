package april4th;

import java.util.HashMap;

public class PowerSet {
	static HashMap<Integer,String>hm = new HashMap<>();
	static int counter=0;
	public static void main(String[] args) {
		String x="xyz";
		
		printAllSet(x,"",0);
		
		for(int x1 : hm.keySet()){
			System.out.println(x1+"-----"+hm.get(x1));
		}
		
	}

	private static String printAllSet(String x,String y, int length) {
		// TODO Auto-generated method stub
		
		if(length==x.length()){
			
			return y;
			
		}
		
			
			y+=x.charAt(length)+printAllSet(x, y, length+1);
			
			hm.put(counter++, y);
			
			y+=x.charAt(length)+printAllSet(x.substring(1), y, length+1);
			
			hm.put(counter++, y);
			
			
		;
		return y;
		
		
		
		
		
		
		
		
	}
}
