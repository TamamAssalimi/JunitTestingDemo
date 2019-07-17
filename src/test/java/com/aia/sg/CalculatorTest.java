/**
 * 
 */
package com.aia.sg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

/**
 * @author: SMISTC4
 * @Date : Jul 16, 2019
 * @Email : Tamam-B.Salimi@aia.com
 */
public class CalculatorTest {

	Calculator calculator = null;

	@Mock
	CalculatorInterface calculatorInterface;
	
	@Rule
	public MockitoRule rule = MockitoJUnit.rule();

	@Before
	public void load() {
		calculator = new Calculator(calculatorInterface);
	}

	@Test
	public void addTest() {
		when(calculatorInterface.addInterface(1, 5)).thenReturn(6);
		assertEquals(6, calculator.add(1, 5));
		verify(calculatorInterface).addInterface(1, 5);
	}
}
