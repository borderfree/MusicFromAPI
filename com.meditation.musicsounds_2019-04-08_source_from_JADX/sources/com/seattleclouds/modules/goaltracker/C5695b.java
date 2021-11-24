package com.seattleclouds.modules.goaltracker;

import android.app.Activity;
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
import com.seattleclouds.C5230aa;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6671x;
import com.seattleclouds.FragmentInfo;
import com.seattleclouds.util.C6593am;
import com.seattleclouds.util.C6620n;
import com.seattleclouds.util.C6620n.C6629b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* renamed from: com.seattleclouds.modules.goaltracker.b */
public class C5695b extends C6671x {

    /* renamed from: ae */
    private SimpleAdapter f20238ae;
    /* access modifiers changed from: private */

    /* renamed from: af */
    public C5694a f20239af;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public Bundle f20240ag;

    /* renamed from: ah */
    private String f20241ah;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ArrayList<HashMap<String, String>> f20242i = new ArrayList<>();

    /* renamed from: a */
    private void m28176a(final int i, Activity activity) {
        String string;
        String str;
        if (i == -1) {
            string = activity.getString(C5462k.goal_tracker_categories_list_create_new_category);
            StringBuilder sb = new StringBuilder();
            sb.append("Category ");
            sb.append(this.f20242i.size() + 1);
            str = sb.toString();
        } else {
            string = activity.getString(C5462k.goal_tracker_categories_list_update_category);
            str = (String) ((HashMap) this.f20242i.get(i)).get("name");
        }
        C6620n.m32043a((Context) activity, string, activity.getString(C5462k.goal_tracker_categories_list_enter_category_name), false, str, mo1219a(C5462k.save), (C6629b) new C6629b() {
            /* renamed from: a */
            public void mo18346a() {
            }

            /* renamed from: a */
            public void mo18347a(String str) {
                if (i == -1) {
                    Calendar instance = Calendar.getInstance();
                    HashMap hashMap = new HashMap();
                    hashMap.put("name", str);
                    hashMap.put("id", UUID.randomUUID().toString());
                    StringBuilder sb = new StringBuilder();
                    sb.append(instance.getTimeInMillis());
                    sb.append("");
                    hashMap.put("created_time", sb.toString());
                    C5695b.this.f20239af.mo18336a(hashMap);
                } else {
                    HashMap hashMap2 = (HashMap) C5695b.this.f20242i.get(i);
                    hashMap2.put("name", str);
                    C5695b.this.f20239af.mo18339b(hashMap2);
                }
                C5695b.this.m28185e();
                C5695b.this.m28180at();
            }
        });
    }

    /* renamed from: a */
    private void m28178a(List<HashMap<String, String>> list) {
        SimpleAdapter simpleAdapter = new SimpleAdapter(mo1318s(), list, 17367043, new String[]{"name"}, new int[]{16908308});
        this.f20238ae = simpleAdapter;
        mo1691a((ListAdapter) this.f20238ae);
        this.f20238ae.setViewBinder(new ViewBinder() {
            public boolean setViewValue(View view, Object obj, String str) {
                TextView textView = (TextView) view;
                textView.setText(str);
                C6593am.m31915a(textView, C5695b.this.f20240ag);
                return true;
            }
        });
        this.f20238ae.notifyDataSetChanged();
    }

    /* renamed from: as */
    private void m28179as() {
        this.f20239af.mo18334a();
    }

    /* access modifiers changed from: private */
    /* renamed from: at */
    public void m28180at() {
        this.f20242i = this.f20239af.mo18340c();
        m28178a((List<HashMap<String, String>>) this.f20242i);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m28183c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("CATEGORY_ID_KEY", str);
        FragmentInfo fragmentInfo = new FragmentInfo(C5717e.class.getName(), bundle);
        C5230aa f = App.f18501c.mo16950f("goaltracker");
        if (f != null) {
            fragmentInfo.mo16870c().putBundle("PAGE_STYLE", f.mo17110as());
            fragmentInfo.mo16870c().putString("PAGE_TRANSITION", f.mo17149h());
        } else {
            fragmentInfo.mo16870c().putBundle("PAGE_STYLE", this.f20240ag);
            fragmentInfo.mo16870c().putString("PAGE_TRANSITION", this.f20241ah);
        }
        App.m25620a(fragmentInfo, (Fragment) this);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m28185e() {
        this.f20239af.mo18338b();
    }

    /* renamed from: J */
    public void mo1200J() {
        this.f20239af = C5694a.m28160a((Context) mo1318s());
        m28179as();
        m28180at();
        super.mo1200J();
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.goal_tracker_category_menu, menu);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        mo1241a((View) mo1450b());
        mo1693a((CharSequence) mo1318s().getString(C5462k.goal_tracker_categories_list_no_categories_message));
        mo1450b().setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C5695b.this.m28183c((String) ((HashMap) C5695b.this.f20242i.get(i)).get("id"));
            }
        });
        Bundle m = mo1307m();
        if (m != null) {
            this.f20240ag = m.getBundle("PAGE_STYLE");
            this.f20241ah = m.getString("PAGE_TRANSITION");
        }
        C6593am.m31914a(view, this.f20240ag);
        super.mo1242a(view, bundle);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.goal_tracker_category_add_new_category_menu_item) {
            return super.mo1245a(menuItem);
        }
        m28176a(-1, (Activity) mo1318s());
        return true;
    }

    /* renamed from: b */
    public boolean mo1271b(MenuItem menuItem) {
        AdapterContextMenuInfo adapterContextMenuInfo = (AdapterContextMenuInfo) menuItem.getMenuInfo();
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.goal_tracker_goals_edit_item) {
            m28176a(adapterContextMenuInfo.position, (Activity) mo1318s());
            return true;
        } else if (itemId != C5458g.goal_tracker_goals_delete_item) {
            return super.mo1271b(menuItem);
        } else {
            this.f20239af.mo18343d((String) ((HashMap) this.f20242i.get(adapterContextMenuInfo.position)).get("id"));
            this.f20239af.mo18338b();
            m28180at();
            return true;
        }
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        mo1318s().getMenuInflater().inflate(C5461j.goal_tracker_context_menu, contextMenu);
    }
}
