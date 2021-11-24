package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3267a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.C3307l;
import java.io.DataInputStream;
import java.io.IOException;

@C3464ci
public final class zzaev extends AbstractSafeParcelable {
    public static final Creator<zzaev> CREATOR = new C3502dt();

    /* renamed from: a */
    private ParcelFileDescriptor f15335a;

    /* renamed from: b */
    private Parcelable f15336b;

    /* renamed from: c */
    private boolean f15337c;

    public zzaev(ParcelFileDescriptor parcelFileDescriptor) {
        this.f15335a = parcelFileDescriptor;
        this.f15336b = null;
        this.f15337c = true;
    }

    public zzaev(SafeParcelable safeParcelable) {
        this.f15335a = null;
        this.f15336b = safeParcelable;
        this.f15337c = false;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private final ParcelFileDescriptor m20613a() {
        if (this.f15335a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f15336b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f15335a = m20614a(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f15335a;
    }

    /* renamed from: a */
    private final <T> ParcelFileDescriptor m20614a(byte[] bArr) {
        AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new AutoCloseOutputStream(createPipe[1]);
            try {
                new Thread(new C3501ds(this, autoCloseOutputStream, bArr)).start();
                return createPipe[0];
            } catch (IOException e) {
                e = e;
                C3643iy.m19173b("Error transporting the ad response", e);
                zzbv.zzeo().mo13047a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                C3307l.m15066a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e2) {
            e = e2;
            autoCloseOutputStream = null;
            C3643iy.m19173b("Error transporting the ad response", e);
            zzbv.zzeo().mo13047a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            C3307l.m15066a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final <T extends SafeParcelable> T mo13884a(Creator<T> creator) {
        if (this.f15337c) {
            if (this.f15335a == null) {
                C3643iy.m19174c("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new AutoCloseInputStream(this.f15335a));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                C3307l.m15066a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f15336b = (SafeParcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f15337c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e) {
                C3643iy.m19173b("Could not read from parcel file descriptor", e);
                C3307l.m15066a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                C3307l.m15066a(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.f15336b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        m20613a();
        int a = C3267a.m14955a(parcel);
        C3267a.m14964a(parcel, 2, (Parcelable) this.f15335a, i, false);
        C3267a.m14956a(parcel, a);
    }
}
