package com.google.android.exoplayer2.p102c;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.c.c */
public final class C2490c {

    /* renamed from: a */
    private static final Pattern f8058a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: b */
    private static final Pattern f8059b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: c */
    private static final Pattern f8060c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    /* renamed from: d */
    private static final Map<String, Integer> f8061d = new HashMap();

    static {
        f8061d.put("aliceblue", Integer.valueOf(-984833));
        f8061d.put("antiquewhite", Integer.valueOf(-332841));
        f8061d.put("aqua", Integer.valueOf(-16711681));
        f8061d.put("aquamarine", Integer.valueOf(-8388652));
        f8061d.put("azure", Integer.valueOf(-983041));
        f8061d.put("beige", Integer.valueOf(-657956));
        f8061d.put("bisque", Integer.valueOf(-6972));
        f8061d.put("black", Integer.valueOf(-16777216));
        f8061d.put("blanchedalmond", Integer.valueOf(-5171));
        f8061d.put("blue", Integer.valueOf(-16776961));
        f8061d.put("blueviolet", Integer.valueOf(-7722014));
        f8061d.put("brown", Integer.valueOf(-5952982));
        f8061d.put("burlywood", Integer.valueOf(-2180985));
        f8061d.put("cadetblue", Integer.valueOf(-10510688));
        f8061d.put("chartreuse", Integer.valueOf(-8388864));
        f8061d.put("chocolate", Integer.valueOf(-2987746));
        f8061d.put("coral", Integer.valueOf(-32944));
        f8061d.put("cornflowerblue", Integer.valueOf(-10185235));
        f8061d.put("cornsilk", Integer.valueOf(-1828));
        f8061d.put("crimson", Integer.valueOf(-2354116));
        f8061d.put("cyan", Integer.valueOf(-16711681));
        f8061d.put("darkblue", Integer.valueOf(-16777077));
        f8061d.put("darkcyan", Integer.valueOf(-16741493));
        f8061d.put("darkgoldenrod", Integer.valueOf(-4684277));
        f8061d.put("darkgray", Integer.valueOf(-5658199));
        f8061d.put("darkgreen", Integer.valueOf(-16751616));
        f8061d.put("darkgrey", Integer.valueOf(-5658199));
        f8061d.put("darkkhaki", Integer.valueOf(-4343957));
        f8061d.put("darkmagenta", Integer.valueOf(-7667573));
        f8061d.put("darkolivegreen", Integer.valueOf(-11179217));
        f8061d.put("darkorange", Integer.valueOf(-29696));
        f8061d.put("darkorchid", Integer.valueOf(-6737204));
        f8061d.put("darkred", Integer.valueOf(-7667712));
        f8061d.put("darksalmon", Integer.valueOf(-1468806));
        f8061d.put("darkseagreen", Integer.valueOf(-7357297));
        f8061d.put("darkslateblue", Integer.valueOf(-12042869));
        f8061d.put("darkslategray", Integer.valueOf(-13676721));
        f8061d.put("darkslategrey", Integer.valueOf(-13676721));
        f8061d.put("darkturquoise", Integer.valueOf(-16724271));
        f8061d.put("darkviolet", Integer.valueOf(-7077677));
        f8061d.put("deeppink", Integer.valueOf(-60269));
        f8061d.put("deepskyblue", Integer.valueOf(-16728065));
        f8061d.put("dimgray", Integer.valueOf(-9868951));
        f8061d.put("dimgrey", Integer.valueOf(-9868951));
        f8061d.put("dodgerblue", Integer.valueOf(-14774017));
        f8061d.put("firebrick", Integer.valueOf(-5103070));
        f8061d.put("floralwhite", Integer.valueOf(-1296));
        f8061d.put("forestgreen", Integer.valueOf(-14513374));
        f8061d.put("fuchsia", Integer.valueOf(-65281));
        f8061d.put("gainsboro", Integer.valueOf(-2302756));
        f8061d.put("ghostwhite", Integer.valueOf(-460545));
        f8061d.put("gold", Integer.valueOf(-10496));
        f8061d.put("goldenrod", Integer.valueOf(-2448096));
        f8061d.put("gray", Integer.valueOf(-8355712));
        f8061d.put("green", Integer.valueOf(-16744448));
        f8061d.put("greenyellow", Integer.valueOf(-5374161));
        f8061d.put("grey", Integer.valueOf(-8355712));
        f8061d.put("honeydew", Integer.valueOf(-983056));
        f8061d.put("hotpink", Integer.valueOf(-38476));
        f8061d.put("indianred", Integer.valueOf(-3318692));
        f8061d.put("indigo", Integer.valueOf(-11861886));
        f8061d.put("ivory", Integer.valueOf(-16));
        f8061d.put("khaki", Integer.valueOf(-989556));
        f8061d.put("lavender", Integer.valueOf(-1644806));
        f8061d.put("lavenderblush", Integer.valueOf(-3851));
        f8061d.put("lawngreen", Integer.valueOf(-8586240));
        f8061d.put("lemonchiffon", Integer.valueOf(-1331));
        f8061d.put("lightblue", Integer.valueOf(-5383962));
        f8061d.put("lightcoral", Integer.valueOf(-1015680));
        f8061d.put("lightcyan", Integer.valueOf(-2031617));
        f8061d.put("lightgoldenrodyellow", Integer.valueOf(-329006));
        f8061d.put("lightgray", Integer.valueOf(-2894893));
        f8061d.put("lightgreen", Integer.valueOf(-7278960));
        f8061d.put("lightgrey", Integer.valueOf(-2894893));
        f8061d.put("lightpink", Integer.valueOf(-18751));
        f8061d.put("lightsalmon", Integer.valueOf(-24454));
        f8061d.put("lightseagreen", Integer.valueOf(-14634326));
        f8061d.put("lightskyblue", Integer.valueOf(-7876870));
        f8061d.put("lightslategray", Integer.valueOf(-8943463));
        f8061d.put("lightslategrey", Integer.valueOf(-8943463));
        f8061d.put("lightsteelblue", Integer.valueOf(-5192482));
        f8061d.put("lightyellow", Integer.valueOf(-32));
        f8061d.put("lime", Integer.valueOf(-16711936));
        f8061d.put("limegreen", Integer.valueOf(-13447886));
        f8061d.put("linen", Integer.valueOf(-331546));
        f8061d.put("magenta", Integer.valueOf(-65281));
        f8061d.put("maroon", Integer.valueOf(-8388608));
        f8061d.put("mediumaquamarine", Integer.valueOf(-10039894));
        f8061d.put("mediumblue", Integer.valueOf(-16777011));
        f8061d.put("mediumorchid", Integer.valueOf(-4565549));
        f8061d.put("mediumpurple", Integer.valueOf(-7114533));
        f8061d.put("mediumseagreen", Integer.valueOf(-12799119));
        f8061d.put("mediumslateblue", Integer.valueOf(-8689426));
        f8061d.put("mediumspringgreen", Integer.valueOf(-16713062));
        f8061d.put("mediumturquoise", Integer.valueOf(-12004916));
        f8061d.put("mediumvioletred", Integer.valueOf(-3730043));
        f8061d.put("midnightblue", Integer.valueOf(-15132304));
        f8061d.put("mintcream", Integer.valueOf(-655366));
        f8061d.put("mistyrose", Integer.valueOf(-6943));
        f8061d.put("moccasin", Integer.valueOf(-6987));
        f8061d.put("navajowhite", Integer.valueOf(-8531));
        f8061d.put("navy", Integer.valueOf(-16777088));
        f8061d.put("oldlace", Integer.valueOf(-133658));
        f8061d.put("olive", Integer.valueOf(-8355840));
        f8061d.put("olivedrab", Integer.valueOf(-9728477));
        f8061d.put("orange", Integer.valueOf(-23296));
        f8061d.put("orangered", Integer.valueOf(-47872));
        f8061d.put("orchid", Integer.valueOf(-2461482));
        f8061d.put("palegoldenrod", Integer.valueOf(-1120086));
        f8061d.put("palegreen", Integer.valueOf(-6751336));
        f8061d.put("paleturquoise", Integer.valueOf(-5247250));
        f8061d.put("palevioletred", Integer.valueOf(-2396013));
        f8061d.put("papayawhip", Integer.valueOf(-4139));
        f8061d.put("peachpuff", Integer.valueOf(-9543));
        f8061d.put("peru", Integer.valueOf(-3308225));
        f8061d.put("pink", Integer.valueOf(-16181));
        f8061d.put("plum", Integer.valueOf(-2252579));
        f8061d.put("powderblue", Integer.valueOf(-5185306));
        f8061d.put("purple", Integer.valueOf(-8388480));
        f8061d.put("rebeccapurple", Integer.valueOf(-10079335));
        f8061d.put("red", Integer.valueOf(-65536));
        f8061d.put("rosybrown", Integer.valueOf(-4419697));
        f8061d.put("royalblue", Integer.valueOf(-12490271));
        f8061d.put("saddlebrown", Integer.valueOf(-7650029));
        f8061d.put("salmon", Integer.valueOf(-360334));
        f8061d.put("sandybrown", Integer.valueOf(-744352));
        f8061d.put("seagreen", Integer.valueOf(-13726889));
        f8061d.put("seashell", Integer.valueOf(-2578));
        f8061d.put("sienna", Integer.valueOf(-6270419));
        f8061d.put("silver", Integer.valueOf(-4144960));
        f8061d.put("skyblue", Integer.valueOf(-7876885));
        f8061d.put("slateblue", Integer.valueOf(-9807155));
        f8061d.put("slategray", Integer.valueOf(-9404272));
        f8061d.put("slategrey", Integer.valueOf(-9404272));
        f8061d.put("snow", Integer.valueOf(-1286));
        f8061d.put("springgreen", Integer.valueOf(-16711809));
        f8061d.put("steelblue", Integer.valueOf(-12156236));
        f8061d.put("tan", Integer.valueOf(-2968436));
        f8061d.put("teal", Integer.valueOf(-16744320));
        f8061d.put("thistle", Integer.valueOf(-2572328));
        f8061d.put("tomato", Integer.valueOf(-40121));
        f8061d.put("transparent", Integer.valueOf(0));
        f8061d.put("turquoise", Integer.valueOf(-12525360));
        f8061d.put("violet", Integer.valueOf(-1146130));
        f8061d.put("wheat", Integer.valueOf(-663885));
        f8061d.put("white", Integer.valueOf(-1));
        f8061d.put("whitesmoke", Integer.valueOf(-657931));
        f8061d.put("yellow", Integer.valueOf(-256));
        f8061d.put("yellowgreen", Integer.valueOf(-6632142));
    }

