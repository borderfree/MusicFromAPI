package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;

/* renamed from: com.google.android.exoplayer2.text.f */
public interface C2779f {

    /* renamed from: a */
    public static final C2779f f9605a = new C2779f() {
        /* renamed from: a */
        public boolean mo9470a(Format format) {
            String str = format.f7738f;
            return "text/vtt".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str);
        }

        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.android.exoplayer2.text.C2776e mo9471b(com.google.android.exoplayer2.Format r3) {
            /*
                r2 = this;
                java.lang.String r0 = r3.f7738f
                int r1 = r0.hashCode()
                switch(r1) {
                    case -1351681404: goto L_0x005a;
                    case -1026075066: goto L_0x0050;
                    case -1004728940: goto L_0x0046;
                    case 691401887: goto L_0x003c;
                    case 930165504: goto L_0x0032;
                    case 1566015601: goto L_0x0028;
                    case 1566016562: goto L_0x001e;
                    case 1668750253: goto L_0x0014;
                    case 1693976202: goto L_0x000a;
                    default: goto L_0x0009;
                }
            L_0x0009:
                goto L_0x0065
            L_0x000a:
                java.lang.String r1 = "application/ttml+xml"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 2
                goto L_0x0066
            L_0x0014:
                java.lang.String r1 = "application/x-subrip"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 3
                goto L_0x0066
            L_0x001e:
                java.lang.String r1 = "application/cea-708"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 7
                goto L_0x0066
            L_0x0028:
                java.lang.String r1 = "application/cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 5
                goto L_0x0066
            L_0x0032:
                java.lang.String r1 = "application/x-mp4-cea-608"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 6
                goto L_0x0066
            L_0x003c:
                java.lang.String r1 = "application/x-quicktime-tx3g"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 4
                goto L_0x0066
            L_0x0046:
                java.lang.String r1 = "text/vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 0
                goto L_0x0066
            L_0x0050:
                java.lang.String r1 = "application/x-mp4-vtt"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 1
                goto L_0x0066
            L_0x005a:
                java.lang.String r1 = "application/dvbsubs"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0065
                r0 = 8
                goto L_0x0066
            L_0x0065:
                r0 = -1
            L_0x0066:
                switch(r0) {
                    case 0: goto L_0x00a5;
                    case 1: goto L_0x009f;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0093;
                    case 4: goto L_0x008b;
                    case 5: goto L_0x0081;
                    case 6: goto L_0x0081;
                    case 7: goto L_0x0079;
                    case 8: goto L_0x0071;
                    default: goto L_0x0069;
                }
            L_0x0069:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Attempted to create decoder for unsupported format"
                r3.<init>(r0)
                throw r3
            L_0x0071:
                com.google.android.exoplayer2.text.b.a r0 = new com.google.android.exoplayer2.text.b.a
                java.util.List<byte[]> r3 = r3.f7740h
                r0.<init>(r3)
                return r0
            L_0x0079:
                com.google.android.exoplayer2.text.a.c r0 = new com.google.android.exoplayer2.text.a.c
                int r3 = r3.f7758z
                r0.<init>(r3)
                return r0
            L_0x0081:
                com.google.android.exoplayer2.text.a.a r0 = new com.google.android.exoplayer2.text.a.a
                java.lang.String r1 = r3.f7738f
                int r3 = r3.f7758z
                r0.<init>(r1, r3)
                return r0
            L_0x008b:
                com.google.android.exoplayer2.text.e.a r0 = new com.google.android.exoplayer2.text.e.a
                java.util.List<byte[]> r3 = r3.f7740h
                r0.<init>(r3)
                return r0
            L_0x0093:
                com.google.android.exoplayer2.text.c.a r3 = new com.google.android.exoplayer2.text.c.a
                r3.<init>()
                return r3
            L_0x0099:
                com.google.android.exoplayer2.text.d.a r3 = new com.google.android.exoplayer2.text.d.a
                r3.<init>()
                return r3
            L_0x009f:
                com.google.android.exoplayer2.text.f.b r3 = new com.google.android.exoplayer2.text.f.b
                r3.<init>()
                return r3
            L_0x00a5:
                com.google.android.exoplayer2.text.f.g r3 = new com.google.android.exoplayer2.text.f.g
                r3.<init>()
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.C2779f.C27801.mo9471b(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.text.e");
        }
    };

    /* renamed from: a */
    boolean mo9470a(Format format);

    /* renamed from: b */
    C2776e mo9471b(Format format);
}
