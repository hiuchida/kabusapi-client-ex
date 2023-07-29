package com.github.hiuchida.kabusapi.client_ex.model;

import java.time.OffsetDateTime;

import com.github.hiuchida.kabusapi.enums.board.SignCode;
import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
import com.github.hiuchida.kabusapi.enums.commons.SecurityTypeCode;

import io.swagger.client.model.BoardSuccess;
import io.swagger.client.model.BoardSuccessBuy1;
import io.swagger.client.model.BoardSuccessBuy10;
import io.swagger.client.model.BoardSuccessBuy2;
import io.swagger.client.model.BoardSuccessBuy3;
import io.swagger.client.model.BoardSuccessBuy4;
import io.swagger.client.model.BoardSuccessBuy5;
import io.swagger.client.model.BoardSuccessBuy6;
import io.swagger.client.model.BoardSuccessBuy7;
import io.swagger.client.model.BoardSuccessBuy8;
import io.swagger.client.model.BoardSuccessBuy9;
import io.swagger.client.model.BoardSuccessSell1;
import io.swagger.client.model.BoardSuccessSell10;
import io.swagger.client.model.BoardSuccessSell2;
import io.swagger.client.model.BoardSuccessSell3;
import io.swagger.client.model.BoardSuccessSell4;
import io.swagger.client.model.BoardSuccessSell5;
import io.swagger.client.model.BoardSuccessSell6;
import io.swagger.client.model.BoardSuccessSell7;
import io.swagger.client.model.BoardSuccessSell8;
import io.swagger.client.model.BoardSuccessSell9;

public class BoardSuccessEx {

	public static class Quotation1 {

		public static Quotation1 create(BoardSuccessSell1 o) {
			if (o == null) {
				return null;
			}
			return new Quotation1(o.getTime(), o.getSign(), o.getPrice(), o.getQty());
		}

		public static Quotation1 create(BoardSuccessBuy1 o) {
			if (o == null) {
				return null;
			}
			return new Quotation1(o.getTime(), o.getSign(), o.getPrice(), o.getQty());
		}

		private OffsetDateTime time = null;

		private SignCode sign = null;

		private Double price = null;

		private Double qty = null;

		private Quotation1(OffsetDateTime time, String signStr, Double price, Double qty) {
			this.time = time;
			this.sign = SignCode.valueOfCode(signStr);
			this.price = price;
			this.qty = qty;
		}

		public OffsetDateTime getTime() {
			return time;
		}

		public void setTime(OffsetDateTime time) {
			this.time = time;
		}

		public SignCode getSign() {
			return sign;
		}

