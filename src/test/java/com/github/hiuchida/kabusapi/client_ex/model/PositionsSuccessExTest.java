package com.github.hiuchida.kabusapi.client_ex.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.SecurityTypeCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.MarginTradeTypeCode;

import io.swagger.client.model.PositionsSuccess;

public class PositionsSuccessExTest {

	@Test
	public void newPositionsSuccessWrapperTest() {
		String executionID = "executionID";
		AccountTypeCode accountType = AccountTypeCode.特定;
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		SecurityTypeCode securityType = SecurityTypeCode.現物;
		Integer executionDay = 20221201;
		Double price = 123.4;
		Double leavesQty = 12.0;
		Double holdQty = 1.0;
		SideCode side = SideCode.売;
		Double expenses = 12.1;
		Double commission = 12.2;
		Double commissionTax = 12.3;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double currentPrice = 123.5;
		Double valuation = 123.6;
		Double profitLoss = 123.7;
		Double profitLossRate = 12.4;

		PositionsSuccess ps = new PositionsSuccess();
		ps.setExecutionID(executionID);
		ps.setAccountType(accountType.intValue());
		ps.setSymbol(symbol);
		ps.setSymbolName(symbolName);
		ps.setExchange(exchange.intValue());
		ps.setExchangeName(exchangeName);
		ps.setSecurityType(securityType.intValue());
		ps.setExecutionDay(executionDay);
		ps.setPrice(price);
		ps.setLeavesQty(leavesQty);
		ps.setHoldQty(holdQty);
		ps.setSide(side.toString());
		ps.setExpenses(expenses);
		ps.setCommission(commission);
		ps.setCommissionTax(commissionTax);
		ps.setExpireDay(expireDay);
		ps.setMarginTradeType(marginTradeType.intValue());
		ps.setCurrentPrice(currentPrice);
		ps.setValuation(valuation);
		ps.setProfitLoss(profitLoss);
		ps.setProfitLossRate(profitLossRate);

		PositionsSuccessEx a1 = new PositionsSuccessEx(ps);
		assertEquals(executionID, a1.getExecutionID());
		assertEquals(accountType, a1.getAccountType());
		assertEquals(symbol, a1.getSymbol());
		assertEquals(symbolName, a1.getSymbolName());
		assertEquals(exchange, a1.getExchange());
		assertEquals(exchangeName, a1.getExchangeName());
		assertEquals(securityType, a1.getSecurityType());
		assertEquals(executionDay, a1.getExecutionDay());
		assertEquals(price, a1.getPrice());
		assertEquals(leavesQty, a1.getLeavesQty());
		assertEquals(holdQty, a1.getHoldQty());
		assertEquals(side, a1.getSide());
		assertEquals(expenses, a1.getExpenses());
		assertEquals(commission, a1.getCommission());
		assertEquals(commissionTax, a1.getCommissionTax());
		assertEquals(expireDay, a1.getExpireDay());
		assertEquals(marginTradeType, a1.getMarginTradeType());
		assertEquals(currentPrice, a1.getCurrentPrice());
		assertEquals(valuation, a1.getValuation());
		assertEquals(profitLoss, a1.getProfitLoss());
		assertEquals(profitLossRate, a1.getProfitLossRate());
	}

	@Test
	public void toPositionsSuccessTest() {
		PositionsSuccess ps = new PositionsSuccess();
		PositionsSuccessEx o1 = new PositionsSuccessEx(ps);
		PositionsSuccess a1 = o1.toPositionsSuccess();
		assertEquals(ps, a1);
	}

	@Test
	public void toStringTest() {
		String executionID = "executionID";
		AccountTypeCode accountType = AccountTypeCode.特定;
		String symbol = "symbol";
		String symbolName = "symbolName";
		ExchangeCode exchange = ExchangeCode.東証;
		String exchangeName = "exchangeName";
		SecurityTypeCode securityType = SecurityTypeCode.現物;
		Integer executionDay = 20221201;
		Double price = 123.4;
		Double leavesQty = 12.0;
		Double holdQty = 1.0;
		SideCode side = SideCode.売;
		Double expenses = 12.1;
		Double commission = 12.2;
		Double commissionTax = 12.3;
		Integer expireDay = 20221230;
		MarginTradeTypeCode marginTradeType = MarginTradeTypeCode.制度信用;
		Double currentPrice = 123.5;
		Double valuation = 123.6;
		Double profitLoss = 123.7;
		Double profitLossRate = 12.4;

		PositionsSuccess ps = new PositionsSuccess();
		ps.setExecutionID(executionID);
		ps.setAccountType(accountType.intValue());
		ps.setSymbol(symbol);
		ps.setSymbolName(symbolName);
		ps.setExchange(exchange.intValue());
		ps.setExchangeName(exchangeName);
		ps.setSecurityType(securityType.intValue());
		ps.setExecutionDay(executionDay);
		ps.setPrice(price);
		ps.setLeavesQty(leavesQty);
		ps.setHoldQty(holdQty);
		ps.setSide(side.toString());
		ps.setExpenses(expenses);
		ps.setCommission(commission);
		ps.setCommissionTax(commissionTax);
		ps.setExpireDay(expireDay);
		ps.setMarginTradeType(marginTradeType.intValue());
		ps.setCurrentPrice(currentPrice);
		ps.setValuation(valuation);
		ps.setProfitLoss(profitLoss);
		ps.setProfitLossRate(profitLossRate);

		PositionsSuccessEx o1 = new PositionsSuccessEx(ps);

		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

	@Test
	public void toIndentedStringTest() {
		PositionsSuccess ps = new PositionsSuccess();

		PositionsSuccessEx o1 = new PositionsSuccessEx(ps);

		o1.setExecutionID(null);
		o1.setAccountType(null);
		o1.setSymbol(null);
		o1.setSymbolName(null);
		o1.setExchange(null);
		o1.setExchangeName(null);
		o1.setSecurityType(null);
		o1.setExecutionDay(null);
		o1.setPrice(null);
		o1.setLeavesQty(null);
		o1.setHoldQty(null);
		o1.setSide(null);
		o1.setExpenses(null);
		o1.setCommission(null);
		o1.setCommissionTax(null);
		o1.setExpireDay(null);
		o1.setMarginTradeType(null);
		o1.setCurrentPrice(null);
		o1.setValuation(null);
		o1.setProfitLoss(null);
		o1.setProfitLossRate(null);
		String a1 = o1.toString();
		assertNotNull(a1);
//		System.out.println(a1);
	}

}
