package section05;
/*
 *  4번						i		j
 *               * 			0		4 5 6	j-1 > 3
 *              ***         1		5 6		j-1 > 3
 *             *****		2		6		j-1 > 3
 *            *******		3
 *             *****		4		0		i-j > 3
 *              ***			5		0 1		i-j > 3
 *               *			6		0 1 2	
 */
public class Loophomework {
	
	public static void main(String[] args) {
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(i < 4) {
					if (i + j < 3) {
					System.out.print(" ");
				} else if(j-1 > 3) {
					System.out.print(" ");
			} else {
				System.out.print("*");
			}
			} else {	
				if ( i - j > 3) {
				System.out.println(" ");
				} else if (i + j > 9) {
				System.out.print("");
				} else {
					System.out.println("*");
				}
			}
		}
				System.out.println();	// 개행
		}
		
	}
	
}
			
