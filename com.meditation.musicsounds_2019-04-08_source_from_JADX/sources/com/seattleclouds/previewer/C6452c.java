package com.seattleclouds.previewer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
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
import com.seattleclouds.AppStarterActivity;
import com.seattleclouds.C5332e;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.api.C5268b;
import com.seattleclouds.api.C5270d;
import com.seattleclouds.api.HttpResponseException;
import com.seattleclouds.api.SCApiException;
import com.seattleclouds.p160e.C5338d;
import com.seattleclouds.util.C6574ac;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6629b;
import com.seattleclouds.util.C6640u;
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

/* renamed from: com.seattleclouds.previewer.c */
public class C6452c extends C5332e implements OnItemClickListener {

    /* renamed from: a */
    static Map<String, C6540l> f22933a = new HashMap();

    /* renamed from: b */
    static int f22934b = 144;
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public C6462a f22935ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C2422c f22936af;

    /* renamed from: ag */
    private int f22937ag;

    /* renamed from: ah */
    private int f22938ah;

    /* renamed from: ai */
    private int f22939ai = 0;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public SearchView f22940aj;

    /* renamed from: ak */
    private boolean f22941ak = true;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public String f22942al = "";
    /* access modifiers changed from: private */

    /* renamed from: am */
    public int f22943am = 0;

    /* renamed from: an */
    private String[] f22944an;
    /* access modifiers changed from: private */

    /* renamed from: ao */
    public C0765d f22945ao;
    /* access modifiers changed from: private */

    /* renamed from: ap */
    public List<C6464c> f22946ap = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: aq */
    public C6463b f22947aq;

    /* renamed from: c */
    private boolean f22948c = true;

    /* renamed from: d */
    private View f22949d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public GridView f22950e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MultiSwipeRefreshLayout f22951f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public View f22952g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<C6540l> f22953h = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C6540l> f22954i = new ArrayList();

    /* renamed from: com.seattleclouds.previewer.c$a */
    private class C6462a extends BaseAdapter {

        /* renamed from: b */
        private Context f22965b;

        /* renamed from: c */
        private LayoutInflater f22966c;

        /* renamed from: d */
        private boolean f22967d = true;

        public C6462a(Context context) {
            mo20107a(context);
        }

        /* renamed from: a */
        public void mo20107a(Context context) {
            this.f22965b = context;
            this.f22966c = LayoutInflater.from(this.f22965b);
        }

        /* renamed from: a */
        public void mo20108a(boolean z) {
            this.f22967d = z;
            super.notifyDataSetChanged();
        }

        public int getCount() {
            return C6452c.this.f22954i.size();
        }

        public Object getItem(int i) {
            return C6452c.this.f22954i.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        @SuppressLint({"InflateParams"})
        public View getView(int i, View view, ViewGroup viewGroup) {
            CharSequence charSequence;
            if (view == null) {
                view = this.f22966c.inflate(C5460i.view_app_card, null);
            }
            ImageView imageView = (ImageView) view.findViewById(C5458g.icon);
            TextView textView = (TextView) view.findViewById(C5458g.title);
            TextView textView2 = (TextView) view.findViewById(C5458g.f19435id);
            C6540l lVar = (C6540l) C6452c.this.f22954i.get(i);
            C6464c cVar = C6452c.this.f22946ap.size() > 0 ? (C6464c) C6452c.this.f22946ap.get(i) : null;
            textView.setText((cVar == null || cVar.mo20114a() != 1) ? lVar.mo20247b() : C6452c.this.m31259a(lVar.mo20247b(), cVar.mo20115b(), cVar.mo20116c()));
            if (cVar == null || cVar.mo20114a() != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(lVar.mo20246a());
                sb.append(" (");
                sb.append(lVar.mo20255e());
                sb.append(")");
                charSequence = sb.toString();
            } else {
                C6452c cVar2 = C6452c.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(lVar.mo20246a());
                sb2.append(" (");
                sb2.append(lVar.mo20255e());
                sb2.append(")");
                charSequence = cVar2.m31259a(sb2.toString(), cVar.mo20115b(), cVar.mo20116c());
            }
            textView2.setText(charSequence);
            if (this.f22967d) {
                C6452c.this.f22936af.mo8578a((Object) lVar.mo20251c(), imageView);
            } else {
                imageView.setImageDrawable(null);
            }
            return view;
        }

        public void notifyDataSetChanged() {
            mo20108a(true);
        }
    }

