package com.seattleclouds.util;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.p009v4.app.C0366g;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5462k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.util.ah */
public class C6585ah {

    /* renamed from: a */
    final PhoneStateListener f23292a = new PhoneStateListener() {
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
            if (com.seattleclouds.util.C6585ah.m31877a(r2.f23300a) != null) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
            if (com.seattleclouds.util.C6585ah.m31877a(r2.f23300a) != null) goto L_0x000b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCallStateChanged(int r3, java.lang.String r4) {
            /*
                r2 = this;
                r0 = 1
                if (r3 != r0) goto L_0x0024
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                android.media.MediaPlayer r0 = r0.f23293b
                if (r0 == 0) goto L_0x0052
            L_0x000b:
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                com.seattleclouds.util.ah r1 = com.seattleclouds.util.C6585ah.this
                android.media.MediaPlayer r1 = r1.f23293b
                boolean r1 = r1.isPlaying()
                r0.f23296e = r1
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                android.media.MediaPlayer r0 = r0.f23293b
                r0.pause()
                goto L_0x0052
            L_0x0024:
                if (r3 != 0) goto L_0x0046
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                android.media.MediaPlayer r0 = r0.f23293b
                if (r0 == 0) goto L_0x0052
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                boolean r0 = r0.f23296e
                if (r0 == 0) goto L_0x0052
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                r1 = 0
                r0.f23296e = r1
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                android.media.MediaPlayer r0 = r0.f23293b
                r0.start()
                goto L_0x0052
            L_0x0046:
                r0 = 2
                if (r3 != r0) goto L_0x0052
                com.seattleclouds.util.ah r0 = com.seattleclouds.util.C6585ah.this
                android.media.MediaPlayer r0 = r0.f23293b
                if (r0 == 0) goto L_0x0052
                goto L_0x000b
            L_0x0052:
                super.onCallStateChanged(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.util.C6585ah.C65861.onCallStateChanged(int, java.lang.String):void");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MediaPlayer f23293b = new MediaPlayer();

    /* renamed from: c */
    private App f23294c = null;

    /* renamed from: d */
    private String f23295d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f23296e = false;

    /* renamed from: f */
    private boolean f23297f = false;

    /* renamed from: g */
    private boolean f23298g = false;

    /* renamed from: h */
    private WeakReference<C0366g> f23299h;

    /* renamed from: com.seattleclouds.util.ah$a */
    public static class C6587a extends C0366g {

        /* renamed from: ae */
        public static final String f23301ae = "com.seattleclouds.util.ah$a";

        /* renamed from: c */
        public Dialog mo1452c(Bundle bundle) {
            ProgressDialog progressDialog = new ProgressDialog(mo1318s());
            progressDialog.setMessage(mo1219a(C5462k.scmediaplayer_connection_dialog));
            progressDialog.getWindow().clearFlags(2);
            progressDialog.setCancelable(true);
            return progressDialog;
        }

        public void onCancel(DialogInterface dialogInterface) {
            super.onCancel(dialogInterface);
            App.f18487T.mo20579d();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            super.onDismiss(dialogInterface);
        }
    }

    public C6585ah(App app) {
        this.f23294c = app;
    }

    /* renamed from: c */
    private void m31880c(String str) {
        if (App.f18510l || App.f18474G) {
            StringBuilder sb = new StringBuilder();
            sb.append(App.m25654h());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(str);
            this.f23293b.setDataSource(new FileInputStream(new File(sb.toString())).getFD());
        } else if (!App.f18481N) {
            AssetManager assets = this.f23294c.getAssets();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Main/");
            sb2.append(str);
            AssetFileDescriptor openFd = assets.openFd(sb2.toString());
            this.f23293b.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
        } else if (App.f18491X == null) {
            Log.w("SCMediaPlayer", "Expansion file not loaded");
        } else {
            AssetFileDescriptor a = App.f18491X.mo5660a(str);
            if (a == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("File not found in expansion file: ");
                sb3.append(str);
                Log.w("SCMediaPlayer", sb3.toString());
                return;
            }
            this.f23293b.setDataSource(a.getFileDescriptor(), a.getStartOffset(), a.getLength());
        }
    }

    /* renamed from: i */
    private void m31881i() {
        if (!this.f23297f) {
            TelephonyManager telephonyManager = (TelephonyManager) this.f23294c.getSystemService("phone");
            if (telephonyManager != null) {
                this.f23297f = true;
                telephonyManager.listen(this.f23292a, 32);
            }
        }
    }

    /* renamed from: j */
    private void m31882j() {
        if (this.f23297f) {
            this.f23297f = false;
            TelephonyManager telephonyManager = (TelephonyManager) this.f23294c.getSystemService("phone");
            if (telephonyManager != null) {
                telephonyManager.listen(this.f23292a, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo20572a() {
        if (!this.f23293b.isPlaying()) {
            this.f23293b.start();
        }
    }

    /* renamed from: a */
    public void mo20573a(C0366g gVar) {
        this.f23299h = new WeakReference<>(gVar);
    }

    /* renamed from: a */
    public void mo20574a(boolean z) {
        this.f23298g = z;
    }

    /* renamed from: a */
    public boolean mo20575a(String str) {
        String str2;
        StringBuilder sb;
        mo20578c();
        try {
            m31880c(str);
            this.f23293b.prepare();
            this.f23293b.start();
            m31881i();
            this.f23295d = str;
            return true;
        } catch (IllegalStateException e) {
            e = e;
            str2 = "SCMediaPlayer";
            sb = new StringBuilder();
            sb.append("playAudioFile: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
            return false;
        } catch (IOException e2) {
            e = e2;
            str2 = "SCMediaPlayer";
            sb = new StringBuilder();
            sb.append("playAudioFile: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: b */
    public void mo20576b() {
        if (this.f23293b.isPlaying()) {
            this.f23293b.pause();
        }
    }

    /* renamed from: b */
    public boolean mo20577b(String str) {
        String str2;
        StringBuilder sb;
        mo20578c();
        try {
            if (!str.contains("://")) {
                m31880c(str);
            } else {
                this.f23293b.setDataSource(str);
            }
            this.f23293b.prepare();
            this.f23293b.start();
            m31881i();
            this.f23295d = str;
            return true;
        } catch (IllegalArgumentException e) {
            e = e;
            str2 = "SCMediaPlayer";
            sb = new StringBuilder();
            sb.append("playSource: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
            return false;
        } catch (IllegalStateException e2) {
            e = e2;
            str2 = "SCMediaPlayer";
            sb = new StringBuilder();
            sb.append("playSource: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
            return false;
        } catch (IOException e3) {
            e = e3;
            str2 = "SCMediaPlayer";
            sb = new StringBuilder();
            sb.append("playSource: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
            return false;
        }
    }

    /* renamed from: c */
    public void mo20578c() {
        if (this.f23293b.isPlaying()) {
            this.f23293b.stop();
        }
        this.f23293b.reset();
        m31882j();
        this.f23295d = null;
    }

    /* renamed from: d */
    public void mo20579d() {
        this.f23293b.stop();
        this.f23293b.reset();
        m31882j();
        this.f23295d = null;
    }

    /* renamed from: e */
    public boolean mo20580e() {
        if (this.f23293b == null) {
            return false;
        }
        try {
            return this.f23293b.isPlaying();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public String mo20581f() {
        return this.f23295d;
    }

    /* renamed from: g */
    public boolean mo20582g() {
        return this.f23298g;
    }

    /* renamed from: h */
    public C0366g mo20583h() {
        if (this.f23299h != null) {
            return (C0366g) this.f23299h.get();
        }
        return null;
    }
}
