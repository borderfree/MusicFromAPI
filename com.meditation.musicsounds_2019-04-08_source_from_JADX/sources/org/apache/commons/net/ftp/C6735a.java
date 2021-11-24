package org.apache.commons.net.ftp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.net.C6734b;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ProtocolCommandSupport;
import org.apache.commons.net.p200io.C6743a;

/* renamed from: org.apache.commons.net.ftp.a */
public class C6735a extends C6734b {

    /* renamed from: i */
    protected int f23659i;

    /* renamed from: j */
    protected ArrayList<String> f23660j;

    /* renamed from: k */
    protected boolean f23661k;

    /* renamed from: l */
    protected String f23662l;

    /* renamed from: m */
    protected String f23663m;

    /* renamed from: n */
    protected ProtocolCommandSupport f23664n;

    /* renamed from: o */
    protected boolean f23665o = false;

    /* renamed from: p */
    protected BufferedReader f23666p;

    /* renamed from: q */
    protected BufferedWriter f23667q;

    public C6735a() {
        mo21108a(21);
        this.f23660j = new ArrayList<>();
        this.f23661k = false;
        this.f23662l = null;
        this.f23663m = "ISO-8859-1";
        this.f23664n = new ProtocolCommandSupport(this);
    }

    /* renamed from: a */
    private void m32511a(boolean z) {
        this.f23661k = true;
        this.f23660j.clear();
        String readLine = this.f23666p.readLine();
        if (readLine != null) {
            int length = readLine.length();
            if (length >= 3) {
                try {
                    String substring = readLine.substring(0, 3);
                    this.f23659i = Integer.parseInt(substring);
                    this.f23660j.add(readLine);
                    if (length > 3 && readLine.charAt(3) == '-') {
                        while (true) {
                            String readLine2 = this.f23666p.readLine();
                            if (readLine2 != null) {
                                this.f23660j.add(readLine2);
                                if (mo21144r()) {
                                    if (!mo21150c(readLine2, substring)) {
                                        break;
                                    }
                                } else if (!mo21153g(readLine2)) {
                                    break;
                                }
                            } else {
                                throw new FTPConnectionClosedException("Connection closed without indication.");
                            }
                        }
                    }
                    mo21109a(this.f23659i, mo21140n());
                    if (this.f23659i == 421) {
                        throw new FTPConnectionClosedException("FTP response 421 received.  Server closed connection.");
                    }
                } catch (NumberFormatException unused) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not parse response code.\nServer Reply: ");
                    sb.append(readLine);
                    throw new MalformedServerReplyException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Truncated server reply: ");
                sb2.append(readLine);
                throw new MalformedServerReplyException(sb2.toString());
            }
        } else {
            throw new FTPConnectionClosedException("Connection closed without indication.");
        }
    }

    /* renamed from: c */
    private boolean mo21150c(String str, String str2) {
        return !str.startsWith(str2) || str.charAt(3) != ' ';
    }

    /* renamed from: d */
    private String mo21152d(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (str2 != null) {
            sb.append(' ');
            sb.append(str2);
        }
        sb.append("\r\n");
        return sb.toString();
    }

    /* renamed from: g */
    private boolean mo21153g(String str) {
        return str.length() <= 3 || str.charAt(3) == '-' || !Character.isDigit(str.charAt(0));
    }

    /* renamed from: h */
    private void mo21154h(String str) {
        try {
            this.f23667q.write(str);
            this.f23667q.flush();
        } catch (SocketException e) {
            if (!mo21117c()) {
                throw new FTPConnectionClosedException("Connection unexpectedly closed.");
            }
            throw e;
        }
    }

    /* renamed from: s */
    private void mo21159s() {
        m32511a(true);
    }

    /* renamed from: a */
    public int mo21123a(FTPCmd fTPCmd) {
        return mo21124a(fTPCmd, null);
    }

