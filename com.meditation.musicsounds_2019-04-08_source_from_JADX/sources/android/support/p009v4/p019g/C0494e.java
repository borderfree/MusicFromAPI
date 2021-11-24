package android.support.p009v4.p019g;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.g.e */
public class C0494e extends Writer {

    /* renamed from: a */
    private final String f1470a;

    /* renamed from: b */
    private StringBuilder f1471b = new StringBuilder(128);

    public C0494e(String str) {
        this.f1470a = str;
    }

    /* renamed from: a */
    private void m2202a() {
        if (this.f1471b.length() > 0) {
            Log.d(this.f1470a, this.f1471b.toString());
            this.f1471b.delete(0, this.f1471b.length());
        }
    }

    public void close() {
        m2202a();
    }

    public void flush() {
        m2202a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m2202a();
            } else {
                this.f1471b.append(c);
            }
        }
    }
}
