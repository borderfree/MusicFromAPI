package com.google.android.vending.licensing;

/* renamed from: com.google.android.vending.licensing.g */
class C4871g {

    /* renamed from: a */
    private final C4874j f17547a;

    /* renamed from: b */
    private final C4870f f17548b;

    /* renamed from: c */
    private final int f17549c;

    /* renamed from: d */
    private final String f17550d;

    /* renamed from: e */
    private final String f17551e;

    /* renamed from: f */
    private final C4862c f17552f;

    C4871g(C4874j jVar, C4862c cVar, C4870f fVar, int i, String str, String str2) {
        this.f17547a = jVar;
        this.f17552f = cVar;
        this.f17548b = fVar;
        this.f17549c = i;
        this.f17550d = str;
        this.f17551e = str2;
    }

    /* renamed from: a */
    private void m24356a(int i) {
        this.f17548b.mo15999c(i);
    }

    /* renamed from: a */
    private void m24357a(int i, C4876l lVar) {
        this.f17547a.mo16055a(i, lVar);
        if (this.f17547a.mo16061c()) {
            this.f17548b.mo15997a(i);
        } else {
            this.f17548b.mo15998b(i);
        }
    }

    /* renamed from: d */
    private void m24358d() {
        this.f17548b.mo15998b(561);
    }

    /* renamed from: a */
    public C4870f mo16073a() {
        return this.f17548b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        android.util.Log.w(r4, r5);
        m24357a(291, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d1, code lost:
        m24357a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16074a(java.security.PublicKey r4, int r5, java.lang.String r6, java.lang.String r7) {
        /*
            r3 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x000d
            if (r5 == r1) goto L_0x000d
            if (r5 != r0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            r4 = r2
            goto L_0x0093
        L_0x000d:
            java.lang.String r2 = "SHA1withRSA"
            java.security.Signature r2 = java.security.Signature.getInstance(r2)     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            r2.initVerify(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            byte[] r4 = r6.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            r2.update(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            byte[] r4 = com.google.android.vending.licensing.util.C4878a.m24383a(r7)     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            boolean r4 = r2.verify(r4)     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Signature verification failed."
            android.util.Log.e(r4, r5)     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            r3.m24358d()     // Catch:{ NoSuchAlgorithmException -> 0x00f7, InvalidKeyException -> 0x00f2, SignatureException -> 0x00eb, Base64DecoderException -> 0x00e0 }
            return
        L_0x0032:
            com.google.android.vending.licensing.l r2 = com.google.android.vending.licensing.C4876l.m24371a(r6)     // Catch:{ IllegalArgumentException -> 0x00d5 }
            int r4 = r2.f17556a
            if (r4 == r5) goto L_0x0045
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Response codes don't match."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x0045:
            int r4 = r2.f17557b
            int r6 = r3.f17549c
            if (r4 == r6) goto L_0x0056
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Nonce doesn't match."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x0056:
            java.lang.String r4 = r2.f17558c
            java.lang.String r6 = r3.f17550d
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x006b
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Package name doesn't match."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x006b:
            java.lang.String r4 = r2.f17559d
            java.lang.String r6 = r3.f17551e
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Version codes don't match."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x0080:
            java.lang.String r4 = r2.f17560e
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 == 0) goto L_0x0093
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "User identifier is empty."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x0093:
            r6 = 291(0x123, float:4.08E-43)
            switch(r5) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00cb;
                case 3: goto L_0x00c3;
                case 4: goto L_0x00b8;
                case 5: goto L_0x00b3;
                default: goto L_0x0098;
            }
        L_0x0098:
            switch(r5) {
                case 257: goto L_0x00ae;
                case 258: goto L_0x00aa;
                case 259: goto L_0x00a6;
                default: goto L_0x009b;
            }
        L_0x009b:
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Unknown response code for license check."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            goto L_0x00d4
        L_0x00a6:
            r3.m24356a(r0)
            goto L_0x00d4
        L_0x00aa:
            r3.m24356a(r1)
            goto L_0x00d4
        L_0x00ae:
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Error contacting licensing server."
            goto L_0x00bc
        L_0x00b3:
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Licensing server is refusing to talk to this device, over quota."
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "An error has occurred on the licensing server."
        L_0x00bc:
            android.util.Log.w(r4, r5)
            r3.m24357a(r6, r2)
            goto L_0x00d4
        L_0x00c3:
            r4 = 3
            r3.m24356a(r4)
            goto L_0x00d4
        L_0x00c8:
            r4 = 561(0x231, float:7.86E-43)
            goto L_0x00d1
        L_0x00cb:
            com.google.android.vending.licensing.c r5 = r3.f17552f
            int r4 = r5.mo16062a(r4)
        L_0x00d1:
            r3.m24357a(r4, r2)
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Could not parse response."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x00e0:
            java.lang.String r4 = "LicenseValidator"
            java.lang.String r5 = "Could not Base64-decode signature."
            android.util.Log.e(r4, r5)
            r3.m24358d()
            return
        L_0x00eb:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        L_0x00f2:
            r4 = 5
            r3.m24356a(r4)
            return
        L_0x00f7:
            r4 = move-exception
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.vending.licensing.C4871g.mo16074a(java.security.PublicKey, int, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public int mo16075b() {
        return this.f17549c;
    }

    /* renamed from: c */
    public String mo16076c() {
        return this.f17550d;
    }
}
