package com.google.android.exoplayer2.extractor.p107e;

import android.util.SparseArray;
import com.google.android.exoplayer2.extractor.C2651h;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.p102c.C2509q;
import java.util.Collections;
import java.util.List;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.google.android.exoplayer2.extractor.e.v */
public interface C2634v {

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$a */
    public static final class C2635a {

        /* renamed from: a */
        public final String f8953a;

        /* renamed from: b */
        public final int f8954b;

        /* renamed from: c */
        public final byte[] f8955c;

        public C2635a(String str, int i, byte[] bArr) {
            this.f8953a = str;
            this.f8954b = i;
            this.f8955c = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$b */
    public static final class C2636b {

        /* renamed from: a */
        public final int f8956a;

        /* renamed from: b */
        public final String f8957b;

        /* renamed from: c */
        public final List<C2635a> f8958c;

        /* renamed from: d */
        public final byte[] f8959d;

        public C2636b(int i, String str, List<C2635a> list, byte[] bArr) {
            this.f8956a = i;
            this.f8957b = str;
            this.f8958c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f8959d = bArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$c */
    public interface C2637c {
        /* renamed from: a */
        SparseArray<C2634v> mo9065a();

        /* renamed from: a */
        C2634v mo9066a(int i, C2636b bVar);
    }

    /* renamed from: com.google.android.exoplayer2.extractor.e.v$d */
    public static final class C2638d {

        /* renamed from: a */
        private final String f8960a;

        /* renamed from: b */
        private final int f8961b;

        /* renamed from: c */
        private final int f8962c;

        /* renamed from: d */
        private int f8963d;

        /* renamed from: e */
        private String f8964e;

        public C2638d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public C2638d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
                str = sb.toString();
            } else {
                str = "";
            }
            this.f8960a = str;
            this.f8961b = i2;
            this.f8962c = i3;
            this.f8963d = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        private void m12436d() {
            if (this.f8963d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        /* renamed from: a */
        public void mo9099a() {
            this.f8963d = this.f8963d == Integer.MIN_VALUE ? this.f8961b : this.f8963d + this.f8962c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8960a);
            sb.append(this.f8963d);
            this.f8964e = sb.toString();
        }

        /* renamed from: b */
        public int mo9100b() {
            m12436d();
            return this.f8963d;
        }

        /* renamed from: c */
        public String mo9101c() {
            m12436d();
            return this.f8964e;
        }
    }

    /* renamed from: a */
    void mo9090a();

    /* renamed from: a */
    void mo9091a(C2500k kVar, boolean z);

    /* renamed from: a */
    void mo9092a(C2509q qVar, C2651h hVar, C2638d dVar);
}
