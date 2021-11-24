package com.seattleclouds.modules.podcast.p183b;

import android.content.Context;
import android.os.AsyncTask;
import com.seattleclouds.modules.podcast.PodcastCategory;
import com.seattleclouds.modules.podcast.PodcastInfo;
import com.seattleclouds.modules.podcast.PodcastItem;
import com.seattleclouds.modules.podcast.PodcastListItem;
import com.seattleclouds.util.C6592al;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.seattleclouds.modules.podcast.b.a */
public class C6088a extends AsyncTask<PodcastInfo, Void, ArrayList<PodcastListItem>> {

    /* renamed from: a */
    private final WeakReference<Context> f21612a;

    /* renamed from: b */
    private C6090a f21613b;

    /* renamed from: com.seattleclouds.modules.podcast.b.a$a */
    public interface C6090a {
        /* renamed from: a */
        void mo19186a(ArrayList<PodcastListItem> arrayList);
    }

    public C6088a(Context context) {
        this.f21612a = new WeakReference<>(context);
    }

    /* renamed from: b */
    private Context m29756b() {
        return (Context) this.f21612a.get();
    }

    /* renamed from: a */
    public C6090a mo19197a() {
        return this.f21613b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ArrayList<PodcastListItem> doInBackground(PodcastInfo... podcastInfoArr) {
        PodcastListItem podcastListItem;
        ArrayList<PodcastListItem> arrayList = new ArrayList<>();
        for (PodcastInfo podcastInfo : podcastInfoArr) {
            if (isCancelled()) {
                return null;
            }
            if (podcastInfo.categories.size() == 1) {
                Iterator it = ((PodcastCategory) podcastInfo.categories.get(0)).items.iterator();
                while (it.hasNext()) {
                    PodcastItem podcastItem = (PodcastItem) it.next();
                    podcastItem.updateMediaUri();
                    PodcastListItem podcastListItem2 = new PodcastListItem();
                    podcastListItem2.f21540e = podcastItem.title;
                    podcastListItem2.f21541f = podcastItem.author;
                    if (podcastItem.publishedDate != null) {
                        podcastListItem2.f21543h = podcastItem.getFormattedDate(m29756b());
                    }
                    podcastListItem2.f21544i = podcastItem.getAnyImageUrl();
                    podcastListItem2.f21536a = podcastItem;
                    podcastListItem2.f21538c = podcastItem.isDownloaded();
                    arrayList.add(podcastListItem2);
                }
            } else if (podcastInfo.categories.size() > 1) {
                Iterator it2 = podcastInfo.categories.iterator();
                while (it2.hasNext()) {
                    PodcastCategory podcastCategory = (PodcastCategory) it2.next();
                    if (isCancelled()) {
                        return null;
                    }
                    if (podcastCategory.items.size() == 1 || (podcastCategory.items.size() > 0 && C6592al.m31910c(((PodcastItem) podcastCategory.items.get(0)).category))) {
                        PodcastItem podcastItem2 = (PodcastItem) podcastCategory.items.get(0);
                        podcastItem2.updateMediaUri();
                        podcastListItem = new PodcastListItem();
                        podcastListItem.f21540e = podcastItem2.title;
                        podcastListItem.f21541f = podcastItem2.author;
                        if (podcastItem2.publishedDate != null) {
                            podcastListItem.f21543h = podcastItem2.getFormattedDate(m29756b());
                        }
                        podcastListItem.f21544i = podcastItem2.getAnyImageUrl();
                        podcastListItem.f21536a = podcastItem2;
                        podcastListItem.f21538c = podcastItem2.isDownloaded();
                    } else {
                        podcastListItem = new PodcastListItem();
                        podcastListItem.f21540e = podcastCategory.title;
                        if (podcastCategory.lastPodcastItem != null) {
                            podcastListItem.f21541f = podcastCategory.lastPodcastItem.author;
                            podcastCategory.lastPodcastItem.updateMediaUri();
                            if (podcastCategory.lastPodcastItem.publishedDate != null) {
                                podcastListItem.f21542g = podcastCategory.lastPodcastItem.title;
                                podcastListItem.f21543h = podcastCategory.lastPodcastItem.getFormattedDate(m29756b());
                            }
                            podcastListItem.f21544i = podcastCategory.lastPodcastItem.getAnyImageUrl();
                            podcastListItem.f21538c = podcastCategory.lastPodcastItem.isDownloaded();
                        }
                        podcastListItem.f21537b = podcastCategory;
                    }
                    arrayList.add(podcastListItem);
                }
                continue;
            } else {
                continue;
            }
        }
        Collections.sort(arrayList, new Comparator<PodcastListItem>() {
            /* renamed from: a */
            public int compare(PodcastListItem podcastListItem, PodcastListItem podcastListItem2) {
                Date date = null;
                Date date2 = (podcastListItem.f21536a == null || podcastListItem.f21536a.publishedDate == null) ? (podcastListItem.f21537b == null || podcastListItem.f21537b.getLastItemPublishDate() == null) ? null : podcastListItem.f21537b.getLastItemPublishDate() : podcastListItem.f21536a.publishedDate;
                if (podcastListItem2.f21536a != null && podcastListItem2.f21536a.publishedDate != null) {
                    date = podcastListItem2.f21536a.publishedDate;
                } else if (!(podcastListItem2.f21537b == null || podcastListItem2.f21537b.getLastItemPublishDate() == null)) {
                    date = podcastListItem2.f21537b.getLastItemPublishDate();
                }
                if (date2 == null || date == null) {
                    return 0;
                }
                return date.compareTo(date2);
            }
        });
        return arrayList;
    }

    /* renamed from: a */
    public void mo19199a(C6090a aVar) {
        this.f21613b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(ArrayList<PodcastListItem> arrayList) {
        if (!isCancelled()) {
            C6090a a = mo19197a();
            if (a != null) {
                a.mo19186a(arrayList);
            }
        }
    }
}
