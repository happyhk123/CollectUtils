/*
 * Copyright (c) 2019.
 * ************************************************************
 * 文件：ClosedInputStream.java  模块：app  项目：UseUtils
 * 当前修改时间：2019年09月02日 00:11:30
 * 上次修改时间：2018年04月17日 00:10:22
 * 作者：胡凯
 * 一个有点二的开发者  Github地址 https://github.com/happyhk123
 * Copyright (c) 2019
 * ************************************************************
 */
package com.china.happy.mnk.io.stream;

import java.io.InputStream;

/**
 * Closed input stream. This stream returns -1 to all attempts to read
 * something from the stream.
 * <p>
 * Typically uses of this class include testing for corner cases in methods
 * that accept input streams and acting as a sentinel value instead of a
 * {@code null} input stream.
 *
 * @version $Id: ClosedInputStream.java 1307459 2012-03-30 15:11:44Z ggregory $
 * @since 1.4
 */
public class ClosedInputStream extends InputStream {

    /**
     * A singleton.
     */
    public static final ClosedInputStream CLOSED_INPUT_STREAM = new ClosedInputStream();

    /**
     * Returns -1 to indicate that the stream is closed.
     *
     * @return always -1
     */
    @Override
    public int read() {
        return -1;
    }

}
