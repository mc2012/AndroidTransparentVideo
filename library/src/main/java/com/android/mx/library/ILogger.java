package com.android.mx.library;

/**
 *
 * @author mx
 *
 */
public interface ILogger {
    void i(String tag, String log);
    void e(String tag, String log);
    void postError(String error);
}
