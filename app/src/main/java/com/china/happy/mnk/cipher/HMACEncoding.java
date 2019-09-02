/*
 * Copyright (c) 2019.
 * ************************************************************
 * 文件：HMACEncoding.java  模块：app  项目：UseUtils
 * 当前修改时间：2019年09月02日 22:35:58
 * 上次修改时间：2019年09月02日 22:35:58
 * 作者：胡凯
 * 一个有点二的开发者  Github地址 https://github.com/happyhk123
 * Copyright (c) 2019
 * ************************************************************
 */

package com.china.happy.mnk.cipher;

import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class HMACEncoding {
    /**
     * 初始化HMAC密钥
     *
     * @param type 算法，可为空。默认为：CipherType.Hmac_MD5
     * @return
     * @throws Exception
     */
    public static String initMacKey(CipherType type) throws Exception {
        if (type == null) type = CipherType.Hmac_MD5;
        KeyGenerator keyGenerator = KeyGenerator.getInstance(type.getType());
        SecretKey secretKey = keyGenerator.generateKey();
        return Base64Coding.encodeToString(secretKey.getEncoded());
    }

    /**
     * HMAC加密
     *
     * @param plain     明文
     * @param key       key
     * @param type 算法，可为空。默认为：CipherType.Hmac_MD5
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] plain, String key, CipherType type) throws Exception {
        if (type == null) type = CipherType.Hmac_MD5;
        SecretKey secretKey = new SecretKeySpec(Base64Coding.decode(key), type.getType());
        Mac mac = Mac.getInstance(secretKey.getAlgorithm());
        mac.init(secretKey);
        return mac.doFinal(plain);
    }
}
