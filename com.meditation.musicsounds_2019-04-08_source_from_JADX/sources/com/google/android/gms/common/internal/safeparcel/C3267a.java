package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
public class C3267a {
    /* renamed from: a */
    public static int m14955a(Parcel parcel) {
        return m14976b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m14956a(Parcel parcel, int i) {
        m14979c(parcel, i);
    }

    /* renamed from: a */
    public static void m14957a(Parcel parcel, int i, byte b) {
        m14977b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m14958a(Parcel parcel, int i, double d) {
        m14977b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m14959a(Parcel parcel, int i, float f) {
        m14977b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m14960a(Parcel parcel, int i, int i2) {
        m14977b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m14961a(Parcel parcel, int i, long j) {
        m14977b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m14962a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeBundle(bundle);
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static void m14963a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static void m14964a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static void m14965a(Parcel parcel, int i, Double d, boolean z) {
        if (d == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        m14977b(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    /* renamed from: a */
    public static void m14966a(Parcel parcel, int i, Float f, boolean z) {
        if (f == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        m14977b(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    /* renamed from: a */
    public static void m14967a(Parcel parcel, int i, Long l, boolean z) {
        if (l == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        m14977b(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    /* renamed from: a */
    public static void m14968a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeString(str);
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static void m14969a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static void m14970a(Parcel parcel, int i, short s) {
        m14977b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m14971a(Parcel parcel, int i, boolean z) {
        m14977b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m14972a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeByteArray(bArr);
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m14973a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeInt(r7);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m14975a(parcel, t, i2);
            }
        }
        m14979c(parcel, b);
    }

    /* renamed from: a */
    public static void m14974a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeStringArray(strArr);
        m14979c(parcel, b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m14975a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static int m14976b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    private static void m14977b(Parcel parcel, int i, int i2) {
        if (i2 >= 65535) {
            parcel.writeInt(i | -65536);
            parcel.writeInt(i2);
            return;
        }
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: b */
    public static void m14978b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        parcel.writeStringList(list);
        m14979c(parcel, b);
    }

    /* renamed from: c */
    private static void m14979c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        int i2 = dataPosition - i;
        parcel.setDataPosition(i - 4);
        parcel.writeInt(i2);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m14980c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                m14977b(parcel, i, 0);
            }
            return;
        }
        int b = m14976b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                m14975a(parcel, (T) parcelable, 0);
            }
        }
        m14979c(parcel, b);
    }
}
