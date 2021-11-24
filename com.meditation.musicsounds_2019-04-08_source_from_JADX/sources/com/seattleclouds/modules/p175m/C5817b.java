package com.seattleclouds.modules.p175m;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p023v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6611g;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6638s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.seattleclouds.modules.m.b */
public class C5817b extends C6557s {

    /* renamed from: a */
    OnGlobalLayoutListener f20609a = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            C6611g.m31979a(C5817b.this.f20621f.getViewTreeObserver(), C5817b.this.f20609a);
            if (C5817b.this.mo1318s() != null && C5817b.this.mo1318s().getResources().getConfiguration().orientation == 1) {
                C5817b.this.m28656b();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C5815a f20610ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public boolean f20611af = false;

    /* renamed from: ag */
    private boolean f20612ag = false;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public boolean f20613ah = false;

    /* renamed from: ai */
    private boolean f20614ai = false;

    /* renamed from: aj */
    private ArrayList<C5825a> f20615aj = new ArrayList<>();

    /* renamed from: ak */
    private ArrayList<Integer> f20616ak = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f20617b = 70;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f20618c = -1;

    /* renamed from: d */
    private int f20619d;

    /* renamed from: e */
    private int f20620e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public RelativeLayout f20621f;

    /* renamed from: g */
    private Button f20622g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Bitmap f20623h;

    /* renamed from: i */
    private TextView f20624i = null;

    /* renamed from: com.seattleclouds.modules.m.b$a */
    private class C5825a extends AppCompatImageView {

        /* renamed from: a */
        int f20634a = 0;

        /* renamed from: b */
        int f20635b = 0;

        /* renamed from: d */
        private boolean f20637d = false;

        /* renamed from: e */
        private boolean f20638e = false;

        /* renamed from: f */
        private int f20639f = 0;

        /* renamed from: g */
        private int f20640g = 0;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f20641h = null;

        public C5825a(Context context) {
            super(context);
        }

        public C5825a(Context context, Bitmap bitmap, String str) {
            super(context);
            this.f20641h = str;
            m28681a(bitmap);
        }

        /* renamed from: a */
        private void m28681a(Bitmap bitmap) {
            setImageBitmap(bitmap);
        }

        /* renamed from: a */
        public int mo18547a() {
            return this.f20639f;
        }

        /* renamed from: a */
        public void mo18548a(int i) {
            this.f20639f = i;
        }

        /* renamed from: a */
        public void mo18549a(int i, int i2) {
            this.f20634a = i;
            this.f20635b = i2;
            LayoutParams layoutParams = new LayoutParams(C5817b.this.f20617b - 1, C5817b.this.f20617b - 1);
            layoutParams.leftMargin = i;
            layoutParams.topMargin = i2;
            setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public void mo18550a(boolean z) {
            this.f20637d = z;
            setImageBitmap(z ? C5817b.this.f20623h : C5817b.this.f20610ae.mo18537a(this.f20641h));
        }

        /* renamed from: b */
        public String mo18551b() {
            return this.f20641h;
        }

        /* renamed from: b */
        public void mo18552b(int i) {
            this.f20640g = i;
        }

        /* renamed from: b */
        public void mo18553b(boolean z) {
            this.f20638e = z;
        }

        /* renamed from: c */
        public boolean mo18554c() {
            return this.f20637d;
        }

        /* renamed from: d */
        public int mo18555d() {
            return this.f20640g;
        }

        /* renamed from: e */
        public boolean mo18556e() {
            return this.f20638e;
        }

        /* access modifiers changed from: protected */
        public void onRestoreInstanceState(Parcelable parcelable) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bundle bundle2 = bundle.getBundle("thisState");
                boolean z = bundle2.getBoolean("hidden");
                boolean z2 = bundle2.getBoolean("opened");
                int i = bundle2.getInt("pieceType");
                int i2 = bundle2.getInt("index");
                int i3 = bundle2.getInt("x");
                int i4 = bundle2.getInt("y");
                this.f20641h = bundle2.getString("keyBitmap");
                m28681a(C5817b.this.f20610ae.mo18537a(this.f20641h));
                mo18550a(z);
                mo18553b(z2);
                mo18548a(i);
                mo18552b(i2);
                mo18549a(i3, i4);
                parcelable = bundle.getParcelable("instanceState");
            }
            super.onRestoreInstanceState(parcelable);
        }

        /* access modifiers changed from: protected */
        public Parcelable onSaveInstanceState() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("hidden", this.f20637d);
            bundle.putBoolean("opened", this.f20638e);
            bundle.putInt("pieceType", this.f20639f);
            bundle.putInt("index", this.f20640g);
            bundle.putInt("x", this.f20634a);
            bundle.putInt("y", this.f20635b);
            bundle.putString("keyBitmap", this.f20641h);
            Bundle bundle2 = new Bundle();
            bundle2.putBundle("thisState", bundle);
            bundle2.putParcelable("instanceState", super.onSaveInstanceState());
            return bundle2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m28649a(String str, int i, int i2, boolean z) {
        Bitmap a = C6638s.m32069a(str, i, i, false);
        if (a == null) {
            a = BitmapFactory.decodeResource(mo1320t(), i2);
        }
        if (a != null) {
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("KEY_HIDDEN_");
                sb.append(str);
                str = sb.toString();
            }
            this.f20610ae.mo18538a(str, a);
        }
        return a;
    }

