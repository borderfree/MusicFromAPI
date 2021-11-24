package com.google.sczxing.client.p140a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import android.support.p023v7.app.C0765d.C0766a;
import android.util.Log;
import com.google.sczxing.client.result.C5009m;
import com.seattleclouds.C5451m.C5462k;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.sczxing.client.a.h */
public abstract class C4990h {

    /* renamed from: a */
    private static final String f17841a = "h";

    /* renamed from: b */
    private static final DateFormat f17842b = new SimpleDateFormat("yyyyMMdd", Locale.ENGLISH);

    /* renamed from: c */
    private static final DateFormat f17843c = new SimpleDateFormat("yyyyMMdd'T'HHmmss", Locale.ENGLISH);

    /* renamed from: d */
    private static final String[] f17844d = {"home", "work", "mobile"};

    /* renamed from: e */
    private static final String[] f17845e = {"home", "work", "mobile", "fax", "pager", "main"};

    /* renamed from: f */
    private static final String[] f17846f = {"home", "work"};

    /* renamed from: g */
    private static final int[] f17847g = {1, 2, 4};

    /* renamed from: h */
    private static final int[] f17848h = {1, 3, 2, 4, 6, 12};

    /* renamed from: i */
    private static final int[] f17849i = {1, 2};

    /* renamed from: j */
    private final C5009m f17850j;

    /* renamed from: k */
    private final Activity f17851k;

    static {
        f17842b.setTimeZone(TimeZone.getTimeZone("GMT"));
    }

    C4990h(Activity activity, C5009m mVar) {
        this.f17850j = mVar;
        this.f17851k = activity;
    }

