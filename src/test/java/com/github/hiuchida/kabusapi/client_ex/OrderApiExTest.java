package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

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
}
