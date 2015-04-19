package com.zhiw.coolweather.app.util;

/**
 * Created by Zhiw on 2015/4/19 0019.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
