/*
 * Copyright (c) 2019.
 * ************************************************************
 * 文件：Base64Coding.java  模块：app  项目：UseUtils
 * 当前修改时间：2019年09月02日 22:30:53
 * 上次修改时间：2019年09月02日 22:30:53
 * 作者：胡凯
 * 一个有点二的开发者  Github地址 https://github.com/happyhk123
 * Copyright (c) 2019
 * ************************************************************
 */

package com.china.happy.mnk.cipher;

import android.util.Base64;

public class Base64Coding {
    public static byte[] encode(byte[] plain) {
        return Base64.encode(plain, Base64.DEFAULT);
    }

    public static String encodeToString(byte[] plain) {
        return Base64.encodeToString(plain, Base64.DEFAULT);
    }

    public static byte[] decode(String text) {
        return Base64.decode(text, Base64.DEFAULT);
    }

    public static byte[] decode(byte[] text) {
        return Base64.decode(text, Base64.DEFAULT);
    }
}
