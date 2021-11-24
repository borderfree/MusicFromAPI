package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.C2452c;
import com.google.android.exoplayer2.drm.C2517a;
import com.google.android.exoplayer2.drm.C2519c;
import com.google.android.exoplayer2.mediacodec.C2679b;
import com.google.android.exoplayer2.metadata.C2686d;
import com.google.android.exoplayer2.metadata.C2686d.C2687a;
import com.google.android.exoplayer2.text.C2796i;
import com.google.android.exoplayer2.text.C2796i.C2797a;
import com.google.android.exoplayer2.video.C2823c;
import com.google.android.exoplayer2.video.C2829e;
import java.util.ArrayList;

/* renamed from: com.google.android.exoplayer2.d */
public class C2514d implements C2712o {

    /* renamed from: a */
    private final Context f8133a;

    /* renamed from: b */
    private final C2517a<C2519c> f8134b;

    /* renamed from: c */
    private final int f8135c;

    /* renamed from: d */
    private final long f8136d;

    public C2514d(Context context) {
        this(context, null);
    }

    public C2514d(Context context, C2517a<C2519c> aVar) {
        this(context, aVar, 0);
    }

    public C2514d(Context context, C2517a<C2519c> aVar, int i) {
        this(context, aVar, i, 5000);
    }

