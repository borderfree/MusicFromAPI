package org.slf4j.impl;

import android.util.Log;
import org.slf4j.helpers.C6879b;
import org.slf4j.helpers.MarkerIgnoringBase;

public class AndroidLogger extends MarkerIgnoringBase {
    private static final long serialVersionUID = -1227274521521287937L;

    AndroidLogger(String str) {
        this.name = str;
    }

    /* renamed from: a */
    private String m32932a(String str, Object obj, Object obj2) {
        return C6879b.m32912a(str, obj, obj2).mo21538a();
    }

    /* renamed from: a */
    private String m32933a(String str, Object[] objArr) {
        return C6879b.m32913a(str, objArr).mo21538a();
    }

    public void debug(String str) {
        Log.d(this.name, str);
    }

    public void debug(String str, Object obj) {
        Log.d(this.name, m32932a(str, obj, null));
    }

    public void debug(String str, Object obj, Object obj2) {
        Log.d(this.name, m32932a(str, obj, obj2));
    }

    public void debug(String str, Throwable th) {
        Log.d(this.name, str, th);
    }

    public void debug(String str, Object[] objArr) {
        Log.d(this.name, m32933a(str, objArr));
    }

    public void error(String str) {
        Log.e(this.name, str);
    }

    public void error(String str, Object obj) {
        Log.e(this.name, m32932a(str, obj, null));
    }

    public void error(String str, Object obj, Object obj2) {
        Log.e(this.name, m32932a(str, obj, obj2));
    }

    public void error(String str, Throwable th) {
        Log.e(this.name, str, th);
    }

    public void error(String str, Object[] objArr) {
        Log.e(this.name, m32933a(str, objArr));
    }

    public void info(String str) {
        Log.i(this.name, str);
    }

    public void info(String str, Object obj) {
        Log.i(this.name, m32932a(str, obj, null));
    }

    public void info(String str, Object obj, Object obj2) {
        Log.i(this.name, m32932a(str, obj, obj2));
    }

    public void info(String str, Throwable th) {
        Log.i(this.name, str, th);
    }

    public void info(String str, Object[] objArr) {
        Log.i(this.name, m32933a(str, objArr));
    }

    public boolean isDebugEnabled() {
        return Log.isLoggable(this.name, 3);
    }

    public boolean isErrorEnabled() {
        return Log.isLoggable(this.name, 6);
    }

    public boolean isInfoEnabled() {
        return Log.isLoggable(this.name, 4);
    }

    public boolean isTraceEnabled() {
        return Log.isLoggable(this.name, 2);
    }

    public boolean isWarnEnabled() {
        return Log.isLoggable(this.name, 5);
    }

    public void trace(String str) {
        Log.v(this.name, str);
    }

    public void trace(String str, Object obj) {
        Log.v(this.name, m32932a(str, obj, null));
    }

    public void trace(String str, Object obj, Object obj2) {
        Log.v(this.name, m32932a(str, obj, obj2));
    }

    public void trace(String str, Throwable th) {
        Log.v(this.name, str, th);
    }

    public void trace(String str, Object[] objArr) {
        Log.v(this.name, m32933a(str, objArr));
    }

    public void warn(String str) {
        Log.w(this.name, str);
    }

    public void warn(String str, Object obj) {
        Log.w(this.name, m32932a(str, obj, null));
    }

    public void warn(String str, Object obj, Object obj2) {
        Log.w(this.name, m32932a(str, obj, obj2));
    }

    public void warn(String str, Throwable th) {
        Log.w(this.name, str, th);
    }

    public void warn(String str, Object[] objArr) {
        Log.w(this.name, m32933a(str, objArr));
    }
}
