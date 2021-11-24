package com.seattleclouds.modules.podcast.p182a;

import android.app.Activity;
import android.os.AsyncTask;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.modules.podcast.C6139g;
import com.seattleclouds.modules.podcast.PodcastInfo;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import org.xml.sax.SAXException;

/* renamed from: com.seattleclouds.modules.podcast.a.a */
public class C6073a extends AsyncTask<String, Void, ArrayList<PodcastInfo>> {

    /* renamed from: a */
    private final WeakReference<Activity> f21565a;

    /* renamed from: b */
    private final WeakReference<C6075a> f21566b;

    /* renamed from: c */
    private final boolean f21567c;

    /* renamed from: d */
    private boolean f21568d;

    /* renamed from: e */
    private Integer f21569e;

    /* renamed from: com.seattleclouds.modules.podcast.a.a$a */
    public interface C6075a {
        /* renamed from: a */
        void mo19180a();

        /* renamed from: a */
        void mo19181a(String str);

        /* renamed from: a */
        void mo19182a(ArrayList<PodcastInfo> arrayList, boolean z);
    }

    public C6073a(Activity activity, C6075a aVar, boolean z) {
        this.f21565a = new WeakReference<>(activity);
        this.f21566b = new WeakReference<>(aVar);
        this.f21567c = z;
    }

    /* renamed from: a */
    private Activity m29707a() {
        return (Activity) this.f21565a.get();
    }

    /* renamed from: a */
    private void m29708a(int i) {
        this.f21569e = Integer.valueOf(i);
    }

    /* renamed from: b */
    private C6075a m29709b() {
        return (C6075a) this.f21566b.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<PodcastInfo> doInBackground(String... strArr) {
        ArrayList<PodcastInfo> arrayList = new ArrayList<>();
        for (String str : strArr) {
            try {
                if (this.f21567c) {
                    PodcastInfo load = PodcastInfo.load(str);
                    if (load != null) {
                        this.f21568d = true;
                        arrayList.add(load);
                    }
                }
                arrayList.add(C6139g.m29965f(str));
            } catch (IOException unused) {
                m29708a((m29707a() == null || C6619m.m32026h(m29707a())) ? C5462k.common_network_error : C5462k.common_no_network);
            } catch (XPathExpressionException e) {
                e.printStackTrace();
            } catch (ParserConfigurationException e2) {
                e2.printStackTrace();
            } catch (SAXException e3) {
                e3.printStackTrace();
            }
        }
        Collections.sort(arrayList, new Comparator<PodcastInfo>() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public int compare(com.seattleclouds.modules.podcast.PodcastInfo r4, com.seattleclouds.modules.podcast.PodcastInfo r5) {
                /*
                    r3 = this;
                    java.util.ArrayList<com.seattleclouds.modules.podcast.PodcastCategory> r0 = r4.categories
                    int r0 = r0.size()
                    r1 = 0
                    if (r0 <= 0) goto L_0x001c
                    java.util.ArrayList<com.seattleclouds.modules.podcast.PodcastCategory> r0 = r4.categories
                    java.lang.Object r0 = r0.get(r1)
                    com.seattleclouds.modules.podcast.PodcastCategory r0 = (com.seattleclouds.modules.podcast.PodcastCategory) r0
                    java.util.Date r2 = r0.getLastItemPublishDate()
                    if (r2 == 0) goto L_0x001c
                    java.util.Date r4 = r0.getLastItemPublishDate()
                    goto L_0x0020
                L_0x001c:
                    java.util.Date r4 = r4.getLastBuildDate()
                L_0x0020:
                    java.util.ArrayList<com.seattleclouds.modules.podcast.PodcastCategory> r0 = r5.categories
                    int r0 = r0.size()
                    if (r0 <= 0) goto L_0x003b
                    java.util.ArrayList<com.seattleclouds.modules.podcast.PodcastCategory> r0 = r5.categories
                    java.lang.Object r0 = r0.get(r1)
                    com.seattleclouds.modules.podcast.PodcastCategory r0 = (com.seattleclouds.modules.podcast.PodcastCategory) r0
                    java.util.Date r2 = r0.getLastItemPublishDate()
                    if (r2 == 0) goto L_0x003b
                    java.util.Date r5 = r0.getLastItemPublishDate()
                    goto L_0x003f
                L_0x003b:
                    java.util.Date r5 = r5.getLastBuildDate()
                L_0x003f:
                    if (r4 == 0) goto L_0x0048
                    if (r5 == 0) goto L_0x0048
                    int r4 = r5.compareTo(r4)
                    return r4
                L_0x0048:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.p182a.C6073a.C60741.compare(com.seattleclouds.modules.podcast.PodcastInfo, com.seattleclouds.modules.podcast.PodcastInfo):int");
            }
        });
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(ArrayList<PodcastInfo> arrayList) {
        if (!(this.f21569e == null || m29709b() == null)) {
            m29709b().mo19181a(m29707a().getString(this.f21569e.intValue()));
        }
        if (m29709b() != null) {
            m29709b().mo19182a(arrayList, this.f21568d);
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        if (m29709b() != null) {
            m29709b().mo19180a();
        }
    }
}
