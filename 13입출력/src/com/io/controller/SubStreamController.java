package com.io.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.model.vo.Person;

public class SubStreamController {
	// 보조스트림에 대해 알아보자
	// 기본스트림으로 처리하지 못하는 기능, 더 효율적으로 처리하기 위해 사용
	// 하나의 자바 클래스

	public void changeStream() {
		// 1. InputStreamReader / OutputStreamWriter
		
		//: byte 기반 스트림을 문자기반 스크림으로 변경
//		FileInputStream fis = null;
//		InputStreamReader isr = null;
		// try width resource 구문
		try(FileInputStream fis = new FileInputStream("test");
				InputStreamReader isr = new InputStreamReader(fis);) {
			//fis = new FileInputStream("end");
			//isr = new InputStreamReader(fis);
			
			int data = 0;
			while((data = fis.read())!=-1) {
				System.out.println((char)data);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
//		finally {
//			try {
//				if(fis!=null)fis.close();
//				if(isr!=null)isr.close();
//			}catch(IOException e) {
//				e.printStackTrace();
//			}
//		}

		
		
//InputStream inputStream = null;	
//InputStreamReader reader = null;
//		//HttpURLConnection 클래스를 이용해서
//		// web상의 원하는 페이지를 받아와서 처리할때 사용할 수 있음
//		try {
//			URL url = new URL("https://gdu.co.kr");
//			HttpURLConnection connect = 
//					(HttpURLConnection)url.openConnection();
//			inputStream = connect.getInputStream();
//			reader = new InputStreamReader(inputStream);
//			int data = 0;
//			StringBuffer sb = new StringBuffer();
//			while((data = reader.read()) != -1) {  
//				// 문자열이라고 판단되는것은 보조스트림을 연결해서 인식
////				System.out.println((char)data);
//				sb.append((char)data);
//			}
//			System.out.println(sb);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				if(inputStream != null)inputStream.close();
//				if(reader!=null)reader.close();
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}

		
		
	// BufferedInputStream / BufferedOutputStream
	// 입출력 속도를 향상 시켜주는 클래스
	public void bufferedSave() {
		try (FileOutputStream fos = new FileOutputStream("myfile");
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			String data = "오늘 너무너무 고마워요 눈ㅁ눌이 날뻔했어요";
			bos.write(data.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void bufferedLoad() {
		try (FileInputStream fis = new FileInputStream("myfile");
				BufferedInputStream bis = new BufferedInputStream(fis);
				InputStreamReader reader = new InputStreamReader(bis);) {
			int data = 0;
			while ((data = reader.read()) != -1) {
				System.out.println((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	
	
	// 자료형 기반으로 데이터를 저장하고 불러오기
	// DataInputStream  / DataOutpuStream
	// 이름, 나이, 성별, 키, 주소 를 저장하고 불러오고 싶다.

	public void savePerson(String name, int age, char gender, 
			double height, String address) {
		try(//FileWriter write = new FileWriter("person.bs")
			FileOutputStream fos = new FileOutputStream("person.bs");
				DataOutputStream dos = new DataOutputStream(fos); // 보조스트림으로 연결
				){
			//String data = name+","+age+","+gender+","+height+","+address;

			//write.write(data);
//			write.write(name);
//			write.write(age);
//			write.write(gender);
//			write.write(hegiht);
//			write.write(address);
			dos.writeUTF(name); //  UTF -> String
			dos.writeInt(age);   // Int -> int
			dos.writeChar(gender); // Char -> char
			dos.writeDouble(height); // Double -> double
			dos.writeUTF(address);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public void dataLoad() {
		try(//FileReader reader = new FileReader("person.bs")){
				FileInputStream fis = new FileInputStream("person.bs");
				DataInputStream dis = new DataInputStream(fis);){
			// 주의! 저장한 순서대로 불러와야함.   
			//현재 써있는 자료형 순서말고, String과 int 자리 바꾸면 오류가남
			String name = dis.readUTF();
			int age = dis.readInt();
			char gender = dis.readChar();
			double height = dis.readDouble();
			String address = dis.readUTF();
			
//			int data = 0;
//			StringBuffer sb = new StringBuffer();
//			while((data=reader.read())!=-1) {
//				sb.append((char)data);
//			}
//			System.out.println(sb);
//			String[] datas = new String(sb).split(",");
//			String name = datas[0];
//			int age = Integer.parseInt(datas[1]);
//			char gender = datas[2].charAt(0);
//			double height = Double.parseDouble(datas[3]);
//			String address = datas[4];
//			
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
			System.out.println(height);
			System.out.println(address);
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public void savePersons(Person[] persons) {
		// FileOutputStream 주 스트림
		// DataOutputStream 보조 스트림
		try(DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream("persons"))){
			for(Person p : persons) { // 객체안의 모든 값들을 파일로 적어줌
				if(p!=null) {
					dos.writeUTF(p.getName());
					dos.writeInt(p.getAge());
					dos.writeChar(p.getGender());
					dos.writeDouble(p.getHeight());
					dos.writeUTF(p.getAddress());
				}

			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}
	
	
	
	
	
	public Person[] loadPerson() {
		Person[] result = new Person[10];
   		try(DataInputStream dis =
				new DataInputStream(new FileInputStream("persons"))){
   			
   			for(int i=0; i<result.length; i++) {
   				String name = dis.readUTF();
   				int age = dis.readInt();
   				char gender = dis.readChar();
   				double height = dis.readDouble();
   				String address = dis.readUTF();
   				
   				Person p = new Person(name,age,gender,height,address);
   				result[i] = p;
   			}
   			
		}catch(EOFException e) {
			System.out.println("저장된 데이터를 모두 불러왔습니다.");
		}
   		catch(IOException e) {
			e.printStackTrace();
		}
   		return result;
	}
	
	
	
	// ObjectInputStream  /  ObjectOutputStream
	// 파일에 객체형식으로 저장하고 가져오는 방법
	// 객체기반으로 파일에 저장할 때 직렬화, 역직렬화를 해야한다.
	// 직렬화, 역직렬화는 jvm이 알아서 처리 -> Serializerable인 인터페이스를 구현
	
	
	public void objcetSave() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objfile"))){
			oos.writeObject(new Person("유병승",19,'남',180.5,"경기도 시흥시"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public Person objectLoad() {
		Person p = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objfile"))){
			
			p = (Person)ois.readObject();
		}catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return p;
	}
	
	
	
	
	// persons를 매개변수로 전달받고
	// persons.date에 저장하는 기능 구현 -> object 스트림이용
	
	
	public void savePersonbject(Person[] persons) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persons.dat"))){
	
		for(Person p : persons) {
			if(p!=null)oos.writeObject(p);
		}
	
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	// persons.date에 저장된 데이터를 불러와서 반환해주는 기능 구현
	//-> Objcet 스트림 이용
	
	public Person[] loadPersonObject() {
		Person[] result = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persons.dat"))){
			
		result = (Person[])ois.readObject();
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
	
	
}