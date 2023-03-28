package com.io.controller;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;



public class IOController {
	public void filetest() {

		// java 코드로 file을 다룰 수 있는 file클래스에 대해 알아보자
		// 1. File 클래스 생성하기
		// 파일은 하드에 저장됨
//		File f = new File("test.txt");

//		File f = new File("c:/Users/GDJ/wofile.txt");	
		
		
		// 2. 지정된 파일 생성하기
		// createNewFile() 메소드를 이용
		// 파일 우클릭하고 refresh 해줘야 새로고침되서 만든 텍스트파일이 바로보임
//		try{
//			f.createNewFile();
//			System.out.println("파일생성완료");
//		}catch(IOException e) {
//			e.printStackTrace(); // 오류뜨면 빨간줄 뜨게하는거 (종료되지않음)
//			System.out.println("파일생성실패");
//		}

		
		
		
		// 3. 내가 원하는 폴더 생성하기
		// mkdir(), mkdirs() 메소드가 있음
// mkdir() : 한개 폴더만 생성
// 이미있는 파일이면 false뜸
//		File dir = new File("./myfolder2");
//		boolean result = dir.mkdirs();
//		System.out.println(result);

// mkdirs() : 하위폴더까지 여러개의 폴더를 생성
//		File dir = new File("./myfolder2/a/b");
//		boolean result = dir.mkdirs();
//		System.out.println(result);

		// 상대경로
		// 현재경로 -> ./ (현재파일이 있는 위치와 동일한 위치)
		// 상위경로 -> ../ (바로위에 있는 위치)
		// 절대경로 : c드라이브 기준으로 다 적는거 (root 부터 다 적는거)

		// 사용자에게 폴더와 파일명을 입력받아 생성해주는 기능 구현
//		Scanner sc = new Scanner(System.in);
//		System.out.print("생성할 파일 명입력 : ");
//		String ffile = sc.next();
//		System.out.print("생성할 폴더 명 입력 : ");
//		String folder = sc.next();
//		
//		makeFile(folder,ffile);
		
		
		
		
		// file 삭제하기
		// file클래스에서 제공하는 delete() 메소드를 이용함
//		File delFile = new File("bs/bsfile.txt");
//		delFile.delete();  // 파일삭제
//		
//		File delDir = new File("bs");
//		delDir.delete(); // 폴더삭제
		

		
		
//		// 이미 있는 파일에 대한 정보 확인하기
//		File info = new File("./myfolder/a/b/test.txt");
//		try{
//			info.createNewFile();
//			System.out.println("파일생성완료");
//		}catch(IOException e) {
//			e.printStackTrace(); // 오류뜨면 빨간줄 뜨게하는거 (종료되지않음)
//			System.out.println("파일생성실패");
//		}
//		// 1. 파일명확인
//		System.out.println("파일명 : "+info.getName()); // test.txt
//		// 2. 부모파일확인
//		System.out.println("부모전체파일명 : "+info.getParent()); // ./myfolder/a/b
//		// 2-1 부모파일을 File로 가져오기
//		File parent = info.getParentFile(); 
//		System.out.println("부모파일명 : "+parent.getName());  // b
//		// 3. 경로가져오기
//		System.out.println("경로가져오기 : "+info.getPath()); // .\myfolder\a\b\test.txt
//		//4. 불러온 파일이 폴더인지, 파일인지 확인
//		System.out.println("폴더니? "+info.isDirectory());
//		System.out.println("파일이니? "+info.isFile());
//		System.out.println("parent폴더니 ?"+parent.isDirectory());
//		System.out.println("parent ? "+parent.isFile());
//		
//		
//		
//		// 5. 각종 정보확인
//		// 파일크기, 숨긴파일여부, 수정한날짜, 절대경로
//		System.out.println(info.length());
//		System.out.println(info.isHidden());
//		System.out.println(new Date(info.lastModified()));
//		System.out.println(info.getAbsolutePath()); 
//		System.out.println(info.canRead()); // 읽기 권한 있는지 불린형으로 리턴
//		System.out.println(info.canExecute()); // 수정 권한 있는지 불린형으로 리턴
//		System.out.println(info.canWrite()); // 쓰기 권한 있는지 불린형으로 리턴
		
	}

	
	
	public void makeFile(String path, String fileName) {
		File dir = new File(path); // 폴더객체를 생성
		File file = new File(path+"/"+fileName+".txt"); // 파일객체를 생성
		
		try {
			dir.mkdirs();  // 폴더를 먼저 생성해야함
			file.createNewFile(); 
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public void fileManage() {
		File f = new File("c:/Windows/System32");
		//폴더에 있는 전체파일 목록을 가져오기
		//문자열로 파일명을 가져오기
		//배열로 가져오기
		String[] files = f.list();
		System.out.println(files.length); // 파일 전체 개수
		for(String fileName : files) {
			if(fileName.substring(fileName.indexOf(".")+1).equals("exe")) {
				System.out.println(fileName); // 모든 파일 출력
			}
			File temp = new File(fileName);
		}
		
		
		
		//File클래스로 가져오기
		File[] filesObj = f.listFiles();
		int count = 0;
		for(File temp : filesObj) {
//			System.out.println(temp);
//			if(temp.canExecute()) {  // 실행할 수 있는 파일 골라주는 로직
//				count++;
//			}
			if(!temp.canWrite()) {  // 읽기 전용 파일 골라주는 로직 (쓰기 x)
				count++;
			}
		}
		
		System.out.println("실행용 파일 : "+count);

		// 익명클래스로
//		filesObj = f.listFiles(new java.io.FileFilter() {  
//			
//			@Override
//			public boolean accept(File pathname) {
//				// TODO Auto-generated method stub
//				return !pathname.canWrite(); // 읽기전용인것만 리턴
//			}
//		});
		
		
		// 람다표현식으로
//		filesObj = f.listFiles((name)->!name.canWrite());
		
		
		
		
		// 람다표현식으로
//		for(File temp : filesObj) {
//			System.out.println(temp);
//		}
//		
//		
//		//익명클래스로
//		files = f.list(new FilenameFilter() {
//			@Override
//			public boolean accept(File dir, String name) {
//				// TODO Auto-generated method stub
//				return name.contains("exe");
//			}
//		});
		
		

		
		
		
		
		
		
	}
}
