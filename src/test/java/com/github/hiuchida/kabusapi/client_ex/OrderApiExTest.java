package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

import com.github.hiuchida.kabusapi.client_ex.model.SendOrderFutureRequestEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderOptionRequestEx;
import com.github.hiuchida.kabusapi.client_ex.model.SendOrderRequestEx;
import com.github.hiuchida.kabusapi.enums.commons.ClosePositionOrderCode;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.deliv.ExchangeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.FrontOrderTypeDCode;
import com.github.hiuchida.kabusapi.enums.deliv.TimeInForceCode;
import com.github.hiuchida.kabusapi.enums.deliv.TradeTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.CashmarginStockCode;
import com.github.hiuchida.kabusapi.enums.stock.DelivTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.ExchangeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FrontOrderTypeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FundTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.MarginTradeTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.SecurityTypeSCode;

import io.swagger.client.model.OrderSuccess;

/**
 * API tests for OrderApi
 */
//@Ignore
public class OrderApiExTest {

    private final OrderApiEx api = new OrderApiEx();

    /**
     * 注文取消
     *
     * 注文を取消します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void cancelorderPutTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.cancelorderPut("orderId", "xxxxxx", X_API_KEY);

        // TODO: test validations
    }
    /**
     * 注文発注（先物）
     *
     * 先物銘柄の注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendoderFuturePostTest() throws Exception {
        SendOrderFutureRequestEx body = new SendOrderFutureRequestEx();
        body.symbol("symbol").exchange(ExchangeDCode.日中).tradeType(TradeTypeCode.新規);
        body.timeInForce(TimeInForceCode.FAK).side(SideCode.買).qty(0);
        body.closePositionOrder(ClosePositionOrderCode.日付_古い順_損益_高い順);
        body.frontOrderType(FrontOrderTypeDCode.成行).price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendoderFuturePost(body, "xxxxxx", X_API_KEY);

        // TODO: test validations
    }
    /**
     * 注文発注（オプション）
     *
     * オプション銘柄の注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendorderOptionPostTest() throws Exception {
        SendOrderOptionRequestEx body = new SendOrderOptionRequestEx();
        body.symbol("symbol").exchange(ExchangeDCode.日中).tradeType(TradeTypeCode.新規);
        body.timeInForce(TimeInForceCode.FAK).side(SideCode.買).qty(0);
        body.closePositionOrder(ClosePositionOrderCode.日付_古い順_損益_高い順);
        body.frontOrderType(FrontOrderTypeDCode.成行).price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendorderOptionPost(body, "xxxxxx", X_API_KEY);

        // TODO: test validations
    }
    /**
     * 注文発注（現物・信用）
     *
     * 注文を発注します。&lt;br&gt; 同一の銘柄に対しての注文は同時に5件ほどを上限としてご利用ください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void sendorderPostTest() throws Exception {
        SendOrderRequestEx body = new SendOrderRequestEx();
        body.symbol("symbol").exchange(ExchangeSCode.東証).securityType(SecurityTypeSCode.株式);
        body.side(SideCode.買).cashMargin(CashmarginStockCode.新規).marginTradeType(MarginTradeTypeCode.制度信用);
        body.marginPremiumUnit(12.3).delivType(DelivTypeCode.指定なし);
        body.fundType(FundTypeCode.信用代用);
        body.accountType(AccountTypeCode.特定).qty(0);
        body.closePositionOrder(ClosePositionOrderCode.日付_古い順_損益_高い順);
        body.frontOrderType(FrontOrderTypeSCode.成行);
        body.price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendorderPost(body, "xxxxxx", X_API_KEY);

        // TODO: test validations
    }
}
