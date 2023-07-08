package com.github.hiuchida.kabusapi.client_ex.model;

import java.util.ArrayList;
import java.util.List;

import com.github.hiuchida.kabusapi.enums.commons.ClosePositionOrderCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.commons.UnderOverCode;
import com.github.hiuchida.kabusapi.enums.deliv.AfterHitOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.ExchangeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.TimeInForceCode;
import com.github.hiuchida.kabusapi.enums.deliv.TradeTypeCode;

import io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder;

public abstract class SendOrderDerivRequestEx extends SendOrderCommonRequestEx {

	public static class ReverseLimitOrder {
		private Double triggerPrice = null;

		private UnderOverCode underOver = null;

		private AfterHitOrderTypeDCode afterHitOrderType = null;

		private Double afterHitPrice = null;

		public ReverseLimitOrder(Double triggerPrice, UnderOverCode underOver, AfterHitOrderTypeDCode afterHitOrderType, Double afterHitPrice) {
			this.triggerPrice = triggerPrice;
			this.underOver = underOver;
			this.afterHitOrderType = afterHitOrderType;
			this.afterHitPrice = afterHitPrice;
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

		public AfterHitOrderTypeDCode getAfterHitOrderType() {
			return afterHitOrderType;
		}

		public void setAfterHitOrderType(AfterHitOrderTypeDCode afterHitOrderType) {
			this.afterHitOrderType = afterHitOrderType;
		}

		public Double getAfterHitPrice() {
			return afterHitPrice;
		}

		public void setAfterHitPrice(Double afterHitPrice) {
			this.afterHitPrice = afterHitPrice;
		}

		public RequestSendOrderDerivFutureReverseLimitOrder toRequestSendOrderDerivFutureReverseLimitOrder() {
			RequestSendOrderDerivFutureReverseLimitOrder rlo = new RequestSendOrderDerivFutureReverseLimitOrder();
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


//	protected String password = null;

	protected String symbol = null;

	protected ExchangeDCode exchange = null;

	protected TradeTypeCode tradeType = null;

	protected TimeInForceCode timeInForce = null;

	protected SideCode side = null;

	protected Integer qty = null;

	protected ClosePositionOrderCode closePositionOrder = null;

	protected List<ClosePosition> closePositions = null;

	protected FrontOrderTypeDCode frontOrderType = null;

	protected Double price = null;

	protected Integer expireDay = null;

	protected ReverseLimitOrder reverseLimitOrder = null;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public ExchangeDCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeDCode exchange) {
		this.exchange = exchange;
	}

	public TradeTypeCode getTradeType() {
		return tradeType;
	}

	public void setTradeType(TradeTypeCode tradeType) {
		this.tradeType = tradeType;
	}

	public TimeInForceCode getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(TimeInForceCode timeInForce) {
		this.timeInForce = timeInForce;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
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

	public FrontOrderTypeDCode getFrontOrderType() {
		return frontOrderType;
	}

	public void setFrontOrderType(FrontOrderTypeDCode frontOrderType) {
		this.frontOrderType = frontOrderType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getExpireDay() {
		return expireDay;
	}

	public void setExpireDay(Integer expireDay) {
		this.expireDay = expireDay;
	}

	public ReverseLimitOrder getReverseLimitOrder() {
		return reverseLimitOrder;
	}

	public void setReverseLimitOrder(Double triggerPrice, UnderOverCode underOver, AfterHitOrderTypeDCode afterHitOrderType, Double afterHitPrice) {
		ReverseLimitOrder rlo = new ReverseLimitOrder(triggerPrice, underOver, afterHitOrderType, afterHitPrice);
		this.reverseLimitOrder = rlo;
	}

	public void setReverseLimitOrder(ReverseLimitOrder reverseLimitOrder) {
		this.reverseLimitOrder = reverseLimitOrder;
	}

}
