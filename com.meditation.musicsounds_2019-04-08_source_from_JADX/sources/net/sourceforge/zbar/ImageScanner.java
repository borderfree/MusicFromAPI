package net.sourceforge.zbar;

public class ImageScanner {
    private long peer = create();

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    private native long create();

    private native void destroy(long j);

    private native long getResults(long j);

    private static native void init();

    /* renamed from: a */
    public synchronized void mo20840a() {
        if (this.peer != 0) {
            destroy(this.peer);
            this.peer = 0;
        }
    }

    /* renamed from: b */
    public SymbolSet mo20841b() {
        return new SymbolSet(getResults(this.peer));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo20840a();
    }

    public native int scanImage(Image image);

    public native void setConfig(int i, int i2, int i3);
}
