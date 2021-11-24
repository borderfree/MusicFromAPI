package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

@C3464ci
public final class ajv {

    /* renamed from: a */
    private final int f12239a;

    /* renamed from: b */
    private final int f12240b;

    /* renamed from: c */
    private final int f12241c;

    /* renamed from: d */
    private final aju f12242d = new ajz();

    public ajv(int i) {
        this.f12240b = i;
        this.f12239a = 6;
        this.f12241c = 0;
    }

    /* renamed from: a */
    private final String m16413a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        ajx ajx = new ajx();
        PriorityQueue priorityQueue = new PriorityQueue(this.f12240b, new ajw(this));
        for (String a : split) {
            String[] a2 = ajy.m16417a(a, false);
            if (a2.length != 0) {
                akb.m16425a(a2, this.f12240b, this.f12239a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ajx.mo12061a(this.f12242d.mo12058a(((akc) it.next()).f12248b));
            } catch (IOException e) {
                C3643iy.m19173b("Error while writing hash to byteStream", e);
            }
        }
        return ajx.toString();
    }

    /* renamed from: a */
    public final String mo12059a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            sb.append(((String) obj).toLowerCase(Locale.US));
            sb.append(10);
        }
        return m16413a(sb.toString());
    }
}
