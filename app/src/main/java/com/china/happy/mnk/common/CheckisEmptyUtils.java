/*
 * Copyright (c) 2019.
 * ************************************************************
 * 文件：CheckisEmptyUtils.java  模块：app  项目：UseUtils
 * 当前修改时间：2019年09月02日 21:54:46
 * 上次修改时间：2019年09月02日 21:54:46
 * 作者：胡凯
 * 一个有点二的开发者  Github地址 https://github.com/happyhk123
 * Copyright (c) 2019
 * ************************************************************
 */

package com.china.happy.mnk.common;

import java.util.Collection;
import java.util.Map;

public class CheckisEmptyUtils {
    public static boolean isEmpty(CharSequence charSequence) {
        return isNull(charSequence) || charSequence.length() == 0;
    }

    public static boolean isEmpty(Object[] objects) {
        return isNull(objects) || objects.length == 0;
    }

    public static boolean isEmpty(Collection<?> collections) {
        return isNull(collections) || collections.isEmpty();
    }

    public static boolean isEmpty(Map<?, ?> map) {
        return isNull(map) || map.isEmpty();
    }

    public static boolean isNull(Object o) {
        return o == null;
    }
}