    /* renamed from: com.seattleclouds.previewer.c$b */
    public interface C6463b {
        /* renamed from: a */
        void mo19804a(String str);

        /* renamed from: r */
        void mo19805r();
    }

    /* renamed from: com.seattleclouds.previewer.c$c */
    private class C6464c {

        /* renamed from: b */
        private int f22969b;

        /* renamed from: c */
        private int f22970c;

        /* renamed from: d */
        private int f22971d;

        public C6464c(int i, int i2, int i3) {
            this.f22969b = i;
            this.f22970c = i2;
            this.f22971d = i3;
        }

        /* renamed from: a */
        public int mo20114a() {
            return this.f22969b;
        }

        /* renamed from: b */
        public int mo20115b() {
            return this.f22970c;
        }

        /* renamed from: c */
        public int mo20116c() {
            return this.f22971d;
        }
    }

    /* renamed from: com.seattleclouds.previewer.c$d */
    private class C6465d extends C5270d<Void, Void, String> {

        /* renamed from: b */
        private Map<String, C6540l> f22973b = new HashMap();

        /* renamed from: c */
        private List<C6540l> f22974c = new ArrayList();

        /* renamed from: d */
        private boolean f22975d = true;

        public C6465d(Fragment fragment) {
            super(fragment);
        }

        /* renamed from: a */
        private void m31311a() {
            if (C6452c.this.f22954i.size() <= 0) {
                try {
                    m31313a(new JSONArray(C6730b.m32452a(C6452c.m31266aA(), "UTF-8")));
                } catch (IOException | JSONException unused) {
                }
            }
        }

        /* renamed from: a */
        private void m31312a(List<C6540l> list, Map<String, C6540l> map) {
            C6452c.this.f22953h = list;
            C6452c.this.f22954i = new ArrayList(C6452c.this.f22953h);
            C6452c.f22933a = map;
            C6452c.this.f22942al = "";
            C6452c.this.f22943am = 0;
            C6452c.this.f22946ap.clear();
        }

        /* renamed from: a */
        private void m31313a(JSONArray jSONArray) {
            for (int i = 0; i < jSONArray.length(); i++) {
                C6540l lVar = new C6540l(jSONArray.getJSONObject(i));
                this.f22974c.add(lVar);
                this.f22973b.put(lVar.mo20246a(), lVar);
            }
        }

        /* renamed from: b */
        private void m31314b(final JSONArray jSONArray) {
            new Thread(new Runnable() {
                public void run() {
                    try {
                        C6730b.m32458a(C6452c.m31266aA(), jSONArray.toString(), "UTF-8");
                    } catch (IOException unused) {
                    }
                }
            }).start();
        }

