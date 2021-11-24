package com.seattleclouds.modules.epubreader;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.modules.epubreader.C5589b.C5590a;
import com.seattleclouds.modules.epubreader.ePubBookState.Guide;
import com.seattleclouds.util.C6599ar;
import com.seattleclouds.util.C6633p;
import com.seattleclouds.util.C6633p.C6634a;
import java.io.File;
import p194nl.siegmann.epublib.domain.Resource;

public class ePubReaderFragment extends C6557s implements C5590a, C6634a {

    /* renamed from: a */
    private String f19884a = "";
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ePubBookState f19885b;

    /* renamed from: c */
    private C5589b f19886c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6633p f19887d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public FrameLayout f19888e = null;

    /* renamed from: f */
    private boolean f19889f = false;

    /* renamed from: com.seattleclouds.modules.epubreader.ePubReaderFragment$a */
    public class C5594a extends BaseAdapter {
        public C5594a() {
        }

        public int getCount() {
            return ePubReaderFragment.this.f19885b.guideList.size();
        }

        public Object getItem(int i) {
            return ePubReaderFragment.this.f19885b.guideList.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5595b bVar;
            if (view == 0) {
                r3 = new LinearLayout(ePubReaderFragment.this.mo1318s());
                TextView textView = new TextView(ePubReaderFragment.this.mo1318s());
                textView.setGravity(16);
                textView.setTextSize(20.0f);
                textView.setMinHeight(50);
                r3.addView(textView);
                bVar = new C5595b();
                bVar.f19894a = textView;
                r3.setTag(bVar);
                r3 = r3;
            } else {
                bVar = (C5595b) view.getTag();
                r3 = view;
            }
            bVar.f19894a.setText(((Guide) ePubReaderFragment.this.f19885b.guideList.get(i)).getTitle());
            return r3;
        }
    }

    /* renamed from: com.seattleclouds.modules.epubreader.ePubReaderFragment$b */
    static class C5595b {

        /* renamed from: a */
        TextView f19894a;

        C5595b() {
        }
    }

    /* renamed from: c */
    private int m27760c(String str) {
        int i = 0;
        for (Resource resource : this.f19885b.book.getContents()) {
            if (resource.getHref().equals(str)) {
                resource.getId();
                return i;
            }
            i++;
        }
        return 0;
    }

