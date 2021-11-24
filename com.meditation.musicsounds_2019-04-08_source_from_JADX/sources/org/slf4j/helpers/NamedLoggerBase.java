package org.slf4j.helpers;

import java.io.Serializable;
import org.slf4j.C6876b;
import org.slf4j.C6877c;

abstract class NamedLoggerBase implements Serializable, C6876b {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    NamedLoggerBase() {
    }

    public String getName() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return C6877c.m32902a(getName());
    }
}
