package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4371fb;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.fk */
abstract class C4381fk<T extends C4371fb> {

    /* renamed from: a */
    private static final Logger f16112a = Logger.getLogger(zztv.class.getName());

    /* renamed from: b */
    private static String f16113b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C4381fk() {
    }

    /* renamed from: a */
    static <T extends C4371fb> T m21563a(Class<T> cls) {
        String str;
        ClassLoader classLoader = C4381fk.class.getClassLoader();
        if (cls.equals(C4371fb.class)) {
            str = f16113b;
        } else if (cls.getPackage().equals(C4381fk.class.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C4371fb) cls.cast(((C4381fk) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo14489a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(C4381fk.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((C4371fb) cls.cast(((C4381fk) it.next()).mo14489a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f16112a;
                    Level level = Level.SEVERE;
                    String str2 = "com.google.protobuf.GeneratedExtensionRegistryLoader";
                    String str3 = "load";
                    String str4 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, str2, str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C4371fb) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C4371fb) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo14489a();
}
