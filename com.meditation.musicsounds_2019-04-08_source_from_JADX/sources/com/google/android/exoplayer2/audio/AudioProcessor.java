package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {

    /* renamed from: a */
    public static final ByteBuffer f7807a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i, int i2, int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unhandled format: ");
            sb.append(i);
            sb.append(" Hz, ");
            sb.append(i2);
            sb.append(" channels in encoding ");
            sb.append(i3);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    void mo8670a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo8671a();

    /* renamed from: a */
    boolean mo8672a(int i, int i2, int i3);

    /* renamed from: b */
    int mo8673b();

    /* renamed from: c */
    int mo8674c();

    /* renamed from: d */
    void mo8675d();

    /* renamed from: e */
    ByteBuffer mo8676e();

    /* renamed from: f */
    boolean mo8677f();

    /* renamed from: g */
    void mo8678g();

    /* renamed from: h */
    void mo8679h();
}
