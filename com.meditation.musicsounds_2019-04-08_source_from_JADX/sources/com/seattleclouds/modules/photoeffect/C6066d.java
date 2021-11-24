package com.seattleclouds.modules.photoeffect;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.bitmapfun.AsyncTask;
import com.seattleclouds.util.C6638s;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: com.seattleclouds.modules.photoeffect.d */
public class C6066d extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: d */
    private final Uri f21528d;

    /* renamed from: e */
    private final File f21529e;

    /* renamed from: f */
    private final int f21530f;

    /* renamed from: g */
    private WeakReference<C6067a> f21531g;

    /* renamed from: h */
    private WeakReference<ContentResolver> f21532h;

    /* renamed from: com.seattleclouds.modules.photoeffect.d$a */
    public interface C6067a {
        /* renamed from: a */
        void mo19115a(Bitmap bitmap);

        /* renamed from: as */
        void mo19117as();

        /* renamed from: e */
        void mo19119e();
    }

    public C6066d(Uri uri, ContentResolver contentResolver, File file, int i) {
        this.f21528d = uri;
        this.f21529e = file;
        this.f21532h = new WeakReference<>(contentResolver);
        this.f21530f = i;
    }

    public C6066d(File file, int i) {
        this.f21528d = null;
        this.f21529e = file;
        this.f21530f = i;
    }

    /* renamed from: d */
    private C6067a m29677d() {
        if (this.f21531g == null) {
            return null;
        }
        return (C6067a) this.f21531g.get();
    }

    /* renamed from: e */
    private Bitmap m29678e() {
        if (this.f21529e != null) {
            try {
                return C6638s.m32077b(this.f21529e.getAbsolutePath(), this.f21530f);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0031 A[SYNTHETIC, Splitter:B:20:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0038 A[SYNTHETIC, Splitter:B:27:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x003f A[SYNTHETIC, Splitter:B:34:0x003f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo8517a(java.lang.Void... r4) {
        /*
            r3 = this;
            android.net.Uri r4 = r3.f21528d
            if (r4 == 0) goto L_0x0043
            java.lang.ref.WeakReference<android.content.ContentResolver> r4 = r3.f21532h
            java.lang.Object r4 = r4.get()
            android.content.ContentResolver r4 = (android.content.ContentResolver) r4
            r0 = 0
            if (r4 != 0) goto L_0x0010
            return r0
        L_0x0010:
            android.net.Uri r1 = r3.f21528d     // Catch:{ FileNotFoundException -> 0x003c, IOException -> 0x0035, all -> 0x002b }
            java.io.InputStream r4 = r4.openInputStream(r1)     // Catch:{ FileNotFoundException -> 0x003c, IOException -> 0x0035, all -> 0x002b }
            java.io.File r1 = r3.f21529e     // Catch:{ FileNotFoundException -> 0x0029, IOException -> 0x0027, all -> 0x0025 }
            com.seattleclouds.modules.photoeffect.C6068e.m29690a(r4, r1)     // Catch:{ FileNotFoundException -> 0x0029, IOException -> 0x0027, all -> 0x0025 }
            android.graphics.Bitmap r1 = r3.m29678e()     // Catch:{ FileNotFoundException -> 0x0029, IOException -> 0x0027, all -> 0x0025 }
            if (r4 == 0) goto L_0x0024
            r4.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return r1
        L_0x0025:
            r0 = move-exception
            goto L_0x002f
        L_0x0027:
            goto L_0x0036
        L_0x0029:
            goto L_0x003d
        L_0x002b:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
        L_0x002f:
            if (r4 == 0) goto L_0x0034
            r4.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            throw r0
        L_0x0035:
            r4 = r0
        L_0x0036:
            if (r4 == 0) goto L_0x003b
            r4.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            return r0
        L_0x003c:
            r4 = r0
        L_0x003d:
            if (r4 == 0) goto L_0x0042
            r4.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        L_0x0043:
            android.graphics.Bitmap r4 = r3.m29678e()
            if (r4 == 0) goto L_0x0053
            java.io.File r0 = r3.f21529e
            java.lang.String r0 = r0.getAbsolutePath()
            android.graphics.Bitmap r4 = com.seattleclouds.modules.photoeffect.C6068e.m29688a(r4, r0)
        L_0x0053:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.photoeffect.C6066d.mo8517a(java.lang.Void[]):android.graphics.Bitmap");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8518a() {
        super.mo8518a();
        C6067a d = m29677d();
        if (d != null) {
            d.mo19119e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8519a(Bitmap bitmap) {
        super.mo8519a(bitmap);
        C6067a d = m29677d();
        if (d == null) {
            return;
        }
        if (bitmap == null) {
            d.mo19117as();
        } else {
            d.mo19115a(bitmap);
        }
    }

    /* renamed from: a */
    public void mo19149a(C6067a aVar) {
        if (aVar == null) {
            this.f21531g.clear();
            this.f21531g = null;
            return;
        }
        this.f21531g = new WeakReference<>(aVar);
    }
}
