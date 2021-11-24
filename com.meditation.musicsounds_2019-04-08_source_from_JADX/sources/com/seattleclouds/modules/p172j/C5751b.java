package com.seattleclouds.modules.p172j;

/* renamed from: com.seattleclouds.modules.j.b */
class C5751b {

    /* renamed from: a */
    private int f20394a = 0;

    /* renamed from: b */
    private int f20395b = 1000;

    public C5751b(String str, String str2) {
        mo18426b(m28343a(str));
        mo18427c(m28343a(str2));
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m28343a(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L_0x0037
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r3.split(r0)
            r0 = 0
        L_0x000e:
            int r2 = r3.length
            if (r1 >= r2) goto L_0x0038
            switch(r1) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0020;
                case 2: goto L_0x0017;
                default: goto L_0x0014;
            }
        L_0x0014:
            int r0 = r0 + 10
            goto L_0x0034
        L_0x0017:
            r2 = r3[r1]     // Catch:{ Exception -> 0x0034 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0034 }
            int r2 = r2 * 10
            goto L_0x0033
        L_0x0020:
            r2 = r3[r1]     // Catch:{ Exception -> 0x0034 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0034 }
            int r2 = r2 * 1000
            goto L_0x0033
        L_0x0029:
            r2 = r3[r1]     // Catch:{ Exception -> 0x0034 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x0034 }
            int r2 = r2 * 1000
            int r2 = r2 * 60
        L_0x0033:
            int r0 = r0 + r2
        L_0x0034:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0037:
            r0 = 0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.seattleclouds.modules.p172j.C5751b.m28343a(java.lang.String):int");
    }

    /* renamed from: a */
    public Boolean mo18425a(int i) {
        return Boolean.valueOf(i >= this.f20394a && i <= this.f20395b);
    }

    /* renamed from: b */
    public void mo18426b(int i) {
        this.f20394a = i;
    }

    /* renamed from: c */
    public void mo18427c(int i) {
        this.f20395b = i;
    }
}
