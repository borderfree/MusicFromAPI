package com.google.android.exoplayer2;

import com.google.android.exoplayer2.p102c.C2488a;
import java.io.IOException;

public final class ExoPlaybackException extends Exception {
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;
    public final int rendererIndex;
    public final int type;

    private ExoPlaybackException(int i, String str, Throwable th, int i2) {
        super(str, th);
        this.type = i;
        this.rendererIndex = i2;
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i) {
        return new ExoPlaybackException(1, null, exc, i);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, null, iOException, -1);
    }

    static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, null, runtimeException, -1);
    }

    public Exception getRendererException() {
        boolean z = true;
        if (this.type != 1) {
            z = false;
        }
        C2488a.m11668b(z);
        return (Exception) getCause();
    }

    public IOException getSourceException() {
        C2488a.m11668b(this.type == 0);
        return (IOException) getCause();
    }

    public RuntimeException getUnexpectedException() {
        C2488a.m11668b(this.type == 2);
        return (RuntimeException) getCause();
    }
}
