package com.github.hiuchida.kabusapi.client_ex.model;

import java.util.ArrayList;
import java.util.List;

import com.github.hiuchida.kabusapi.enums.commons.ClosePositionOrderCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.deliv.ExchangeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.TimeInForceCode;
import com.github.hiuchida.kabusapi.enums.deliv.TradeTypeCode;

import io.swagger.client.model.PositionsDeriv;
import io.swagger.client.model.RequestSendOrderDerivFutureReverseLimitOrder;
import io.swagger.client.model.RequestSendOrderDerivOption;

public class SendOrderOptionRequestEx extends SendOrderDerivRequestEx {

	public SendOrderOptionRequestEx symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}

	public SendOrderOptionRequestEx exchange(ExchangeDCode exchange) {
		this.exchange = exchange;
		return this;
	}

	public SendOrderOptionRequestEx tradeType(TradeTypeCode tradeType) {
		this.tradeType = tradeType;
		return this;
	}

	public SendOrderOptionRequestEx timeInForce(TimeInForceCode timeInForce) {
		this.timeInForce = timeInForce;
		return this;
	}

	public SendOrderOptionRequestEx side(SideCode side) {
		this.side = side;
		return this;
	}

	public SendOrderOptionRequestEx qty(Integer qty) {
		this.qty = qty;
		return this;
	}

	public SendOrderOptionRequestEx closePositionOrder(ClosePositionOrderCode closePositionOrder) {
		this.closePositionOrder = closePositionOrder;
		return this;
	}

	public SendOrderOptionRequestEx frontOrderType(FrontOrderTypeDCode frontOrderType) {
		this.frontOrderType = frontOrderType;
		return this;
	}

	public SendOrderOptionRequestEx price(Double price) {
		this.price = price;
		return this;
	}

	public SendOrderOptionRequestEx expireDay(Integer expireDay) {
		this.expireDay = expireDay;
		return this;
	}

	public SendOrderOptionRequestEx reverseLimitOrder(ReverseLimitOrder reverseLimitOrder) {
		this.reverseLimitOrder = reverseLimitOrder;
		return this;
	}

	public RequestSendOrderDerivOption toRequestSendOrderDerivOption() {
		RequestSendOrderDerivOption body = new RequestSendOrderDerivOption();
		body.setSymbol(symbol);
		body.setExchange(exchange.intValue());
		body.setTradeType(tradeType.intValue());
		body.setTimeInForce(timeInForce.intValue());
		body.setSide(side.toString());
		body.setQty(qty);
		if (closePositionOrder != null) {
			body.setClosePositionOrder(closePositionOrder.intValue());
		}
		if (closePositions != null) {
			List<PositionsDeriv> pdl = new ArrayList<>();
			for (ClosePosition cp : closePositions) {
				PositionsDeriv pd = cp.toPositionsDeriv();
				pdl.add(pd);
			}
			body.setClosePositions(pdl);
		}
		body.setFrontOrderType(frontOrderType.intValue());
		body.setPrice(price);
		body.setExpireDay(expireDay);
		if (reverseLimitOrder != null) {
			RequestSendOrderDerivFutureReverseLimitOrder rlo = reverseLimitOrder.toRequestSendOrderDerivFutureReverseLimitOrder();
			body.setReverseLimitOrder(rlo);
		}
		return body;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SendOrderOptionRequestEx {\n");
	    
//		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
		sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
		sb.append("    side: ").append(toIndentedString(side)).append("\n");
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
