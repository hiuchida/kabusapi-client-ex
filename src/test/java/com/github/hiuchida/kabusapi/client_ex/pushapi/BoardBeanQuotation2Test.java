package com.github.hiuchida.kabusapi.client_ex.pushapi;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BoardBeanQuotation2Test {

	@Test
	public void toIndentedStringTest() {
		BoardBeanQuotation2 bbq2 = new BoardBeanQuotation2();
		String a1 = bbq2.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
