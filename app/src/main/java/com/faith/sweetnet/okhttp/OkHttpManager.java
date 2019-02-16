package com.faith.sweetnet.okhttp;

import android.util.Log;

import com.faith.sweetnet.SweetUrl;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHttpManager {

    private OkHttpManager() {
    }

    private static OkHttpManager manager = null;

    public static OkHttpManager Builder() {
        if (manager == null) {
            manager = new OkHttpManager();
        }
        return manager;
    }

    public void get() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(SweetUrl.url).get().build();
        okHttpClient.newCall(request)
                .enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        //网络请求失败
                        Log.e("call ", "onFailure");
                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        //网络请求成功
                        Log.e("call ", "onResponse: " + response.body());
                    }
                });
    }

}
