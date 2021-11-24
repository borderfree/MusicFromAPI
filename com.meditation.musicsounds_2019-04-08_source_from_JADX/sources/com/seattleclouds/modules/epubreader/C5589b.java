package com.seattleclouds.modules.epubreader;

import android.os.AsyncTask;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;
import p194nl.siegmann.epublib.domain.TOCReference;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.epubreader.b */
public class C5589b extends AsyncTask<String, Integer, Integer> {

    /* renamed from: a */
    private WeakReference<C5590a> f19882a;

    /* renamed from: b */
    private ePubBookState f19883b = new ePubBookState();

    /* renamed from: com.seattleclouds.modules.epubreader.b$a */
    public interface C5590a {
        /* renamed from: a */
        void mo18072a(ePubBookState epubbookstate);

        /* renamed from: z_ */
        void mo18073z_();
    }

    /* renamed from: a */
    private String m27751a(String str) {
        int lastIndexOf = str.lastIndexOf(TableOfContents.DEFAULT_PATH_SEPARATOR);
        return lastIndexOf > -1 ? str.substring(0, lastIndexOf) : "";
    }

    /* renamed from: a */
    private void m27752a(List<TOCReference> list, int i) {
        if (list != null) {
            for (TOCReference tOCReference : list) {
                try {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < i; i2++) {
                        sb.append("\t");
                    }
                    sb.append(tOCReference.getTitle());
                    this.f19883b.addGuide(sb.toString(), tOCReference.getCompleteHref());
                    m27752a(tOCReference.getChildren(), i + 1);
                } catch (NullPointerException e) {
                    Log.d("ePubReader", "loadTableOfContents", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0178, code lost:
        if (r1 != null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0188, code lost:
        if (r1 != null) goto L_0x017a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0036, B:27:0x0074] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0036] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9 A[Catch:{ IOException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7 A[Catch:{ IOException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0140 A[Catch:{ IOException -> 0x0180 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x014a A[SYNTHETIC, Splitter:B:46:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0192 A[SYNTHETIC, Splitter:B:63:0x0192] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer doInBackground(java.lang.String... r7) {
        /*
            r6 = this;
            r0 = 0
            r7 = r7[r0]
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0180 }
            r2.<init>(r7)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r2 = r2.getName()     // Catch:{ IOException -> 0x0180 }
            java.lang.String r3 = "."
            int r3 = r2.lastIndexOf(r3)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r2 = r2.substring(r0, r3)     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r3.<init>()     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = com.seattleclouds.App.m25665m()     // Catch:{ IOException -> 0x0180 }
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = "/ePubReader/"
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            r3.append(r2)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x0180 }
            java.io.InputStream r3 = com.seattleclouds.App.m25652g(r7)     // Catch:{ IOException -> 0x0180 }
            if (r3 != 0) goto L_0x0048
            r7 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            if (r3 == 0) goto L_0x003f
            r3.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r7
        L_0x0040:
            r7 = move-exception
            r1 = r3
            goto L_0x0190
        L_0x0044:
            r7 = move-exception
            r1 = r3
            goto L_0x0181
        L_0x0048:
            com.seattleclouds.modules.epubreader.a r1 = new com.seattleclouds.modules.epubreader.a     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r4.<init>()     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r4.append(r2)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r1.<init>(r3, r4)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            r1.mo18065a()     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            boolean r1 = r6.isCancelled()     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            if (r1 == 0) goto L_0x0071
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            if (r3 == 0) goto L_0x0070
            r3.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            return r7
        L_0x0071:
            r3.close()     // Catch:{ IOException -> 0x0074, all -> 0x0040 }
        L_0x0074:
            java.io.InputStream r1 = com.seattleclouds.App.m25652g(r7)     // Catch:{ IOException -> 0x0044, all -> 0x0040 }
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.a.d r3 = new nl.siegmann.epublib.a.d     // Catch:{ IOException -> 0x0180 }
            r3.<init>()     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Book r3 = r3.mo20873a(r1)     // Catch:{ IOException -> 0x0180 }
            r7.book = r3     // Catch:{ IOException -> 0x0180 }
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Book r7 = r7.book     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Resource r7 = r7.getOpfResource()     // Catch:{ IOException -> 0x0180 }
            java.lang.String r7 = r7.getHref()     // Catch:{ IOException -> 0x0180 }
            java.lang.String r7 = r6.m27751a(r7)     // Catch:{ IOException -> 0x0180 }
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r4.<init>()     // Catch:{ IOException -> 0x0180 }
            r4.append(r2)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ IOException -> 0x0180 }
            r4.append(r7)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0180 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0180 }
            boolean r3 = r3.exists()     // Catch:{ IOException -> 0x0180 }
            if (r3 == 0) goto L_0x00d7
            com.seattleclouds.modules.epubreader.ePubBookState r3 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r4.<init>()     // Catch:{ IOException -> 0x0180 }
            r4.append(r2)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r5 = "/"
            r4.append(r5)     // Catch:{ IOException -> 0x0180 }
            r4.append(r7)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r7 = "/"
            r4.append(r7)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x0180 }
            r3.baseUrl = r7     // Catch:{ IOException -> 0x0180 }
            goto L_0x011d
        L_0x00d7:
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r3.<init>()     // Catch:{ IOException -> 0x0180 }
            r3.append(r2)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = "/OEBPS/"
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0180 }
            r7.<init>(r3)     // Catch:{ IOException -> 0x0180 }
            boolean r7 = r7.exists()     // Catch:{ IOException -> 0x0180 }
            if (r7 == 0) goto L_0x0109
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r3.<init>()     // Catch:{ IOException -> 0x0180 }
            r3.append(r2)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = "/OEBPS/"
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0180 }
        L_0x0106:
            r7.baseUrl = r3     // Catch:{ IOException -> 0x0180 }
            goto L_0x011d
        L_0x0109:
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r3.<init>()     // Catch:{ IOException -> 0x0180 }
            r3.append(r2)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = "/OPS/"
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0180 }
            goto L_0x0106
        L_0x011d:
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0180 }
            r3.<init>()     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = "file://"
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            java.lang.String r4 = r4.baseUrl     // Catch:{ IOException -> 0x0180 }
            r3.append(r4)     // Catch:{ IOException -> 0x0180 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x0180 }
            r7.baseUrl = r3     // Catch:{ IOException -> 0x0180 }
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            r7.resourcesPath = r2     // Catch:{ IOException -> 0x0180 }
            boolean r7 = r6.isCancelled()     // Catch:{ IOException -> 0x0180 }
            if (r7 == 0) goto L_0x014a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0180 }
            if (r1 == 0) goto L_0x0149
            r1.close()     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            return r7
        L_0x014a:
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Book r7 = r7.book     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.TableOfContents r7 = r7.getTableOfContents()     // Catch:{ IOException -> 0x0180 }
            java.util.List r7 = r7.getTocReferences()     // Catch:{ IOException -> 0x0180 }
            r6.m27752a(r7, r0)     // Catch:{ IOException -> 0x0180 }
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            com.seattleclouds.modules.epubreader.ePubBookState r2 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Book r2 = r2.book     // Catch:{ IOException -> 0x0180 }
            java.util.List r2 = r2.getContents()     // Catch:{ IOException -> 0x0180 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0180 }
            r7.maxIndex = r2     // Catch:{ IOException -> 0x0180 }
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Book r7 = r7.book     // Catch:{ IOException -> 0x0180 }
            nl.siegmann.epublib.domain.Resource r7 = r7.getCoverImage()     // Catch:{ IOException -> 0x0180 }
            if (r7 == 0) goto L_0x0178
            com.seattleclouds.modules.epubreader.ePubBookState r7 = r6.f19883b     // Catch:{ IOException -> 0x0180 }
            r2 = 1
            r7.hasCoverImage = r2     // Catch:{ IOException -> 0x0180 }
        L_0x0178:
            if (r1 == 0) goto L_0x018b
        L_0x017a:
            r1.close()     // Catch:{ IOException -> 0x018b }
            goto L_0x018b
        L_0x017e:
            r7 = move-exception
            goto L_0x0190
        L_0x0180:
            r7 = move-exception
        L_0x0181:
            java.lang.String r2 = "ePubReader"
            java.lang.String r3 = "Exception"
            android.util.Log.d(r2, r3, r7)     // Catch:{ all -> 0x017e }
            if (r1 == 0) goto L_0x018b
            goto L_0x017a
        L_0x018b:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L_0x0190:
            if (r1 == 0) goto L_0x0195
            r1.close()     // Catch:{ IOException -> 0x0195 }
        L_0x0195:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.epubreader.C5589b.doInBackground(java.lang.String[]):java.lang.Integer");
    }

    /* renamed from: a */
    public void mo18067a(C5590a aVar) {
        this.f19882a = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(Integer num) {
        this.f19883b.error = num.intValue();
        if (this.f19882a != null) {
            C5590a aVar = (C5590a) this.f19882a.get();
            if (aVar != null) {
                aVar.mo18072a(this.f19883b);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        if (this.f19882a != null) {
            C5590a aVar = (C5590a) this.f19882a.get();
            if (aVar != null) {
                aVar.mo18073z_();
            }
        }
    }
}
