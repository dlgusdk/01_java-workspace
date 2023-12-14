package com.br.run;

import com.br.operator.A_LogicalNegation; //import com.br.operator.*;
import com.br.operator.B_InDecrease;
import com.br.operator.C_Arithmetic;
import com.br.operator.D_Comparison;
import com.br.operator.E_Logical;
import com.br.operator.F_Compound;
import com.br.operator.G_Triple;

public class OperatorRun {
	public static void main(String[] args) {
		
		A_LogicalNegation a = new A_LogicalNegation();
		//a.test1();
		
		B_InDecrease b = new B_InDecrease();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
		
		C_Arithmetic c = new C_Arithmetic();
		//c.method1();
		//c.method2();
		
		D_Comparison d = new D_Comparison();
		//d.mrthod1();
		//d.method2();
		
		E_Logical e = new E_Logical();
		//e.mehod1();
		//e.mehod2();
		//e.mehod3();
		//e.method4();
		//e.method5();
		//e.method6();
		
		F_Compound f = new F_Compound();
		//f.method1();
		
		G_Triple g = new G_Triple();
		//g.method1();
		//g.method2();
		//g.method3();
		//g.method4();
		//g.method5();
		g.method6();

	}
}
