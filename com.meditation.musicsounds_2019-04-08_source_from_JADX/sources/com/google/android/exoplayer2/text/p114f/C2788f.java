package com.google.android.exoplayer2.text.p114f;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer2.p102c.C2500k;
import com.google.android.exoplayer2.text.p114f.C2785e.C2787a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.text.f.f */
final class C2788f {

    /* renamed from: a */
    public static final Pattern f9644a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f9645b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private final StringBuilder f9646c = new StringBuilder();

    /* renamed from: com.google.android.exoplayer2.text.f.f$a */
    private static final class C2789a {

        /* renamed from: e */
        private static final String[] f9647e = new String[0];

        /* renamed from: a */
        public final String f9648a;

        /* renamed from: b */
        public final int f9649b;

        /* renamed from: c */
        public final String f9650c;

        /* renamed from: d */
        public final String[] f9651d;

        private C2789a(String str, int i, String str2, String[] strArr) {
            this.f9649b = i;
            this.f9648a = str;
            this.f9650c = str2;
            this.f9651d = strArr;
        }

        /* renamed from: a */
        public static C2789a m13293a() {
            return new C2789a("", 0, "", new String[0]);
        }

        /* renamed from: a */
        public static C2789a m13294a(String str, int i) {
            String str2;
            String trim = str.trim();
            if (trim.isEmpty()) {
                return null;
            }
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] split = trim.split("\\.");
            return new C2789a(split[0], i, str2, split.length > 1 ? (String[]) Arrays.copyOfRange(split, 1, split.length) : f9647e);
        }
    }

    /* renamed from: com.google.android.exoplayer2.text.f.f$b */
    private static final class C2790b implements Comparable<C2790b> {

        /* renamed from: a */
        public final int f9652a;

        /* renamed from: b */
        public final C2784d f9653b;

        public C2790b(int i, C2784d dVar) {
            this.f9652a = i;
            this.f9653b = dVar;
        }

        /* renamed from: a */
        public int compareTo(C2790b bVar) {
            return this.f9652a - bVar.f9652a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0061 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m13278a(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 == r1) goto L_0x003a
            r1 = -1074341483(0xffffffffbff6d995, float:-1.9285151)
            if (r0 == r1) goto L_0x0030
            r1 = 100571(0x188db, float:1.4093E-40)
            if (r0 == r1) goto L_0x0026
            r1 = 109757538(0x68ac462, float:5.219839E-35)
            if (r0 == r1) goto L_0x001c
            goto L_0x0044
        L_0x001c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0026:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 3
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x003a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0062;
                case 2: goto L_0x0062;
                case 3: goto L_0x0061;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.String r0 = "WebvttCueParser"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid anchor value: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            android.util.Log.w(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0061:
            return r2
        L_0x0062:
            return r3
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2788f.m13278a(java.lang.String):int");
    }

    /* renamed from: a */
    private static int m13279a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: a */
    private static void m13280a(SpannableStringBuilder spannableStringBuilder, C2784d dVar, int i, int i2) {
        Object obj;
        if (dVar != null) {
            if (dVar.mo9480b() != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(dVar.mo9480b()), i, i2, 33);
            }
            if (dVar.mo9486c()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.mo9488d()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.mo9491g()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.mo9490f()), i, i2, 33);
            }
            if (dVar.mo9493i()) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.mo9492h()), i, i2, 33);
            }
            if (dVar.mo9489e() != null) {
                spannableStringBuilder.setSpan(new TypefaceSpan(dVar.mo9489e()), i, i2, 33);
            }
            if (dVar.mo9494j() != null) {
                spannableStringBuilder.setSpan(new Standard(dVar.mo9494j()), i, i2, 33);
            }
            switch (dVar.mo9495k()) {
                case 1:
                    obj = new AbsoluteSizeSpan((int) dVar.mo9496l(), true);
                    break;
                case 2:
                    obj = new RelativeSizeSpan(dVar.mo9496l());
                    break;
                case 3:
                    obj = new RelativeSizeSpan(dVar.mo9496l() / 100.0f);
                    break;
                default:
            }
            spannableStringBuilder.setSpan(obj, i, i2, 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13281a(java.lang.String r2, android.text.SpannableStringBuilder r3) {
        /*
            int r0 = r2.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            if (r0 == r1) goto L_0x0035
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002b
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0021
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x0017
            goto L_0x003f
        L_0x0017:
            java.lang.String r0 = "nbsp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 2
            goto L_0x0040
        L_0x0021:
            java.lang.String r0 = "amp"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 3
            goto L_0x0040
        L_0x002b:
            java.lang.String r0 = "lt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 0
            goto L_0x0040
        L_0x0035:
            java.lang.String r0 = "gt"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = -1
        L_0x0040:
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x0065;
                case 2: goto L_0x0062;
                case 3: goto L_0x005f;
                default: goto L_0x0043;
            }
        L_0x0043:
            java.lang.String r3 = "WebvttCueParser"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ignoring unsupported entity: '&"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ";'"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            android.util.Log.w(r3, r2)
            goto L_0x006d
        L_0x005f:
            r2 = 38
            goto L_0x006a
        L_0x0062:
            r2 = 32
            goto L_0x006a
        L_0x0065:
            r2 = 62
            goto L_0x006a
        L_0x0068:
            r2 = 60
        L_0x006a:
            r3.append(r2)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2788f.m13281a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* renamed from: a */
    static void m13282a(String str, C2787a aVar) {
        Matcher matcher = f9645b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    m13288b(group2, aVar);
                } else if ("align".equals(group)) {
                    aVar.mo9501a(m13287b(group2));
                } else if ("position".equals(group)) {
                    m13289c(group2, aVar);
                } else if ("size".equals(group)) {
                    aVar.mo9508c(C2792h.m13302b(group2));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cue setting ");
                    sb.append(group);
                    sb.append(":");
                    sb.append(group2);
                    Log.w("WebvttCueParser", sb.toString());
                }
            } catch (NumberFormatException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Skipping bad cue setting: ");
                sb2.append(matcher.group());
                Log.w("WebvttCueParser", sb2.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080 A[LOOP:0: B:32:0x007e->B:33:0x0080, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m13283a(java.lang.String r7, com.google.android.exoplayer2.text.p114f.C2788f.C2789a r8, android.text.SpannableStringBuilder r9, java.util.List<com.google.android.exoplayer2.text.p114f.C2784d> r10, java.util.List<com.google.android.exoplayer2.text.p114f.C2788f.C2790b> r11) {
        /*
            int r0 = r8.f9649b
            int r1 = r9.length()
            java.lang.String r2 = r8.f9648a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            switch(r3) {
                case 0: goto L_0x004f;
                case 98: goto L_0x0045;
                case 99: goto L_0x003b;
                case 105: goto L_0x0031;
                case 117: goto L_0x0027;
                case 118: goto L_0x001d;
                case 3314158: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0059
        L_0x0013:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 4
            goto L_0x005a
        L_0x001d:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 5
            goto L_0x005a
        L_0x0027:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 2
            goto L_0x005a
        L_0x0031:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 1
            goto L_0x005a
        L_0x003b:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 3
            goto L_0x005a
        L_0x0045:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 0
            goto L_0x005a
        L_0x004f:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0059
            r2 = 6
            goto L_0x005a
        L_0x0059:
            r2 = -1
        L_0x005a:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0066;
                case 2: goto L_0x0060;
                case 3: goto L_0x0074;
                case 4: goto L_0x0074;
                case 5: goto L_0x0074;
                case 6: goto L_0x0074;
                default: goto L_0x005f;
            }
        L_0x005f:
            return
        L_0x0060:
            android.text.style.UnderlineSpan r2 = new android.text.style.UnderlineSpan
            r2.<init>()
            goto L_0x0071
        L_0x0066:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r5)
            goto L_0x0071
        L_0x006c:
            android.text.style.StyleSpan r2 = new android.text.style.StyleSpan
            r2.<init>(r6)
        L_0x0071:
            r9.setSpan(r2, r0, r1, r3)
        L_0x0074:
            r11.clear()
            m13285a(r10, r7, r8, r11)
            int r7 = r11.size()
        L_0x007e:
            if (r4 >= r7) goto L_0x008e
            java.lang.Object r8 = r11.get(r4)
            com.google.android.exoplayer2.text.f.f$b r8 = (com.google.android.exoplayer2.text.p114f.C2788f.C2790b) r8
            com.google.android.exoplayer2.text.f.d r8 = r8.f9653b
            m13280a(r9, r8, r0, r1)
            int r4 = r4 + 1
            goto L_0x007e
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2788f.m13283a(java.lang.String, com.google.android.exoplayer2.text.f.f$a, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    /* renamed from: a */
    static void m13284a(String str, String str2, C2787a aVar, List<C2784d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m13281a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m13279a(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    String d = m13291d(substring);
                    if (d != null && m13290c(d)) {
                        if (z) {
                            while (!stack.isEmpty()) {
                                C2789a aVar2 = (C2789a) stack.pop();
                                m13283a(str, aVar2, spannableStringBuilder, list, arrayList);
                                if (aVar2.f9648a.equals(d)) {
                                    break;
                                }
                            }
                        } else if (!z2) {
                            stack.push(C2789a.m13294a(substring, spannableStringBuilder.length()));
                        }
                    }
                }
                i = i2;
            }
        }
        while (!stack.isEmpty()) {
            m13283a(str, (C2789a) stack.pop(), spannableStringBuilder, list, arrayList);
        }
        m13283a(str, C2789a.m13293a(), spannableStringBuilder, list, arrayList);
        aVar.mo9502a(spannableStringBuilder);
    }

    /* renamed from: a */
    private static void m13285a(List<C2784d> list, String str, C2789a aVar, List<C2790b> list2) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2784d dVar = (C2784d) list.get(i);
            int a = dVar.mo9474a(str, aVar.f9648a, aVar.f9651d, aVar.f9650c);
            if (a > 0) {
                list2.add(new C2790b(a, dVar));
            }
        }
        Collections.sort(list2);
    }

    /* renamed from: a */
    private static boolean m13286a(String str, Matcher matcher, C2500k kVar, C2787a aVar, StringBuilder sb, List<C2784d> list) {
        try {
            aVar.mo9500a(C2792h.m13300a(matcher.group(1))).mo9506b(C2792h.m13300a(matcher.group(2)));
            m13282a(matcher.group(3), aVar);
            sb.setLength(0);
            while (true) {
                String y = kVar.mo8852y();
                if (y == null || y.isEmpty()) {
                    m13284a(str, sb.toString(), aVar, list);
                } else {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(y.trim());
                }
            }
            m13284a(str, sb.toString(), aVar, list);
            return true;
        } catch (NumberFormatException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Skipping cue with bad header: ");
            sb2.append(matcher.group());
            Log.w("WebvttCueParser", sb2.toString());
            return false;
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.text.Layout.Alignment m13287b(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x003a;
                case -1074341483: goto L_0x0030;
                case 100571: goto L_0x0026;
                case 3317767: goto L_0x001c;
                case 108511772: goto L_0x0012;
                case 109757538: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0044
        L_0x0008:
            java.lang.String r0 = "start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 0
            goto L_0x0045
        L_0x0012:
            java.lang.String r0 = "right"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 5
            goto L_0x0045
        L_0x001c:
            java.lang.String r0 = "left"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 1
            goto L_0x0045
        L_0x0026:
            java.lang.String r0 = "end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 4
            goto L_0x0045
        L_0x0030:
            java.lang.String r0 = "middle"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 3
            goto L_0x0045
        L_0x003a:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0044
            r0 = 2
            goto L_0x0045
        L_0x0044:
            r0 = -1
        L_0x0045:
            switch(r0) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0066;
                case 2: goto L_0x0063;
                case 3: goto L_0x0063;
                case 4: goto L_0x0060;
                case 5: goto L_0x0060;
                default: goto L_0x0048;
            }
        L_0x0048:
            java.lang.String r0 = "WebvttCueParser"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid alignment value: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            android.util.Log.w(r0, r3)
            r3 = 0
            return r3
        L_0x0060:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r3
        L_0x0063:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            return r3
        L_0x0066:
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2788f.m13287b(java.lang.String):android.text.Layout$Alignment");
    }

    /* renamed from: b */
    private static void m13288b(String str, C2787a aVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            aVar.mo9505b(m13278a(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            aVar.mo9505b(Integer.MIN_VALUE);
        }
        if (str.endsWith("%")) {
            aVar.mo9498a(C2792h.m13302b(str)).mo9499a(0);
            return;
        }
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0) {
            parseInt--;
        }
        aVar.mo9498a((float) parseInt).mo9499a(1);
    }

    /* renamed from: c */
    private static void m13289c(String str, C2787a aVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            aVar.mo9509c(m13278a(str.substring(indexOf + 1)));
            str = str.substring(0, indexOf);
        } else {
            aVar.mo9509c(Integer.MIN_VALUE);
        }
        aVar.mo9504b(C2792h.m13302b(str));
    }

    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m13290c(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 1
            r2 = 0
            switch(r0) {
                case 98: goto L_0x003c;
                case 99: goto L_0x0032;
                case 105: goto L_0x0028;
                case 117: goto L_0x001e;
                case 118: goto L_0x0014;
                case 3314158: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0046
        L_0x000a:
            java.lang.String r0 = "lang"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0046
            r3 = 3
            goto L_0x0047
        L_0x0014:
            java.lang.String r0 = "v"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0046
            r3 = 5
            goto L_0x0047
        L_0x001e:
            java.lang.String r0 = "u"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0046
            r3 = 4
            goto L_0x0047
        L_0x0028:
            java.lang.String r0 = "i"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0046
            r3 = 2
            goto L_0x0047
        L_0x0032:
            java.lang.String r0 = "c"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0046
            r3 = 1
            goto L_0x0047
        L_0x003c:
            java.lang.String r0 = "b"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0046
            r3 = 0
            goto L_0x0047
        L_0x0046:
            r3 = -1
        L_0x0047:
            switch(r3) {
                case 0: goto L_0x004b;
                case 1: goto L_0x004b;
                case 2: goto L_0x004b;
                case 3: goto L_0x004b;
                case 4: goto L_0x004b;
                case 5: goto L_0x004b;
                default: goto L_0x004a;
            }
        L_0x004a:
            return r2
        L_0x004b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.p114f.C2788f.m13290c(java.lang.String):boolean");
    }

    /* renamed from: d */
    private static String m13291d(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return null;
        }
        return trim.split("[ \\.]")[0];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo9510a(C2500k kVar, C2787a aVar, List<C2784d> list) {
        String y = kVar.mo8852y();
        Matcher matcher = f9644a.matcher(y);
        if (matcher.matches()) {
            return m13286a(null, matcher, kVar, aVar, this.f9646c, list);
        }
        Matcher matcher2 = f9644a.matcher(kVar.mo8852y());
        if (!matcher2.matches()) {
            return false;
        }
        return m13286a(y.trim(), matcher2, kVar, aVar, this.f9646c, list);
    }
}
