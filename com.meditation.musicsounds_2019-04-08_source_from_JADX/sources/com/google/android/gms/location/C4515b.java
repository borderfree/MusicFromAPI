package com.google.android.gms.location;

import android.os.SystemClock;
import com.google.android.gms.internal.location.zzbh;

/* renamed from: com.google.android.gms.location.b */
public interface C4515b {

    /* renamed from: com.google.android.gms.location.b$a */
    public static final class C4516a {

        /* renamed from: a */
        private String f16512a = null;

        /* renamed from: b */
        private int f16513b = 0;

        /* renamed from: c */
        private long f16514c = Long.MIN_VALUE;

        /* renamed from: d */
        private short f16515d = -1;

        /* renamed from: e */
        private double f16516e;

        /* renamed from: f */
        private double f16517f;

        /* renamed from: g */
        private float f16518g;

        /* renamed from: h */
        private int f16519h = 0;

        /* renamed from: i */
        private int f16520i = -1;

        /* renamed from: a */
        public final C4516a mo14972a(double d, double d2, float f) {
            this.f16515d = 1;
            this.f16516e = d;
            this.f16517f = d2;
            this.f16518g = f;
            return this;
        }

        /* renamed from: a */
        public final C4516a mo14973a(int i) {
            this.f16513b = i;
            return this;
        }

        /* renamed from: a */
        public final C4516a mo14974a(long j) {
            if (j < 0) {
                this.f16514c = -1;
            } else {
                this.f16514c = SystemClock.elapsedRealtime() + j;
            }
            return this;
        }

        /* renamed from: a */
        public final C4516a mo14975a(String str) {
            this.f16512a = str;
            return this;
        }

        /* renamed from: a */
        public final C4515b mo14976a() {
            if (this.f16512a == null) {
                throw new IllegalArgumentException("Request ID not set.");
            } else if (this.f16513b == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            } else if ((this.f16513b & 4) != 0 && this.f16520i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            } else if (this.f16514c == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Expiration not set.");
            } else if (this.f16515d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            } else if (this.f16519h >= 0) {
                zzbh zzbh = new zzbh(this.f16512a, this.f16513b, 1, this.f16516e, this.f16517f, this.f16518g, this.f16514c, this.f16519h, this.f16520i);
                return zzbh;
            } else {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
        }

        /* renamed from: b */
        public final C4516a mo14977b(int i) {
            this.f16520i = i;
            return this;
        }
    }

    /* renamed from: a */
    String mo14087a();
}
