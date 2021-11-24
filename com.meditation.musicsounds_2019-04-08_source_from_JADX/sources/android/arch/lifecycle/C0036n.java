package android.arch.lifecycle;

/* renamed from: android.arch.lifecycle.n */
public class C0036n {

    /* renamed from: a */
    private final C0037a f68a;

    /* renamed from: b */
    private final C0038o f69b;

    /* renamed from: android.arch.lifecycle.n$a */
    public interface C0037a {
        /* renamed from: a */
        <T extends C0035m> T mo84a(Class<T> cls);
    }

    public C0036n(C0038o oVar, C0037a aVar) {
        this.f68a = aVar;
        this.f69b = oVar;
    }

    /* renamed from: a */
    public <T extends C0035m> T mo82a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo83a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0035m> T mo83a(String str, Class<T> cls) {
        T a = this.f69b.mo85a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f68a.mo84a(cls);
        this.f69b.mo87a(str, a2);
        return a2;
    }
}
