package com.google.android.exoplayer2.metadata.id3;

import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.p102c.C2488a;

public abstract class Id3Frame implements Entry {

    /* renamed from: f */
    public final String f9217f;

    public Id3Frame(String str) {
        this.f9217f = (String) C2488a.m11664a(str);
    }

    public int describeContents() {
        return 0;
    }
}
