package com.seattleclouds.modules.calendar;

import android.content.Context;
import android.support.p023v7.app.C0796m;
import android.widget.ListView;
import com.seattleclouds.C5451m.C5458g;
import com.seattleclouds.C5451m.C5460i;
import com.seattleclouds.C5451m.C5462k;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.seattleclouds.modules.calendar.j */
public class C5524j extends C0796m {
    public C5524j(Context context, ArrayList<String> arrayList, Map<String, Integer> map, int i) {
        super(context);
        setTitle(C5462k.calendar_info_dialog_title);
        setContentView(C5460i.calendar_info_dialog);
        ((ListView) findViewById(C5458g.categories_list)).setAdapter(new C5507d(context, arrayList, map, i));
    }
}
