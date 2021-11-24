package org.jsoup.parser;

import org.jsoup.helper.C6759b;

/* renamed from: org.jsoup.parser.a */
class C6869a {

    /* renamed from: a */
    private final String f23768a;

    /* renamed from: b */
    private final int f23769b;

    /* renamed from: c */
    private int f23770c = 0;

    /* renamed from: d */
    private int f23771d = 0;

    C6869a(String str) {
        C6759b.m32602a((Object) str);
        String replaceAll = str.replaceAll("\r\n?", "\n");
        this.f23768a = replaceAll;
        this.f23769b = replaceAll.length();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo21346a() {
        return this.f23770c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo21347a(char c) {
        int indexOf = this.f23768a.indexOf(c, this.f23770c);
        if (indexOf == -1) {
            return mo21364i();
        }
        String substring = this.f23768a.substring(this.f23770c, indexOf);
        this.f23770c += substring.length();
        return substring;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo21348a(String str) {
        int indexOf = this.f23768a.indexOf(str, this.f23770c);
        if (indexOf == -1) {
            return mo21364i();
        }
        String substring = this.f23768a.substring(this.f23770c, indexOf);
        this.f23770c += substring.length();
        return substring;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo21349a(char... cArr) {
        int i = this.f23770c;
        loop0:
        while (!mo21350b()) {
            char charAt = this.f23768a.charAt(this.f23770c);
            for (char c : cArr) {
                if (c == charAt) {
                    break loop0;
                }
            }
            this.f23770c++;
        }
        return this.f23770c > i ? this.f23768a.substring(i, this.f23770c) : "";
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo21350b() {
        return this.f23770c >= this.f23769b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo21351b(char c) {
        return !mo21350b() && this.f23768a.charAt(this.f23770c) == c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo21352b(String str) {
        return this.f23768a.startsWith(str, this.f23770c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo21353b(char... cArr) {
        if (mo21350b()) {
            return false;
        }
        char charAt = this.f23768a.charAt(this.f23770c);
        for (char c : cArr) {
            if (c == charAt) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public char mo21354c() {
        if (mo21350b()) {
            return 65535;
        }
        return this.f23768a.charAt(this.f23770c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo21355c(String str) {
        return this.f23768a.regionMatches(true, this.f23770c, str, 0, str.length());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public char mo21356d() {
        char charAt = mo21350b() ? 65535 : this.f23768a.charAt(this.f23770c);
        this.f23770c++;
        return charAt;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo21357d(String str) {
        if (!mo21352b(str)) {
            return false;
        }
        this.f23770c += str.length();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo21358e() {
        this.f23770c--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo21359e(String str) {
        if (!mo21355c(str)) {
            return false;
        }
        this.f23770c += str.length();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo21360f() {
        this.f23770c++;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo21361f(String str) {
        return this.f23768a.indexOf(str.toLowerCase(), this.f23770c) > -1 || this.f23768a.indexOf(str.toUpperCase(), this.f23770c) > -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21362g() {
        this.f23771d = this.f23770c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21363h() {
        this.f23770c = this.f23771d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public String mo21364i() {
        String substring = this.f23768a.substring(this.f23770c, this.f23768a.length());
        this.f23770c = this.f23768a.length();
        return substring;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public String mo21365j() {
        int i = this.f23770c;
        while (!mo21350b()) {
            char charAt = this.f23768a.charAt(this.f23770c);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                break;
            }
            this.f23770c++;
        }
        return this.f23768a.substring(i, this.f23770c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public String mo21366k() {
        int i = this.f23770c;
        while (!mo21350b()) {
            char charAt = this.f23768a.charAt(this.f23770c);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'A' || charAt > 'F') && (charAt < 'a' || charAt > 'f'))) {
                break;
            }
            this.f23770c++;
        }
        return this.f23768a.substring(i, this.f23770c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public String mo21367l() {
        int i = this.f23770c;
        while (!mo21350b()) {
            char charAt = this.f23768a.charAt(this.f23770c);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            this.f23770c++;
        }
        return this.f23768a.substring(i, this.f23770c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public boolean mo21368m() {
        boolean z = false;
        if (mo21350b()) {
            return false;
        }
        char charAt = this.f23768a.charAt(this.f23770c);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public boolean mo21369n() {
        boolean z = false;
        if (mo21350b()) {
            return false;
        }
        char charAt = this.f23768a.charAt(this.f23770c);
        if (charAt >= '0' && charAt <= '9') {
            z = true;
        }
        return z;
    }

    public String toString() {
        return this.f23768a.substring(this.f23770c);
    }
}
