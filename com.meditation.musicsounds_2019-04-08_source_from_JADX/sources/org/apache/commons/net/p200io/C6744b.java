package org.apache.commons.net.p200io;

import java.util.EventListener;
import java.util.Iterator;
import org.apache.commons.net.util.ListenerList;

/* renamed from: org.apache.commons.net.io.b */
public class C6744b implements C6745c {

    /* renamed from: a */
    private final ListenerList f23708a = new ListenerList();

    /* renamed from: a */
    public void mo19748a(long j, int i, long j2) {
        Iterator it = this.f23708a.iterator();
        while (it.hasNext()) {
            ((C6745c) ((EventListener) it.next())).mo19748a(j, i, j2);
        }
    }

    /* renamed from: a */
    public void mo21169a(C6745c cVar) {
        this.f23708a.addListener(cVar);
    }
}
