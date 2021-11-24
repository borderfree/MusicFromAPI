package org.slf4j;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import org.slf4j.helpers.C6880c;
import org.slf4j.helpers.C6881d;
import org.slf4j.helpers.C6882e;
import org.slf4j.impl.C6884b;

/* renamed from: org.slf4j.c */
public final class C6877c {

    /* renamed from: a */
    static int f23824a;

    /* renamed from: b */
    static C6881d f23825b = new C6881d();

    /* renamed from: c */
    static C6880c f23826c = new C6880c();

    /* renamed from: d */
    private static final String[] f23827d = {"1.6"};

    /* renamed from: e */
    private static String f23828e = "org/slf4j/impl/StaticLoggerBinder.class";

    private C6877c() {
    }

    /* renamed from: a */
    public static C6875a m32900a() {
        if (f23824a == 0) {
            f23824a = 1;
            m32904b();
        }
        switch (f23824a) {
            case 1:
                return f23825b;
            case 2:
                throw new IllegalStateException("org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
            case 3:
                return C6884b.m32937a().mo21541b();
            case 4:
                return f23826c;
            default:
                throw new IllegalStateException("Unreachable code");
        }
    }

    /* renamed from: a */
    public static C6876b m32901a(Class cls) {
        return m32902a(cls.getName());
    }

    /* renamed from: a */
    public static C6876b m32902a(String str) {
        return m32900a().mo21474a(str);
    }

    /* renamed from: a */
    static void m32903a(Throwable th) {
        f23824a = 2;
        C6882e.m32931a("Failed to instantiate SLF4J LoggerFactory", th);
    }

    /* renamed from: b */
    private static final void m32904b() {
        m32908f();
        m32905c();
        if (f23824a == 3) {
            m32907e();
        }
    }

    /* renamed from: c */
    private static final void m32905c() {
        try {
            C6884b.m32937a();
            f23824a = 3;
            m32906d();
        } catch (NoClassDefFoundError e) {
            String message = e.getMessage();
            if (message == null || message.indexOf("org/slf4j/impl/StaticLoggerBinder") == -1) {
                m32903a((Throwable) e);
                throw e;
            }
            f23824a = 4;
            C6882e.m32930a("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            C6882e.m32930a("Defaulting to no-operation (NOP) logger implementation");
            C6882e.m32930a("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e2) {
            String message2 = e2.getMessage();
            if (!(message2 == null || message2.indexOf("org.slf4j.impl.StaticLoggerBinder.getSingleton()") == -1)) {
                f23824a = 2;
                C6882e.m32930a("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                C6882e.m32930a("Your binding is version 1.5.5 or earlier.");
                C6882e.m32930a("Upgrade your binding to version 1.6.x. or 2.0.x");
            }
            throw e2;
        } catch (Exception e3) {
            m32903a((Throwable) e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    /* renamed from: d */
    private static final void m32906d() {
        List a = f23825b.mo21539a();
        if (a.size() != 0) {
            C6882e.m32930a("The following loggers will not work becasue they were created");
            C6882e.m32930a("during the default configuration phase of the underlying logging system.");
            C6882e.m32930a("See also http://www.slf4j.org/codes.html#substituteLogger");
            for (int i = 0; i < a.size(); i++) {
                C6882e.m32930a((String) a.get(i));
            }
        }
    }

    /* renamed from: e */
    private static final void m32907e() {
        try {
            String str = C6884b.f23835a;
            boolean z = false;
            for (String startsWith : f23827d) {
                if (str.startsWith(startsWith)) {
                    z = true;
                }
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append("The requested version ");
                sb.append(str);
                sb.append(" by your slf4j binding is not compatible with ");
                sb.append(Arrays.asList(f23827d).toString());
                C6882e.m32930a(sb.toString());
                C6882e.m32930a("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
            }
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            C6882e.m32931a("Unexpected problem occured during version sanity check", th);
        }
    }

    /* renamed from: f */
    private static void m32908f() {
        try {
            ClassLoader classLoader = C6877c.class.getClassLoader();
            Enumeration systemResources = classLoader == null ? ClassLoader.getSystemResources(f23828e) : classLoader.getResources(f23828e);
            ArrayList arrayList = new ArrayList();
            while (systemResources.hasMoreElements()) {
                arrayList.add((URL) systemResources.nextElement());
            }
            if (arrayList.size() > 1) {
                C6882e.m32930a("Class path contains multiple SLF4J bindings.");
                for (int i = 0; i < arrayList.size(); i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Found binding in [");
                    sb.append(arrayList.get(i));
                    sb.append("]");
                    C6882e.m32930a(sb.toString());
                }
                C6882e.m32930a("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
            }
        } catch (IOException e) {
            C6882e.m32931a("Error getting resources from path", e);
        }
    }
}
