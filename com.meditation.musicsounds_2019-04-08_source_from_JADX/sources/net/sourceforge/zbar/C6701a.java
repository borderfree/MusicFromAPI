package net.sourceforge.zbar;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: net.sourceforge.zbar.a */
public class C6701a implements Iterator<Symbol> {

    /* renamed from: a */
    private Symbol f23547a;

    C6701a(Symbol symbol) {
        this.f23547a = symbol;
    }

    /* renamed from: a */
    public Symbol next() {
        if (this.f23547a != null) {
            Symbol symbol = this.f23547a;
            long next = this.f23547a.next();
            if (next != 0) {
                this.f23547a = new Symbol(next);
            } else {
                this.f23547a = null;
            }
            return symbol;
        }
        throw new NoSuchElementException("access past end of SymbolIterator");
    }

    public boolean hasNext() {
        return this.f23547a != null;
    }

    public void remove() {
        throw new UnsupportedOperationException("SymbolIterator is immutable");
    }
}
