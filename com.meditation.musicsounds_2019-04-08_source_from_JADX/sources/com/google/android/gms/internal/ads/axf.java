package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@C3464ci
final class axf {

    /* renamed from: a */
    final zzjj f13273a;

    /* renamed from: b */
    final String f13274b;

    /* renamed from: c */
    final int f13275c;

    axf(axb axb) {
        this(axb.mo12566a(), axb.mo12570c(), axb.mo12569b());
    }

    private axf(zzjj zzjj, String str, int i) {
        this.f13273a = zzjj;
        this.f13274b = str;
        this.f13275c = i;
    }

    /* renamed from: a */
    static axf m17598a(String str) {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                axf axf = new axf((zzjj) zzjj.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return axf;
            } catch (ParseException | IllegalArgumentException | IllegalStateException e) {
                zzbv.zzeo().mo13047a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo12587a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f13274b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f13275c);
            this.f13273a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            C3643iy.m19174c("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
