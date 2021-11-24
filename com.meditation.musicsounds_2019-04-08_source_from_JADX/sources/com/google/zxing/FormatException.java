package com.google.zxing;

public final class FormatException extends ReaderException {

    /* renamed from: a */
    private static final FormatException f17920a;

    static {
        FormatException formatException = new FormatException();
        f17920a = formatException;
        formatException.setStackTrace(NO_TRACE);
    }

    private FormatException() {
    }

    private FormatException(Throwable th) {
        super(th);
    }

    public static FormatException getFormatInstance() {
        return isStackTrace ? new FormatException() : f17920a;
    }

    public static FormatException getFormatInstance(Throwable th) {
        return isStackTrace ? new FormatException(th) : f17920a;
    }
}
