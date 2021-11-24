package com.p032a.p033a;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.util.Base64;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.a.a.a */
public final class C1134a {

    /* renamed from: A */
    private static final C1136b f3930A = new C1136b(3, "APP_FOREGROUND", 2);

    /* renamed from: B */
    private static final C1136b f3931B = new C1136b(4, "OPEN_GLES_VERSION", 2);

    /* renamed from: C */
    private static final C1136b f3932C = new C1136b(5, "APP_DEBUGGABLE", 2);

    /* renamed from: D */
    private static final C1136b f3933D = new C1136b(6, "PROCESSORS", 1);

    /* renamed from: E */
    private static final C1136b f3934E = new C1136b(7, "ACTIVITIES", 1);

    /* renamed from: F */
    private static final C1136b f3935F = new C1136b(8, "PERSISTENT", 2);

    /* renamed from: G */
    private static final C1136b f3936G = new C1136b(9, "TOTAL_MEMORY", 2);

    /* renamed from: H */
    private static final C1136b f3937H = new C1136b(10, "MANIFEST_PERMISSIONS", 1);

    /* renamed from: I */
    private static final C1136b f3938I = new C1136b(11, "DEVICE_LOCKED", 2);

    /* renamed from: J */
    private static final C1136b f3939J = new C1136b(12, "KEYGUARD_LOCKED", 2);

    /* renamed from: K */
    private static final C1136b f3940K = new C1136b(13, "DEVICE_SECURE", 2);

    /* renamed from: L */
    private static final C1136b f3941L = new C1136b(14, "KEYGUARD_SECURE", 2);

    /* renamed from: M */
    private static final C1136b f3942M = new C1136b(15, "NETWORK_TYPE", 2);

    /* renamed from: N */
    private static final C1136b f3943N = new C1136b(16, "SIM_OPERATOR_NAME", 1);

    /* renamed from: O */
    private static final C1136b f3944O = new C1136b(17, "PHONE_TYPE", 1);

    /* renamed from: P */
    private static final C1136b f3945P = new C1136b(18, "NETWORK_OPERATOR", 2);

    /* renamed from: Q */
    private static final C1136b f3946Q = new C1136b(19, "NETWORK_OPERATOR_NAME", 2);

    /* renamed from: R */
    private static final C1136b f3947R = new C1136b(20, "SIM_COUNTRY", 2);

    /* renamed from: S */
    private static final C1136b f3948S = new C1136b(21, "MOBILE_DATA_ENABLED", 2);

    /* renamed from: T */
    private static final C1136b f3949T = new C1136b(22, "ACCESSIBILITY_SERVICES_ENABLED", 2);

    /* renamed from: U */
    private static final C1136b f3950U = new C1136b(23, "ADB_ENABLED", 2);

    /* renamed from: V */
    private static final C1136b f3951V = new C1136b(24, "CURRENT_BRIGHTNESS", 2);

    /* renamed from: W */
    private static final C1136b f3952W = new C1136b(25, "SCREEN_OFF_TIMEOUT", 2);

    /* renamed from: X */
    private static final C1136b f3953X = new C1136b(26, "BOOT_COUNT", 1);

    /* renamed from: Y */
    private static final C1136b f3954Y = new C1136b(28, "APP_INSTALL_DATE", 1);

    /* renamed from: Z */
    private static final C1136b f3955Z = new C1136b(29, "TOUCHSCREEN_MULTITOUCH", 1);

    /* renamed from: a */
    static String f3956a = null;

    /* renamed from: aA */
    private static final C1136b f3957aA = new C1136b(56, "STREAM_MUSIC", 2);

    /* renamed from: aB */
    private static final C1136b f3958aB = new C1136b(57, "STREAM_RING", 2);

    /* renamed from: aC */
    private static final C1136b f3959aC = new C1136b(58, "STREAM_DTMF", 2);

    /* renamed from: aD */
    private static final C1136b f3960aD = new C1136b(59, "STREAM_VOICE_CALL", 2);

    /* renamed from: aE */
    private static final C1136b f3961aE = new C1136b(60, "STREAM_ALARM", 2);

    /* renamed from: aF */
    private static final C1136b f3962aF = new C1136b(61, "WIRED_HEADSET", 2);

    /* renamed from: aG */
    private static final C1136b f3963aG = new C1136b(62, "MUSIC_ACTIVE", 2);

    /* renamed from: aH */
    private static final C1136b f3964aH = new C1136b(63, "SPEAKERPHONE", 2);

    /* renamed from: aI */
    private static final C1136b f3965aI = new C1136b(64, "AUDIO_DEVICES", 2);

    /* renamed from: aJ */
    private static final C1136b f3966aJ = new C1136b(65, "WIFI_SSID", 2);

    /* renamed from: aK */
    private static final C1136b f3967aK = new C1136b(66, "WIFI_STATE", 2);

    /* renamed from: aL */
    private static final C1136b f3968aL = new C1136b(68, "DISPLAY_INTERACTIVE", 2);

    /* renamed from: aM */
    private static final C1136b f3969aM = new C1136b(69, "DEVICE_IDLE", 2);

    /* renamed from: aN */
    private static final C1136b f3970aN = new C1136b(70, "POWER_SAFE_MODE", 2);

    /* renamed from: aO */
    private static final C1136b f3971aO = new C1136b(71, "BUILD_SERIAL", 1);

    /* renamed from: aP */
    private static final C1136b f3972aP = new C1136b(72, "BUILD_BRAND", 1);

    /* renamed from: aQ */
    private static final C1136b f3973aQ = new C1136b(73, "BUILD_BOARD", 1);

    /* renamed from: aR */
    private static final C1136b f3974aR = new C1136b(74, "BUILD_BOOTLOADER", 1);

    /* renamed from: aS */
    private static final C1136b f3975aS = new C1136b(75, "BUILD_MANUFACTURER", 1);

    /* renamed from: aT */
    private static final C1136b f3976aT = new C1136b(76, "BUILD_MODEL", 1);

    /* renamed from: aU */
    private static final C1136b f3977aU = new C1136b(77, "BUILD_HOST", 1);

    /* renamed from: aV */
    private static final C1136b f3978aV = new C1136b(78, "BUILD_HARDWARE", 1);

    /* renamed from: aW */
    private static final C1136b f3979aW = new C1136b(79, "BUILD_DEVICE", 1);

    /* renamed from: aX */
    private static final C1136b f3980aX = new C1136b(80, "BUILD_PRINT", 1);

    /* renamed from: aY */
    private static final C1136b f3981aY = new C1136b(81, "BUILD_DISPLAY", 1);

    /* renamed from: aZ */
    private static final C1136b f3982aZ = new C1136b(82, "BUILD_USER", 1);

    /* renamed from: aa */
    private static final C1136b f3983aa = new C1136b(30, "TOUCHSCREEN_MULTITOUCH_DISTINCT", 1);

    /* renamed from: ab */
    private static final C1136b f3984ab = new C1136b(31, "TOUCHSCREEN_MULTITOUCH_JAZZHAND", 1);

    /* renamed from: ac */
    private static final C1136b f3985ac = new C1136b(32, "CAMERA_REAR", 1);

    /* renamed from: ad */
    private static final C1136b f3986ad = new C1136b(33, "CAMERA_FRONT", 1);

    /* renamed from: ae */
    private static final C1136b f3987ae = new C1136b(34, "CAMERA_FLASH", 1);

    /* renamed from: af */
    private static final C1136b f3988af = new C1136b(35, "SENSOR_ACCELEROMETER", 1);

    /* renamed from: ag */
    private static final C1136b f3989ag = new C1136b(36, "SENSOR_STEP_COUNT", 1);

    /* renamed from: ah */
    private static final C1136b f3990ah = new C1136b(37, "SENSOR_BAROMETER", 1);

    /* renamed from: ai */
    private static final C1136b f3991ai = new C1136b(38, "SENSOR_GYRO", 1);

    /* renamed from: aj */
    private static final C1136b f3992aj = new C1136b(39, "SENSOR_COMPASS", 1);

    /* renamed from: ak */
    private static final C1136b f3993ak = new C1136b(40, "SENSOR_HEART", 1);

    /* renamed from: al */
    private static final C1136b f3994al = new C1136b(41, "SENSOR_STEP_DETECTOR", 1);

    /* renamed from: am */
    private static final C1136b f3995am = new C1136b(42, "SENSOR_PROXIMITY", 1);

    /* renamed from: an */
    private static final C1136b f3996an = new C1136b(43, "SENSOR_AMBIENT_TEMPERATURE", 1);

    /* renamed from: ao */
    private static final C1136b f3997ao = new C1136b(44, "PLAYSTORE_APP_INSTALLATION", 1);

    /* renamed from: ap */
    private static final C1136b f3998ap = new C1136b(45, "APP_INSTALLER_PACKAGE_NAME", 1);

    /* renamed from: aq */
    private static final C1136b f3999aq = new C1136b(46, "BLUETOOTH_ENABLED", 2);

    /* renamed from: ar */
    private static final C1136b f4000ar = new C1136b(47, "BLUETOOTH_PRESENT", 1);

    /* renamed from: as */
    private static final C1136b f4001as = new C1136b(48, "BLUETOOTH_LE_PRESENT", 1);

    /* renamed from: at */
    private static final C1136b f4002at = new C1136b(49, "DEVELOPER_MODE_ENABLED", 2);

    /* renamed from: au */
    private static final C1136b f4003au = new C1136b(50, "STAY_ON_WHILE_PLUGGEDIN", 2);

    /* renamed from: av */
    private static final C1136b f4004av = new C1136b(51, "WIFI_ENABLED", 2);

    /* renamed from: aw */
    private static final C1136b f4005aw = new C1136b(52, "USB_MASS_STORAGE_ENABLED", 2);

    /* renamed from: ax */
    private static final C1136b f4006ax = new C1136b(53, "INSTALL_NON_MARKET_APPS_ENABLED", 2);

    /* renamed from: ay */
    private static final C1136b f4007ay = new C1136b(54, "STREAM_SYSTEM", 2);

    /* renamed from: az */
    private static final C1136b f4008az = new C1136b(55, "STREAM_NOTIFICATION", 2);

    /* renamed from: b */
    static JSONObject f4009b = null;

    /* renamed from: bA */
    private static final C1136b f4010bA = new C1136b(122, "APP_PUBLIC_PATH", 1);

    /* renamed from: bB */
    private static final C1136b f4011bB = new C1136b(123, "BUILD_CODENAME", 1);

    /* renamed from: bC */
    private static final C1136b f4012bC = new C1136b(124, "BUILD_RELEASE", 1);

    /* renamed from: bD */
    private static final C1136b f4013bD = new C1136b(125, "BUILD_SDK_INT", 1);

    /* renamed from: bE */
    private static final C1136b f4014bE = new C1136b(126, "BUILD_SECURITY_PATCH", 2);

    /* renamed from: bF */
    private static final C1136b f4015bF = new C1136b(127, "BUILD_BASE_OS", 1);

    /* renamed from: bG */
    private static final C1136b f4016bG = new C1136b(128, "SYSTEM_OS_ARCHITECTURE", 1);

    /* renamed from: bH */
    private static final C1136b f4017bH = new C1136b(129, "SYSTEM_OS_NAME", 1);

