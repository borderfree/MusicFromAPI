package net.sourceforge.zbar;

public class Symbol {

    /* renamed from: a */
    private int f23546a;
    private long peer;

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    Symbol(long j) {
        this.peer = j;
    }

    private native void destroy(long j);

    private native int getLocationSize(long j);

    private native int getLocationX(long j, int i);

    private native int getLocationY(long j, int i);

    private native int getType(long j);

    private static native void init();

    /* renamed from: a */
    public synchronized void mo20845a() {
        if (this.peer != 0) {
            destroy(this.peer);
            this.peer = 0;
        }
    }

    /* renamed from: b */
    public int mo20846b() {
        if (this.f23546a == 0) {
            this.f23546a = getType(this.peer);
        }
        return this.f23546a;
    }

    /* renamed from: c */
    public int[] mo20847c() {
        int locationSize = getLocationSize(this.peer);
        if (locationSize <= 0) {
            return null;
        }
        int[] iArr = new int[4];
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < locationSize; i5++) {
            int locationX = getLocationX(this.peer, i5);
            if (i > locationX) {
                i = locationX;
            }
            if (i3 < locationX) {
                i3 = locationX;
            }
            int locationY = getLocationY(this.peer, i5);
            if (i2 > locationY) {
                i2 = locationY;
            }
            if (i4 < locationY) {
                i4 = locationY;
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3 - i;
        iArr[3] = i4 - i2;
        return iArr;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo20845a();
    }

    public native String getData();

    /* access modifiers changed from: 0000 */
    public native long next();
}