    /* renamed from: a */
    private void m28651a(ArrayList<String> arrayList) {
        C5825a aVar;
        if (arrayList == null || arrayList.size() < 3) {
            this.f20624i.setText(C5462k.memo_game_not_enough_resources);
            this.f20624i.setVisibility(0);
            this.f20621f.setVisibility(8);
            return;
        }
        this.f20615aj.clear();
        int d = C6619m.m32022d(mo1318s()) - (C6619m.m32014a(mo1318s(), 10.0f) * 2);
        final String str = (String) arrayList.get(0);
        StringBuilder sb = new StringBuilder();
        sb.append("KEY_HIDDEN_");
        sb.append(str);
        Bitmap a = this.f20610ae.mo18537a(sb.toString());
        if (a == null) {
            new Thread(new Runnable() {
                public void run() {
                    C5817b.this.f20623h = C5817b.this.m28649a(str, C5817b.this.f20617b, C5457f.ic_hidden_memogame, true);
                }
            }).start();
        } else {
            this.f20623h = a;
        }
        if (this.f20616ak.size() > 0) {
            Iterator it = this.f20616ak.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                C5825a aVar2 = new C5825a(mo1318s());
                aVar2.setId(intValue);
                aVar2.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (C5817b.this.f20611af && !C5817b.this.f20613ah) {
                            C5825a aVar = (C5825a) view;
                            if (aVar.mo18554c() && !aVar.mo18556e()) {
                                C5817b.this.m28669f(aVar.mo18555d());
                            } else if (!aVar.mo18556e()) {
                                C5817b.this.m28671g(aVar.mo18555d());
                            }
                        }
                    }
                });
                this.f20615aj.add(aVar2);
                this.f20621f.addView(aVar2);
            }
            this.f20621f.getViewTreeObserver().addOnGlobalLayoutListener(this.f20609a);
            return;
        }
        this.f20619d = d / this.f20617b;
        if (this.f20619d % 2 != 0) {
            this.f20619d--;
        }
        this.f20620e = this.f20619d;
        int i = (this.f20620e * this.f20619d) / 2;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < this.f20620e) {
            int i5 = i3;
            int i6 = 0;
            while (i6 < this.f20619d) {
                if (this.f20615aj.size() < i) {
                    String str2 = (String) arrayList.get(i4);
                    Bitmap a2 = this.f20610ae.mo18537a(str2);
                    if (a2 == null) {
                        a2 = m28649a(str2, this.f20617b, C5457f.ic_resource_memogame, false);
                    }
                    aVar = new C5825a(mo1318s(), a2, str2);
                    aVar.mo18548a(i4);
                } else {
                    C5825a aVar3 = (C5825a) this.f20615aj.get(i5 - i);
                    aVar = new C5825a(mo1318s(), this.f20610ae.mo18537a(aVar3.mo18551b()), aVar3.f20641h);
                    aVar.mo18548a(aVar3.mo18547a());
                }
                aVar.mo18552b(i5);
                aVar.setOnClickListener(new OnClickListener() {
                    public void onClick(View view) {
                        if (C5817b.this.f20611af && !C5817b.this.f20613ah) {
                            C5825a aVar = (C5825a) view;
                            if (aVar.mo18554c() && !aVar.mo18556e()) {
                                C5817b.this.m28669f(aVar.mo18555d());
                            } else if (!aVar.mo18556e()) {
                                C5817b.this.m28671g(aVar.mo18555d());
                            }
                        }
                    }
                });
                int a3 = C6600as.m31942a();
                aVar.setId(a3);
                this.f20616ak.add(Integer.valueOf(a3));
                this.f20615aj.add(aVar);
                this.f20621f.addView(aVar);
                if (i4 >= arrayList.size() - 1) {
                    i4 = 0;
                }
                i6++;
                i5++;
                i4++;
            }
            i2++;
            i3 = i5;
        }
        this.f20621f.getViewTreeObserver().addOnGlobalLayoutListener(this.f20609a);
        m28665e();
        m28655at();
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public void m28654as() {
        this.f20611af = false;
        this.f20612ag = false;
        Iterator it = this.f20615aj.iterator();
        while (it.hasNext()) {
            C5825a aVar = (C5825a) it.next();
            aVar.mo18550a(false);
            aVar.mo18553b(false);
        }
        m28665e();
    }

    /* renamed from: at */
    private void m28655at() {
        int size = this.f20615aj.size();
        for (int i = 0; i < 50; i++) {
            int i2 = size - 1;
            int c = m28660c(0, i2);
            int c2 = m28660c(0, i2);
            if (c != c2 && c < i2 && c2 < i2) {
                m28657b(c, c2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m28656b() {
        int width = (this.f20621f.getWidth() - (this.f20619d * this.f20617b)) / 2;
        int height = (this.f20621f.getHeight() - (this.f20620e * this.f20617b)) / 2;
        int i = 0;
        int i2 = 0;
        while (i < this.f20620e) {
            int i3 = width;
            int i4 = i2;
            int i5 = 0;
            while (i5 < this.f20619d) {
                ((C5825a) this.f20615aj.get(i4)).mo18549a(i3, height);
                i3 += this.f20617b;
                i5++;
                i4++;
            }
            height += this.f20617b;
            i++;
            i2 = i4;
        }
    }

    /* renamed from: b */
    private void m28657b(int i, int i2) {
        C5825a aVar = (C5825a) this.f20615aj.get(i);
        C5825a aVar2 = (C5825a) this.f20615aj.get(i2);
        int i3 = aVar.f20634a;
        int i4 = aVar.f20635b;
        aVar.mo18549a(aVar2.f20634a, aVar2.f20635b);
        aVar2.mo18549a(i3, i4);
        aVar.mo18552b(i2);
        aVar2.mo18552b(i);
        Collections.swap(this.f20615aj, i, i2);
    }

    /* renamed from: c */
    private int m28660c(int i, int i2) {
        double random = Math.random();
        double d = (double) ((i2 - i) + 1);
        Double.isNaN(d);
        return i + ((int) (random * d));
    }

    /* renamed from: c */
    private void m28661c() {
        Iterator it = this.f20615aj.iterator();
        while (it.hasNext()) {
            if (!((C5825a) it.next()).mo18556e()) {
                return;
            }
        }
        this.f20611af = false;
        this.f20612ag = false;
        m28664d();
    }

    /* renamed from: d */
    private void m28664d() {
        C6620n.m32028a((Context) mo1318s(), C5462k.memo_game_congrat_title, C5462k.memo_game_congrat_message);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28665e() {
        if (this.f20612ag) {
            this.f20622g.setText(C5462k.memo_game_restart);
            Iterator it = this.f20615aj.iterator();
            while (it.hasNext()) {
                C5825a aVar = (C5825a) it.next();
                aVar.mo18550a(true);
                aVar.mo18553b(false);
            }
            this.f20611af = true;
            return;
        }
        this.f20622g.setText(C5462k.memo_game_start);
        m28655at();
        this.f20612ag = true;
    }

    /* renamed from: e */
    private void m28666e(int i) {
        switch (i) {
            case 1:
                this.f20621f.setVisibility(0);
                this.f20624i.setVisibility(8);
                this.f20622g.setEnabled(true);
                return;
            case 2:
                this.f20621f.setVisibility(8);
                this.f20624i.setVisibility(0);
                this.f20622g.setEnabled(false);
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m28669f(final int i) {
        if (this.f20618c == -1) {
            this.f20618c = i;
            ((C5825a) this.f20615aj.get(i)).mo18550a(false);
            return;
        }
        C5825a aVar = (C5825a) this.f20615aj.get(this.f20618c);
        C5825a aVar2 = (C5825a) this.f20615aj.get(i);
        aVar2.mo18550a(false);
        if (aVar.mo18547a() == aVar2.mo18547a()) {
            aVar.mo18553b(true);
            aVar2.mo18553b(true);
            this.f20618c = -1;
            m28661c();
            return;
        }
        this.f20613ah = true;
        new Timer().schedule(new TimerTask() {
            public void run() {
                if (C5817b.this.mo1318s() != null) {
                    C5817b.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            C5817b.this.m28671g(C5817b.this.f20618c);
                            C5817b.this.m28671g(i);
                            C5817b.this.f20613ah = false;
                        }
                    });
                }
            }
        }, 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m28671g(int i) {
        if (this.f20618c == i) {
            this.f20618c = -1;
        }
        ((C5825a) this.f20615aj.get(i)).mo18550a(true);
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList arrayList;
        View inflate = layoutInflater.inflate(C5460i.memo_game_view, viewGroup, false);
        Bundle m = mo1307m();
        if (m != null) {
            arrayList = m.getStringArrayList("resources");
            C6593am.m31914a(inflate, m.getBundle("PAGE_STYLE"));
        } else {
            arrayList = null;
        }
        this.f20624i = (TextView) inflate.findViewById(C5458g.notice_text_view);
        this.f20621f = (RelativeLayout) inflate.findViewById(C5458g.memo_game_container);
        this.f20622g = (Button) inflate.findViewById(C5458g.memo_game_start_button);
        this.f20622g.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (C5817b.this.f20611af) {
                    C5817b.this.m28654as();
                } else {
                    C5817b.this.m28665e();
                }
            }
        });
        if (this.f20611af) {
            this.f20622g.setText(C5462k.memo_game_restart);
        }
        this.f20617b = C6619m.m32014a(mo1318s(), 70.0f);
        m28651a(arrayList);
        m28666e(mo1318s().getResources().getConfiguration().orientation);
        return inflate;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f20610ae = C5815a.m28641a();
        if (bundle != null && bundle.containsKey("STATE_PIECE_IDS")) {
            this.f20611af = bundle.getBoolean("STATE_IN_GAME", this.f20611af);
            this.f20612ag = bundle.getBoolean("STATE_PREVIEWING", this.f20612ag);
            this.f20618c = bundle.getInt("STATE_OPENED_PIECE", this.f20618c);
            this.f20613ah = bundle.getBoolean("STATE_IS_SHOWING_PIECE", this.f20613ah);
            this.f20616ak = bundle.getIntegerArrayList("STATE_PIECE_IDS");
            this.f20620e = bundle.getInt("STATE_MAX_ROWS");
            this.f20619d = bundle.getInt("STATE_MAX_COLUMNS");
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("STATE_IN_GAME", this.f20611af);
        bundle.putBoolean("STATE_PREVIEWING", this.f20612ag);
        bundle.putIntegerArrayList("STATE_PIECE_IDS", this.f20616ak);
        bundle.putInt("STATE_MAX_ROWS", this.f20620e);
        bundle.putInt("STATE_MAX_COLUMNS", this.f20619d);
        super.mo1282e(bundle);
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f20614ai = true;
        super.mo1296i();
    }

    /* renamed from: k */
    public void mo1301k(Bundle bundle) {
        super.mo1301k(bundle);
        if (bundle != null || this.f20614ai) {
            Iterator it = new ArrayList(this.f20615aj).iterator();
            while (it.hasNext()) {
                C5825a aVar = (C5825a) it.next();
                Collections.swap(this.f20615aj, this.f20615aj.indexOf(aVar), aVar.mo18555d());
            }
        }
    }
}