    /* renamed from: bI */
    private static final C1136b f4018bI = new C1136b(130, "SYSTEM_OS_VERSION", 1);

    /* renamed from: bJ */
    private static final C1136b f4019bJ = new C1136b(131, "WIFI_PRESENT", 1);

    /* renamed from: bK */
    private static final C1136b f4020bK = new C1136b(132, "TELEPHONY_PRESENT", 1);

    /* renamed from: bL */
    private static final C1136b f4021bL = new C1136b(133, "TOUCHSCREEN", 1);

    /* renamed from: bM */
    private static final C1136b f4022bM = new C1136b(134, "TOUCHSCREEN_FAKETOUCH_SUPPORT", 1);

    /* renamed from: bN */
    private static final C1136b f4023bN = new C1136b(135, "TOUCHSCREEN_FAKETOUCH_MULTITOUCH_DISTINCT", 1);

    /* renamed from: bO */
    private static final C1136b f4024bO = new C1136b(136, "TOUCHSCREEN_FAKETOUCH_MULTITOUCH_JAZZHAND", 1);

    /* renamed from: bP */
    private static final C1136b f4025bP = new C1136b(137, "SENSOR_HIFI", 1);

    /* renamed from: bQ */
    private static final C1136b f4026bQ = new C1136b(138, "TELEPHONY_CDMA_PRESENT", 1);

    /* renamed from: bR */
    private static final C1136b f4027bR = new C1136b(139, "TELEPHONY_GSM_PRESENT", 1);

    /* renamed from: bS */
    private static final C1136b f4028bS = new C1136b(140, "TELEVISION", 1);

    /* renamed from: bT */
    private static final C1136b f4029bT = new C1136b(141, "PRINTING", 1);

    /* renamed from: bU */
    private static final C1136b f4030bU = new C1136b(142, "WATCH", 1);

    /* renamed from: bV */
    private static final C1136b f4031bV = new C1136b(143, "GAMEPAD", 1);

    /* renamed from: bW */
    private static final C1136b f4032bW = new C1136b(144, "LIVE_TV", 1);

    /* renamed from: bX */
    private static final C1136b f4033bX = new C1136b(145, "AUTOMOTIVE", 1);

    /* renamed from: bY */
    private static final C1136b f4034bY = new C1136b(146, "EMBEDDED", 1);

    /* renamed from: bZ */
    private static final C1136b f4035bZ = new C1136b(147, "SCREEN_PORTRAIT", 1);

    /* renamed from: ba */
    private static final C1136b f4036ba = new C1136b(83, "BUILD_PRODUCT", 1);

    /* renamed from: bb */
    private static final C1136b f4037bb = new C1136b(84, "BUILD_TAGS", 1);

    /* renamed from: bc */
    private static final C1136b f4038bc = new C1136b(85, "BUILD_TIME", 1);

    /* renamed from: bd */
    private static final C1136b f4039bd = new C1136b(86, "BUILD_RADIO", 1);

    /* renamed from: be */
    private static final C1136b f4040be = new C1136b(87, "BUILD_ID", 1);

    /* renamed from: bf */
    private static final C1136b f4041bf = new C1136b(88, "BUILD_TYPE", 1);

    /* renamed from: bg */
    private static final C1136b f4042bg = new C1136b(89, "UPTIME", 2);

    /* renamed from: bh */
    private static final C1136b f4043bh = new C1136b(90, "EMULATOR_PROPERTIES", 1);

    /* renamed from: bi */
    private static final C1136b f4044bi = new C1136b(91, "APP_PACKAGE_NAME", 1);

    /* renamed from: bj */
    private static final C1136b f4045bj = new C1136b(105, "BATTERY_STATUS", 2);

    /* renamed from: bk */
    private static final C1136b f4046bk = new C1136b(106, "BATTERY_PLUGGED", 2);

    /* renamed from: bl */
    private static final C1136b f4047bl = new C1136b(107, "BATTERY_PERCENTAGE", 2);

    /* renamed from: bm */
    private static final C1136b f4048bm = new C1136b(108, "BATTERY_PRESENT", 1);

    /* renamed from: bn */
    private static final C1136b f4049bn = new C1136b(109, "BATTERY_HEALTH", 2);

    /* renamed from: bo */
    private static final C1136b f4050bo = new C1136b(110, "BATTERY_TEMPERATURE", 2);

    /* renamed from: bp */
    private static final C1136b f4051bp = new C1136b(111, "BATTERY_CURRENT_NOW", 2);

    /* renamed from: bq */
    private static final C1136b f4052bq = new C1136b(112, "HTTP_PROXY_HOST", 2);

    /* renamed from: br */
    private static final C1136b f4053br = new C1136b(113, "HTTP_PROXY_PORT", 2);

    /* renamed from: bs */
    private static final C1136b f4054bs = new C1136b(114, "HTTP_PROXY_USER", 2);

    /* renamed from: bt */
    private static final C1136b f4055bt = new C1136b(115, "HTTP_PROXY_NON_PROXY_HOST", 2);

    /* renamed from: bu */
    private static final C1136b f4056bu = new C1136b(116, "HTTP_USER_AGENT", 1);

    /* renamed from: bv */
    private static final C1136b f4057bv = new C1136b(117, "SOCKS_PROXY_HOST", 2);

    /* renamed from: bw */
    private static final C1136b f4058bw = new C1136b(118, "SOCKS_PROXY_PORT", 2);

    /* renamed from: bx */
    private static final C1136b f4059bx = new C1136b(119, "SOCKS_PROXY_VERSION", 2);

    /* renamed from: by */
    private static final C1136b f4060by = new C1136b(120, "SOCKS_PROXY_USER", 2);

    /* renamed from: bz */
    private static final C1136b f4061bz = new C1136b(121, "APP_SIZE", 1);

    /* renamed from: c */
    static String f4062c = "https://s.update.fbsbx.com/bridge.html";

    /* renamed from: cA */
    private static final C1136b f4063cA = new C1136b(174, "DISPLAY_X_DPI", 1);

    /* renamed from: cB */
    private static final C1136b f4064cB = new C1136b(175, "DISPLAY_Y_DPI", 1);

    /* renamed from: cC */
    private static final C1136b f4065cC = new C1136b(176, "NETWORKS", 2);

    /* renamed from: cD */
    private static final C1136b f4066cD = new C1136b(177, "LOCALE_LANGUAGE", 1);

    /* renamed from: cE */
    private static final C1136b f4067cE = new C1136b(178, "LOCALE_COUNTRY", 1);

    /* renamed from: cF */
    private static final C1136b f4068cF = new C1136b(179, "LOCALE_NAME", 1);

    /* renamed from: cG */
    private static final C1136b f4069cG = new C1136b(180, "WO_SSID", 1);

    /* renamed from: cH */
    private static final C1136b f4070cH = new C1136b(181, "WO_SDK_VERSION", 1);

    /* renamed from: ca */
    private static final C1136b f4071ca = new C1136b(148, "SCREEN_LANDSCAPE", 1);

    /* renamed from: cb */
    private static final C1136b f4072cb = new C1136b(149, "ACTIVITIES_ON_SECONDARY_DISPLAYS", 1);

    /* renamed from: cc */
    private static final C1136b f4073cc = new C1136b(150, "NFC", 1);

    /* renamed from: cd */
    private static final C1136b f4074cd = new C1136b(151, "USB_HOST", 1);

    /* renamed from: ce */
    private static final C1136b f4075ce = new C1136b(152, "WIFI_DIRECT", 1);

    /* renamed from: cf */
    private static final C1136b f4076cf = new C1136b(153, "ETHERNET", 1);

    /* renamed from: cg */
    private static final C1136b f4077cg = new C1136b(154, "APP_WIDGETS", 1);

    /* renamed from: ch */
    private static final C1136b f4078ch = new C1136b(155, "OPENGLES", 1);

    /* renamed from: ci */
    private static final C1136b f4079ci = new C1136b(156, "MICROPHONE", 1);

    /* renamed from: cj */
    private static final C1136b f4080cj = new C1136b(157, "DACTYLOGRAM", 1);

    /* renamed from: ck */
    private static final C1136b f4081ck = new C1136b(158, "SIM_STATE", 1);

    /* renamed from: cl */
    private static final C1136b f4082cl = new C1136b(159, "APP_FLAGS", 2);

    /* renamed from: cm */
    private static final C1136b f4083cm = new C1136b(160, "APP_LAST_UPDATE", 1);

    /* renamed from: cn */
    private static final C1136b f4084cn = new C1136b(161, "PACK_VERSION_CODE", 1);

    /* renamed from: co */
    private static final C1136b f4085co = new C1136b(162, "RINGER_MODE", 2);

    /* renamed from: cp */
    private static final C1136b f4086cp = new C1136b(163, "TIME_ZONE", 2);

    /* renamed from: cq */
    private static final C1136b f4087cq = new C1136b(164, "TIME_ZONE_NAME", 2);

    /* renamed from: cr */
    private static final C1136b f4088cr = new C1136b(165, "NETWORK_INTERFACES", 2);

    /* renamed from: cs */
    private static final C1136b f4089cs = new C1136b(166, "TOTAL_BYTES_RX", 2);

    /* renamed from: ct */
    private static final C1136b f4090ct = new C1136b(167, "TOTAL_BYTES_TX", 2);

    /* renamed from: cu */
    private static final C1136b f4091cu = new C1136b(168, "MOBILE_BYTES_RX", 2);

    /* renamed from: cv */
    private static final C1136b f4092cv = new C1136b(169, "MOBILE_BYTES_TX", 2);

    /* renamed from: cw */
    private static final C1136b f4093cw = new C1136b(170, "DISPLAY_DENSITY", 2);

    /* renamed from: cx */
    private static final C1136b f4094cx = new C1136b(171, "DISPLAY_DENSITY_DPI", 1);

    /* renamed from: cy */
    private static final C1136b f4095cy = new C1136b(172, "DISPLAY_HEIGHT_PIXELS", 1);

    /* renamed from: cz */
    private static final C1136b f4096cz = new C1136b(173, "DISPLAY_WIDTH_PIXELS", 1);

    /* renamed from: d */
    static String f4097d = "";
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: e */
    static Context f4098e = null;

    /* renamed from: f */
    static String f4099f;

    /* renamed from: g */
    static C1140e f4100g;

    /* renamed from: h */
    private static final int f4101h = VERSION.SDK_INT;

    /* renamed from: i */
    private static C1138d f4102i = new C1138d();

    /* renamed from: j */
    private static boolean f4103j = false;

    /* renamed from: k */
    private static boolean f4104k;

    /* renamed from: l */
    private static boolean f4105l;

    /* renamed from: m */
    private static boolean f4106m;

    /* renamed from: n */
    private static boolean f4107n;

    /* renamed from: o */
    private static AudioManager f4108o;

    /* renamed from: p */
    private static PowerManager f4109p;

    /* renamed from: q */
    private static TelephonyManager f4110q;

    /* renamed from: r */
    private static WifiManager f4111r;

    /* renamed from: s */
    private static ApplicationInfo f4112s;

    /* renamed from: t */
    private static PackageManager f4113t;

