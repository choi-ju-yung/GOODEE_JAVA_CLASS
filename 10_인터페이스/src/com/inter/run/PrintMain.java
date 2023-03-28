package com.inter.run;

import com.inter.common.PrinterDriver;
import com.inter.controller.PrinterController;
import com.inter.model.vo.Cannon;
import com.inter.model.vo.SamsungPrinter;

public class PrintMain {

	public static void main(String[] args) {
		
		//SamsungPrinter printer = new SamsungPrinter();
		//new PrinterController(printer).print();
		
//		new PrinterController(printer).print();
		
		PrinterDriver printer = new SamsungPrinter();
		
//		printer = new Cannon();
		new PrinterController(printer).print();
	}

}
