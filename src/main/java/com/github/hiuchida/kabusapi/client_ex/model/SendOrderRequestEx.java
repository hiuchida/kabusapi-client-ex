package com.github.hiuchida.kabusapi.client_ex.model;

import java.util.ArrayList;
import java.util.List;

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

import io.swagger.client.model.Positions;
import io.swagger.client.model.RequestSendOrder;
import io.swagger.client.model.RequestSendOrderReverseLimitOrder;

public class SendOrderRequestEx extends SendOrderCommonRequestEx {

	public static class ReverseLimitOrder {
		private TriggerSecCode triggerSec = null;

		private Double triggerPrice = null;

		private UnderOverCode underOver = null;

		private AfterHitOrderTypeSCode afterHitOrderType = null;

		private Double afterHitPrice = null;

		public ReverseLimitOrder(TriggerSecCode triggerSec, Double triggerPrice, UnderOverCode underOver, AfterHitOrderTypeSCode afterHitOrderType, Double afterHitPrice) {
			this.triggerSec = triggerSec;
			this.triggerPrice = triggerPrice;
			this.underOver = underOver;
			this.afterHitOrderType = afterHitOrderType;
			this.afterHitPrice = afterHitPrice;
		}

		public TriggerSecCode getTriggerSec() {
			return triggerSec;
		}

		public void setTriggerSec(TriggerSecCode triggerSec) {
			this.triggerSec = triggerSec;
		}

		public Double getTriggerPrice() {
			return triggerPrice;
		}

		public void setTriggerPrice(Double triggerPrice) {
			this.triggerPrice = triggerPrice;
		}

		public UnderOverCode getUnderOver() {
			return underOver;
		}

		public void setUnderOver(UnderOverCode underOver) {
			this.underOver = underOver;
		}

		public AfterHitOrderTypeSCode getAfterHitOrderType() {
			return afterHitOrderType;
		}

		public void setAfterHitOrderType(AfterHitOrderTypeSCode afterHitOrderType) {
			this.afterHitOrderType = afterHitOrderType;
		}

		public Double getAfterHitPrice() {
			return afterHitPrice;
		}

		public void setAfterHitPrice(Double afterHitPrice) {
			this.afterHitPrice = afterHitPrice;
		}

		public RequestSendOrderReverseLimitOrder toRequestSendOrderReverseLimitOrder() {
			RequestSendOrderReverseLimitOrder rlo = new RequestSendOrderReverseLimitOrder();
			rlo.setTriggerSec(triggerSec.intValue());
			rlo.setTriggerPrice(triggerPrice);
			rlo.setUnderOver(underOver.intValue());
			rlo.setAfterHitOrderType(afterHitOrderType.intValue());
			rlo.setAfterHitPrice(afterHitPrice);
			return rlo;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("class ReverseLimitOrder {\n");
			
			sb.append("    triggerSec: ").append(toIndentedString(triggerSec)).append("\n");
			sb.append("    triggerPrice: ").append(toIndentedString(triggerPrice)).append("\n");
			sb.append("    underOver: ").append(toIndentedString(underOver)).append("\n");
			sb.append("    afterHitOrderType: ").append(toIndentedString(afterHitOrderType)).append("\n");
			sb.append("    afterHitPrice: ").append(toIndentedString(afterHitPrice)).append("\n");
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

//	  private String password = null;

	private String symbol = null;

	private ExchangeSCode exchange = null;

	private SecurityTypeSCode securityType = null;

	private SideCode side = null;

	private CashmarginStockCode cashMargin = null;

	private MarginTradeTypeCode marginTradeType = null;

	private Double marginPremiumUnit = null;

	private DelivTypeCode delivType = null;

	private FundTypeCode fundType = null;

	private AccountTypeCode accountType = null;

	private Integer qty = null;

	private ClosePositionOrderCode closePositionOrder = null;

	private List<ClosePosition> closePositions = null;

	private FrontOrderTypeSCode frontOrderType = null;

	private Double price = null;

	private Integer expireDay = null;

	private ReverseLimitOrder reverseLimitOrder = null;

	public SendOrderRequestEx symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public SendOrderRequestEx exchange(ExchangeSCode exchange) {
		this.exchange = exchange;
		return this;
	}

	public ExchangeSCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeSCode exchange) {
		this.exchange = exchange;
	}

	public SendOrderRequestEx securityType(SecurityTypeSCode securityType) {
		this.securityType = securityType;
		return this;
	}

	public SecurityTypeSCode getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityTypeSCode securityType) {
		this.securityType = securityType;
	}

	public SendOrderRequestEx side(SideCode side) {
		this.side = side;
		return this;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public SendOrderRequestEx cashMargin(CashmarginStockCode cashMargin) {
		this.cashMargin = cashMargin;
		return this;
	}

	public CashmarginStockCode getCashMargin() {
		return cashMargin;
	}

	public void setCashMargin(CashmarginStockCode cashMargin) {
		this.cashMargin = cashMargin;
	}

	public SendOrderRequestEx marginTradeType(MarginTradeTypeCode marginTradeType) {
		this.marginTradeType = marginTradeType;
		return this;
	}

	public MarginTradeTypeCode getMarginTradeType() {
		return marginTradeType;
	}

	public void setMarginTradeType(MarginTradeTypeCode marginTradeType) {
		this.marginTradeType = marginTradeType;
	}

	public SendOrderRequestEx marginPremiumUnit(Double marginPremiumUnit) {
		this.marginPremiumUnit = marginPremiumUnit;
		return this;
	}

	public Double getMarginPremiumUnit() {
		return marginPremiumUnit;
	}

	public void setMarginPremiumUnit(Double marginPremiumUnit) {
		this.marginPremiumUnit = marginPremiumUnit;
	}

	public SendOrderRequestEx delivType(DelivTypeCode delivType) {
		this.delivType = delivType;
		return this;
	}

	public DelivTypeCode getDelivType() {
		return delivType;
	}

	public void setDelivType(DelivTypeCode delivType) {
		this.delivType = delivType;
	}

	public SendOrderRequestEx fundType(FundTypeCode fundType) {
		this.fundType = fundType;
		return this;
	}

	public FundTypeCode getFundType() {
		return fundType;
	}

	public void setFundType(FundTypeCode fundType) {
		this.fundType = fundType;
	}

	public SendOrderRequestEx accountType(AccountTypeCode accountType) {
		this.accountType = accountType;
		return this;
	}

	public AccountTypeCode getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeCode accountType) {
		this.accountType = accountType;
	}

