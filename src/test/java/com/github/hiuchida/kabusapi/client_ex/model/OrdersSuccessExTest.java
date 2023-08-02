package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.deliv.TimeInForceCode;
import com.github.hiuchida.kabusapi.enums.orders.CashmarginOCode;
import com.github.hiuchida.kabusapi.enums.orders.ExchangeOCode;
import com.github.hiuchida.kabusapi.enums.orders.OrdTypeOCode;
import com.github.hiuchida.kabusapi.enums.orders.RecTypeOCode;
import com.github.hiuchida.kabusapi.enums.orders.StateOCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.DelivTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.MarginTradeTypeCode;

import io.swagger.client.model.OrdersSuccess;
import io.swagger.client.model.OrdersSuccessDetails;

public class OrdersSuccessExTest {

	@Test
	public void newOrdersSuccessWrapperTest() {
		String ID = "ID";
		StateOCode state = StateOCode.待機;
		StateOCode orderState = StateOCode.処理済;
		OrdTypeOCode ordType = OrdTypeOCode.ザラバ;
		String recvTime = "2022-04-04T18:00:51.763683+09:00";
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeOCode exchange = ExchangeOCode.東証;
		String exchangeName = "exchangeName";
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		Double price = 123.4;
		Double orderQty = 12.0;
		Double cumQty = 1.0;
		SideCode side = SideCode.売;
		CashmarginOCode cashMargin = CashmarginOCode.新規;
		AccountTypeCode accountType = AccountTypeCode.特定;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremium = 1.2;

		Integer seqNum = 123;
		RecTypeOCode recType = RecTypeOCode.受付;
		String exchangeID = "exchangeID";
		StateOCode state2 = StateOCode.終了;
		String transactTime = "2022-04-04T18:00:51.763683+09:00";
		Double qty = 13.0;
		String executionID = "executionID";
		Integer delivDay = 20221210;
		Double commission = 12.3;
		Double commissionTax = 12.4;
		OffsetDateTime executionDay = OffsetDateTime.now();

		OrdersSuccess os = new OrdersSuccess();
		os.setID(ID);
		os.setState(state.intValue());
		os.setOrderState(orderState.intValue());
		os.setOrdType(ordType.intValue());
		os.setRecvTime(recvTime);
		os.setSymbol(symbol);
		os.setSymbolName(symbolName);
		os.setExchange(exchange.intValue());
		os.setExchangeName(exchangeName);
		os.setTimeInForce(timeInForce.intValue());
		os.setPrice(price);
		os.setOrderQty(orderQty);
		os.setCumQty(cumQty);
		os.setSide(side.toString());
		os.setCashMargin(cashMargin.intValue());
		os.setAccountType(accountType.intValue());
		os.setDelivType(delivType.intValue());
		os.setExpireDay(expireDay);
		os.setMarginTradeType(marginTradeType.intValue());
		os.setMarginPremium(marginPremium);

		List<OrdersSuccessDetails> details = new ArrayList<>();
		OrdersSuccessDetails osd = new OrdersSuccessDetails();
		osd.setSeqNum(seqNum);
		osd.setID(ID);
		osd.setRecType(recType.intValue());
		osd.setExchangeID(exchangeID);
		osd.setState(state2.intValue());
		osd.setTransactTime(transactTime);
		osd.setOrdType(ordType.intValue());
		osd.setPrice(price);
		osd.setQty(qty);
		osd.setExecutionID(executionID);
		osd.setExecutionDay(executionDay);
		osd.setDelivDay(delivDay);
		osd.setCommission(commission);
		osd.setCommissionTax(commissionTax);
		details.add(osd);
		os.setDetails(details);

		OrdersSuccessEx a1 = new OrdersSuccessEx(os);
		assertEquals(ID, a1.getID());
		assertEquals(state, a1.getState());
		assertEquals(orderState, a1.getOrderState());
		assertEquals(ordType, a1.getOrdType());
		assertEquals(recvTime, a1.getRecvTime());
		assertEquals(symbol, a1.getSymbol());
		assertEquals(symbolName, a1.getSymbolName());
		assertEquals(exchange, a1.getExchange());
		assertEquals(exchangeName, a1.getExchangeName());
		assertEquals(timeInForce, a1.getTimeInForce());
		assertEquals(price, a1.getPrice());
		assertEquals(orderQty, a1.getOrderQty());
		assertEquals(cumQty, a1.getCumQty());
		assertEquals(side, a1.getSide());
		assertEquals(cashMargin, a1.getCashMargin());
		assertEquals(accountType, a1.getAccountType());
		assertEquals(delivType, a1.getDelivType());
		assertEquals(expireDay, a1.getExpireDay());
		assertEquals(marginTradeType, a1.getMarginTradeType());
		assertEquals(marginPremium, a1.getMarginPremium());

		assertEquals(1, a1.getDetails().size());
		OrdersSuccessEx.Detail a2 = a1.getDetails().get(0);
		assertEquals(seqNum, a2.getSeqNum());
		assertEquals(ID, a2.getID());
		assertEquals(recType, a2.getRecType());
		assertEquals(exchangeID, a2.getExchangeID());
		assertEquals(state2, a2.getState());
		assertEquals(transactTime, a2.getTransactTime());
		assertEquals(ordType, a2.getOrdType());
		assertEquals(price, a2.getPrice());
		assertEquals(qty, a2.getQty());
		assertEquals(executionID, a2.getExecutionID());
		assertEquals(executionDay, a2.getExecutionDay());
		assertEquals(delivDay, a2.getDelivDay());
		assertEquals(commission, a2.getCommission());
		assertEquals(commissionTax, a2.getCommissionTax());
	}

