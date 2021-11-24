package android.support.p009v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: android.support.v4.widget.n */
public abstract class C0709n extends C0689f {

    /* renamed from: j */
    private int f2048j;

    /* renamed from: k */
    private int f2049k;

    /* renamed from: l */
    private LayoutInflater f2050l;

    @Deprecated
    public C0709n(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f2049k = i;
        this.f2048j = i;
        this.f2050l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: a */
    public View mo2862a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2050l.inflate(this.f2048j, viewGroup, false);
    }

    /* renamed from: b */
    public View mo2867b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f2050l.inflate(this.f2049k, viewGroup, false);
    }
}
