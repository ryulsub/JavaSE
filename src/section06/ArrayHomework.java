package section06;
/*
 * 
 * 
 * 1. 2중배열 선언하고
 * 2. for문으로 1~49까지 대입하기
 *  7*7배열
 * 3. 아래 써준 번호대로 출력하기
 * 
 *  
 					i
 					0	 1[0][0]
			 		1    2[0][1]  8[1][0]
			 		2   15[2][0]  9[1][1]   3[0][2]
			 		3	 4[0][3] 10[1][2]  16[2][1] 22[3][0]
			 		4   29[4][0] 23[3][1]  17[2][2] 11[1][3]  5[0][4]
			 		5    6[0][5] 12[1][4]  18[2][3] 24[3][2] 30[4][1] 36[5][0] 
			 		6   43[6][0] 37[5][1]  31[4][2] 25[3][3] 19[2][4] 13[1][5] 7[0][6]
			 		   
			 		   
			 		7   14[1][6] 20[2][5]  26[3][4] 32[4][3] 38[5][2] 44[6][1]
			 		8   45[6][2] 39[5][3]  33[4][4] 27[3][5] 21[2][6] 
			 		9   28[3][6] 34[4][5]  40[5][5] 46[6][3]
			 	   10   47[6][4] 41[5][5]  35[4][6]
			 	   11	42[5][6] 48[6][6]
			 	   12   49[6][6]
 *  
 */
public class ArrayHomework {
 
	public static void main(String[] args) {
		
		int[][] array = new int[7][7];
		
		for(int i =0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				int value = i * 7 + j + 1;
				array[i][j] = value;
			}	
		}		
		
		
			for(int i = 0; i < 13; i++) {
				if(i < 7) {
					for(int j = 0; j < i+1; j++) {
						if(i % 2 == 0) {
							System.out.print(array[i-j][j] + " ");
						} else {
							System.out.print(array[j][i-j] + " ");
						}			
					}
				} else {
					for(int j = 0; j < 13 - i; j++) {
						if(i % 2 == 0) {
							System.out.print(array[6-j][i-6+j] + " ");
						} else {
							System.out.print(array[i-6+j][6-j] + " ");
						}
						
					}
				}
				
				System.out.println();
			}
	}
}

	//	 for(int i = 0; i < nums.length; i++) {
//	  for(int j = 0; i < nums.length; j++) {
//		 System.out.print(nums[i][j]+ " ");
//	 System.out.println();
	 
