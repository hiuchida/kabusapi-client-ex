package com.github.hiuchida.kabusapi.client_ex.model;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

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

public class OrdersSuccessWrapper {

	public static class Detail {
		
		private Integer seqNum = null;

		private String ID = null;

		private RecTypeOCode recType = null;

		private String exchangeID = null;

		private StateOCode state = null;

		private String transactTime = null;

		private OrdTypeOCode ordType = null;

		private Double price = null;

		private Double qty = null;

		private String executionID = null;

		private OffsetDateTime executionDay = null;

		private Integer delivDay = null;

		private Double commission = null;

		private Double commissionTax = null;

		public Detail(OrdersSuccessDetails response) {
			this.seqNum = response.getSeqNum();
			this.ID = response.getID();
			this.recType = RecTypeOCode.valueOf(response.getRecType());
			this.exchangeID = response.getExchangeID();
			this.state = StateOCode.valueOf(response.getState());
			this.transactTime = response.getTransactTime();
			this.ordType = OrdTypeOCode.valueOf(response.getOrdType());
			this.price = response.getPrice();
			this.qty = response.getQty();
			this.executionID = response.getExecutionID();
			this.executionDay = response.getExecutionDay();
			this.delivDay = response.getDelivDay();
			this.commission = response.getCommission();
			this.commissionTax = response.getCommissionTax();
		}

		public Integer getSeqNum() {
			return seqNum;
		}

		public void setSeqNum(Integer seqNum) {
			this.seqNum = seqNum;
		}

		public String getID() {
			return ID;
		}

		public void setID(String iD) {
			ID = iD;
		}

		public RecTypeOCode getRecType() {
			return recType;
		}

		public void setRecType(RecTypeOCode recType) {
			this.recType = recType;
		}

		public String getExchangeID() {
			return exchangeID;
		}

		public void setExchangeID(String exchangeID) {
			this.exchangeID = exchangeID;
		}

		public StateOCode getState() {
			return state;
		}

		public void setState(StateOCode state) {
			this.state = state;
		}

		public String getTransactTime() {
			return transactTime;
		}

		public void setTransactTime(String transactTime) {
			this.transactTime = transactTime;
		}

		public OrdTypeOCode getOrdType() {
			return ordType;
		}

