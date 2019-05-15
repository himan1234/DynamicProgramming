package may14th;

public class MaxSubArrayUnSubsequent {
	
	public static void main(String[] args) {
		int[] arr={1,23,25};
		
		int incl=arr[0];
		int excl=0;
		int excl_new;
		String inclusive="";
		String exclusive="";
		for(int i=1;i<arr.length;i++){
			excl_new=incl;
			if(incl<excl+arr[i]){
				inclusive+=i;
				System.out.println("----------"+i);
			}
			else{
				exclusive+=i;
				System.out.println("========="+i);

				
			}
			incl=max(incl,excl+arr[i]);
			excl=excl_new;
			
		}
		
		if(incl>excl){
			System.out.println(incl);
			System.out.println(inclusive);
		}
		else{
			System.out.println(excl);
			System.out.println(exclusive);
			
		}
//		System.out.println(inclusive);
	}

	private static int max(int incl, int i) {
		
		return incl>i?incl:i;
		// TODO Auto-generated method stub
		//return 0;
	}

}
