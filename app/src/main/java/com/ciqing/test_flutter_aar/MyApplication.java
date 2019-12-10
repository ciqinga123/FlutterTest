package com.ciqing.test_flutter_aar;

import android.app.Application;

import io.flutter.view.FlutterMain;

/**
 * <br>
 * CMBC_MBANK
 * <p>
 * com.ciqing.test_flutter_aar
 *
 * @author zhangguanjun
 * @version 5.2
 * @date 2019-12-10 10:31
 * CMBC-版权所有
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        FlutterMain.startInitialization(this);
    }
}
