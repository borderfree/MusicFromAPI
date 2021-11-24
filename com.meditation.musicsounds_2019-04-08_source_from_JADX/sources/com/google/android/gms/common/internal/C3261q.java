package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.q */
public final class C3261q {

    /* renamed from: com.google.android.gms.common.internal.q$a */
    public static final class C3262a {

        /* renamed from: a */
        private final List<String> f11115a;

        /* renamed from: b */
        private final Object f11116b;

        private C3262a(Object obj) {
            this.f11116b = C3266s.m14913a(obj);
            this.f11115a = new ArrayList();
        }

        /* renamed from: a */
        public final C3262a mo11288a(String str, Object obj) {
            List<String> list = this.f11115a;
            String str2 = (String) C3266s.m14913a(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(valueOf).length());
            sb.append(str2);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f11116b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f11115a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f11115a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static int m14904a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: a */
    public static C3262a m14905a(Object obj) {
        return new C3262a(obj);
    }

    /* renamed from: a */
    public static boolean m14906a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
