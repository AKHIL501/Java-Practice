
public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----------------------Declaration-1---------------------------");
		int[][] arr=new int[3][3];
		arr[0][0]=1;  
		arr[0][1]=2;  
		arr[0][2]=3;  
		arr[1][0]=4;  
		arr[1][1]=5;  
		arr[1][2]=6;  
		arr[2][0]=7;  
		arr[2][1]=8;  
		arr[2][2]=9; 
		
		for(int i=0;i<3;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.print(arr[i][j]+" ");  
			 }  
			 System.out.println();
		}
		
		System.out.println("----------------------Declaration-2---------------------------");
		int a[][]={{1,2,3},{2,4,5},{4,4,5}};  
		  
		//printing 2D array  
		for(int i=0;i<3;i++){  
		 for(int j=0;j<3;j++){  
		   System.out.print(a[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
		
	}

}