	public SendOrderRequestEx qty(Integer qty) {
		this.qty = qty;
		return this;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public SendOrderRequestEx closePositionOrder(ClosePositionOrderCode closePositionOrder) {
		this.closePositionOrder = closePositionOrder;
		return this;
	}

	public ClosePositionOrderCode getClosePositionOrder() {
		return closePositionOrder;
	}

	public void setClosePositionOrder(ClosePositionOrderCode closePositionOrder) {
		this.closePositionOrder = closePositionOrder;
	}

	public List<ClosePosition> getClosePositions() {
		return closePositions;
	}

	public void addClosePosition(String holdID, Integer qty) {
		if (closePositions == null) {
			closePositions = new ArrayList<>();
		}
		ClosePosition cp = new ClosePosition(holdID, qty);
		closePositions.add(cp);
	}

	public void setClosePositions(List<ClosePosition> closePositions) {
		this.closePositions = closePositions;
	}

	public SendOrderRequestEx frontOrderType(FrontOrderTypeSCode frontOrderType) {
		this.frontOrderType = frontOrderType;
		return this;
	}

	public FrontOrderTypeSCode getFrontOrderType() {
		return frontOrderType;
	}

	public void setFrontOrderType(FrontOrderTypeSCode frontOrderType) {
		this.frontOrderType = frontOrderType;
	}

	public SendOrderRequestEx price(Double price) {
		this.price = price;
		return this;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public SendOrderRequestEx expireDay(Integer expireDay) {
		this.expireDay = expireDay;
		return this;
	}

	public Integer getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(Integer expireDay) {
		this.expireDay = expireDay;
	}

	public SendOrderRequestEx reverseLimitOrder(ReverseLimitOrder reverseLimitOrder) {
		this.reverseLimitOrder = reverseLimitOrder;
		return this;
	}

	public ReverseLimitOrder getReverseLimitOrder() {
		return reverseLimitOrder;
	}

	public void setReverseLimitOrder(TriggerSecCode triggerSec, Double triggerPrice, UnderOverCode underOver, AfterHitOrderTypeSCode afterHitOrderType, Double afterHitPrice) {
		ReverseLimitOrder rlo = new ReverseLimitOrder(triggerSec, triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		this.reverseLimitOrder = rlo;
	}

	public void setReverseLimitOrder(ReverseLimitOrder reverseLimitOrder) {
		this.reverseLimitOrder = reverseLimitOrder;
	}

	public RequestSendOrder toRequestSendOrder() {
		RequestSendOrder body = new RequestSendOrder();
		body.setSymbol(symbol);
		body.setExchange(exchange.intValue());
		body.setSecurityType(securityType.intValue());
		body.setSide(side.toString());
		body.setCashMargin(cashMargin.intValue());
		if (marginTradeType != null) {
			body.setMarginTradeType(marginTradeType.intValue());
		}
		body.setMarginPremiumUnit(marginPremiumUnit);
		body.setDelivType(delivType.intValue());
		if (fundType != null) {
			body.setFundType(fundType.toString());
		}
		body.setAccountType(accountType.intValue());
		body.setQty(qty);
		if (closePositionOrder != null) {
			body.setClosePositionOrder(closePositionOrder.intValue());
		}
		if (closePositions != null) {
			List<Positions> pl = new ArrayList<>();
			for (ClosePosition cp : closePositions) {
				Positions p = cp.toPositions();
				pl.add(p);
			}
			body.setClosePositions(pl);
		}
		body.setFrontOrderType(frontOrderType.intValue());
		body.setPrice(price);
		body.setExpireDay(expireDay);
		if (reverseLimitOrder != null) {
			RequestSendOrderReverseLimitOrder rlo = reverseLimitOrder.toRequestSendOrderReverseLimitOrder();
			body.setReverseLimitOrder(rlo);
		}
		return body;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SendOrderRequestEx {\n");
		
//	    sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
		sb.append("    side: ").append(toIndentedString(side)).append("\n");
		sb.append("    cashMargin: ").append(toIndentedString(cashMargin)).append("\n");
		sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
		sb.append("    marginPremiumUnit: ").append(toIndentedString(marginPremiumUnit)).append("\n");
		sb.append("    delivType: ").append(toIndentedString(delivType)).append("\n");
		sb.append("    fundType: ").append(toIndentedString(fundType)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
		sb.append("    closePositionOrder: ").append(toIndentedString(closePositionOrder)).append("\n");
		sb.append("    closePositions: ").append(toIndentedString(closePositions)).append("\n");
		sb.append("    frontOrderType: ").append(toIndentedString(frontOrderType)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
		sb.append("    reverseLimitOrder: ").append(toIndentedString(reverseLimitOrder)).append("\n");
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
