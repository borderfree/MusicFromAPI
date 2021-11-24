package com.seattleclouds.modules.mosaic;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p039f.C1230b;
import com.bumptech.glide.request.C1593f;
import com.bumptech.glide.request.C1594g;
import com.bumptech.glide.request.p055a.C1579h;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.mosaic.b */
public class C5874b extends C6557s {

    /* renamed from: e */
    private static final String f20798e = "com.seattleclouds.modules.mosaic.b";

    /* renamed from: a */
    private ImageView f20799a;

    /* renamed from: b */
    private ImgMetadata f20800b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ProgressBar f20801c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f20802d;

    /* renamed from: a */
    public static Bitmap m28824a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 1), Math.max(drawable.getIntrinsicHeight(), 1), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(C5460i.fragment_mosaic_image, viewGroup, false);
        this.f20801c = (ProgressBar) frameLayout.findViewById(C5458g.progressBar);
        this.f20799a = (ImageView) frameLayout.findViewById(C5458g.imageView);
        return frameLayout;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f20800b = (ImgMetadata) m.getParcelable("ARG_IMG_METADATA");
        }
        mo1283e(true);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        if (this.f20800b == null || this.f20800b.f20780b == null) {
            this.f20799a.setImageResource(C5457f.cover_placeholder);
            return;
        }
        this.f20801c.setVisibility(0);
        String str = this.f20800b.f20780b;
        boolean z = this.f20800b.f20782d;
        if (!str.startsWith("http://") && !str.startsWith("https://") && !z) {
            StringBuilder sb = new StringBuilder();
            sb.append(App.m25654h());
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(str);
            str = sb.toString();
        }
        C1594g gVar = new C1594g();
        gVar.mo6474a(C5457f.cover_placeholder);
        gVar.mo6483b(C5457f.no_image_available);
        gVar.mo6484b((C1375c) new C1230b(String.valueOf(System.currentTimeMillis())));
        C1186c.m6451a((Fragment) this).mo5855b(gVar).mo5850a(str).mo5831a((C1593f<TranscodeType>) new C1593f<Drawable>() {
            /* renamed from: a */
            public boolean mo6457a(Drawable drawable, Object obj, C1579h<Drawable> hVar, DataSource dataSource, boolean z) {
                C5874b.this.f20801c.setVisibility(8);
                C5874b.this.f20802d = true;
                return false;
            }

            /* renamed from: a */
            public boolean mo6456a(GlideException glideException, Object obj, C1579h<Drawable> hVar, boolean z) {
                C5874b.this.f20801c.setVisibility(8);
                C5874b.this.f20802d = false;
                return false;
            }
        }).mo5837a(this.f20799a);
    }

    /* renamed from: b */
    public ImgMetadata mo1450b() {
        return this.f20800b;
    }

    /* renamed from: c */
    public Bitmap mo1453c() {
        if (!this.f20802d) {
            return null;
        }
        Drawable drawable = this.f20799a.getDrawable();
        if (drawable == null) {
            return null;
        }
        return m28824a(drawable);
    }

    /* renamed from: d */
    public boolean mo18637d() {
        return this.f20802d;
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        this.f20802d = false;
    }
}
