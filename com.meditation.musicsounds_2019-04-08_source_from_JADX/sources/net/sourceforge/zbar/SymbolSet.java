package net.sourceforge.zbar;

import java.util.AbstractCollection;
import java.util.Iterator;

public class SymbolSet extends AbstractCollection<Symbol> {
    private long peer;

    static {
        System.loadLibrary("zbarjni");
        init();
    }

    SymbolSet(long j) {
        this.peer = j;
    }

    private native void destroy(long j);

    private native long firstSymbol(long j);

    private static native void init();

    /* renamed from: a */
    public synchronized void mo20851a() {
        if (this.peer != 0) {
            destroy(this.peer);
            this.peer = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        mo20851a();
    }

    public Iterator<Symbol> iterator() {
        long firstSymbol = firstSymbol(this.peer);
        return firstSymbol == 0 ? new C6701a(null) : new C6701a(new Symbol(firstSymbol));
    }

    public native int size();
}
