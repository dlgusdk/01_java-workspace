package com.br.api.run;

import com.br.api.controller.B_StringApiController;
import com.br.api.controller.C_WrapperApiController;
import com.br.api.controller.D_DateApiController;

public class ApiRun {

	public static void main(String[] args) {
	/*	A_MathApiController a = new A_MathApiController();
		a.mathMethodTest();
		*/
		
		//B_StringApiController b = new B_StringApiController();
		//b.stringTokenizerTest();
		
		//C_WrapperApiController a = new C_WrapperApiController();
		D_DateApiController a = new D_DateApiController();
		a.dateToString();
		
		
	}

}
