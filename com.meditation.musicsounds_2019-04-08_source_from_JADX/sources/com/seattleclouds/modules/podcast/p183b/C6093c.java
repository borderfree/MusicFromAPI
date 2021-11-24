package com.seattleclouds.modules.podcast.p183b;

import android.app.Activity;
import android.os.AsyncTask;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.podcast.C6139g;
import com.seattleclouds.modules.podcast.PodcastInfo;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/* renamed from: com.seattleclouds.modules.podcast.b.c */
public class C6093c extends AsyncTask<String, Void, PodcastInfo> {

    /* renamed from: a */
    private final WeakReference<Activity> f21618a;

    /* renamed from: b */
    private final WeakReference<C6094a> f21619b;

    /* renamed from: c */
    private final boolean f21620c;

    /* renamed from: d */
    private boolean f21621d;

    /* renamed from: e */
    private Integer f21622e;

    /* renamed from: com.seattleclouds.modules.podcast.b.c$a */
    public interface C6094a {
        /* renamed from: a */
        void mo19218a(PodcastInfo podcastInfo, boolean z);

        /* renamed from: b */
        void mo19219b();

        /* renamed from: e */
        void mo19220e(String str);
    }

    public C6093c(Activity activity, C6094a aVar, boolean z) {
        this.f21618a = new WeakReference<>(activity);
        this.f21619b = new WeakReference<>(aVar);
        this.f21620c = z;
    }

    /* renamed from: a */
    private Activity m29768a() {
        return (Activity) this.f21618a.get();
    }

    /* renamed from: a */
    private void m29769a(int i) {
        this.f21622e = Integer.valueOf(i);
    }

    /* renamed from: b */
    private C6094a m29770b() {
        return (C6094a) this.f21619b.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public PodcastInfo doInBackground(String... strArr) {
        int i;
        try {
            String str = strArr[0];
            if (this.f21620c) {
                PodcastInfo load = PodcastInfo.load(str);
                if (load != null) {
                    this.f21621d = true;
                    return load;
                }
            }
            return C6139g.m29965f(str);
        } catch (IOException unused) {
            i = (m29768a() == null || C6619m.m32026h(m29768a())) ? C5462k.common_network_error : C5462k.common_no_network;
            m29769a(i);
            return null;
        } catch (ParserConfigurationException | XPathExpressionException | SAXException unused2) {
            i = C5462k.podcast_failed_to_parse_feed;
            m29769a(i);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(PodcastInfo podcastInfo) {
        if (!(this.f21622e == null || m29770b() == null || m29768a() == null)) {
            m29770b().mo19220e(m29768a().getString(this.f21622e.intValue()));
        }
        if (m29770b() != null) {
            m29770b().mo19218a(podcastInfo, this.f21621d);
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        if (m29770b() != null) {
            m29770b().mo19219b();
        }
    }
}
