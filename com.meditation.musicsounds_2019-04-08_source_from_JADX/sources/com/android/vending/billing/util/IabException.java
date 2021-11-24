package com.android.vending.billing.util;

public class IabException extends Exception {
    C1161c mResult;

    public IabException(int i, String str) {
        this(new C1161c(i, str));
    }

    public IabException(int i, String str, Exception exc) {
        this(new C1161c(i, str), exc);
    }

    public IabException(C1161c cVar) {
        this(cVar, (Exception) null);
    }

    public IabException(C1161c cVar, Exception exc) {
        super(cVar.mo5632b(), exc);
        this.mResult = cVar;
    }

    public C1161c getResult() {
        return this.mResult;
    }
}
