package com.seattleclouds.modules.goaltracker;

import android.content.Context;
import android.os.Bundle;
import android.support.p009v4.app.Fragment;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.TextView;
import com.seattleclouds.App;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: com.seattleclouds.modules.goaltracker.e */
public class C5717e extends C6671x {

    /* renamed from: ae */
    private SimpleAdapter f20301ae;

    /* renamed from: af */
    private C5694a f20302af;

    /* renamed from: ag */
    private String f20303ag;
    /* access modifiers changed from: private */

    /* renamed from: ah */
    public Bundle f20304ah;

    /* renamed from: ai */
    private String f20305ai;

    /* renamed from: i */
    private ArrayList<HashMap<String, String>> f20306i = new ArrayList<>();

    /* renamed from: a */
    private String m28240a(HashMap<String, String> hashMap) {
        try {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(Long.parseLong((String) hashMap.get("due_date_time")));
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(instance.getTime());
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(" - ");
            sb.append(Integer.parseInt((String) hashMap.get("progress")));
            sb.append("% - ");
            sb.append(m28244c((String) hashMap.get("priority")));
            return sb.toString();
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private void m28242a(List<HashMap<String, String>> list) {
        m28243b(list);
        List<HashMap<String, String>> list2 = list;
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), list2, 17367044, new String[]{"title", "details"}, new int[]{16908308, 16908309});
        this.f20301ae = simpleAdapter;
        this.f20301ae.setViewBinder(new ViewBinder() {
            public boolean setViewValue(View view, Object obj, String str) {
                TextView textView = (TextView) view;
                textView.setText(str);
                C6593am.m31915a(textView, C5717e.this.f20304ah);
                return true;
            }
        });
        mo1691a((ListAdapter) this.f20301ae);
    }

    /* renamed from: b */
    private void m28243b(List<HashMap<String, String>> list) {
        for (HashMap hashMap : list) {
            hashMap.put("details", m28240a(hashMap));
        }
    }

    /* renamed from: c */
    private String m28244c(String str) {
        return "PRIORITY_HIGH".equals(str) ? "H" : "PRIORITY_MEDIUM".equals(str) ? "M" : "PRIORITY_LOW".equals(str) ? "L" : "L";
    }

    /* renamed from: d */
    private void m28245d(String str) {
        this.f20302af.mo18334a();
        this.f20306i = this.f20302af.mo18333a(str);
        m28242a((List<HashMap<String, String>>) this.f20306i);
    }

    /* renamed from: e */
    private void m28246e(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("CATEGORY_ID_KEY", this.f20303ag);
        if (i != -1) {
            bundle.putString("GOAL_ID_KEY", (String) ((HashMap) this.f20306i.get(i)).get("id"));
        }
        FragmentInfo fragmentInfo = new FragmentInfo(C5703d.class.getName(), bundle);
        fragmentInfo.mo16870c().putBundle("PAGE_STYLE", this.f20304ah);
        fragmentInfo.mo16870c().putString("PAGE_TRANSITION", this.f20305ai);
        App.m25620a(fragmentInfo, (Fragment) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m28247f(int i) {
        Bundle bundle = new Bundle();
        bundle.putString("GOAL_ID_KEY", (String) ((HashMap) this.f20306i.get(i)).get("id"));
        FragmentInfo fragmentInfo = new FragmentInfo(C5699c.class.getName(), bundle);
        fragmentInfo.mo16870c().putBundle("PAGE_STYLE", this.f20304ah);
        fragmentInfo.mo16870c().putString("PAGE_TRANSITION", this.f20305ai);
        App.m25620a(fragmentInfo, (Fragment) this);
    }

    /* renamed from: J */
    public void mo1200J() {
        this.f20302af = C5694a.m28160a((Context) mo1318s());
        m28245d(this.f20303ag);
        super.mo1200J();
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        Bundle m = mo1307m();
        if (m != null) {
            this.f20303ag = m.getString("CATEGORY_ID_KEY");
            this.f20304ah = m.getBundle("PAGE_STYLE");
            this.f20305ai = m.getString("PAGE_TRANSITION");
        }
        super.mo1234a(bundle);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.goal_tracker_category_menu, menu);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        mo1693a((CharSequence) mo1318s().getString(C5462k.goal_tracker_categories_list_no_goals_message));
        mo1241a((View) mo1450b());
        mo1450b().setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C5717e.this.m28247f(i);
            }
        });
        C6593am.m31914a(view, this.f20304ah);
        super.mo1242a(view, bundle);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.goal_tracker_category_add_new_category_menu_item) {
            return super.mo1245a(menuItem);
        }
        m28246e(-1);
        return true;
    }

    /* renamed from: b */
    public boolean mo1271b(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.goal_tracker_goals_edit_item) {
            m28246e(adapterContextMenuInfo.position);
            return true;
        } else if (itemId != C5458g.goal_tracker_goals_delete_item) {
            return super.mo1271b(menuItem);
        } else {
            this.f20302af.mo18341c((String) ((HashMap) this.f20306i.get(adapterContextMenuInfo.position)).get("id"));
            this.f20302af.mo18338b();
            m28245d(this.f20303ag);
            return true;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        mo1318s().getMenuInflater().inflate(C5461j.goal_tracker_context_menu, contextMenu);
    }
}
