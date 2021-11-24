package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.load.C1261a;
import com.bumptech.glide.load.C1488f;
import com.bumptech.glide.load.C1489g;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.C1462i;
import com.bumptech.glide.load.engine.p046a.C1393b;
import com.bumptech.glide.load.engine.p046a.C1398e;
import com.bumptech.glide.load.engine.p047b.C1430h;
import com.bumptech.glide.load.engine.p049d.C1450a;
import com.bumptech.glide.load.p042a.C1274e.C1275a;
import com.bumptech.glide.load.p042a.C1285k.C1286a;
import com.bumptech.glide.load.p044b.C1291a.C1293b;
import com.bumptech.glide.load.p044b.C1291a.C1294c;
import com.bumptech.glide.load.p044b.C1305b.C1306a;
import com.bumptech.glide.load.p044b.C1305b.C1310d;
import com.bumptech.glide.load.p044b.C1312c;
import com.bumptech.glide.load.p044b.C1313d.C1315b;
import com.bumptech.glide.load.p044b.C1316e.C1319c;
import com.bumptech.glide.load.p044b.C1321f.C1323b;
import com.bumptech.glide.load.p044b.C1321f.C1327e;
import com.bumptech.glide.load.p044b.C1329g;
import com.bumptech.glide.load.p044b.C1336k.C1337a;
import com.bumptech.glide.load.p044b.C1345o;
import com.bumptech.glide.load.p044b.C1355s.C1356a;
import com.bumptech.glide.load.p044b.C1355s.C1357b;
import com.bumptech.glide.load.p044b.C1355s.C1358c;
import com.bumptech.glide.load.p044b.C1355s.C1359d;
import com.bumptech.glide.load.p044b.C1360t;
import com.bumptech.glide.load.p044b.C1361u.C1362a;
import com.bumptech.glide.load.p044b.C1361u.C1363b;
import com.bumptech.glide.load.p044b.C1361u.C1364c;
import com.bumptech.glide.load.p044b.C1365v.C1366a;
import com.bumptech.glide.load.p044b.C1368w.C1369a;
import com.bumptech.glide.load.p044b.C1368w.C1370b;
import com.bumptech.glide.load.p044b.C1368w.C1372d;
import com.bumptech.glide.load.p044b.C1373x.C1374a;
import com.bumptech.glide.load.p044b.p045a.C1295a.C1296a;
import com.bumptech.glide.load.p044b.p045a.C1297b.C1298a;
import com.bumptech.glide.load.p044b.p045a.C1299c.C1300a;
import com.bumptech.glide.load.p044b.p045a.C1301d.C1302a;
import com.bumptech.glide.load.p044b.p045a.C1303e.C1304a;
import com.bumptech.glide.load.resource.bitmap.C1507a;
import com.bumptech.glide.load.resource.bitmap.C1508b;
import com.bumptech.glide.load.resource.bitmap.C1509c;
import com.bumptech.glide.load.resource.bitmap.C1512f;
import com.bumptech.glide.load.resource.bitmap.C1515i;
import com.bumptech.glide.load.resource.bitmap.C1520j;
import com.bumptech.glide.load.resource.bitmap.C1529p;
import com.bumptech.glide.load.resource.bitmap.C1530q;
import com.bumptech.glide.load.resource.bitmap.C1534s;
import com.bumptech.glide.load.resource.bitmap.C1536t;
import com.bumptech.glide.load.resource.p050a.C1492a.C1493a;
import com.bumptech.glide.load.resource.p051b.C1499d;
import com.bumptech.glide.load.resource.p051b.C1500e;
import com.bumptech.glide.load.resource.p052c.C1543a;
import com.bumptech.glide.load.resource.p053d.C1545a;
import com.bumptech.glide.load.resource.p053d.C1549c;
import com.bumptech.glide.load.resource.p053d.C1551d;
import com.bumptech.glide.load.resource.p053d.C1559h;
import com.bumptech.glide.load.resource.p053d.C1561j;
import com.bumptech.glide.load.resource.p054e.C1562a;
import com.bumptech.glide.load.resource.p054e.C1563b;
import com.bumptech.glide.load.resource.p054e.C1564c;
import com.bumptech.glide.load.resource.p054e.C1565d;
import com.bumptech.glide.load.resource.p054e.C1566e;
import com.bumptech.glide.p035b.C1180a;
import com.bumptech.glide.p036c.C1191d;
import com.bumptech.glide.p036c.C1201l;
import com.bumptech.glide.p037d.C1212c;
import com.bumptech.glide.p037d.C1214e;
import com.bumptech.glide.p040g.C1257i;
import com.bumptech.glide.p040g.C1258j;
import com.bumptech.glide.request.C1594g;
import com.bumptech.glide.request.p055a.C1576e;
import com.bumptech.glide.request.p055a.C1579h;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.c */
public class C1186c implements ComponentCallbacks2 {

