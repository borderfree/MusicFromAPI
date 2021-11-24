package com.seattleclouds.modules.p188u;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.SoundPool;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6638s;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import kankan.wheel.widget.C6695d;
import kankan.wheel.widget.WheelView;
import kankan.wheel.widget.p193a.C6691a;

/* renamed from: com.seattleclouds.modules.u.a */
public class C6292a extends C6557s {

    /* renamed from: a */
    private View f22328a;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public int f22329ae = -1;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public int f22330af = -1;

    /* renamed from: ag */
    private int f22331ag = -1;

    /* renamed from: ah */
    private int f22332ah = -1;

    /* renamed from: ai */
    private int f22333ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public int f22334aj = 0;

    /* renamed from: ak */
    private int f22335ak = 0;

    /* renamed from: al */
    private int f22336al = 0;

    /* renamed from: am */
    private long f22337am = 0;

    /* renamed from: an */
    private Timer f22338an = null;

    /* renamed from: ao */
    private Timer f22339ao = null;

    /* renamed from: ap */
    private ArrayList<C6301b> f22340ap;
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public boolean f22341aq;

    /* renamed from: ar */
    private String f22342ar = null;

    /* renamed from: as */
    private SharedPreferences f22343as;

    /* renamed from: at */
    private final C6695d f22344at = new C6695d() {
        /* renamed from: a */
        public void mo19680a(WheelView wheelView) {
            C6292a.this.f22334aj = C6292a.this.f22334aj + 1;
            C6292a.this.m30622n(false);
            C6292a.this.m30585a(C6292a.this.f22329ae, true, true, 1.05f);
        }

        /* renamed from: b */
        public void mo19681b(WheelView wheelView) {
            C6292a.this.f22334aj = C6292a.this.f22334aj - 1;
            C6292a.this.m30583a(C6292a.this.f22330af, true);
            if (C6292a.this.f22334aj <= 0) {
                C6292a.this.m30622n(true);
                C6292a.this.m30595aA();
                C6292a.this.m30606d();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public WheelView f22345b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public WheelView f22346c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WheelView f22347d;

    /* renamed from: e */
    private ImageButton f22348e;

    /* renamed from: f */
    private TextView f22349f;

    /* renamed from: g */
    private SoundPool f22350g;

    /* renamed from: h */
    private HashSet<Integer> f22351h = new HashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f22352i = -1;

    /* renamed from: com.seattleclouds.modules.u.a$a */
    private class C6300a extends C6691a {

        /* renamed from: a */
        final int f22360a = 100;

        /* renamed from: b */
        final int f22361b = 80;

        /* renamed from: c */
        final LayoutParams f22362c = new LayoutParams(-1, 100);

        /* renamed from: d */
        final LayoutParams f22363d = new LayoutParams(-1, 100);

        /* renamed from: f */
        private final ArrayList<HashMap<String, String>> f22365f;

        /* renamed from: g */
        private HashMap<String, SoftReference<Bitmap>> f22366g;

        /* renamed from: h */
        private Context f22367h;

        public C6300a(Context context, ArrayList<HashMap<String, String>> arrayList) {
            this.f22367h = context;
            this.f22365f = arrayList;
            this.f22362c.gravity = 1;
            this.f22366g = new HashMap<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) ((HashMap) it.next()).get("img");
                if (str != null && !this.f22366g.containsKey(str)) {
                    this.f22366g.put(str, new SoftReference(m30629a(str)));
                }
            }
        }

        /* renamed from: a */
        private Bitmap m30629a(String str) {
            return C6638s.m32069a(str, 100, 80, false);
        }

        /* renamed from: b */
        private Bitmap m30630b(String str) {
            Bitmap bitmap = (Bitmap) ((SoftReference) this.f22366g.get(str)).get();
            if (bitmap != null) {
                return bitmap;
            }
            Bitmap a = m30629a(str);
            this.f22366g.put(str, new SoftReference(m30629a(str)));
            return a;
        }

        /* renamed from: a */
        public int mo19682a() {
            return this.f22365f.size();
        }

        /* renamed from: a */
        public View mo19683a(int i, View view, ViewGroup viewGroup) {
            HashMap hashMap = (HashMap) this.f22365f.get(i);
            String str = (String) hashMap.get("img");
            String str2 = (String) hashMap.get("text");
            if (str != null) {
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageBitmap(m30630b(str));
                    return view;
                }
                ImageView imageView = new ImageView(this.f22367h);
                imageView.setLayoutParams(this.f22362c);
                imageView.setPadding(0, 10, 0, 10);
                imageView.setScaleType(ScaleType.CENTER);
                imageView.setImageBitmap(m30630b(str));
                return imageView;
            } else if (view instanceof TextView) {
                ((TextView) view).setText(str2);
                return view;
            } else {
                TextView textView = new TextView(this.f22367h);
                textView.setLayoutParams(this.f22363d);
                textView.setPadding(0, 10, 0, 10);
                textView.setGravity(17);
                textView.setText(str2);
                return textView;
            }
        }
    }

