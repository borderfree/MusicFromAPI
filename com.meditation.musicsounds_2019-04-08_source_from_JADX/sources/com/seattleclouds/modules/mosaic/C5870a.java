package com.seattleclouds.modules.mosaic;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.widget.SwipeRefreshLayout;
import android.support.p009v4.widget.SwipeRefreshLayout.C0674b;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bumptech.glide.C1186c;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.p039f.C1230b;
import com.bumptech.glide.request.C1594g;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5464m;
import com.seattleclouds.C6557s;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.mosaic.a */
public class C5870a extends C6557s {

    /* renamed from: ae */
    private static final String f20783ae = "com.seattleclouds.modules.mosaic.a";

    /* renamed from: a */
    private GridView f20784a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f20785b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f20786c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f20787d = false;

    /* renamed from: e */
    private boolean f20788e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<ImgMetadata> f20789f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Bundle f20790g;

    /* renamed from: h */
    private View f20791h = null;

    /* renamed from: i */
    private SwipeRefreshLayout f20792i;

    /* renamed from: com.seattleclouds.modules.mosaic.a$a */
    public class C5873a extends BaseAdapter {

        /* renamed from: b */
        private int f20796b;

        /* renamed from: c */
        private Context f20797c;

        public C5873a(Context context) {
            this.f20797c = context;
            TypedArray obtainStyledAttributes = C5870a.this.mo1318s().obtainStyledAttributes(C5464m.Gallery);
            this.f20796b = obtainStyledAttributes.getResourceId(C5464m.Gallery_android_galleryItemBackground, 0);
            obtainStyledAttributes.recycle();
        }

        public int getCount() {
            return C5870a.this.f20789f.size();
        }

        public Object getItem(int i) {
            return null;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            if (view == null) {
                imageView = new ImageView(this.f20797c);
                imageView.setLayoutParams(new LayoutParams(C5870a.this.f20785b, C5870a.this.f20785b));
                imageView.setScaleType(ScaleType.CENTER_CROP);
            } else {
                imageView = (ImageView) view;
            }
            imageView.setBackgroundColor(-16777216);
            String str = ((ImgMetadata) C5870a.this.f20789f.get(i)).f20780b;
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
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
            C1186c.m6451a((Fragment) C5870a.this).mo5855b(gVar).mo5850a(str).mo5837a(imageView);
            return imageView;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28813c() {
        this.f20792i.setRefreshing(false);
        ((C5873a) this.f20784a.getAdapter()).notifyDataSetChanged();
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f20788e) {
            this.f20788e = false;
            ((C5873a) this.f20784a.getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        this.f20788e = true;
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20791h = layoutInflater.inflate(C5460i.mosaicgrid, viewGroup, false);
        mo1450b();
        return this.f20791h;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.mosaic_menu, menu);
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.mosaic_refresh) {
            return super.mo1245a(menuItem);
        }
        m28813c();
        return true;
    }

    /* renamed from: b */
    public void mo1450b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20789f = m.getParcelableArrayList("mosaicimages");
            this.f20786c = m.getBoolean("isOnlyChoose");
            this.f20787d = m.getBoolean("mosaicAutoCaptionsEnabled");
            this.f20790g = m.getBundle("PAGE_STYLE");
        }
        if (this.f20789f == null) {
            this.f20789f = new ArrayList<>();
        }
        int a = C6619m.m32014a(mo1318s(), 2.0f);
        int b = C6619m.m32017b(mo1318s());
        this.f20785b = b / 4;
        this.f20785b -= a;
        this.f20784a = (GridView) this.f20791h.findViewById(C5458g.gridview);
        this.f20784a.setAdapter(new C5873a(mo1318s()));
        this.f20784a.setNumColumns(b / (this.f20785b + a));
        this.f20784a.setHorizontalSpacing(a);
        this.f20784a.setVerticalSpacing(a);
        this.f20784a.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if (C5870a.this.f20786c) {
                    Intent intent = new Intent();
                    intent.putExtra("imgName", ((ImgMetadata) C5870a.this.f20789f.get(i)).f20780b);
                    C5870a.this.mo1318s().setResult(-1, intent);
                    System.gc();
                    App.m25625a((Fragment) C5870a.this);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("mosaicimages", C5870a.this.f20789f);
                bundle.putInt("selectedIndex", i);
                bundle.putBundle("PAGE_STYLE", C5870a.this.f20790g);
                bundle.putBoolean("mosaicAutoCaptionsEnabled", C5870a.this.f20787d);
                App.m25620a(new FragmentInfo(C5876c.class.getName(), bundle), (Fragment) C5870a.this);
            }
        });
        this.f20792i = (SwipeRefreshLayout) this.f20791h.findViewById(C5458g.ptr_layout);
        this.f20792i.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C5870a.this.m28813c();
            }
        });
        C5338d ax = mo20291ax();
        this.f20792i.setColorSchemeColors(ax.mo17546c(mo1318s()));
        C6593am.m31914a((View) this.f20784a, this.f20790g);
    }
}
