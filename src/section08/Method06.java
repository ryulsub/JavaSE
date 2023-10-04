package section08;

public class Method06 {
	
	public static void main(String[] args) {
		
		int max = max(10, 25);
		System.out.println("Max : " + max);
		
		max = max(1, 2, 3);
		System.out.println("Max :" + max);
	}
	// 6. 인자 O, 리턴 O - > 인자값을 바당 연산 후 결과값 반환 메서드
	public static int max(int a, int b) {
		int max = a > b ? a : b; // 삼항연산자
		return max;
	}
	
	public static int max(int a, int b, int c) {
		int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		return max;
	}
	
}	
		
		