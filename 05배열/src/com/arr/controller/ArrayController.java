package com.arr.controller;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayController {
	public void basicArray() {
		Scanner sc = new Scanner(System.in);
		// 기본배열 활용하기
		// 배열은 기본으로 제공되는 저장공간으로 생성(new)해서 사용을 한다.
		// 배열의 저장구조는 선형구조임.
		// 저장순서가 있고 저장소를 지칭하는 번호(인덱스)를 가진다.
		// 배열 선언하기
		// 배열 자료형 -> 기본자료형 []
//		int[] intArr; // 배열을 저장할 수 있는 변수를 선언
		// 원하는 크기만큼의 배열을 생성해서 할당을 해야한다.
		// 배열생성하기 -> new 연산자를 이용해서 생성!
		// new 자료형[원하는갯수(길이)]
//		intArr = new int[3]; // new -> 힙영역에 생성!
		// 기본으로 생성했을 때 각 저장소의 자료형의 기본값으로 초기화된다.
		// 정수형(byte, short, int, long) : 0;
		// 실수형(float, double) : 0.0;
		// 문자혈(String) : null;
		// 문자(char) : ' '

		// 배열 생성 후 각 저장공간 활용하려면
		// 인덱스번호로 각 저장공간을 불러올 수 있다.
		// 인덱스번호는 선언한 길이에 -1한 번호까지 있다.
//	    System.out.println(intArr[0]); 
//	    System.out.println(intArr[1]);
//	    System.out.println(intArr[2]);
		// 초과한 인덱스번호를 호출하면????
		// ArrayIndexOutOfBoundsException 예외 오류가 뜸

		// 배열에 값 저장하기
//	    intArr[0] = 1;
//	    intArr[1] = 200;
//	    intArr[2] = -5;
//	    
//	    // 배열 값 출력
//	    for(int i=0; i<3; i++) {
//	    	System.out.println(intArr[i]);
//	    }

		// 친구이름 저장하기
		// 친구 3명의 이름을 저장하는 배열을 만들고
		// 자신의 스터디원을 저장 후 출력하기
		// for문과 같이 배열 이용하기
//	    String [] strFriend;
//	    strFriend = new String[3];
//	    Scanner sc = new Scanner(System.in);
//	    
//	    for(int i=0; i<=2; i++) {
//	    	System.out.print("친구 "+(i+1)+"입력 : ");
//	    	strFriend[i] = sc.nextLine();
//	    }
//	    
//	    for(int i=0; i<=2; i++) {
//	    	System.out.print("친구 "+(i+1)+" : "+strFriend[i]+"\n");
//	    }
//	    
//	    strFriend[0].length(); // String 형태이기 때문에 String 함수 사용가능
//	    strFriend[0].charAt(0); // String 형태이기 때문에 String 함수 사용가능

		// 배열에서 저장소의 길이를 제공하는 변수가 있음.
		// 문자열 : 배열변수명.length;
		// 정수형 : 배열변수명.length;
//	    System.out.println(intArr.length);
//	    System.out.println(strFriend.length);

		// 반복문을 이용해서 배열을 초기화
		// int형 배열 10개를 할당하고 각 저장공간에 1 ~ 10 까지 수를 대입하기
//	    int [] iarray = new int[10];
//	    
//	    for(int i=0; i<iarray.length; i++) {
//	    	iarray[i] = i+1;
//	    }
//	    for(int i=0; i<iarray.length; i++) {
//	    	System.out.print(iarray[i]+ " ");
//	    }

		// 학생 5명의 키를 입력받아 저장하는 기능 구현하기
		// 저장후 출력하기

//	    double[] darray = new double[5];
//	    for(int i=0; i<darray.length; i++) {
//	    	System.out.print(i+1+"번째 키 입력 : ");
//	    	darray[i] = sc.nextDouble();
//	    }
//	    
//	    for(int i=0; i<darray.length; i++) {
//	    	System.out.println(i+1+"친구의 키는 : "+darray[i]);
//	    }

		// 배열선언시에 대입할 값이 정해져 있다면
		// 배열선언과 동시에 값을 초기화할 수 있다.
//	    char[] alpha = {'a','b','c','d','e'}; // (1)
//	    for(int i=0; i<alpha.length; i++) {
//	    	System.out.println(alpha[i]);
//	    }
//	    
//	    char[] alpha2 = new char[] {'A','B','C','D','E'}; // (2)
//	    for(int i=0; i<alpha2.length; i++) {
//	    	System.out.println(i+"번 : "+alpha[i]);
//	    }

		// 위 2개 차이점 => (1)은 배열선언과 동시에만 초기화할 수 있음
		// ex) alpha = {'가','나','다','라'}; (사용불가)

		// (2) 다른라인에서도 초기화 가능
		// ex) alpha = new char[]{'가','나','다','라'}; 사용가능

		// 배열은 한번 선언된 길이는 변경되지 않는다.
		String[] names2 = new String[3];
		names2[0] = "유병승";
		names2[1] = "홍길동";
		names2[2] = "피카추";
		// names2[3] = "리자몽"; // 자동으로 길이가 증가하지 않는다. (오류)

		// 배열은 저장된 데이터를 전체 순회해서 원하는 데이터를 찾을 수 있음
		// 30 이상인 값의 개수를 구하는 기능
//	      int[] number2 = {10,20,30,40,50,60};
//	      int cnt = 0;
//	      for(int i=0; i<number2.length; i++) {
//	    	  if(number2[i] >= 30) {
//	    		  cnt++;
//	    	  }
//	      }
//	      System.out.print("30이상인 값의 개수는 : "+cnt);

		// 저장된 학생이름 중 김씨 학생 수를 구하는 기능
		// 버전업 사용자가 요청한 성씨를 학생수를 구하는 기능
//	  	String[] studentName = {"김현영","김찬은","김중근","김재훈","김예린","강민기","윤지환"
//	  			                ,"유준호","윤나라","나빈","이성진","이동제","이다영","조윤진",
//	  			                "정상준","이은지"};
//	    char sung = sc.next().charAt(0);
//	  	int count = 0;
//
//	  	for(int i=0; i<studentName.length; i++) {
//	  		{
//	  			if(studentName[i].charAt(0) == sung) {
//	  				count++;
//	  			}
//	  		}
//	  	}
//	  	System.out.println("입력한 "+sung+"씨의 학생수는 : "+count);

		// 정수 10개를 랜덤으로 저장하는 기능 만들기
		// 1 ~ 100수를 랜덤하게 저장
		// 최대값 최소값 구하기

//	    int[] iarray = new int[10];
//	    for(int i=0; i<iarray.length; i++) {
//	    	iarray[i] = (int)(Math.random()*100)+1; // 1~100 
//	    }
//	    
//	    
//	    int maxNum = iarray[0];
//	    int minNum = iarray[0];
//	    for(int i=0; i<iarray.length; i++) {
//	    	if(maxNum < iarray[i]) {
//	    		maxNum = iarray[i];
//	    	}
//	    	
//	    	if(minNum > iarray[i]) {
//	    		minNum = iarray[i];
//	    	}
//	    }
//	    
//	    for(int i=0; i<iarray.length; i++) {
//    	System.out.print(iarray[i]+" ");	  
//    }
//	    System.out.println();
//	    System.out.println("가장 큰 수는 "+maxNum);
//	    System.out.println("가장 작은 수는 "+minNum);

		// 배열은 선택구조로 순서가 있음
		// 순서는 인덱스번호를 기준으로 순서를 정함.
		// 값을 정렬할 수 있다.
		// 배열의 저장값 위치 변경하기
//	    int[] testArr = {4,3,6,2,7,5,1};
//	    System.out.print("변경 전 : ");
//	    for(int i=0; i<testArr.length; i++) {
//	    	System.out.print(testArr[i]+" ");
//	    }
//	    int temp = testArr[0];
//	    testArr[0] = testArr[1];
//	    testArr[1] = temp;
//	    System.out.println();
//	    System.out.print("변경 후 : ");
//	    for(int i=0; i<testArr.length; i++) {
//	    	System.out.print(testArr[i]+" ");
//	    }

		// 오름차순 정렬하기
//	      int[] testArr = {4,3,6,2,7,5,1};
//	      for(int i=0; i<testArr.length; i++) { // i가 기준 j는 첨부터 i전까지 비교
//	    	  
//	    	  for(int j=0; j<i; j++) {
//	    		  int pre = testArr[j];
//	    		  int next = testArr[i];
//	    		  if(next < pre) {
//	    			  int t = next;
//	    			  testArr[i] = pre;
//	    			  testArr[j] = t;
//	    		  }
//	    	  }
//	      }
//	      for (int i=0; i<testArr.length; i++) {
//	    	  System.out.print(testArr[i]+" ");
//	      }

	}

	public void arraysCopyTest() {
		// 배열을 복사
		// 1. 얕은 복사 : 원본 값을 공유하는 방식 (원본값을 바꾸면 복사값도 바뀜)
		// 2. 깊은 복사 : 별도의 저장공간을 생성해서 데이터를 따로 관리하는 방식(원본값을 바꿔도 복사값 바뀌지 x)
		int[] num = { 1, 2, 3, 4, 5 };
		// 얕은복사 -> 주소를 복사해줌
		int[] copynum = num;
		System.out.println(num);
		System.out.println("num " + Arrays.toString(num));
		System.out.println("copynum " + Arrays.toString(num));
		System.out.println("num[0] : " + num[0]); // 0
		System.out.println("num[0] : " + copynum[0]); // 0
		// 주소값을 공유하기 때문에 저장소가 한개임!
		num[0] = 100;
		System.out.println("num[0] : " + num[0]); // 100
		System.out.println("num[0] : " + copynum[0]); // 100

		// 깊은복사 -> 값 자체를 복사해서 새로운 저장소에 저장
		int[] deepcopy = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			deepcopy[i] = num[i];
		}
		System.out.println("num : " + Arrays.toString(num)); // [100,2,3,4,5]
		System.out.println("deepcopy : " + Arrays.toString(deepcopy)); // [100,2,3,4,5]
		num[0] = 200;
		System.out.println("num : " + Arrays.toString(num)); // [200,2,3,4,5]
		System.out.println("deepcopy : " + Arrays.toString(deepcopy)); // [200,2,3,4,5]

		// java에서 제공하는 기능을 이용해서 깊은복사하기
		// Arrays 클래스에서 제공하는 copyof() 기능 이용하기
		int[] copy2 = Arrays.copyOf(num, num.length);
		System.out.println("cop2" + Arrays.toString(copy2)); // [200,2,3,4,5]
		int[] copy3 = Arrays.copyOf(num, 2);
		System.out.println("cop3" + Arrays.toString(copy3)); // [200,2]

		// 배열전체를 깊은복사할때는 clone() 이용해도된다.
		copy3 = num.clone(); // copy3은 2개 요소였는데 5개로 변함
		System.out.println("cop3" + Arrays.toString(copy3));

		// System.arraycopy()이용하기
		// 첫번째 : 원본배열
		// 두번째 : 원본배열의 시작인덱스
		// 세번째 : 복사될 배열
		// 네번째 : 복사될배열의 시작인덱스
		// 다섯번째 : 복사할 데이터 수(길이)
		// 두번째 네번째에 원본과 복사된 배열의 길이는 같아야함!
		String[] names = { "유병승", "홍길동", "김유신" };
		String[] extend = new String[names.length + 5];
		System.arraycopy(names, 0, extend, 0, 2);
		for (int i = 0; i < extend.length; i++) {
			System.out.print(extend[i] + " ");
		}
		System.out.println();
	}

	public void doubleArray() {
		// 2차원 배열에 대해 알아보자
		// 배열저장소 두개가 연결되어있는 구조
		// 저장소는 바둑판처럼 저장구조를 가지고 있음
//		int[][] intArr;
//		intArr = new int[3][3];
//		System.out.println(intArr);
//		System.out.println(intArr[1]);
//		System.out.println(intArr[0][0]);
//		System.out.println(intArr[0][1]);
//		System.out.println(intArr[0][2]);
//		
//		int num = 1;
//		for(int i=0; i<intArr.length; i++) {  // 정방형 배열
//			for(int j=0; j<intArr.length; j++) {
//				intArr[i][j] = num;
//				num++;
//			}
//		}
//		
//		for(int i=0; i<intArr.length; i++) {  // 정방형 배열
//			for(int j=0; j<intArr.length; j++) {
//				System.out.print(intArr[i][j]);
//			}
//			System.out.println();
//		}

		// 3*3 2차원배열을 생성하고
		// 123
		// 123
		// 123 을 각 인덱스에 저장하고 출력하기

//		int[][] nnum = new int[3][3];
//		for(int i=0; i<nnum.length; i++) {
//			for(int j=0; j<nnum[i].length; j++) {
//				nnum[i][j] = j+1; 
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<nnum.length; i++) {
//			for(int j=0; j<nnum[i].length; j++) {
//				System.out.print(nnum[i][j]);
//			}
//			System.out.println();
//		}
//		

//		int [][] number = new int[3][4];
//		for(int i=0; i<number.length; i++) {
//			for(int j=0; j<number[i].length; j++) {
//				number[i][j] = (i*4)+j+1;
//				
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<number.length; i++) {
//			for(int j=0; j<number[i].length; j++) {
//				if(number[i][j] < 10) {
//					System.out.print("0"+number[i][j]+" ");
//				}else {
//					System.out.print(number[i][j]+" ");
//				}
//			}
//			System.out.println();
//		}

//		String [][] study = {{"김중근","홍승우","윤준호","김현영"},{"김찬은","홍성현","나빈","이성진"},{"김재훈","이다영","조장흠"},{"김예린","윤나라","최인호","최주영","이동제"},{"윤지환","최솔","강민기"},{"조윤진","정상준","최하리","이은지"}};
//		Scanner sc = new Scanner(System.in);
//		System.out.print("조원 입력 : ");
//		String name = sc.next();
//		boolean flag = false;
//		
//		for(int i=0; i<study.length; i++) {
//			for(int j=0; j<study[i].length; j++) {
//				if(study[i][j].equals(name)) {
//					System.out.println(name+" 조는 "+(i+1)+"조");
//					System.out.print("조원은 : ");
//					for(int k=0; k<study[i].length; k++) {
//						System.out.print(study[i][k]+" ");
//					}
//					System.out.println();
//					System.out.println("인원수는 : "+study[i].length+"명 입니다.");
//				}
//			}
//		}

//		String[][] study = { { "김중근", "홍승우", "윤준호", "김현영" }, { "김찬은", "홍성현", "나빈", "이성진" }, { "김재훈", "이다영", "조장흠" },
//				{ "김예린", "윤나라", "최인호", "최주영", "이동제" }, { "윤지환", "최솔", "강민기" }, { "조윤진", "정상준", "최하리", "이은지" } };
//		Scanner sc = new Scanner(System.in);
//		System.out.print("조원 입력 : ");
//		String name = sc.next();
//		String msg = "없는 조원입니다.";
//		for (int i = 0; i < study.length; i++) {
//			for (int j = 0; j < study[i].length; j++) {
//				if (study[i][j].equals(name)) {
//					msg = name + " 조는 " + (i + 1) + "조";
//					msg = msg + "\n" + "인원수는 : " + study[i].length + "명 입니다.";
//					msg = msg + "\n" + "조원은 : ";
//					for (int k = 0; k < study[i].length; k++) {
//						msg = msg + study[i][k] + " ";
//					}
//					System.out.println();
//				}
//			}
//		}
//		System.out.println(msg);
//	}
	}
	// 배열에 대한 배열 데이터에 순회할때 편리하게 해보자
	public void extraTest() {
//		int[] intArr = {1,2,3,4,5,6};
//		// 기본 for문 이용해서 각 인덱스에 접근함
//		for(int i=0; i<intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}
//		// forEach 문을 이용해서 데이터 순회하기
//		// for(자료형 변수명 : 배열명or컬렉션프레임워크){
//		System.out.println("forEach문을 이용해서 출력하기");
//		for(int d : intArr) {
//			if(d % 2 == 0) {
//				System.out.println(d);
//			}
//		}
//		//forEach문은 배열에 있는 값을 수정할 때는 사용할 수 없다. 값을 수정할때는 배열 사용
//		String[] hobby = {"농구","자전거","게임","코딩"};
//		for(String h : hobby) {
//			System.out.println(h);
//			if(h.equals("코딩")) {
//				h = "운동";  // 값이 바뀌지 않음
//			}
//		}

		// 배열에 중복값 없이 저장하기
		// 임의의 정수 10개 저장하기
		// 1 ~ 50까지

//		int[] randInt = new int[10];
//		
//		for(int i=0; i<randInt.length; i++) {
//			randInt[i] = (int)(Math.random()*10+1);
//			for(int j=0; j<i; j++) {
//				if(randInt[i] == randInt[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
//		for(int i:randInt) {
//			System.out.print(i+" ");
//		}

		// 로또만ㅁ들기!!!
		// 1~45번 중복값어이 6자릿 실행
//		int[] lotto = new int[6];
//		
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45+1);
//			for(int j=0; j<i; j++) {
//				if(lotto[i] == lotto[j]){
//					i--;
//					break;
//				}
//			}
//		}
//		
//		System.out.print("로또번호 : ");
//		for(int i=0; i<lotto.length; i++) {
//			
//			System.out.print(lotto[i]+" ");
//		}

		// up&down게임만들기
		// 랜덤으로 1~50까지의 수중 한개를 저장
		// 사용자에게 값을 입력받아 랜덤값과ㄴ 비교하고 랜덤값이 크면 up출력
		// 작으면 Down출력 맞추면 정답입니다!! 짝짝짝! 출력 정답을 맞출때까지 진행!

