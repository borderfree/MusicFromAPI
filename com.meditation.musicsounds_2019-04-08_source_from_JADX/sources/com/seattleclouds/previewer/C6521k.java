package com.seattleclouds.previewer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.Fragment;
import android.support.p009v4.widget.SwipeRefreshLayout.C0674b;
import android.support.p023v7.app.C0765d;
import android.support.p023v7.app.C0765d.C0766a;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.text.Html;
import android.text.Spanned;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.bitmapfun.C2418b.C2420a;
import com.google.android.bitmapfun.C2422c;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5457f;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6557s;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.previewer.data.C6478b;
import com.seattleclouds.previewer.data.SCTemplateApp;
import com.seattleclouds.util.C6595ao;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.widget.MultiSwipeRefreshLayout;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.p198io.C6730b;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.seattleclouds.previewer.k */
public class C6521k extends C6557s implements OnItemClickListener {

    /* renamed from: a */
    static int f23109a = 144;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C6538e f23110ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C2422c f23111af;

    /* renamed from: ag */
    private int f23112ag;

    /* renamed from: ah */
    private int f23113ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public SearchView f23114ai;

    /* renamed from: aj */
    private boolean f23115aj = true;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public String f23116ak = "";
    /* access modifiers changed from: private */

    /* renamed from: al */
    public int f23117al = 0;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public C0765d f23118am;
    /* access modifiers changed from: private */

    /* renamed from: an */
    public List<C6531b> f23119an = new ArrayList();

    /* renamed from: ao */
    private C6530a f23120ao;

    /* renamed from: b */
    private boolean f23121b = true;

    /* renamed from: c */
    private View f23122c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public GridView f23123d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public MultiSwipeRefreshLayout f23124e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View f23125f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<SCTemplateApp> f23126g = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<SCTemplateApp> f23127h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C6478b> f23128i = new ArrayList();

    /* renamed from: com.seattleclouds.previewer.k$a */
    public interface C6530a {
        /* renamed from: b */
        void mo19807b(SCTemplateApp sCTemplateApp);
    }

    /* renamed from: com.seattleclouds.previewer.k$b */
    private class C6531b {

        /* renamed from: b */
        private int f23138b;

        /* renamed from: c */
        private int f23139c;

        /* renamed from: d */
        private int f23140d;

        public C6531b(int i, int i2, int i3) {
            this.f23138b = i;
            this.f23139c = i2;
            this.f23140d = i3;
        }

        /* renamed from: a */
        public int mo20224a() {
            return this.f23138b;
        }

        /* renamed from: b */
        public int mo20225b() {
            return this.f23139c;
        }

        /* renamed from: c */
        public int mo20226c() {
            return this.f23140d;
        }
    }

    /* renamed from: com.seattleclouds.previewer.k$c */
    private class C6532c extends C5270d<Void, Void, String> {

        /* renamed from: b */
        private List<C6478b> f23142b = new ArrayList();

        /* renamed from: c */
        private boolean f23143c = true;

        public C6532c(Fragment fragment) {
            super(fragment);
        }

