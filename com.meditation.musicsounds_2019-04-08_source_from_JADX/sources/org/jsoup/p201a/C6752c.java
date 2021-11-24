package org.jsoup.p201a;

import org.jsoup.nodes.C6766f;

/* renamed from: org.jsoup.a.c */
public abstract class C6752c {

    /* renamed from: org.jsoup.a.c$a */
    public static final class C6753a extends C6752c {

        /* renamed from: a */
        private String f23714a;

        public C6753a(String str) {
            this.f23714a = str;
        }

        /* renamed from: a */
        public boolean mo21213a(C6766f fVar, C6766f fVar2) {
            return fVar2.mo21281h().equals(this.f23714a);
        }

        public String toString() {
            return String.format("%s", new Object[]{this.f23714a});
        }
    }

    C6752c() {
    }

    /* renamed from: a */
    public abstract boolean mo21213a(C6766f fVar, C6766f fVar2);
}
