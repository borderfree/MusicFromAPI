package android.support.p023v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: android.support.v7.widget.d */
class C1097d extends DataSetObservable {

    /* renamed from: a */
    static final String f3810a = "d";

    /* renamed from: e */
    private static final Object f3811e = new Object();

    /* renamed from: f */
    private static final Map<String, C1097d> f3812f = new HashMap();

    /* renamed from: b */
    final Context f3813b;

    /* renamed from: c */
    final String f3814c;

    /* renamed from: d */
    boolean f3815d;

    /* renamed from: g */
    private final Object f3816g;

    /* renamed from: h */
    private final List<C1098a> f3817h;

    /* renamed from: i */
    private final List<C1100c> f3818i;

    /* renamed from: j */
    private Intent f3819j;

    /* renamed from: k */
    private C1099b f3820k;

    /* renamed from: l */
    private int f3821l;

    /* renamed from: m */
    private boolean f3822m;

    /* renamed from: n */
    private boolean f3823n;

    /* renamed from: o */
    private boolean f3824o;

    /* renamed from: p */
    private C1101d f3825p;

    /* renamed from: android.support.v7.widget.d$a */
    public static final class C1098a implements Comparable<C1098a> {

        /* renamed from: a */
        public final ResolveInfo f3826a;

        /* renamed from: b */
        public float f3827b;

        public C1098a(ResolveInfo resolveInfo) {
            this.f3826a = resolveInfo;
        }

