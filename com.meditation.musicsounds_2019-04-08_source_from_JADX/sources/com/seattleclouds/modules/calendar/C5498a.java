package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.support.p009v4.app.C0415v.C0416a;
import android.support.p009v4.content.C0453c;
import android.support.p023v7.app.C0767e;
import android.util.Log;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.MultiChoiceModeListener;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.jasonkostempski.android.calendar.CalendarView;
import com.jasonkostempski.android.calendar.CalendarView.C5097a;
import com.jasonkostempski.android.calendar.CalendarView.C5098b;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5461j;
import com.seattleclouds.C5451m.C5462k;
import com.seattleclouds.C6671x;
import com.seattleclouds.p160e.C5334b;
import com.seattleclouds.util.C6564a;
import com.seattleclouds.util.C6608d;
import com.seattleclouds.util.C6609e;
import com.seattleclouds.util.C6614j;
import com.seattleclouds.util.C6619m;
import com.seattleclouds.util.C6620n;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: com.seattleclouds.modules.calendar.a */
public class C5498a extends C6671x implements C0416a<Cursor>, MultiChoiceModeListener {

    /* renamed from: ae */
    private static final ArrayList<Integer> f19567ae = C6609e.m31965a((T[]) new Integer[]{Integer.valueOf(Color.parseColor("red")), Integer.valueOf(Color.parseColor("#4e7ae8")), Integer.valueOf(Color.parseColor("#e87a0e")), Integer.valueOf(Color.parseColor("green")), Integer.valueOf(Color.parseColor("#afcbff")), Integer.valueOf(Color.parseColor("yellow")), Integer.valueOf(Color.parseColor("#c9ea63")), Integer.valueOf(Color.parseColor("#eab27c")), Integer.valueOf(Color.parseColor("#da71ea"))});

    /* renamed from: i */
    private static final ArrayList<String> f19568i = C6609e.m31965a((T[]) new String[]{"Work", "Training", "Meeting", "Appointment", "Holiday", "Vacation", "Anniversary", "Birthday", "Other"});
    /* access modifiers changed from: private */

    /* renamed from: af */
    public int f19569af = 2;
    /* access modifiers changed from: private */

    /* renamed from: ag */
    public Date f19570ag = new Date();

    /* renamed from: ah */
    private boolean f19571ah = true;
    /* access modifiers changed from: private */

    /* renamed from: ai */
    public CalendarView f19572ai;
    /* access modifiers changed from: private */

    /* renamed from: aj */
    public ListView f19573aj;

    /* renamed from: ak */
    private String f19574ak;
    /* access modifiers changed from: private */

    /* renamed from: al */
    public C5506c f19575al;

    /* renamed from: am */
    private ArrayList<String> f19576am;

    /* renamed from: an */
    private ArrayList<Integer> f19577an;

    /* renamed from: ao */
    private Map<String, Integer> f19578ao = new HashMap();

    /* renamed from: ap */
    private C5519g f19579ap;

    /* renamed from: aq */
    private C5516f f19580aq;
    /* access modifiers changed from: private */

    /* renamed from: ar */
    public int f19581ar = 0;

    /* renamed from: as */
    private int f19582as = 0;

    /* renamed from: at */
    private String f19583at = "com.seattleclouds.modules.calendar";

    /* renamed from: au */
    private View f19584au = null;

    /* renamed from: av */
    private ActionMode f19585av;
    /* access modifiers changed from: private */

    /* renamed from: aw */
    public boolean f19586aw = false;

    /* renamed from: ax */
    private int f19587ax = -1;

    /* renamed from: ay */
    private MenuItem f19588ay;

    /* renamed from: az */
    private MenuItem f19589az;

    /* renamed from: a */
    private void m27359a(long j) {
        Intent intent = new Intent(mo1318s(), EventEditActivity.class);
        intent.putExtra("databaseName", this.f19574ak);
        intent.putExtra("_id", Long.valueOf(j));
        intent.putStringArrayListExtra("categories", this.f19576am);
        startActivityForResult(intent, 2);
    }

