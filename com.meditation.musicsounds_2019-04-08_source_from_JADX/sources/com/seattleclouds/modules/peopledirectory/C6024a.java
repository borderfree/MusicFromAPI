package com.seattleclouds.modules.peopledirectory;

import android.os.Bundle;
import android.os.Handler;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.modules.peopledirectory.C6032c.C6035a;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6619m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.seattleclouds.modules.peopledirectory.a */
public class C6024a extends C6671x implements C6035a {
    /* access modifiers changed from: private */

    /* renamed from: ae */
    public ArrayList<ListItem> f21413ae;

    /* renamed from: af */
    private ListView f21414af;

    /* renamed from: ag */
    private C6032c f21415ag;

    /* renamed from: ah */
    private String f21416ah;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public C6031b f21417ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public SearchView f21418aj;
    /* access modifiers changed from: private */

    /* renamed from: ak */
    public String f21419ak = "";

    /* renamed from: al */
    private int f21420al = -1;
    /* access modifiers changed from: private */

    /* renamed from: am */
    public BaseAdapter f21421am = new BaseAdapter() {
        /* renamed from: a */
        public ListItem getItem(int i) {
            return (ListItem) (C6024a.this.f21413ae != null ? C6024a.this.f21413ae : C6024a.this.f21422i).get(i);
        }

        public int getCount() {
            if (C6024a.this.f21413ae != null) {
                return C6024a.this.f21413ae.size();
            }
            return C6024a.this.f21422i != null ? C6024a.this.f21422i.size() : 0;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public int getItemViewType(int i) {
            if (C6024a.this.f21413ae != null) {
                return 1;
            }
            return getItem(i).f21401a;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C6030a aVar;
            CharSequence charSequence;
            if (view == null) {
                LayoutInflater i2 = C6024a.this.mo1295i((Bundle) null);
                if (getItemViewType(i) != 1) {
                    view = i2.inflate(C5460i.people_directory_list_section, viewGroup, false);
                    aVar = new C6030a();
                    aVar.f21429b = (TextView) view.findViewById(C5458g.textView);
                } else {
                    view = i2.inflate(C5460i.people_directory_list_item, viewGroup, false);
                    aVar = new C6030a();
                    aVar.f21428a = (TextView) view.findViewById(C5458g.textView);
                    aVar.f21429b = (TextView) view.findViewById(C5458g.titleTextView);
                    aVar.f21430c = (ImageView) view.findViewById(C5458g.imageView);
                }
                view.setTag(aVar);
            } else {
                aVar = (C6030a) view.getTag();
            }
            ListItem a = getItem(i);
            if (a.f21401a == 1) {
                Person person = a.f21402b;
                if (C6592al.m31910c(person.f21404a) || C6592al.m31910c(person.f21405b)) {
                    charSequence = !C6592al.m31910c(person.f21404a) ? person.f21404a : !C6592al.m31910c(person.f21405b) ? person.f21405b : null;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(person.f21404a);
                    sb.append(" ");
                    sb.append(person.f21405b);
                    charSequence = sb.toString();
                }
                aVar.f21428a.setText(charSequence);
                aVar.f21429b.setText(person.f21406c);
                aVar.f21430c.setImageBitmap(null);
                if (!C6592al.m31910c(person.f21409f)) {
                    C6024a.this.f21417ai.mo8578a((Object) person.f21409f, aVar.f21430c);
                }
            } else {
                aVar.f21429b.setText(a.f21403c);
            }
            return view;
        }

        public int getViewTypeCount() {
            return 2;
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<ListItem> f21422i;

    /* renamed from: com.seattleclouds.modules.peopledirectory.a$a */
    private static class C6030a {

        /* renamed from: a */
        public TextView f21428a;

        /* renamed from: b */
        public TextView f21429b;

        /* renamed from: c */
        public ImageView f21430c;

        private C6030a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m29543c(String str) {
        String lowerCase = str.toLowerCase(Locale.getDefault());
        ArrayList<ListItem> arrayList = new ArrayList<>();
        Iterator it = this.f21422i.iterator();
        while (it.hasNext()) {
            ListItem listItem = (ListItem) it.next();
            if (listItem.f21401a != 0) {
                Person person = listItem.f21402b;
                if ((person.f21404a != null && person.f21404a.toLowerCase(Locale.getDefault()).contains(lowerCase)) || ((person.f21405b != null && person.f21405b.toLowerCase(Locale.getDefault()).contains(lowerCase)) || (person.f21406c != null && person.f21406c.toLowerCase(Locale.getDefault()).contains(lowerCase)))) {
                    arrayList.add(listItem);
                } else if (person.f21411h != null && person.f21411h.size() > 0) {
                    Iterator it2 = person.f21411h.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((String) it2.next()).contains(lowerCase)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
        }
        this.f21413ae = arrayList;
    }

    /* renamed from: L */
    public void mo1202L() {
        super.mo1202L();
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            String string = m.getString("PAGE_ID");
            if (string != null) {
                int lastIndexOf = string.lastIndexOf(46);
                if (lastIndexOf > 0) {
                    String substring = string.substring(0, lastIndexOf);
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append(".config.xml");
                    this.f21416ah = sb.toString();
                }
            }
        }
        if (bundle != null) {
            this.f21422i = bundle.getParcelableArrayList("STATE_LIST_ITEMS");
            this.f21413ae = bundle.getParcelableArrayList("STATE_SEARCH_LIST_ITEMS");
            this.f21419ak = bundle.getString("STATE_QUERY");
            this.f21420al = bundle.getInt("STATE_ERROR_STRING");
        }
        if (this.f21420al == -1 && this.f21416ah != null && this.f21422i == null) {
            this.f21415ag = new C6032c(this);
            this.f21415ag.execute(new String[]{this.f21416ah});
        }
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(C5461j.people_directory_menu, menu);
        MenuItem findItem = menu.findItem(C5458g.search);
        if (findItem != null) {
            findItem.setActionView(mo19041e());
        }
        super.mo1240a(menu, menuInflater);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        int i;
        super.mo1242a(view, bundle);
        this.f21414af = mo1450b();
        if (this.f21420al != -1) {
            mo1691a((ListAdapter) null);
            i = this.f21420al;
        } else {
            if (this.f21422i != null) {
                mo1691a((ListAdapter) this.f21421am);
                if (this.f21422i.size() == 0) {
                    i = C5462k.people_directory_no_results;
                }
            }
            this.f21417ai = C6031b.m29562a(mo1318s(), mo1318s().mo1469g(), C6619m.m32014a(mo1318s(), 50.0f));
        }
        mo1693a((CharSequence) mo1219a(i));
        this.f21417ai = C6031b.m29562a(mo1318s(), mo1318s().mo1469g(), C6619m.m32014a(mo1318s(), 50.0f));
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        super.mo1692a(listView, view, i, j);
        ListItem listItem = (ListItem) this.f21421am.getItem(i);
        if (listItem.f21401a != 0) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARG_PERSON", listItem.f21402b);
            App.m25620a(new FragmentInfo(C6036d.class.getName(), bundle), (Fragment) this);
        }
    }

    /* renamed from: a */
    public void mo19040a(ArrayList<ListItem> arrayList) {
        this.f21415ag = null;
        this.f21422i = arrayList;
        if (this.f21414af != null) {
            mo1691a((ListAdapter) this.f21421am);
        }
        if (this.f21422i.size() == 0) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    C6024a.this.mo1693a((CharSequence) C6024a.this.mo1219a(C5462k.people_directory_no_results));
                }
            }, 400);
        }
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (!z && this.f21417ai != null) {
            this.f21417ai.mo8584h();
        }
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() == C5458g.search) {
            return true;
        }
        return super.mo1245a(menuItem);
    }

    /* renamed from: e */
    public View mo19041e() {
        this.f21418aj = new SearchView(((C6348n) mo1318s()).mo3083i().mo3005e());
        this.f21418aj.mo4608a((CharSequence) this.f21419ak, false);
        this.f21418aj.setFocusable(false);
        this.f21418aj.setMaxWidth(C6619m.m32014a(mo1318s(), 330.0f));
        this.f21418aj.setOnQueryTextListener(new C0973c() {
            /* renamed from: a */
            public boolean mo4687a(String str) {
                C6024a.this.f21418aj.clearFocus();
                return false;
            }

            /* renamed from: a_ */
            public boolean mo4688a_(String str) {
                C6024a.this.f21419ak = str.trim();
                if (!C6592al.m31909b(C6024a.this.f21419ak)) {
                    C6024a.this.m29543c(str);
                } else {
                    C6024a.this.f21413ae = null;
                }
                C6024a.this.f21421am.notifyDataSetChanged();
                return false;
            }
        });
        if (!C6592al.m31909b(this.f21419ak)) {
            new Handler().postDelayed(new Runnable() {
                public void run() {
                    C6024a.this.f21418aj.setIconified(false);
                    C6024a.this.f21418aj.clearFocus();
                }
            }, 10);
        }
        this.f21418aj.setOnQueryTextFocusChangeListener(new OnFocusChangeListener() {
            public void onFocusChange(View view, boolean z) {
                if (!z && C6024a.this.f21418aj.getQuery().toString().trim().length() == 0) {
                    C6024a.this.f21418aj.setIconified(true);
                    C6024a.this.f21413ae = null;
                    C6024a.this.f21421am.notifyDataSetChanged();
                }
            }
        });
        return this.f21418aj;
    }

    /* renamed from: e */
    public void mo19042e(int i) {
        this.f21415ag = null;
        this.f21420al = i;
        this.f21422i = null;
        mo1691a((ListAdapter) null);
        mo1693a((CharSequence) mo1219a(i));
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putParcelableArrayList("STATE_LIST_ITEMS", this.f21422i);
        bundle.putParcelableArrayList("STATE_SEARCH_LIST_ITEMS", this.f21413ae);
        bundle.putString("STATE_QUERY", this.f21419ak);
        bundle.putInt("STATE_ERROR_STRING", this.f21420al);
        super.mo1282e(bundle);
    }

    /* renamed from: i */
    public void mo1296i() {
        super.mo1296i();
        if (this.f21417ai != null) {
            this.f21417ai.mo8585i();
            this.f21417ai = null;
        }
    }
}