    /* renamed from: a */
    private static int m24743a(String str, String[] strArr, int[] iArr) {
        if (str == null) {
            return -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            if (str.startsWith(str2) || str.startsWith(str2.toUpperCase(Locale.ENGLISH))) {
                return iArr[i];
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static void m24744a(Intent intent, String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            intent.putExtra(str, str2);
        }
    }

    /* renamed from: h */
    private static long m24745h(String str) {
        Date parse;
        Date parse2;
        if (str.length() == 8) {
            synchronized (f17842b) {
                parse2 = f17842b.parse(str, new ParsePosition(0));
            }
            return parse2.getTime();
        }
        synchronized (f17843c) {
            parse = f17843c.parse(str.substring(0, 15), new ParsePosition(0));
        }
        long time = parse.getTime();
        if (str.length() == 16 && str.charAt(15) == 'Z') {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            time += (long) (gregorianCalendar.get(15) + gregorianCalendar.get(16));
        }
        return time;
    }

    /* renamed from: i */
    private static int m24746i(String str) {
        return m24743a(str, f17844d, f17847g);
    }

    /* renamed from: j */
    private static int m24747j(String str) {
        return m24743a(str, f17845e, f17848h);
    }

    /* renamed from: k */
    private static int m24748k(String str) {
        return m24743a(str, f17846f, f17849i);
    }

    /* renamed from: a */
    public abstract int mo16285a();

    /* renamed from: a */
    public abstract int mo16286a(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16293a(Intent intent) {
        if (intent != null) {
            intent.addFlags(524288);
            String str = f17841a;
            StringBuilder sb = new StringBuilder();
            sb.append("Launching intent: ");
            sb.append(intent);
            sb.append(" with extras: ");
            sb.append(intent.getExtras());
            Log.d(str, sb.toString());
            try {
                this.f17851k.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                C0766a aVar = new C0766a(this.f17851k);
                aVar.mo3047a(C5462k.app_name);
                aVar.mo3060b(C5462k.barcode_msg_intent_failed);
                aVar.mo3048a(C5462k.barcode_button_ok, (OnClickListener) null);
                aVar.mo3068c();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16294a(String str) {
        mo16298a("mailto:", null, this.f17851k.getString(C5462k.barcode_msg_share_subject_line), str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16295a(String str, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (");
            sb.append(charSequence);
            sb.append(')');
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("geo:0,0?q=");
        sb2.append(Uri.encode(str));
        mo16293a(new Intent("android.intent.action.VIEW", Uri.parse(sb2.toString())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16296a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("smsto:");
        sb.append(str);
        mo16303b(sb.toString(), str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16297a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("mailto:");
        sb.append(str);
        mo16298a(sb.toString(), str, str2, str3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16298a(String str, String str2, String str3, String str4) {
        Intent intent = new Intent("android.intent.action.SEND", Uri.parse(str));
        if (str2 != null) {
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str2});
        }
        m24744a(intent, "android.intent.extra.SUBJECT", str3);
        m24744a(intent, "android.intent.extra.TEXT", str4);
        intent.setType("text/plain");
        mo16293a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16299a(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setType("vnd.android.cursor.item/event");
        long h = m24745h(str2);
        intent.putExtra("beginTime", h);
        boolean z = str2.length() == 8;
        if (z) {
            intent.putExtra("allDay", true);
        }
        if (str3 != null) {
            h = m24745h(str3);
        } else if (z) {
            h += 86400000;
        }
        intent.putExtra("endTime", h);
        intent.putExtra("title", str);
        intent.putExtra("eventLocation", str4);
        intent.putExtra("description", str5);
        mo16293a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16300a(String[] strArr, String str, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String[] strArr6;
        String[] strArr7 = strArr2;
        String[] strArr8 = strArr3;
        String[] strArr9 = strArr4;
        String[] strArr10 = strArr5;
        Intent intent = new Intent("android.intent.action.INSERT_OR_EDIT", Contacts.CONTENT_URI);
        intent.setType("vnd.android.cursor.item/contact");
        m24744a(intent, "name", strArr != null ? strArr[0] : null);
        String str10 = str;
        m24744a(intent, "phonetic_name", str);
        int min = Math.min(strArr7 != null ? strArr7.length : 0, C4985c.f17831a.length);
        for (int i = 0; i < min; i++) {
            m24744a(intent, C4985c.f17831a[i], strArr7[i]);
            if (strArr8 != null && i < strArr8.length) {
                int j = m24747j(strArr8[i]);
                if (j >= 0) {
                    intent.putExtra(C4985c.f17832b[i], j);
                }
            }
        }
        int min2 = Math.min(strArr9 != null ? strArr9.length : 0, C4985c.f17833c.length);
        for (int i2 = 0; i2 < min2; i2++) {
            m24744a(intent, C4985c.f17833c[i2], strArr9[i2]);
            if (strArr10 != null && i2 < strArr10.length) {
                int i3 = m24746i(strArr10[i2]);
                if (i3 >= 0) {
                    intent.putExtra(C4985c.f17834d[i2], i3);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str11 : new String[]{str8, str9, str2}) {
            if (str11 != null) {
                if (sb.length() > 0) {
                    sb.append(10);
                }
                sb.append(str11);
            }
        }
        if (sb.length() > 0) {
            m24744a(intent, "notes", sb.toString());
        }
        m24744a(intent, "im_handle", str3);
        m24744a(intent, "postal", str4);
        if (str5 != null) {
            int k = m24748k(str5);
            if (k >= 0) {
                intent.putExtra("postal_type", k);
            }
        }
        m24744a(intent, "company", str6);
        m24744a(intent, "job_title", str7);
        mo16293a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo16301a(String[] strArr, String[] strArr2) {
        mo16300a(null, null, strArr, strArr2, null, null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: b */
    public CharSequence mo16287b() {
        return this.f17850j.mo16330o().replace("\r", "");
    }

    /* renamed from: b */
    public abstract void mo16288b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16302b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17851k.getString(C5462k.barcode_msg_share_subject_line));
        sb.append(":\n");
        sb.append(str);
        mo16303b("smsto:", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16303b(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        m24744a(intent, "sms_body", str2);
        intent.putExtra("compose_mode", true);
        mo16293a(intent);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16304b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append("mmsto:");
        sb.append(str);
        mo16307c(sb.toString(), str2, str3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo16305b(String[] strArr, String[] strArr2) {
        mo16300a(null, null, null, null, strArr, strArr2, null, null, null, null, null, null, null, null);
    }

    /* renamed from: c */
    public abstract int mo16289c();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo16306c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("tel:");
        sb.append(str);
        mo16293a(new Intent("android.intent.action.DIAL", Uri.parse(sb.toString())));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo16307c(String str, String str2, String str3) {
        String str4;
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(str));
        if (str2 == null || str2.length() == 0) {
            str4 = "subject";
            str2 = this.f17851k.getString(C5462k.barcode_msg_default_mms_subject);
        } else {
            str4 = "subject";
        }
        m24744a(intent, str4, str2);
        m24744a(intent, "sms_body", str3);
        intent.putExtra("compose_mode", true);
        mo16293a(intent);
    }

    /* renamed from: d */
    public C5009m mo16308d() {
        return this.f17850j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo16309d(String str) {
        mo16293a(new Intent("android.intent.action.DIAL", Uri.parse(str)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo16310e(String str) {
        mo16293a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final void mo16311f(String str) {
        mo16293a(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo16312g(String str) {
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra("query", str);
        mo16293a(intent);
    }
}