    /* renamed from: com.seattleclouds.modules.u.a$b */
    private class C6301b {

        /* renamed from: a */
        public int f22368a;

        /* renamed from: b */
        public int f22369b;

        /* renamed from: c */
        public int f22370c;

        /* renamed from: d */
        public String f22371d;

        public C6301b(int i, int i2, int i3, String str) {
            this.f22368a = i;
            this.f22369b = i2;
            this.f22370c = i3;
            this.f22371d = str;
        }
    }

    /* renamed from: a */
    private static int m30579a(SoundPool soundPool, String str) {
        if (str == null) {
            return -1;
        }
        AssetFileDescriptor f = App.m25650f(str);
        if (f == null) {
            return -1;
        }
        int load = soundPool.load(f.getFileDescriptor(), f.getStartOffset(), f.getLength(), 1);
        try {
            f.close();
        } catch (IOException e) {
            m30605c(e.getMessage());
        }
        return load;
    }

    /* renamed from: a */
    private String m30581a(long j) {
        Resources t = mo1320t();
        long currentTimeMillis = (j - System.currentTimeMillis()) / 1000;
        float f = (float) currentTimeMillis;
        float f2 = f / 3.15576E7f;
        if (f2 > 1.0f) {
            return t.getString(C5462k.slotmachine_available_in_years, new Object[]{Integer.valueOf((int) f2)});
        }
        float f3 = f / 2678400.0f;
        if (f3 > 1.0f) {
            return t.getString(C5462k.slotmachine_available_in_months, new Object[]{Integer.valueOf((int) f3)});
        }
        float f4 = f / 604800.0f;
        if (f4 > 1.0f) {
            return t.getString(C5462k.slotmachine_available_in_weeks, new Object[]{Integer.valueOf((int) f4)});
        }
        float f5 = f / 86400.0f;
        if (f5 > 1.0f) {
            return t.getString(C5462k.slotmachine_available_in_days, new Object[]{Integer.valueOf((int) f5)});
        }
        float f6 = f / 3600.0f;
        if (f6 > 1.0f) {
            return t.getString(C5462k.slotmachine_available_in_hours, new Object[]{Integer.valueOf((int) f6)});
        }
        float f7 = f / 60.0f;
        if (f7 > 1.0f) {
            return t.getString(C5462k.slotmachine_available_in_minutes, new Object[]{Integer.valueOf(Math.round(f7))});
        }
        return t.getString(C5462k.slotmachine_available_in_seconds, new Object[]{Integer.valueOf((int) currentTimeMillis)});
    }

