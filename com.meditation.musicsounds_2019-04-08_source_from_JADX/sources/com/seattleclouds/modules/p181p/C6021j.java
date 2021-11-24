package com.seattleclouds.modules.p181p;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.seattleclouds.App;
import com.seattleclouds.util.C6642w;
import java.util.ArrayList;
import java.util.Map.Entry;

/* renamed from: com.seattleclouds.modules.p.j */
public class C6021j {

    /* renamed from: a */
    private static C6021j f21399a;

    /* renamed from: b */
    private static Context f21400b;

    public C6021j(Context context) {
    }

    /* renamed from: a */
    public static C6021j m29529a(Context context) {
        if (f21399a == null && context != null) {
            f21399a = new C6021j(context);
        }
        f21400b = context;
        return f21399a;
    }

    /* renamed from: b */
    private SharedPreferences m29530b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(App.f18522x);
        sb.append(".");
        sb.append(App.f18523y);
        sb.append(".");
        sb.append(App.f18524z);
        sb.append(".");
        sb.append(str);
        sb.append(".");
        sb.append("com.seattleclouds.modules.quiz");
        return f21400b.getSharedPreferences(sb.toString(), 0);
    }

    /* renamed from: a */
    public ArrayList<C6020i> mo19026a(String str) {
        ArrayList<C6020i> arrayList = new ArrayList<>();
        for (Entry entry : C6642w.m32093a(m29530b(str).getAll()).entrySet()) {
            String str2 = (String) entry.getKey();
            Integer num = (Integer) entry.getValue();
            C6020i iVar = new C6020i();
            iVar.mo19024a(str2);
            iVar.mo19023a(num);
            arrayList.add(iVar);
        }
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo19027a(Integer num, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(App.f18522x);
        sb.append(".");
        sb.append(App.f18523y);
        sb.append(".");
        sb.append(App.f18524z);
        sb.append(".");
        sb.append(str);
        sb.append(".");
        sb.append("com.seattleclouds.modules.quiz");
        Editor edit = f21400b.getSharedPreferences(sb.toString(), 0).edit();
        edit.putInt(str2, num.intValue());
        edit.commit();
        return true;
    }
}
