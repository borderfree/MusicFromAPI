package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@C3464ci
public final class akb {
    /* renamed from: a */
    private static long m16422a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        return (i % 2 == 0 ? m16422a((j * j) % 1073807359, i / 2) : j * (m16422a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    /* renamed from: a */
    private static String m16423a(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            C3643iy.m19174c("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    /* renamed from: a */
    private static void m16424a(int i, long j, String str, int i2, PriorityQueue<akc> priorityQueue) {
        akc akc = new akc(j, str, i2);
        if ((priorityQueue.size() != i || (((akc) priorityQueue.peek()).f12249c <= akc.f12249c && ((akc) priorityQueue.peek()).f12247a <= akc.f12247a)) && !priorityQueue.contains(akc)) {
            priorityQueue.add(akc);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    /* renamed from: a */
    public static void m16425a(String[] strArr, int i, int i2, PriorityQueue<akc> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            m16424a(i, m16426b(strArr2, 0, strArr2.length), m16423a(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long b = m16426b(strArr2, 0, i3);
        m16424a(i, b, m16423a(strArr2, 0, i3), i2, priorityQueue);
        long a = m16422a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = b + 1073807359;
            b = (((((j - ((((((long) ajy.m16416a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) ajy.m16416a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            m16424a(i, b, m16423a(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    /* renamed from: b */
    private static long m16426b(String[] strArr, int i, int i2) {
        long a = (((long) ajy.m16416a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a = (((a * 16785407) % 1073807359) + ((((long) ajy.m16416a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a;
    }
}
