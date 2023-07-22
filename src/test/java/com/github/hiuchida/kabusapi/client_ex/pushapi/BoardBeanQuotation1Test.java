package com.github.hiuchida.kabusapi.client_ex.pushapi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BoardBeanQuotation1Test {

	@Test
	public void toIndentedStringTest() {
		BoardBeanQuotation1 bbq1 = new BoardBeanQuotation1();
		String a1 = bbq1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
