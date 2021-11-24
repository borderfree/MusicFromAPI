package com.seattleclouds;

import android.os.Bundle;
import com.seattleclouds.util.C6592al;
import com.seattleclouds.util.C6598aq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.xml.sax.Attributes;

/* renamed from: com.seattleclouds.v */
public class C6649v {

    /* renamed from: a */
    private static Map<String, C6650a> f23383a;

    /* renamed from: b */
    private C6650a f23384b;

    /* renamed from: c */
    private Map<String, String> f23385c;

    /* renamed from: d */
    private Bundle f23386d;

    /* renamed from: com.seattleclouds.v$a */
    static class C6650a extends C6651b {
        public C6650a(String str, Attributes attributes) {
            super(str, attributes);
        }
    }

    /* renamed from: com.seattleclouds.v$b */
    static class C6651b {

        /* renamed from: a */
        private String f23387a;

        /* renamed from: b */
        private Map<String, String> f23388b;

        /* renamed from: c */
        private String f23389c;

        /* renamed from: d */
        private C6651b f23390d;

        /* renamed from: e */
        private List<C6651b> f23391e;

        public C6651b(String str, Map<String, String> map) {
            this.f23387a = str;
            this.f23388b = map;
        }

        public C6651b(String str, Attributes attributes) {
            this(str, m32126a(attributes));
        }

        /* renamed from: a */
        private static Map<String, String> m32126a(Attributes attributes) {
            if (attributes == null) {
                return null;
            }
            int length = attributes.getLength();
            if (length == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < length; i++) {
                hashMap.put(attributes.getQName(i), attributes.getValue(i));
            }
            return hashMap;
        }

        /* renamed from: a */
        public String mo20640a() {
            return this.f23389c;
        }

        /* renamed from: a */
        public String mo20641a(String str) {
            if (this.f23388b != null) {
                String str2 = (String) this.f23388b.get(str);
                if (str2 != null) {
                    return str2;
                }
            }
            if (this.f23390d != null && this.f23390d.f23387a.equals(str)) {
                return this.f23390d.mo20640a();
            }
            if (this.f23391e != null) {
                int size = this.f23391e.size();
                StringBuilder sb = null;
                for (int i = 0; i < size; i++) {
                    C6651b bVar = (C6651b) this.f23391e.get(i);
                    if (bVar.f23387a.equals(str)) {
                        String a = bVar.mo20640a();
                        if (sb == null) {
                            sb = new StringBuilder();
                        }
                        if (!C6592al.m31909b(a)) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(a);
                        }
                    }
                }
                if (sb != null) {
                    return sb.toString();
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo20642a(C6651b bVar) {
            if (!(this.f23390d == null && this.f23391e == null)) {
                if (this.f23390d != null) {
                    this.f23391e = new ArrayList();
                    this.f23391e.add(this.f23390d);
                    this.f23391e.add(bVar);
                    bVar = null;
                } else {
                    this.f23391e.add(bVar);
                    return;
                }
            }
            this.f23390d = bVar;
        }

        /* renamed from: b */
        public void mo20643b(String str) {
            this.f23389c = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('<');
            sb.append(this.f23387a);
            if (this.f23388b != null) {
                for (Entry entry : this.f23388b.entrySet()) {
                    sb.append(' ');
                    sb.append((String) entry.getKey());
                    sb.append("=\"");
                    sb.append((String) entry.getValue());
                    sb.append('\"');
                }
            }
            if (C6592al.m31909b(this.f23389c)) {
                sb.append(" />");
            } else {
                sb.append('>');
                sb.append(this.f23389c);
                sb.append("</");
                sb.append(this.f23387a);
                sb.append('>');
            }
            return sb.toString();
        }
    }

    C6649v(Bundle bundle) {
        if (bundle != null) {
            m32119b(bundle);
            return;
        }
        throw m32118b("Arguments are null.");
    }

    /* renamed from: a */
    public static void m32116a(Map<String, C6650a> map) {
        f23383a = map;
    }

    /* renamed from: a */
    public static boolean m32117a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return bundle.containsKey("fragmentParam.pageId");
    }

    /* renamed from: b */
    private RuntimeException m32118b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" Probably fragment arguments are not instantiated using newFragmentArguments()");
        return new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private void m32119b(Bundle bundle) {
        String string = bundle.getString("fragmentParam.pageId");
        if (string != null) {
            String string2 = bundle.getString("fragmentParam.instanceParams");
            if (f23383a != null) {
                this.f23384b = (C6650a) f23383a.get(string);
                this.f23385c = m32120c(string2);
                this.f23386d = bundle;
                return;
            }
            throw new IllegalStateException("paramsByPageId is null. AppConfigHandler.parseAppConfig() wasn't called yet.");
        }
        throw m32118b("Page Id is null.");
    }

    /* renamed from: c */
    private Map<String, String> m32120c(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('?');
        sb.append(str);
        return C6598aq.m31939a(sb.toString());
    }

    /* renamed from: a */
    public String mo20634a() {
        return mo20636a("id", "");
    }

    /* renamed from: a */
    public String mo20635a(String str) {
        String string = this.f23386d.getString(str);
        if (string != null) {
            return string;
        }
        if (this.f23385c != null) {
            String str2 = (String) this.f23385c.get(str);
            if (str2 != null) {
                return str2;
            }
        }
        if (this.f23384b == null) {
            return null;
        }
        return this.f23384b.mo20641a(str);
    }

    /* renamed from: a */
    public String mo20636a(String str, String str2) {
        String a = mo20635a(str);
        return a != null ? a : str2;
    }

    /* renamed from: b */
    public String mo20637b() {
        return mo20636a("type", "html");
    }

    /* renamed from: c */
    public String mo20638c() {
        return mo20635a("title");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(mo20634a());
        sb.append(" - ");
        sb.append(mo20637b());
        sb.append(']');
        return sb.toString();
    }
}
