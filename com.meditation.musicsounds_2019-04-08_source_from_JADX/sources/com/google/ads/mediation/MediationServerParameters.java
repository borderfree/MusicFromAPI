package com.google.ads.mediation;

import com.google.android.gms.internal.ads.C3731me;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class MediationServerParameters {

    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Parameter {
        String name();

        boolean required() default true;
    }

    public void load(Map<String, String> map) {
        Field[] fields;
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            Parameter parameter = (Parameter) field.getAnnotation(Parameter.class);
            if (parameter != null) {
                hashMap.put(parameter.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            C3731me.m19178e("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Entry entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String str2 = (String) entry.getKey();
                    sb = new StringBuilder(String.valueOf(str2).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str2);
                    str = "\" could not be set: Illegal Access";
                } catch (IllegalArgumentException unused2) {
                    String str3 = (String) entry.getKey();
                    sb = new StringBuilder(String.valueOf(str3).length() + 43);
                    sb.append("Server option \"");
                    sb.append(str3);
                    str = "\" could not be set: Bad Type";
                }
            } else {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str4).length() + 31 + String.valueOf(str5).length());
                sb2.append("Unexpected server option: ");
                sb2.append(str4);
                sb2.append(" = \"");
                sb2.append(str5);
                sb2.append("\"");
                C3731me.m19172b(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((Parameter) field3.getAnnotation(Parameter.class)).required()) {
                String str6 = "Required server option missing: ";
                String valueOf = String.valueOf(((Parameter) field3.getAnnotation(Parameter.class)).name());
                C3731me.m19178e(valueOf.length() != 0 ? str6.concat(valueOf) : new String(str6));
                if (sb3.length() > 0) {
                    sb3.append(", ");
                }
                sb3.append(((Parameter) field3.getAnnotation(Parameter.class)).name());
            }
        }
        if (sb3.length() > 0) {
            String str7 = "Required server option(s) missing: ";
            String valueOf2 = String.valueOf(sb3.toString());
            throw new MappingException(valueOf2.length() != 0 ? str7.concat(valueOf2) : new String(str7));
        }
        return;
        sb.append(str);
        C3731me.m19178e(sb.toString());
    }
}
