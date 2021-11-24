package android.support.p009v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

/* renamed from: android.support.v4.widget.f */
public abstract class C0689f extends BaseAdapter implements C0693a, Filterable {

    /* renamed from: a */
    protected boolean f2025a;

    /* renamed from: b */
    protected boolean f2026b;

    /* renamed from: c */
    protected Cursor f2027c;

    /* renamed from: d */
    protected Context f2028d;

    /* renamed from: e */
    protected int f2029e;

    /* renamed from: f */
    protected C0690a f2030f;

    /* renamed from: g */
    protected DataSetObserver f2031g;

    /* renamed from: h */
    protected C0692g f2032h;

    /* renamed from: i */
    protected FilterQueryProvider f2033i;

    /* renamed from: android.support.v4.widget.f$a */
    private class C0690a extends ContentObserver {
        C0690a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z) {
            C0689f.this.mo2868b();
        }
    }

    /* renamed from: android.support.v4.widget.f$b */
    private class C0691b extends DataSetObserver {
        C0691b() {
        }

        public void onChanged() {
            C0689f.this.f2025a = true;
            C0689f.this.notifyDataSetChanged();
        }

        public void onInvalidated() {
            C0689f.this.f2025a = false;
            C0689f.this.notifyDataSetInvalidated();
        }
    }

    public C0689f(Context context, Cursor cursor, int i) {
        mo2863a(context, cursor, i);
    }

    public C0689f(Context context, Cursor cursor, boolean z) {
        mo2863a(context, cursor, z ? 1 : 2);
    }

    /* renamed from: a */
    public Cursor mo2860a() {
        return this.f2027c;
    }

    /* renamed from: a */
    public Cursor mo2861a(CharSequence charSequence) {
        return this.f2033i != null ? this.f2033i.runQuery(charSequence) : this.f2027c;
    }

    /* renamed from: a */
    public abstract View mo2862a(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2863a(Context context, Cursor cursor, int i) {
        C0691b bVar;
        boolean z = false;
        if ((i & 1) == 1) {
            i |= 2;
            this.f2026b = true;
        } else {
            this.f2026b = false;
        }
        if (cursor != null) {
            z = true;
        }
        this.f2027c = cursor;
        this.f2025a = z;
        this.f2028d = context;
        this.f2029e = z ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f2030f = new C0690a();
            bVar = new C0691b();
        } else {
            bVar = null;
            this.f2030f = null;
        }
        this.f2031g = bVar;
        if (z) {
            if (this.f2030f != null) {
                cursor.registerContentObserver(this.f2030f);
            }
            if (this.f2031g != null) {
                cursor.registerDataSetObserver(this.f2031g);
            }
        }
    }

    /* renamed from: a */
    public void mo2864a(Cursor cursor) {
        Cursor b = mo2866b(cursor);
        if (b != null) {
            b.close();
        }
    }

    /* renamed from: a */
    public abstract void mo2865a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public Cursor mo2866b(Cursor cursor) {
        if (cursor == this.f2027c) {
            return null;
        }
        Cursor cursor2 = this.f2027c;
        if (cursor2 != null) {
            if (this.f2030f != null) {
                cursor2.unregisterContentObserver(this.f2030f);
            }
            if (this.f2031g != null) {
                cursor2.unregisterDataSetObserver(this.f2031g);
            }
        }
        this.f2027c = cursor;
        if (cursor != null) {
            if (this.f2030f != null) {
                cursor.registerContentObserver(this.f2030f);
            }
            if (this.f2031g != null) {
                cursor.registerDataSetObserver(this.f2031g);
            }
            this.f2029e = cursor.getColumnIndexOrThrow("_id");
            this.f2025a = true;
            notifyDataSetChanged();
        } else {
            this.f2029e = -1;
            this.f2025a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* renamed from: b */
    public View mo2867b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo2862a(context, cursor, viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2868b() {
        if (this.f2026b && this.f2027c != null && !this.f2027c.isClosed()) {
            this.f2025a = this.f2027c.requery();
        }
    }

    /* renamed from: c */
    public CharSequence mo2869c(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public int getCount() {
        if (!this.f2025a || this.f2027c == null) {
            return 0;
        }
        return this.f2027c.getCount();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2025a) {
            return null;
        }
        this.f2027c.moveToPosition(i);
        if (view == null) {
            view = mo2867b(this.f2028d, this.f2027c, viewGroup);
        }
        mo2865a(view, this.f2028d, this.f2027c);
        return view;
    }

    public Filter getFilter() {
        if (this.f2032h == null) {
            this.f2032h = new C0692g(this);
        }
        return this.f2032h;
    }

    public Object getItem(int i) {
        if (!this.f2025a || this.f2027c == null) {
            return null;
        }
        this.f2027c.moveToPosition(i);
        return this.f2027c;
    }

    public long getItemId(int i) {
        if (!this.f2025a || this.f2027c == null || !this.f2027c.moveToPosition(i)) {
            return 0;
        }
        return this.f2027c.getLong(this.f2029e);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f2025a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f2027c.moveToPosition(i)) {
            if (view == null) {
                view = mo2862a(this.f2028d, this.f2027c, viewGroup);
            }
            mo2865a(view, this.f2028d, this.f2027c);
            return view;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("couldn't move cursor to position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean hasStableIds() {
        return true;
    }
}