    /* renamed from: u */
    private static KeyguardManager f4114u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static JSONObject f4115v = new JSONObject();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static LinkedList<JSONObject> f4116w = new LinkedList<>();
    /* access modifiers changed from: private */

    /* renamed from: x */
    public static JSONObject f4117x = new JSONObject();

    /* renamed from: y */
    private static final C1136b f4118y = new C1136b(1, "APP_IMPORTANCE", 2);

    /* renamed from: z */
    private static final C1136b f4119z = new C1136b(2, "APP_VISIBLE", 2);

    /* renamed from: a */
    static void m6225a() {
        new Thread(new Runnable() {
            public final void run() {
                C1134a.m6229b();
                try {
                    Iterator keys = C1134a.f4117x.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        JSONObject jSONObject = (JSONObject) C1134a.f4117x.get(str);
                        int i = jSONObject.getInt("signalType");
                        jSONObject.remove("signalType");
                        if ((i & 1) == 1) {
                            C1134a.f4115v.put(str, jSONObject);
                        } else if ((i & 2) == 2) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put(str, jSONObject);
                                C1134a.f4116w.add(jSONObject2);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                } catch (JSONException e) {
                    new StringBuilder(" JSONException: ").append(e.getMessage());
                }
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("TYPE", "AUTO");
                    jSONObject4.put("PROXY_ORIGIN", C1134a.f4097d);
                    jSONObject3.put("CI", C1134a.f3956a);
                    jSONObject3.put("ID", C1134a.f4099f);
                    jSONObject3.put("DECISION_EVENT", jSONObject4);
                    jSONObject3.put("CT", C1134a.f4009b);
                } catch (JSONException unused2) {
                }
                JSONObject jSONObject5 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject6 = new JSONObject();
                try {
                    jSONObject5.put("TOUCH_SIG", new JSONArray());
                    jSONObject5.put("STATIC_SIG", C1134a.f4115v);
                    Iterator it = C1134a.f4116w.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    jSONObject5.put("DYNAMIC_SIG", jSONArray);
                    Iterator keys2 = jSONObject3.keys();
                    while (keys2.hasNext()) {
                        String str2 = (String) keys2.next();
                        jSONObject6.put(str2, jSONObject3.get(str2));
                    }
                    jSONObject6.put("DATA", jSONObject5);
                    C1134a.f4100g.mo5578a(jSONObject6.toString());
                } catch (JSONException unused3) {
                }
            }
        }).start();
    }

    /* renamed from: a */
    private static void m6226a(C1136b bVar, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("signalType", bVar.f4122c);
            jSONObject.put("v", obj);
            jSONObject.put("t", System.currentTimeMillis());
            f4117x.put(bVar.f4121b, jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    static void m6227a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (str3 != null) {
            try {
                if (!str3.equals("")) {
                    jSONObject = new JSONObject(str3);
                    new Thread(new Runnable(str, str2, jSONObject) {

                        /* renamed from: a */
                        final /* synthetic */ String f4125a;

                        /* renamed from: b */
                        final /* synthetic */ String f4126b;

                        /* renamed from: c */
                        final /* synthetic */ JSONObject f4127c;

                        /* renamed from: d */
                        final /* synthetic */ String f4128d = null;

                        {
                            this.f4125a = r2;
                            this.f4126b = r3;
                            this.f4127c = r4;
                        }

                        /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
                        /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r6 = this;
                                r0 = 0
                                java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                                java.lang.String r2 = r6.f4125a     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                                r1.<init>(r2)     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                                java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                                javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                                r0 = 15000(0x3a98, float:2.102E-41)
                                r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r0 = r6.f4126b     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                org.json.JSONObject r0 = r6.f4127c     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                if (r0 == 0) goto L_0x003b
                                org.json.JSONObject r0 = r6.f4127c     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.util.Iterator r0 = r0.keys()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                            L_0x0025:
                                boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                if (r2 == 0) goto L_0x003b
                                java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                org.json.JSONObject r3 = r6.f4127c     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                goto L_0x0025
                            L_0x003b:
                                r0 = 0
                                r1.setDoOutput(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r0 = r6.f4128d     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                if (r0 == 0) goto L_0x006b
                                r0 = 1
                                r1.setDoInput(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.io.OutputStream r0 = r1.getOutputStream()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r4 = "UTF-8"
                                r3.<init>(r0, r4)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r2.<init>(r3)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r3 = r6.f4128d     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                java.lang.String r4 = "UTF-8"
                                java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r2.write(r3)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r2.flush()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r2.close()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                r0.close()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                            L_0x006b:
                                r1.getResponseCode()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                                if (r1 == 0) goto L_0x0087
                                r1.disconnect()
                                return
                            L_0x0074:
                                r0 = move-exception
                                goto L_0x007c
                            L_0x0076:
                                r0 = r1
                                goto L_0x0082
                            L_0x0078:
                                r1 = move-exception
                                r5 = r1
                                r1 = r0
                                r0 = r5
                            L_0x007c:
                                if (r1 == 0) goto L_0x0081
                                r1.disconnect()
                            L_0x0081:
                                throw r0
                            L_0x0082:
                                if (r0 == 0) goto L_0x0087
                                r0.disconnect()
                            L_0x0087:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p032a.p033a.C1138d.C11391.run():void");
                        }
                    }).start();
                }
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject = new JSONObject();
        new Thread(new Runnable(str, str2, jSONObject) {

            /* renamed from: a */
            final /* synthetic */ String f4125a;

            /* renamed from: b */
            final /* synthetic */ String f4126b;

            /* renamed from: c */
            final /* synthetic */ JSONObject f4127c;

            /* renamed from: d */
            final /* synthetic */ String f4128d = null;

            {
                this.f4125a = r2;
                this.f4126b = r3;
                this.f4127c = r4;
            }

            /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
            /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r6 = this;
                    r0 = 0
                    java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                    java.lang.String r2 = r6.f4125a     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                    r1.<init>(r2)     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                    java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                    javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x0082, all -> 0x0078 }
                    r0 = 15000(0x3a98, float:2.102E-41)
                    r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r0 = r6.f4126b     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    org.json.JSONObject r0 = r6.f4127c     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    if (r0 == 0) goto L_0x003b
                    org.json.JSONObject r0 = r6.f4127c     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.util.Iterator r0 = r0.keys()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                L_0x0025:
                    boolean r2 = r0.hasNext()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    if (r2 == 0) goto L_0x003b
                    java.lang.Object r2 = r0.next()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    org.json.JSONObject r3 = r6.f4127c     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r3 = r3.getString(r2)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    goto L_0x0025
                L_0x003b:
                    r0 = 0
                    r1.setDoOutput(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r0 = r6.f4128d     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    if (r0 == 0) goto L_0x006b
                    r0 = 1
                    r1.setDoInput(r0)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.io.OutputStream r0 = r1.getOutputStream()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r4 = "UTF-8"
                    r3.<init>(r0, r4)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r2.<init>(r3)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r3 = r6.f4128d     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    java.lang.String r4 = "UTF-8"
                    java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r2.write(r3)     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r2.flush()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r2.close()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    r0.close()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                L_0x006b:
                    r1.getResponseCode()     // Catch:{ Exception -> 0x0076, all -> 0x0074 }
                    if (r1 == 0) goto L_0x0087
                    r1.disconnect()
                    return
                L_0x0074:
                    r0 = move-exception
                    goto L_0x007c
                L_0x0076:
                    r0 = r1
                    goto L_0x0082
                L_0x0078:
                    r1 = move-exception
                    r5 = r1
                    r1 = r0
                    r0 = r5
                L_0x007c:
                    if (r1 == 0) goto L_0x0081
                    r1.disconnect()
                L_0x0081:
                    throw r0
                L_0x0082:
                    if (r0 == 0) goto L_0x0087
                    r0.disconnect()
                L_0x0087:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p032a.p033a.C1138d.C11391.run():void");
            }
        }).start();
    }

    /* renamed from: a */
    public static void m6228a(JSONObject jSONObject) {
        if (!f4103j) {
            boolean z = true;
            f4103j = true;
            if (f4101h >= 21) {
                if (f3956a == null) {
                    throw new Exception("No CI given. SDK WILL NOT WORK");
                } else if (f4098e != null) {
                    f4009b = jSONObject;
                    f4100g = new C1140e();
                    String string = f4098e.getSharedPreferences("WOInspector", 0).getString("wossid", "");
                    f4099f = string;
                    if (!string.equals("")) {
                        byte[] decode = Base64.decode(f4099f, 0);
                        byte[] bytes = "wossid".getBytes();
                        byte[] bArr = new byte[decode.length];
                        for (int i = 0; i < decode.length; i++) {
                            bArr[i] = (byte) (decode[i] ^ bytes[i % bytes.length]);
                        }
                        f4099f = new String(bArr);
                    }
                    if (f4099f.equals("")) {
                        f4099f = UUID.randomUUID().toString();
                        Editor edit = f4098e.getSharedPreferences("WOInspector", 0).edit();
                        byte[] bytes2 = f4099f.getBytes();
                        byte[] bytes3 = "wossid".getBytes();
                        byte[] bArr2 = new byte[bytes2.length];
                        for (int i2 = 0; i2 < bytes2.length; i2++) {
                            bArr2[i2] = (byte) (bytes2[i2] ^ bytes3[i2 % bytes3.length]);
                        }
                        edit.putString("wossid", Base64.encodeToString(bArr2, 0));
                        edit.apply();
                    }
                    f4104k = f4098e.checkCallingOrSelfPermission("android.permission.INTERNET") == 0;
                    f4105l = f4098e.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
                    f4106m = f4098e.checkCallingOrSelfPermission("android.permission.MODIFY_PHONE_STATE") == 0;
                    if (f4098e.checkCallingOrSelfPermission("android.permission.ACCESS_WIFI_STATE") != 0) {
                        z = false;
                    }
                    f4107n = z;
                    if (f4104k) {
                        f4108o = (AudioManager) f4098e.getSystemService("audio");
                        f4109p = (PowerManager) f4098e.getSystemService("power");
                        f4110q = (TelephonyManager) f4098e.getSystemService("phone");
                        f4111r = (WifiManager) f4098e.getSystemService("wifi");
                        f4112s = f4098e.getApplicationInfo();
                        f4113t = f4098e.getPackageManager();
                        f4114u = (KeyguardManager) f4098e.getSystemService("keyguard");
                        f4100g.mo5577a();
                        return;
                    }
                    throw new Exception("APP don't have internet access permission. SDK WILL NOT WORK");
                } else {
                    throw new Exception("No Application Context given. SDK WILL NOT WORK");
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0461 A[Catch:{ Exception -> 0x04bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x05b9  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0611  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x063a A[Catch:{ SocketException | JSONException -> 0x06db }, LOOP:2: B:155:0x063a->B:380:0x063a, LOOP_START, PHI: r1 
      PHI: (r1v248 java.lang.String) = (r1v42 java.lang.String), (r1v250 java.lang.String) binds: [B:154:0x0638, B:380:0x063a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x06d3 A[Catch:{ SocketException | JSONException -> 0x06db }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0707 A[Catch:{ Exception -> 0x071d }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0730  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0746  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x074f  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x08cd  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x08df  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0a4a  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0a60  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0a6b  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0a81  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0ab6  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0acc  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0b16  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0b2c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0b8b  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0ba1  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0baa  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0bb5  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0bc7  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x0bdf  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0bea  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0bfa  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0c44 A[SYNTHETIC, Splitter:B:272:0x0c44] */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x0c5f  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0c8e A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0cec  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0d02  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0dde  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x0dee  */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x0df7  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x0e03  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0e0c  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x0e1c  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0e25  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x0e31  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0e3a  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0e46  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0e4f  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0e5b  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0e66  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0e8a  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0e95  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0ea5  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0eae  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0eeb  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0ef6  */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0f33  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01f4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0390  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m6229b() {
        /*
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            com.a.a.b r1 = f4118y
            int r2 = r0.importance
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m6226a(r1, r2)
            com.a.a.b r1 = f4119z
            int r2 = r0.importance
            r3 = 100
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x0026
            int r2 = r0.importance
            r6 = 200(0xc8, float:2.8E-43)
            if (r2 != r6) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r2 = 0
            goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            m6226a(r1, r2)
            com.a.a.b r1 = f3930A
            int r0 = r0.importance
            if (r0 != r3) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            m6226a(r1, r0)
            android.content.Context r0 = f4098e
            java.lang.String r1 = "activity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x005a
            android.content.pm.ConfigurationInfo r0 = r0.getDeviceConfigurationInfo()
            if (r0 == 0) goto L_0x005a
            com.a.a.b r1 = f3931B
            java.lang.String r0 = r0.getGlEsVersion()
            m6226a(r1, r0)
            goto L_0x0061
        L_0x005a:
            com.a.a.b r0 = f3931B
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x0061:
            com.a.a.b r0 = f3932C
            android.content.pm.ApplicationInfo r1 = f4112s
            int r1 = r1.flags
            r2 = 2
            r1 = r1 & r2
            if (r1 == 0) goto L_0x006d
            r1 = 1
            goto L_0x006e
        L_0x006d:
            r1 = 0
        L_0x006e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3935F
            android.content.pm.ApplicationInfo r1 = f4112s
            int r1 = r1.flags
            r6 = 8
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0082
            r1 = 1
            goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4082cl
            android.content.pm.ApplicationInfo r1 = f4112s
            int r1 = r1.flags
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            m6226a(r0, r1)
            android.media.AudioManager r0 = f4108o
            r1 = 4
            r7 = 3
            r8 = 5
            if (r0 == 0) goto L_0x0144
            com.a.a.b r0 = f4007ay
            android.media.AudioManager r9 = f4108o
            int r9 = r9.getStreamVolume(r4)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            m6226a(r0, r9)
            com.a.a.b r0 = f4008az
            android.media.AudioManager r9 = f4108o
            int r9 = r9.getStreamVolume(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            m6226a(r0, r9)
            com.a.a.b r0 = f3957aA
            android.media.AudioManager r9 = f4108o
            int r9 = r9.getStreamVolume(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            m6226a(r0, r9)
            com.a.a.b r0 = f3958aB
            android.media.AudioManager r9 = f4108o
            int r9 = r9.getStreamVolume(r2)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            m6226a(r0, r9)
            com.a.a.b r0 = f3959aC
            android.media.AudioManager r9 = f4108o
            int r6 = r9.getStreamVolume(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            m6226a(r0, r6)
            com.a.a.b r0 = f3960aD
            android.media.AudioManager r6 = f4108o
            int r6 = r6.getStreamVolume(r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            m6226a(r0, r6)
            com.a.a.b r0 = f3961aE
            android.media.AudioManager r6 = f4108o
            int r6 = r6.getStreamVolume(r1)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            m6226a(r0, r6)
            com.a.a.b r0 = f3962aF
            android.media.AudioManager r6 = f4108o
            boolean r6 = r6.isWiredHeadsetOn()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            m6226a(r0, r6)
            com.a.a.b r0 = f3963aG
            android.media.AudioManager r6 = f4108o
            boolean r6 = r6.isMusicActive()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            m6226a(r0, r6)
            com.a.a.b r0 = f3964aH
            android.media.AudioManager r6 = f4108o
            boolean r6 = r6.isSpeakerphoneOn()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            m6226a(r0, r6)
            com.a.a.b r0 = f4085co
            android.media.AudioManager r6 = f4108o
            int r6 = r6.getRingerMode()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L_0x0140:
            m6226a(r0, r6)
            goto L_0x018f
        L_0x0144:
            com.a.a.b r0 = f4007ay
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f4008az
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3957aA
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3958aB
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3959aC
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3960aD
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3961aE
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3962aF
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3963aG
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3964aH
            java.lang.String r6 = "ERROR"
            m6226a(r0, r6)
            com.a.a.b r0 = f3965aI
            java.lang.String r6 = "ERROR"
            goto L_0x0140
        L_0x018f:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            int r6 = f4101h
            r9 = 23
            if (r6 < r9) goto L_0x01d6
            android.media.AudioManager r6 = f4108o
            if (r6 == 0) goto L_0x01d1
            android.media.AudioManager r6 = f4108o     // Catch:{ JSONException -> 0x01d1 }
            android.media.AudioDeviceInfo[] r6 = r6.getDevices(r4)     // Catch:{ JSONException -> 0x01d1 }
            int r10 = r6.length     // Catch:{ JSONException -> 0x01d1 }
            r11 = 0
        L_0x01a6:
            if (r11 >= r10) goto L_0x01cb
            r12 = r6[r11]     // Catch:{ JSONException -> 0x01d1 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01d1 }
            r13.<init>()     // Catch:{ JSONException -> 0x01d1 }
            java.lang.String r14 = "ProductName"
            java.lang.CharSequence r15 = r12.getProductName()     // Catch:{ JSONException -> 0x01d1 }
            java.lang.String r15 = r15.toString()     // Catch:{ JSONException -> 0x01d1 }
            r13.put(r14, r15)     // Catch:{ JSONException -> 0x01d1 }
            java.lang.String r14 = "Type"
            int r12 = r12.getType()     // Catch:{ JSONException -> 0x01d1 }
            r13.put(r14, r12)     // Catch:{ JSONException -> 0x01d1 }
            r0.put(r13)     // Catch:{ JSONException -> 0x01d1 }
            int r11 = r11 + 1
            goto L_0x01a6
        L_0x01cb:
            com.a.a.b r6 = f3965aI     // Catch:{ JSONException -> 0x01d1 }
            m6226a(r6, r0)     // Catch:{ JSONException -> 0x01d1 }
            goto L_0x01dd
        L_0x01d1:
            com.a.a.b r0 = f3965aI
            java.lang.String r6 = "ERROR"
            goto L_0x01da
        L_0x01d6:
            com.a.a.b r0 = f3965aI
            java.lang.String r6 = "UNKNOWN"
        L_0x01da:
            m6226a(r0, r6)
        L_0x01dd:
            android.content.Context r0 = f4098e
            android.content.IntentFilter r6 = new android.content.IntentFilter
            java.lang.String r10 = "android.intent.action.BATTERY_CHANGED"
            r6.<init>(r10)
            r10 = 0
            android.content.Intent r0 = r0.registerReceiver(r10, r6)
            if (r0 == 0) goto L_0x01f4
            java.lang.String r6 = "present"
            boolean r6 = r0.getBooleanExtra(r6, r5)
            goto L_0x01f5
        L_0x01f4:
            r6 = 0
        L_0x01f5:
            com.a.a.b r11 = f4048bm
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            m6226a(r11, r12)
            r11 = -1
            if (r6 == 0) goto L_0x0289
            java.lang.String r6 = "level"
            int r6 = r0.getIntExtra(r6, r11)
            java.lang.String r12 = "scale"
            int r12 = r0.getIntExtra(r12, r11)
            if (r6 == r11) goto L_0x0223
            if (r12 <= 0) goto L_0x0223
            com.a.a.b r13 = f4047bl
            float r6 = (float) r6
            float r12 = (float) r12
            float r6 = r6 / r12
            r12 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r12
            int r6 = (int) r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            m6226a(r13, r6)
            goto L_0x022a
        L_0x0223:
            com.a.a.b r6 = f4047bl
            java.lang.String r12 = "ERROR"
            m6226a(r6, r12)
        L_0x022a:
            com.a.a.b r6 = f4046bk
            java.lang.String r12 = "plugged"
            int r12 = r0.getIntExtra(r12, r5)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            m6226a(r6, r12)
            com.a.a.b r6 = f4045bj
            java.lang.String r12 = "status"
            int r12 = r0.getIntExtra(r12, r5)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            m6226a(r6, r12)
            com.a.a.b r6 = f4049bn
            java.lang.String r12 = "health"
            int r12 = r0.getIntExtra(r12, r5)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            m6226a(r6, r12)
            java.lang.String r6 = "temperature"
            int r0 = r0.getIntExtra(r6, r5)
            float r0 = (float) r0
            r6 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r6
            com.a.a.b r6 = f4050bo
            java.lang.String r0 = java.lang.String.valueOf(r0)
            m6226a(r6, r0)
            android.content.Context r0 = f4098e
            java.lang.String r6 = "batterymanager"
            java.lang.Object r0 = r0.getSystemService(r6)
            android.os.BatteryManager r0 = (android.os.BatteryManager) r0
            if (r0 == 0) goto L_0x0284
            com.a.a.b r6 = f4051bp
            int r0 = r0.getIntProperty(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            m6226a(r6, r0)
            goto L_0x02b3
        L_0x0284:
            com.a.a.b r0 = f4051bp
            java.lang.String r6 = "ERROR"
            goto L_0x02b0
        L_0x0289:
            com.a.a.b r0 = f4047bl
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4046bk
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4045bj
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4049bn
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4050bo
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4051bp
            java.lang.String r6 = "UNKNOWN"
        L_0x02b0:
            m6226a(r0, r6)
        L_0x02b3:
            com.a.a.b r0 = f3972aP
            java.lang.String r6 = android.os.Build.BRAND
            m6226a(r0, r6)
            com.a.a.b r0 = f3973aQ
            java.lang.String r6 = android.os.Build.BOARD
            m6226a(r0, r6)
            com.a.a.b r0 = f3974aR
            java.lang.String r6 = android.os.Build.BOOTLOADER
            m6226a(r0, r6)
            com.a.a.b r0 = f3975aS
            java.lang.String r6 = android.os.Build.MANUFACTURER
            m6226a(r0, r6)
            com.a.a.b r0 = f3976aT
            java.lang.String r6 = android.os.Build.MODEL
            m6226a(r0, r6)
            com.a.a.b r0 = f3977aU
            java.lang.String r6 = android.os.Build.HOST
            m6226a(r0, r6)
            com.a.a.b r0 = f3978aV
            java.lang.String r6 = android.os.Build.HARDWARE
            m6226a(r0, r6)
            com.a.a.b r0 = f3979aW
            java.lang.String r6 = android.os.Build.DEVICE
            m6226a(r0, r6)
            com.a.a.b r0 = f3980aX
            java.lang.String r6 = android.os.Build.FINGERPRINT
            m6226a(r0, r6)
            com.a.a.b r0 = f3981aY
            java.lang.String r6 = android.os.Build.DISPLAY
            m6226a(r0, r6)
            com.a.a.b r0 = f3982aZ
            java.lang.String r6 = android.os.Build.USER
            m6226a(r0, r6)
            com.a.a.b r0 = f4036ba
            java.lang.String r6 = android.os.Build.PRODUCT
            m6226a(r0, r6)
            com.a.a.b r0 = f4037bb
            java.lang.String r6 = android.os.Build.TAGS
            m6226a(r0, r6)
            com.a.a.b r0 = f4038bc
            long r12 = android.os.Build.TIME
            java.lang.Long r6 = java.lang.Long.valueOf(r12)
            m6226a(r0, r6)
            com.a.a.b r0 = f4041bf
            java.lang.String r6 = android.os.Build.TYPE
            m6226a(r0, r6)
            com.a.a.b r0 = f4040be
            java.lang.String r6 = android.os.Build.ID
            m6226a(r0, r6)
            com.a.a.b r0 = f4011bB
            java.lang.String r6 = android.os.Build.VERSION.CODENAME
            m6226a(r0, r6)
            com.a.a.b r0 = f4012bC
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            m6226a(r0, r6)
            com.a.a.b r0 = f4013bD
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            m6226a(r0, r6)
            int r0 = f4101h
            if (r0 < r9) goto L_0x035c
            com.a.a.b r0 = f4039bd
            java.lang.String r6 = android.os.Build.getRadioVersion()
            m6226a(r0, r6)
            com.a.a.b r0 = f4014bE
            java.lang.String r6 = android.os.Build.VERSION.SECURITY_PATCH
            m6226a(r0, r6)
            com.a.a.b r0 = f4015bF
            java.lang.String r6 = android.os.Build.VERSION.BASE_OS
        L_0x0358:
            m6226a(r0, r6)
            goto L_0x036f
        L_0x035c:
            com.a.a.b r0 = f4039bd
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4014bE
            java.lang.String r6 = "UNKNOWN"
            m6226a(r0, r6)
            com.a.a.b r0 = f4015bF
            java.lang.String r6 = "UNKNOWN"
            goto L_0x0358
        L_0x036f:
            int r0 = f4101h
            r6 = 26
            if (r0 >= r6) goto L_0x037d
            com.a.a.b r0 = f3971aO
            java.lang.String r12 = android.os.Build.SERIAL
        L_0x0379:
            m6226a(r0, r12)
            goto L_0x0382
        L_0x037d:
            com.a.a.b r0 = f3971aO
            java.lang.String r12 = "UNKNOWN"
            goto L_0x0379
        L_0x0382:
            android.content.Context r0 = f4098e
            java.lang.String r12 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r12)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            boolean r12 = f4105l
            if (r12 == 0) goto L_0x043a
            if (r0 == 0) goto L_0x0435
            android.net.Network[] r12 = r0.getAllNetworks()
            org.json.JSONArray r13 = new org.json.JSONArray
            r13.<init>()
            int r14 = r12.length
            r15 = 0
        L_0x039d:
            if (r15 >= r14) goto L_0x042f
            r10 = r12[r15]
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            android.net.NetworkCapabilities r10 = r0.getNetworkCapabilities(r10)
            java.lang.String r9 = "CHK_NETWORK_CAPABILITIES_INFO"
            java.lang.String r6 = r10.toString()     // Catch:{ JSONException -> 0x041d }
            r3.put(r9, r6)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r6 = "CHK_NETWORK_CAPABILITIES_INTERNET"
            r9 = 12
            boolean r9 = r10.hasCapability(r9)     // Catch:{ JSONException -> 0x041d }
            r3.put(r6, r9)     // Catch:{ JSONException -> 0x041d }
            java.lang.String r6 = "CHK_NETWORK_CAPABILITIES_NOT_VPN"
            r9 = 15
            boolean r9 = r10.hasCapability(r9)     // Catch:{ JSONException -> 0x041d }
            r3.put(r6, r9)     // Catch:{ JSONException -> 0x041d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)     // Catch:{ JSONException -> 0x041d }
            boolean r9 = r10.hasTransport(r5)     // Catch:{ JSONException -> 0x041d }
            if (r9 == 0) goto L_0x03d8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0414
        L_0x03d8:
            boolean r9 = r10.hasTransport(r4)     // Catch:{ JSONException -> 0x041d }
            if (r9 == 0) goto L_0x03e3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0414
        L_0x03e3:
            boolean r9 = r10.hasTransport(r2)     // Catch:{ JSONException -> 0x041d }
            if (r9 == 0) goto L_0x03ee
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0414
        L_0x03ee:
            boolean r9 = r10.hasTransport(r7)     // Catch:{ JSONException -> 0x041d }
            if (r9 == 0) goto L_0x03f9
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0414
        L_0x03f9:
            boolean r9 = r10.hasTransport(r1)     // Catch:{ JSONException -> 0x041d }
            if (r9 == 0) goto L_0x0404
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0414
        L_0x0404:
            boolean r9 = r10.hasTransport(r8)     // Catch:{ JSONException -> 0x041d }
            if (r9 == 0) goto L_0x0414
            int r9 = f4101h     // Catch:{ JSONException -> 0x041d }
            r10 = 26
            if (r9 < r10) goto L_0x0414
            java.lang.Integer r6 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x041d }
        L_0x0414:
            java.lang.String r9 = "CHK_NETWORK_TRANSPORT_TYPE"
            r3.put(r9, r6)     // Catch:{ JSONException -> 0x041d }
            r13.put(r3)     // Catch:{ JSONException -> 0x041d }
            goto L_0x0424
        L_0x041d:
            com.a.a.b r3 = f4065cC
            java.lang.String r6 = "ERROR"
            m6226a(r3, r6)
        L_0x0424:
            int r15 = r15 + 1
            r3 = 100
            r6 = 26
            r9 = 23
            r10 = 0
            goto L_0x039d
        L_0x042f:
            com.a.a.b r0 = f4065cC
            m6226a(r0, r13)
            goto L_0x0441
        L_0x0435:
            com.a.a.b r0 = f4065cC
            java.lang.String r1 = "ERROR"
            goto L_0x043e
        L_0x043a:
            com.a.a.b r0 = f4065cC
            java.lang.String r1 = "NO_PERMISSION"
        L_0x043e:
            m6226a(r0, r1)
        L_0x0441:
            com.a.a.b r0 = f4044bi
            android.content.Context r1 = f4098e
            java.lang.String r1 = r1.getPackageName()
            m6226a(r0, r1)
            com.a.a.b r0 = f4042bg
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x04bd }
            if (r0 == 0) goto L_0x04c4
            java.lang.String r1 = "get"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x04bd }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r3[r5] = r6     // Catch:{ Exception -> 0x04bd }
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x04bd }
            if (r1 == 0) goto L_0x04c4
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04bd }
            java.lang.String r6 = "ro.hardware"
            r3[r5] = r6     // Catch:{ Exception -> 0x04bd }
            java.lang.Object r3 = r1.invoke(r0, r3)     // Catch:{ Exception -> 0x04bd }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04bd }
            java.lang.String r7 = "ro.kernel.qemu"
            r6[r5] = r7     // Catch:{ Exception -> 0x04bd }
            java.lang.Object r6 = r1.invoke(r0, r6)     // Catch:{ Exception -> 0x04bd }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x04bd }
            java.lang.String r8 = "ro.product.model"
            r7[r5] = r8     // Catch:{ Exception -> 0x04bd }
            java.lang.Object r0 = r1.invoke(r0, r7)     // Catch:{ Exception -> 0x04bd }
            if (r3 == 0) goto L_0x0498
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x04bd }
            java.lang.String r1 = "goldfish"
            boolean r1 = r3.contains(r1)     // Catch:{ Exception -> 0x04bd }
            goto L_0x0499
        L_0x0498:
            r1 = 0
        L_0x0499:
            if (r6 == 0) goto L_0x04ab
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x04bd }
            java.lang.String r3 = "1"
            boolean r3 = r6.contains(r3)     // Catch:{ Exception -> 0x04bd }
            if (r3 != 0) goto L_0x04aa
            if (r1 == 0) goto L_0x04a8
            goto L_0x04aa
        L_0x04a8:
            r1 = 0
            goto L_0x04ab
        L_0x04aa:
            r1 = 1
        L_0x04ab:
            if (r0 == 0) goto L_0x04bb
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04bd }
            java.lang.String r3 = "sdk"
            boolean r0 = r0.contains(r3)     // Catch:{ Exception -> 0x04bd }
            if (r0 != 0) goto L_0x04b9
            if (r1 == 0) goto L_0x04c4
        L_0x04b9:
            r0 = 1
            goto L_0x04c5
        L_0x04bb:
            r0 = r1
            goto L_0x04c5
        L_0x04bd:
            com.a.a.b r0 = f4043bh
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x04c4:
            r0 = 0
        L_0x04c5:
            com.a.a.b r1 = f4043bh
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r0.toUpperCase()
            m6226a(r1, r0)
            com.a.a.b r0 = f4087cq
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.lang.String r1 = r1.getDisplayName()
            m6226a(r0, r1)
            com.a.a.b r0 = f4086cp
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            int r1 = r1.getRawOffset()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            m6226a(r0, r1)
            android.content.Context r0 = f4098e
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            com.a.a.b r1 = f4093cw
            float r3 = r0.density
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            m6226a(r1, r3)
            com.a.a.b r1 = f4094cx
            int r3 = r0.densityDpi
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            m6226a(r1, r3)
            com.a.a.b r1 = f4096cz
            int r3 = r0.widthPixels
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            m6226a(r1, r3)
            com.a.a.b r1 = f4095cy
            int r3 = r0.heightPixels
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            m6226a(r1, r3)
            com.a.a.b r1 = f4063cA
            float r3 = r0.xdpi
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            m6226a(r1, r3)
            com.a.a.b r1 = f4064cB
            float r0 = r0.ydpi
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            m6226a(r1, r0)
            com.a.a.b r0 = f4066cD     // Catch:{ MissingResourceException -> 0x054a }
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ MissingResourceException -> 0x054a }
            java.lang.String r1 = r1.getISO3Language()     // Catch:{ MissingResourceException -> 0x054a }
            m6226a(r0, r1)     // Catch:{ MissingResourceException -> 0x054a }
            goto L_0x0551
        L_0x054a:
            com.a.a.b r0 = f4066cD
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x0551:
            com.a.a.b r0 = f4067cE     // Catch:{ MissingResourceException -> 0x055f }
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch:{ MissingResourceException -> 0x055f }
            java.lang.String r1 = r1.getISO3Country()     // Catch:{ MissingResourceException -> 0x055f }
            m6226a(r0, r1)     // Catch:{ MissingResourceException -> 0x055f }
            goto L_0x0566
        L_0x055f:
            com.a.a.b r0 = f4067cE
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x0566:
            com.a.a.b r0 = f4068cF
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r1 = r1.getDisplayName()
            m6226a(r0, r1)
            com.a.a.b r0 = f4089cs
            long r6 = android.net.TrafficStats.getTotalRxBytes()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            com.a.a.b r0 = f4090ct
            long r6 = android.net.TrafficStats.getTotalTxBytes()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            com.a.a.b r0 = f4091cu
            long r6 = android.net.TrafficStats.getMobileRxBytes()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            com.a.a.b r0 = f4092cv
            long r6 = android.net.TrafficStats.getMobileTxBytes()
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            com.a.a.b r0 = f4069cG
            java.lang.String r1 = f4099f
            m6226a(r0, r1)
            com.a.a.b r0 = f4070cH
            java.lang.String r1 = "B1.0.5.01"
            m6226a(r0, r1)
            android.app.KeyguardManager r0 = f4114u
            if (r0 == 0) goto L_0x0611
            com.a.a.b r0 = f3939J
            android.app.KeyguardManager r1 = f4114u
            boolean r1 = r1.isKeyguardLocked()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            int r0 = f4101h
            r1 = 22
            if (r0 < r1) goto L_0x05de
            com.a.a.b r0 = f3938I
            android.app.KeyguardManager r1 = f4114u
            boolean r1 = r1.isDeviceLocked()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x05da:
            m6226a(r0, r1)
            goto L_0x05e3
        L_0x05de:
            com.a.a.b r0 = f3938I
            java.lang.String r1 = "UNKNOWN"
            goto L_0x05da
        L_0x05e3:
            int r0 = f4101h
            r1 = 23
            if (r0 < r1) goto L_0x0605
            com.a.a.b r0 = f3940K
            android.app.KeyguardManager r1 = f4114u
            boolean r1 = r1.isDeviceSecure()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3941L
            android.app.KeyguardManager r1 = f4114u
            boolean r1 = r1.isKeyguardSecure()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x062a
        L_0x0605:
            com.a.a.b r0 = f3940K
            java.lang.String r1 = "UNKNOWN"
            m6226a(r0, r1)
            com.a.a.b r0 = f3941L
            java.lang.String r1 = "UNKNOWN"
            goto L_0x062a
        L_0x0611:
            com.a.a.b r0 = f3938I
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
            com.a.a.b r0 = f3939J
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
            com.a.a.b r0 = f3940K
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
            com.a.a.b r0 = f3941L
            java.lang.String r1 = "ERROR"
        L_0x062a:
            m6226a(r0, r1)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.String r1 = ""
            java.util.Enumeration r3 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch:{ SocketException | JSONException -> 0x06db }
            if (r3 == 0) goto L_0x06d3
        L_0x063a:
            boolean r6 = r3.hasMoreElements()     // Catch:{ SocketException | JSONException -> 0x06db }
            if (r6 == 0) goto L_0x06cd
            java.lang.Object r6 = r3.nextElement()     // Catch:{ SocketException | JSONException -> 0x06db }
            java.net.NetworkInterface r6 = (java.net.NetworkInterface) r6     // Catch:{ SocketException | JSONException -> 0x06db }
            boolean r7 = r6.isUp()     // Catch:{ SocketException | JSONException -> 0x06db }
            if (r7 == 0) goto L_0x063a
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ SocketException | JSONException -> 0x06db }
            r7.<init>()     // Catch:{ SocketException | JSONException -> 0x06db }
            byte[] r8 = r6.getHardwareAddress()     // Catch:{ SocketException | JSONException -> 0x06db }
            if (r8 == 0) goto L_0x0685
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SocketException | JSONException -> 0x06db }
            r1.<init>()     // Catch:{ SocketException | JSONException -> 0x06db }
            r9 = 0
        L_0x065d:
            int r10 = r8.length     // Catch:{ SocketException | JSONException -> 0x06db }
            if (r9 >= r10) goto L_0x0681
            java.lang.String r10 = "%02X%s"
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ SocketException | JSONException -> 0x06db }
            byte r13 = r8[r9]     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.Byte r13 = java.lang.Byte.valueOf(r13)     // Catch:{ SocketException | JSONException -> 0x06db }
            r12[r5] = r13     // Catch:{ SocketException | JSONException -> 0x06db }
            int r13 = r8.length     // Catch:{ SocketException | JSONException -> 0x06db }
            int r13 = r13 - r4
            if (r9 >= r13) goto L_0x0673
            java.lang.String r13 = "-"
            goto L_0x0675
        L_0x0673:
            java.lang.String r13 = ""
        L_0x0675:
            r12[r4] = r13     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.String r10 = java.lang.String.format(r10, r12)     // Catch:{ SocketException | JSONException -> 0x06db }
            r1.append(r10)     // Catch:{ SocketException | JSONException -> 0x06db }
            int r9 = r9 + 1
            goto L_0x065d
        L_0x0681:
            java.lang.String r1 = r1.toString()     // Catch:{ SocketException | JSONException -> 0x06db }
        L_0x0685:
            java.lang.String r8 = "CHK_NETWORK_MAC"
            r7.put(r8, r1)     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.String r8 = "CHK_NETWORK_VIRTUAL"
            boolean r9 = r6.isVirtual()     // Catch:{ SocketException | JSONException -> 0x06db }
            r7.put(r8, r9)     // Catch:{ SocketException | JSONException -> 0x06db }
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ SocketException | JSONException -> 0x06db }
            r8.<init>()     // Catch:{ SocketException | JSONException -> 0x06db }
            java.util.Enumeration r6 = r6.getInetAddresses()     // Catch:{ SocketException | JSONException -> 0x06db }
        L_0x069c:
            boolean r9 = r6.hasMoreElements()     // Catch:{ SocketException | JSONException -> 0x06db }
            if (r9 == 0) goto L_0x06c3
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ SocketException | JSONException -> 0x06db }
            r9.<init>()     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.Object r10 = r6.nextElement()     // Catch:{ SocketException | JSONException -> 0x06db }
            java.net.InetAddress r10 = (java.net.InetAddress) r10     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.String r12 = "CHK_NETWORK_IP"
            java.lang.String r13 = r10.getHostAddress()     // Catch:{ SocketException | JSONException -> 0x06db }
            r9.put(r12, r13)     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.String r12 = "CHK_NETWORK_LOOPBACK"
            boolean r10 = r10.isLoopbackAddress()     // Catch:{ SocketException | JSONException -> 0x06db }
            r9.put(r12, r10)     // Catch:{ SocketException | JSONException -> 0x06db }
            r8.put(r9)     // Catch:{ SocketException | JSONException -> 0x06db }
            goto L_0x069c
        L_0x06c3:
            java.lang.String r6 = "CHK_INET_ADDRESSES"
            r7.put(r6, r8)     // Catch:{ SocketException | JSONException -> 0x06db }
            r0.put(r7)     // Catch:{ SocketException | JSONException -> 0x06db }
            goto L_0x063a
        L_0x06cd:
            com.a.a.b r1 = f4088cr     // Catch:{ SocketException | JSONException -> 0x06db }
            m6226a(r1, r0)     // Catch:{ SocketException | JSONException -> 0x06db }
            goto L_0x06e2
        L_0x06d3:
            com.a.a.b r0 = f4088cr     // Catch:{ SocketException | JSONException -> 0x06db }
            java.lang.String r1 = ""
            m6226a(r0, r1)     // Catch:{ SocketException | JSONException -> 0x06db }
            goto L_0x06e2
        L_0x06db:
            com.a.a.b r0 = f4088cr
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x06e2:
            android.content.pm.PackageManager r0 = f4113t     // Catch:{ Exception -> 0x06f1 }
            android.content.Context r1 = f4098e     // Catch:{ Exception -> 0x06f1 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x06f1 }
            r3 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r1, r3)     // Catch:{ Exception -> 0x06f1 }
            goto L_0x06f2
        L_0x06f1:
            r10 = 0
        L_0x06f2:
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            android.content.pm.PackageManager r1 = f4113t     // Catch:{ Exception -> 0x071d }
            android.content.Context r3 = f4098e     // Catch:{ Exception -> 0x071d }
            java.lang.String r3 = r3.getPackageName()     // Catch:{ Exception -> 0x071d }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r3, r4)     // Catch:{ Exception -> 0x071d }
            android.content.pm.ActivityInfo[] r1 = r1.activities     // Catch:{ Exception -> 0x071d }
            if (r1 == 0) goto L_0x0724
            int r3 = r1.length     // Catch:{ Exception -> 0x071d }
            r6 = 100
            if (r3 >= r6) goto L_0x070e
            int r3 = r1.length     // Catch:{ Exception -> 0x071d }
            goto L_0x0710
        L_0x070e:
            r3 = 100
        L_0x0710:
            r6 = 0
        L_0x0711:
            if (r6 >= r3) goto L_0x0724
            r7 = r1[r6]     // Catch:{ Exception -> 0x071d }
            java.lang.String r7 = r7.name     // Catch:{ Exception -> 0x071d }
            r0.put(r7)     // Catch:{ Exception -> 0x071d }
            int r6 = r6 + 1
            goto L_0x0711
        L_0x071d:
            com.a.a.b r1 = f3934E
            java.lang.String r3 = "UNKNOWN"
            m6226a(r1, r3)
        L_0x0724:
            com.a.a.b r1 = f3934E
            m6226a(r1, r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            if (r10 == 0) goto L_0x0746
            java.lang.String[] r1 = r10.requestedPermissions
            if (r1 == 0) goto L_0x0740
            int r3 = r1.length
            r6 = 0
        L_0x0736:
            if (r6 >= r3) goto L_0x0740
            r7 = r1[r6]
            r0.put(r7)
            int r6 = r6 + 1
            goto L_0x0736
        L_0x0740:
            com.a.a.b r1 = f3937H
            m6226a(r1, r0)
            goto L_0x074d
        L_0x0746:
            com.a.a.b r0 = f3937H
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x074d:
            if (r10 == 0) goto L_0x0771
            com.a.a.b r0 = f3954Y
            long r6 = r10.firstInstallTime
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            com.a.a.b r0 = f4083cm
            long r6 = r10.lastUpdateTime
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            m6226a(r0, r1)
            com.a.a.b r0 = f4084cn
            int r1 = r10.versionCode
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x076d:
            m6226a(r0, r1)
            goto L_0x0784
        L_0x0771:
            com.a.a.b r0 = f3954Y
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
            com.a.a.b r0 = f4083cm
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
            com.a.a.b r0 = f4084cn
            java.lang.String r1 = "ERROR"
            goto L_0x076d
        L_0x0784:
            com.a.a.b r0 = f3955Z
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.touchscreen.multitouch"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3983aa
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.touchscreen.multitouch.distinct"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3984ab
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.touchscreen.multitouch.jazzhand"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4021bL
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.touchscreen"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4022bM
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.faketouch"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4024bO
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.faketouch.multitouch.jazzhand"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4023bN
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.faketouch.multitouch.distinct"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3985ac
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.camera"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3986ad
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.camera.front"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3987ae
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.camera.flash"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3988af
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.accelerometer"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3990ah
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.barometer"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3991ai
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.gyroscope"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3992aj
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.compass"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3995am
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.proximity"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3989ag
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.stepcounter"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3994al
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.stepdetector"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3993ak
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.heartrate"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f3996an
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.ambient_temperature"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            int r0 = f4101h
            r1 = 23
            if (r0 < r1) goto L_0x08df
            com.a.a.b r0 = f4025bP
            android.content.pm.PackageManager r1 = f4113t
            java.lang.String r3 = "android.hardware.sensor.hifi_sensors"
            boolean r1 = r1.hasSystemFeature(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x08db:
            m6226a(r0, r1)
            goto L_0x08e4
        L_0x08df:
            com.a.a.b r0 = f4025bP
            java.lang.String r1 = "UNKNOWN"
            goto L_0x08db
        L_0x08e4:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r2 = "com.android.vending"
            r1[r5] = r2
            java.lang.String r2 = "com.google.android.feedback"
            r1[r4] = r2
            java.util.List r1 = java.util.Arrays.asList(r1)
            r0.<init>(r1)
            android.content.pm.PackageManager r1 = f4113t
            android.content.Context r2 = f4098e
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r1 = r1.getInstallerPackageName(r2)
            com.a.a.b r2 = f3997ao
            if (r1 == 0) goto L_0x090e
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x090e
            goto L_0x090f
        L_0x090e:
            r4 = 0
        L_0x090f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            m6226a(r2, r0)
            com.a.a.b r0 = f3998ap
            android.content.pm.PackageManager r1 = f4113t
            android.content.Context r2 = f4098e
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r1 = r1.getInstallerPackageName(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r1.toUpperCase()
            m6226a(r0, r1)
            android.content.pm.PackageManager r0 = f4113t     // Catch:{ Exception -> 0x0950 }
            android.content.Context r1 = f4098e     // Catch:{ Exception -> 0x0950 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x0950 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r5)     // Catch:{ Exception -> 0x0950 }
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0950 }
            java.lang.String r0 = r0.publicSourceDir     // Catch:{ Exception -> 0x0950 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0950 }
            com.a.a.b r0 = f4061bz     // Catch:{ Exception -> 0x0950 }
            long r1 = r1.length()     // Catch:{ Exception -> 0x0950 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0950 }
            m6226a(r0, r1)     // Catch:{ Exception -> 0x0950 }
            goto L_0x0957
        L_0x0950:
            com.a.a.b r0 = f4061bz
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x0957:
            android.content.pm.PackageManager r0 = f4113t     // Catch:{ Exception -> 0x096b }
            android.content.Context r1 = f4098e     // Catch:{ Exception -> 0x096b }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ Exception -> 0x096b }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r5)     // Catch:{ Exception -> 0x096b }
            com.a.a.b r1 = f4010bA     // Catch:{ Exception -> 0x096b }
            java.lang.String r0 = r0.publicSourceDir     // Catch:{ Exception -> 0x096b }
            m6226a(r1, r0)     // Catch:{ Exception -> 0x096b }
            goto L_0x0972
        L_0x096b:
            com.a.a.b r0 = f4010bA
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
        L_0x0972:
            android.content.Context r0 = f4098e
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.bluetooth"
            boolean r0 = r0.hasSystemFeature(r1)
            com.a.a.b r1 = f4000ar
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            m6226a(r1, r2)
            android.content.Context r1 = f4098e
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "android.hardware.wifi"
            boolean r1 = r1.hasSystemFeature(r2)
            com.a.a.b r2 = f4019bJ
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            m6226a(r2, r3)
            com.a.a.b r2 = f4020bK
            android.content.Context r3 = f4098e
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r4 = "android.hardware.telephony"
            boolean r3 = r3.hasSystemFeature(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            m6226a(r2, r3)
            com.a.a.b r2 = f4026bQ
            android.content.Context r3 = f4098e
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r4 = "android.hardware.telephony.cdma"
            boolean r3 = r3.hasSystemFeature(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            m6226a(r2, r3)
            com.a.a.b r2 = f4027bR
            android.content.Context r3 = f4098e
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r4 = "android.hardware.telephony.gsm"
            boolean r3 = r3.hasSystemFeature(r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            m6226a(r2, r3)
            android.content.Context r2 = f4098e
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r3 = "android.hardware.bluetooth"
            boolean r2 = r2.hasSystemFeature(r3)
            com.a.a.b r3 = f4001as
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            m6226a(r3, r4)
            com.a.a.b r3 = f4028bS
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.type.television"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m6226a(r3, r4)
            com.a.a.b r3 = f4030bU
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.type.watch"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            m6226a(r3, r4)
            com.a.a.b r3 = f4032bW
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.software.live_tv"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            m6226a(r3, r4)
            com.a.a.b r3 = f4031bV
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.gamepad"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            m6226a(r3, r4)
            int r3 = f4101h
            r4 = 23
            if (r3 < r4) goto L_0x0a60
            com.a.a.b r3 = f4033bX
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.type.automotive"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x0a5c:
            m6226a(r3, r4)
            goto L_0x0a65
        L_0x0a60:
            com.a.a.b r3 = f4033bX
            java.lang.String r4 = "UNKNOWN"
            goto L_0x0a5c
        L_0x0a65:
            int r3 = f4101h
            r4 = 26
            if (r3 < r4) goto L_0x0a81
            com.a.a.b r3 = f4034bY
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.type.embedded"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x0a7d:
            m6226a(r3, r4)
            goto L_0x0a86
        L_0x0a81:
            com.a.a.b r3 = f4034bY
            java.lang.String r4 = "UNKNOWN"
            goto L_0x0a7d
        L_0x0a86:
            com.a.a.b r3 = f4071ca
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.screen.landscape"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m6226a(r3, r4)
            com.a.a.b r3 = f4035bZ
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.screen.portrait"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m6226a(r3, r4)
            int r3 = f4101h
            r4 = 26
            if (r3 < r4) goto L_0x0acc
            com.a.a.b r3 = f4072cb
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.software.activities_on_secondary_displays"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.String r4 = java.lang.String.valueOf(r4)
        L_0x0ac8:
            m6226a(r3, r4)
            goto L_0x0ad1
        L_0x0acc:
            com.a.a.b r3 = f4072cb
            java.lang.String r4 = "UNKNOWN"
            goto L_0x0ac8
        L_0x0ad1:
            com.a.a.b r3 = f4073cc
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.nfc"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m6226a(r3, r4)
            com.a.a.b r3 = f4074cd
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.usb.host"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m6226a(r3, r4)
            com.a.a.b r3 = f4075ce
            android.content.Context r4 = f4098e
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r6 = "android.hardware.wifi.direct"
            boolean r4 = r4.hasSystemFeature(r6)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            m6226a(r3, r4)
            int r3 = f4101h
            r4 = 24
            if (r3 < r4) goto L_0x0b2c
            com.a.a.b r3 = f4076cf
            android.content.Context r6 = f4098e
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r7 = "android.hardware.ethernet"
            boolean r6 = r6.hasSystemFeature(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x0b28:
            m6226a(r3, r6)
            goto L_0x0b31
        L_0x0b2c:
            com.a.a.b r3 = f4076cf
            java.lang.String r6 = "UNKNOWN"
            goto L_0x0b28
        L_0x0b31:
            com.a.a.b r3 = f4077cg
            android.content.Context r6 = f4098e
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r7 = "android.software.app_widgets"
            boolean r6 = r6.hasSystemFeature(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            m6226a(r3, r6)
            com.a.a.b r3 = f4078ch
            android.content.Context r6 = f4098e
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r7 = "android.hardware.opengles.aep"
            boolean r6 = r6.hasSystemFeature(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            m6226a(r3, r6)
            com.a.a.b r3 = f4079ci
            android.content.Context r6 = f4098e
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r7 = "android.hardware.microphone"
            boolean r6 = r6.hasSystemFeature(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            m6226a(r3, r6)
            com.a.a.b r3 = f4029bT
            android.content.Context r6 = f4098e
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r7 = "android.software.print"
            boolean r6 = r6.hasSystemFeature(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            m6226a(r3, r6)
            int r3 = f4101h
            r6 = 23
            if (r3 < r6) goto L_0x0ba1
            com.a.a.b r3 = f4080cj
            android.content.Context r6 = f4098e
            android.content.pm.PackageManager r6 = r6.getPackageManager()
            java.lang.String r7 = "android.hardware.fingerprint"
            boolean r6 = r6.hasSystemFeature(r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x0b9d:
            m6226a(r3, r6)
            goto L_0x0ba6
        L_0x0ba1:
            com.a.a.b r3 = f4080cj
            java.lang.String r6 = "UNKNOWN"
            goto L_0x0b9d
        L_0x0ba6:
            android.os.PowerManager r3 = f4109p
            if (r3 == 0) goto L_0x0bb5
            android.os.PowerManager r3 = f4109p
            boolean r3 = r3.isInteractive()
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)
            goto L_0x0bb6
        L_0x0bb5:
            r10 = 0
        L_0x0bb6:
            com.a.a.b r3 = f3968aL
            java.lang.String r6 = java.lang.String.valueOf(r10)
            java.lang.String r6 = r6.toUpperCase()
            m6226a(r3, r6)
            android.os.PowerManager r3 = f4109p
            if (r3 == 0) goto L_0x0bdf
            int r3 = f4101h
            r6 = 23
            if (r3 < r6) goto L_0x0bda
            com.a.a.b r3 = f3969aM
            android.os.PowerManager r6 = f4109p
            boolean r6 = r6.isDeviceIdleMode()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            goto L_0x0be3
        L_0x0bda:
            com.a.a.b r3 = f3969aM
            java.lang.String r6 = "UNKNOWN"
            goto L_0x0be3
        L_0x0bdf:
            com.a.a.b r3 = f3969aM
            java.lang.String r6 = "ERROR"
        L_0x0be3:
            m6226a(r3, r6)
            android.os.PowerManager r3 = f4109p
            if (r3 == 0) goto L_0x0bfa
            com.a.a.b r3 = f3970aN
            android.os.PowerManager r6 = f4109p
            boolean r6 = r6.isPowerSaveMode()
            java.lang.String r6 = java.lang.String.valueOf(r6)
        L_0x0bf6:
            m6226a(r3, r6)
            goto L_0x0bff
        L_0x0bfa:
            com.a.a.b r3 = f3970aN
            java.lang.String r6 = "ERROR"
            goto L_0x0bf6
        L_0x0bff:
            com.a.a.b r3 = f3933D
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            int r6 = r6.availableProcessors()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            m6226a(r3, r6)
            com.a.a.b r3 = f3936G
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r6 = r6.totalMemory()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            m6226a(r3, r6)
            android.content.Context r3 = f4098e
            android.content.ContentResolver r3 = r3.getContentResolver()
            java.lang.String r6 = "adb_enabled"
            java.lang.String r3 = android.provider.Settings.Global.getString(r3, r6)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.a.a.b r6 = f3950U
            java.lang.String r7 = "1"
            boolean r3 = r3.equals(r7)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            m6226a(r6, r3)
            int r3 = f4101h
            if (r3 < r4) goto L_0x0c5f
            android.content.Context r3 = f4098e     // Catch:{ SettingNotFoundException -> 0x0c5a }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0c5a }
            java.lang.String r4 = "boot_count"
            int r3 = android.provider.Settings.Global.getInt(r3, r4)     // Catch:{ SettingNotFoundException -> 0x0c5a }
            com.a.a.b r4 = f3953X     // Catch:{ SettingNotFoundException -> 0x0c5a }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ SettingNotFoundException -> 0x0c5a }
            m6226a(r4, r3)     // Catch:{ SettingNotFoundException -> 0x0c5a }
            goto L_0x0c66
        L_0x0c5a:
            com.a.a.b r3 = f3953X
            java.lang.String r4 = "ERROR"
            goto L_0x0c63
        L_0x0c5f:
            com.a.a.b r3 = f3953X
            java.lang.String r4 = "UNKNOWN"
        L_0x0c63:
            m6226a(r3, r4)
        L_0x0c66:
            com.a.a.b r3 = f4003au
            android.content.Context r4 = f4098e
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r6 = "stay_on_while_plugged_in"
            java.lang.String r4 = android.provider.Settings.Global.getString(r4, r6)
            m6226a(r3, r4)
            com.a.a.b r3 = f3949T
            android.content.Context r4 = f4098e
            android.content.ContentResolver r4 = r4.getContentResolver()
            java.lang.String r6 = "accessibility_enabled"
            int r4 = android.provider.Settings.Secure.getInt(r4, r6, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            m6226a(r3, r4)
            if (r0 != 0) goto L_0x0c96
            if (r2 == 0) goto L_0x0c91
            goto L_0x0c96
        L_0x0c91:
            com.a.a.b r0 = f3999aq
            java.lang.String r2 = "FALSE"
            goto L_0x0ca8
        L_0x0c96:
            com.a.a.b r0 = f3999aq
            android.content.Context r2 = f4098e
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r3 = "bluetooth_on"
            int r2 = android.provider.Settings.Secure.getInt(r2, r3, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0ca8:
            m6226a(r0, r2)
            com.a.a.b r0 = f4006ax
            android.content.Context r2 = f4098e
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r3 = "install_non_market_apps"
            int r2 = android.provider.Settings.Secure.getInt(r2, r3, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m6226a(r0, r2)
            com.a.a.b r0 = f4005aw
            android.content.Context r2 = f4098e
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r3 = "usb_mass_storage_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r3, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m6226a(r0, r2)
            com.a.a.b r0 = f4002at
            android.content.Context r2 = f4098e
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r3 = "development_settings_enabled"
            int r2 = android.provider.Settings.Secure.getInt(r2, r3, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            m6226a(r0, r2)
            if (r1 == 0) goto L_0x0d02
            com.a.a.b r0 = f4004av
            android.content.Context r1 = f4098e
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "wifi_on"
            int r1 = android.provider.Settings.Secure.getInt(r1, r2, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0cfe:
            m6226a(r0, r1)
            goto L_0x0d07
        L_0x0d02:
            com.a.a.b r0 = f4004av
            java.lang.String r1 = "FALSE"
            goto L_0x0cfe
        L_0x0d07:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            android.content.Context r1 = f4098e     // Catch:{ SettingNotFoundException -> 0x0d1c }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ SettingNotFoundException -> 0x0d1c }
            java.lang.String r2 = "screen_brightness"
            int r1 = android.provider.Settings.System.getInt(r1, r2)     // Catch:{ SettingNotFoundException -> 0x0d1c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ SettingNotFoundException -> 0x0d1c }
            r0 = r1
        L_0x0d1c:
            com.a.a.b r1 = f3951V
            m6226a(r1, r0)
            com.a.a.b r0 = f3952W
            android.content.Context r1 = f4098e
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r2 = "screen_off_timeout"
            java.lang.String r1 = android.provider.Settings.System.getString(r1, r2)
            m6226a(r0, r1)
            com.a.a.b r0 = f4052bq
            java.lang.String r1 = "http.proxyHost"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4053br
            java.lang.String r1 = "http.proxyPort"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4054bs
            java.lang.String r1 = "http.proxyUser"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4055bt
            java.lang.String r1 = "http.nonProxyHosts"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4056bu
            java.lang.String r1 = "http.agent"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4057bv
            java.lang.String r1 = "socksProxyHost"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4058bw
            java.lang.String r1 = "socksProxyPort"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4059bx
            java.lang.String r1 = "socksProxyVersion"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4060by
            java.lang.String r1 = "java.net.socks.username"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4016bG
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4017bH
            java.lang.String r1 = "os.name"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            m6226a(r0, r1)
            com.a.a.b r0 = f4018bI
            java.lang.String r1 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            m6226a(r0, r1)
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0dee
            com.a.a.b r0 = f3942M
            android.telephony.TelephonyManager r1 = f4110q
            int r1 = r1.getNetworkType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0dea:
            m6226a(r0, r1)
            goto L_0x0df3
        L_0x0dee:
            com.a.a.b r0 = f3942M
            java.lang.String r1 = "ERROR"
            goto L_0x0dea
        L_0x0df3:
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0e03
            com.a.a.b r0 = f3943N
            android.telephony.TelephonyManager r1 = f4110q
            java.lang.String r1 = r1.getSimOperatorName()
        L_0x0dff:
            m6226a(r0, r1)
            goto L_0x0e08
        L_0x0e03:
            com.a.a.b r0 = f3943N
            java.lang.String r1 = "ERROR"
            goto L_0x0dff
        L_0x0e08:
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0e1c
            com.a.a.b r0 = f3944O
            android.telephony.TelephonyManager r1 = f4110q
            int r1 = r1.getPhoneType()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0e18:
            m6226a(r0, r1)
            goto L_0x0e21
        L_0x0e1c:
            com.a.a.b r0 = f3944O
            java.lang.String r1 = "ERROR"
            goto L_0x0e18
        L_0x0e21:
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0e31
            com.a.a.b r0 = f3946Q
            android.telephony.TelephonyManager r1 = f4110q
            java.lang.String r1 = r1.getNetworkOperatorName()
        L_0x0e2d:
            m6226a(r0, r1)
            goto L_0x0e36
        L_0x0e31:
            com.a.a.b r0 = f3946Q
            java.lang.String r1 = "ERROR"
            goto L_0x0e2d
        L_0x0e36:
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0e46
            com.a.a.b r0 = f3947R
            android.telephony.TelephonyManager r1 = f4110q
            java.lang.String r1 = r1.getSimCountryIso()
        L_0x0e42:
            m6226a(r0, r1)
            goto L_0x0e4b
        L_0x0e46:
            com.a.a.b r0 = f3947R
            java.lang.String r1 = "ERROR"
            goto L_0x0e42
        L_0x0e4b:
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0e5b
            com.a.a.b r0 = f3945P
            android.telephony.TelephonyManager r1 = f4110q
            java.lang.String r1 = r1.getNetworkOperator()
        L_0x0e57:
            m6226a(r0, r1)
            goto L_0x0e60
        L_0x0e5b:
            com.a.a.b r0 = f3945P
            java.lang.String r1 = "ERROR"
            goto L_0x0e57
        L_0x0e60:
            int r0 = f4101h
            r1 = 26
            if (r0 < r1) goto L_0x0e8a
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0e85
            boolean r0 = f4105l
            if (r0 != 0) goto L_0x0e78
            boolean r0 = f4106m
            if (r0 == 0) goto L_0x0e73
            goto L_0x0e78
        L_0x0e73:
            com.a.a.b r0 = f3948S
            java.lang.String r1 = "NO_PERMISSION"
            goto L_0x0e8e
        L_0x0e78:
            com.a.a.b r0 = f3948S
            android.telephony.TelephonyManager r1 = f4110q
            boolean r1 = r1.isDataEnabled()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L_0x0e8e
        L_0x0e85:
            com.a.a.b r0 = f3948S
            java.lang.String r1 = "ERROR"
            goto L_0x0e8e
        L_0x0e8a:
            com.a.a.b r0 = f3948S
            java.lang.String r1 = "UNKNOWN"
        L_0x0e8e:
            m6226a(r0, r1)
            android.telephony.TelephonyManager r0 = f4110q
            if (r0 == 0) goto L_0x0ea5
            com.a.a.b r0 = f4081ck
            android.telephony.TelephonyManager r1 = f4110q
            int r1 = r1.getSimState()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x0ea1:
            m6226a(r0, r1)
            goto L_0x0eaa
        L_0x0ea5:
            com.a.a.b r0 = f4081ck
            java.lang.String r1 = "ERROR"
            goto L_0x0ea1
        L_0x0eaa:
            boolean r0 = f4107n
            if (r0 == 0) goto L_0x0eeb
            android.net.wifi.WifiManager r0 = f4111r
            if (r0 == 0) goto L_0x0ee6
            android.net.wifi.WifiManager r0 = f4111r
            boolean r0 = r0.isWifiEnabled()
            if (r0 == 0) goto L_0x0ee1
            android.net.wifi.WifiManager r0 = f4111r
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            if (r0 == 0) goto L_0x0edc
            android.net.wifi.SupplicantState r1 = r0.getSupplicantState()
            android.net.NetworkInfo$DetailedState r1 = android.net.wifi.WifiInfo.getDetailedStateOf(r1)
            android.net.NetworkInfo$DetailedState r2 = android.net.NetworkInfo.DetailedState.CONNECTED
            if (r1 == r2) goto L_0x0ed2
            android.net.NetworkInfo$DetailedState r2 = android.net.NetworkInfo.DetailedState.OBTAINING_IPADDR
            if (r1 != r2) goto L_0x0ef2
        L_0x0ed2:
            com.a.a.b r1 = f3966aJ
            java.lang.String r0 = r0.getSSID()
            m6226a(r1, r0)
            goto L_0x0ef2
        L_0x0edc:
            com.a.a.b r0 = f3966aJ
            java.lang.String r1 = "NULL"
            goto L_0x0eef
        L_0x0ee1:
            com.a.a.b r0 = f3966aJ
            java.lang.String r1 = "UNKNOWN"
            goto L_0x0eef
        L_0x0ee6:
            com.a.a.b r0 = f3966aJ
            java.lang.String r1 = "ERROR"
            goto L_0x0eef
        L_0x0eeb:
            com.a.a.b r0 = f3966aJ
            java.lang.String r1 = "NO_PERMISSION"
        L_0x0eef:
            m6226a(r0, r1)
        L_0x0ef2:
            boolean r0 = f4107n
            if (r0 == 0) goto L_0x0f33
            android.net.wifi.WifiManager r0 = f4111r
            if (r0 == 0) goto L_0x0f2b
            android.net.wifi.WifiManager r0 = f4111r
            boolean r0 = r0.isWifiEnabled()
            if (r0 == 0) goto L_0x0f23
            android.net.wifi.WifiManager r0 = f4111r
            android.net.wifi.WifiInfo r0 = r0.getConnectionInfo()
            if (r0 == 0) goto L_0x0f1c
            android.net.wifi.SupplicantState r0 = r0.getSupplicantState()
            android.net.NetworkInfo$DetailedState r0 = android.net.wifi.WifiInfo.getDetailedStateOf(r0)
            com.a.a.b r1 = f3967aK
            java.lang.String r0 = r0.toString()
            m6226a(r1, r0)
            return
        L_0x0f1c:
            com.a.a.b r0 = f3967aK
            r1 = 0
            m6226a(r0, r1)
            return
        L_0x0f23:
            com.a.a.b r0 = f3967aK
            java.lang.String r1 = "UNKNOWN"
            m6226a(r0, r1)
            return
        L_0x0f2b:
            com.a.a.b r0 = f3967aK
            java.lang.String r1 = "ERROR"
            m6226a(r0, r1)
            return
        L_0x0f33:
            com.a.a.b r0 = f3967aK
            java.lang.String r1 = "NO_PERMISSION"
            m6226a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p032a.p033a.C1134a.m6229b():void");
    }
}
