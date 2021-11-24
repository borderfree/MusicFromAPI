package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.C2699a.C2700a;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.extractor.j */
public final class C2653j {

    /* renamed from: a */
    public static final C2700a f9007a = new C2700a() {
        /* renamed from: a */
        public boolean mo9122a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }
    };

    /* renamed from: d */
    private static final Pattern f9008d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: b */
    public int f9009b = -1;

    /* renamed from: c */
    public int f9010c = -1;

    /* renamed from: a */
    private boolean m12516a(String str, String str2) {
        if (!"iTunSMPB".equals(str)) {
            return false;
        }
        Matcher matcher = f9008d.matcher(str2);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1), 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f9009b = parseInt;
                    this.f9010c = parseInt2;
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo9119a() {
        return (this.f9009b == -1 || this.f9010c == -1) ? false : true;
    }

    /* renamed from: a */
    public boolean mo9120a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 <= 0 && i3 <= 0) {
            return false;
        }
        this.f9009b = i2;
        this.f9010c = i3;
        return true;
    }

    /* renamed from: a */
    public boolean mo9121a(Metadata metadata) {
        for (int i = 0; i < metadata.mo9181a(); i++) {
            Entry a = metadata.mo9182a(i);
            if (a instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) a;
                if (m12516a(commentFrame.f9211b, commentFrame.f9212c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