    public C2514d(Context context, C2517a<C2519c> aVar, int i, long j) {
        this.f8133a = context;
        this.f8134b = aVar;
        this.f8135c = i;
        this.f8136d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8883a(Context context, Handler handler, int i, ArrayList<C2671l> arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8884a(Context context, C2517a<C2519c> aVar, long j, Handler handler, C2829e eVar, int i, ArrayList<C2671l> arrayList) {
        int i2 = i;
        ArrayList<C2671l> arrayList2 = arrayList;
        C2823c cVar = new C2823c(context, C2679b.f9173a, j, aVar, false, handler, eVar, 50);
        arrayList2.add(cVar);
        if (i2 != 0) {
            int size = arrayList.size();
            if (i2 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (C2671l) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Boolean.TYPE, Long.TYPE, Handler.class, C2829e.class, Integer.TYPE}).newInstance(new Object[]{Boolean.valueOf(true), Long.valueOf(j), handler, eVar, Integer.valueOf(50)}));
                Log.i("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005c A[ExcHandler: Exception (r0v5 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[ExcHandler: Exception (r0v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:19:0x0066] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8885a(android.content.Context r13, com.google.android.exoplayer2.drm.C2517a<com.google.android.exoplayer2.drm.C2519c> r14, com.google.android.exoplayer2.audio.AudioProcessor[] r15, android.os.Handler r16, com.google.android.exoplayer2.audio.C2452c r17, int r18, java.util.ArrayList<com.google.android.exoplayer2.C2671l> r19) {
        /*
            r12 = this;
            r9 = r18
            r10 = r19
            com.google.android.exoplayer2.audio.f r11 = new com.google.android.exoplayer2.audio.f
            com.google.android.exoplayer2.mediacodec.b r2 = com.google.android.exoplayer2.mediacodec.C2679b.f9173a
            com.google.android.exoplayer2.audio.b r7 = com.google.android.exoplayer2.audio.C2451b.m11493a(r13)
            r4 = 1
            r1 = r11
            r3 = r14
            r5 = r16
            r6 = r17
            r8 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.add(r11)
            if (r9 != 0) goto L_0x001d
            return
        L_0x001d:
            int r1 = r19.size()
            r2 = 2
            if (r9 != r2) goto L_0x0026
            int r1 = r1 + -1
        L_0x0026:
            r3 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r3] = r8     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.Class<com.google.android.exoplayer2.audio.c> r8 = com.google.android.exoplayer2.audio.C2452c.class
            r7[r5] = r8     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r7[r2] = r8     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            r7[r3] = r16     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            r7[r5] = r17     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            r7[r2] = r15     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            com.google.android.exoplayer2.l r6 = (com.google.android.exoplayer2.C2671l) r6     // Catch:{ ClassNotFoundException -> 0x0063, Exception -> 0x005c }
            int r7 = r1 + 1
            r10.add(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0064, Exception -> 0x005c }
            java.lang.String r1 = "DefaultRenderersFactory"
            java.lang.String r6 = "Loaded LibopusAudioRenderer."
            android.util.Log.i(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0064, Exception -> 0x005c }
            goto L_0x0064
        L_0x005c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0063:
            r7 = r1
        L_0x0064:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r3] = r8     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.Class<com.google.android.exoplayer2.audio.c> r8 = com.google.android.exoplayer2.audio.C2452c.class
            r6[r5] = r8     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r6[r2] = r8     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            r6[r3] = r16     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            r6[r5] = r17     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            r6[r2] = r15     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            java.lang.Object r1 = r1.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            com.google.android.exoplayer2.l r1 = (com.google.android.exoplayer2.C2671l) r1     // Catch:{ ClassNotFoundException -> 0x009e, Exception -> 0x0097 }
            int r6 = r7 + 1
            r10.add(r7, r1)     // Catch:{ ClassNotFoundException -> 0x009f, Exception -> 0x0097 }
            java.lang.String r1 = "DefaultRenderersFactory"
            java.lang.String r7 = "Loaded LibflacAudioRenderer."
            android.util.Log.i(r1, r7)     // Catch:{ ClassNotFoundException -> 0x009f, Exception -> 0x0097 }
            goto L_0x009f
        L_0x0097:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x009e:
            r6 = r7
        L_0x009f:
            java.lang.String r1 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r3] = r8     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.Class<com.google.android.exoplayer2.audio.c> r8 = com.google.android.exoplayer2.audio.C2452c.class
            r7[r5] = r8     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.Class<com.google.android.exoplayer2.audio.AudioProcessor[]> r8 = com.google.android.exoplayer2.audio.AudioProcessor[].class
            r7[r2] = r8     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            r4[r3] = r16     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            r4[r5] = r17     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            r4[r2] = r15     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.Object r0 = r1.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            com.google.android.exoplayer2.l r0 = (com.google.android.exoplayer2.C2671l) r0     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            r10.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            java.lang.String r0 = "DefaultRenderersFactory"
            java.lang.String r1 = "Loaded FfmpegAudioRenderer."
            android.util.Log.i(r0, r1)     // Catch:{ ClassNotFoundException -> 0x00d7, Exception -> 0x00d0 }
            goto L_0x00d7
        L_0x00d0:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.C2514d.mo8885a(android.content.Context, com.google.android.exoplayer2.drm.a, com.google.android.exoplayer2.audio.AudioProcessor[], android.os.Handler, com.google.android.exoplayer2.audio.c, int, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8886a(Context context, C2687a aVar, Looper looper, int i, ArrayList<C2671l> arrayList) {
        arrayList.add(new C2686d(aVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo8887a(Context context, C2797a aVar, Looper looper, int i, ArrayList<C2671l> arrayList) {
        arrayList.add(new C2796i(aVar, looper));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AudioProcessor[] mo8888a() {
        return new AudioProcessor[0];
    }

    /* renamed from: a */
    public C2671l[] mo8889a(Handler handler, C2829e eVar, C2452c cVar, C2797a aVar, C2687a aVar2) {
        ArrayList arrayList = new ArrayList();
        mo8884a(this.f8133a, this.f8134b, this.f8136d, handler, eVar, this.f8135c, arrayList);
        mo8885a(this.f8133a, this.f8134b, mo8888a(), handler, cVar, this.f8135c, arrayList);
        ArrayList arrayList2 = arrayList;
        mo8887a(this.f8133a, aVar, handler.getLooper(), this.f8135c, arrayList2);
        mo8886a(this.f8133a, aVar2, handler.getLooper(), this.f8135c, arrayList2);
        mo8883a(this.f8133a, handler, this.f8135c, arrayList);
        return (C2671l[]) arrayList.toArray(new C2671l[arrayList.size()]);
    }
}
