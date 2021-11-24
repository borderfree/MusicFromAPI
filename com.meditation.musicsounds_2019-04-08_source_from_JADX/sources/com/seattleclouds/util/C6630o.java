package com.seattleclouds.util;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;

/* renamed from: com.seattleclouds.util.o */
public class C6630o extends MediaScannerConnection {

    /* renamed from: com.seattleclouds.util.o$a */
    static class C6631a implements MediaScannerConnectionClient {

        /* renamed from: a */
        final String[] f23355a;

        /* renamed from: b */
        final String[] f23356b;

        /* renamed from: c */
        final C6632b f23357c;

        /* renamed from: d */
        MediaScannerConnection f23358d;

        /* renamed from: e */
        int f23359e;

        C6631a(String[] strArr, String[] strArr2, C6632b bVar) {
            this.f23355a = strArr;
            this.f23356b = strArr2;
            this.f23357c = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo20612a() {
            if (this.f23359e >= this.f23355a.length) {
                this.f23358d.disconnect();
                return;
            }
            this.f23358d.scanFile(this.f23355a[this.f23359e], this.f23356b != null ? this.f23356b[this.f23359e] : null);
            this.f23359e++;
        }

        public void onMediaScannerConnected() {
            mo20612a();
        }

        public void onScanCompleted(String str, Uri uri) {
            if (this.f23357c != null) {
                this.f23357c.mo19146a(str, uri);
            }
            mo20612a();
        }
    }

    /* renamed from: com.seattleclouds.util.o$b */
    public interface C6632b {
        /* renamed from: a */
        void mo19146a(String str, Uri uri);
    }

    /* renamed from: a */
    public static void m32048a(Context context, String str, String str2, C6632b bVar) {
        C6631a aVar = new C6631a(new String[]{str}, new String[]{str2}, bVar);
        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(context, aVar);
        aVar.f23358d = mediaScannerConnection;
        mediaScannerConnection.connect();
    }
}
