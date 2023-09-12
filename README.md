# JAVA 수업 자료입니다.

```
코드영역
public class ConsolePrint {
	// 자바 프로그램 시작 메인 메서드
	public static void main(String[] args) {
		// print - 줄바꿈 X
		System.out.print("Welcome.");
		
		// println - 줄바꿈 O
		System.out.println("Java, World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 9, 12);

		System.out.println("오늘은 " + 9 + "월" + 12 + "일 입니다.");
