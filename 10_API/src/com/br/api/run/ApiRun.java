package com.br.api.run;

import com.br.api.controller.B_StringApiController;

public class ApiRun {

	public static void main(String[] args) {
	/*	A_MathApiController a = new A_MathApiController();
		a.mathMethodTest();
		*/
		
		B_StringApiController b = new B_StringApiController();
		b.StringMethodTest();
		
	}

}