    /* renamed from: a */
    public int mo21124a(FTPCmd fTPCmd, String str) {
        return mo21125b(fTPCmd.getCommand(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21107a() {
        super.mo21107a();
        this.f23666p = new C6743a(new InputStreamReader(this.f23649d, mo21135i()));
        this.f23667q = new BufferedWriter(new OutputStreamWriter(this.f23650e, mo21135i()));
        if (this.f23653h > 0) {
            int soTimeout = this.f23647b.getSoTimeout();
            this.f23647b.setSoTimeout(this.f23653h);
            try {
                mo21159s();
                if (C6742e.m32574a(this.f23659i)) {
                    mo21159s();
                }
                this.f23647b.setSoTimeout(soTimeout);
            } catch (SocketTimeoutException e) {
                IOException iOException = new IOException("Timed out waiting for initial connect reply");
                iOException.initCause(e);
                throw iOException;
            } catch (Throwable th) {
                this.f23647b.setSoTimeout(soTimeout);
                throw th;
            }
        } else {
            mo21159s();
            if (C6742e.m32574a(this.f23659i)) {
                mo21159s();
            }
        }
    }

    /* renamed from: b */
    public int mo21125b(String str, String str2) {
        if (this.f23667q != null) {
            String d = mo21152d(str, str2);
            mo21154h(d);
            mo21112a(str, d);
            mo21159s();
            return this.f23659i;
        }
        throw new IOException("Connection is not open");
    }

    /* renamed from: b */
    public int mo21126b(InetAddress inetAddress, int i) {
        StringBuilder sb = new StringBuilder(24);
        sb.append(inetAddress.getHostAddress().replace('.', ','));
        int i2 = i >>> 8;
        sb.append(',');
        sb.append(i2);
        sb.append(',');
        sb.append(i & 255);
        return mo21124a(FTPCmd.PORT, sb.toString());
    }

    /* renamed from: b */
    public void mo21115b() {
        super.mo21115b();
        this.f23666p = null;
        this.f23667q = null;
        this.f23661k = false;
        this.f23662l = null;
    }

    /* renamed from: b */
    public void mo21127b(String str) {
        this.f23663m = str;
    }

    /* renamed from: c */
    public int mo21128c(int i) {
        return mo21124a(FTPCmd.TYPE, "AEILNTCFRPSBC".substring(i, i + 1));
    }

    /* renamed from: c */
    public int mo21129c(String str) {
        return mo21124a(FTPCmd.USER, str);
    }

    /* renamed from: c */
    public int mo21130c(InetAddress inetAddress, int i) {
        String str;
        StringBuilder sb = new StringBuilder();
        String hostAddress = inetAddress.getHostAddress();
        int indexOf = hostAddress.indexOf("%");
        if (indexOf > 0) {
            hostAddress = hostAddress.substring(0, indexOf);
        }
        sb.append("|");
        if (inetAddress instanceof Inet4Address) {
            str = "1";
        } else {
            if (inetAddress instanceof Inet6Address) {
                str = "2";
            }
            sb.append("|");
            sb.append(hostAddress);
            sb.append("|");
            sb.append(i);
            sb.append("|");
            return mo21124a(FTPCmd.EPRT, sb.toString());
        }
        sb.append(str);
        sb.append("|");
        sb.append(hostAddress);
        sb.append("|");
        sb.append(i);
        sb.append("|");
        return mo21124a(FTPCmd.EPRT, sb.toString());
    }

    /* renamed from: d */
    public int mo21131d(String str) {
        return mo21124a(FTPCmd.PASS, str);
    }

    /* renamed from: e */
    public int mo21132e(String str) {
        return mo21124a(FTPCmd.CWD, str);
    }

    /* renamed from: f */
    public int mo21133f(String str) {
        return mo21124a(FTPCmd.REST, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ProtocolCommandSupport mo21121g() {
        return this.f23664n;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo21134h() {
        m32511a(false);
    }

    /* renamed from: i */
    public String mo21135i() {
        return this.f23663m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo21136j() {
        mo21154h(mo21152d(FTPCmd.NOOP.getCommand(), null));
        mo21134h();
    }

    /* renamed from: k */
    public int mo21137k() {
        return this.f23659i;
    }

    /* renamed from: l */
    public int mo21138l() {
        mo21159s();
        return this.f23659i;
    }

    /* renamed from: m */
    public String[] mo21139m() {
        return (String[]) this.f23660j.toArray(new String[this.f23660j.size()]);
    }

    /* renamed from: n */
    public String mo21140n() {
        if (!this.f23661k) {
            return this.f23662l;
        }
        StringBuilder sb = new StringBuilder(256);
        Iterator it = this.f23660j.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("\r\n");
        }
        this.f23661k = false;
        String sb2 = sb.toString();
        this.f23662l = sb2;
        return sb2;
    }

    /* renamed from: o */
    public int mo21141o() {
        return mo21123a(FTPCmd.PASV);
    }

    /* renamed from: p */
    public int mo21142p() {
        return mo21123a(FTPCmd.EPSV);
    }

    /* renamed from: q */
    public int mo21143q() {
        return mo21123a(FTPCmd.FEAT);
    }

    /* renamed from: r */
    public boolean mo21144r() {
        return this.f23665o;
    }
}
