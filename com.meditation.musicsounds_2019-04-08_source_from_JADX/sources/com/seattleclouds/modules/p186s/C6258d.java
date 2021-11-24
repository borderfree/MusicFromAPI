package com.seattleclouds.modules.p186s;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C6557s;
import com.seattleclouds.util.C6589aj;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6598aq;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.s.d */
public class C6258d extends C6557s {

    /* renamed from: b */
    static String f22191b = "d";

    /* renamed from: c */
    static String f22192c = "laststate.cfg";

    /* renamed from: d */
    static String f22193d = "";

    /* renamed from: e */
    static String f22194e = "";

    /* renamed from: a */
    boolean f22195a = false;

    /* renamed from: ae */
    List<HashMap<String, Integer>> f22196ae;

    /* renamed from: af */
    int f22197af;

    /* renamed from: ag */
    String f22198ag = "Jones";

    /* renamed from: ah */
    String f22199ah = "Garcia";

    /* renamed from: ai */
    String f22200ai;

    /* renamed from: aj */
    TextView f22201aj;

    /* renamed from: ak */
    TextView f22202ak;

    /* renamed from: al */
    TextView f22203al;

    /* renamed from: am */
    TextView f22204am;

    /* renamed from: an */
    TextView f22205an;

    /* renamed from: ao */
    TextView f22206ao;

    /* renamed from: ap */
    LinearLayout f22207ap;

    /* renamed from: aq */
    LinearLayout f22208aq;

    /* renamed from: ar */
    C6254b f22209ar;
    /* access modifiers changed from: private */

    /* renamed from: as */
    public Bundle f22210as;

    /* renamed from: at */
    private String f22211at = null;

    /* renamed from: f */
    String f22212f = "pageid";

    /* renamed from: g */
    View f22213g;

    /* renamed from: h */
    ListView f22214h;

    /* renamed from: i */
    C6261a f22215i;

    /* renamed from: com.seattleclouds.modules.s.d$a */
    public class C6261a extends BaseAdapter {
        public C6261a() {
        }

        public boolean areAllItemsEnabled() {
            return false;
        }

        public int getCount() {
            return C6258d.this.f22197af;
        }

        public Object getItem(int i) {
            return C6258d.this.f22196ae.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            return 1;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            HashMap<String, Integer> hashMap = (HashMap) getItem(i);
            C0367h s = C6258d.this.mo1318s();
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i + 1);
            View a = new C6256c(s, hashMap, sb.toString(), C6258d.this.f22210as).mo19597a(view);
            Spinner spinner = (Spinner) a.findViewById(C5458g.scoreboard_f1_scores_picker);
            C6262b bVar = new C6262b();
            bVar.f22222c = "fighter1Scores";
            bVar.f22220a = i;
            bVar.f22221b = spinner.getAdapter();
            bVar.f22223d = hashMap;
            spinner.setOnItemSelectedListener(bVar);
            Spinner spinner2 = (Spinner) a.findViewById(C5458g.scoreboard_f2_scores_picker);
            C6262b bVar2 = new C6262b();
            bVar2.f22222c = "fighter2Scores";
            bVar2.f22220a = i;
            bVar2.f22221b = spinner2.getAdapter();
            bVar2.f22223d = hashMap;
            spinner2.setOnItemSelectedListener(bVar2);
            return a;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            return true;
        }

