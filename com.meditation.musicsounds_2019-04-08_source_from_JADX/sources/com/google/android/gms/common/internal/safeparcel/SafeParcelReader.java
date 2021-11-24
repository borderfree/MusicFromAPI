package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int dataPosition = parcel.dataPosition();
            int dataSize = parcel.dataSize();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 41);
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(dataPosition);
            sb.append(" size=");
            sb.append(dataSize);
            super(sb.toString());
        }
    }

    /* renamed from: a */
    public static int m14927a(int i) {
        return i & 65535;
    }

    /* renamed from: a */
    public static int m14928a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static int m14929a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m14930a(Parcel parcel, int i, Creator<T> creator) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + a);
        return t;
    }

    /* renamed from: a */
    private static void m14931a(Parcel parcel, int i, int i2) {
        int a = m14929a(parcel, i);
        if (a != i2) {
            String hexString = Integer.toHexString(a);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i2);
            sb.append(" got ");
            sb.append(a);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m14932a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
            sb.append("Expected size ");
            sb.append(i3);
            sb.append(" got ");
            sb.append(i2);
            sb.append(" (0x");
            sb.append(hexString);
            sb.append(")");
            throw new ParseException(sb.toString(), parcel);
        }
    }

    /* renamed from: b */
    public static int m14933b(Parcel parcel) {
        int a = m14928a(parcel);
        int a2 = m14929a(parcel, a);
        int dataPosition = parcel.dataPosition();
        if (m14927a(a) != 20293) {
            String str = "Expected object header. Got 0x";
            String valueOf = String.valueOf(Integer.toHexString(a));
            throw new ParseException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), parcel);
        }
        int i = a2 + dataPosition;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i);
        throw new ParseException(sb.toString(), parcel);
    }

    /* renamed from: b */
    public static void m14934b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m14929a(parcel, i));
    }

    /* renamed from: b */
    public static <T> T[] m14935b(Parcel parcel, int i, Creator<T> creator) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArray;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m14936c(Parcel parcel, int i, Creator<T> creator) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + a);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m14937c(Parcel parcel, int i) {
        m14931a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static byte m14938d(Parcel parcel, int i) {
        m14931a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: e */
    public static short m14939e(Parcel parcel, int i) {
        m14931a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: f */
    public static int m14940f(Parcel parcel, int i) {
        m14931a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: g */
    public static long m14941g(Parcel parcel, int i) {
        m14931a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: h */
    public static Long m14942h(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        if (a == 0) {
            return null;
        }
        m14932a(parcel, i, a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: i */
    public static float m14943i(Parcel parcel, int i) {
        m14931a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: j */
    public static Float m14944j(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        if (a == 0) {
            return null;
        }
        m14932a(parcel, i, a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: k */
    public static double m14945k(Parcel parcel, int i) {
        m14931a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: l */
    public static Double m14946l(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        if (a == 0) {
            return null;
        }
        m14932a(parcel, i, a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: m */
    public static String m14947m(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + a);
        return readString;
    }

    /* renamed from: n */
    public static IBinder m14948n(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + a);
        return readStrongBinder;
    }

    /* renamed from: o */
    public static Bundle m14949o(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + a);
        return readBundle;
    }

    /* renamed from: p */
    public static byte[] m14950p(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + a);
        return createByteArray;
    }

    /* renamed from: q */
    public static String[] m14951q(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + a);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList<Integer> m14952r(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + a);
        return arrayList;
    }

    /* renamed from: s */
    public static ArrayList<String> m14953s(Parcel parcel, int i) {
        int a = m14929a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + a);
        return createStringArrayList;
    }

    /* renamed from: t */
    public static void m14954t(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Overread allowed size end=");
            sb.append(i);
            throw new ParseException(sb.toString(), parcel);
        }
    }
}