    /* renamed from: a */
    private static ArrayList<HashMap<String, String>> m30582a(Bundle bundle, String str) {
        Serializable serializable = bundle.getSerializable(str);
        if (serializable == null || !(serializable instanceof ArrayList)) {
            return null;
        }
        return (ArrayList) serializable;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30583a(int i, boolean z) {
        m30584a(i, z, false);
    }

    /* renamed from: a */
    private void m30584a(int i, boolean z, boolean z2) {
        m30585a(i, z, z2, 1.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30585a(int i, boolean z, boolean z2, float f) {
        if (z) {
            m30597aC();
        }
        if (i > 0) {
            int play = this.f22350g.play(i, 1.0f, 1.0f, 0, z2 ? -1 : 0, f);
            if (play > 0) {
                this.f22351h.add(Integer.valueOf(play));
            }
        }
    }

    @TargetApi(11)
    /* renamed from: a */
    private void m30586a(ImageButton imageButton, float f) {
        if (VERSION.SDK_INT >= 11) {
            imageButton.setAlpha(f);
        } else {
            imageButton.setAlpha((int) (f * 255.0f));
        }
    }

    /* renamed from: a */
    private void m30591a(Date date) {
        m30598as();
        this.f22338an = new Timer();
        this.f22338an.schedule(new TimerTask() {
            public void run() {
                if (C6292a.this.mo1318s() != null) {
                    C6292a.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            C6292a.this.m30609e();
                        }
                    });
                }
            }
        }, date);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30592a(WheelView wheelView, int i) {
        wheelView.mo20780b((this.f22333ai * -350) + ((int) (Math.random() * 50.0d)), (this.f22333ai + i) * 1000);
    }

    /* renamed from: a */
    private void m30593a(WheelView wheelView, ArrayList<HashMap<String, String>> arrayList) {
        wheelView.setViewAdapter(new C6300a(mo1318s(), arrayList));
        wheelView.setCurrentItem((int) (Math.random() * 10.0d));
        wheelView.setCyclic(true);
        wheelView.setEnabled(false);
        wheelView.mo20777a(this.f22344at);
    }

    /* renamed from: a */
    private void m30594a(boolean z, Date date) {
        int i;
        if (date != null) {
            long time = date.getTime() - System.currentTimeMillis();
            if (time < 120000) {
                i = 1000;
            } else {
                if (time < 7200000) {
                    i = 60000;
                }
                this.f22349f.setText(m30581a(date.getTime()));
            }
            m30610e(i);
            this.f22349f.setText(m30581a(date.getTime()));
        } else {
            m30599at();
        }
        int i2 = 0;
        this.f22349f.setVisibility(z ? 8 : 0);
        ImageButton imageButton = this.f22348e;
        if (!z) {
            i2 = 8;
        }
        imageButton.setVisibility(i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m30595aA() {
        C6301b aB = m30596aB();
        if (aB != null) {
            m30583a(this.f22331ag, false);
            App.m25622a(aB.f22371d, (Fragment) this);
            return;
        }
        m30583a(this.f22332ah, false);
    }

    /* renamed from: aB */
    private C6301b m30596aB() {
        int currentItem = this.f22345b.getCurrentItem();
        int currentItem2 = this.f22346c.getCurrentItem();
        int currentItem3 = this.f22347d.getCurrentItem();
        Iterator it = this.f22340ap.iterator();
        while (it.hasNext()) {
            C6301b bVar = (C6301b) it.next();
            if (bVar.f22368a == currentItem && bVar.f22369b == currentItem2 && bVar.f22370c == currentItem3) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: aC */
    private void m30597aC() {
        Iterator it = this.f22351h.iterator();
        while (it.hasNext()) {
            m30612f(((Integer) it.next()).intValue());
        }
        this.f22351h.clear();
    }

    /* renamed from: as */
    private void m30598as() {
        if (this.f22338an != null) {
            this.f22338an.cancel();
            this.f22338an = null;
        }
    }

    /* renamed from: at */
    private void m30599at() {
        if (this.f22339ao != null) {
            this.f22339ao.cancel();
            this.f22339ao = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m30600az() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (!C6292a.this.f22341aq) {
                    C6292a.this.m30592a(C6292a.this.f22345b, 0);
                    C6292a.this.m30592a(C6292a.this.f22346c, 1);
                    C6292a.this.m30592a(C6292a.this.f22347d, 2);
                }
            }
        }, 500);
    }

    /* renamed from: b */
    private void m30601b() {
        boolean z;
        String[] strArr;
        int i;
        int i2;
        int parseInt;
        int parseInt2;
        Bundle m = mo1307m();
        if (m != null) {
            Bundle bundle = m.getBundle("ARG_CONFIG");
            if (bundle != null) {
                ArrayList a = m30582a(bundle, "component1");
                ArrayList a2 = m30582a(bundle, "component2");
                ArrayList a3 = m30582a(bundle, "component3");
                if (!(a == null || a2 == null || a3 == null)) {
                    String string = bundle.getString("actionofwinposition");
                    String string2 = bundle.getString("winpositionofcomponents");
                    if (!(string == null || string2 == null)) {
                        String[] split = string.split(";", -1);
                        String[] split2 = string2.split(";", -1);
                        if (split.length <= split2.length / 3) {
                            this.f22340ap = new ArrayList<>();
                            int i3 = 0;
                            int i4 = 0;
                            while (i4 < split.length) {
                                try {
                                    String str = split[i4];
                                    int i5 = i3 + 1;
                                    try {
                                        parseInt = Integer.parseInt(split2[i3]);
                                        i3 = i5 + 1;
                                        parseInt2 = Integer.parseInt(split2[i5]);
                                        i2 = i3 + 1;
                                    } catch (NumberFormatException e) {
                                        e = e;
                                        i = i4;
                                        strArr = split;
                                        i2 = i5;
                                        m30605c(e.getMessage());
                                        i3 = i2;
                                        i4 = i + 1;
                                        split = strArr;
                                    }
                                    try {
                                        int parseInt3 = Integer.parseInt(split2[i3]);
                                        r1 = r1;
                                        C6301b bVar = r1;
                                        i = i4;
                                        strArr = split;
                                        try {
                                            C6301b bVar2 = new C6301b(parseInt, parseInt2, parseInt3, str);
                                            this.f22340ap.add(bVar);
                                        } catch (NumberFormatException e2) {
                                            e = e2;
                                        }
                                    } catch (NumberFormatException e3) {
                                        e = e3;
                                        i = i4;
                                        strArr = split;
                                        m30605c(e.getMessage());
                                        i3 = i2;
                                        i4 = i + 1;
                                        split = strArr;
                                    }
                                } catch (NumberFormatException e4) {
                                    e = e4;
                                    i = i4;
                                    strArr = split;
                                    i2 = i3;
                                    m30605c(e.getMessage());
                                    i3 = i2;
                                    i4 = i + 1;
                                    split = strArr;
                                }
                                i3 = i2;
                                i4 = i + 1;
                                split = strArr;
                            }
                            String string3 = bundle.getString("buttonimage");
                            String string4 = bundle.getString("soundbutton");
                            String string5 = bundle.getString("soundcomponentrotation");
                            String string6 = bundle.getString("soundcomponentstop");
                            String string7 = bundle.getString("soundwin");
                            String string8 = bundle.getString("soundloser");
                            this.f22350g = new SoundPool(2, 3, 0);
                            this.f22352i = m30579a(this.f22350g, string4);
                            this.f22329ae = m30579a(this.f22350g, string5);
                            this.f22330af = m30579a(this.f22350g, string6);
                            this.f22331ag = m30579a(this.f22350g, string7);
                            this.f22332ah = m30579a(this.f22350g, string8);
                            this.f22333ai = bundle.getInt("timerotationofslots", 3);
                            this.f22335ak = bundle.getInt("spinLimit", this.f22335ak);
                            String string9 = bundle.getString("spinLimitExpiration");
                            if (string9 != null) {
                                String[] split3 = string9.split(":", -1);
                                for (int min = Math.min(split3.length - 1, 4); min >= 0; min--) {
                                    try {
                                        int parseInt4 = Integer.parseInt(split3[min]);
                                        switch (min) {
                                            case 0:
                                                this.f22337am += ((long) parseInt4) * 2592000000L;
                                                break;
                                            case 1:
                                                this.f22337am += ((long) parseInt4) * 604800000;
                                                break;
                                            case 2:
                                                this.f22337am += ((long) parseInt4) * 86400000;
                                                break;
                                            case 3:
                                                this.f22337am += ((long) parseInt4) * 3600000;
                                                break;
                                            case 4:
                                                this.f22337am += ((long) parseInt4) * 60000;
                                                break;
                                        }
                                    } catch (NumberFormatException e5) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Slotmachine: ");
                                        sb.append(e5.getMessage());
                                        m30605c(sb.toString());
                                    }
                                }
                            }
                            this.f22342ar = bundle.getString("PAGE_ID");
                            this.f22343as = mo1318s().getSharedPreferences("SLOTMACHINE_INFO_PREF_NAME", 0);
                            if (this.f22333ai <= 0) {
                                this.f22333ai = 3;
                            }
                            this.f22345b = (WheelView) this.f22328a.findViewById(C5458g.slot_machine_wheel1);
                            this.f22346c = (WheelView) this.f22328a.findViewById(C5458g.slot_machine_wheel2);
                            this.f22347d = (WheelView) this.f22328a.findViewById(C5458g.slot_machine_wheel3);
                            m30593a(this.f22345b, a);
                            m30593a(this.f22346c, a2);
                            m30593a(this.f22347d, a3);
                            this.f22349f = (TextView) this.f22328a.findViewById(C5458g.status_text_view);
                            this.f22348e = (ImageButton) this.f22328a.findViewById(C5458g.spin_image_button);
                            this.f22348e.setOnClickListener(new OnClickListener() {
                                public void onClick(View view) {
                                    C6292a.this.m30583a(C6292a.this.f22352i, true);
                                    C6292a.this.m30622n(false);
                                    C6292a.this.m30600az();
                                }
                            });
                            if (string3 != null) {
                                Bitmap a4 = C6638s.m32068a(string3, 2000);
                                if (a4 != null) {
                                    this.f22348e.setImageBitmap(a4);
                                    z = false;
                                    this.f22348e.setBackgroundColor(0);
                                    Bundle bundle2 = m.getBundle("PAGE_STYLE");
                                    C6593am.m31914a(this.f22328a, bundle2);
                                    C6593am.m31915a(this.f22349f, bundle2);
                                    this.f22341aq = z;
                                }
                            }
                            z = false;
                            Bundle bundle22 = m.getBundle("PAGE_STYLE");
                            C6593am.m31914a(this.f22328a, bundle22);
                            C6593am.m31915a(this.f22349f, bundle22);
                            this.f22341aq = z;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private void m30603c() {
        m30598as();
        m30599at();
    }

    /* renamed from: c */
    private static void m30605c(String str) {
        Log.i("SlotMachine", str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m30606d() {
        if (this.f22335ak > 0 && this.f22336al > 0) {
            Editor edit = this.f22343as.edit();
            if (this.f22335ak == this.f22336al) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f22342ar);
                sb.append("startSpinMilliseconds");
                edit.putLong(sb.toString(), System.currentTimeMillis());
            }
            this.f22336al--;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f22342ar);
            sb2.append("spinRemaining");
            edit.putInt(sb2.toString(), this.f22336al);
            edit.commit();
        }
        m30609e();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m30609e() {
        if (this.f22335ak > 0) {
            SharedPreferences sharedPreferences = this.f22343as;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f22342ar);
            sb.append("startSpinMilliseconds");
            long j = sharedPreferences.getLong(sb.toString(), 0);
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            if (currentTimeMillis - j >= this.f22337am) {
                this.f22336al = this.f22335ak;
                Editor edit = this.f22343as.edit();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f22342ar);
                sb2.append("spinRemaining");
                edit.putInt(sb2.toString(), this.f22336al);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.f22342ar);
                sb3.append("startSpinMilliseconds");
                edit.remove(sb3.toString());
                edit.commit();
                if (this.f22336al > 0) {
                    z = true;
                }
                m30620m(z);
                return;
            }
            long j2 = (this.f22337am + j) - currentTimeMillis;
            Date date = new Date(j + this.f22337am + 1000);
            if (j2 < 3600000) {
                m30591a(date);
            }
            SharedPreferences sharedPreferences2 = this.f22343as;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f22342ar);
            sb4.append("spinRemaining");
            this.f22336al = sharedPreferences2.getInt(sb4.toString(), -1);
            if (this.f22336al == -1) {
                this.f22336al = this.f22335ak;
            }
            if (this.f22336al > 0) {
                z = true;
            }
            m30594a(z, date);
        }
    }

    /* renamed from: e */
    private void m30610e(int i) {
        m30599at();
        this.f22339ao = new Timer();
        this.f22339ao.schedule(new TimerTask() {
            public void run() {
                if (C6292a.this.mo1318s() != null) {
                    C6292a.this.mo1318s().runOnUiThread(new Runnable() {
                        public void run() {
                            C6292a.this.m30609e();
                        }
                    });
                }
            }
        }, (long) i);
    }

    /* renamed from: f */
    private void m30612f(int i) {
        if (i > 0) {
            this.f22350g.stop(i);
        }
    }

    /* renamed from: m */
    private void m30620m(boolean z) {
        m30594a(z, (Date) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m30622n(boolean z) {
        this.f22348e.setEnabled(z);
        m30586a(this.f22348e, z ? 1.0f : 0.6f);
    }

    /* renamed from: K */
    public void mo1201K() {
        m30603c();
        super.mo1201K();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22328a = layoutInflater.inflate(C5460i.fragment_slotmachine, viewGroup, false);
        m30601b();
        return this.f22328a;
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z) {
            m30609e();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        this.f22341aq = true;
        m30603c();
        m30597aC();
        super.mo1296i();
    }
}
