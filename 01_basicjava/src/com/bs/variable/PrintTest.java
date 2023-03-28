package com.bs.variable;

public class PrintTest {
	public static void main(String args[]) {
		// 개형없이 같은 라인에 출력하기
		System.out.print("안녕"); 
		System.out.print(" 점심은 맛있게 먹었나요");
		
		
		System.out.println("안녕");
		System.out.println(" 점심은 맛있게 먹었나요");
		
		
		// 한줄씩 출력하기
		int age = 19;
		String name = "최주영";
		System.out.println(age);
		System.out.println(name);
		
	
	    // 정해진 양식로 출력하기
		// System.out.printf() 기능 이용
		// %.2f : 소수점 아래 2자리까지만 표시  
		// %5d : 5칸을 확보하고 오른쪽 정렬
		// %-5d : 5칸을 확보하고 왼쪽 정렬
		System.out.printf("나의 이름은 %5s이고, 나이는 %-3d이다",name,age);
		System.out.println(); // 개행처리 (다음라인)
		System.out.printf("이름 %s 나이 %d 키 %.1f 성별 %c","최주영",19,180.5,'남');
		
		
		// 문자열을 출력할 때 escape 문을 이용하여 출력
		// 개행처리, tab(일정간격 띄어쓰기), 역슬래쉬 표시, "", '' 표시
		String msg = "그는 말했다. \"하이\"";   // 큰따옴표 또는 작은 따옴표 출력하고 싶을 때 앞에 \붙이기
		System.out.println(msg);
		msg = "나는 자바 선생님입니다.\n나는 코딩을 \t좋아한다.";  // \n => 개행처리   \t => 띄어쓰기 4칸
		System.out.println(msg);
		String path = "c:\\Users\\gdj";  //  \\ -> \ 출력하고 싶을 때 사용  
		System.out.println(path);
		String html = "<p onclick=\"alter('test');\">클릭해봐</p>";
		System.out.println(html);
		
	}
}

