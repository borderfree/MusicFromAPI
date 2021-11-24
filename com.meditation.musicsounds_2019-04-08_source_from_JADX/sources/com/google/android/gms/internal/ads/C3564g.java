package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;
import com.google.android.gms.ads.internal.zzbv;

/* renamed from: com.google.android.gms.internal.ads.g */
final class C3564g implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ String f14004a;

    /* renamed from: b */
    private final /* synthetic */ String f14005b;

    /* renamed from: c */
    private final /* synthetic */ C3537f f14006c;

    C3564g(C3537f fVar, String str, String str2) {
        this.f14006c = fVar;
        this.f14004a = str;
        this.f14005b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.f14006c.f13969b.getSystemService("download");
        try {
            String str = this.f14004a;
            String str2 = this.f14005b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            zzbv.zzem().mo13152a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f14006c.mo13247a("Could not store picture.");
        }
    }
}
