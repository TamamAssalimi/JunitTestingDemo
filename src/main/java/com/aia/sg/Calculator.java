/**
 * 
 */
package com.aia.sg;

/**
 * @author: SMISTC4
 * @Date : Jul 16, 2019
 * @Email : Tamam-B.Salimi@aia.com
 */
public class Calculator {
	
	CalculatorInterface calculatorInterface;
	
	public Calculator(CalculatorInterface calculatorInterface){
		this.calculatorInterface = calculatorInterface;
	}
	
	public int add(int i , int j) {
		return calculatorInterface.addInterface(i,j)*i;
	}

}
