package com.github.hiuchida.kabusapi.client_ex.pushapi;

import java.time.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

/**
 * PUSH配信された時価情報Beanクラス。
 */
public class BoardBean {
	@SerializedName("Symbol")
	public String symbol = null;

	@SerializedName("SymbolName")
	public String symbolName = null;

	@SerializedName("Exchange")
	public Integer exchange = null;

	@SerializedName("ExchangeName")
	public String exchangeName = null;

	@SerializedName("CurrentPrice")
	public Double currentPrice = null;

	@SerializedName("CurrentPriceTime")
	public OffsetDateTime currentPriceTime = null;

	@SerializedName("CurrentPriceChangeStatus")
	public String currentPriceChangeStatus = null;

	@SerializedName("CurrentPriceStatus")
	public Integer currentPriceStatus = null;

	@SerializedName("CalcPrice")
	public Double calcPrice = null;

	@SerializedName("PreviousClose")
	public Double previousClose = null;

	@SerializedName("PreviousCloseTime")
	public OffsetDateTime previousCloseTime = null;

	@SerializedName("ChangePreviousClose")
	public Double changePreviousClose = null;

	@SerializedName("ChangePreviousClosePer")
	public Double changePreviousClosePer = null;

	@SerializedName("OpeningPrice")
	public Double openingPrice = null;

	@SerializedName("OpeningPriceTime")
	public OffsetDateTime openingPriceTime = null;

	@SerializedName("HighPrice")
	public Double highPrice = null;

	@SerializedName("HighPriceTime")
	public OffsetDateTime highPriceTime = null;

	@SerializedName("LowPrice")
	public Double lowPrice = null;

	@SerializedName("LowPriceTime")
	public OffsetDateTime lowPriceTime = null;

	@SerializedName("TradingVolume")
	public Double tradingVolume = null;

	@SerializedName("TradingVolumeTime")
	public OffsetDateTime tradingVolumeTime = null;

	@SerializedName("VWAP")
	public Double VWAP = null;

	@SerializedName("TradingValue")
	public Double tradingValue = null;

	@SerializedName("BidQty")
	public Double bidQty = null;

	@SerializedName("BidPrice")
	public Double bidPrice = null;

	@SerializedName("BidTime")
	public OffsetDateTime bidTime = null;

	@SerializedName("BidSign")
	public String bidSign = null;

	@SerializedName("MarketOrderSellQty")
	public Double marketOrderSellQty = null;

	@SerializedName("Sell1")
	public BoardBeanQuotation1 sell1 = null;

	@SerializedName("Sell2")
	public BoardBeanQuotation2 sell2 = null;

	@SerializedName("Sell3")
	public BoardBeanQuotation2 sell3 = null;

	@SerializedName("Sell4")
	public BoardBeanQuotation2 sell4 = null;

	@SerializedName("Sell5")
	public BoardBeanQuotation2 sell5 = null;

	@SerializedName("Sell6")
	public BoardBeanQuotation2 sell6 = null;

	@SerializedName("Sell7")
	public BoardBeanQuotation2 sell7 = null;

	@SerializedName("Sell8")
	public BoardBeanQuotation2 sell8 = null;

	@SerializedName("Sell9")
	public BoardBeanQuotation2 sell9 = null;

	@SerializedName("Sell10")
	public BoardBeanQuotation2 sell10 = null;

	@SerializedName("AskQty")
	public Double askQty = null;

	@SerializedName("AskPrice")
	public Double askPrice = null;

	@SerializedName("AskTime")
	public OffsetDateTime askTime = null;

	@SerializedName("AskSign")
	public String askSign = null;

	@SerializedName("MarketOrderBuyQty")
	public Double marketOrderBuyQty = null;

	@SerializedName("Buy1")
	public BoardBeanQuotation1 buy1 = null;

	@SerializedName("Buy2")
	public BoardBeanQuotation2 buy2 = null;

	@SerializedName("Buy3")
	public BoardBeanQuotation2 buy3 = null;

	@SerializedName("Buy4")
	public BoardBeanQuotation2 buy4 = null;

	@SerializedName("Buy5")
	public BoardBeanQuotation2 buy5 = null;

	@SerializedName("Buy6")
	public BoardBeanQuotation2 buy6 = null;

	@SerializedName("Buy7")
	public BoardBeanQuotation2 buy7 = null;

	@SerializedName("Buy8")
	public BoardBeanQuotation2 buy8 = null;

	@SerializedName("Buy9")
	public BoardBeanQuotation2 buy9 = null;

	@SerializedName("Buy10")
	public BoardBeanQuotation2 buy10 = null;

	@SerializedName("OverSellQty")
	public Double overSellQty = null;

	@SerializedName("UnderBuyQty")
	public Double underBuyQty = null;

	@SerializedName("TotalMarketValue")
	public Double totalMarketValue = null;

	@SerializedName("ClearingPrice")
	public Double clearingPrice = null;

	@SerializedName("IV")
	public Double IV = null;

	@SerializedName("Gamma")
	public Double gamma = null;

	@SerializedName("Theta")
	public Double theta = null;

	@SerializedName("Vega")
	public Double vega = null;

	@SerializedName("Delta")
	public Double delta = null;

	@SerializedName("SecurityType")
	public Integer securityType = null;

	public BoardBean() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BoardBean {\n");
		
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
