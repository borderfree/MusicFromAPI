package com.seattleclouds.modules.podcast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PodcastInfo implements Serializable {
    private static final long serialVersionUID = 0;
    public ArrayList<PodcastCategory> categories = new ArrayList<>();
    public String description;
    public String imageUrl;
    public String lasBuildDate;
    public String link;
    private Date mLastBuildDate;
    public String title;
    public String url;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024 A[SYNTHETIC, Splitter:B:13:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC, Splitter:B:21:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.seattleclouds.modules.podcast.PodcastInfo load(java.lang.String r3) {
        /*
            java.lang.String r3 = com.seattleclouds.modules.podcast.C6139g.m29963d(r3)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0028, all -> 0x0021 }
            java.lang.Object r1 = r3.readObject()     // Catch:{ Exception -> 0x0029, all -> 0x001c }
            com.seattleclouds.modules.podcast.PodcastInfo r1 = (com.seattleclouds.modules.podcast.PodcastInfo) r1     // Catch:{ Exception -> 0x0029, all -> 0x001c }
            r1.synchronize()     // Catch:{ Exception -> 0x0029, all -> 0x001c }
            r3.close()     // Catch:{ IOException -> 0x001b }
        L_0x001b:
            return r1
        L_0x001c:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x0022
        L_0x0021:
            r3 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r3
        L_0x0028:
            r3 = r0
        L_0x0029:
            if (r3 == 0) goto L_0x002e
            r3.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.PodcastInfo.load(java.lang.String):com.seattleclouds.modules.podcast.PodcastInfo");
    }

    public Date getLastBuildDate() {
        if (this.lasBuildDate == null || this.lasBuildDate.length() == 0) {
            return null;
        }
        if (this.mLastBuildDate == null) {
            this.mLastBuildDate = C6139g.m29953a(this.lasBuildDate);
        }
        return this.mLastBuildDate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022 A[SYNTHETIC, Splitter:B:13:0x0022] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028 A[SYNTHETIC, Splitter:B:19:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void save() {
        /*
            r4 = this;
            java.lang.String r0 = r4.url
            java.lang.String r0 = com.seattleclouds.modules.podcast.C6139g.m29963d(r0)
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0026, all -> 0x001f }
            r0.writeObject(r4)     // Catch:{ Exception -> 0x001d, all -> 0x0018 }
            r0.close()     // Catch:{ IOException -> 0x002b }
            goto L_0x002b
        L_0x0018:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L_0x0020
        L_0x001d:
            r1 = r0
            goto L_0x0026
        L_0x001f:
            r0 = move-exception
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            r1.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.PodcastInfo.save():void");
    }

    public void synchronize() {
        C6138f a = C6138f.m29936a(this.url);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.categories.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((PodcastCategory) it.next()).items.iterator();
            while (it2.hasNext()) {
                PodcastItem podcastItem = (PodcastItem) it2.next();
                if (podcastItem.isDownloaded()) {
                    arrayList.add(podcastItem);
                }
            }
        }
        a.mo19301a((List<PodcastItem>) arrayList);
    }
}