        /* renamed from: a */
        private void m31588a() {
            if (C6521k.this.f23128i.size() <= 0) {
                try {
                    m31589a(new JSONArray(C6730b.m32452a(C6521k.this.m31546as(), "UTF-8")));
                } catch (IOException | JSONException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m31589a(JSONArray jSONArray) {
            for (int i = 0; i < jSONArray.length(); i++) {
                this.f23142b.add(new C6478b(jSONArray.getJSONObject(i)));
            }
        }

        /* renamed from: b */
        private void m31590b() {
            this.f23142b.add(0, new C6478b());
            C6521k.this.f23128i = this.f23142b;
        }

        /* renamed from: b */
        private void m31591b(final JSONArray jSONArray) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        C6730b.m32458a(C6521k.this.m31547at(), jSONArray.toString(), "UTF-8");
                    } catch (IOException unused) {
                    }
                }
            }).start();
        }

        /* renamed from: a */
        public C6532c mo20227a(boolean z) {
            this.f23143c = z;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            if (!this.f23143c) {
                m31588a();
                if (this.f23142b.size() > 0) {
                    return null;
                }
            }
            try {
                JSONArray jSONArray = C5268b.m26272a().mo17327i().getJSONArray("items");
                m31589a(jSONArray);
                if (jSONArray != null) {
                    m31591b(jSONArray);
                }
                return "ok";
            } catch (IOException e) {
                m31588a();
                throw e;
            } catch (JSONException e2) {
                m31588a();
                throw e2;
            } catch (HttpResponseException e3) {
                m31588a();
                throw e3;
            } catch (SCApiException e4) {
                boolean z = false;
                try {
                    if (e4.getErrorCode() == 403 && e4.getErrorReason().equals("notEnoughPrivileges")) {
                        z = true;
                    }
                } catch (JSONException e5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("JSON parsing exception: ");
                    sb.append(e5.toString());
                    Log.e("PreviewerTemplatesFrg", sb.toString());
                }
                if (z) {
                    Log.w("PreviewerTemplatesFrg", "SCApi exception: not enough privileges");
                    return "notEnoughPrivileges";
                }
                m31588a();
                throw e4;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            C6521k.this.mo20292ay();
            m31590b();
            C6521k.this.mo20215m(false);
        }
    }

    /* renamed from: com.seattleclouds.previewer.k$d */
    private class C6534d extends C5270d<Void, Void, String> {

        /* renamed from: b */
        private Map<String, SCTemplateApp> f23147b = new HashMap();

        /* renamed from: c */
        private List<SCTemplateApp> f23148c = new ArrayList();

        /* renamed from: d */
        private boolean f23149d = true;

        public C6534d(Fragment fragment) {
            super(fragment);
        }

        /* renamed from: a */
        private void m31596a() {
            if (C6521k.this.f23127h.size() <= 0) {
                try {
                    m31598a(new JSONArray(C6730b.m32452a(C6521k.this.m31546as(), "UTF-8")));
                } catch (IOException | JSONException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m31597a(List<SCTemplateApp> list, Map<String, SCTemplateApp> map) {
            C6521k.this.f23126g = list;
            C6521k.this.f23127h = new ArrayList(C6521k.this.f23126g);
            C6521k.this.f23116ak = "";
            C6521k.this.f23117al = 0;
            C6521k.this.f23119an.clear();
        }

        /* renamed from: a */
        private void m31598a(JSONArray jSONArray) {
            for (int i = 0; i < jSONArray.length(); i++) {
                SCTemplateApp sCTemplateApp = new SCTemplateApp(jSONArray.getJSONObject(i));
                this.f23148c.add(sCTemplateApp);
                this.f23147b.put(sCTemplateApp.mo20134a(), sCTemplateApp);
            }
        }

        /* renamed from: b */
        private void m31599b(final JSONArray jSONArray) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        C6730b.m32458a(C6521k.this.m31546as(), jSONArray.toString(), "UTF-8");
                    } catch (IOException unused) {
                    }
                }
            }).start();
        }

        /* renamed from: a */
        public C6534d mo20232a(boolean z) {
            this.f23149d = z;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            if (!this.f23149d) {
                m31596a();
                if (this.f23148c.size() > 0) {
                    return null;
                }
            }
            C6521k.this.mo1318s().runOnUiThread(new Runnable() {
                public void run() {
                    C6521k.this.mo20215m(true);
                }
            });
            try {
                JSONArray jSONArray = C5268b.m26272a().mo17319e(App.f18523y).getJSONArray("items");
                m31598a(jSONArray);
                if (jSONArray != null) {
                    m31599b(jSONArray);
                }
                return "ok";
            } catch (IOException e) {
                m31596a();
                throw e;
            } catch (JSONException e2) {
                m31596a();
                throw e2;
            } catch (HttpResponseException e3) {
                m31596a();
                throw e3;
            } catch (SCApiException e4) {
                boolean z = false;
                try {
                    if (e4.getErrorCode() == 403 && e4.getErrorReason().equals("notEnoughPrivileges")) {
                        z = true;
                    }
                } catch (JSONException e5) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("JSON parsing exception: ");
                    sb.append(e5.toString());
                    Log.e("PreviewerTemplatesFrg", sb.toString());
                }
                if (z) {
                    Log.w("PreviewerTemplatesFrg", "SCApi exception: not enough privileges");
                    return "notEnoughPrivileges";
                }
                m31596a();
                throw e4;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            C6521k.this.f23123d.setEmptyView(C6521k.this.f23125f);
            if (str != null) {
                if (!str.equals("notEnoughPrivileges")) {
                    m31597a(this.f23148c, this.f23147b);
                    C6521k.this.f23110ae.mo20240a(false);
                    C6521k.this.f23111af.mo8583g();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            if (C6521k.this.f23110ae != null) {
                                C6521k.this.f23110ae.mo20240a(true);
                            }
                        }
                    }, 500);
                }
            } else if (C6521k.this.f23127h.size() == 0) {
                m31597a(this.f23148c, this.f23147b);
                C6521k.this.f23110ae.notifyDataSetChanged();
            }
            new C6532c(C6521k.this).mo20227a(this.f23149d).execute(new Void[0]);
        }
    }

    /* renamed from: com.seattleclouds.previewer.k$e */
    private class C6538e extends BaseAdapter {

        /* renamed from: b */
        private Context f23155b;

        /* renamed from: c */
        private LayoutInflater f23156c;

        /* renamed from: d */
        private boolean f23157d = true;

        public C6538e(Context context) {
            mo20239a(context);
        }

        /* renamed from: a */
        public void mo20239a(Context context) {
            this.f23155b = context;
            this.f23156c = LayoutInflater.from(this.f23155b);
        }

        /* renamed from: a */
        public void mo20240a(boolean z) {
            this.f23157d = z;
            super.notifyDataSetChanged();
        }

        public int getCount() {
            return C6521k.this.f23127h.size();
        }

        public Object getItem(int i) {
            return C6521k.this.f23127h.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = this.f23156c.inflate(C5460i.grid_item_template_card, viewGroup, false);
            }
            C6539f fVar = (C6539f) view.getTag();
            if (fVar == null) {
                fVar = new C6539f(view);
                view.setTag(fVar);
            }
            SCTemplateApp sCTemplateApp = (SCTemplateApp) C6521k.this.f23127h.get(i);
            C6531b bVar = C6521k.this.f23119an.size() > 0 ? (C6531b) C6521k.this.f23119an.get(i) : null;
            if (bVar == null || bVar.mo20224a() != 2) {
                fVar.f23159b.setText(sCTemplateApp.mo20144e());
            } else {
                fVar.f23159b.setText(C6521k.this.m31540a(sCTemplateApp.mo20144e(), bVar.mo20225b(), bVar.mo20226c()));
            }
            if (this.f23157d) {
                C6521k.this.f23111af.mo8578a((Object) sCTemplateApp.mo20137b(), fVar.f23158a);
            } else {
                fVar.f23158a.setImageDrawable(null);
            }
            fVar.f23160c.setText(sCTemplateApp.mo20139c());
            return view;
        }

        public void notifyDataSetChanged() {
            mo20240a(true);
        }
    }

    /* renamed from: com.seattleclouds.previewer.k$f */
    static class C6539f {

        /* renamed from: a */
        ImageView f23158a;

        /* renamed from: b */
        TextView f23159b;

        /* renamed from: c */
        TextView f23160c;

        public C6539f(View view) {
            this.f23158a = (ImageView) view.findViewById(C5458g.template_icon);
            this.f23159b = (TextView) view.findViewById(C5458g.template_id);
            this.f23160c = (TextView) view.findViewById(C5458g.template_description);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Spanned m31540a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("<b>");
        sb.append(str.substring(i, i2));
        sb.append("</b>");
        sb.append(str.substring(i2));
        return Html.fromHtml(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31545a(String str, int i) {
        String str2;
        String trim = str == null ? "" : str.trim();
        String a = ((C6478b) this.f23128i.get(i)).mo20159a();
        if (!trim.equals(this.f23116ak) || this.f23117al != i) {
            if (trim.length() == 0 && i == 0) {
                this.f23127h = new ArrayList(this.f23126g);
                this.f23119an.clear();
                m31550b(trim, i);
            }
            Pattern pattern = null;
            if (trim.length() > 0) {
                if (trim.length() < 3) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\\b");
                    sb.append(trim);
                    str2 = sb.toString();
                } else {
                    str2 = trim;
                }
                pattern = Pattern.compile(str2, 2);
            }
            this.f23127h.clear();
            this.f23119an.clear();
            for (SCTemplateApp sCTemplateApp : this.f23126g) {
                if (a == "" || sCTemplateApp.mo20141d().equals(a) || sCTemplateApp.mo20141d().equals("")) {
                    if (pattern != null) {
                        Matcher matcher = pattern.matcher(sCTemplateApp.mo20144e());
                        if (matcher.find()) {
                            this.f23127h.add(sCTemplateApp);
                            this.f23119an.add(new C6531b(2, matcher.start(), matcher.end()));
                        }
                    } else {
                        this.f23127h.add(sCTemplateApp);
                        this.f23119an.add(new C6531b(0, 0, 0));
                    }
                }
            }
            m31550b(trim, i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: as */
    public File m31546as() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25666n());
        sb.append("/_previewer/templatesList/cache.json");
        return new File(sb.toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public File m31547at() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25666n());
        sb.append("/_previewer/templatesLanguagesList/cache.json");
        return new File(sb.toString());
    }

    /* renamed from: b */
    private void m31550b(String str, int i) {
        this.f23116ak = str;
        this.f23117al = i;
        this.f23110ae.notifyDataSetChanged();
    }

    /* renamed from: e */
    private String[] m31555e() {
        ArrayList arrayList = new ArrayList();
        for (C6478b b : this.f23128i) {
            arrayList.add(b.mo20160b());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: n */
    private void m31565n(boolean z) {
        this.f23121b = false;
        new C6534d(this).mo20232a(z).execute(new Void[0]);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f23121b) {
            m31565n(false);
        } else if (this.f23110ae != null) {
            this.f23110ae.notifyDataSetChanged();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f23114ai != null) {
            this.f23115aj = this.f23114ai.mo4613c();
        }
        if (this.f23111af != null) {
            this.f23111af.mo8581b(false);
            this.f23111af.mo8584h();
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        if (this.f23111af != null) {
            this.f23111af.mo8585i();
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f23122c = layoutInflater.inflate(C5460i.fragment_previewer_templates, viewGroup, false);
        this.f23125f = this.f23122c.findViewById(16908292);
        this.f23124e = (MultiSwipeRefreshLayout) this.f23122c.findViewById(C5458g.swipe_refresh);
        C5338d o = ((C6348n) mo1318s()).mo19778o();
        this.f23124e.setColorSchemeColors(o.mo17546c(mo1318s()));
        this.f23124e.setSwipeableChildren(C5458g.grid, 16908292);
        this.f23124e.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C6521k.this.mo1450b();
            }
        });
        this.f23123d = (GridView) this.f23122c.findViewById(C5458g.grid);
        this.f23123d.setAdapter(this.f23110ae);
        this.f23123d.setOnItemClickListener(this);
        this.f23123d.setOnScrollListener(new OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                C6521k.this.f23111af.mo8581b(i == 2);
            }
        });
        C65243 r5 = new OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C6521k.this.f23114ai != null) {
                    C6521k.this.f23114ai.clearFocus();
                }
                return false;
            }
        };
        this.f23123d.setOnTouchListener(r5);
        this.f23125f.setOnTouchListener(r5);
        return this.f23122c;
    }

    /* renamed from: a */
    public void mo1226a(Activity activity) {
        super.mo1226a(activity);
        if (this.f23110ae != null) {
            this.f23110ae.mo20239a((Context) activity);
        }
        try {
            this.f23120ao = (C6530a) activity;
            activity.getWindow().setSoftInputMode(16);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.toString());
            sb.append(" must implement PreviewTemplatesFragment.Listener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        mo1280d(true);
        this.f23112ag = C6619m.m32014a(mo1318s(), 280.0f);
        this.f23113ah = C6619m.m32014a(mo1318s(), 8.0f);
        this.f23110ae = new C6538e(mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "previewer/templateIcons");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        this.f23111af = new C2422c(mo1318s(), f23109a, false);
        this.f23111af.mo8576a(mo1318s().mo1469g(), aVar);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        super.mo1239a(menu);
        MenuItem findItem = menu.findItem(C5458g.filter);
        boolean z = true;
        if (this.f23128i.size() <= 1 && this.f23128i.size() != 0) {
            z = false;
        }
        findItem.setVisible(z);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        if (App.f18511m && !PreviewerTemplatesActivity.f22578n) {
            MenuItem findItem = menu.findItem(C5458g.filter);
            if (findItem != null) {
                findItem.setIcon(C5457f.ic_action_language_white_alpha);
            }
        } else {
            menuInflater.inflate(C5461j.previewer_templates, menu);
        }
        menu.findItem(C5458g.search).setActionView(mo1453c());
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.refresh) {
            mo1450b();
            return true;
        } else if (itemId != C5458g.filter) {
            return super.mo1245a(menuItem);
        } else {
            mo20214d();
            return true;
        }
    }

    /* renamed from: b */
    public void mo1450b() {
        m31565n(true);
    }

    /* renamed from: c */
    public View mo1453c() {
        this.f23114ai = new SearchView(((C6348n) mo1318s()).mo3083i().mo3005e());
        this.f23114ai.setQueryHint(mo1219a(C5462k.previewer_templates_search_hint));
        this.f23114ai.mo4608a((CharSequence) this.f23116ak, false);
        this.f23114ai.setFocusable(false);
        this.f23114ai.setMaxWidth(C6619m.m32022d(mo1318s()));
        this.f23114ai.setOnQueryTextListener(new C0973c() {
            /* renamed from: a */
            public boolean mo4687a(String str) {
                C6521k.this.f23114ai.clearFocus();
                return false;
            }

            /* renamed from: a_ */
            public boolean mo4688a_(String str) {
                C6521k.this.m31545a(str, C6521k.this.f23117al);
                return false;
            }
        });
        this.f23114ai.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (!z && C6521k.this.f23114ai.getQuery().toString().trim().length() == 0) {
                    C6521k.this.f23114ai.setIconified(true);
                }
            }
        });
        if (!this.f23115aj) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    C6521k.this.f23114ai.setIconified(false);
                    C6521k.this.f23114ai.clearFocus();
                }
            }, 10);
        }
        return this.f23114ai;
    }

    /* renamed from: d */
    public void mo20214d() {
        if (this.f23128i.size() == 0) {
            C6595ao.m31928a((Context) mo1318s(), mo1219a(C5462k.previewer_templates_empty_language_filter_message));
            return;
        }
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3057a((CharSequence[]) m31555e(), this.f23117al, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C6521k.this.m31545a(C6521k.this.f23116ak, i);
                if (C6521k.this.f23118am != null) {
                    C6521k.this.f23118am.dismiss();
                    C6521k.this.f23118am = null;
                }
            }
        }).mo3047a(C5462k.previewer_templates_filter_by_language);
        this.f23118am = aVar.mo3065b();
        this.f23118am.show();
    }

    /* renamed from: f */
    public void mo1285f() {
        super.mo1285f();
        this.f23120ao = null;
    }

    /* renamed from: m */
    public void mo20215m(boolean z) {
        if (z) {
            if (this.f23114ai != null && !this.f23114ai.mo4613c()) {
                this.f23114ai.mo4608a((CharSequence) "", false);
                this.f23114ai.setIconified(true);
            }
            if (this.f23127h.size() == 0) {
                this.f23125f.setVisibility(8);
            }
            if (!this.f23124e.mo2727b()) {
                this.f23124e.post(new Runnable() {
                    public void run() {
                        C6521k.this.f23124e.setRefreshing(true);
                    }
                });
                return;
            }
            return;
        }
        this.f23124e.setRefreshing(false);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.f23120ao != null) {
            this.f23120ao.mo19807b((SCTemplateApp) this.f23127h.get(i));
        }
    }
}
