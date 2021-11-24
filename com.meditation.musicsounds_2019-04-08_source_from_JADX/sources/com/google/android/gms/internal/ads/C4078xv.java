package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4079xw;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.ads.xv */
public final class C4078xv<T_WRAPPER extends C4079xw<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    public static final C4078xv<C4081xy, Cipher> f15056a = new C4078xv<>(new C4081xy());

    /* renamed from: b */
    public static final C4078xv<C4086yc, Mac> f15057b = new C4078xv<>(new C4086yc());

    /* renamed from: c */
    public static final C4078xv<C4082xz, KeyAgreement> f15058c = new C4078xv<>(new C4082xz());

    /* renamed from: d */
    public static final C4078xv<C4085yb, KeyPairGenerator> f15059d = new C4078xv<>(new C4085yb());

    /* renamed from: e */
    public static final C4078xv<C4084ya, KeyFactory> f15060e = new C4078xv<>(new C4084ya());

    /* renamed from: f */
    private static final Logger f15061f = Logger.getLogger(C4078xv.class.getName());

    /* renamed from: g */
    private static final List<Provider> f15062g;

    /* renamed from: h */
    private static final C4078xv<C4088ye, Signature> f15063h = new C4078xv<>(new C4088ye());

    /* renamed from: i */
    private static final C4078xv<C4087yd, MessageDigest> f15064i = new C4078xv<>(new C4087yd());

    /* renamed from: j */
    private T_WRAPPER f15065j;

    /* renamed from: k */
    private List<Provider> f15066k = f15062g;

    /* renamed from: l */
    private boolean f15067l = true;

    static {
        if (C4097yn.m20375a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f15061f.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f15062g = arrayList;
        } else {
            f15062g = new ArrayList();
        }
    }

    private C4078xv(T_WRAPPER t_wrapper) {
        this.f15065j = t_wrapper;
    }

    /* renamed from: a */
    private final boolean m20342a(String str, Provider provider) {
        try {
            this.f15065j.mo13823a(str, provider);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final T_ENGINE mo13822a(String str) {
        T_WRAPPER t_wrapper;
        Provider provider;
        Iterator it = this.f15066k.iterator();
        while (true) {
            if (it.hasNext()) {
                provider = (Provider) it.next();
                if (m20342a(str, provider)) {
                    t_wrapper = this.f15065j;
                    break;
                }
            } else if (this.f15067l) {
                t_wrapper = this.f15065j;
                provider = null;
            } else {
                throw new GeneralSecurityException("No good Provider found.");
            }
        }
        return t_wrapper.mo13823a(str, provider);
    }
}
