package com.communitystart.communitystart.provider;

import com.alibaba.fastjson.JSON;
import com.communitystart.communitystart.dto.AccessTokenDTO;
import com.communitystart.communitystart.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;
import java.io.IOException;

//import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@Component
public class GithubProvider {
    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType JSON
                = MediaType.get("application/json; charset=utf-8");

        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(JSON, com.alibaba.fastjson.JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String str =  response.body().string();
            String split[] = str.split("&");
            String tokenStr = split[0];
            String accessToken[] = tokenStr.split("=");
            String access_token = accessToken[1];
            return access_token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public GithubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user")
                .addHeader("Authorization","Bearer " + accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String string = response.body().string();
            GithubUser githubUser = JSON.parseObject(string,GithubUser.class);
            return githubUser;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
