 package com.io.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamController {

	public void fileSave() {
		// 애플리케이션에서 관리하는 데이터를 지정한 파일에 저장하는 기능
		// 1. OutputStream 클래스를 이용 -> 불가능함 
		// OutputStream 클래스 상속받은 FileOutputStream 클래스를 이용
		// FileOutputStream 클래스 생성
		// 매개변수있는 생성자를 이용
		// 1) new FileOutputStream(File f); 
		// 2) new FileOutputStream(String filename);
		
		FileOutputStream fos = null;
		
		// try~catch로 미리 예외처리 해줘야 할 수 있음
		try {
//			FileOutputStream fos = 
//					new FileOutputStream(new File("test.txt"));  // (1)번 방식
			fos = new FileOutputStream("test"); // (2)번 방식
			// 만일 지정한 파일 없으면 생성해서 연결함	
			
			// 생성한 스트림을 이용해서 데이터 저장하기
			// write() 메소드를 이용
			// 매개변수는 정수형이나 바이트배열형만 가능함
			fos.write(65);
			fos.write(66);
			fos.write(10);
			fos.write(9);
			fos.write(8);
			fos.write(7);
			String name = "유병승";
			fos.write(name.getBytes()); // 문자열을 바이트 배열형으로 형변환해서 저장
			
		}catch(FileNotFoundException e) { // 파일생성 예외처리
			e.printStackTrace();  
		}catch(IOException e) {  // fos.write 예외처리
			e.printStackTrace();
		}finally {
			// 생성한 Stream을 반드시 닫아줘야한다.
			// close();
			try {
				if(fos!= null)fos.close();  // fos에 널값이 들어가면 널포인터 오류뜨기때문에
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	// 파일데이터 불러오기
	public void fileOpen() {
		FileInputStream fis = null;
		try {
//			fis = new FileInputStream(new File("test.txt")); //(1번방식)
			fis = new FileInputStream("test"); //(2번방식)
			
			// 연결된 파일에서 데이터를 읽어오기
			// read() 메소드를 이용
			// 1byte씩 읽어옴 -> int로 반환해줌
			// 파일의 내용을 끝까지 다 읽어오면 -1을 반환함
			int value = 0;
			
			while((value = fis.read()) != -1) {
				
				System.out.println((char)value); // 영어이외의 문자들은 깨져서 나옴
			}
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fis!=null) fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	// 데이터를 문자열로 저장하기
	// Reader, Write 클래스 이용하기
	// 추상클래스인 Reader, Write 클래스를 사용하지 않고
	// 상속받은 FileReader, FileWrite 클래스를 사용한다
	// 값을적어서 파일로 보내는거 = FileWrite
	// 파일을 읽어서 값을 불러읽는것 = FileReader
	
	
	public void strSave() {
		FileWriter out = null;
		
		try {
			//out= new FileWriter(new File("strdata")); // File클래스로 쓰는 방법
			out= new FileWriter("strdata"); // 문자열로 경로 넣는 방법
			// 파일이 없으면 자동으로 생성함
			out.write("여러분 힘내세요 이제 곧 끝나요!!");
			out.write("뻥이에요!");
			out.write("19");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null)out.close(); // close를 안해주면 나중에 길이 여러개 생겨서 꼬이게됨
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	public void loadStr() {
		FileReader fr = null;
		
		try {
			fr= new FileReader("strdata");
			//파일이 없을시에 자동으로 생성하지 않고 java.io.FileNotFoundException 오류가 뜸
			//읽어올때는 read() 메소드를 이용한다.
			int data = 0;
			StringBuffer sb = new StringBuffer();
			while((data=fr.read()) != -1) {
				sb.append((char)data);
				//System.out.println((char)data); // 한글자씩 출력해주는것
			}
			System.out.println(sb);
		}catch(IOException e) {	
			e.printStackTrace();
		}finally {
			try {
				if(fr!= null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	// 파일을 저장하고 읽는 메소드 구현하기 -> 문자열
	// 파일 저장 메소드 구현
	// 매개변수로 저장할 데이터와 파일명을 받는 메소드
	public void saveMsg(String data, String fileName) {
		FileWriter fw = null;
		
		try {
			// 스트림이 연결됨
			fw = new FileWriter(fileName,true);  // true -> 값이 누적됨
			fw.write(data);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {	
				if(fw!=null) fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	

	//파일읽기메소드 구현
	//매개변수로 파일명을 입력받아 파일에 있는 데이터를 가져와 출력하는 메소드
	public void loadMsg(String fileName) {
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName);
			int data = 0;
			StringBuilder sb = new StringBuilder();
			while((data=fr.read())!= -1) { // 읽은곳이 마지막부분까지
				sb.append((char)data);
			}
			System.out.println(sb);
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null)fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	

}

