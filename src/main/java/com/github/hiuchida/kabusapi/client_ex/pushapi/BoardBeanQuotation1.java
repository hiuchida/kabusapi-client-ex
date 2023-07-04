package com.github.hiuchida.kabusapi.client_ex.pushapi;

import java.time.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

/**
 * PUSH配信された時価情報の気配数量1本目。
 */
public class BoardBeanQuotation1 {
	@SerializedName("Time")
	public OffsetDateTime time = null;

	@SerializedName("Sign")
	public String sign = null;

	@SerializedName("Price")
	public Double price = null;

	@SerializedName("Qty")
	public Double qty = null;

	public BoardBeanQuotation1() {
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BoardBeanQuotation1 {\n");
		
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
