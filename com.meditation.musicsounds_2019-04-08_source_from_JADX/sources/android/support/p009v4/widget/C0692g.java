package android.support.p009v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

/* renamed from: android.support.v4.widget.g */
class C0692g extends Filter {

    /* renamed from: a */
    C0693a f2036a;

    /* renamed from: android.support.v4.widget.g$a */
    interface C0693a {
        /* renamed from: a */
        Cursor mo2860a();

        /* renamed from: a */
        Cursor mo2861a(CharSequence charSequence);

        /* renamed from: a */
        void mo2864a(Cursor cursor);

        /* renamed from: c */
        CharSequence mo2869c(Cursor cursor);
    }

    C0692g(C0693a aVar) {
        this.f2036a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f2036a.mo2869c((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f2036a.mo2861a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
        } else {
            filterResults.count = 0;
            a = null;
        }
        filterResults.values = a;
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f2036a.mo2860a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f2036a.mo2864a((Cursor) filterResults.values);
        }
    }
}
