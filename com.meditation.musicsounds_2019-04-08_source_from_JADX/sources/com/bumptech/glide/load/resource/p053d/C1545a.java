package com.bumptech.glide.load.resource.p053d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import com.bumptech.glide.load.C1290b;
import com.bumptech.glide.load.C1379e;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.resource.C1495b;
import com.bumptech.glide.p035b.C1180a;
import com.bumptech.glide.p035b.C1180a.C1181a;
import com.bumptech.glide.p035b.C1183c;
import com.bumptech.glide.p035b.C1184d;
import com.bumptech.glide.p035b.C1185e;
import com.bumptech.glide.p040g.C1253e;
import com.bumptech.glide.p040g.C1258j;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.resource.d.a */
public class C1545a implements C1488f<ByteBuffer, C1549c> {

    /* renamed from: a */
    private static final C1546a f5018a = new C1546a();

    /* renamed from: b */
    private static final C1547b f5019b = new C1547b();

    /* renamed from: c */
    private final Context f5020c;

    /* renamed from: d */
    private final List<ImageHeaderParser> f5021d;

    /* renamed from: e */
    private final C1547b f5022e;

    /* renamed from: f */
    private final C1546a f5023f;

    /* renamed from: g */
    private final C1548b f5024g;

    /* renamed from: com.bumptech.glide.load.resource.d.a$a */
    static class C1546a {
        C1546a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C1180a mo6360a(C1181a aVar, C1183c cVar, ByteBuffer byteBuffer, int i) {
            return new C1185e(aVar, cVar, byteBuffer, i);
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.d.a$b */
    static class C1547b {

        /* renamed from: a */
        private final Queue<C1184d> f5025a = C1258j.m6706a(0);

        C1547b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized C1184d mo6361a(ByteBuffer byteBuffer) {
            C1184d dVar;
            dVar = (C1184d) this.f5025a.poll();
            if (dVar == null) {
                dVar = new C1184d();
            }
            return dVar.mo5730a(byteBuffer);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public synchronized void mo6362a(C1184d dVar) {
            dVar.mo5731a();
            this.f5025a.offer(dVar);
        }
    }

    public C1545a(Context context, List<ImageHeaderParser> list, C1398e eVar, C1393b bVar) {
        this(context, list, eVar, bVar, f5019b, f5018a);
    }

    C1545a(Context context, List<ImageHeaderParser> list, C1398e eVar, C1393b bVar, C1547b bVar2, C1546a aVar) {
        this.f5020c = context.getApplicationContext();
        this.f5021d = list;
        this.f5023f = aVar;
        this.f5024g = new C1548b(eVar, bVar);
        this.f5022e = bVar2;
    }

    /* renamed from: a */
    private static int m7667a(C1183c cVar, int i, int i2) {
        int min = Math.min(cVar.mo5726a() / i2, cVar.mo5727b() / i);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Downsampling GIF, sampleSize: ");
            sb.append(max);
            sb.append(", target dimens: [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("], actual dimens: [");
            sb.append(cVar.mo5727b());
            sb.append("x");
            sb.append(cVar.mo5726a());
            sb.append("]");
            Log.v("BufferGifDecoder", sb.toString());
        }
        return max;
    }

    /* renamed from: a */
    private C1552e m7668a(ByteBuffer byteBuffer, int i, int i2, C1184d dVar, C1379e eVar) {
        long a = C1253e.m6677a();
        try {
            C1183c b = dVar.mo5732b();
            if (b.mo5728c() > 0) {
                if (b.mo5729d() == 0) {
                    Config config = eVar.mo6062a(C1560i.f5062a) == DecodeFormat.PREFER_RGB_565 ? Config.RGB_565 : Config.ARGB_8888;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    C1180a a2 = this.f5023f.mo6360a(this.f5024g, b, byteBuffer, m7667a(b, i, i2));
                    a2.mo5711a(config);
                    a2.mo5712b();
                    Bitmap h = a2.mo5718h();
                    if (h == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Decoded GIF from stream in ");
                            sb.append(C1253e.m6676a(a));
                            Log.v("BufferGifDecoder", sb.toString());
                        }
                        return null;
                    }
                    C1549c cVar = new C1549c(this.f5020c, a2, C1495b.m7470a(), i, i2, h);
                    C1552e eVar2 = new C1552e(cVar);
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Decoded GIF from stream in ");
                        sb2.append(C1253e.m6676a(a));
                        Log.v("BufferGifDecoder", sb2.toString());
                    }
                    return eVar2;
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Decoded GIF from stream in ");
                sb3.append(C1253e.m6676a(a));
                Log.v("BufferGifDecoder", sb3.toString());
            }
            return null;
        } catch (Throwable th) {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Decoded GIF from stream in ");
                sb4.append(C1253e.m6676a(a));
                Log.v("BufferGifDecoder", sb4.toString());
            }
            throw th;
        }
    }

    /* renamed from: a */
    public C1552e mo6289a(ByteBuffer byteBuffer, int i, int i2, C1379e eVar) {
        C1184d a = this.f5022e.mo6361a(byteBuffer);
        try {
            C1552e a2 = m7668a(byteBuffer, i, i2, a, eVar);
            return a2;
        } finally {
            this.f5022e.mo6362a(a);
        }
    }

    /* renamed from: a */
    public boolean mo6290a(ByteBuffer byteBuffer, C1379e eVar) {
        return !((Boolean) eVar.mo6062a(C1560i.f5063b)).booleanValue() && C1290b.m6823a(this.f5021d, byteBuffer) == ImageType.GIF;
    }
}
