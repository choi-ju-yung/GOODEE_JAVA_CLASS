package com.generic.model.vo;

public class GenericBasic<T,E> {	
	// 설계할때 타입을 정하지 않았지만, 생성할 때 타입이 결정한다 할 때 T로 씀
	private T data; //  T -> 기본자료형 타입을 쓸 때 많이 쓰임
	private E element;   // E-> 객체 관련된 클래스 타입을 지정할 때 많이 쓰임
	
	public GenericBasic() {
		// TODO Auto-generated constructor stub
	}

	public GenericBasic(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
}
