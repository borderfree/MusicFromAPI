package com.seattleclouds.modules.search;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.C0367h;
import android.support.p009v4.app.Fragment;
import android.support.p023v7.widget.SearchView;
import android.support.p023v7.widget.SearchView.C0973c;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6348n;
import com.seattleclouds.C6671x;
import com.seattleclouds.util.C6600as;
import com.seattleclouds.util.C6603au;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.seattleclouds.modules.search.a */
public class C6277a extends C6671x implements C0973c {

    /* renamed from: ae */
    private ArrayAdapter<String> f22273ae;

    /* renamed from: af */
    private SearchView f22274af;

    /* renamed from: ag */
    private boolean f22275ag = true;

    /* renamed from: ah */
    private boolean f22276ah = true;

    /* renamed from: ai */
    private String f22277ai = "";

    /* renamed from: i */
    private String f22278i;

    /* renamed from: as */
    private InputMethodManager m30507as() {
        C0367h s = mo1318s();
        if (s != null) {
            return (InputMethodManager) s.getSystemService("input_method");
        }
        return null;
    }

    /* renamed from: at */
    private View m30508at() {
        this.f22274af = new SearchView(((C6348n) mo1318s()).mo3083i().mo3005e());
        this.f22274af.setQueryHint(mo1219a(C5462k.search_content_hint));
        this.f22274af.setOnQueryTextListener(this);
        if (C6619m.m32024f(mo1318s())) {
            this.f22274af.setIconifiedByDefault(false);
        } else {
            this.f22274af.setIconifiedByDefault(true);
            this.f22274af.setIconified(false);
        }
        if (this.f22275ag) {
            this.f22274af.requestFocus();
        }
        if (mo1318s() instanceof SearchActivity) {
            this.f22274af.setSearchableInfo(((SearchManager) mo1318s().getSystemService("search")).getSearchableInfo(mo1318s().getComponentName()));
        }
        this.f22274af.mo4608a((CharSequence) this.f22277ai, true);
        return this.f22274af;
    }

    /* renamed from: d */
    private Set<String> m30509d(String str) {
        StringBuilder sb;
        String str2;
        HashSet hashSet = new HashSet(Arrays.asList(str.toLowerCase(Locale.getDefault()).trim().split("[ ]+")));
        TreeSet treeSet = new TreeSet();
        if (hashSet.isEmpty()) {
            return treeSet;
        }
        String str3 = "";
        String str4 = "";
        boolean z = false;
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            Set set = null;
            newPullParser.setInput(App.m25639c(this.f22278i), null);
            for (int eventType = newPullParser.getEventType(); eventType != 1 && !z; eventType = newPullParser.next()) {
                if (eventType != 0) {
                    switch (eventType) {
                        case 2:
                            String name = newPullParser.getName();
                            if (!name.equalsIgnoreCase("key")) {
                                if (name.equalsIgnoreCase("array")) {
                                    if (hashSet.contains(str3)) {
                                        hashSet.remove(str3);
                                        set = new HashSet();
                                        break;
                                    } else {
                                        C6603au.m31952a(newPullParser);
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 3:
                            String name2 = newPullParser.getName();
                            if (!name2.equalsIgnoreCase("key")) {
                                if (!name2.equalsIgnoreCase("array")) {
                                    if (!name2.equalsIgnoreCase("string")) {
                                        break;
                                    } else {
                                        set.add(str4);
                                        break;
                                    }
                                } else {
                                    if (treeSet.size() == 0) {
                                        treeSet.addAll(set);
                                    } else {
                                        treeSet.retainAll(set);
                                    }
                                    if (!hashSet.isEmpty()) {
                                        break;
                                    } else {
                                        z = true;
                                        break;
                                    }
                                }
                            } else {
                                str3 = str4;
                                break;
                            }
                        case 4:
                            str4 = newPullParser.getText();
                            break;
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e = e;
            str2 = "SearchFragment";
            sb = new StringBuilder();
            sb.append("doSearch: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
        } catch (FileNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("doSearch: ");
            sb2.append(e2);
            Log.e("SearchFragment", sb2.toString(), e2);
            C6620n.m32028a((Context) mo1318s(), C5462k.error, C5462k.search_error_index_file_not_found);
        } catch (IOException e3) {
            e = e3;
            str2 = "SearchFragment";
            sb = new StringBuilder();
            sb.append("doSearch: ");
            sb.append(e);
            Log.e(str2, sb.toString(), e);
        }
        if (!z) {
            treeSet.clear();
        }
        return treeSet;
    }

    /* renamed from: e */
    private void m30510e() {
        InputMethodManager as = m30507as();
        if (as != null) {
            as.toggleSoftInput(2, 0);
        }
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C5460i.search, viewGroup, false);
        Bundle m = mo1307m();
        if (m != null) {
            this.f22278i = m.getString("ARG_INDEX_FILE_NAME");
        }
        if (this.f22278i == null || this.f22278i.trim().length() == 0) {
            this.f22278i = "indexpage.plist";
        }
        if (bundle != null) {
            this.f22275ag = bundle.getBoolean("STATE_FOCUS_SEARCH_VIEW");
            this.f22276ah = bundle.getBoolean("STATE_FIRST_ACTIVATION");
            this.f22277ai = bundle.getString("STATE_QUERY");
        }
        return inflate;
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        MenuItem add = menu.add(C5462k.common_search);
        add.setIcon(17301583);
        add.setShowAsAction(2);
        add.setActionView(m30508at());
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        ((TextView) view.findViewById(16908292)).setVisibility(8);
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        super.mo1692a(listView, view, i, j);
        this.f22275ag = false;
        C6600as.m31944a((Activity) mo1318s(), (View) this.f22274af);
        App.m25622a((String) this.f22273ae.getItem(i), (Fragment) this);
    }

    /* renamed from: a */
    public void mo17454a(boolean z) {
        super.mo17454a(z);
        if (z && this.f22276ah) {
            this.f22276ah = false;
            m30510e();
        }
    }

    /* renamed from: a */
    public boolean mo4687a(String str) {
        C6600as.m31944a((Activity) mo1318s(), (View) this.f22274af);
        mo19634c(str);
        this.f22277ai = str;
        return true;
    }

    /* renamed from: a_ */
    public boolean mo4688a_(String str) {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo19634c(String str) {
        this.f22274af.mo4608a((CharSequence) str, false);
        Set d = m30509d(str);
        this.f22273ae = new ArrayAdapter<>(mo1318s(), 17367043, d.toArray(new String[d.size()]));
        mo1691a((ListAdapter) this.f22273ae);
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putBoolean("STATE_FOCUS_SEARCH_VIEW", this.f22275ag);
        bundle.putBoolean("STATE_FIRST_ACTIVATION", this.f22276ah);
        bundle.putString("STATE_QUERY", this.f22277ai);
        super.mo1282e(bundle);
    }
}
