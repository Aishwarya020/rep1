package pattern_pkg;

public class starclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int i,j;
		
		for(i=0;i<6;i++) {
			for(j=0;j<6;j++) {
				
				
				if((i==1 && j==3) || (i==2 && (j==2 || j==4)) || (i==3 && (j==1 || j==5)) || (i==4 && (j==2 || j==4 )) || (i==5 && j==3)) {
					
					System.out.print("*");
				}
				
				else {
					
					System.out.print(" ");
			}
			
		}
			
			System.out.println();
		
	}
		
	
	
		
		
		
		
		

}

}