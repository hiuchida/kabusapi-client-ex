package com.github.hiuchida.kabusapi.client_ex.model;

import io.swagger.client.model.Positions;
import io.swagger.client.model.PositionsDeriv;

public abstract class SendOrderCommonRequestEx {

	public static class ClosePosition {
		private String holdID = null;

		private Integer qty = null;

		public ClosePosition(String holdID, Integer qty) {
			this.holdID = holdID;
			this.qty = qty;
		}

		public String getHoldID() {
			return holdID;
		}

		public void setHoldID(String holdID) {
			this.holdID = holdID;
		}

		public Integer getQty() {
			return qty;
		}

		public void setQty(Integer qty) {
			this.qty = qty;
		}

		public Positions toPositions() {
			Positions p = new Positions();
			p.setHoldID(holdID);
			p.setQty(qty);
			return p;
		}

		public PositionsDeriv toPositionsDeriv() {
			PositionsDeriv pd = new PositionsDeriv();
			pd.setHoldID(holdID);
			pd.setQty(qty);
			return pd;
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append("class ClosePosition {\n");
			
			sb.append("    holdID: ").append(toIndentedString(holdID)).append("\n");
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

}