    /* renamed from: a */
    private void m27361a(Date date) {
        Intent intent = new Intent(mo1318s(), EventEditActivity.class);
        intent.putExtra("databaseName", this.f19574ak);
        intent.putExtra("startDate", date.getTime());
        intent.putStringArrayListExtra("categories", this.f19576am);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: aA */
    public void m27363aA() {
        Set a = this.f19575al.mo17848a(this.f19572ai.getVisibleStartDate().getTime(), this.f19572ai.getVisibleEndDate().getTime());
        if (mo1318s() != null) {
            this.f19572ai.mo16523a(a, mo1453c().mo17546c(mo1318s()));
        }
    }

    /* renamed from: aB */
    private void m27364aB() {
        this.f19572ai.setOnSelectedDayChangedListener(new C5098b() {
            /* renamed from: a */
            public void mo16541a(CalendarView calendarView) {
                C5498a.this.f19570ag = C5498a.this.f19572ai.getSelectedDay().getTime();
                C5498a.this.m27375az();
            }
        });
        this.f19572ai.setOnMonthChangedListener(new C5097a() {
            /* renamed from: a */
            public void mo16540a(CalendarView calendarView) {
                C5498a.this.f19570ag = C5498a.this.f19572ai.getSelectedDay().getTime();
                C5498a.this.m27363aA();
            }
        });
    }

    /* renamed from: aC */
    private void m27365aC() {
        Bundle m = mo1307m();
        if (m != null) {
            this.f19576am = m.getStringArrayList("categories");
            this.f19577an = m.getIntegerArrayList("categoryColors");
        }
        if (this.f19576am == null || this.f19576am.size() == 0) {
            this.f19576am = f19568i;
        }
        if (this.f19577an == null || this.f19577an.size() == 0) {
            this.f19577an = f19567ae;
        }
        int i = 0;
        while (i < this.f19576am.size() && i < this.f19577an.size()) {
            this.f19578ao.put(this.f19576am.get(i), this.f19577an.get(i));
            i++;
        }
    }

    /* renamed from: aD */
    private void m27366aD() {
        m27361a(this.f19572ai.getSelectedDay().getTime());
    }

    /* renamed from: aE */
    private void m27367aE() {
        long j;
        String string;
        boolean z;
        if (this.f19569af == 100) {
            C5522h hVar = (C5522h) this.f19580aq.getItem(this.f19587ax);
            j = hVar.mo17886c();
            string = hVar.mo17888d();
            z = hVar.mo17900m();
        } else {
            Cursor cursor = (Cursor) this.f19579ap.getItem(this.f19587ax);
            j = (long) cursor.getInt(cursor.getColumnIndex("_id"));
            string = cursor.getString(cursor.getColumnIndex("recurring_event_id"));
            z = cursor.getInt(cursor.getColumnIndex("is_synced_event")) == 1;
        }
        String str = string;
        long j2 = j;
        if (z) {
            C6620n.m32034a((Context) mo1318s(), (String) null, mo1219a(C5462k.calendar_event_delete_synced_error));
        } else {
            C5510e.m27423a(mo1318s(), this.f19575al, j2, str, new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    C5498a.this.m27368aF();
                    C5498a.this.m27373ax();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aF */
    public void m27368aF() {
        if (this.f19585av != null) {
            this.f19585av.finish();
        }
    }

    /* renamed from: as */
    private void m27369as() {
        final View findViewById = this.f19584au.findViewById(C5458g.loading_view);
        this.f19572ai.setVisibility(8);
        findViewById.setVisibility(0);
        String str = "calendar_events.json";
        Bundle m = mo1307m();
        if (m != null) {
            str = m.getString("syncedEventsResourceName");
        }
        C5523i iVar = new C5523i(this.f19575al, str);
        iVar.mo17904a((C6608d) new C6608d() {
            /* renamed from: a */
            public void mo16855a(Object obj) {
                Log.v("CalendarFragment", "Events sync done, reloading Calendar");
                C5498a.this.m27373ax();
                if (C5498a.this.f19569af == 100) {
                    C5498a.this.f19573aj.setSelection(C5498a.this.f19581ar);
                }
                C5498a.this.f19572ai.setVisibility(0);
                findViewById.setVisibility(8);
            }
        });
        iVar.execute(new String[0]);
    }

    /* renamed from: at */
    private int m27370at() {
        if (!(this.f19572ai == null || this.f19569af == 100)) {
            this.f19569af = this.f19572ai.getView();
        }
        return this.f19569af;
    }

    /* renamed from: au */
    private int m27371au() {
        return mo1318s().getSharedPreferences(this.f19583at, 0).getInt("selectedViewType", 2);
    }

    /* renamed from: av */
    private void m27372av() {
        Editor edit = mo1318s().getSharedPreferences(this.f19583at, 0).edit();
        edit.putInt("selectedViewType", m27370at());
        edit.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: ax */
    public void m27373ax() {
        if (this.f19569af == 100) {
            m27374ay();
            return;
        }
        m27375az();
        m27363aA();
    }

    /* renamed from: ay */
    private void m27374ay() {
        Date a = C6614j.m31998a(C6614j.m32003b(new Date()).getTime(), -365);
        Cursor b = this.f19575al.mo17851b(a, C6614j.m31998a(a, 1095));
        TreeMap treeMap = new TreeMap();
        if (b != null) {
            b.moveToFirst();
            while (!b.isAfterLast()) {
                C5522h a2 = this.f19575al.mo17847a(b);
                Date j = a2.mo17897j();
                Calendar a3 = C6614j.m31997a(a2.mo17898k());
                Calendar b2 = C6614j.m32003b(j);
                while (b2.compareTo(a3) <= 0) {
                    ArrayList arrayList = (ArrayList) treeMap.get(b2.getTime());
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(a2);
                    treeMap.put(b2.getTime(), arrayList);
                    b2.add(6, 1);
                }
                b.moveToNext();
            }
            b.close();
        }
        ArrayList arrayList2 = new ArrayList();
        Date time = this.f19572ai.getSelectedDay().getTime();
        Date date = new Date();
        boolean z = false;
        int i = Integer.MAX_VALUE;
        boolean z2 = false;
        int i2 = Integer.MAX_VALUE;
        for (Date date2 : treeMap.keySet()) {
            ArrayList arrayList3 = (ArrayList) treeMap.get(date2);
            if (arrayList3 != null) {
                C5522h hVar = new C5522h();
                hVar.mo17876a(0);
                hVar.mo17880a(date2);
                arrayList2.add(hVar);
                if (C6614j.m32001a(date2, time)) {
                    this.f19581ar = arrayList2.size() - 1;
                    z = true;
                }
                if (!z) {
                    int a4 = C6614j.m31993a(date2, time, true);
                    if (a4 < i) {
                        this.f19581ar = arrayList2.size() - 1;
                        i = a4;
                    }
                }
                if (C6614j.m32001a(date2, date)) {
                    this.f19582as = arrayList2.size() - 1;
                    z2 = true;
                }
                if (!z2) {
                    int a5 = C6614j.m31993a(date2, date, true);
                    if (a5 < i2) {
                        this.f19582as = arrayList2.size() - 1;
                        i2 = a5;
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    C5522h hVar2 = new C5522h((C5522h) it.next());
                    hVar2.mo17878a(hVar);
                    arrayList2.add(hVar2);
                }
            }
        }
        this.f19580aq.mo17866a(arrayList2);
    }

    /* access modifiers changed from: private */
    /* renamed from: az */
    public void m27375az() {
        if (mo1318s() != null) {
            mo1198H().mo1356b(0, null, this);
        }
    }

    /* renamed from: e */
    private void m27380e() {
        String str;
        Bundle m = mo1307m();
        String string = m != null ? m.getString("storeId") : null;
        if (string == null || string.trim().equals("")) {
            str = "calendar.db";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("calendar-");
            sb.append(string);
            sb.append(".db");
            str = sb.toString();
        }
        this.f19574ak = str;
    }

    /* renamed from: e */
    private void m27381e(int i) {
        View findViewById = this.f19584au.findViewById(C5458g.days);
        LayoutParams layoutParams = new LayoutParams(findViewById.getLayoutParams());
        layoutParams.height = i == 1 ? C6619m.m32014a(mo1318s(), 345.0f) : -1;
        findViewById.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    private void m27382f(int i) {
        ListAdapter listAdapter;
        this.f19569af = i;
        View findViewById = this.f19584au.findViewById(C5458g.navigation);
        ListView listView = (ListView) this.f19584au.findViewById(16908298);
        if (this.f19569af == 100) {
            this.f19572ai.setView(1);
            findViewById.setVisibility(8);
            listView.setVerticalScrollBarEnabled(false);
            listAdapter = this.f19580aq;
        } else {
            this.f19572ai.setView(i);
            findViewById.setVisibility(0);
            listView.setVerticalScrollBarEnabled(true);
            listAdapter = this.f19579ap;
        }
        mo1691a(listAdapter);
    }

    /* renamed from: a */
    public C0453c<Cursor> mo1696a(int i, Bundle bundle) {
        return new C6564a(mo1318s()) {
            /* access modifiers changed from: protected */
            /* renamed from: y */
            public Cursor mo17839y() {
                return C5498a.this.f19575al.mo17846a(C5498a.this.f19572ai.getSelectedDay().getTime());
            }
        };
    }

    /* renamed from: a */
    public View mo1217a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f19584au = layoutInflater.inflate(C5460i.calendar_activity, viewGroup, false);
        this.f19573aj = (ListView) this.f19584au.findViewById(16908298);
        m27380e();
        this.f19575al = new C5506c(mo1318s(), this.f19574ak);
        this.f19572ai = (CalendarView) this.f19584au.findViewById(C5458g.calendar_view);
        m27365aC();
        this.f19579ap = new C5519g(mo1318s(), this.f19572ai.getSelectedDay().getTime(), this.f19578ao, ((Integer) this.f19577an.get(this.f19577an.size() - 1)).intValue());
        this.f19580aq = new C5516f(mo1318s(), new ArrayList(), this.f19578ao, ((Integer) this.f19577an.get(this.f19577an.size() - 1)).intValue());
        mo1691a((ListAdapter) this.f19579ap);
        m27364aB();
        if (this.f19571ah) {
            this.f19571ah = false;
            m27369as();
        } else {
            m27373ax();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(this.f19570ag);
        this.f19572ai.setSelectedDay(instance);
        m27382f(this.f19569af);
        mo1198H().mo1353a(0, null, this);
        if (bundle != null) {
            this.f19586aw = true;
            this.f19584au.postDelayed(new Runnable() {
                public void run() {
                    C5498a.this.f19586aw = false;
                }
            }, 500);
        }
        return this.f19584au;
    }

    /* renamed from: a */
    public void mo1222a(int i, int i2, Intent intent) {
        super.mo1222a(i, i2, intent);
        switch (i) {
            case 1:
            case 2:
                if (i2 == 101 || i2 == 102) {
                    m27373ax();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo1234a(Bundle bundle) {
        super.mo1234a(bundle);
        Bundle m = mo1307m();
        if (m != null) {
            String string = m.getString("storeId");
            if (string != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f19583at);
                sb.append(".");
                sb.append(string);
                this.f19583at = sb.toString();
            }
        }
        if (bundle != null) {
            this.f19569af = bundle.getInt("selectedView", this.f19569af);
            this.f19570ag = new Date(bundle.getLong("selectedDate", this.f19570ag.getTime()));
            this.f19587ax = bundle.getInt("checkedPosition", -1);
        } else {
            this.f19569af = m27371au();
        }
        mo20722d(C5462k.calendar_title);
    }

    /* renamed from: a */
    public void mo1697a(C0453c<Cursor> cVar) {
        this.f19579ap.mo2866b(null);
    }

    /* renamed from: a */
    public void mo1698a(C0453c<Cursor> cVar, Cursor cursor) {
        this.f19579ap.mo17874a(this.f19572ai.getSelectedDay().getTime());
        this.f19579ap.mo2866b(cursor);
    }

    /* renamed from: a */
    public void mo1239a(Menu menu) {
        boolean z = false;
        this.f19588ay.setVisible(this.f19569af != 100);
        MenuItem menuItem = this.f19589az;
        if (this.f19569af == 100) {
            z = true;
        }
        menuItem.setVisible(z);
        super.mo1239a(menu);
    }

    /* renamed from: a */
    public void mo1240a(Menu menu, MenuInflater menuInflater) {
        super.mo1240a(menu, menuInflater);
        menuInflater.inflate(C5461j.calendar, menu);
        this.f19588ay = menu.findItem(C5458g.calendar_view_type_agenda);
        this.f19589az = menu.findItem(C5458g.calendar_view_type_month);
    }

    /* renamed from: a */
    public void mo1242a(View view, Bundle bundle) {
        super.mo1242a(view, bundle);
        m27381e(mo1318s().getResources().getConfiguration().orientation);
        mo1450b().setMultiChoiceModeListener(this);
        mo1450b().setChoiceMode(3);
    }

    /* renamed from: a */
    public void mo1692a(ListView listView, View view, int i, long j) {
        super.mo1692a(listView, view, i, j);
        m27359a(j);
    }

    /* renamed from: a */
    public boolean mo1245a(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == C5458g.calendar_select_today_date) {
            this.f19572ai.setSelectedDay(Calendar.getInstance());
            if (this.f19569af == 100) {
                this.f19573aj.setSelection(this.f19582as);
            }
            return true;
        } else if (itemId == C5458g.calendar_event_create_new) {
            m27366aD();
            return true;
        } else if (itemId == C5458g.calendar_info) {
            new C5524j(mo1318s(), this.f19576am, this.f19578ao, ((Integer) this.f19577an.get(this.f19577an.size() - 1)).intValue()).show();
            return true;
        } else if (itemId != C5458g.calendar_view_type_agenda && itemId != C5458g.calendar_view_type_month) {
            return super.mo1245a(menuItem);
        } else {
            if (this.f19569af == 100) {
                m27382f(2);
            } else {
                m27382f(100);
            }
            m27373ax();
            if (this.f19569af == 100) {
                this.f19573aj.setSelection(this.f19581ar);
            }
            m27372av();
            mo20721d();
            return true;
        }
    }

    /* renamed from: c */
    public void mo1274c(boolean z) {
        super.mo1274c(z);
        if (z) {
            m27368aF();
        }
    }

    /* renamed from: e */
    public void mo1282e(Bundle bundle) {
        bundle.putInt("selectedView", m27370at());
        bundle.putLong("selectedDate", this.f19570ag.getTime());
        bundle.putInt("checkedPosition", this.f19587ax);
        super.mo1282e(bundle);
    }

    /* renamed from: g */
    public void mo1290g(boolean z) {
        super.mo1290g(z);
        if (!z && !this.f19586aw) {
            m27368aF();
        }
    }

    /* renamed from: i */
    public void mo1296i() {
        if (this.f19575al != null) {
            this.f19575al.close();
        }
        this.f19569af = m27370at();
        super.mo1296i();
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem.getItemId() != C5458g.calendar_event_delete) {
            return false;
        }
        m27367aE();
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        this.f19585av = actionMode;
        actionMode.getMenuInflater().inflate(C5461j.calendar_event_context, menu);
        C5334b.m26768a(mo1453c(), (C0767e) mo1318s(), menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f19585av = null;
        this.f19587ax = -1;
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        if (z) {
            if (this.f19587ax >= 0) {
                mo1450b().setItemChecked(this.f19587ax, false);
            }
            this.f19587ax = i;
        }
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
