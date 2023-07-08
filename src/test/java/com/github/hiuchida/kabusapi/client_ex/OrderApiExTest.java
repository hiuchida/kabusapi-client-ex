package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

import com.github.hiuchida.kabusapi.client_ex.model.SendOrderRequestEx;
import com.github.hiuchida.kabusapi.enums.commons.SideCode;
import com.github.hiuchida.kabusapi.enums.stock.AccountTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.CashmarginStockCode;
import com.github.hiuchida.kabusapi.enums.stock.DelivTypeCode;
import com.github.hiuchida.kabusapi.enums.stock.ExchangeSCode;
import com.github.hiuchida.kabusapi.enums.stock.FrontOrderTypeSCode;
import com.github.hiuchida.kabusapi.enums.stock.SecurityTypeSCode;

import io.swagger.client.model.OrderSuccess;
import io.swagger.client.model.RequestSendOrder;

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
        body.side(SideCode.買).cashMargin(CashmarginStockCode.新規).delivType(DelivTypeCode.指定なし);
        body.accountType(AccountTypeCode.特定).qty(0).frontOrderType(FrontOrderTypeSCode.成行);
        body.price(0.0).expireDay(0);
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        OrderSuccess response = api.sendorderPost(body, "xxxxxx", X_API_KEY);

        // TODO: test validations
    }
}