//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		int number = (int)Math.random()*50+1;
//		
//		while(true) {
//			count +=1;
//			System.out.print("값을 입력하세요 : ");
//			int user = sc.nextInt();
//			if(user > number) {
//				System.out.println("DOWN");
//			}else if(user < number)
//			{
//				System.out.println("UP");
//			}else {
//				System.out.println("정답입니다!! 짝짝짝! 출력!");
//				break;
//			}
//		}
//		System.out.println("총 시도횟수는 : "+count+"번입니다.");

//		1. 야구게임
//		- 랜덤으로 세개의 수를 각 자리 수에 저장 * 정답값
//		- 사용자가 임의의 수 3개를 입력받음
//		- 정답값이랑 비교하여 
//		   사용자가 입력한 숫자가 정답과 자리수와 숫자가 일치하면 -> 스트라이크,
//		   사용자가 입력한 숫자가 정답과 일치하고 자리수가 맞지 않으면 -> 볼,
//		   사용자가 입력한 숫자가 일치한게 하나도 없으면 -> 파울으로 처리
//
//		- 정답을 맞출때까지 입력이 반복되야함.
//
//		예 ) ==== 야구게임시작 ==== 
//		     답 : 345
//		     입력 : 311 -> 1 스트라이크
//		     입력 : 354 -> 1스트라이크 2볼
//		     입력 : 344 -> 2스트라이크
//		     입력 : 534 -> 3볼
//		     입력 : 890 -> 파울
//		     입력 : 345 -> 3스크라이크 정답
//		     게임한판 더?  
//		- 정답을 맞추면 게임을 더 할지 확인후 계속진행은 위 로직 반복
//		  그만하면 프로그램종료

		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int[] randnumArray = new int[3];
		int usernumArray[] = new int[3];

		
		for (int i = 0; i < randnumArray.length; i++) {
			randnumArray[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if ((randnumArray[i] == randnumArray[j]) || (randnumArray[0] == 0)) {
					i--;
					break;
				}
			}
		}

		System.out.print("컴터 입력한 답 : ");
		for (int i = 0; i < randnumArray.length; i++) {
			System.out.print(randnumArray[i] + " ");
		}
		System.out.println();
		// 100~999 범위


		while (true) {
			int strike = 0;
			int ball = 0;

			
			
			System.out.print("답(3자리만 입력) : ");
			int userNum = sc.nextInt();

			for (int i = 0; i < 3; i++) {
				if (i == 2) {
					usernumArray[i] = (userNum % 10);
				} else if (i == 1) {
					usernumArray[i] = (userNum / 10);
					userNum = userNum % 10;
				} else {
					usernumArray[i] = (userNum / 100);
					userNum = (userNum % 100);
				}
			}

			System.out.print("내가 입력한 답 : ");
			for (int i = 0; i < randnumArray.length; i++) {
				System.out.print(usernumArray[i] + " ");
			}


			if (usernumArray[0] == randnumArray[0]) {
				strike++;
			} else if (randnumArray[0] == usernumArray[1] || randnumArray[0] == usernumArray[2]) {
				ball++;
			}

			if (usernumArray[1] == randnumArray[1]) {
				strike++;
			} else if (randnumArray[1] == usernumArray[0] || randnumArray[1] == usernumArray[2]) {
				ball++;
			}
			if (usernumArray[2] == randnumArray[2]) {
				strike++;
			} else if (randnumArray[2] == usernumArray[0] || randnumArray[2] == usernumArray[1]) {
				ball++;
			}

			if (strike == 0 && ball == 0) {
				System.out.println(" -->"+"파울");
			} else if (strike == 3) {
				System.out.println(" -->"+"3스트라이크 정답!!");
				flag = true;
			} else if (strike > 0 && ball == 0) {
				System.out.println(" -->"+strike + "스트라이크");
			} else if (strike == 0 && (ball > 0)) {
				System.out.println(" -->"+ball + "볼");
			} else {
				System.out.println(" -->"+strike + "스트라이크 " + ball + "볼");
			}
			if (flag == true) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("다시 시도하시오");
			}
		}
	}
}
