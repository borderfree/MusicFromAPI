package com.seattleclouds.modules.podcast;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.seattleclouds.modules.podcast.f */
public class C6138f {

    /* renamed from: a */
    private static HashMap<String, C6138f> f21751a = new HashMap<>();

    /* renamed from: b */
    private static ArrayList<PodcastItem> f21752b;

    /* renamed from: c */
    private final String f21753c;

    /* renamed from: d */
    private ArrayList<PodcastItem> f21754d;

    private C6138f(String str) {
        this.f21753c = str;
        m29942e();
    }

    /* renamed from: a */
    public static C6138f m29936a(String str) {
        String lowerCase = str.toLowerCase();
        if (f21751a.containsKey(lowerCase)) {
            return (C6138f) f21751a.get(lowerCase);
        }
        C6138f fVar = new C6138f(lowerCase);
        f21751a.put(lowerCase, fVar);
        return fVar;
    }

    /* renamed from: a */
    public static List<PodcastItem> m29937a() {
        m29940c();
        return f21752b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001b A[SYNTHETIC, Splitter:B:16:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0022 A[SYNTHETIC, Splitter:B:23:0x0022] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m29938a(java.util.List<com.seattleclouds.modules.podcast.PodcastItem> r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x001f, all -> 0x0018 }
            r3.writeObject(r2)     // Catch:{ Exception -> 0x0016, all -> 0x0013 }
            r2 = 1
            r3.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r2
        L_0x0013:
            r2 = move-exception
            r0 = r3
            goto L_0x0019
        L_0x0016:
            r0 = r3
            goto L_0x001f
        L_0x0018:
            r2 = move-exception
        L_0x0019:
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            throw r2
        L_0x001f:
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0.close()     // Catch:{ IOException -> 0x0025 }
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.C6138f.m29938a(java.util.List, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[SYNTHETIC, Splitter:B:13:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0024 A[SYNTHETIC, Splitter:B:21:0x0024] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<com.seattleclouds.modules.podcast.PodcastItem> m29939b(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0021, all -> 0x001a }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0021, all -> 0x001a }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x0021, all -> 0x001a }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0021, all -> 0x001a }
            java.lang.Object r1 = r3.readObject()     // Catch:{ Exception -> 0x0022, all -> 0x0015 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ Exception -> 0x0022, all -> 0x0015 }
            r3.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r1
        L_0x0015:
            r0 = move-exception
            r2 = r0
            r0 = r3
            r3 = r2
            goto L_0x001b
        L_0x001a:
            r3 = move-exception
        L_0x001b:
            if (r0 == 0) goto L_0x0020
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            throw r3
        L_0x0021:
            r3 = r0
        L_0x0022:
            if (r3 == 0) goto L_0x0027
            r3.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.podcast.C6138f.m29939b(java.lang.String):java.util.ArrayList");
    }

    /* renamed from: c */
    private static void m29940c() {
        File[] listFiles;
        File[] listFiles2;
        File[] listFiles3;
        if (f21752b == null) {
            String c = C6139g.m29960c();
            if (new File(c).exists()) {
                f21752b = m29939b(c);
            } else {
                f21752b = new ArrayList<>();
                File file = new File(C6139g.m29949a());
                if (file.exists()) {
                    for (File file2 : file.listFiles()) {
                        if (file2.isDirectory()) {
                            for (File file3 : file2.listFiles()) {
                                if (file3.isDirectory()) {
                                    for (File file4 : file3.listFiles()) {
                                        if (file4.getName().equalsIgnoreCase("downloads.ar")) {
                                            ArrayList b = m29939b(file4.getAbsolutePath());
                                            if (b != null) {
                                                f21752b.addAll(b);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (f21752b == null) {
                f21752b = new ArrayList<>();
            }
        }
    }

    /* renamed from: d */
    private static void m29941d() {
        if (f21752b != null) {
            m29938a(f21752b, C6139g.m29960c());
        }
    }

    /* renamed from: e */
    private void m29942e() {
        m29940c();
        this.f21754d = m29939b(C6139g.m29964e(this.f21753c));
        if (mo19302b() == null) {
            this.f21754d = new ArrayList<>();
            return;
        }
        Iterator it = this.f21754d.iterator();
        while (it.hasNext()) {
            PodcastItem podcastItem = (PodcastItem) it.next();
            if (podcastItem.error == null && !podcastItem.isDownloaded()) {
                it.remove();
            }
        }
    }

    /* renamed from: f */
    private void m29943f() {
        m29938a(this.f21754d, C6139g.m29964e(this.f21753c));
        m29941d();
    }

    /* renamed from: a */
    public void mo19300a(PodcastItem podcastItem) {
        if (!this.f21754d.contains(podcastItem)) {
            this.f21754d.add(podcastItem);
        }
        if (!f21752b.contains(podcastItem)) {
            f21752b.add(podcastItem);
        }
        m29943f();
    }

    /* renamed from: a */
    public void mo19301a(List<PodcastItem> list) {
        for (PodcastItem podcastItem : list) {
            if (!this.f21754d.contains(podcastItem)) {
                this.f21754d.add(podcastItem);
            }
            if (!f21752b.contains(podcastItem)) {
                f21752b.add(podcastItem);
            }
        }
        m29943f();
    }

    /* renamed from: b */
    public List<PodcastItem> mo19302b() {
        return this.f21754d;
    }

    /* renamed from: b */
    public void mo19303b(PodcastItem podcastItem) {
        this.f21754d.remove(podcastItem);
        f21752b.remove(podcastItem);
        m29943f();
    }
}
