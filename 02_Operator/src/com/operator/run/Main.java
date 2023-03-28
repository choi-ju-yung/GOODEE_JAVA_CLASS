package com.operator.run;

import com.operator.controller.OperatorController;    // 다른패키지안의 클래스 import함

// 프로젝트를 실행하는 기능을 하는 Main 클래스 -> main 메소드를 갖는다.
public class Main {
	public static void main(String args[]) {
		//new OperatorController().singleOp();  // 다른 클래스 안의 함수 호출
		//new OperatorController().calcuatorOp();
		//new OperatorController().calc();
		//new OperatorController().compareOp();
		//new OperatorController().testStr();
		//new OperatorController().check();
		//new OperatorController().logicOp();
		//new OperatorController().complexOp();
		//new OperatorController().calcGrade();
		//new OperatorController().inputMsg();
		new OperatorController().thirdOp();
	}
}
