package com.seattleclouds.modules.puzzle;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6638s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SCPuzzleGameFragment extends C6557s {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f21933b = C6191b.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final Boolean f21934c = Boolean.valueOf(false);

    /* renamed from: a */
    final OnGlobalLayoutListener f21935a = new OnGlobalLayoutListener() {
        public void onGlobalLayout() {
            if (SCPuzzleGameFragment.f21934c.booleanValue()) {
                Log.d(SCPuzzleGameFragment.f21933b, "onGlobalLayout()");
            }
            SCPuzzleGameFragment.this.m30121aD();
            if (SCPuzzleGameFragment.this.mo1318s() == null) {
                return;
            }
            if (SCPuzzleGameFragment.this.mo1318s().getResources().getConfiguration().orientation == 1 || SCPuzzleGameFragment.this.f21951at) {
                SCPuzzleGameFragment.this.f21958i = SCPuzzleGameFragment.this.m30127aJ();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public String f21936ae = null;

    /* renamed from: af */
    private String f21937af = "";

    /* renamed from: ag */
    private Button f21938ag;

    /* renamed from: ah */
    private Button f21939ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public List<HashMap<String, String>> f21940ai = new ArrayList();

    /* renamed from: aj */
    private String[] f21941aj = null;

    /* renamed from: ak */
    private int f21942ak = 0;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public int f21943al = 4;

    /* renamed from: am */
    private int f21944am = 0;

    /* renamed from: an */
    private int f21945an = 100;

    /* renamed from: ao */
    private C6190a f21946ao = new C6190a(0, 0);

    /* renamed from: ap */
    private boolean f21947ap = false;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f21948aq = false;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public boolean f21949ar = false;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public boolean f21950as = false;
    /* access modifiers changed from: private */

    /* renamed from: at */
    public boolean f21951at = false;

    /* renamed from: au */
    private View f21952au = null;

    /* renamed from: d */
    private Bundle f21953d;

    /* renamed from: e */
    private Bitmap f21954e = null;

    /* renamed from: f */
    private RelativeLayout f21955f;

    /* renamed from: g */
    private TextView f21956g = null;

    /* renamed from: h */
    private ArrayList<C6191b> f21957h = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<PuzzlePieceState> f21958i;

    public static class PuzzlePieceState implements Parcelable {
        public static final Creator<PuzzlePieceState> CREATOR = new Creator<PuzzlePieceState>() {
            /* renamed from: a */
            public PuzzlePieceState createFromParcel(Parcel parcel) {
                PuzzlePieceState puzzlePieceState = new PuzzlePieceState();
                puzzlePieceState.mo19425a(parcel);
                return puzzlePieceState;
            }

            /* renamed from: a */
            public PuzzlePieceState[] newArray(int i) {
                return new PuzzlePieceState[i];
            }
        };

        /* renamed from: a */
        public int f21966a = 0;

        /* renamed from: b */
        public int f21967b = 0;

        public PuzzlePieceState() {
        }

        public PuzzlePieceState(int i, int i2) {
            this.f21966a = i;
            this.f21967b = i2;
        }

        /* renamed from: a */
        public void mo19425a(Parcel parcel) {
            this.f21966a = parcel.readInt();
            this.f21967b = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            PuzzlePieceState puzzlePieceState = (PuzzlePieceState) obj;
            return this.f21966a == puzzlePieceState.f21966a && this.f21967b == puzzlePieceState.f21967b;
        }

        public int hashCode() {
            return (this.f21966a * 5) + this.f21967b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PuzzlePieceState(isi:");
            sb.append(this.f21966a);
            sb.append(", ip:");
            sb.append(this.f21967b);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f21966a);
            parcel.writeInt(this.f21967b);
        }
    }

    /* renamed from: com.seattleclouds.modules.puzzle.SCPuzzleGameFragment$a */
    private class C6190a {

        /* renamed from: b */
        private final int f21969b;

        /* renamed from: c */
        private final int f21970c;

        public C6190a(int i, int i2) {
            this.f21969b = i;
            this.f21970c = i2;
        }

        /* renamed from: a */
        public int mo19435a() {
            return this.f21969b;
        }

        /* renamed from: a */
        public boolean mo19436a(C6190a aVar) {
            return aVar.mo19435a() == this.f21969b && aVar.mo19437b() == this.f21970c;
        }

        /* renamed from: b */
        public int mo19437b() {
            return this.f21970c;
        }
    }

    /* renamed from: com.seattleclouds.modules.puzzle.SCPuzzleGameFragment$b */
    private class C6191b extends ImageView {

        /* renamed from: a */
        public int f21971a = 0;

        /* renamed from: b */
        public int f21972b = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public int f21974d = 0;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f21975e = 0;

        public C6191b(Context context) {
            super(context);
        }

        /* renamed from: a */
        public int mo19438a() {
            return this.f21974d;
        }

        /* renamed from: a */
        public void mo19439a(int i) {
            this.f21974d = i;
        }

        /* renamed from: a */
        public void mo19440a(int i, int i2) {
            this.f21971a = i;
            this.f21972b = i2;
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            if (layoutParams != null) {
                layoutParams.leftMargin = i;
                layoutParams.topMargin = i2;
                setLayoutParams(layoutParams);
            }
        }

        /* renamed from: b */
        public int mo19441b() {
            return this.f21975e;
        }

        /* renamed from: b */
        public void mo19442b(int i) {
            this.f21975e = i;
        }

        /* renamed from: b */
        public void mo19443b(int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = i - 1;
                layoutParams.height = i2 - 1;
                setLayoutParams(layoutParams);
            }
        }

        /* renamed from: c */
        public PuzzlePieceState mo19444c() {
            return new PuzzlePieceState(this.f21974d, this.f21975e);
        }

        /* renamed from: c */
        public void mo19445c(int i, int i2) {
            mo19439a(i);
            mo19442b(i2);
        }
    }

    /* renamed from: a */
    private void m30114a(int i, int i2, boolean z) {
        if (z) {
            i = m30141f(i);
            i2 = m30141f(i2);
        }
        C6191b bVar = (C6191b) this.f21957h.get(i);
        C6191b bVar2 = (C6191b) this.f21957h.get(i2);
        if (z) {
            int b = bVar.mo19441b();
            int b2 = bVar2.mo19441b();
            bVar2.mo19442b(b);
            bVar.mo19442b(b2);
        }
        int i3 = bVar.f21971a;
        int i4 = bVar.f21972b;
        bVar.mo19440a(bVar2.f21971a, bVar2.f21972b);
        bVar2.mo19440a(i3, i4);
    }

    /* renamed from: a */
    private void m30116a(ArrayList<PuzzlePieceState> arrayList) {
        for (int i = 0; i < this.f21957h.size(); i++) {
            C6191b bVar = (C6191b) this.f21957h.get(i);
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PuzzlePieceState puzzlePieceState = (PuzzlePieceState) it.next();
                if (puzzlePieceState.f21966a == bVar.f21974d) {
                    if (f21934c.booleanValue()) {
                        String str = f21933b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("!!");
                        sb.append(puzzlePieceState.toString());
                        Log.d(str, sb.toString());
                    }
                    bVar.f21974d = puzzlePieceState.f21966a;
                    bVar.f21975e = puzzlePieceState.f21967b;
                }
            }
        }
        ((C6191b) this.f21957h.get(this.f21944am - 1)).setVisibility(4);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: aA */
    private void m30118aA() {
        ViewTreeObserver viewTreeObserver = this.f21955f.getViewTreeObserver();
        if (viewTreeObserver == null) {
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.f21935a);
        } else {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f21935a);
        }
    }

    /* renamed from: aB */
    private void m30119aB() {
        this.f21948aq = false;
        this.f21949ar = false;
        this.f21947ap = false;
        this.f21942ak = 0;
        this.f21946ao = new C6190a(0, 0);
        this.f21955f.removeAllViews();
        this.f21957h.clear();
        m30139e(mo1318s().getResources().getConfiguration().orientation);
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3047a(C5462k.puzzle_pick_difficulty).mo3058a((CharSequence[]) this.f21941aj, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                SCPuzzleGameFragment.this.f21950as = false;
                HashMap hashMap = (HashMap) SCPuzzleGameFragment.this.f21940ai.get(i);
                SCPuzzleGameFragment.this.f21943al = SCPuzzleGameFragment.m30131b((String) hashMap.get("rows"), 15);
                SCPuzzleGameFragment.this.f21936ae = (String) hashMap.get("nextPage");
                SCPuzzleGameFragment.this.mo19417d();
                SCPuzzleGameFragment.this.m30120aC();
            }
        });
        C0765d b = aVar.mo3065b();
        b.setCancelable(false);
        b.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public void m30120aC() {
        ViewTreeObserver viewTreeObserver = this.f21955f.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f21935a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public void m30121aD() {
        int min = Math.min(this.f21955f.getWidth(), this.f21955f.getHeight());
        int i = min / this.f21943al;
        if (i != 0) {
            C6190a aVar = new C6190a(this.f21955f.getWidth(), this.f21955f.getHeight());
            this.f21942ak = min / i;
            this.f21944am = this.f21942ak * this.f21942ak;
            if (!this.f21946ao.mo19436a(aVar) && this.f21957h.size() == this.f21944am) {
                this.f21946ao = aVar;
                this.f21945an = i;
                int a = (this.f21946ao.mo19435a() - (this.f21942ak * this.f21945an)) / 2;
                int b = (this.f21946ao.mo19437b() - (this.f21942ak * this.f21945an)) / 2;
                if (this.f21948aq) {
                    int i2 = b;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < this.f21942ak) {
                        int i5 = a;
                        int i6 = i4;
                        int i7 = 0;
                        while (i7 < this.f21942ak) {
                            C6191b bVar = (C6191b) this.f21957h.get(i6);
                            bVar.mo19440a(i5, i2);
                            bVar.mo19443b(this.f21945an, this.f21945an);
                            i5 += this.f21945an;
                            i7++;
                            i6++;
                        }
                        i2 += this.f21945an;
                        i3++;
                        i4 = i6;
                    }
                    ((C6191b) this.f21957h.get(this.f21944am - 1)).setVisibility(0);
                    this.f21938ag.setText(C5462k.puzzle_continue);
                } else {
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < this.f21942ak) {
                        int i10 = i9;
                        int i11 = 0;
                        while (i11 < this.f21942ak) {
                            Iterator it = this.f21957h.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C6191b bVar2 = (C6191b) it.next();
                                if (bVar2.mo19441b() == i10) {
                                    bVar2.mo19443b(this.f21945an, this.f21945an);
                                    bVar2.mo19440a((this.f21945an * i11) + a, (this.f21945an * i8) + b);
                                    if (f21934c.booleanValue()) {
                                        Log.d(f21933b, String.format("i:%d ri:%d x:%d y:%d", new Object[]{Integer.valueOf(bVar2.f21974d), Integer.valueOf(bVar2.f21975e), Integer.valueOf(bVar2.f21971a), Integer.valueOf(bVar2.f21972b)}));
                                    }
                                }
                            }
                            i11++;
                            i10++;
                        }
                        i8++;
                        i9 = i10;
                    }
                }
            }
        }
    }

    /* renamed from: aE */
    private void m30122aE() {
        if (!this.f21947ap) {
            this.f21955f.removeAllViews();
            this.f21947ap = true;
            int d = C6619m.m32022d(mo1318s());
            int i = d / this.f21943al;
            this.f21954e = C6638s.m32069a(this.f21937af, d, d, true);
            if (this.f21954e != null) {
                int width = this.f21954e.getWidth();
                int height = this.f21954e.getHeight();
                int i2 = width > d ? (width - d) / 2 : 0;
                int i3 = height > d ? (height - d) / 2 : 0;
                if (i2 > 0 || i3 > 0) {
                    this.f21954e = Bitmap.createBitmap(this.f21954e, i2, i3, d, d);
                }
                int i4 = d / i;
                int i5 = i4 * i4;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                while (i6 < i4) {
                    int i9 = i8;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < i4) {
                        C6191b bVar = new C6191b(mo1318s());
                        bVar.mo19445c(i9, i9);
                        bVar.setImageBitmap(Bitmap.createBitmap(this.f21954e, i11, i7, i, i));
                        this.f21955f.addView(bVar);
                        bVar.mo19440a(i11, i7);
                        this.f21957h.add(bVar);
                        i11 += i;
                        bVar.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                if (SCPuzzleGameFragment.this.f21949ar && !SCPuzzleGameFragment.this.f21948aq) {
                                    SCPuzzleGameFragment.this.m30145h(((C6191b) view).mo19441b());
                                }
                            }
                        });
                        i10++;
                        i9++;
                    }
                    i7 += i;
                    i6++;
                    i8 = i9;
                }
                this.f21945an = i;
                this.f21942ak = i4;
                this.f21944am = i5;
            }
        }
    }

    /* renamed from: aF */
    private void m30123aF() {
        if (this.f21949ar) {
            m30116a(this.f21958i);
            if (!this.f21948aq) {
                this.f21938ag.setText(C5462k.puzzle_preview);
                this.f21938ag.setEnabled(true);
            } else {
                this.f21938ag.setText(C5462k.puzzle_continue);
            }
            m30121aD();
            return;
        }
        this.f21938ag.setEnabled(false);
    }

    /* renamed from: aG */
    private int m30124aG() {
        return m30143g(this.f21944am - 1);
    }

    /* renamed from: aH */
    private void m30125aH() {
        boolean z;
        Iterator it = this.f21957h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            C6191b bVar = (C6191b) it.next();
            if (bVar.mo19438a() != bVar.mo19441b()) {
                z = false;
                break;
            }
        }
        if (z) {
            this.f21949ar = false;
            this.f21948aq = false;
            ((C6191b) this.f21957h.get(this.f21944am - 1)).setVisibility(0);
            this.f21938ag.setEnabled(false);
            m30126aI();
        }
    }

    /* renamed from: aI */
    private void m30126aI() {
        if (this.f21936ae == null || this.f21936ae.length() <= 0) {
            C6620n.m32028a((Context) mo1318s(), C5462k.puzzle_congrat_title, C5462k.puzzle_congrat_message);
            return;
        }
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3060b(C5462k.puzzle_congrat_message).mo3056a(false).mo3048a(C5462k.puzzle_next_label, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                App.m25622a(SCPuzzleGameFragment.this.f21936ae, (Fragment) SCPuzzleGameFragment.this);
            }
        });
        aVar.mo3047a(C5462k.puzzle_congrat_title);
        aVar.mo3065b().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: aJ */
    public ArrayList<PuzzlePieceState> m30127aJ() {
        ArrayList<PuzzlePieceState> arrayList = new ArrayList<>();
        Iterator it = this.f21957h.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6191b) it.next()).mo19444c());
        }
        return arrayList;
    }

    /* renamed from: at */
    private void m30129at() {
        this.f21955f = (RelativeLayout) this.f21952au.findViewById(C5458g.puzzle_container);
        C6593am.m31914a((View) this.f21955f, this.f21953d);
        C6593am.m31914a(this.f21952au, this.f21953d);
        this.f21956g = (TextView) this.f21952au.findViewById(C5458g.rotate_to_portrait_textview);
        this.f21938ag = (Button) this.f21952au.findViewById(C5458g.puzzle_preview_button);
        this.f21939ah = (Button) this.f21952au.findViewById(C5458g.puzzle_randomize_button);
        this.f21938ag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SCPuzzleGameFragment.this.mo1453c();
            }
        });
        this.f21939ah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                SCPuzzleGameFragment.this.mo1450b();
            }
        });
        this.f21938ag.setEnabled(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m30130az() {
        if (mo1193C()) {
            m30119aB();
        } else {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    SCPuzzleGameFragment.this.m30130az();
                }
            }, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m30131b(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            Log.e("Puzzle", "Exception", e);
            return i;
        }
    }

    /* renamed from: b */
    private void m30133b(int i, int i2) {
        m30114a(i, i2, true);
    }

    /* renamed from: c */
    private int m30135c(int i, int i2) {
        double random = Math.random();
        double d = (double) ((i2 - i) + 1);
        Double.isNaN(d);
        return i + ((int) (random * d));
    }

    /* renamed from: e */
    private void m30139e(int i) {
        if (i != 2 || this.f21951at) {
            this.f21955f.setVisibility(0);
            this.f21956g.setVisibility(8);
            this.f21939ah.setEnabled(true);
            this.f21938ag.setEnabled(this.f21949ar);
            return;
        }
        this.f21955f.setVisibility(8);
        this.f21956g.setVisibility(0);
        this.f21939ah.setEnabled(false);
        this.f21938ag.setEnabled(false);
    }

    /* renamed from: f */
    private int m30141f(int i) {
        Iterator it = this.f21957h.iterator();
        while (it.hasNext()) {
            C6191b bVar = (C6191b) it.next();
            if (bVar.mo19441b() == i) {
                return bVar.mo19438a();
            }
        }
        return -1;
    }

    /* renamed from: g */
    private int m30143g(int i) {
        Iterator it = this.f21957h.iterator();
        while (it.hasNext()) {
            C6191b bVar = (C6191b) it.next();
            if (bVar.mo19438a() == i) {
                return bVar.mo19441b();
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m30145h(int i) {
        int i2 = i - 1;
        int i3 = i + 1;
        int i4 = i - this.f21942ak;
        int i5 = this.f21942ak + i;
        int aG = m30124aG();
        if ((i2 == aG && i % this.f21942ak != 0) || ((i3 == aG && i3 % this.f21942ak != 0) || i4 == aG || i5 == aG)) {
            m30133b(i, aG);
        }
        m30125aH();
    }

    /* renamed from: K */
    public void mo1201K() {
        m30118aA();
        super.mo1201K();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21946ao = new C6190a(0, 0);
        this.f21952au = layoutInflater.inflate(C5460i.puzzle_view, viewGroup, false);
        m30129at();
        m30139e(mo1318s().getResources().getConfiguration().orientation);
        this.f21957h = new ArrayList<>();
        this.f21947ap = false;
        m30122aE();
        m30123aF();
        m30120aC();
        return this.f21952au;
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        List<HashMap> list;
        super.mo1234a(bundle);
        this.f21958i = new ArrayList<>();
        this.f21957h = new ArrayList<>();
        this.f21940ai = new ArrayList();
        Bundle m = mo1307m();
        if (m != null) {
            this.f21953d = m.getBundle("PAGE_STYLE");
            this.f21937af = m.getString("imageName");
            list = (List) m.getSerializable("LEVELS_KEY");
        } else {
            list = null;
        }
        this.f21951at = C6619m.m32025g(mo1318s());
        if (list != null && list.size() > 0) {
            if (list.size() > 1) {
                this.f21940ai = new ArrayList();
                ArrayList arrayList = new ArrayList();
                for (HashMap hashMap : list) {
                    int b = m30131b((String) hashMap.get("rows"), -1);
                    if (b >= 3 && b <= 15) {
                        this.f21940ai.add(hashMap);
                        arrayList.add(hashMap.get("title"));
                    }
                }
                this.f21941aj = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (this.f21940ai.size() != 1) {
                    mo20292ay();
                    this.f21950as = true;
                }
            }
            HashMap hashMap2 = (HashMap) list.get(0);
            this.f21943al = Integer.parseInt((String) hashMap2.get("rows"));
            this.f21943al = Math.min(15, this.f21943al);
            this.f21936ae = (String) hashMap2.get("nextPage");
        }
        if (bundle != null) {
            this.f21950as = bundle.getBoolean("shouldChooseLevel");
            this.f21936ae = bundle.getString("mWinningPage");
            this.f21948aq = bundle.getBoolean("previewing");
            this.f21949ar = bundle.getBoolean("inGame");
            this.f21942ak = bundle.getInt("max");
            this.f21944am = bundle.getInt("puzzles");
            this.f21943al = bundle.getInt("puzzleRows");
            this.f21958i = bundle.getParcelableArrayList("puzzlePiecesStates");
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        if (this.f21940ai != null && this.f21940ai.size() > 1) {
            menu.add(10, 11, 0, C5462k.puzzle_change_difficulty);
        }
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z && this.f21950as) {
            m30130az();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != 11) {
            return super.mo1245a(menuItem);
        }
        m30119aB();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo1450b() {
        if (this.f21957h.size() != 0 && this.f21954e != null) {
            if (this.f21949ar) {
                this.f21948aq = false;
                this.f21938ag.setText(C5462k.puzzle_preview);
                int width = (this.f21955f.getWidth() - (this.f21942ak * this.f21945an)) / 2;
                int height = (this.f21955f.getHeight() - (this.f21942ak * this.f21945an)) / 2;
                int i = 0;
                int i2 = 0;
                while (i < this.f21942ak) {
                    int i3 = width;
                    int i4 = i2;
                    int i5 = 0;
                    while (i5 < this.f21942ak) {
                        C6191b bVar = (C6191b) this.f21957h.get(i4);
                        bVar.mo19445c(i4, i4);
                        bVar.mo19440a(i3, height);
                        i3 += this.f21945an;
                        i5++;
                        i4++;
                    }
                    height += this.f21945an;
                    i++;
                    i2 = i4;
                }
            }
            ((C6191b) this.f21957h.get(this.f21944am - 1)).setVisibility(4);
            for (int i6 = 0; i6 < this.f21943al * 5; i6++) {
                int c = m30135c(0, this.f21944am - 1);
                int c2 = m30135c(0, this.f21944am - 1);
                if (c != c2 && c < this.f21944am - 1 && c2 < this.f21944am - 1) {
                    m30133b(c, c2);
                }
            }
            this.f21949ar = true;
            this.f21938ag.setEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo1453c() {
        int i;
        Button button;
        if (this.f21954e != null) {
            if (this.f21948aq) {
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f21957h.iterator();
                while (it.hasNext()) {
                    C6191b bVar = (C6191b) it.next();
                    arrayList.add(new Point(bVar.f21971a, bVar.f21972b));
                }
                Iterator it2 = this.f21957h.iterator();
                while (it2.hasNext()) {
                    C6191b bVar2 = (C6191b) it2.next();
                    Point point = (Point) arrayList.get(bVar2.mo19441b());
                    bVar2.mo19440a(point.x, point.y);
                }
                ((C6191b) this.f21957h.get(this.f21944am - 1)).setVisibility(4);
                button = this.f21938ag;
                i = C5462k.puzzle_preview;
            } else {
                int width = (this.f21955f.getWidth() - (this.f21942ak * this.f21945an)) / 2;
                int height = (this.f21955f.getHeight() - (this.f21942ak * this.f21945an)) / 2;
                int i2 = 0;
                int i3 = 0;
                while (i2 < this.f21942ak) {
                    int i4 = width;
                    int i5 = i3;
                    int i6 = 0;
                    while (i6 < this.f21942ak) {
                        ((C6191b) this.f21957h.get(i5)).mo19440a(i4, height);
                        i4 += this.f21945an;
                        i6++;
                        i5++;
                    }
                    height += this.f21945an;
                    i2++;
                    i3 = i5;
                }
                ((C6191b) this.f21957h.get(this.f21944am - 1)).setVisibility(0);
                button = this.f21938ag;
                i = C5462k.puzzle_continue;
            }
            button.setText(i);
            this.f21948aq = !this.f21948aq;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public synchronized void mo19417d() {
        if (!this.f21947ap) {
            m30122aE();
        }
        m30121aD();
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("shouldChooseLevel", this.f21950as);
        bundle.putString("mWinningPage", this.f21936ae);
        bundle.putBoolean("previewing", this.f21948aq);
        bundle.putBoolean("inGame", this.f21949ar);
        bundle.putBoolean("puzzlePiecesCreated", this.f21947ap);
        bundle.putInt("max", this.f21942ak);
        bundle.putInt("puzzleRows", this.f21943al);
        bundle.putParcelableArrayList("puzzlePiecesStates", this.f21958i);
        bundle.putInt("puzzles", this.f21944am);
        bundle.putInt("pieceSize", this.f21945an);
        super.mo1282e(bundle);
    }
}