	@Test
	public void toOrdersSuccessTest() {
		OrdersSuccess os = new OrdersSuccess();
		OrdersSuccessEx o1 = new OrdersSuccessEx(os);
		OrdersSuccess a1 = o1.toOrdersSuccess();
		assertEquals(os, a1);
	}

	@Test
	public void toStringTest() {
		String ID = "ID";
		StateOCode state = StateOCode.待機;
		StateOCode orderState = StateOCode.処理済;
		OrdTypeOCode ordType = OrdTypeOCode.ザラバ;
		String recvTime = "2022-04-04T18:00:51.763683+09:00";
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeOCode exchange = ExchangeOCode.東証;
		String exchangeName = "exchangeName";
		TimeInForceCode timeInForce = TimeInForceCode.FAS;
		Double price = 123.4;
		Double orderQty = 12.0;
		Double cumQty = 1.0;
		SideCode side = SideCode.売;
		CashmarginOCode cashMargin = CashmarginOCode.新規;
		AccountTypeCode accountType = AccountTypeCode.特定;
		DelivTypeCode delivType = DelivTypeCode.お預り金;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double marginPremium = 1.2;

		Integer seqNum = 123;
		RecTypeOCode recType = RecTypeOCode.受付;
		String exchangeID = "exchangeID";
		StateOCode state2 = StateOCode.終了;
		String transactTime = "2022-04-04T18:00:51.763683+09:00";
		Double qty = 13.0;
		String executionID = "executionID";
		Integer delivDay = 20221210;
		Double commission = 12.3;
		Double commissionTax = 12.4;
		OffsetDateTime executionDay = OffsetDateTime.now();

		OrdersSuccess os = new OrdersSuccess();
		os.setID(ID);
		os.setState(state.intValue());
		os.setOrderState(orderState.intValue());
		os.setOrdType(ordType.intValue());
		os.setRecvTime(recvTime);
		os.setSymbol(symbol);
		os.setSymbolName(symbolName);
		os.setExchange(exchange.intValue());
		os.setExchangeName(exchangeName);
		os.setTimeInForce(timeInForce.intValue());
		os.setPrice(price);
		os.setOrderQty(orderQty);
		os.setCumQty(cumQty);
		os.setSide(side.toString());
		os.setCashMargin(cashMargin.intValue());
		os.setAccountType(accountType.intValue());
		os.setDelivType(delivType.intValue());
		os.setExpireDay(expireDay);
		os.setMarginTradeType(marginTradeType.intValue());
		os.setMarginPremium(marginPremium);

		List<OrdersSuccessDetails> details = new ArrayList<>();
		OrdersSuccessDetails osd = new OrdersSuccessDetails();
		osd.setSeqNum(seqNum);
		osd.setID(ID);
		osd.setRecType(recType.intValue());
		osd.setExchangeID(exchangeID);
		osd.setState(state2.intValue());
		osd.setTransactTime(transactTime);
		osd.setOrdType(ordType.intValue());
		osd.setPrice(price);
		osd.setQty(qty);
		osd.setExecutionID(executionID);
		osd.setExecutionDay(executionDay);
		osd.setDelivDay(delivDay);
		osd.setCommission(commission);
		osd.setCommissionTax(commissionTax);
		details.add(osd);
		os.setDetails(details);

		OrdersSuccessEx o1 = new OrdersSuccessEx(os);

		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

	@Test
	public void toIndentedStringTest() {
		OrdersSuccess os = new OrdersSuccess();

		OrdersSuccessDetails osd = new OrdersSuccessDetails();

		List<OrdersSuccessEx.Detail> details = new ArrayList<>();
		OrdersSuccessEx.Detail d1 = new OrdersSuccessEx.Detail(osd);

		d1.setSeqNum(null);
		d1.setID(null);
		d1.setRecType(null);
		d1.setExchangeID(null);
		d1.setState(null);
		d1.setTransactTime(null);
		d1.setOrdType(null);
		d1.setPrice(null);
		d1.setQty(null);
		d1.setExecutionID(null);
		d1.setExecutionDay(null);
		d1.setDelivDay(null);
		d1.setCommission(null);
		d1.setCommissionTax(null);
		String a2 = d1.toString();
		assertNotNull(a2);
//		System.out.println(a2);
		details.add(d1);

		OrdersSuccessEx o1 = new OrdersSuccessEx(os);

		o1.setID(null);
		o1.setState(null);
		o1.setOrderState(null);
		o1.setOrdType(null);
		o1.setRecvTime(null);
		o1.setSymbol(null);
		o1.setSymbolName(null);
		o1.setExchange(null);
		o1.setExchangeName(null);
		o1.setTimeInForce(null);
		o1.setPrice(null);
		o1.setOrderQty(null);
		o1.setCumQty(null);
		o1.setSide(null);
		o1.setCashMargin(null);
		o1.setAccountType(null);
		o1.setDelivType(null);
		o1.setExpireDay(null);
		o1.setMarginTradeType(null);
		o1.setMarginPremium(null);
		o1.setDetails(details);
		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
