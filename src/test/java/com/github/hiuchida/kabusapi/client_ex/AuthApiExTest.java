package com.github.hiuchida.kabusapi.client_ex;

import org.junit.Ignore;
import org.junit.Test;

import io.swagger.client.model.TokenSuccess;

/**
 * API tests for AuthApiEx
 */
//@Ignore
public class AuthApiExTest {

	private final AuthApiEx api = new AuthApiEx();

    /**
     * トークン発行
     *
     * APIトークンを発行します。&lt;br&gt; 発行したトークンは有効である限り使用することができ、リクエストごとに発行する必要はありません。&lt;br&gt; 発行されたAPIトークンは以下のタイミングで無効となります。&lt;br&gt; ・kabuステーションを終了した時&lt;br&gt; ・kabuステーションからログアウトした時&lt;br&gt; ・別のトークンが新たに発行された時&lt;br&gt; ※kabuステーションは早朝、強制的にログアウトいたしますのでご留意ください。&lt;br&gt;
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void tokenPostTest() throws Exception {
        TokenSuccess response = api.tokenPost("xxxxxx");

        // TODO: test validations
    }
}
