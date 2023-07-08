package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

import com.github.hiuchida.kabusapi.client_ex.model.BoardSuccessEx;
import com.github.hiuchida.kabusapi.enums.commons.ExchangeCode;
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
     * 時価情報・板情報
     *
     * 指定した銘柄の時価情報・板情報を取得します&lt;br&gt; レスポンスの一部にnullが発生した場合、該当銘柄を銘柄登録をしてから、 &lt;br&gt;再度時価情報・板情報APIを実行してください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void boardGetTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        String symbol = "symbol";
        ExchangeCode ec = ExchangeCode.東証;
        BoardSuccessEx response = api.boardGet(X_API_KEY, symbol, ec);

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
