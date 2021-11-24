package org.slf4j.helpers;

/* renamed from: org.slf4j.helpers.a */
public class C6878a {

    /* renamed from: a */
    public static C6878a f23829a = new C6878a(null);

    /* renamed from: b */
    private String f23830b;

    /* renamed from: c */
    private Throwable f23831c;

    /* renamed from: d */
    private Object[] f23832d;

    public C6878a(String str) {
        this(str, null, null);
    }

    public C6878a(String str, Object[] objArr, Throwable th) {
        this.f23830b = str;
        this.f23831c = th;
        if (th == null) {
            this.f23832d = objArr;
        } else {
            this.f23832d = m32909a(objArr);
        }
    }

    /* renamed from: a */
    static Object[] m32909a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        return objArr2;
    }

    /* renamed from: a */
    public String mo21538a() {
        return this.f23830b;
    }
}