        /* renamed from: a */
        public C6465d mo20117a(boolean z) {
            this.f22975d = z;
            return this;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String mo17335a(Void... voidArr) {
            if (!this.f22975d) {
                m31311a();
                if (this.f22974c.size() > 0) {
                    return null;
                }
            }
            if (C6452c.this.mo1318s() != null) {
                C6452c.this.mo1318s().runOnUiThread(new Runnable() {
                    public void run() {
                        C6452c.this.mo20098m(true);
                    }
                });
            }
            try {
                JSONArray jSONArray = C5268b.m26272a().mo17316d(App.f18523y).getJSONArray("items");
                m31313a(jSONArray);
                if (jSONArray != null) {
                    m31314b(jSONArray);
                }
                return "ok";
            } catch (IOException e) {
                m31311a();
                throw e;
            } catch (JSONException e2) {
                m31311a();
                throw e2;
            } catch (HttpResponseException e3) {
                m31311a();
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
                    Log.e("PreviewerAppsFragment", sb.toString());
                }
                if (z) {
                    Log.w("PreviewerAppsFragment", "SCApi exception: not enough privileges");
                    return "notEnoughPrivileges";
                }
                m31311a();
                throw e4;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(String str) {
            C6452c.this.f22950e.setEmptyView(C6452c.this.f22952g);
            if (str != null) {
                if (str.equals("notEnoughPrivileges")) {
                    C6452c.this.f22947aq.mo19805r();
                } else {
                    m31312a(this.f22974c, this.f22973b);
                    C6452c.this.f22935ae.mo20108a(false);
                    C6452c.this.f22936af.mo8583g();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            if (C6452c.this.f22935ae != null) {
                                C6452c.this.f22935ae.mo20108a(true);
                            }
                        }
                    }, 500);
                }
            } else if (C6452c.this.f22954i.size() == 0) {
                m31312a(this.f22974c, this.f22973b);
                C6452c.this.f22935ae.notifyDataSetChanged();
            }
            C6452c.this.mo20098m(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Spanned m31259a(String str, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, i));
        sb.append("<b>");
        sb.append(str.substring(i, i2));
        sb.append("</b>");
        sb.append(str.substring(i2));
        return Html.fromHtml(sb.toString());
    }