        /* renamed from: a */
        public int compareTo(C1098a aVar) {
            return Float.floatToIntBits(aVar.f3827b) - Float.floatToIntBits(this.f3827b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.f3827b) == Float.floatToIntBits(((C1098a) obj).f3827b);
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f3827b) + 31;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("resolveInfo:");
            sb.append(this.f3826a.toString());
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f3827b));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$b */
    public interface C1099b {
        /* renamed from: a */
        void mo5422a(Intent intent, List<C1098a> list, List<C1100c> list2);
    }

    /* renamed from: android.support.v7.widget.d$c */
    public static final class C1100c {

        /* renamed from: a */
        public final ComponentName f3828a;

        /* renamed from: b */
        public final long f3829b;

        /* renamed from: c */
        public final float f3830c;

        public C1100c(ComponentName componentName, long j, float f) {
            this.f3828a = componentName;
            this.f3829b = j;
            this.f3830c = f;
        }

        public C1100c(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1100c cVar = (C1100c) obj;
            if (this.f3828a == null) {
                if (cVar.f3828a != null) {
                    return false;
                }
            } else if (!this.f3828a.equals(cVar.f3828a)) {
                return false;
            }
            return this.f3829b == cVar.f3829b && Float.floatToIntBits(this.f3830c) == Float.floatToIntBits(cVar.f3830c);
        }

        public int hashCode() {
            return (((((this.f3828a == null ? 0 : this.f3828a.hashCode()) + 31) * 31) + ((int) (this.f3829b ^ (this.f3829b >>> 32)))) * 31) + Float.floatToIntBits(this.f3830c);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append("; activity:");
            sb.append(this.f3828a);
            sb.append("; time:");
            sb.append(this.f3829b);
            sb.append("; weight:");
            sb.append(new BigDecimal((double) this.f3830c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: android.support.v7.widget.d$d */
    public interface C1101d {
        /* renamed from: a */
        boolean mo5426a(C1097d dVar, Intent intent);
    }

    /* renamed from: android.support.v7.widget.d$e */
    private final class C1102e extends AsyncTask<Object, Void, Void> {
        C1102e() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x006f, code lost:
            if (r4 != null) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00da, code lost:
            if (r4 == null) goto L_0x00dd;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void doInBackground(java.lang.Object... r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = r12[r0]
                java.util.List r1 = (java.util.List) r1
                r2 = 1
                r12 = r12[r2]
                java.lang.String r12 = (java.lang.String) r12
                r3 = 0
                android.support.v7.widget.d r4 = android.support.p023v7.widget.C1097d.this     // Catch:{ FileNotFoundException -> 0x00e8 }
                android.content.Context r4 = r4.f3813b     // Catch:{ FileNotFoundException -> 0x00e8 }
                java.io.FileOutputStream r4 = r4.openFileOutput(r12, r0)     // Catch:{ FileNotFoundException -> 0x00e8 }
                org.xmlpull.v1.XmlSerializer r12 = android.util.Xml.newSerializer()
                r12.setOutput(r4, r3)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "UTF-8"
                java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.startDocument(r5, r6)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r5 = "historical-records"
                r12.startTag(r3, r5)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r5 = r1.size()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r6 = 0
            L_0x002d:
                if (r6 >= r5) goto L_0x0063
                java.lang.Object r7 = r1.remove(r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.d$c r7 = (android.support.p023v7.widget.C1097d.C1100c) r7     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "historical-record"
                r12.startTag(r3, r8)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "activity"
                android.content.ComponentName r9 = r7.f3828a     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = r9.flattenToString()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "time"
                long r9 = r7.f3829b     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.attribute(r3, r8, r9)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r8 = "weight"
                float r7 = r7.f3830c     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.attribute(r3, r8, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                java.lang.String r7 = "historical-record"
                r12.endTag(r3, r7)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                int r6 = r6 + 1
                goto L_0x002d
            L_0x0063:
                java.lang.String r0 = "historical-records"
                r12.endTag(r3, r0)     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                r12.endDocument()     // Catch:{ IllegalArgumentException -> 0x00bb, IllegalStateException -> 0x0099, IOException -> 0x0077 }
                android.support.v7.widget.d r12 = android.support.p023v7.widget.C1097d.this
                r12.f3815d = r2
                if (r4 == 0) goto L_0x00dd
            L_0x0071:
                r4.close()     // Catch:{ IOException -> 0x00dd }
                goto L_0x00dd
            L_0x0075:
                r12 = move-exception
                goto L_0x00de
            L_0x0077:
                r12 = move-exception
                java.lang.String r0 = android.support.p023v7.widget.C1097d.f3810a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r1.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r5 = android.support.p023v7.widget.C1097d.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3814c     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r12 = android.support.p023v7.widget.C1097d.this
                r12.f3815d = r2
                if (r4 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x0099:
                r12 = move-exception
                java.lang.String r0 = android.support.p023v7.widget.C1097d.f3810a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r1.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r5 = android.support.p023v7.widget.C1097d.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3814c     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r12 = android.support.p023v7.widget.C1097d.this
                r12.f3815d = r2
                if (r4 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00bb:
                r12 = move-exception
                java.lang.String r0 = android.support.p023v7.widget.C1097d.f3810a     // Catch:{ all -> 0x0075 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
                r1.<init>()     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = "Error writing historical record file: "
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r5 = android.support.p023v7.widget.C1097d.this     // Catch:{ all -> 0x0075 }
                java.lang.String r5 = r5.f3814c     // Catch:{ all -> 0x0075 }
                r1.append(r5)     // Catch:{ all -> 0x0075 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
                android.util.Log.e(r0, r1, r12)     // Catch:{ all -> 0x0075 }
                android.support.v7.widget.d r12 = android.support.p023v7.widget.C1097d.this
                r12.f3815d = r2
                if (r4 == 0) goto L_0x00dd
                goto L_0x0071
            L_0x00dd:
                return r3
            L_0x00de:
                android.support.v7.widget.d r0 = android.support.p023v7.widget.C1097d.this
                r0.f3815d = r2
                if (r4 == 0) goto L_0x00e7
                r4.close()     // Catch:{ IOException -> 0x00e7 }
            L_0x00e7:
                throw r12
            L_0x00e8:
                r0 = move-exception
                java.lang.String r1 = android.support.p023v7.widget.C1097d.f3810a
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Error writing historical record file: "
                r2.append(r4)
                r2.append(r12)
                java.lang.String r12 = r2.toString()
                android.util.Log.e(r1, r12, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1097d.C1102e.doInBackground(java.lang.Object[]):java.lang.Void");
        }
    }

    /* renamed from: a */
    private boolean m6006a(C1100c cVar) {
        boolean add = this.f3818i.add(cVar);
        if (add) {
            this.f3823n = true;
            m6012h();
            m6007c();
            m6009e();
            notifyChanged();
        }
        return add;
    }

    /* renamed from: c */
    private void m6007c() {
        if (!this.f3822m) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.f3823n) {
            this.f3823n = false;
            if (!TextUtils.isEmpty(this.f3814c)) {
                new C1102e().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.f3818i), this.f3814c});
            }
        }
    }

    /* renamed from: d */
    private void m6008d() {
        boolean f = m6010f() | m6011g();
        m6012h();
        if (f) {
            m6009e();
            notifyChanged();
        }
    }

    /* renamed from: e */
    private boolean m6009e() {
        if (this.f3820k == null || this.f3819j == null || this.f3817h.isEmpty() || this.f3818i.isEmpty()) {
            return false;
        }
        this.f3820k.mo5422a(this.f3819j, this.f3817h, Collections.unmodifiableList(this.f3818i));
        return true;
    }

    /* renamed from: f */
    private boolean m6010f() {
        if (!this.f3824o || this.f3819j == null) {
            return false;
        }
        this.f3824o = false;
        this.f3817h.clear();
        List queryIntentActivities = this.f3813b.getPackageManager().queryIntentActivities(this.f3819j, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            this.f3817h.add(new C1098a((ResolveInfo) queryIntentActivities.get(i)));
        }
        return true;
    }

    /* renamed from: g */
    private boolean m6011g() {
        if (!this.f3815d || !this.f3823n || TextUtils.isEmpty(this.f3814c)) {
            return false;
        }
        this.f3815d = false;
        this.f3822m = true;
        m6013i();
        return true;
    }

    /* renamed from: h */
    private void m6012h() {
        int size = this.f3818i.size() - this.f3821l;
        if (size > 0) {
            this.f3823n = true;
            for (int i = 0; i < size; i++) {
                C1100c cVar = (C1100c) this.f3818i.remove(0);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6013i() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f3813b     // Catch:{ FileNotFoundException -> 0x00c4 }
            java.lang.String r1 = r9.f3814c     // Catch:{ FileNotFoundException -> 0x00c4 }
            java.io.FileInputStream r0 = r0.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x00c4 }
            org.xmlpull.v1.XmlPullParser r1 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            java.lang.String r2 = "UTF-8"
            r1.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            r2 = 0
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x001d
            r4 = 2
            if (r2 == r4) goto L_0x001d
            int r2 = r1.next()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            goto L_0x0012
        L_0x001d:
            java.lang.String r2 = "historical-records"
            java.lang.String r4 = r1.getName()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            boolean r2 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            if (r2 == 0) goto L_0x007a
            java.util.List<android.support.v7.widget.d$c> r2 = r9.f3818i     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            r2.clear()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        L_0x002e:
            int r4 = r1.next()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            if (r4 != r3) goto L_0x003b
            if (r0 == 0) goto L_0x00bd
        L_0x0036:
            r0.close()     // Catch:{ IOException -> 0x00bd }
            goto L_0x00bd
        L_0x003b:
            r5 = 3
            if (r4 == r5) goto L_0x002e
            r5 = 4
            if (r4 != r5) goto L_0x0042
            goto L_0x002e
        L_0x0042:
            java.lang.String r4 = r1.getName()     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            java.lang.String r5 = "historical-record"
            boolean r4 = r5.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            if (r4 == 0) goto L_0x0072
            java.lang.String r4 = "activity"
            r5 = 0
            java.lang.String r4 = r1.getAttributeValue(r5, r4)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            java.lang.String r6 = "time"
            java.lang.String r6 = r1.getAttributeValue(r5, r6)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            long r6 = java.lang.Long.parseLong(r6)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            java.lang.String r8 = "weight"
            java.lang.String r5 = r1.getAttributeValue(r5, r8)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            float r5 = java.lang.Float.parseFloat(r5)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            android.support.v7.widget.d$c r8 = new android.support.v7.widget.d$c     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            r8.<init>(r4, r6, r5)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            r2.add(r8)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            goto L_0x002e
        L_0x0072:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            java.lang.String r2 = "Share records file not well-formed."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            throw r1     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        L_0x007a:
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            java.lang.String r2 = "Share records file does not start with historical-records tag."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
            throw r1     // Catch:{ XmlPullParserException -> 0x00a0, IOException -> 0x0084 }
        L_0x0082:
            r1 = move-exception
            goto L_0x00be
        L_0x0084:
            r1 = move-exception
            java.lang.String r2 = f3810a     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r3.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = "Error reading historical recrod file: "
            r3.append(r4)     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r9.f3814c     // Catch:{ all -> 0x0082 }
            r3.append(r4)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0082 }
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x00bd
            goto L_0x0036
        L_0x00a0:
            r1 = move-exception
            java.lang.String r2 = f3810a     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r3.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = "Error reading historical recrod file: "
            r3.append(r4)     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r9.f3814c     // Catch:{ all -> 0x0082 }
            r3.append(r4)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0082 }
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x00bd
            goto L_0x0036
        L_0x00bd:
            return
        L_0x00be:
            if (r0 == 0) goto L_0x00c3
            r0.close()     // Catch:{ IOException -> 0x00c3 }
        L_0x00c3:
            throw r1
        L_0x00c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1097d.m6013i():void");
    }

    /* renamed from: a */
    public int mo5411a() {
        int size;
        synchronized (this.f3816g) {
            m6008d();
            size = this.f3817h.size();
        }
        return size;
    }

    /* renamed from: a */
    public int mo5412a(ResolveInfo resolveInfo) {
        synchronized (this.f3816g) {
            m6008d();
            List<C1098a> list = this.f3817h;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C1098a) list.get(i)).f3826a == resolveInfo) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public ResolveInfo mo5413a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.f3816g) {
            m6008d();
            resolveInfo = ((C1098a) this.f3817h.get(i)).f3826a;
        }
        return resolveInfo;
    }

    /* renamed from: b */
    public Intent mo5414b(int i) {
        synchronized (this.f3816g) {
            if (this.f3819j == null) {
                return null;
            }
            m6008d();
            C1098a aVar = (C1098a) this.f3817h.get(i);
            ComponentName componentName = new ComponentName(aVar.f3826a.activityInfo.packageName, aVar.f3826a.activityInfo.name);
            Intent intent = new Intent(this.f3819j);
            intent.setComponent(componentName);
            if (this.f3825p != null) {
                if (this.f3825p.mo5426a(this, new Intent(intent))) {
                    return null;
                }
            }
            m6006a(new C1100c(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    /* renamed from: b */
    public ResolveInfo mo5415b() {
        synchronized (this.f3816g) {
            m6008d();
            if (this.f3817h.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((C1098a) this.f3817h.get(0)).f3826a;
            return resolveInfo;
        }
    }

    /* renamed from: c */
    public void mo5416c(int i) {
        synchronized (this.f3816g) {
            m6008d();
            C1098a aVar = (C1098a) this.f3817h.get(i);
            C1098a aVar2 = (C1098a) this.f3817h.get(0);
            m6006a(new C1100c(new ComponentName(aVar.f3826a.activityInfo.packageName, aVar.f3826a.activityInfo.name), System.currentTimeMillis(), aVar2 != null ? (aVar2.f3827b - aVar.f3827b) + 5.0f : 1.0f));
        }
    }
}
