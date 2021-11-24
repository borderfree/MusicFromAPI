package com.seattleclouds.modules.dynamiclist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.support.p009v4.p019g.C0496g;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.bitmapfun.C2429g;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.p158c.C5324a;
import com.seattleclouds.p158c.C5325b;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6619m;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.seattleclouds.modules.dynamiclist.b */
public class C5557b extends BaseAdapter implements SectionIndexer {

    /* renamed from: a */
    private C0496g<String, BitmapDrawable> f19792a = new C0496g<String, BitmapDrawable>(((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8) {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo1933b(String str, BitmapDrawable bitmapDrawable) {
            return C5557b.m27636a(bitmapDrawable) / 1024;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public LayoutInflater f19793b;

    /* renamed from: c */
    private List<C5573d> f19794c;

    /* renamed from: d */
    private String[] f19795d;

    /* renamed from: e */
    private SparseIntArray f19796e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public HashMap<String, C5556a> f19797f;

    /* renamed from: com.seattleclouds.modules.dynamiclist.b$a */
    static class C5559a extends BitmapDrawable {

        /* renamed from: a */
        private final WeakReference<C5560b> f19799a;

        public C5559a(Resources resources, Bitmap bitmap, C5560b bVar) {
            super(resources, bitmap);
            this.f19799a = new WeakReference<>(bVar);
        }

        /* renamed from: a */
        public C5560b mo18009a() {
            return (C5560b) this.f19799a.get();
        }
    }

    /* renamed from: com.seattleclouds.modules.dynamiclist.b$b */
    private class C5560b extends AsyncTask<String, String, Drawable> {

        /* renamed from: a */
        String f19800a = "";

        /* renamed from: c */
        private final WeakReference<ImageView> f19802c;

        /* renamed from: d */
        private String f19803d = null;

        /* renamed from: e */
        private C5573d f19804e;

        public C5560b(ImageView imageView, C5573d dVar) {
            this.f19802c = new WeakReference<>(imageView);
            this.f19804e = dVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:50:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0132  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x013a  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x013f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.graphics.drawable.Drawable mo18010a(java.lang.String r11) {
            /*
                r10 = this;
                r0 = 0
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r1.<init>()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                com.seattleclouds.modules.dynamiclist.b r2 = com.seattleclouds.modules.dynamiclist.C5557b.this     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                android.view.LayoutInflater r2 = r2.f19793b     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                android.content.Context r2 = r2.getContext()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.io.File r2 = r2.getCacheDir()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r1.append(r2)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r2 = "/DictionaryPage/"
                r1.append(r2)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r2.<init>(r1)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                if (r3 != 0) goto L_0x0032
                r2.mkdirs()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
            L_0x0032:
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r3.<init>()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r3.append(r1)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r4 = com.seattleclouds.util.C6592al.m31904a(r11)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r3.append(r4)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                if (r3 == 0) goto L_0x008c
                java.util.Date r3 = new java.util.Date     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                long r4 = r2.lastModified()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.util.Date r4 = new java.util.Date     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r4.<init>()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                long r4 = r4.getTime()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r6 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 / r6
                long r8 = r3.getTime()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                long r8 = r8 / r6
                r3 = 0
                long r4 = r4 - r8
                r6 = 43200(0xa8c0, double:2.13436E-319)
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 >= 0) goto L_0x008c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r2.<init>()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r2.append(r1)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r11 = com.seattleclouds.util.C6592al.m31904a(r11)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r2.append(r11)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r1.<init>(r0, r11)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                return r1
            L_0x008c:
                com.seattleclouds.modules.dynamiclist.d r3 = r10.f19804e     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r3 = r3.mo18049g()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                if (r3 == 0) goto L_0x00ad
                com.seattleclouds.modules.dynamiclist.d r3 = r10.f19804e     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r3 = r3.mo18049g()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r4 = "http"
                int r3 = r3.indexOf(r4)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                if (r3 == 0) goto L_0x00ad
                com.seattleclouds.modules.dynamiclist.d r11 = r10.f19804e     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.lang.String r11 = r11.mo18049g()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                android.graphics.drawable.Drawable r11 = com.seattleclouds.App.m25658j(r11)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                return r11
            L_0x00ad:
                java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                r3.<init>(r11)     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0136, all -> 0x0129 }
                com.seattleclouds.modules.dynamiclist.b r4 = com.seattleclouds.modules.dynamiclist.C5557b.this     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                java.lang.String r4 = r4.mo17997b(r11)     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                if (r4 == 0) goto L_0x00c5
                java.lang.String r5 = "Authorization"
                r3.setRequestProperty(r5, r4)     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
            L_0x00c5:
                int r4 = r3.getContentLength()     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                r5.<init>(r6)     // Catch:{ Exception -> 0x0127, all -> 0x0123 }
                r5.readFully(r4)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x010c }
                r7 = 1
                r6.<init>(r2, r7)     // Catch:{ FileNotFoundException -> 0x010c }
                r6.write(r4)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r6.flush()     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r6.close()     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r2.<init>()     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r2.append(r1)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                java.lang.String r11 = com.seattleclouds.util.C6592al.m31904a(r11)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r2.append(r11)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                java.lang.String r11 = r2.toString()     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                com.seattleclouds.modules.dynamiclist.d r1 = r10.f19804e     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r1.mo18048g(r11)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                android.graphics.drawable.BitmapDrawable r1 = new android.graphics.drawable.BitmapDrawable     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                r1.<init>(r0, r11)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                if (r3 == 0) goto L_0x0108
                r3.disconnect()
            L_0x0108:
                r5.close()
                return r1
            L_0x010c:
                r11 = move-exception
                java.lang.String r1 = r10.f19800a     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                java.lang.String r11 = r11.getMessage()     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                android.util.Log.e(r1, r11)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
                if (r3 == 0) goto L_0x011b
                r3.disconnect()
            L_0x011b:
                r5.close()
                return r0
            L_0x011f:
                r11 = move-exception
                goto L_0x0125
            L_0x0121:
                goto L_0x0138
            L_0x0123:
                r11 = move-exception
                r5 = r0
            L_0x0125:
                r0 = r3
                goto L_0x012b
            L_0x0127:
                r5 = r0
                goto L_0x0138
            L_0x0129:
                r11 = move-exception
                r5 = r0
            L_0x012b:
                if (r0 == 0) goto L_0x0130
                r0.disconnect()
            L_0x0130:
                if (r5 == 0) goto L_0x0135
                r5.close()
            L_0x0135:
                throw r11
            L_0x0136:
                r3 = r0
                r5 = r3
            L_0x0138:
                if (r3 == 0) goto L_0x013d
                r3.disconnect()
            L_0x013d:
                if (r5 == 0) goto L_0x0142
                r5.close()
            L_0x0142:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.dynamiclist.C5557b.C5560b.mo18010a(java.lang.String):android.graphics.drawable.Drawable");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(String... strArr) {
            if (strArr != null && strArr.length > 0) {
                this.f19803d = strArr[0];
                try {
                    return mo18010a(this.f19803d);
                } catch (IOException e) {
                    Log.e(this.f19800a, e.toString());
                }
            }
            return null;
        }

        /* renamed from: a */
        public String mo18012a() {
            return this.f19803d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            if (drawable != null) {
                if (!(this.f19802c == null || drawable == null)) {
                    ImageView imageView = (ImageView) this.f19802c.get();
                    if (imageView != null) {
                        imageView.setImageDrawable(drawable);
                    }
                }
                C5557b.this.mo17994a(String.valueOf(this.f19803d), (BitmapDrawable) drawable);
                ImageView imageView2 = (ImageView) this.f19802c.get();
                if (imageView2 != null) {
                    C5557b.this.m27639a(imageView2, (C5556a) C5557b.this.f19797f.get(this.f19804e.mo18038b()), Integer.valueOf(imageView2.getRootView().getWidth()).intValue());
                }
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.dynamiclist.b$c */
    private static class C5561c {

        /* renamed from: a */
        public TextView f19805a;

        /* renamed from: b */
        public TextView f19806b;

        /* renamed from: c */
        public ImageView f19807c;

        /* renamed from: d */
        public int f19808d;

        private C5561c() {
            this.f19805a = null;
            this.f19806b = null;
            this.f19807c = null;
            this.f19808d = 2;
        }
    }

    public C5557b(Context context, List<C5573d> list, String[] strArr, SparseIntArray sparseIntArray, HashMap<String, C5556a> hashMap) {
        this.f19793b = LayoutInflater.from(context);
        this.f19794c = list;
        this.f19795d = strArr;
        this.f19796e = sparseIntArray;
        this.f19797f = hashMap;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static int m27636a(BitmapDrawable bitmapDrawable) {
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap == null) {
            return 0;
        }
        return C2429g.m11310d() ? bitmap.getByteCount() : bitmap.getRowBytes() * bitmap.getHeight();
    }

    /* renamed from: a */
    private static C5560b m27637a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof C5559a) {
                return ((C5559a) drawable).mo18009a();
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01d3 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m27639a(android.widget.ImageView r10, com.seattleclouds.modules.dynamiclist.C5556a r11, int r12) {
        /*
            r9 = this;
            if (r10 == 0) goto L_0x01e3
            java.lang.String r0 = r11.mo17980l()
            boolean r0 = com.seattleclouds.util.C6592al.m31909b(r0)
            if (r0 != 0) goto L_0x01e3
            java.lang.String r0 = r11.mo17980l()
            java.lang.String r1 = "image"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x01e3
            r0 = 1
            r10.setAdjustViewBounds(r0)
            int r0 = r11.mo17988t()
            int r1 = r11.mo17987s()
            android.graphics.drawable.Drawable r2 = r10.getDrawable()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L_0x0036
            android.graphics.drawable.Drawable r2 = r10.getDrawable()
            int r2 = r2.getIntrinsicWidth()
            goto L_0x0039
        L_0x0036:
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x0039:
            android.graphics.drawable.Drawable r4 = r10.getDrawable()
            if (r4 == 0) goto L_0x0048
            android.graphics.drawable.Drawable r4 = r10.getDrawable()
            int r4 = r4.getIntrinsicHeight()
            goto L_0x004b
        L_0x0048:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x004b:
            int r5 = r11.mo17987s()
            r6 = 44
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 != r3) goto L_0x005d
            int r5 = r11.mo17988t()
            if (r5 != r3) goto L_0x005d
            goto L_0x008a
        L_0x005d:
            int r5 = r11.mo17987s()
            if (r5 != r3) goto L_0x0074
            int r5 = r11.mo17988t()
            if (r5 == r3) goto L_0x0074
            int r0 = r11.mo17988t()
            if (r0 != r8) goto L_0x008a
            r1 = r4
            r0 = 44
            goto L_0x00ee
        L_0x0074:
            int r5 = r11.mo17987s()
            if (r5 == r3) goto L_0x008d
            int r5 = r11.mo17988t()
            if (r5 != r3) goto L_0x008d
            int r0 = r11.mo17987s()
            if (r0 != r8) goto L_0x008a
            r0 = r2
        L_0x0087:
            r1 = 44
            goto L_0x00ee
        L_0x008a:
            r0 = r2
            r1 = r4
            goto L_0x00ee
        L_0x008d:
            int r5 = r11.mo17987s()
            if (r5 == r3) goto L_0x00ee
            int r5 = r11.mo17988t()
            if (r5 == r3) goto L_0x00ee
            r10.setAdjustViewBounds(r7)
            int r5 = r11.mo17987s()
            if (r5 != r8) goto L_0x00ab
            int r5 = r11.mo17988t()
            if (r5 != r8) goto L_0x00ab
            r0 = 44
            goto L_0x0087
        L_0x00ab:
            int r5 = r11.mo17987s()
            if (r5 == r8) goto L_0x00c2
            int r5 = r11.mo17988t()
            if (r5 != r8) goto L_0x00c2
            int r1 = r11.mo17987s()
            float r0 = (float) r1
            float r4 = (float) r4
            float r2 = (float) r2
            float r4 = r4 / r2
            float r0 = r0 / r4
            int r0 = (int) r0
            goto L_0x00ee
        L_0x00c2:
            int r5 = r11.mo17987s()
            if (r5 != r8) goto L_0x00da
            int r5 = r11.mo17988t()
            if (r5 == r8) goto L_0x00da
            int r0 = r11.mo17988t()
            float r1 = (float) r0
            float r4 = (float) r4
            float r2 = (float) r2
            float r4 = r4 / r2
            float r1 = r1 * r4
            int r1 = (int) r1
            goto L_0x00ee
        L_0x00da:
            int r2 = r11.mo17987s()
            if (r2 == r8) goto L_0x00ee
            int r2 = r11.mo17988t()
            if (r2 == r8) goto L_0x00ee
            int r1 = r11.mo17987s()
            int r0 = r11.mo17988t()
        L_0x00ee:
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            android.view.LayoutInflater r4 = r9.f19793b
            android.content.Context r4 = r4.getContext()
            float r5 = (float) r0
            int r4 = com.seattleclouds.util.C6619m.m32014a(r4, r5)
            r2.width = r4
            android.view.LayoutInflater r4 = r9.f19793b
            android.content.Context r4 = r4.getContext()
            float r5 = (float) r1
            int r4 = com.seattleclouds.util.C6619m.m32014a(r4, r5)
            r2.height = r4
            if (r0 <= r12) goto L_0x016f
            int r4 = r0 - r12
            com.seattleclouds.modules.dynamiclist.SCDynamicStyleAlign r5 = r11.mo17989u()
            com.seattleclouds.modules.dynamiclist.SCDynamicStyleAlign r6 = com.seattleclouds.modules.dynamiclist.SCDynamicStyleAlign.SCDynamicStyleAlignRight
            if (r5 != r6) goto L_0x0128
            int r5 = r11.mo17990v()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r5)
            int r4 = r4 - r5
            int r4 = r4 * -1
            r5 = r4
            r4 = 0
            goto L_0x0156
        L_0x0128:
            com.seattleclouds.modules.dynamiclist.SCDynamicStyleAlign r6 = com.seattleclouds.modules.dynamiclist.SCDynamicStyleAlign.SCDynamicStyleAlignCenter
            if (r5 != r6) goto L_0x0146
            int r4 = r4 / 2
            int r5 = r11.mo17990v()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r5)
            int r5 = r4 - r5
            int r5 = r5 * -1
            int r6 = r11.mo17990v()
            int r6 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r6)
            int r4 = r4 + r6
            int r4 = r4 * -1
            goto L_0x0156
        L_0x0146:
            int r4 = r11.mo17990v()
            int r4 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r4)
            int r5 = r11.mo17990v()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r5)
        L_0x0156:
            android.view.LayoutInflater r6 = r9.f19793b
            android.content.Context r6 = r6.getContext()
            float r5 = (float) r5
            int r5 = com.seattleclouds.util.C6619m.m32014a(r6, r5)
            r2.leftMargin = r5
            android.view.LayoutInflater r5 = r9.f19793b
            android.content.Context r5 = r5.getContext()
            float r4 = (float) r4
            int r4 = com.seattleclouds.util.C6619m.m32014a(r5, r4)
            goto L_0x0197
        L_0x016f:
            android.view.LayoutInflater r4 = r9.f19793b
            android.content.Context r4 = r4.getContext()
            int r5 = r11.mo17990v()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r5)
            float r5 = (float) r5
            int r4 = com.seattleclouds.util.C6619m.m32014a(r4, r5)
            r2.leftMargin = r4
            android.view.LayoutInflater r4 = r9.f19793b
            android.content.Context r4 = r4.getContext()
            int r5 = r11.mo17990v()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27601a(r5)
            float r5 = (float) r5
            int r4 = com.seattleclouds.util.C6619m.m32014a(r4, r5)
        L_0x0197:
            r2.rightMargin = r4
            android.view.LayoutInflater r4 = r9.f19793b
            android.content.Context r4 = r4.getContext()
            int r5 = r11.mo17992x()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27602a(r5, r7)
            float r5 = (float) r5
            int r4 = com.seattleclouds.util.C6619m.m32014a(r4, r5)
            r2.topMargin = r4
            android.view.LayoutInflater r4 = r9.f19793b
            android.content.Context r4 = r4.getContext()
            int r5 = r11.mo17991w()
            int r5 = com.seattleclouds.modules.dynamiclist.C5556a.m27602a(r5, r7)
            float r5 = (float) r5
            int r4 = com.seattleclouds.util.C6619m.m32014a(r4, r5)
            r2.bottomMargin = r4
            com.seattleclouds.modules.dynamiclist.SCDynamicStyleAlign r11 = r11.mo17989u()
            int r11 = com.seattleclouds.modules.dynamiclist.C5556a.m27603a(r11)
            r2.addRule(r11)
            r10.setLayoutParams(r2)
            if (r0 != r3) goto L_0x01db
            if (r1 != r3) goto L_0x01db
        L_0x01d5:
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER_INSIDE
        L_0x01d7:
            r10.setScaleType(r11)
            goto L_0x01e3
        L_0x01db:
            if (r0 != r8) goto L_0x01e0
            if (r1 != r8) goto L_0x01e0
            goto L_0x01d5
        L_0x01e0:
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.FIT_XY
            goto L_0x01d7
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.dynamiclist.C5557b.m27639a(android.widget.ImageView, com.seattleclouds.modules.dynamiclist.a, int):void");
    }

    /* renamed from: a */
    private void m27641a(C5573d dVar, C5561c cVar, View view) {
        if (this.f19797f != null && dVar != null && !C6592al.m31909b(dVar.mo18038b())) {
            C5556a aVar = (C5556a) this.f19797f.get(dVar.mo18038b());
            if (aVar != null) {
                if (aVar.mo17962a() != Integer.MIN_VALUE) {
                    view.setBackgroundColor(aVar.mo17962a());
                }
                if (aVar.mo17965b() != Integer.MIN_VALUE) {
                    view.setMinimumHeight(C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17965b()));
                    view.getLayoutParams().height = C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17965b());
                }
                if (cVar.f19805a != null) {
                    int a = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                    if (aVar.mo17972e() != Integer.MIN_VALUE) {
                        a = C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17972e());
                    }
                    int a2 = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                    if (aVar.mo17974f() != Integer.MIN_VALUE) {
                        a2 = C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17974f());
                    }
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) cVar.f19805a.getLayoutParams();
                    marginLayoutParams.setMargins(a, a2, 0, aVar.mo17975g() != Integer.MIN_VALUE ? C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17975g()) : 0);
                    cVar.f19805a.setLayoutParams(marginLayoutParams);
                    cVar.f19805a.setTextColor(aVar.mo17981m());
                    cVar.f19805a.setTextSize((float) aVar.mo17982n());
                    if (aVar.mo17970d() > 0) {
                        cVar.f19805a.setMaxLines(aVar.mo17970d());
                    }
                    cVar.f19805a.setTypeface(null, C5556a.m27604a(aVar.mo17983o()));
                    if (aVar.mo17968c() != Integer.MIN_VALUE) {
                        cVar.f19805a.setWidth(C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17968c()));
                    }
                }
                if (cVar.f19806b != null) {
                    int a3 = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                    if (aVar.mo17977i() != Integer.MIN_VALUE) {
                        a3 = C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17977i());
                    }
                    if (aVar.mo17972e() != Integer.MIN_VALUE && dVar.mo18050h() == 8) {
                        a3 += C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17972e());
                    }
                    int a4 = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                    if (aVar.mo17978j() != Integer.MIN_VALUE) {
                        a4 = C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17978j());
                    }
                    if (aVar.mo17974f() != Integer.MIN_VALUE) {
                        a4 += C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17974f());
                    }
                    int a5 = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                    if (aVar.mo17979k() != Integer.MIN_VALUE) {
                        a5 = C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17979k());
                    }
                    if (aVar.mo17975g() != Integer.MIN_VALUE) {
                        a5 += C6619m.m32014a(this.f19793b.getContext(), (float) aVar.mo17975g());
                    }
                    if (aVar.mo17972e() != Integer.MIN_VALUE && dVar.mo18050h() == 8) {
                        cVar.f19806b.setPadding(0, a5, a3, a4);
                    }
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) cVar.f19806b.getLayoutParams();
                    marginLayoutParams2.setMargins(a3, a4, 0, a5);
                    cVar.f19806b.setLayoutParams(marginLayoutParams2);
                    cVar.f19806b.setTextColor(aVar.mo17984p());
                    cVar.f19806b.setTextSize((float) aVar.mo17985q());
                    if (aVar.mo17976h() > 0) {
                        cVar.f19806b.setMaxLines(aVar.mo17976h());
                    }
                    cVar.f19806b.setTypeface(null, C5556a.m27604a(aVar.mo17986r()));
                }
                if (cVar.f19807c != null) {
                    m27639a(cVar.f19807c, aVar, view.getWidth());
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m27642a(String str, ImageView imageView) {
        C5560b a = m27637a(imageView);
        if (a != null) {
            String a2 = a.mo18012a();
            if (a2 != null && a2 == str) {
                return false;
            }
            a.cancel(true);
        }
        return true;
    }

    /* renamed from: a */
    public BitmapDrawable mo17993a(String str) {
        return (BitmapDrawable) this.f19792a.mo1928a(str);
    }

    /* renamed from: a */
    public void mo17994a(String str, BitmapDrawable bitmapDrawable) {
        if (mo17993a(str) == null) {
            this.f19792a.mo1929a(str, bitmapDrawable);
        }
    }

    /* renamed from: a */
    public void mo17995a(List<C5573d> list) {
        this.f19794c = list;
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: b */
    public String mo17997b(String str) {
        C5324a a = new C5325b().mo17473a(new URL(str).getHost());
        if (a != null) {
            return a.mo17467c();
        }
        return null;
    }

    public int getCount() {
        return this.f19794c.size();
    }

    public Object getItem(int i) {
        return this.f19794c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        return ((C5573d) this.f19794c.get(i)).mo18050h();
    }

    public int getPositionForSection(int i) {
        if (this.f19796e != null) {
            return this.f19796e.get(i);
        }
        return 0;
    }

    public int getSectionForPosition(int i) {
        return ((C5573d) this.f19794c.get(i)).mo18033a();
    }

    public Object[] getSections() {
        return this.f19795d;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C5561c cVar;
        int i2;
        C5561c cVar2;
        View findViewById;
        C5561c cVar3;
        View inflate;
        LayoutInflater layoutInflater;
        int i3;
        LayoutInflater layoutInflater2;
        int i4;
        LayoutInflater layoutInflater3;
        int i5;
        C5573d dVar = (C5573d) getItem(i);
        if (view != null) {
            C5561c cVar4 = (C5561c) view.getTag();
            if (!(cVar4 == null || cVar4.f19808d == dVar.mo18050h())) {
                view = null;
            }
        }
        if (r11 == null) {
            if (dVar.mo18050h() == 0) {
                if (VERSION.SDK_INT >= 11) {
                    layoutInflater3 = this.f19793b;
                    i5 = C5460i.dynamic_list_separator;
                } else {
                    layoutInflater3 = this.f19793b;
                    i5 = C5460i.dynamic_list_item_header;
                }
                r11 = layoutInflater3.inflate(i5, viewGroup, false);
                cVar2 = new C5561c();
                findViewById = r11.findViewById(C5458g.section);
            } else {
                if (dVar.mo18050h() == 3) {
                    if (VERSION.SDK_INT >= 11) {
                        layoutInflater2 = this.f19793b;
                        i4 = C5460i.dynamic_list_item_two_line;
                    } else {
                        layoutInflater2 = this.f19793b;
                        i4 = 17367044;
                    }
                    r11 = layoutInflater2.inflate(i4, viewGroup, false);
                    cVar = new C5561c();
                    cVar.f19805a = (TextView) r11.findViewById(16908308);
                    i2 = 16908309;
                } else if (dVar.mo18050h() == 4) {
                    r11 = this.f19793b.inflate(C5460i.dynamic_list_item_two_line_horizontal, viewGroup, false);
                    cVar = new C5561c();
                    cVar.f19805a = (TextView) r11.findViewById(C5458g.text1);
                    i2 = C5458g.text2;
                } else if (dVar.mo18050h() == 1) {
                    r11 = this.f19793b.inflate(C5460i.dynamic_list_item_header_custom, viewGroup, false);
                    cVar = new C5561c();
                    cVar.f19805a = (TextView) r11.findViewById(C5458g.section);
                    cVar.f19807c = (ImageView) r11.findViewById(C5458g.image);
                    r11.setTag(cVar);
                } else {
                    if (dVar.mo18050h() == 6) {
                        cVar3 = new C5561c();
                        dVar.mo18039c(6);
                        inflate = this.f19793b.inflate(C5460i.dynamic_list_item_image_custom, viewGroup, false);
                        cVar3.f19807c = (ImageView) inflate.findViewById(C5458g.image);
                        cVar3.f19805a = (TextView) inflate.findViewById(C5458g.text1);
                    } else {
                        if (dVar.mo18050h() == 7) {
                            cVar3 = new C5561c();
                            dVar.mo18039c(7);
                            layoutInflater = this.f19793b;
                            i3 = C5460i.dynamic_list_item_two_line_custom;
                        } else if (dVar.mo18050h() == 8) {
                            cVar3 = new C5561c();
                            dVar.mo18039c(8);
                            layoutInflater = this.f19793b;
                            i3 = C5460i.dynamic_list_item_two_line_horizontal_custom;
                        } else if (dVar.mo18050h() == 5) {
                            cVar3 = new C5561c();
                            inflate = this.f19793b.inflate(C5460i.dynamic_list_item_one_line_custom, viewGroup, false);
                            cVar3.f19805a = (TextView) inflate.findViewById(C5458g.text);
                            cVar3.f19807c = (ImageView) inflate.findViewById(C5458g.image);
                            if (C6592al.m31909b(dVar.mo18049g()) && cVar3.f19807c != null) {
                                cVar3.f19807c.setVisibility(8);
                            }
                        } else {
                            r11 = this.f19793b.inflate(17367043, viewGroup, false);
                            cVar2 = new C5561c();
                            findViewById = r11.findViewById(16908308);
                        }
                        inflate = layoutInflater.inflate(i3, viewGroup, false);
                        cVar3.f19805a = (TextView) inflate.findViewById(C5458g.text1);
                        cVar3.f19806b = (TextView) inflate.findViewById(C5458g.text2);
                    }
                    inflate.setTag(cVar3);
                    View view2 = inflate;
                    cVar = cVar3;
                    r11 = view2;
                }
                cVar.f19806b = (TextView) r11.findViewById(i2);
                r11.setTag(cVar);
            }
            cVar.f19805a = (TextView) findViewById;
            r11.setTag(cVar);
        } else {
            cVar = (C5561c) r11.getTag();
        }
        if (!(cVar.f19805a == null || dVar.mo18041c() == null)) {
            cVar.f19805a.setText(dVar.mo18041c());
        }
        if (cVar.f19807c != null) {
            if ("image".equals(dVar.mo18038b()) && dVar.mo18050h() == 6) {
                LayoutParams layoutParams = new LayoutParams(-2, -2);
                layoutParams.leftMargin = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                layoutParams.topMargin = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                layoutParams.bottomMargin = C6619m.m32014a(this.f19793b.getContext(), 0.0f);
                layoutParams.addRule(9);
                cVar.f19807c.setLayoutParams(layoutParams);
                cVar.f19807c.setPadding(0, 0, 0, 0);
                cVar.f19807c.setScaleType(ScaleType.CENTER_INSIDE);
            }
            cVar.f19807c.setImageDrawable(null);
            if (dVar.mo18049g() != null) {
                BitmapDrawable a = mo17993a(dVar.mo18049g());
                if (a != null) {
                    cVar.f19807c.setImageDrawable(a);
                    cVar.f19807c.setVisibility(0);
                } else if (m27642a(dVar.mo18049g(), cVar.f19807c)) {
                    C5560b bVar = new C5560b(cVar.f19807c, dVar);
                    cVar.f19807c.setVisibility(0);
                    cVar.f19807c.setImageDrawable(new C5559a(this.f19793b.getContext().getResources(), null, bVar));
                    bVar.execute(new String[]{dVar.mo18049g()});
                }
            } else {
                cVar.f19807c.setVisibility(8);
            }
        }
        if (!(cVar.f19806b == null || dVar.mo18043d() == null)) {
            cVar.f19806b.setText(dVar.mo18043d());
        }
        cVar.f19808d = dVar.mo18050h();
        m27641a(dVar, cVar, r11);
        return r11;
    }

    public int getViewTypeCount() {
        return 9;
    }

    public boolean isEnabled(int i) {
        return getItemViewType(i) != 0;
    }
}
