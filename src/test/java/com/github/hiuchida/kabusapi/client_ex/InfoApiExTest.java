package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

import com.github.hiuchida.kabusapi.enums.symbolname.future.FutureCode;
import com.github.hiuchida.kabusapi.enums.symbolname.option.PutOrCallCode;

import io.swagger.client.model.ApiSoftLimitResponse;
import io.swagger.client.model.SymbolNameSuccess;

/**
 * API tests for InfoApiEx
 */
//@Ignore
public class InfoApiExTest {

    private final InfoApiEx api = new InfoApiEx();

    /**
     * ソフトリミット
     *
     * kabuステーションAPIのソフトリミット値を取得する
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void apisoftlimitGetTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        ApiSoftLimitResponse response = api.apisoftlimitGet(X_API_KEY);

        // TODO: test validations
    }
    /**
     * 先物銘柄コード取得
     *
     * 先物銘柄コード取得
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void symbolnameFutureGetTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        Integer derivMonth = 0;
        FutureCode futureCode = FutureCode.日経225mini先物;
        SymbolNameSuccess response = api.symbolnameFutureGet(X_API_KEY, derivMonth, futureCode);

        // TODO: test validations
    }
    /**
     * オプション銘柄コード取得
     *
     * オプション銘柄コード取得
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void symbolnameOptionGetTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        Integer derivMonth = 0;
        PutOrCallCode putOrCall = PutOrCallCode.CALL;
        Integer strikePrice = 0;
        SymbolNameSuccess response = api.symbolnameOptionGet(X_API_KEY, derivMonth, putOrCall, strikePrice);

        // TODO: test validations
    }
}