    /* renamed from: a */
    static void m31263a(Activity activity, String str) {
        App.f18524z = str;
        C6640u.m32090b();
        C6574ac.m31815a(activity).mo20546a();
        AppStarterActivity.m25705c(activity);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m31265a(String str, int i) {
        List<C6464c> list;
        C6464c cVar;
        String str2;
        String trim = str == null ? "" : str.trim();
        if (!trim.equals(this.f22942al) || i != this.f22943am) {
            if (trim.length() == 0 && i == 0) {
                this.f22954i = new ArrayList(this.f22953h);
                this.f22946ap.clear();
                m31270b(trim, i);
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
            this.f22954i.clear();
            this.f22946ap.clear();
            for (C6540l lVar : this.f22953h) {
                if (i == 0 || lVar.mo20253d() == i) {
                    if (pattern != null) {
                        Matcher matcher = pattern.matcher(lVar.mo20247b());
                        if (matcher.find()) {
                            this.f22954i.add(lVar);
                            list = this.f22946ap;
                            cVar = new C6464c(1, matcher.start(), matcher.end());
                        } else {
                            Matcher matcher2 = pattern.matcher(lVar.mo20246a());
                            if (matcher2.find()) {
                                this.f22954i.add(lVar);
                                list = this.f22946ap;
                                cVar = new C6464c(2, matcher2.start(), matcher2.end());
                            }
                        }
                        list.add(cVar);
                    } else {
                        this.f22954i.add(lVar);
                        this.f22946ap.add(new C6464c(0, 0, 0));
                    }
                }
            }
            m31270b(trim, i);
        }
    }

    /* renamed from: aA */
    public static File m31266aA() {
        StringBuilder sb = new StringBuilder();
        sb.append(App.m25666n());
        sb.append("/_previewer/appList/cache.json");
        return new File(sb.toString());
    }

    /* renamed from: b */
    static void m31269b(Activity activity, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Tx7EcUcOd70UeXxV0b0L_");
        sb.append(str);
        App.f18524z = sb.toString();
        C6640u.m32090b();
        C6574ac.m31815a(activity).mo20546a();
        AppStarterActivity.m25693a(activity, str);
    }

    /* renamed from: b */
    private void m31270b(String str, int i) {
        this.f22942al = str;
        this.f22943am = i;
        this.f22935ae.notifyDataSetChanged();
    }

    /* renamed from: n */
    private void m31282n(boolean z) {
        this.f22948c = false;
        new C6465d(this).mo20117a(z).execute(new Void[0]);
    }

    /* renamed from: J */
    public void mo1200J() {
        super.mo1200J();
        if (this.f22948c) {
            m31282n(false);
        } else if (this.f22935ae != null) {
            this.f22935ae.notifyDataSetChanged();
        }
    }

    /* renamed from: K */
    public void mo1201K() {
        super.mo1201K();
        if (this.f22940aj != null) {
            this.f22941ak = this.f22940aj.mo4613c();
        }
        if (this.f22936af != null) {
            this.f22936af.mo8581b(false);
            this.f22936af.mo8584h();
        }
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
        if (this.f22936af != null) {
            this.f22936af.mo8585i();
        }
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            m31282n(true);
        } else {
            super.mo1222a(i, i2, intent);
        }
    }

    /* renamed from: a */
    public void mo1226a(Activity activity) {
        super.mo1226a(activity);
        if (this.f22935ae != null) {
            this.f22935ae.mo20107a((Context) activity);
        }
        try {
            this.f22947aq = (C6463b) activity;
            activity.getWindow().setSoftInputMode(16);
        } catch (ClassCastException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append(activity.toString());
            sb.append(" must implement PreviewerAppsFragment.Listener");
            throw new ClassCastException(sb.toString());
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        this.f22937ag = C6619m.m32014a(mo1318s(), 280.0f);
        this.f22938ah = C6619m.m32014a(mo1318s(), 8.0f);
        this.f22935ae = new C6462a(mo1318s());
        C2420a aVar = new C2420a(mo1318s(), "previewer/appIcons");
        aVar.f7706g = true;
        aVar.f7703d = CompressFormat.PNG;
        aVar.mo8566a(0.05f);
        this.f22936af = new C2422c(mo1318s(), f22934b, false);
        this.f22936af.mo8576a(mo1318s().mo1469g(), aVar);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        if (!App.f18511m) {
            menuInflater.inflate(C5461j.previewer_apps, menu);
            menu.findItem(C5458g.log_in_as).setVisible(App.f18485R);
            menu.findItem(C5458g.templates).setVisible(!C5268b.m26272a().mo17318d());
        }
        menu.findItem(C5458g.search).setActionView(mo20094at());
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        this.f22949d = view;
        this.f22952g = this.f22949d.findViewById(16908292);
        this.f22951f = (MultiSwipeRefreshLayout) this.f22949d.findViewById(C5458g.swipe_refresh);
        C5338d o = ((C6348n) mo1318s()).mo19778o();
        this.f22951f.setColorSchemeColors(o.mo17546c(mo1318s()));
        this.f22951f.setSwipeableChildren(C5458g.grid, 16908292);
        this.f22951f.setOnRefreshListener(new C0674b() {
            /* renamed from: a */
            public void mo2774a() {
                C6452c.this.mo20093as();
            }
        });
        this.f22950e = (GridView) this.f22949d.findViewById(C5458g.grid);
        this.f22950e.setAdapter(this.f22935ae);
        this.f22950e.setOnItemClickListener(this);
        this.f22950e.setOnScrollListener(new OnScrollListener() {
            public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            }

            public void onScrollStateChanged(AbsListView absListView, int i) {
                C6452c.this.f22936af.mo8581b(i == 2);
            }
        });
        C64553 r5 = new OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (C6452c.this.f22940aj != null) {
                    C6452c.this.f22940aj.clearFocus();
                }
                return false;
            }
        };
        this.f22950e.setOnTouchListener(r5);
        this.f22952g.setOnTouchListener(r5);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.refresh) {
            mo20093as();
            return true;
        } else if (itemId == C5458g.templates) {
            startActivityForResult(PreviewerTemplatesActivity.m30893a((Context) mo1318s()), 1001);
            return true;
        } else if (itemId == C5458g.log_out && !App.f18511m) {
            this.f22947aq.mo19805r();
            return true;
        } else if (itemId == C5458g.log_in_as && !App.f18511m) {
            C6620n.m32043a((Context) mo1318s(), "Log in as user:", (String) null, true, App.f18523y, "Log in", (C6629b) new C6629b() {
                /* renamed from: a */
                public void mo18346a() {
                }

                /* renamed from: a */
                public void mo18347a(String str) {
                    if (!str.equals("")) {
                        C6452c.this.f22947aq.mo19804a(str.trim());
                        C6452c.this.mo20097e();
                    }
                }
            });
            return true;
        } else if (itemId != C5458g.filter) {
            return super.mo1245a(menuItem);
        } else {
            mo20095az();
            return true;
        }
    }

    /* renamed from: as */
    public void mo20093as() {
        m31282n(true);
    }

    /* renamed from: at */
    public View mo20094at() {
        this.f22940aj = new SearchView(((C6348n) mo1318s()).mo3083i().mo3005e());
        this.f22940aj.setQueryHint(mo1219a(C5462k.previewer_search_hint));
        this.f22940aj.mo4608a((CharSequence) this.f22942al, false);
        this.f22940aj.setFocusable(false);
        this.f22940aj.setMaxWidth(C6619m.m32022d(mo1318s()));
        this.f22940aj.setOnQueryTextListener(new C0973c() {
            /* renamed from: a */
            public boolean mo4687a(String str) {
                C6452c.this.f22940aj.clearFocus();
                return false;
            }

            /* renamed from: a_ */
            public boolean mo4688a_(String str) {
                C6452c.this.m31265a(str, C6452c.this.f22943am);
                return false;
            }
        });
        this.f22940aj.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (!z && C6452c.this.f22940aj.getQuery().toString().trim().length() == 0) {
                    C6452c.this.f22940aj.setIconified(true);
                }
            }
        });
        if (!this.f22941ak) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    C6452c.this.f22940aj.setIconified(false);
                    C6452c.this.f22940aj.clearFocus();
                }
            }, 10);
        }
        return this.f22940aj;
    }

    /* renamed from: az */
    public void mo20095az() {
        if (this.f22944an == null) {
            this.f22944an = new String[6];
            this.f22944an[0] = mo1219a(C5462k.previewer_filter_platform_any);
            for (int i = 1; i < 6; i++) {
                this.f22944an[i] = C6540l.m31607a(i);
            }
        }
        C0766a aVar = new C0766a(mo1318s());
        aVar.mo3057a((CharSequence[]) this.f22944an, this.f22943am, (OnClickListener) new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                C6452c.this.m31265a(C6452c.this.f22942al, i);
                if (C6452c.this.f22945ao != null) {
                    C6452c.this.f22945ao.dismiss();
                    C6452c.this.f22945ao = null;
                }
            }
        }).mo3047a(C5462k.previewer_filter_by_platform);
        this.f22945ao = aVar.mo3065b();
        this.f22945ao.show();
    }

    /* renamed from: b */
    public int mo1450b() {
        return C5460i.fragment_previewer_apps;
    }

    /* renamed from: d */
    public void mo20096d() {
        C6730b.m32467d(m31266aA());
        this.f22936af.mo8583g();
    }

    /* renamed from: e */
    public void mo20097e() {
        this.f22953h.clear();
        this.f22954i.clear();
        f22933a.clear();
        this.f22946ap.clear();
        this.f22942al = "";
        this.f22943am = 0;
        mo20093as();
    }

    /* renamed from: m */
    public void mo20098m(boolean z) {
        if (z) {
            if (this.f22940aj != null && !this.f22940aj.mo4613c()) {
                this.f22940aj.mo4608a((CharSequence) "", false);
                this.f22940aj.setIconified(true);
            }
            if (this.f22954i.size() == 0) {
                this.f22952g.setVisibility(8);
            }
            if (!this.f22951f.mo2727b()) {
                this.f22951f.post(new Runnable() {
                    public void run() {
                        C6452c.this.f22951f.setRefreshing(true);
                    }
                });
                return;
            }
            return;
        }
        this.f22951f.setRefreshing(false);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent c = PreviewerOneFragmentActivity.m30891c(mo1318s(), C6448b.class);
        c.putExtra("ARG_APP_ID", ((C6540l) this.f22954i.get(i)).mo20246a());
        mo1230a(c);
    }
}
