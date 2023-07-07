package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

import com.github.hiuchida.kabusapi.client_ex.model.RegistSuccessEx;
import com.github.hiuchida.kabusapi.client_ex.model.RegisterSymbolEx;

import io.swagger.client.model.UnregisterAllSuccess;

/**
 * API tests for RegisterApiEx
 */
//@Ignore
public class RegisterApiExTest {

    private final RegisterApiEx api = new RegisterApiEx();

    /**
     * 銘柄登録
     *
     * PUSH配信する銘柄を登録します。&lt;br&gt; API登録銘柄リストを開くには、kabuステーションAPIインジケーターを右クリックし「API登録銘柄リスト」を選択してください。
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void registerPutTest() throws Exception {
        RegisterSymbolEx body = new RegisterSymbolEx();
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        RegistSuccessEx response = api.registerPut(body, X_API_KEY);

        // TODO: test validations
    }
    /**
     * 銘柄登録全解除
     *
     * API登録銘柄リストに登録されている銘柄をすべて解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterAllPutTest() throws Exception {
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        UnregisterAllSuccess response = api.unregisterAllPut(X_API_KEY);

        // TODO: test validations
    }
    /**
     * 銘柄登録解除
     *
     * API登録銘柄リストに登録されている銘柄を解除します
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void unregisterPutTest() throws Exception {
        RegisterSymbolEx body = new RegisterSymbolEx();
        String X_API_KEY = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        RegistSuccessEx response = api.unregisterPut(body, X_API_KEY);

        // TODO: test validations
    }
}
