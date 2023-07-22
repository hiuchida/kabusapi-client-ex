package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ClosePositionOrderCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.commons.UnderOverCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.AfterHitOrderTypeSCode;
import com.github.hiuchida.kabusapi.enums.stock.CashmarginStockCode;
import com.github.hiuchida.kabusapi.enums.stock.DelivTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.ExchangeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FrontOrderTypeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FundTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.MarginTradeTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.SecurityTypeSCode;
import com.github.hiuchida.kabusapi.enums.stock.TriggerSecCode;

import io.swagger.client.model.RequestSendOrder;

public class SendOrderRequestExTest {

	@Test
	public void toRequestSendOrderTest() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeSCode securityType = SecurityTypeSCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		AccountTypeCode accountType = AccountTypeCode.特定;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		
		SendOrderRequestEx o1 = new SendOrderRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setDelivType(delivType);
		o1.setAccountType(accountType);
		o1.setFrontOrderType(frontOrderType);
		
		RequestSendOrder a1 = o1.toRequestSendOrder();
		assertEquals(symbol, a1.getSymbol());
		assertNotNull(a1.getExchange());
		assertEquals(exchange.intValue(), (int) a1.getExchange());
		assertNotNull(a1.getSecurityType());
		assertEquals(securityType.intValue(), (int) a1.getSecurityType());
		assertEquals(side.toString(), a1.getSide());
		assertNotNull(a1.getCashMargin());
		assertEquals(cashMargin.intValue(), (int) a1.getCashMargin());
		assertNotNull(a1.getDelivType());
		assertEquals(delivType.intValue(), (int) a1.getDelivType());
		assertNotNull(a1.getAccountType());
		assertEquals(accountType.intValue(), (int) a1.getAccountType());
		assertNotNull(a1.getFrontOrderType());
		assertEquals(frontOrderType.intValue(), (int) a1.getFrontOrderType());
	}

	@Test
	public void toRequestSendOrderTest2() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeSCode securityType = SecurityTypeSCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremiumUnit = 1.2;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		FundTypeCode fundType = FundTypeCode.信用代用;
		AccountTypeCode accountType = AccountTypeCode.特定;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		TriggerSecCode triggerSec = TriggerSecCode.発注銘柄;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeSCode afterHitOrderType = AfterHitOrderTypeSCode.指値;
		Double afterHitPrice = 12.1;
		
		SendOrderRequestEx o1 = new SendOrderRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setMarginTradeType(marginTradeType);
		o1.setMarginPremiumUnit(marginPremiumUnit);
		o1.setDelivType(delivType);
		o1.setFundType(fundType);
		o1.setAccountType(accountType);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		RequestSendOrder a1 = o1.toRequestSendOrder();
		assertEquals(symbol, a1.getSymbol());
		assertNotNull(a1.getExchange());
		assertEquals(exchange.intValue(), (int) a1.getExchange());
		assertNotNull(a1.getSecurityType());
		assertEquals(securityType.intValue(), (int) a1.getSecurityType());
		assertEquals(side.toString(), a1.getSide());
		assertNotNull(a1.getCashMargin());
		assertEquals(cashMargin.intValue(), (int) a1.getCashMargin());
		assertNotNull(a1.getMarginTradeType());
		assertEquals(marginTradeType.intValue(), (int) a1.getMarginTradeType());
		assertEquals(marginPremiumUnit, a1.getMarginPremiumUnit());
		assertNotNull(a1.getDelivType());
		assertEquals(delivType.intValue(), (int) a1.getDelivType());
		assertEquals(fundType.toString(), a1.getFundType());
		assertNotNull(a1.getAccountType());
		assertEquals(accountType.intValue(), (int) a1.getAccountType());
		assertEquals(qty, a1.getQty());
		assertNotNull(a1.getClosePositionOrder());
		assertEquals(closePositionOrder.intValue(), (int) a1.getClosePositionOrder());
		assertEquals(2, a1.getClosePositions().size());
		assertEquals(holdID1, a1.getClosePositions().get(0).getHoldID());
		assertEquals(qty1, a1.getClosePositions().get(0).getQty());
		assertEquals(holdID2, a1.getClosePositions().get(1).getHoldID());
		assertEquals(qty2, a1.getClosePositions().get(1).getQty());
		assertNotNull(a1.getFrontOrderType());
		assertEquals(frontOrderType.intValue(), (int) a1.getFrontOrderType());
		assertEquals(price, a1.getPrice());
		assertEquals(expireDay, a1.getExpireDay());
		assertNotNull(a1.getReverseLimitOrder().getTriggerSec());
		assertEquals(triggerSec.intValue(), (int) a1.getReverseLimitOrder().getTriggerSec());
		assertEquals(triggerPrice, a1.getReverseLimitOrder().getTriggerPrice());
		assertNotNull(a1.getReverseLimitOrder().getUnderOver());
		assertEquals(underOver.intValue(), (int) a1.getReverseLimitOrder().getUnderOver());
		assertNotNull(a1.getReverseLimitOrder().getAfterHitOrderType());
		assertEquals(afterHitOrderType.intValue(), (int) a1.getReverseLimitOrder().getAfterHitOrderType());
		assertEquals(afterHitPrice, a1.getReverseLimitOrder().getAfterHitPrice());
	}

	@Test
	public void toStringTest() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeSCode securityType = SecurityTypeSCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		AccountTypeCode accountType = AccountTypeCode.特定;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		
		SendOrderRequestEx o1 = new SendOrderRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setDelivType(delivType);
		o1.setAccountType(accountType);
		o1.setFrontOrderType(frontOrderType);
		
		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

	@Test
	public void toStringTest2() {
		String symbol = "symbol";
		ExchangeSCode exchange = ExchangeSCode.東証;
		SecurityTypeSCode securityType = SecurityTypeSCode.株式;
		SideCode side = SideCode.買;
		CashmarginStockCode cashMargin = CashmarginStockCode.新規;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremiumUnit = 1.2;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		FundTypeCode fundType = FundTypeCode.信用代用;
		AccountTypeCode accountType = AccountTypeCode.特定;
		Integer qty = 12;
		ClosePositionOrderCode closePositionOrder = ClosePositionOrderCode.損益_低い順_日付_古い順;
		String holdID1 = "holdID1";
		Integer qty1 = 1;
		String holdID2 = "holdID2";
		Integer qty2 = 2;
		FrontOrderTypeSCode frontOrderType = FrontOrderTypeSCode.指値;
		Double price = 12.3;
		Integer expireDay = 123;
		TriggerSecCode triggerSec = TriggerSecCode.発注銘柄;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeSCode afterHitOrderType = AfterHitOrderTypeSCode.指値;
		Double afterHitPrice = 12.1;
		
		SendOrderRequestEx o1 = new SendOrderRequestEx();
		o1.setSymbol(symbol);
		o1.setExchange(exchange);
		o1.setSecurityType(securityType);
		o1.setSide(side);
		o1.setCashMargin(cashMargin);
		o1.setMarginTradeType(marginTradeType);
		o1.setMarginPremiumUnit(marginPremiumUnit);
		o1.setDelivType(delivType);
		o1.setFundType(fundType);
		o1.setAccountType(accountType);
		o1.setQty(qty);
		o1.setClosePositionOrder(closePositionOrder);
		o1.addClosePosition(holdID1, qty1);
		o1.addClosePosition(holdID2, qty2);
		o1.setFrontOrderType(frontOrderType);
		o1.setPrice(price);
		o1.setExpireDay(expireDay);
		o1.setReverseLimitOrder(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		
		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

	@Test
	public void toIndentedStringTest() {
		TriggerSecCode triggerSec = TriggerSecCode.発注銘柄;
		Double triggerPrice = 12.3;
		UnderOverCode underOver = UnderOverCode.以下;
		AfterHitOrderTypeSCode afterHitOrderType = AfterHitOrderTypeSCode.指値;
		Double afterHitPrice = 12.1;

		SendOrderRequestEx.ReverseLimitOrder sr = new SendOrderRequestEx.ReverseLimitOrder(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		assertEquals(triggerSec, sr.getTriggerSec());
		assertEquals(triggerPrice, sr.getTriggerPrice());
		assertEquals(underOver, sr.getUnderOver());
		assertEquals(afterHitOrderType, sr.getAfterHitOrderType());
		assertEquals(afterHitPrice, sr.getAfterHitPrice());

		sr.setTriggerSec(null);
		sr.setTriggerPrice(null);
		sr.setUnderOver(null);
		sr.setAfterHitOrderType(null);
		sr.setAfterHitPrice(null);
		String a2 = sr.toString();
		assertNotNull(a2);
//		System.out.println(a2);

		SendOrderRequestEx o1 = new SendOrderRequestEx();
		o1.setClosePositions(null);
		o1.reverseLimitOrder(null);
		o1.setReverseLimitOrder(null);
		assertNull(o1.getSymbol());
		assertNull(o1.getExchange());
		assertNull(o1.getSecurityType());
		assertNull(o1.getSide());
		assertNull(o1.getCashMargin());
		assertNull(o1.getMarginTradeType());
		assertNull(o1.getMarginPremiumUnit());
		assertNull(o1.getDelivType());
		assertNull(o1.getFundType());
		assertNull(o1.getAccountType());
		assertNull(o1.getQty());
		assertNull(o1.getClosePositionOrder());
		assertNull(o1.getClosePositions());
		assertNull(o1.getFrontOrderType());
		assertNull(o1.getPrice());
		assertNull(o1.getExpireDay());
		assertNull(o1.getReverseLimitOrder());

		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