		public void setOrdType(OrdTypeOCode ordType) {
			this.ordType = ordType;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Double getQty() {
			return qty;
		}

		public void setQty(Double qty) {
			this.qty = qty;
		}

		public String getExecutionID() {
			return executionID;
		}

		public void setExecutionID(String executionID) {
			this.executionID = executionID;
		}

		public OffsetDateTime getExecutionDay() {
			return executionDay;
		}

		public void setExecutionDay(OffsetDateTime executionDay) {
			this.executionDay = executionDay;
		}

		public Integer getDelivDay() {
			return delivDay;
		}

		public void setDelivDay(Integer delivDay) {
			this.delivDay = delivDay;
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

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("class Detail {\n");

			sb.append("    seqNum: ").append(toIndentedString(seqNum)).append("\n");
			sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
			sb.append("    recType: ").append(toIndentedString(recType)).append("\n");
			sb.append("    exchangeID: ").append(toIndentedString(exchangeID)).append("\n");
			sb.append("    state: ").append(toIndentedString(state)).append("\n");
			sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
			sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
			sb.append("    price: ").append(toIndentedString(price)).append("\n");
			sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
			sb.append("    executionID: ").append(toIndentedString(executionID)).append("\n");
			sb.append("    executionDay: ").append(toIndentedString(executionDay)).append("\n");
			sb.append("    delivDay: ").append(toIndentedString(delivDay)).append("\n");
			sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
			sb.append("    commissionTax: ").append(toIndentedString(commissionTax)).append("\n");
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

	private String ID = null;

	private StateOCode state = null;

	private StateOCode orderState = null;

	private OrdTypeOCode ordType = null;

	private String recvTime = null;

	private String symbol = null;

	private String symbolName = null;

	private ExchangeOCode exchange = null;

	private String exchangeName = null;

	private TimeInForceCode timeInForce = null;

	private Double price = null;

	private Double orderQty = null;

	private Double cumQty = null;

	private SideCode side = null;

	private CashmarginOCode cashMargin = null;

	private AccountTypeCode accountType = null;

	private DelivTypeCode delivType = null;

	private Integer expireDay = null;

	private MarginTradeTypeCode marginTradeType = null;

	private Double marginPremium = null;

	private List<Detail> details = null;

	public OrdersSuccessWrapper(OrdersSuccess response) {
		this.ID = response.getID();
		this.state = StateOCode.valueOf(response.getState());
		this.orderState = StateOCode.valueOf(response.getOrderState());
		this.ordType = OrdTypeOCode.valueOf(response.getOrdType());
		this.recvTime = response.getRecvTime();
		this.symbol = response.getSymbol();
		this.symbolName = response.getSymbolName();
		this.exchange = ExchangeOCode.valueOf(response.getExchange());
		this.exchangeName = response.getExchangeName();
		this.timeInForce = TimeInForceCode.valueOf(response.getTimeInForce());
		this.price = response.getPrice();
		this.orderQty = response.getOrderQty();
		this.cumQty = response.getCumQty();
		this.side = SideCode.valueOfCode(response.getSide());
		this.cashMargin = CashmarginOCode.valueOf(response.getCashMargin());
		this.accountType = AccountTypeCode.valueOf(response.getAccountType());
		this.delivType = DelivTypeCode.valueOf(response.getDelivType());
		this.expireDay = response.getExpireDay();
		this.marginTradeType = MarginTradeTypeCode.valueOf(response.getMarginTradeType());
		this.marginPremium = response.getMarginPremium();
		if (response.getDetails() == null) {
			this.details = null;
		} else {
			this.details = new ArrayList<>();
			for (OrdersSuccessDetails osd : response.getDetails()) {
				Detail item = new Detail(osd);
				details.add(item);
			}
		}
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public StateOCode getState() {
		return state;
	}

	public void setState(StateOCode state) {
		this.state = state;
	}

	public StateOCode getOrderState() {
		return orderState;
	}

	public void setOrderState(StateOCode orderState) {
		this.orderState = orderState;
	}

	public OrdTypeOCode getOrdType() {
		return ordType;
	}

	public void setOrdType(OrdTypeOCode ordType) {
		this.ordType = ordType;
	}

	public String getRecvTime() {
		return recvTime;
	}

	public void setRecvTime(String recvTime) {
		this.recvTime = recvTime;
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

	public ExchangeOCode getExchange() {
		return exchange;
	}

	public void setExchange(ExchangeOCode exchange) {
		this.exchange = exchange;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public TimeInForceCode getTimeInForce() {
		return timeInForce;
	}

	public void setTimeInForce(TimeInForceCode timeInForce) {
		this.timeInForce = timeInForce;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getOrderQty() {
		return orderQty;
	}

	public void setOrderQty(Double orderQty) {
		this.orderQty = orderQty;
	}

	public Double getCumQty() {
		return cumQty;
	}

	public void setCumQty(Double cumQty) {
		this.cumQty = cumQty;
	}

	public SideCode getSide() {
		return side;
	}

	public void setSide(SideCode side) {
		this.side = side;
	}

	public CashmarginOCode getCashMargin() {
		return cashMargin;
	}

	public void setCashMargin(CashmarginOCode cashMargin) {
		this.cashMargin = cashMargin;
	}

	public AccountTypeCode getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountTypeCode accountType) {
		this.accountType = accountType;
	}

	public DelivTypeCode getDelivType() {
		return delivType;
	}

	public void setDelivType(DelivTypeCode delivType) {
		this.delivType = delivType;
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

	public Double getMarginPremium() {
		return marginPremium;
	}

	public void setMarginPremium(Double marginPremium) {
		this.marginPremium = marginPremium;
	}

	public List<Detail> getDetails() {
		return details;
	}

	public void setDetails(List<Detail> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OrdersSuccessWrapper {\n");

		sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    orderState: ").append(toIndentedString(orderState)).append("\n");
		sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
		sb.append("    recvTime: ").append(toIndentedString(recvTime)).append("\n");
		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
		sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
		sb.append("    price: ").append(toIndentedString(price)).append("\n");
		sb.append("    orderQty: ").append(toIndentedString(orderQty)).append("\n");
		sb.append("    cumQty: ").append(toIndentedString(cumQty)).append("\n");
		sb.append("    side: ").append(toIndentedString(side)).append("\n");
		sb.append("    cashMargin: ").append(toIndentedString(cashMargin)).append("\n");
		sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
		sb.append("    delivType: ").append(toIndentedString(delivType)).append("\n");
		sb.append("    expireDay: ").append(toIndentedString(expireDay)).append("\n");
		sb.append("    marginTradeType: ").append(toIndentedString(marginTradeType)).append("\n");
		sb.append("    marginPremium: ").append(toIndentedString(marginPremium)).append("\n");
		sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
