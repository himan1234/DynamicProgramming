package april5th;

public class Palindrome {
	public static void main(String[] args) {
		String c="acdcb";
		StringBuilder s=new StringBuilder(c);
		
		//int x=lcs(c,s.reverse());
		Palindrome pd=new Palindrome();
		System.out.println(pd.ch());
		
		
//		System.out.println(x);
	
	}
	public int ch(){
		try {
			int x=1/0;
			
			System.out.println(1);
			return 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(2);
			return 2;

		}
		finally {
			System.out.println(3);
			//return 3;

		}
	}

	private static int lcs(String c, StringBuilder reverse) {
		// TODO Auto-generated method stub
		int[][] arr=new int[c.length()+1][reverse.length()+1];
		
		String res="";
		int count=1;
		for(int i=0;i<c.length()+1;i++)
			for(int j=0;j<reverse.length()+1;j++){
				
				if(i==0 ||j==0){
					arr[i][j]=0;
				}
				
				else if(c.charAt(i-1)==reverse.charAt(j-1)){
					arr[i][j]=arr[i-1][j-1]+1;
					if(arr[i][j]==count){
						res+=c.charAt(i-1);
						count++;
					}
					
					
					
				}
				else
					arr[i][j]=arr[i-1][j]>arr[i][j-1]?arr[i-1][j]:arr[i][j-1];
				
				
			}
		System.out.println(res);
		return arr[c.length()][reverse.length()];
	}
}
