package com.github.hiuchida.kabusapi.client_ex.model;

import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.SecurityTypeCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.MarginTradeTypeCode;

import io.swagger.client.model.PositionsSuccess;

public class PositionsSuccessEx {

	private PositionsSuccess response = null;

	private String executionID = null;

	private AccountTypeCode accountType = null;

	private String symbol = null;

	private String symbolName = null;

	private ExchangeCode exchange = null;

	private String exchangeName = null;

	private SecurityTypeCode securityType = null;

	private Integer executionDay = null;

	private Double price = null;

	private Double leavesQty = null;

	private Double holdQty = null;

	private SideCode side = null;

	private Double expenses = null;

	private Double commission = null;

	private Double commissionTax = null;

	private Integer expireDay = null;

	private MarginTradeTypeCode marginTradeType = null;

	private Double currentPrice = null;

	private Double valuation = null;

	private Double profitLoss = null;

	private Double profitLossRate = null;

	public PositionsSuccessEx(PositionsSuccess response) {
		this.response = response;
		this.executionID = response.getExecutionID();
		this.accountType = AccountTypeCode.valueOf(response.getAccountType());
		this.symbol = response.getSymbol();
		this.symbolName = response.getSymbolName();
		this.exchange = ExchangeCode.valueOf(response.getExchange());
		this.exchangeName = response.getExchangeName();
		this.securityType = SecurityTypeCode.valueOf(response.getSecurityType());
		this.executionDay = response.getExecutionDay();
		this.price = response.getPrice();
		this.leavesQty = response.getLeavesQty();
		this.holdQty = response.getHoldQty();
		this.side = SideCode.valueOfCode(response.getSide());
		this.expenses = response.getExpenses();
		this.commission = response.getCommission();
		this.commissionTax = response.getCommissionTax();
		this.expireDay = response.getExpireDay();
		this.marginTradeType = MarginTradeTypeCode.valueOf(response.getMarginTradeType());
		this.currentPrice = response.getCurrentPrice();
		this.valuation = response.getValuation();
		this.profitLoss = response.getProfitLoss();
		this.profitLossRate = response.getProfitLossRate();
	}

	public String getExecutionID() {
		return executionID;
	}

	public void setExecutionID(String executionID) {
		this.executionID = executionID;
	}

	public AccountTypeCode getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeCode accountType) {
		this.accountType = accountType;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbolName() {
		return symbolName;
	}

	public void setSymbolName(String symbolName) {
		this.symbolName = symbolName;
	}

	public ExchangeCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeCode exchange) {
		this.exchange = exchange;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public SecurityTypeCode getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityTypeCode securityType) {
		this.securityType = securityType;
	}

	public Integer getExecutionDay() {
		return executionDay;
	}

	public void setExecutionDay(Integer executionDay) {
		this.executionDay = executionDay;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getLeavesQty() {
		return leavesQty;
	}

	public void setLeavesQty(Double leavesQty) {
		this.leavesQty = leavesQty;
	}

	public Double getHoldQty() {
		return holdQty;
	}

	public void setHoldQty(Double holdQty) {
		this.holdQty = holdQty;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getCommissionTax() {
		return commissionTax;
	}

	public void setCommissionTax(Double commissionTax) {
		this.commissionTax = commissionTax;
	}

	public Integer getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(Integer expireDay) {
		this.expireDay = expireDay;
	}

	public MarginTradeTypeCode getMarginTradeType() {
		return marginTradeType;
	}

	public void setMarginTradeType(MarginTradeTypeCode marginTradeType) {
		this.marginTradeType = marginTradeType;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public Double getValuation() {
		return valuation;
	}

	public void setValuation(Double valuation) {
		this.valuation = valuation;
	}

	public Double getProfitLoss() {
		return profitLoss;
	}

	public void setProfitLoss(Double profitLoss) {
		this.profitLoss = profitLoss;
	}

	public Double getProfitLossRate() {
		return profitLossRate;
	}

	public void setProfitLossRate(Double profitLossRate) {
		this.profitLossRate = profitLossRate;
	}

	public PositionsSuccess toPositionsSuccess() {
		return response;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PositionsSuccessEx {\n");

		sb.append("    executionID: ").append(toIndentedString(executionID)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
		sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
		sb.append("    executionDay: ").append(toIndentedString(executionDay)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    leavesQty: ").append(toIndentedString(leavesQty)).append("\n");
		sb.append("    holdQty: ").append(toIndentedString(holdQty)).append("\n");
		sb.append("    side: ").append(toIndentedString(side)).append("\n");
		sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
		sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
		sb.append("    commissionTax: ").append(toIndentedString(commissionTax)).append("\n");
		sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
		sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
		sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
		sb.append("    valuation: ").append(toIndentedString(valuation)).append("\n");
		sb.append("    profitLoss: ").append(toIndentedString(profitLoss)).append("\n");
		sb.append("    profitLossRate: ").append(toIndentedString(profitLossRate)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