        public boolean isEnabled(int i) {
            return false;
        }
    }

    /* renamed from: com.seattleclouds.modules.s.d$b */
    public class C6262b implements OnItemSelectedListener {

        /* renamed from: a */
        int f22220a;

        /* renamed from: b */
        SpinnerAdapter f22221b;

        /* renamed from: c */
        String f22222c;

        /* renamed from: d */
        HashMap<String, Integer> f22223d;

        public C6262b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            String str = (String) this.f22221b.getItem(i);
            if (this.f22223d != null) {
                this.f22223d.put(this.f22222c, Integer.valueOf(Integer.parseInt(str)));
            }
            if (C6258d.this.f22201aj != null) {
                TextView textView = C6258d.this.f22201aj;
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(C6258d.this.m30439e());
                textView.setText(sb.toString());
            }
            if (C6258d.this.f22202ak != null) {
                TextView textView2 = C6258d.this.f22202ak;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(C6258d.this.m30429as());
                textView2.setText(sb2.toString());
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m30423a(String str, String str2) {
        if (this.f22204am != null && this.f22205an != null) {
            this.f22198ag = str;
            this.f22199ah = str2;
            this.f22204am.setText(str);
            this.f22205an.setText(str2);
        }
    }

    /* renamed from: aA */
    private void m30424aA() {
        final CharSequence[] charSequenceArr = {"Facebook", "Twitter", "Share via apps ..."};
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3054a((CharSequence) "Pick your choice").mo3053a((ListAdapter) new C6252a(), (OnClickListener) new OnClickListener() {
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0063  */
            /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.content.DialogInterface r5, int r6) {
                /*
                    r4 = this;
                    r5 = 1
                    switch(r6) {
                        case 0: goto L_0x0011;
                        case 1: goto L_0x000b;
                        case 2: goto L_0x0005;
                        default: goto L_0x0004;
                    }
                L_0x0004:
                    goto L_0x005d
                L_0x0005:
                    com.seattleclouds.modules.s.d r0 = com.seattleclouds.modules.p186s.C6258d.this     // Catch:{ InvalidParameterException -> 0x0029, FileNotFoundException -> 0x0017 }
                    r0.m30427aD()     // Catch:{ InvalidParameterException -> 0x0029, FileNotFoundException -> 0x0017 }
                    goto L_0x005d
                L_0x000b:
                    com.seattleclouds.modules.s.d r0 = com.seattleclouds.modules.p186s.C6258d.this     // Catch:{ InvalidParameterException -> 0x0029, FileNotFoundException -> 0x0017 }
                    r0.m30426aC()     // Catch:{ InvalidParameterException -> 0x0029, FileNotFoundException -> 0x0017 }
                    goto L_0x005d
                L_0x0011:
                    com.seattleclouds.modules.s.d r0 = com.seattleclouds.modules.p186s.C6258d.this     // Catch:{ InvalidParameterException -> 0x0029, FileNotFoundException -> 0x0017 }
                    r0.m30425aB()     // Catch:{ InvalidParameterException -> 0x0029, FileNotFoundException -> 0x0017 }
                    goto L_0x005d
                L_0x0017:
                    r0 = move-exception
                    java.lang.String r1 = com.seattleclouds.modules.p186s.C6258d.f22191b
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Error: "
                    r2.append(r3)
                    java.lang.String r0 = r0.getLocalizedMessage()
                    goto L_0x003a
                L_0x0029:
                    r0 = move-exception
                    java.lang.String r1 = com.seattleclouds.modules.p186s.C6258d.f22191b
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Error: "
                    r2.append(r3)
                    java.lang.String r0 = r0.getLocalizedMessage()
                L_0x003a:
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    android.util.Log.e(r1, r0)
                    com.seattleclouds.modules.s.d r0 = com.seattleclouds.modules.p186s.C6258d.this
                    android.support.v4.app.h r0 = r0.mo1318s()
                    android.content.Context r0 = r0.getApplicationContext()
                    com.seattleclouds.modules.s.d r1 = com.seattleclouds.modules.p186s.C6258d.this
                    int r2 = com.seattleclouds.C5451m.C5462k.error_unable_to_create_screenshot
                    java.lang.String r1 = r1.mo1219a(r2)
                    android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r5)
                    r0.show()
                L_0x005d:
                    com.seattleclouds.modules.s.d r0 = com.seattleclouds.modules.p186s.C6258d.this
                    boolean r0 = r0.f22195a
                    if (r0 == 0) goto L_0x0089
                    com.seattleclouds.modules.s.d r0 = com.seattleclouds.modules.p186s.C6258d.this
                    android.support.v4.app.h r0 = r0.mo1318s()
                    android.content.Context r0 = r0.getApplicationContext()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "U clicked "
                    r1.append(r2)
                    java.lang.CharSequence[] r2 = r0
                    r6 = r2[r6]
                    r1.append(r6)
                    java.lang.String r6 = r1.toString()
                    android.widget.Toast r5 = android.widget.Toast.makeText(r0, r6, r5)
                    r5.show()
                L_0x0089:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p186s.C6258d.C62602.onClick(android.content.DialogInterface, int):void");
            }
        });
        aVar.mo3068c();
    }

    /* access modifiers changed from: private */
    /* renamed from: aB */
    public void m30425aB() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TITLE", "");
        intent.addFlags(1);
        intent.setType("image/*");
        C0367h s = mo1318s();
        String str = f22194e;
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().getTime());
        sb.append(".jpeg");
        this.f22200ai = C6589aj.m31897a((Activity) s, str, sb.toString());
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(this.f22200ai)));
        for (ResolveInfo resolveInfo : mo1318s().getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.name.contains("facebook")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setFlags(536870912);
                intent.setComponent(componentName);
                mo1230a(intent);
                new C6263e().execute(new String[]{this.f22200ai, this.f22212f, this.f22211at});
                return;
            }
        }
        Toast.makeText(mo1318s().getApplicationContext(), "Please install the facebook app.", 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: aC */
    public void m30426aC() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "subject");
        intent.putExtra("android.intent.extra.TEXT", "");
        intent.setType("image/*");
        C0367h s = mo1318s();
        String str = f22194e;
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().getTime());
        sb.append(".jpeg");
        this.f22200ai = C6589aj.m31897a((Activity) s, str, sb.toString());
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(this.f22200ai)));
        for (ResolveInfo resolveInfo : mo1318s().getPackageManager().queryIntentActivities(intent, 0)) {
            if (resolveInfo.activityInfo.name.contains("com.twitter")) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                ComponentName componentName = new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setFlags(536870912);
                intent.setComponent(componentName);
                mo1230a(intent);
                new C6263e().execute(new String[]{this.f22200ai, this.f22212f, this.f22211at});
                return;
            }
        }
        Toast.makeText(mo1318s().getApplicationContext(), "Please install the twitter app.", 1).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: aD */
    public void m30427aD() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TITLE", "Content to share");
        intent.addFlags(1);
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{this.f22211at});
        C0367h s = mo1318s();
        String str = f22194e;
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().getTime());
        sb.append(".jpeg");
        this.f22200ai = C6589aj.m31897a((Activity) s, str, sb.toString());
        intent.putExtra("android.intent.extra.STREAM", C6598aq.m31937a(new File(this.f22200ai)));
        mo1230a(Intent.createChooser(intent, "Share image using"));
    }

    /* renamed from: aE */
    private void m30428aE() {
        File file = new File(f22194e);
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String file2 : list) {
                new File(file, file2).delete();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public int m30429as() {
        int i = 0;
        if (this.f22196ae != null) {
            int i2 = 0;
            for (HashMap hashMap : this.f22196ae) {
                if (hashMap == null) {
                    return 0;
                }
                i2 += ((Integer) hashMap.get("fighter2Scores")).intValue();
            }
            i = i2;
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m30430at() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f22212f = m.getString("pageid");
            this.f22211at = m.getString("scbemail");
        }
        if (this.f22196ae == null) {
            this.f22196ae = new ArrayList(0);
        }
        this.f22196ae.clear();
        this.f22196ae = new ArrayList(this.f22197af);
        for (int i = 0; i < this.f22197af; i++) {
            HashMap hashMap = new HashMap();
            hashMap.put("fighter1Scores", Integer.valueOf(0));
            hashMap.put("fighter2Scores", Integer.valueOf(0));
            this.f22196ae.add(hashMap);
        }
        m30436c(this.f22213g);
        String j = App.m25659j();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
        sb.append(this.f22212f);
        sb.append("_/screenshots");
        f22194e = sb.toString();
        new File(f22194e).mkdirs();
        m30428aE();
    }

    /* renamed from: az */
    private void m30431az() {
        this.f22209ar = new C6254b();
        this.f22209ar.mo19593c(this.f22204am.getText().toString());
        this.f22209ar.mo19594d(this.f22205an.getText().toString());
        this.f22209ar.mo19588a(Integer.valueOf(this.f22197af - 1));
        this.f22209ar.mo19587a((OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                String as = C6258d.this.f22209ar.mo19589as();
                String at = C6258d.this.f22209ar.mo19590at();
                Integer au = C6258d.this.f22209ar.mo19591au();
                if (au.intValue() != C6258d.this.f22197af || C6258d.this.f22209ar.mo19592av()) {
                    C6258d.this.f22197af = au.intValue();
                    C6258d.this.m30430at();
                }
                C6258d.this.m30423a(as, at);
            }
        });
        this.f22209ar.mo1448a(mo1323v(), "details");
    }

    /* renamed from: b */
    private void m30433b() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f22210as = m.getBundle("PAGE_STYLE");
            C6593am.m31914a(this.f22213g, this.f22210as);
            C6593am.m31915a(this.f22204am, this.f22210as);
            C6593am.m31915a(this.f22205an, this.f22210as);
            C6593am.m31915a(this.f22206ao, this.f22210as);
            C6593am.m31915a(this.f22201aj, this.f22210as);
            C6593am.m31915a(this.f22202ak, this.f22210as);
            C6593am.m31915a(this.f22203al, this.f22210as);
        }
    }

    /* renamed from: c */
    private void m30435c() {
        SharedPreferences sharedPreferences = mo1318s().getSharedPreferences("ScoreBoardPrefsFile", 0);
        this.f22198ag = sharedPreferences.getString("player1", "Fighter #1");
        this.f22199ah = sharedPreferences.getString("player2", "Fighter #2");
        this.f22204am.setText(this.f22198ag);
        this.f22205an.setText(this.f22199ah);
        try {
            String m = App.m25665m();
            StringBuilder sb = new StringBuilder();
            sb.append(m);
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(this.f22212f);
            sb.append("_");
            sb.append(f22192c);
            f22193d = sb.toString();
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(f22193d));
            this.f22196ae = (List) objectInputStream.readObject();
            objectInputStream.close();
            this.f22197af = this.f22196ae.size();
        } catch (Exception e) {
            String str = f22191b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to restore the last state: ");
            sb2.append(e.getMessage());
            Log.e(str, sb2.toString(), e);
        }
    }

    /* renamed from: c */
    private void m30436c(View view) {
        if (view != null) {
            this.f22214h = (ListView) view.findViewById(C5458g.scoreboard_rounds_list);
            this.f22215i = new C6261a();
            this.f22214h.setAdapter(this.f22215i);
        }
    }

    /* renamed from: d */
    private void m30438d() {
        Editor edit = mo1318s().getSharedPreferences("ScoreBoardPrefsFile", 0).edit();
        edit.putString("player1", this.f22198ag);
        edit.putString("player2", this.f22199ah);
        edit.apply();
        try {
            String m = App.m25665m();
            StringBuilder sb = new StringBuilder();
            sb.append(m);
            sb.append(TableOfContents.DEFAULT_PATH_SEPARATOR);
            sb.append(this.f22212f);
            sb.append("_");
            sb.append(f22192c);
            f22193d = sb.toString();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(f22193d)));
            objectOutputStream.writeObject(this.f22196ae);
            objectOutputStream.close();
        } catch (Exception e) {
            String str = f22191b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to save the current state: ");
            sb2.append(e.getMessage());
            Log.e(str, sb2.toString(), e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public int m30439e() {
        int i = 0;
        if (this.f22196ae != null) {
            int i2 = 0;
            for (HashMap hashMap : this.f22196ae) {
                if (hashMap == null) {
                    return 0;
                }
                i2 += ((Integer) hashMap.get("fighter1Scores")).intValue();
            }
            i = i2;
        }
        return i;
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        m30435c();
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        m30438d();
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f22213g = layoutInflater.inflate(C5460i.scoreboard_round_list, viewGroup, false);
        this.f22201aj = (TextView) this.f22213g.findViewById(C5458g.scoreboard_fighter1_total_scores_txt);
        this.f22202ak = (TextView) this.f22213g.findViewById(C5458g.scoreboard_fighter2_total_scores_txt);
        this.f22203al = (TextView) this.f22213g.findViewById(C5458g.scoreboard_total_title_txt);
        this.f22204am = (TextView) this.f22213g.findViewById(C5458g.scoreboard_fighter1_name_txt);
        this.f22205an = (TextView) this.f22213g.findViewById(C5458g.scoreboard_fighter2_name_txt);
        this.f22206ao = (TextView) this.f22213g.findViewById(C5458g.scoreboard_round_title_txt);
        this.f22207ap = (LinearLayout) this.f22213g.findViewById(C5458g.scoreboard_header_layout);
        this.f22208aq = (LinearLayout) this.f22213g.findViewById(C5458g.scoreboard_footer_layout);
        if (this.f22197af == 0) {
            this.f22197af = 10;
        }
        if (this.f22195a) {
            Log.d(f22191b, "View has been created!");
        }
        m30430at();
        m30433b();
        return this.f22213g;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.scoreboard_menu, menu);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.scoreboard_clear_score_menubutton) {
            m30431az();
            return true;
        } else if (itemId != C5458g.scoreboard_post_via_menubutton) {
            return super.mo1245a(menuItem);
        } else {
            m30424aA();
            return true;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        LayoutParams layoutParams;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            if (this.f22195a) {
                Toast.makeText(mo1318s(), "landscape", 0).show();
            }
            layoutParams = new LayoutParams(-1, -1, 1.1f);
        } else if (configuration.orientation == 1) {
            if (this.f22195a) {
                Toast.makeText(mo1318s(), "portrait", 0).show();
            }
            layoutParams = new LayoutParams(-1, -1, 2.0f);
        } else {
            return;
        }
        this.f22207ap.setLayoutParams(layoutParams);
        this.f22208aq.setLayoutParams(layoutParams);
    }
}
