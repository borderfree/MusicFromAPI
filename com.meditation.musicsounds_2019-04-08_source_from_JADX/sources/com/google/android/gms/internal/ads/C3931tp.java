package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C4035wq.C4037b;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.tp */
public final class C3931tp {

    /* renamed from: a */
    private static final Logger f14952a = Logger.getLogger(C3931tp.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, C3923th> f14953b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, Boolean> f14954c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, C3917tb> f14955d = new ConcurrentHashMap();

    /* renamed from: a */
    public static <P> abl m19894a(String str, abl abl) {
        C3923th b = m19904b(str);
        if (((Boolean) f14954c.get(str)).booleanValue()) {
            return b.mo13692b(abl);
        }
        String str2 = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: a */
    public static <P> C3917tb<P> m19895a(String str) {
        String str2;
        String str3;
        if (str != null) {
            C3917tb<P> tbVar = (C3917tb) f14955d.get(str.toLowerCase());
            if (tbVar != null) {
                return tbVar;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = String.valueOf(format).concat("Maybe call AeadConfig.init().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call DeterministicAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call StreamingAeadConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call HybridConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call MacConfig.init().";
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                str2 = String.valueOf(format);
                str3 = "Maybe call SignatureConfig.init().";
            } else {
                if (str.toLowerCase().startsWith("tink")) {
                    str2 = String.valueOf(format);
                    str3 = "Maybe call TinkConfig.init().";
                }
                throw new GeneralSecurityException(format);
            }
            format = str2.concat(str3);
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    /* renamed from: a */
    public static <P> C3929tn<P> m19896a(C3924ti tiVar, C3923th<P> thVar) {
        C3932tq.m19907b(tiVar.mo13695a());
        C3929tn<P> tnVar = new C3929tn<>();
        for (C4037b bVar : tiVar.mo13695a().mo13788b()) {
            if (bVar.mo13792c() == zzaxl.ENABLED) {
                C3930to a = tnVar.mo13701a(m19898a(bVar.mo13791b().mo13898a(), bVar.mo13791b().mo13899b()), bVar);
                if (bVar.mo13793d() == tiVar.mo13695a().mo13787a()) {
                    tnVar.mo13702a(a);
                }
            }
        }
        return tnVar;
    }

    /* renamed from: a */
    public static <P> zzaxi m19897a(C4029wm wmVar) {
        C3923th b = m19904b(wmVar.mo13775a());
        if (((Boolean) f14954c.get(wmVar.mo13775a())).booleanValue()) {
            return b.mo13694c(wmVar.mo13776b());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(wmVar.mo13775a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: a */
    private static <P> P m19898a(String str, zzbah zzbah) {
        return m19904b(str).mo13691a(zzbah);
    }

    /* renamed from: a */
    public static <P> P m19899a(String str, byte[] bArr) {
        return m19898a(str, zzbah.zzo(bArr));
    }

    /* renamed from: a */
    public static synchronized <P> void m19900a(String str, C3917tb<P> tbVar) {
        synchronized (C3931tp.class) {
            if (f14955d.containsKey(str.toLowerCase())) {
                if (!tbVar.getClass().equals(((C3917tb) f14955d.get(str.toLowerCase())).getClass())) {
                    Logger logger = f14952a;
                    Level level = Level.WARNING;
                    String str2 = "com.google.crypto.tink.Registry";
                    String str3 = "addCatalogue";
                    String str4 = "Attempted overwrite of a catalogueName catalogue for name ";
                    String valueOf = String.valueOf(str);
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
                    sb.append("catalogue for name ");
                    sb.append(str);
                    sb.append(" has been already registered");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            f14955d.put(str.toLowerCase(), tbVar);
        }
    }

    /* renamed from: a */
    public static <P> void m19901a(String str, C3923th<P> thVar) {
        m19902a(str, thVar, true);
    }

    /* renamed from: a */
    public static synchronized <P> void m19902a(String str, C3923th<P> thVar, boolean z) {
        synchronized (C3931tp.class) {
            if (thVar != null) {
                if (f14953b.containsKey(str)) {
                    C3923th b = m19904b(str);
                    boolean booleanValue = ((Boolean) f14954c.get(str)).booleanValue();
                    if (!thVar.getClass().equals(b.getClass()) || (!booleanValue && z)) {
                        Logger logger = f14952a;
                        Level level = Level.WARNING;
                        String str2 = "com.google.crypto.tink.Registry";
                        String str3 = "registerKeyManager";
                        String str4 = "Attempted overwrite of a registered key manager for key type ";
                        String valueOf = String.valueOf(str);
                        logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                        throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{str, b.getClass().getName(), thVar.getClass().getName()}));
                    }
                }
                f14953b.put(str, thVar);
                f14954c.put(str, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    /* renamed from: b */
    public static <P> abl m19903b(C4029wm wmVar) {
        C3923th b = m19904b(wmVar.mo13775a());
        if (((Boolean) f14954c.get(wmVar.mo13775a())).booleanValue()) {
            return b.mo13693b(wmVar.mo13776b());
        }
        String str = "newKey-operation not permitted for key type ";
        String valueOf = String.valueOf(wmVar.mo13775a());
        throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    /* renamed from: b */
    private static <P> C3923th<P> m19904b(String str) {
        C3923th<P> thVar = (C3923th) f14953b.get(str);
        if (thVar != null) {
            return thVar;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78);
        sb.append("No key manager found for key type: ");
        sb.append(str);
        sb.append(".  Check the configuration of the registry.");
        throw new GeneralSecurityException(sb.toString());
    }

    /* renamed from: b */
    public static <P> P m19905b(String str, abl abl) {
        return m19904b(str).mo13690a(abl);
    }
}
