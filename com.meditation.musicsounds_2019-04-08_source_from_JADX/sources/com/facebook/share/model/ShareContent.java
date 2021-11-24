package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.C2357a;
import com.facebook.share.model.ShareHashtag.C2359a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends C2357a> implements ShareModel {

    /* renamed from: a */
    private final Uri f7481a;

    /* renamed from: b */
    private final List<String> f7482b;

    /* renamed from: c */
    private final String f7483c;

    /* renamed from: d */
    private final String f7484d;

    /* renamed from: e */
    private final String f7485e;

    /* renamed from: f */
    private final ShareHashtag f7486f;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    public static abstract class C2357a<P extends ShareContent, E extends C2357a> {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public Uri f7487a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<String> f7488b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f7489c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f7490d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f7491e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public ShareHashtag f7492f;

        /* renamed from: a */
        public E mo8192a(Uri uri) {
            this.f7487a = uri;
            return this;
        }

        /* renamed from: a */
        public E mo8193a(P p) {
            return p == null ? this : mo8192a(p.mo8186h()).mo8195a(p.mo8187i()).mo8194a(p.mo8188j()).mo8196b(p.mo8189k()).mo8197c(p.mo8190l());
        }

        /* renamed from: a */
        public E mo8194a(String str) {
            this.f7489c = str;
            return this;
        }

        /* renamed from: a */
        public E mo8195a(List<String> list) {
            this.f7488b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        /* renamed from: b */
        public E mo8196b(String str) {
            this.f7490d = str;
            return this;
        }

        /* renamed from: c */
        public E mo8197c(String str) {
            this.f7491e = str;
            return this;
        }
    }

    protected ShareContent(Parcel parcel) {
        this.f7481a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f7482b = m10948a(parcel);
        this.f7483c = parcel.readString();
        this.f7484d = parcel.readString();
        this.f7485e = parcel.readString();
        this.f7486f = new C2359a().mo8205a(parcel).mo8208a();
    }

    protected ShareContent(C2357a aVar) {
        this.f7481a = aVar.f7487a;
        this.f7482b = aVar.f7488b;
        this.f7483c = aVar.f7489c;
        this.f7484d = aVar.f7490d;
        this.f7485e = aVar.f7491e;
        this.f7486f = aVar.f7492f;
    }

    /* renamed from: a */
    private List<String> m10948a(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public Uri mo8186h() {
        return this.f7481a;
    }

    /* renamed from: i */
    public List<String> mo8187i() {
        return this.f7482b;
    }

    /* renamed from: j */
    public String mo8188j() {
        return this.f7483c;
    }

    /* renamed from: k */
    public String mo8189k() {
        return this.f7484d;
    }

    /* renamed from: l */
    public String mo8190l() {
        return this.f7485e;
    }

    /* renamed from: m */
    public ShareHashtag mo8191m() {
        return this.f7486f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7481a, 0);
        parcel.writeStringList(this.f7482b);
        parcel.writeString(this.f7483c);
        parcel.writeString(this.f7484d);
        parcel.writeString(this.f7485e);
        parcel.writeParcelable(this.f7486f, 0);
    }
}