    /* renamed from: a */
    private static int m11675a(int i, int i2, int i3) {
        return m11676a(255, i, i2, i3);
    }

    /* renamed from: a */
    private static int m11676a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static int m11677a(String str) {
        return m11678a(str, false);
    }

    /* renamed from: a */
    private static int m11678a(String str, boolean z) {
        int i;
        C2488a.m11666a(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                i = -16777216 | parseLong;
            } else if (replace.length() == 9) {
                i = ((parseLong & 255) << 24) | (parseLong >>> 8);
            } else {
                throw new IllegalArgumentException();
            }
            return i;
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f8060c : f8059b).matcher(replace);
            if (matcher.matches()) {
                return m11676a(z ? (int) (Float.parseFloat(matcher.group(4)) * 255.0f) : Integer.parseInt(matcher.group(4), 10), Integer.parseInt(matcher.group(1), 10), Integer.parseInt(matcher.group(2), 10), Integer.parseInt(matcher.group(3), 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f8058a.matcher(replace);
            if (matcher2.matches()) {
                return m11675a(Integer.parseInt(matcher2.group(1), 10), Integer.parseInt(matcher2.group(2), 10), Integer.parseInt(matcher2.group(3), 10));
            }
        } else {
            Integer num = (Integer) f8061d.get(C2511s.m11818d(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static int m11679b(String str) {
        return m11678a(str, true);
    }
}
