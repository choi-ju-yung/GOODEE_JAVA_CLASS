package com.inter.controller;

import com.inter.common.PrinterDriver;
import com.inter.model.vo.LGPrinter;

public class PrinterController {
	
	//private SamsungPrinter printer;
	private PrinterDriver printer;
	
	public PrinterController(PrinterDriver printer) {
		super();
		this.printer = printer;
	}
	
	
	
	public void print() {
		this.printer.print();
	}

}
