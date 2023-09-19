package section05;

/*
 * 구구단
 * 
 */
public class LoopHomework2 {

	public static void main(String[] args) {

		for (int k = 0; k < 3; k++) {
			System.out.println("k = " + k);
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 3; j++) {
					int dan = j + 2 + (k * 3);
					int num = i + 1;

					if (dan > 9)
						break;
//				System.out.print(dan+"x"+num+);

					System.out.printf("%dx%d=%d\t", dan, num, dan * num);

				}
				System.out.println(); // 개행
			}
			System.out.println();
		}
	}
}