    /* renamed from: a */
    private static volatile C1186c f4319a;

    /* renamed from: b */
    private static volatile boolean f4320b;

    /* renamed from: c */
    private final C1462i f4321c;

    /* renamed from: d */
    private final C1398e f4322d;

    /* renamed from: e */
    private final C1430h f4323e;

    /* renamed from: f */
    private final C1450a f4324f;

    /* renamed from: g */
    private final C1216e f4325g;

    /* renamed from: h */
    private final Registry f4326h;

    /* renamed from: i */
    private final C1393b f4327i;

    /* renamed from: j */
    private final C1201l f4328j;

    /* renamed from: k */
    private final C1191d f4329k;

    /* renamed from: l */
    private final List<C1231g> f4330l = new ArrayList();

    /* renamed from: m */
    private MemoryCategory f4331m = MemoryCategory.NORMAL;

    C1186c(Context context, C1462i iVar, C1430h hVar, C1398e eVar, C1393b bVar, C1201l lVar, C1191d dVar, int i, C1594g gVar, Map<Class<?>, C1260h<?, ?>> map) {
        Context context2 = context;
        C1430h hVar2 = hVar;
        C1398e eVar2 = eVar;
        C1393b bVar2 = bVar;
        this.f4321c = iVar;
        this.f4322d = eVar2;
        this.f4327i = bVar2;
        this.f4323e = hVar2;
        this.f4328j = lVar;
        this.f4329k = dVar;
        this.f4324f = new C1450a(hVar2, eVar2, (DecodeFormat) gVar.mo6501k().mo6062a(C1520j.f4975a));
        Resources resources = context.getResources();
        this.f4326h = new Registry();
        this.f4326h.mo5671a((ImageHeaderParser) new C1515i());
        C1520j jVar = new C1520j(this.f4326h.mo5682a(), resources.getDisplayMetrics(), eVar2, bVar2);
        C1545a aVar = new C1545a(context2, this.f4326h.mo5682a(), eVar2, bVar2);
        C1488f b = C1536t.m7650b(eVar);
        C1512f fVar = new C1512f(jVar);
        C1530q qVar = new C1530q(jVar, bVar2);
        C1499d dVar2 = new C1499d(context2);
        C1358c cVar = new C1358c(resources);
        C1359d dVar3 = new C1359d(resources);
        C1357b bVar3 = new C1357b(resources);
        C1356a aVar2 = new C1356a(resources);
        C1509c cVar2 = new C1509c(bVar2);
        C1562a aVar3 = new C1562a();
        C1565d dVar4 = new C1565d();
        C1357b bVar4 = bVar3;
        C1359d dVar5 = dVar3;
        C1356a aVar4 = aVar2;
        Context context3 = context;
        ContentResolver contentResolver = context.getContentResolver();
        C1562a aVar5 = aVar3;
        C1565d dVar6 = dVar4;
        this.f4326h.mo5673a(ByteBuffer.class, (C1261a<Data>) new C1312c<Data>()).mo5673a(InputStream.class, (C1261a<Data>) new C1360t<Data>(bVar2)).mo5678a("Bitmap", ByteBuffer.class, Bitmap.class, fVar).mo5678a("Bitmap", InputStream.class, Bitmap.class, qVar).mo5678a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, b).mo5678a("Bitmap", AssetFileDescriptor.class, Bitmap.class, C1536t.m7648a(eVar)).mo5675a(Bitmap.class, Bitmap.class, (C1345o<Model, Data>) C1366a.m7020a()).mo5678a("Bitmap", Bitmap.class, Bitmap.class, new C1534s()).mo5674a(Bitmap.class, (C1489g<TResource>) cVar2).mo5678a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C1507a(resources, fVar)).mo5678a("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C1507a(resources, qVar)).mo5678a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C1507a(resources, b)).mo5674a(BitmapDrawable.class, (C1489g<TResource>) new C1508b<TResource>(eVar2, cVar2)).mo5678a("Gif", InputStream.class, C1549c.class, new C1561j(this.f4326h.mo5682a(), aVar, bVar2)).mo5678a("Gif", ByteBuffer.class, C1549c.class, aVar).mo5674a(C1549c.class, (C1489g<TResource>) new C1551d<TResource>()).mo5675a(C1180a.class, C1180a.class, (C1345o<Model, Data>) C1366a.m7020a()).mo5678a("Bitmap", C1180a.class, Bitmap.class, new C1559h(eVar2)).mo5676a(Uri.class, Drawable.class, (C1488f<Data, TResource>) dVar2).mo5676a(Uri.class, Bitmap.class, (C1488f<Data, TResource>) new C1529p<Data,TResource>(dVar2, eVar2)).mo5672a((C1275a<?>) new C1493a<Object>()).mo5675a(File.class, ByteBuffer.class, (C1345o<Model, Data>) new C1315b<Model,Data>()).mo5675a(File.class, InputStream.class, (C1345o<Model, Data>) new C1327e<Model,Data>()).mo5676a(File.class, File.class, (C1488f<Data, TResource>) new C1543a<Data,TResource>()).mo5675a(File.class, ParcelFileDescriptor.class, (C1345o<Model, Data>) new C1323b<Model,Data>()).mo5675a(File.class, File.class, (C1345o<Model, Data>) C1366a.m7020a()).mo5672a((C1275a<?>) new C1286a<Object>(bVar2)).mo5675a(Integer.TYPE, InputStream.class, (C1345o<Model, Data>) cVar).mo5675a(Integer.TYPE, ParcelFileDescriptor.class, (C1345o<Model, Data>) bVar4).mo5675a(Integer.class, InputStream.class, (C1345o<Model, Data>) cVar).mo5675a(Integer.class, ParcelFileDescriptor.class, (C1345o<Model, Data>) bVar4).mo5675a(Integer.class, Uri.class, (C1345o<Model, Data>) dVar5).mo5675a(Integer.TYPE, AssetFileDescriptor.class, (C1345o<Model, Data>) aVar4).mo5675a(Integer.class, AssetFileDescriptor.class, (C1345o<Model, Data>) aVar4).mo5675a(Integer.TYPE, Uri.class, (C1345o<Model, Data>) dVar5).mo5675a(String.class, InputStream.class, (C1345o<Model, Data>) new C1319c<Model,Data>()).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1319c<Model,Data>()).mo5675a(String.class, InputStream.class, (C1345o<Model, Data>) new C1364c<Model,Data>()).mo5675a(String.class, ParcelFileDescriptor.class, (C1345o<Model, Data>) new C1363b<Model,Data>()).mo5675a(String.class, AssetFileDescriptor.class, (C1345o<Model, Data>) new C1362a<Model,Data>()).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1298a<Model,Data>()).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1294c<Model,Data>(context.getAssets())).mo5675a(Uri.class, ParcelFileDescriptor.class, (C1345o<Model, Data>) new C1293b<Model,Data>(context.getAssets())).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1300a<Model,Data>(context3)).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1302a<Model,Data>(context3)).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1372d<Model,Data>(contentResolver)).mo5675a(Uri.class, ParcelFileDescriptor.class, (C1345o<Model, Data>) new C1370b<Model,Data>(contentResolver)).mo5675a(Uri.class, AssetFileDescriptor.class, (C1345o<Model, Data>) new C1369a<Model,Data>(contentResolver)).mo5675a(Uri.class, InputStream.class, (C1345o<Model, Data>) new C1374a<Model,Data>()).mo5675a(URL.class, InputStream.class, (C1345o<Model, Data>) new C1304a<Model,Data>()).mo5675a(Uri.class, File.class, (C1345o<Model, Data>) new C1337a<Model,Data>(context3)).mo5675a(C1329g.class, InputStream.class, (C1345o<Model, Data>) new C1296a<Model,Data>()).mo5675a(byte[].class, ByteBuffer.class, (C1345o<Model, Data>) new C1306a<Model,Data>()).mo5675a(byte[].class, InputStream.class, (C1345o<Model, Data>) new C1310d<Model,Data>()).mo5675a(Uri.class, Uri.class, (C1345o<Model, Data>) C1366a.m7020a()).mo5675a(Drawable.class, Drawable.class, (C1345o<Model, Data>) C1366a.m7020a()).mo5676a(Drawable.class, Drawable.class, (C1488f<Data, TResource>) new C1500e<Data,TResource>()).mo5677a(Bitmap.class, BitmapDrawable.class, (C1566e<TResource, Transcode>) new C1563b<TResource,Transcode>(resources)).mo5677a(Bitmap.class, byte[].class, (C1566e<TResource, Transcode>) aVar5).mo5677a(Drawable.class, byte[].class, (C1566e<TResource, Transcode>) new C1564c<TResource,Transcode>(eVar2, aVar5, dVar6)).mo5677a(C1549c.class, byte[].class, (C1566e<TResource, Transcode>) dVar6);
        C1216e eVar3 = new C1216e(context, bVar, this.f4326h, new C1576e(), gVar, map, iVar, i);
        this.f4325g = eVar3;
    }

    /* renamed from: a */
    public static C1186c m6450a(Context context) {
        if (f4319a == null) {
            synchronized (C1186c.class) {
                if (f4319a == null) {
                    m6456c(context);
                }
            }
        }
        return f4319a;
    }

    /* renamed from: a */
    public static C1231g m6451a(Fragment fragment) {
        return m6458e(fragment.mo1318s()).mo5777a(fragment);
    }

    /* renamed from: a */
    public static C1231g m6452a(View view) {
        return m6458e(view.getContext()).mo5779a(view);
    }

    /* renamed from: a */
    private static void m6453a(Context context, C1209d dVar) {
        Context applicationContext = context.getApplicationContext();
        C1169a i = m6459i();
        List<C1212c> emptyList = Collections.emptyList();
        if (i == null || i.mo5802c()) {
            emptyList = new C1214e(applicationContext).mo5804a();
        }
        if (i != null && !i.mo5688a().isEmpty()) {
            Set a = i.mo5688a();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                C1212c cVar = (C1212c) it.next();
                if (a.contains(cVar.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(cVar);
                        Log.d("Glide", sb.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            for (C1212c cVar2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(cVar2.getClass());
                Log.d("Glide", sb2.toString());
            }
        }
        dVar.mo5800a(i != null ? i.mo5689b() : null);
        for (C1212c a2 : emptyList) {
            a2.mo5801a(applicationContext, dVar);
        }
        if (i != null) {
            i.mo5801a(applicationContext, dVar);
        }
        C1186c a3 = dVar.mo5799a(applicationContext);
        for (C1212c a4 : emptyList) {
            a4.mo5803a(applicationContext, a3, a3.f4326h);
        }
        if (i != null) {
            i.mo5803a(applicationContext, a3, a3.f4326h);
        }
        applicationContext.registerComponentCallbacks(a3);
        f4319a = a3;
    }

    /* renamed from: a */
    private static void m6454a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: b */
    public static C1231g m6455b(Context context) {
        return m6458e(context).mo5776a(context);
    }

    /* renamed from: c */
    private static void m6456c(Context context) {
        if (!f4320b) {
            f4320b = true;
            m6457d(context);
            f4320b = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: d */
    private static void m6457d(Context context) {
        m6453a(context, new C1209d());
    }

    /* renamed from: e */
    private static C1201l m6458e(Context context) {
        C1257i.m6692a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m6450a(context).mo5745g();
    }

    /* renamed from: i */
    private static C1169a m6459i() {
        try {
            return (C1169a) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            m6454a((Exception) e);
        }
        return null;
    }

    /* renamed from: a */
    public C1398e mo5735a() {
        return this.f4322d;
    }

    /* renamed from: a */
    public void mo5736a(int i) {
        C1258j.m6707a();
        this.f4323e.mo6183a(i);
        this.f4322d.mo6140a(i);
        this.f4327i.mo6118a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5737a(C1231g gVar) {
        synchronized (this.f4330l) {
            if (!this.f4330l.contains(gVar)) {
                this.f4330l.add(gVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5738a(C1579h<?> hVar) {
        synchronized (this.f4330l) {
            for (C1231g b : this.f4330l) {
                if (b.mo5858b(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public C1393b mo5739b() {
        return this.f4327i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5740b(C1231g gVar) {
        synchronized (this.f4330l) {
            if (this.f4330l.contains(gVar)) {
                this.f4330l.remove(gVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: c */
    public Context mo5741c() {
        return this.f4325g.getBaseContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1191d mo5742d() {
        return this.f4329k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C1216e mo5743e() {
        return this.f4325g;
    }

    /* renamed from: f */
    public void mo5744f() {
        C1258j.m6707a();
        this.f4323e.mo6187a();
        this.f4322d.mo6139a();
        this.f4327i.mo6117a();
    }

    /* renamed from: g */
    public C1201l mo5745g() {
        return this.f4328j;
    }

    /* renamed from: h */
    public Registry mo5746h() {
        return this.f4326h;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo5744f();
    }

    public void onTrimMemory(int i) {
        mo5736a(i);
    }
}