    /* renamed from: c */
    private void m27762c(View view) {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        this.f19888e.removeAllViews();
        view.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View view, MotionEvent motionEvent) {
                ePubReaderFragment.this.f19888e.getParent().requestDisallowInterceptTouchEvent(true);
                return ePubReaderFragment.this.f19887d.mo20616a(motionEvent);
            }
        });
        this.f19888e.addView(view, layoutParams);
    }

    /* renamed from: j */
    private void m27763j(int i) {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        TextView textView = new TextView(mo1318s());
        textView.setText(mo18083e(i));
        textView.setLayoutParams(layoutParams);
        this.f19888e.removeAllViews();
        this.f19888e.addView(textView);
    }

    /* renamed from: L */
    public void mo1202L() {
        if (!(this.f19885b == null || this.f19885b.resourcesPath == null)) {
            mo18082a(new File(this.f19885b.resourcesPath));
        }
        super.mo1202L();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19888e = (FrameLayout) layoutInflater.inflate(C5460i.fragment_epub_reader, viewGroup, false);
        return this.f19888e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r3.f19885b.currentIndex < 0) goto L_0x001b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18081a(int r4, boolean r5) {
        /*
            r3 = this;
            com.seattleclouds.modules.epubreader.ePubBookState r0 = r3.f19885b
            int r0 = r0.currentIndex
            com.seattleclouds.modules.epubreader.ePubBookState r1 = r3.f19885b
            r1.currentIndex = r4
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            int r4 = r4.currentIndex
            r1 = 0
            if (r4 >= 0) goto L_0x001e
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            boolean r4 = r4.hasCoverImage
            if (r4 == 0) goto L_0x001b
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            r1 = -1
        L_0x0018:
            r4.currentIndex = r1
            goto L_0x0037
        L_0x001b:
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            goto L_0x0018
        L_0x001e:
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            int r4 = r4.currentIndex
            com.seattleclouds.modules.epubreader.ePubBookState r2 = r3.f19885b
            int r2 = r2.maxIndex
            if (r4 <= r2) goto L_0x0030
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            com.seattleclouds.modules.epubreader.ePubBookState r2 = r3.f19885b
            int r2 = r2.maxIndex
            r4.currentIndex = r2
        L_0x0030:
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            int r4 = r4.currentIndex
            if (r4 >= 0) goto L_0x0037
            goto L_0x001b
        L_0x0037:
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            int r4 = r4.currentIndex
            if (r4 != r0) goto L_0x0040
            if (r5 != 0) goto L_0x0040
            return
        L_0x0040:
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            int r4 = r4.currentIndex
            if (r4 <= 0) goto L_0x004e
            com.seattleclouds.modules.epubreader.ePubBookState r4 = r3.f19885b
            com.seattleclouds.modules.epubreader.ePubBookState r5 = r3.f19885b
            int r5 = r5.currentIndex
            r4.lastIndex = r5
        L_0x004e:
            r4 = 17432576(0x10a0000, float:2.5346597E-38)
            com.seattleclouds.modules.epubreader.ePubBookState r5 = r3.f19885b
            int r5 = r5.currentIndex
            android.view.View r5 = r3.mo18084f(r5)
            android.support.v4.app.h r0 = r3.mo1318s()
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r0, r4)
            r5.startAnimation(r4)
            r3.m27762c(r5)
            r3.mo20292ay()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.epubreader.ePubReaderFragment.mo18081a(int, boolean):void");
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            this.f19884a = m.getString("epubfilepath");
        }
        if (bundle != null) {
            this.f19885b = (ePubBookState) bundle.getSerializable("STATE_BOOK");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1239a(android.view.Menu r4) {
        /*
            r3 = this;
            super.mo1239a(r4)
            com.seattleclouds.modules.epubreader.ePubBookState r0 = r3.f19885b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001f
            com.seattleclouds.modules.epubreader.ePubBookState r0 = r3.f19885b
            int r0 = r0.currentIndex
            if (r0 != 0) goto L_0x0016
            com.seattleclouds.modules.epubreader.ePubBookState r0 = r3.f19885b
            int r0 = r0.lastIndex
            if (r0 <= 0) goto L_0x0016
            goto L_0x0020
        L_0x0016:
            com.seattleclouds.modules.epubreader.ePubBookState r0 = r3.f19885b
            int r0 = r0.lastIndex
            if (r0 <= 0) goto L_0x001f
            r1 = 0
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            int r0 = com.seattleclouds.C5451m.C5458g.contents
            android.view.MenuItem r0 = r4.findItem(r0)
            if (r0 == 0) goto L_0x002e
            r0.setVisible(r2)
            r0.setEnabled(r2)
        L_0x002e:
            int r0 = com.seattleclouds.C5451m.C5458g.back_to_reading
            android.view.MenuItem r4 = r4.findItem(r0)
            if (r4 == 0) goto L_0x003c
            r4.setVisible(r1)
            r4.setEnabled(r1)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.epubreader.ePubReaderFragment.mo1239a(android.view.Menu):void");
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.epub_reader, menu);
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public void mo18072a(ePubBookState epubbookstate) {
        this.f19886c = null;
        this.f19885b = epubbookstate;
        if (epubbookstate.error != 0) {
            m27763j(this.f19885b.error);
            return;
        }
        mo1450b();
        mo18086h(-1);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int i;
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.contents) {
            i = 0;
        } else if (itemId != C5458g.back_to_reading) {
            return super.mo1245a(menuItem);
        } else {
            i = this.f19885b.lastIndex;
        }
        mo18086h(i);
        return true;
    }

    /* renamed from: a */
    public boolean mo18082a(File file) {
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return true;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    mo18082a(file2);
                } else {
                    file2.delete();
                }
            }
        }
        return file.delete();
    }

    /* renamed from: b */
    public void mo1450b() {
        if (this.f19887d == null) {
            this.f19887d = new C6633p(mo1318s(), this);
            this.f19887d.mo20615a(0);
            this.f19887d.mo20617b(500);
        }
    }

    /* renamed from: c */
    public void mo1453c() {
        this.f19889f = !this.f19889f;
        if (mo1318s() == null) {
            return;
        }
        if (this.f19889f) {
            mo1318s().getWindow().clearFlags(2048);
            mo1318s().getWindow().addFlags(1024);
            return;
        }
        mo1318s().getWindow().clearFlags(1024);
        mo1318s().getWindow().addFlags(2048);
    }

    /* renamed from: d */
    public void mo1278d(Bundle bundle) {
        super.mo1278d(bundle);
        if (this.f19884a == null) {
            m27763j(1);
        } else if (this.f19885b == null) {
            this.f19886c = new C5589b();
            this.f19886c.mo18067a((C5590a) this);
            this.f19886c.execute(new String[]{this.f19884a});
        } else if (this.f19885b.error != 0) {
            m27763j(this.f19885b.error);
        } else {
            mo1450b();
            mo18081a(this.f19885b.currentIndex, true);
        }
    }

    /* renamed from: e */
    public String mo18083e(int i) {
        if (mo1318s() == null) {
            return null;
        }
        return i == -1 ? mo1219a(C5462k.epubreader_could_not_open_file) : "Unknown error.";
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        if (this.f19885b != null && !C6599ar.f23316a) {
            bundle.putSerializable("STATE_BOOK", this.f19885b);
        }
        super.mo1282e(bundle);
    }

    /* renamed from: f */
    public View mo18084f(int i) {
        View view = new View(mo1318s());
        if (i < 0) {
            if (i != -1 || !this.f19885b.hasCoverImage) {
                this.f19885b.currentIndex = i;
                return view;
            }
            ImageView imageView = new ImageView(mo1318s());
            try {
                Bitmap coverImage = this.f19885b.getCoverImage();
                if (coverImage != null) {
                    imageView.setImageBitmap(coverImage);
                }
            } catch (Exception e) {
                Log.d("ePubReader", "Exception", e);
            }
            imageView.setClickable(true);
            imageView.setOnTouchListener(new OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    ePubReaderFragment.this.f19888e.getParent().requestDisallowInterceptTouchEvent(true);
                    return ePubReaderFragment.this.f19887d.mo20616a(motionEvent);
                }
            });
            return imageView;
        } else if (i == 0) {
            ListView listView = new ListView(mo1318s());
            listView.setOnItemClickListener(new OnItemClickListener() {
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    ePubReaderFragment.this.mo18085g(i);
                }
            });
            listView.setAdapter(new C5594a());
            return listView;
        } else {
            WebView webView = new WebView(mo1318s());
            try {
                int i2 = i - 1;
                String str = new String(((Resource) this.f19885b.book.getContents().get(i2)).getData());
                StringBuilder sb = new StringBuilder();
                sb.append(this.f19885b.baseUrl);
                sb.append(this.f19885b.getPageRelativePath(i2));
                webView.loadDataWithBaseURL(sb.toString(), str, "text/html", "UTF-8", null);
            } catch (Exception e2) {
                Log.d("ePubReader", "exception", e2);
            }
            return webView;
        }
    }

    /* renamed from: g */
    public void mo18085g(int i) {
        this.f19885b.currentIndex = m27760c(((Guide) this.f19885b.guideList.get(i)).getHref());
        View f = mo18084f(this.f19885b.currentIndex + 1);
        f.startAnimation(AnimationUtils.loadAnimation(mo1318s(), 17432576));
        m27762c(f);
        if (this.f19885b.currentIndex > 0) {
            this.f19885b.lastIndex = this.f19885b.currentIndex;
        }
        this.f19885b.currentIndex++;
        mo20292ay();
    }

    /* renamed from: h */
    public void mo18086h(int i) {
        mo18081a(i, false);
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f19886c != null) {
            this.f19886c.cancel(true);
        }
        super.mo1296i();
    }

    /* renamed from: i */
    public void mo18087i(int i) {
        int i2;
        if (this.f19885b.currentIndex != 0) {
            switch (i) {
                case 3:
                    i2 = this.f19885b.currentIndex + 1;
                    break;
                case 4:
                    i2 = this.f19885b.currentIndex - 1;
                    break;
                default:
            }
            mo18086h(i2);
        }
    }

    /* renamed from: z_ */
    public void mo18073z_() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ProgressBar progressBar = new ProgressBar(mo1318s());
        progressBar.setLayoutParams(layoutParams);
        progressBar.setIndeterminate(true);
        this.f19888e.removeAllViews();
        this.f19888e.addView(progressBar);
    }
}
