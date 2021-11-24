package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C1375c;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: a */
    private static final StackTraceElement[] f4678a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private C1375c key;

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C1386a implements Appendable {

        /* renamed from: a */
        private final Appendable f4679a;

        /* renamed from: b */
        private boolean f4680b = true;

        C1386a(Appendable appendable) {
            this.f4679a = appendable;
        }

        /* renamed from: a */
        private CharSequence m7106a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f4680b) {
                this.f4680b = false;
                this.f4679a.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f4680b = z;
            this.f4679a.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            CharSequence a = m7106a(charSequence);
            return append(a, 0, a.length());
        }

        public Appendable append(CharSequence charSequence, int i, int i2) {
            CharSequence a = m7106a(charSequence);
            boolean z = false;
            if (this.f4680b) {
                this.f4680b = false;
                this.f4679a.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f4680b = z;
            this.f4679a.append(a, i, i2);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f4678a);
        this.causes = list;
    }

    /* renamed from: a */
    private void m7101a(Appendable appendable) {
        m7102a((Throwable) this, appendable);
        m7104a(getCauses(), (Appendable) new C1386a(appendable));
    }

    /* renamed from: a */
    private static void m7102a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private void m7103a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).getCauses()) {
                m7103a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private static void m7104a(List<Throwable> list, Appendable appendable) {
        try {
            m7105b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    private static void m7105b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m7101a(appendable);
            } else {
                m7102a(th, appendable);
            }
            i = i2;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public List<Throwable> getCauses() {
        return this.causes;
    }

    public String getMessage() {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.detailMessage);
        if (this.dataClass != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(this.dataClass);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.dataSource != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", ");
            sb3.append(this.dataSource);
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.key != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", ");
            sb4.append(this.key);
            str3 = sb4.toString();
        } else {
            str3 = "";
        }
        sb.append(str3);
        List<Throwable> rootCauses = getRootCauses();
        if (rootCauses.isEmpty()) {
            return sb.toString();
        }
        if (rootCauses.size() == 1) {
            str4 = "\nThere was 1 cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(rootCauses.size());
            str4 = " causes:";
        }
        sb.append(str4);
        for (Throwable th : rootCauses) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public List<Throwable> getRootCauses() {
        ArrayList arrayList = new ArrayList();
        m7103a((Throwable) this, (List<Throwable>) arrayList);
        return arrayList;
    }

    public void logRootCauses(String str) {
        List rootCauses = getRootCauses();
        int size = rootCauses.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) rootCauses.get(i));
            i = i2;
        }
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m7101a(printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        m7101a(printWriter);
    }

    /* access modifiers changed from: 0000 */
    public void setLoggingDetails(C1375c cVar, DataSource dataSource2) {
        setLoggingDetails(cVar, dataSource2, null);
    }

    /* access modifiers changed from: 0000 */
    public void setLoggingDetails(C1375c cVar, DataSource dataSource2, Class<?> cls) {
        this.key = cVar;
        this.dataSource = dataSource2;
        this.dataClass = cls;
    }
}
