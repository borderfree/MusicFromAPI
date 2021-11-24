package android.support.p023v7.widget;

import java.util.List;

/* renamed from: android.support.v7.widget.as */
class C1045as {

    /* renamed from: a */
    final C1046a f3630a;

    /* renamed from: android.support.v7.widget.as$a */
    interface C1046a {
        /* renamed from: a */
        C1105b mo5177a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo5178a(C1105b bVar);
    }

    C1045as(C1046a aVar) {
        this.f3630a = aVar;
    }

    /* renamed from: a */
    private void m5680a(List<C1105b> list, int i, int i2) {
        C1105b bVar = (C1105b) list.get(i);
        C1105b bVar2 = (C1105b) list.get(i2);
        int i3 = bVar2.f3840a;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    m5682c(list, i, bVar, i2, bVar2);
                    return;
                case 2:
                    mo5175a(list, i, bVar, i2, bVar2);
                    return;
                default:
                    return;
            }
        } else {
            mo5176b(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private int m5681b(List<C1105b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1105b) list.get(size)).f3840a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m5682c(List<C1105b> list, int i, C1105b bVar, int i2, C1105b bVar2) {
        int i3 = bVar.f3843d < bVar2.f3841b ? -1 : 0;
        if (bVar.f3841b < bVar2.f3841b) {
            i3++;
        }
        if (bVar2.f3841b <= bVar.f3841b) {
            bVar.f3841b += bVar2.f3843d;
        }
        if (bVar2.f3841b <= bVar.f3843d) {
            bVar.f3843d += bVar2.f3843d;
        }
        bVar2.f3841b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5174a(List<C1105b> list) {
        while (true) {
            int b = m5681b(list);
            if (b != -1) {
                m5680a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c6, code lost:
        if (r11.f3843d > r13.f3841b) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        if (r11.f3843d >= r13.f3841b) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5175a(java.util.List<android.support.p023v7.widget.C1103e.C1105b> r9, int r10, android.support.p023v7.widget.C1103e.C1105b r11, int r12, android.support.p023v7.widget.C1103e.C1105b r13) {
        /*
            r8 = this;
            int r0 = r11.f3841b
            int r1 = r11.f3843d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x001c
            int r0 = r13.f3841b
            int r1 = r11.f3841b
            if (r0 != r1) goto L_0x001a
            int r0 = r13.f3843d
            int r1 = r11.f3843d
            int r4 = r11.f3841b
            int r1 = r1 - r4
            if (r0 != r1) goto L_0x001a
            r0 = 0
        L_0x0018:
            r2 = 1
            goto L_0x002f
        L_0x001a:
            r0 = 0
            goto L_0x002f
        L_0x001c:
            int r0 = r13.f3841b
            int r1 = r11.f3843d
            int r1 = r1 + r3
            if (r0 != r1) goto L_0x002e
            int r0 = r13.f3843d
            int r1 = r11.f3841b
            int r4 = r11.f3843d
            int r1 = r1 - r4
            if (r0 != r1) goto L_0x002e
            r0 = 1
            goto L_0x0018
        L_0x002e:
            r0 = 1
        L_0x002f:
            int r1 = r11.f3843d
            int r4 = r13.f3841b
            r5 = 2
            if (r1 >= r4) goto L_0x003c
            int r1 = r13.f3841b
            int r1 = r1 - r3
            r13.f3841b = r1
            goto L_0x005b
        L_0x003c:
            int r1 = r11.f3843d
            int r4 = r13.f3841b
            int r6 = r13.f3843d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x005b
            int r10 = r13.f3843d
            int r10 = r10 - r3
            r13.f3843d = r10
            r11.f3840a = r5
            r11.f3843d = r3
            int r10 = r13.f3843d
            if (r10 != 0) goto L_0x005a
            r9.remove(r12)
            android.support.v7.widget.as$a r9 = r8.f3630a
            r9.mo5178a(r13)
        L_0x005a:
            return
        L_0x005b:
            int r1 = r11.f3841b
            int r4 = r13.f3841b
            r6 = 0
            if (r1 > r4) goto L_0x0068
            int r1 = r13.f3841b
            int r1 = r1 + r3
            r13.f3841b = r1
            goto L_0x0089
        L_0x0068:
            int r1 = r11.f3841b
            int r4 = r13.f3841b
            int r7 = r13.f3843d
            int r4 = r4 + r7
            if (r1 >= r4) goto L_0x0089
            int r1 = r13.f3841b
            int r4 = r13.f3843d
            int r1 = r1 + r4
            int r4 = r11.f3841b
            int r1 = r1 - r4
            android.support.v7.widget.as$a r4 = r8.f3630a
            int r7 = r11.f3841b
            int r7 = r7 + r3
            android.support.v7.widget.e$b r6 = r4.mo5177a(r5, r7, r1, r6)
            int r1 = r11.f3841b
            int r3 = r13.f3841b
            int r1 = r1 - r3
            r13.f3843d = r1
        L_0x0089:
            if (r2 == 0) goto L_0x0097
            r9.set(r10, r13)
            r9.remove(r12)
            android.support.v7.widget.as$a r9 = r8.f3630a
            r9.mo5178a(r11)
            return
        L_0x0097:
            if (r0 == 0) goto L_0x00d0
            if (r6 == 0) goto L_0x00b5
            int r0 = r11.f3841b
            int r1 = r6.f3841b
            if (r0 <= r1) goto L_0x00a8
            int r0 = r11.f3841b
            int r1 = r6.f3843d
            int r0 = r0 - r1
            r11.f3841b = r0
        L_0x00a8:
            int r0 = r11.f3843d
            int r1 = r6.f3841b
            if (r0 <= r1) goto L_0x00b5
            int r0 = r11.f3843d
            int r1 = r6.f3843d
            int r0 = r0 - r1
            r11.f3843d = r0
        L_0x00b5:
            int r0 = r11.f3841b
            int r1 = r13.f3841b
            if (r0 <= r1) goto L_0x00c2
            int r0 = r11.f3841b
            int r1 = r13.f3843d
            int r0 = r0 - r1
            r11.f3841b = r0
        L_0x00c2:
            int r0 = r11.f3843d
            int r1 = r13.f3841b
            if (r0 <= r1) goto L_0x0100
        L_0x00c8:
            int r0 = r11.f3843d
            int r1 = r13.f3843d
            int r0 = r0 - r1
            r11.f3843d = r0
            goto L_0x0100
        L_0x00d0:
            if (r6 == 0) goto L_0x00ec
            int r0 = r11.f3841b
            int r1 = r6.f3841b
            if (r0 < r1) goto L_0x00df
            int r0 = r11.f3841b
            int r1 = r6.f3843d
            int r0 = r0 - r1
            r11.f3841b = r0
        L_0x00df:
            int r0 = r11.f3843d
            int r1 = r6.f3841b
            if (r0 < r1) goto L_0x00ec
            int r0 = r11.f3843d
            int r1 = r6.f3843d
            int r0 = r0 - r1
            r11.f3843d = r0
        L_0x00ec:
            int r0 = r11.f3841b
            int r1 = r13.f3841b
            if (r0 < r1) goto L_0x00f9
            int r0 = r11.f3841b
            int r1 = r13.f3843d
            int r0 = r0 - r1
            r11.f3841b = r0
        L_0x00f9:
            int r0 = r11.f3843d
            int r1 = r13.f3841b
            if (r0 < r1) goto L_0x0100
            goto L_0x00c8
        L_0x0100:
            r9.set(r10, r13)
            int r13 = r11.f3841b
            int r0 = r11.f3843d
            if (r13 == r0) goto L_0x010d
            r9.set(r12, r11)
            goto L_0x0110
        L_0x010d:
            r9.remove(r12)
        L_0x0110:
            if (r6 == 0) goto L_0x0115
            r9.add(r10, r6)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1045as.mo5175a(java.util.List, int, android.support.v7.widget.e$b, int, android.support.v7.widget.e$b):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5176b(java.util.List<android.support.p023v7.widget.C1103e.C1105b> r8, int r9, android.support.p023v7.widget.C1103e.C1105b r10, int r11, android.support.p023v7.widget.C1103e.C1105b r12) {
        /*
            r7 = this;
            int r0 = r10.f3843d
            int r1 = r12.f3841b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000f
            int r0 = r12.f3841b
            int r0 = r0 - r4
            r12.f3841b = r0
            goto L_0x0028
        L_0x000f:
            int r0 = r10.f3843d
            int r1 = r12.f3841b
            int r5 = r12.f3843d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0028
            int r0 = r12.f3843d
            int r0 = r0 - r4
            r12.f3843d = r0
            android.support.v7.widget.as$a r0 = r7.f3630a
            int r1 = r10.f3841b
            java.lang.Object r5 = r12.f3842c
            android.support.v7.widget.e$b r0 = r0.mo5177a(r2, r1, r4, r5)
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            int r1 = r10.f3841b
            int r5 = r12.f3841b
            if (r1 > r5) goto L_0x0035
            int r1 = r12.f3841b
            int r1 = r1 + r4
            r12.f3841b = r1
            goto L_0x0056
        L_0x0035:
            int r1 = r10.f3841b
            int r5 = r12.f3841b
            int r6 = r12.f3843d
            int r5 = r5 + r6
            if (r1 >= r5) goto L_0x0056
            int r1 = r12.f3841b
            int r3 = r12.f3843d
            int r1 = r1 + r3
            int r3 = r10.f3841b
            int r1 = r1 - r3
            android.support.v7.widget.as$a r3 = r7.f3630a
            int r5 = r10.f3841b
            int r5 = r5 + r4
            java.lang.Object r4 = r12.f3842c
            android.support.v7.widget.e$b r3 = r3.mo5177a(r2, r5, r1, r4)
            int r2 = r12.f3843d
            int r2 = r2 - r1
            r12.f3843d = r2
        L_0x0056:
            r8.set(r11, r10)
            int r10 = r12.f3843d
            if (r10 <= 0) goto L_0x0061
            r8.set(r9, r12)
            goto L_0x0069
        L_0x0061:
            r8.remove(r9)
            android.support.v7.widget.as$a r10 = r7.f3630a
            r10.mo5178a(r12)
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            r8.add(r9, r0)
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r8.add(r9, r3)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p023v7.widget.C1045as.mo5176b(java.util.List, int, android.support.v7.widget.e$b, int, android.support.v7.widget.e$b):void");
    }
}
