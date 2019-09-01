/*
 * Copyright (c) 2019.
 * ************************************************************
 * 文件：HandlerUtils.java  模块：app  项目：UseUtils
 * 当前修改时间：2019年09月02日 00:26:17
 * 上次修改时间：2019年09月02日 00:26:17
 * 作者：胡凯
 * 一个有点二的开发者  Github地址 https://github.com/happyhk123
 * Copyright (c) 2019
 * ************************************************************
 */

package com.china.happy.mnk.handler;

import android.os.Handler;
import android.os.Looper;


public class HandlerUtils {
    public static final Handler handler = new Handler(Looper.getMainLooper());

    public static void runOnUiThread(Runnable runnable) {
        handler.post(runnable);
    }

    public static void runOnUiThreadDelay(Runnable runnable, long delayMillis) {
        handler.postDelayed(runnable, delayMillis);
    }

    public static void removeRunnable(Runnable runnable) {
        handler.removeCallbacks(runnable);
    }
}
