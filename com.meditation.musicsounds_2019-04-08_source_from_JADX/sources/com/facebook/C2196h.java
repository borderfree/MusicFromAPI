package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.h */
public class C2196h extends AbstractList<GraphRequest> {

    /* renamed from: a */
    private static AtomicInteger f7132a = new AtomicInteger();

    /* renamed from: b */
    private Handler f7133b;

    /* renamed from: c */
    private List<GraphRequest> f7134c;

    /* renamed from: d */
    private int f7135d;

    /* renamed from: e */
    private final String f7136e;

    /* renamed from: f */
    private List<C2197a> f7137f;

    /* renamed from: g */
    private String f7138g;

    /* renamed from: com.facebook.h$a */
    public interface C2197a {
        /* renamed from: a */
        void mo7740a(C2196h hVar);
    }

    /* renamed from: com.facebook.h$b */
    public interface C2198b extends C2197a {
        /* renamed from: a */
        void mo7794a(C2196h hVar, long j, long j2);
    }

    public C2196h() {
        this.f7134c = new ArrayList();
        this.f7135d = 0;
        this.f7136e = Integer.valueOf(f7132a.incrementAndGet()).toString();
        this.f7137f = new ArrayList();
        this.f7134c = new ArrayList();
    }

    public C2196h(Collection<GraphRequest> collection) {
        this.f7134c = new ArrayList();
        this.f7135d = 0;
        this.f7136e = Integer.valueOf(f7132a.incrementAndGet()).toString();
        this.f7137f = new ArrayList();
        this.f7134c = new ArrayList(collection);
    }

    public C2196h(GraphRequest... graphRequestArr) {
        this.f7134c = new ArrayList();
        this.f7135d = 0;
        this.f7136e = Integer.valueOf(f7132a.incrementAndGet()).toString();
        this.f7137f = new ArrayList();
        this.f7134c = Arrays.asList(graphRequestArr);
    }

    /* renamed from: a */
    public int mo7770a() {
        return this.f7135d;
    }

    /* renamed from: a */
    public final GraphRequest get(int i) {
        return (GraphRequest) this.f7134c.get(i);
    }

    /* renamed from: a */
    public final void add(int i, GraphRequest graphRequest) {
        this.f7134c.add(i, graphRequest);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7773a(Handler handler) {
        this.f7133b = handler;
    }

    /* renamed from: a */
    public void mo7774a(C2197a aVar) {
        if (!this.f7137f.contains(aVar)) {
            this.f7137f.add(aVar);
        }
    }

    /* renamed from: a */
    public final boolean add(GraphRequest graphRequest) {
        return this.f7134c.add(graphRequest);
    }

    /* renamed from: b */
    public final GraphRequest remove(int i) {
        return (GraphRequest) this.f7134c.remove(i);
    }

    /* renamed from: b */
    public final GraphRequest set(int i, GraphRequest graphRequest) {
        return (GraphRequest) this.f7134c.set(i, graphRequest);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final String mo7780b() {
        return this.f7136e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Handler mo7781c() {
        return this.f7133b;
    }

    public final void clear() {
        this.f7134c.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final List<GraphRequest> mo7783d() {
        return this.f7134c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final List<C2197a> mo7784e() {
        return this.f7137f;
    }

    /* renamed from: f */
    public final String mo7785f() {
        return this.f7138g;
    }

    /* renamed from: g */
    public final List<C2199i> mo7786g() {
        return mo7789i();
    }

    /* renamed from: h */
    public final C2195g mo7788h() {
        return mo7790j();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public List<C2199i> mo7789i() {
        return GraphRequest.m8047b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C2195g mo7790j() {
        return GraphRequest.m8050c(this);
    }

    public final int size() {
        return this.f7134c.size();
    }
}