		public void setSign(SignCode sign) {
			this.sign = sign;
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

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("class Quotation1 {\n");

			sb.append("    time: ").append(toIndentedString(time)).append("\n");
			sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
			sb.append("    price: ").append(toIndentedString(price)).append("\n");
			sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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

	public static class Quotation2 {

		public static Quotation2 create(BoardSuccessSell2 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell3 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell4 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell5 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell6 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell7 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell8 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell9 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessSell10 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy2 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy3 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy4 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy5 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy6 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy7 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy8 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy9 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		public static Quotation2 create(BoardSuccessBuy10 o) {
			if (o == null) {
				return null;
			}
			return new Quotation2(o.getPrice(), o.getQty());
		}

		private Double price = null;

		private Double qty = null;

		private Quotation2(Double price, Double qty) {
			this.price = price;
			this.qty = qty;
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

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("class Quotation2 {\n");

			sb.append("    price: ").append(toIndentedString(price)).append("\n");
			sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
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

	private BoardSuccess response = null;

	private String symbol = null;

	private String symbolName = null;

	private ExchangeCode exchange = null;

	private String exchangeName = null;

	private Double currentPrice = null;

	private OffsetDateTime currentPriceTime = null;

	private String currentPriceChangeStatus = null;

	private Integer currentPriceStatus = null;

	private Double calcPrice = null;

	private Double previousClose = null;

	private OffsetDateTime previousCloseTime = null;

	private Double changePreviousClose = null;

	private Double changePreviousClosePer = null;

	private Double openingPrice = null;

	private OffsetDateTime openingPriceTime = null;

	private Double highPrice = null;

	private OffsetDateTime highPriceTime = null;

	private Double lowPrice = null;

	private OffsetDateTime lowPriceTime = null;

	private Double tradingVolume = null;

	private OffsetDateTime tradingVolumeTime = null;

	private Double VWAP = null;

	private Double tradingValue = null;

	private Double bidQty = null;

	private Double bidPrice = null;

	private OffsetDateTime bidTime = null;

	private SignCode bidSign = null;

	private Double marketOrderSellQty = null;

	private Quotation1 sell1 = null;

	private Quotation2 sell2 = null;

	private Quotation2 sell3 = null;

	private Quotation2 sell4 = null;

	private Quotation2 sell5 = null;

	private Quotation2 sell6 = null;

	private Quotation2 sell7 = null;

	private Quotation2 sell8 = null;

	private Quotation2 sell9 = null;

	private Quotation2 sell10 = null;

	private Double askQty = null;

	private Double askPrice = null;

	private OffsetDateTime askTime = null;

	private SignCode askSign = null;

	private Double marketOrderBuyQty = null;

	private Quotation1 buy1 = null;

	private Quotation2 buy2 = null;

	private Quotation2 buy3 = null;

	private Quotation2 buy4 = null;

	private Quotation2 buy5 = null;

	private Quotation2 buy6 = null;

	private Quotation2 buy7 = null;

	private Quotation2 buy8 = null;

	private Quotation2 buy9 = null;

	private Quotation2 buy10 = null;

	private Double overSellQty = null;

	private Double underBuyQty = null;

	private Double totalMarketValue = null;

	private Double clearingPrice = null;

	private Double IV = null;

	private Double gamma = null;

	private Double theta = null;

	private Double vega = null;

	private Double delta = null;

	private SecurityTypeCode securityType = null;

	public BoardSuccessEx(BoardSuccess response) {
		this.response = response;
		this.symbol = response.getSymbol();
		this.symbolName = response.getSymbolName();
		this.exchange = ExchangeCode.valueOf(response.getExchange());
		this.exchangeName = response.getExchangeName();
		this.currentPrice = response.getCurrentPrice();
		this.currentPriceTime = response.getCurrentPriceTime();
		this.currentPriceChangeStatus = response.getCurrentPriceChangeStatus();
		this.currentPriceStatus = response.getCurrentPriceStatus();
		this.calcPrice = response.getCalcPrice();
		this.previousClose = response.getPreviousClose();
		this.previousCloseTime = response.getPreviousCloseTime();
		this.changePreviousClose = response.getChangePreviousClose();
		this.changePreviousClosePer = response.getChangePreviousClosePer();
		this.openingPrice = response.getOpeningPrice();
		this.openingPriceTime = response.getOpeningPriceTime();
		this.highPrice = response.getHighPrice();
		this.highPriceTime = response.getHighPriceTime();
		this.lowPrice = response.getLowPrice();
		this.lowPriceTime = response.getLowPriceTime();
		this.tradingVolume = response.getTradingVolume();
		this.tradingVolumeTime = response.getTradingVolumeTime();
		this.VWAP = response.getVWAP();
		this.tradingValue = response.getTradingValue();
		this.bidQty = response.getBidQty();
		this.bidPrice = response.getBidPrice();
		this.bidTime = response.getBidTime();
		this.bidSign = SignCode.valueOfCode(response.getBidSign());
		this.marketOrderSellQty = response.getMarketOrderSellQty();
		this.sell1 = Quotation1.create(response.getSell1());
		this.sell2 = Quotation2.create(response.getSell2());
		this.sell3 = Quotation2.create(response.getSell3());
		this.sell4 = Quotation2.create(response.getSell4());
		this.sell5 = Quotation2.create(response.getSell5());
		this.sell6 = Quotation2.create(response.getSell6());
		this.sell7 = Quotation2.create(response.getSell7());
		this.sell8 = Quotation2.create(response.getSell8());
		this.sell9 = Quotation2.create(response.getSell9());
		this.sell10 = Quotation2.create(response.getSell10());
		this.askQty = response.getAskQty();
		this.askPrice = response.getAskPrice();
		this.askTime = response.getAskTime();
		this.askSign = SignCode.valueOfCode(response.getAskSign());
		this.marketOrderBuyQty = response.getMarketOrderBuyQty();
		this.buy1 = Quotation1.create(response.getBuy1());
		this.buy2 = Quotation2.create(response.getBuy2());
		this.buy3 = Quotation2.create(response.getBuy3());
		this.buy4 = Quotation2.create(response.getBuy4());
		this.buy5 = Quotation2.create(response.getBuy5());
		this.buy6 = Quotation2.create(response.getBuy6());
		this.buy7 = Quotation2.create(response.getBuy7());
		this.buy8 = Quotation2.create(response.getBuy8());
		this.buy9 = Quotation2.create(response.getBuy9());
		this.buy10 = Quotation2.create(response.getBuy10());
		this.overSellQty = response.getOverSellQty();
		this.underBuyQty = response.getUnderBuyQty();
		this.totalMarketValue = response.getTotalMarketValue();
		this.clearingPrice = response.getClearingPrice();
		this.IV = response.getIV();
		this.gamma = response.getGamma();
		this.theta = response.getTheta();
		this.vega = response.getVega();
		this.delta = response.getDelta();
		this.securityType = SecurityTypeCode.valueOf(response.getSecurityType());
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

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public OffsetDateTime getCurrentPriceTime() {
		return currentPriceTime;
	}

	public void setCurrentPriceTime(OffsetDateTime currentPriceTime) {
		this.currentPriceTime = currentPriceTime;
	}

	public String getCurrentPriceChangeStatus() {
		return currentPriceChangeStatus;
	}

	public void setCurrentPriceChangeStatus(String currentPriceChangeStatus) {
		this.currentPriceChangeStatus = currentPriceChangeStatus;
	}

	public Integer getCurrentPriceStatus() {
		return currentPriceStatus;
	}

	public void setCurrentPriceStatus(Integer currentPriceStatus) {
		this.currentPriceStatus = currentPriceStatus;
	}

	public Double getCalcPrice() {
		return calcPrice;
	}

	public void setCalcPrice(Double calcPrice) {
		this.calcPrice = calcPrice;
	}

	public Double getPreviousClose() {
		return previousClose;
	}

	public void setPreviousClose(Double previousClose) {
		this.previousClose = previousClose;
	}

	public OffsetDateTime getPreviousCloseTime() {
		return previousCloseTime;
	}

	public void setPreviousCloseTime(OffsetDateTime previousCloseTime) {
		this.previousCloseTime = previousCloseTime;
	}

	public Double getChangePreviousClose() {
		return changePreviousClose;
	}

	public void setChangePreviousClose(Double changePreviousClose) {
		this.changePreviousClose = changePreviousClose;
	}

	public Double getChangePreviousClosePer() {
		return changePreviousClosePer;
	}

	public void setChangePreviousClosePer(Double changePreviousClosePer) {
		this.changePreviousClosePer = changePreviousClosePer;
	}

	public Double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(Double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public OffsetDateTime getOpeningPriceTime() {
		return openingPriceTime;
	}

	public void setOpeningPriceTime(OffsetDateTime openingPriceTime) {
		this.openingPriceTime = openingPriceTime;
	}

	public Double getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(Double highPrice) {
		this.highPrice = highPrice;
	}

	public OffsetDateTime getHighPriceTime() {
		return highPriceTime;
	}

	public void setHighPriceTime(OffsetDateTime highPriceTime) {
		this.highPriceTime = highPriceTime;
	}

	public Double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(Double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public OffsetDateTime getLowPriceTime() {
		return lowPriceTime;
	}

	public void setLowPriceTime(OffsetDateTime lowPriceTime) {
		this.lowPriceTime = lowPriceTime;
	}

	public Double getTradingVolume() {
		return tradingVolume;
	}

	public void setTradingVolume(Double tradingVolume) {
		this.tradingVolume = tradingVolume;
	}

	public OffsetDateTime getTradingVolumeTime() {
		return tradingVolumeTime;
	}

	public void setTradingVolumeTime(OffsetDateTime tradingVolumeTime) {
		this.tradingVolumeTime = tradingVolumeTime;
	}

	public Double getVWAP() {
		return VWAP;
	}

	public void setVWAP(Double vWAP) {
		VWAP = vWAP;
	}

	public Double getTradingValue() {
		return tradingValue;
	}

	public void setTradingValue(Double tradingValue) {
		this.tradingValue = tradingValue;
	}

	public Double getBidQty() {
		return bidQty;
	}

	public void setBidQty(Double bidQty) {
		this.bidQty = bidQty;
	}

	public Double getBidPrice() {
		return bidPrice;
	}

	public void setBidPrice(Double bidPrice) {
		this.bidPrice = bidPrice;
	}

	public OffsetDateTime getBidTime() {
		return bidTime;
	}

	public void setBidTime(OffsetDateTime bidTime) {
		this.bidTime = bidTime;
	}

	public SignCode getBidSign() {
		return bidSign;
	}

	public void setBidSign(SignCode bidSign) {
		this.bidSign = bidSign;
	}

	public Double getMarketOrderSellQty() {
		return marketOrderSellQty;
	}

	public void setMarketOrderSellQty(Double marketOrderSellQty) {
		this.marketOrderSellQty = marketOrderSellQty;
	}

	public Quotation1 getSell1() {
		return sell1;
	}

	public void setSell1(Quotation1 sell1) {
		this.sell1 = sell1;
	}

	public Quotation2 getSell2() {
		return sell2;
	}

	public void setSell2(Quotation2 sell2) {
		this.sell2 = sell2;
	}

	public Quotation2 getSell3() {
		return sell3;
	}

	public void setSell3(Quotation2 sell3) {
		this.sell3 = sell3;
	}

	public Quotation2 getSell4() {
		return sell4;
	}

	public void setSell4(Quotation2 sell4) {
		this.sell4 = sell4;
	}

	public Quotation2 getSell5() {
		return sell5;
	}

	public void setSell5(Quotation2 sell5) {
		this.sell5 = sell5;
	}

	public Quotation2 getSell6() {
		return sell6;
	}

	public void setSell6(Quotation2 sell6) {
		this.sell6 = sell6;
	}

	public Quotation2 getSell7() {
		return sell7;
	}

	public void setSell7(Quotation2 sell7) {
		this.sell7 = sell7;
	}

	public Quotation2 getSell8() {
		return sell8;
	}

	public void setSell8(Quotation2 sell8) {
		this.sell8 = sell8;
	}

	public Quotation2 getSell9() {
		return sell9;
	}

	public void setSell9(Quotation2 sell9) {
		this.sell9 = sell9;
	}

	public Quotation2 getSell10() {
		return sell10;
	}

	public void setSell10(Quotation2 sell10) {
		this.sell10 = sell10;
	}

	public Double getAskQty() {
		return askQty;
	}

	public void setAskQty(Double askQty) {
		this.askQty = askQty;
	}

	public Double getAskPrice() {
		return askPrice;
	}

	public void setAskPrice(Double askPrice) {
		this.askPrice = askPrice;
	}

	public OffsetDateTime getAskTime() {
		return askTime;
	}

	public void setAskTime(OffsetDateTime askTime) {
		this.askTime = askTime;
	}

	public SignCode getAskSign() {
		return askSign;
	}

	public void setAskSign(SignCode askSign) {
		this.askSign = askSign;
	}

	public Double getMarketOrderBuyQty() {
		return marketOrderBuyQty;
	}

	public void setMarketOrderBuyQty(Double marketOrderBuyQty) {
		this.marketOrderBuyQty = marketOrderBuyQty;
	}

	public Quotation1 getBuy1() {
		return buy1;
	}

	public void setBuy1(Quotation1 buy1) {
		this.buy1 = buy1;
	}

	public Quotation2 getBuy2() {
		return buy2;
	}

	public void setBuy2(Quotation2 buy2) {
		this.buy2 = buy2;
	}

	public Quotation2 getBuy3() {
		return buy3;
	}

	public void setBuy3(Quotation2 buy3) {
		this.buy3 = buy3;
	}

	public Quotation2 getBuy4() {
		return buy4;
	}

	public void setBuy4(Quotation2 buy4) {
		this.buy4 = buy4;
	}

	public Quotation2 getBuy5() {
		return buy5;
	}

	public void setBuy5(Quotation2 buy5) {
		this.buy5 = buy5;
	}

	public Quotation2 getBuy6() {
		return buy6;
	}

	public void setBuy6(Quotation2 buy6) {
		this.buy6 = buy6;
	}

	public Quotation2 getBuy7() {
		return buy7;
	}

	public void setBuy7(Quotation2 buy7) {
		this.buy7 = buy7;
	}

	public Quotation2 getBuy8() {
		return buy8;
	}

	public void setBuy8(Quotation2 buy8) {
		this.buy8 = buy8;
	}

	public Quotation2 getBuy9() {
		return buy9;
	}

	public void setBuy9(Quotation2 buy9) {
		this.buy9 = buy9;
	}

	public Quotation2 getBuy10() {
		return buy10;
	}

	public void setBuy10(Quotation2 buy10) {
		this.buy10 = buy10;
	}

	public Double getOverSellQty() {
		return overSellQty;
	}

	public void setOverSellQty(Double overSellQty) {
		this.overSellQty = overSellQty;
	}

	public Double getUnderBuyQty() {
		return underBuyQty;
	}

	public void setUnderBuyQty(Double underBuyQty) {
		this.underBuyQty = underBuyQty;
	}

	public Double getTotalMarketValue() {
		return totalMarketValue;
	}

	public void setTotalMarketValue(Double totalMarketValue) {
		this.totalMarketValue = totalMarketValue;
	}

	public Double getClearingPrice() {
		return clearingPrice;
	}

	public void setClearingPrice(Double clearingPrice) {
		this.clearingPrice = clearingPrice;
	}

	public Double getIV() {
		return IV;
	}

	public void setIV(Double iV) {
		IV = iV;
	}

	public Double getGamma() {
		return gamma;
	}

	public void setGamma(Double gamma) {
		this.gamma = gamma;
	}

	public Double getTheta() {
		return theta;
	}

	public void setTheta(Double theta) {
		this.theta = theta;
	}

	public Double getVega() {
		return vega;
	}

	public void setVega(Double vega) {
		this.vega = vega;
	}

	public Double getDelta() {
		return delta;
	}

	public void setDelta(Double delta) {
		this.delta = delta;
	}

	public SecurityTypeCode getSecurityType() {
		return securityType;
	}

	public void setSecurityType(SecurityTypeCode securityType) {
		this.securityType = securityType;
	}

	public BoardSuccess toBoardSuccess() {
		return response;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BoardSuccessEx {\n");

		sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
		sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
		sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
		sb.append("    exchangeName: ").append(toIndentedString(exchangeName)).append("\n");
		sb.append("    currentPrice: ").append(toIndentedString(currentPrice)).append("\n");
		sb.append("    currentPriceTime: ").append(toIndentedString(currentPriceTime)).append("\n");
		sb.append("    currentPriceChangeStatus: ").append(toIndentedString(currentPriceChangeStatus)).append("\n");
		sb.append("    currentPriceStatus: ").append(toIndentedString(currentPriceStatus)).append("\n");
		sb.append("    calcPrice: ").append(toIndentedString(calcPrice)).append("\n");
		sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
		sb.append("    previousCloseTime: ").append(toIndentedString(previousCloseTime)).append("\n");
		sb.append("    changePreviousClose: ").append(toIndentedString(changePreviousClose)).append("\n");
		sb.append("    changePreviousClosePer: ").append(toIndentedString(changePreviousClosePer)).append("\n");
		sb.append("    openingPrice: ").append(toIndentedString(openingPrice)).append("\n");
		sb.append("    openingPriceTime: ").append(toIndentedString(openingPriceTime)).append("\n");
		sb.append("    highPrice: ").append(toIndentedString(highPrice)).append("\n");
		sb.append("    highPriceTime: ").append(toIndentedString(highPriceTime)).append("\n");
		sb.append("    lowPrice: ").append(toIndentedString(lowPrice)).append("\n");
		sb.append("    lowPriceTime: ").append(toIndentedString(lowPriceTime)).append("\n");
		sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
		sb.append("    tradingVolumeTime: ").append(toIndentedString(tradingVolumeTime)).append("\n");
		sb.append("    VWAP: ").append(toIndentedString(VWAP)).append("\n");
		sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
		sb.append("    bidQty: ").append(toIndentedString(bidQty)).append("\n");
		sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
		sb.append("    bidTime: ").append(toIndentedString(bidTime)).append("\n");
		sb.append("    bidSign: ").append(toIndentedString(bidSign)).append("\n");
		sb.append("    marketOrderSellQty: ").append(toIndentedString(marketOrderSellQty)).append("\n");
		sb.append("    sell1: ").append(toIndentedString(sell1)).append("\n");
		sb.append("    sell2: ").append(toIndentedString(sell2)).append("\n");
		sb.append("    sell3: ").append(toIndentedString(sell3)).append("\n");
		sb.append("    sell4: ").append(toIndentedString(sell4)).append("\n");
		sb.append("    sell5: ").append(toIndentedString(sell5)).append("\n");
		sb.append("    sell6: ").append(toIndentedString(sell6)).append("\n");
		sb.append("    sell7: ").append(toIndentedString(sell7)).append("\n");
		sb.append("    sell8: ").append(toIndentedString(sell8)).append("\n");
		sb.append("    sell9: ").append(toIndentedString(sell9)).append("\n");
		sb.append("    sell10: ").append(toIndentedString(sell10)).append("\n");
		sb.append("    askQty: ").append(toIndentedString(askQty)).append("\n");
		sb.append("    askPrice: ").append(toIndentedString(askPrice)).append("\n");
		sb.append("    askTime: ").append(toIndentedString(askTime)).append("\n");
		sb.append("    askSign: ").append(toIndentedString(askSign)).append("\n");
		sb.append("    marketOrderBuyQty: ").append(toIndentedString(marketOrderBuyQty)).append("\n");
		sb.append("    buy1: ").append(toIndentedString(buy1)).append("\n");
		sb.append("    buy2: ").append(toIndentedString(buy2)).append("\n");
		sb.append("    buy3: ").append(toIndentedString(buy3)).append("\n");
		sb.append("    buy4: ").append(toIndentedString(buy4)).append("\n");
		sb.append("    buy5: ").append(toIndentedString(buy5)).append("\n");
		sb.append("    buy6: ").append(toIndentedString(buy6)).append("\n");
		sb.append("    buy7: ").append(toIndentedString(buy7)).append("\n");
		sb.append("    buy8: ").append(toIndentedString(buy8)).append("\n");
		sb.append("    buy9: ").append(toIndentedString(buy9)).append("\n");
		sb.append("    buy10: ").append(toIndentedString(buy10)).append("\n");
		sb.append("    overSellQty: ").append(toIndentedString(overSellQty)).append("\n");
		sb.append("    underBuyQty: ").append(toIndentedString(underBuyQty)).append("\n");
		sb.append("    totalMarketValue: ").append(toIndentedString(totalMarketValue)).append("\n");
		sb.append("    clearingPrice: ").append(toIndentedString(clearingPrice)).append("\n");
		sb.append("    IV: ").append(toIndentedString(IV)).append("\n");
		sb.append("    gamma: ").append(toIndentedString(gamma)).append("\n");
		sb.append("    theta: ").append(toIndentedString(theta)).append("\n");
		sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
		sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
		sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
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
