package com.bumptech.glide.p040g.p041a;

import android.support.p009v4.p019g.C0505k.C0506a;
import android.support.p009v4.p019g.C0505k.C0507b;
import android.support.p009v4.p019g.C0505k.C0508c;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bumptech.glide.g.a.a */
public final class C1238a {

    /* renamed from: a */
    private static final C1245d<Object> f4456a = new C1245d<Object>() {
        /* renamed from: a */
        public void mo5872a(Object obj) {
        }
    };

    /* renamed from: com.bumptech.glide.g.a.a$a */
    public interface C1242a<T> {
        /* renamed from: b */
        T mo5874b();
    }

    /* renamed from: com.bumptech.glide.g.a.a$b */
    private static final class C1243b<T> implements C0506a<T> {

        /* renamed from: a */
        private final C1242a<T> f4457a;

        /* renamed from: b */
        private final C1245d<T> f4458b;

        /* renamed from: c */
        private final C0506a<T> f4459c;

        C1243b(C0506a<T> aVar, C1242a<T> aVar2, C1245d<T> dVar) {
            this.f4459c = aVar;
            this.f4457a = aVar2;
            this.f4458b = dVar;
        }

        /* renamed from: a */
        public T mo2001a() {
            T a = this.f4459c.mo2001a();
            if (a == null) {
                a = this.f4457a.mo5874b();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Created new ");
                    sb.append(a.getClass());
                    Log.v("FactoryPools", sb.toString());
                }
            }
            if (a instanceof C1244c) {
                ((C1244c) a).mo5876c_().mo5877a(false);
            }
            return a;
        }

        /* renamed from: a */
        public boolean mo2002a(T t) {
            if (t instanceof C1244c) {
                ((C1244c) t).mo5876c_().mo5877a(true);
            }
            this.f4458b.mo5872a(t);
            return this.f4459c.mo2002a(t);
        }
    }

    /* renamed from: com.bumptech.glide.g.a.a$c */
    public interface C1244c {
        /* renamed from: c_ */
        C1247c mo5876c_();
    }

    /* renamed from: com.bumptech.glide.g.a.a$d */
    public interface C1245d<T> {
        /* renamed from: a */
        void mo5872a(T t);
    }

    /* renamed from: a */
    public static <T> C0506a<List<T>> m6641a() {
        return m6642a(20);
    }

    /* renamed from: a */
    public static <T> C0506a<List<T>> m6642a(int i) {
        return m6645a(new C0508c(i), new C1242a<List<T>>() {
            /* renamed from: a */
            public List<T> mo5874b() {
                return new ArrayList();
            }
        }, new C1245d<List<T>>() {
            /* renamed from: a */
            public void mo5872a(List<T> list) {
                list.clear();
            }
        });
    }

    /* renamed from: a */
    public static <T extends C1244c> C0506a<T> m6643a(int i, C1242a<T> aVar) {
        return m6644a((C0506a<T>) new C0507b<T>(i), aVar);
    }

    /* renamed from: a */
    private static <T extends C1244c> C0506a<T> m6644a(C0506a<T> aVar, C1242a<T> aVar2) {
        return m6645a(aVar, aVar2, m6647b());
    }

    /* renamed from: a */
    private static <T> C0506a<T> m6645a(C0506a<T> aVar, C1242a<T> aVar2, C1245d<T> dVar) {
        return new C1243b(aVar, aVar2, dVar);
    }

    /* renamed from: b */
    public static <T extends C1244c> C0506a<T> m6646b(int i, C1242a<T> aVar) {
        return m6644a((C0506a<T>) new C0508c<T>(i), aVar);
    }

    /* renamed from: b */
    private static <T> C1245d<T> m6647b() {
        return f4456a;
    }
}
