package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.UnderOverCode;
import com.github.hiuchida.kabusapi.enums.deliv.AfterHitOrderTypeDCode;

public class SendOrderDerivRequestExTest {

	@Test
	public void toIndentedStringTest() {
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeDCode afterHitOrderType = AfterHitOrderTypeDCode.指値;
		Double afterHitPrice = 12.1;

		SendOrderDerivRequestEx.ReverseLimitOrder sr = new SendOrderDerivRequestEx.ReverseLimitOrder(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		assertEquals(triggerPrice, sr.getTriggerPrice());
		assertEquals(underOver, sr.getUnderOver());
		assertEquals(afterHitOrderType, sr.getAfterHitOrderType());
		assertEquals(afterHitPrice, sr.getAfterHitPrice());

		sr.setTriggerPrice(null);
		sr.setUnderOver(null);
		sr.setAfterHitOrderType(null);
		sr.setAfterHitPrice(null);
		String a1 = sr.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
