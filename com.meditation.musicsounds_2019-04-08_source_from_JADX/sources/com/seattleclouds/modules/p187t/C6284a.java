package com.seattleclouds.modules.p187t;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.mosaic.ImgMetadata;
import com.seattleclouds.modules.p187t.C6290c.C6291a;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;

/* renamed from: com.seattleclouds.modules.t.a */
public class C6284a extends C6557s implements C6291a {

    /* renamed from: a */
    final OnGlobalLayoutListener f22307a = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            C6284a.this.f22313f = C6284a.this.f22311d.getWidth();
            C6284a.this.f22314g = C6284a.this.f22311d.getHeight();
            C6284a.this.f22311d.setTag(Integer.valueOf(-1));
            C6284a.this.m30557e(C6284a.this.f22308ae);
            C6611g.m31979a(C6284a.this.f22311d.getViewTreeObserver(), C6284a.this.f22307a);
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public int f22308ae;

    /* renamed from: b */
    private ArrayList<ImgMetadata> f22309b = new ArrayList<>();

    /* renamed from: c */
    private Gallery f22310c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f22311d = null;

    /* renamed from: e */
    private ProgressBar f22312e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f22313f = 100;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f22314g = 100;

    /* renamed from: h */
    private C6290c f22315h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2422c f22316i;

    /* renamed from: com.seattleclouds.modules.t.a$a */
    static class C6287a {

        /* renamed from: a */
        ImageView f22319a;

        C6287a() {
        }
    }

    /* renamed from: com.seattleclouds.modules.t.a$b */
    public class C6288b extends BaseAdapter {

        /* renamed from: b */
        private final ArrayList<ImgMetadata> f22321b;

        /* renamed from: c */
        private Context f22322c;

        public C6288b(Context context, ArrayList<ImgMetadata> arrayList) {
            this.f22322c = context;
            this.f22321b = arrayList;
        }

        /* renamed from: a */
        public ImgMetadata getItem(int i) {
            return (ImgMetadata) this.f22321b.get(i);
        }

        /* renamed from: a */
        public void mo19661a() {
            this.f22321b.clear();
            notifyDataSetChanged();
        }

        public int getCount() {
            return this.f22321b.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6287a aVar;
            if (view == 0) {
                r5 = new ImageView(this.f22322c);
                int a = C6619m.m32014a(C6284a.this.mo1318s(), 120.0f);
                r5.setLayoutParams(new LayoutParams(a, a));
                aVar = new C6287a();
                aVar.f22319a = r5;
                r5.setTag(aVar);
                r5 = r5;
            } else {
                aVar = (C6287a) view.getTag();
                r5 = view;
            }
            String str = ((ImgMetadata) this.f22321b.get(i)).f20780b;
            aVar.f22319a.setImageBitmap(null);
            aVar.f22319a.setTag(Integer.valueOf(i));
            C6284a.this.f22316i.mo8578a((Object) str, aVar.f22319a);
            return r5;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30557e(int i) {
        if (i != ((Integer) this.f22311d.getTag()).intValue()) {
            this.f22308ae = i;
            this.f22311d.setTag(Integer.valueOf(this.f22308ae));
            if (i < this.f22309b.size()) {
                String str = ((ImgMetadata) this.f22309b.get(i)).f20780b;
                if (this.f22315h != null) {
                    this.f22315h.cancel(true);
                }
                this.f22315h = new C6290c(this.f22311d, this.f22313f, this.f22314g, this.f22308ae);
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    this.f22315h.mo19669a((C6291a) this);
                }
                this.f22315h.execute(new String[]{str});
            }
        }
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        this.f22310c.setAdapter(new C6288b(mo1318s(), new ArrayList(this.f22309b)));
        this.f22310c.setSelection(this.f22308ae);
        m30557e(this.f22308ae);
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        C6288b bVar = (C6288b) this.f22310c.getAdapter();
        if (bVar != null) {
            bVar.mo19661a();
        }
        this.f22311d.setImageBitmap(null);
        this.f22311d.setTag(Integer.valueOf(-1));
        this.f22310c.setAdapter(null);
    }

    /* renamed from: L */
    public void mo1202L() {
        this.f22316i.mo8585i();
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.slideshow_view, viewGroup, false);
        this.f22310c = (Gallery) inflate.findViewById(C5458g.thumbnail_gallery);
        this.f22310c.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C6284a.this.m30557e(i);
            }
        });
        this.f22311d = (ImageView) inflate.findViewById(C5458g.full_image);
        this.f22311d.setTag(Integer.valueOf(-1));
        this.f22311d.getViewTreeObserver().addOnGlobalLayoutListener(this.f22307a);
        this.f22312e = (ProgressBar) inflate.findViewById(C5458g.progressBar);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            ArrayList<ImgMetadata> parcelableArrayList = m.getParcelableArrayList("ARG_IMAGES");
            if (parcelableArrayList != null) {
                this.f22309b = parcelableArrayList;
            }
        }
        if (bundle != null) {
            this.f22308ae = bundle.getInt("STATE_CURRENT_POSITION", 0);
        }
    }

    /* renamed from: b */
    public void mo1450b() {
        this.f22312e.setVisibility(0);
    }

    /* renamed from: c */
    public void mo1453c() {
        this.f22312e.setVisibility(8);
    }

    /* renamed from: d */
    public void mo19657d() {
        this.f22312e.setVisibility(8);
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        C2420a aVar = new C2420a(mo1318s(), "slideshow");
        aVar.f7706g = false;
        aVar.mo8566a(0.05f);
        aVar.f7708i = true;
        this.f22316i = new C6289b(mo1318s(), C6619m.m32014a(mo1318s(), 120.0f), false);
        this.f22316i.mo8576a(mo1318s().mo1469g(), aVar);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putInt("STATE_CURRENT_POSITION", this.f22308ae);
        super.mo1282e(bundle);
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f22315h != null) {
            this.f22315h.cancel(true);
            this.f22315h = null;
        }
        super.mo1296i();
    }
}
