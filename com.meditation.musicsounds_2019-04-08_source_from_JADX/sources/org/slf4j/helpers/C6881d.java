package org.slf4j.helpers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.C6875a;
import org.slf4j.C6876b;

/* renamed from: org.slf4j.helpers.d */
public class C6881d implements C6875a {

    /* renamed from: a */
    final List f23833a = new ArrayList();

    /* renamed from: a */
    public List mo21539a() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f23833a) {
            arrayList.addAll(this.f23833a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public C6876b mo21474a(String str) {
        synchronized (this.f23833a) {
            this.f23833a.add(str);
        }
        return NOPLogger.NOP_LOGGER;
    }
}
