package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class SendOrderCommonRequestExTest {

	@Test
	public void toIndentedStringTest() {
		String holdID1 = "holdID1";
		Integer qty1 = 1;

		SendOrderCommonRequestEx.ClosePosition cp = new SendOrderCommonRequestEx.ClosePosition(holdID1, qty1);
		assertEquals(holdID1, cp.getHoldID());
		assertEquals(qty1, cp.getQty());

		cp.setHoldID(null);
		cp.setQty(null);
		String a1 = cp.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
