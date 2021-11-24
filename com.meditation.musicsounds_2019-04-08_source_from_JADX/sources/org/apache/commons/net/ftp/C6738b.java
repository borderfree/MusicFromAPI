package org.apache.commons.net.ftp;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.net.MalformedServerReplyException;
import org.apache.commons.net.ftp.p199a.C6736a;
import org.apache.commons.net.ftp.p199a.C6737b;
import org.apache.commons.net.p200io.C6743a;
import org.apache.commons.net.p200io.C6744b;
import org.apache.commons.net.p200io.C6745c;
import org.apache.commons.net.p200io.C6746d;
import org.apache.commons.net.p200io.C6747e;

/* renamed from: org.apache.commons.net.ftp.b */
public class C6738b extends C6735a {

    /* renamed from: V */
    private static final Pattern f23669V = Pattern.compile("(\\d{1,3},\\d{1,3},\\d{1,3},\\d{1,3}),(\\d{1,3}),(\\d{1,3})");

    /* renamed from: A */
    private InetAddress f23670A;

    /* renamed from: B */
    private int f23671B;

    /* renamed from: C */
    private int f23672C;

    /* renamed from: D */
    private int f23673D;

    /* renamed from: E */
    private int f23674E;

    /* renamed from: F */
    private boolean f23675F;

    /* renamed from: G */
    private long f23676G;

    /* renamed from: H */
    private C6737b f23677H;

    /* renamed from: I */
    private int f23678I;

    /* renamed from: J */
    private int f23679J;

    /* renamed from: K */
    private int f23680K;

    /* renamed from: L */
    private boolean f23681L;

    /* renamed from: M */
    private boolean f23682M;

    /* renamed from: N */
    private String f23683N;

    /* renamed from: O */
    private C6741d f23684O;

    /* renamed from: P */
    private String f23685P;

    /* renamed from: Q */
    private C6740c f23686Q;

    /* renamed from: R */
    private C6745c f23687R;

    /* renamed from: S */
    private long f23688S;

    /* renamed from: T */
    private int f23689T = 1000;

    /* renamed from: U */
    private boolean f23690U = true;

    /* renamed from: W */
    private boolean f23691W = false;

    /* renamed from: X */
    private HashMap<String, Set<String>> f23692X;

    /* renamed from: r */
    private int f23693r;

    /* renamed from: s */
    private int f23694s;

    /* renamed from: t */
    private int f23695t;

    /* renamed from: u */
    private String f23696u;

    /* renamed from: v */
    private final Random f23697v;

    /* renamed from: w */
    private int f23698w;

    /* renamed from: x */
    private int f23699x;

    /* renamed from: y */
    private InetAddress f23700y;

    /* renamed from: z */
    private InetAddress f23701z;

    /* renamed from: org.apache.commons.net.ftp.b$a */
    private static class C6739a implements C6745c {

        /* renamed from: a */
        private final C6738b f23702a;

        /* renamed from: b */
        private final long f23703b;

        /* renamed from: c */
        private final int f23704c;

        /* renamed from: d */
        private long f23705d = System.currentTimeMillis();

        /* renamed from: e */
        private int f23706e;

        C6739a(C6738b bVar, long j, int i) {
            this.f23703b = j;
            this.f23702a = bVar;
            this.f23704c = bVar.mo21118d();
            bVar.mo21116b(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo21165a() {
            while (true) {
                try {
                    int i = this.f23706e;
                    this.f23706e = i - 1;
                    if (i > 0) {
                        this.f23702a.mo21134h();
                    } else {
                        return;
                    }
                } finally {
                    this.f23702a.mo21116b(this.f23704c);
                }
            }
        }

        /* renamed from: a */
        public void mo19748a(long j, int i, long j2) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f23705d > this.f23703b) {
                try {
                    this.f23702a.mo21136j();
                } catch (SocketTimeoutException unused) {
                    this.f23706e++;
                } catch (IOException unused2) {
                }
                this.f23705d = currentTimeMillis;
            }
        }
    }

    public C6738b() {
        m32548y();
        this.f23694s = -1;
        this.f23675F = true;
        this.f23677H = new C6736a();
        this.f23686Q = null;
        this.f23681L = false;
        this.f23682M = false;
        this.f23697v = new Random();
        this.f23670A = null;
    }

    /* renamed from: A */
    private InetAddress m32542A() {
        return this.f23700y != null ? this.f23700y : mo21119e();
    }

    /* renamed from: B */
    private InetAddress m32543B() {
        return this.f23701z != null ? this.f23701z : m32542A();
    }

    /* renamed from: C */
    private boolean m32544C() {
        String[] m;
        String str;
        if (this.f23692X == null) {
            boolean b = C6742e.m32575b(mo21143q());
            this.f23692X = new HashMap<>();
            if (!b) {
                return false;
            }
            for (String str2 : mo21139m()) {
                if (str2.startsWith(" ")) {
                    String str3 = "";
                    int indexOf = str2.indexOf(32, 1);
                    if (indexOf > 0) {
                        String substring = str2.substring(1, indexOf);
                        str3 = str2.substring(indexOf + 1);
                        str = substring;
                    } else {
                        str = str2.substring(1);
                    }
                    String upperCase = str.toUpperCase(Locale.ENGLISH);
                    Set set = (Set) this.f23692X.get(upperCase);
                    if (set == null) {
                        set = new HashSet();
                        this.f23692X.put(upperCase, set);
                    }
                    set.add(str3);
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    private OutputStream m32545a(OutputStream outputStream) {
        return this.f23678I > 0 ? new BufferedOutputStream(outputStream, this.f23678I) : new BufferedOutputStream(outputStream);
    }

    /* renamed from: a */
    private boolean m32546a(FTPCmd fTPCmd, String str, InputStream inputStream) {
        return mo21148a(fTPCmd.getCommand(), str, inputStream);
    }

    /* renamed from: b */
    private C6745c m32547b(C6745c cVar) {
        if (cVar == null) {
            return this.f23687R;
        }
        if (this.f23687R == null) {
            return cVar;
        }
        C6744b bVar = new C6744b();
        bVar.mo21169a(cVar);
        bVar.mo21169a(this.f23687R);
        return bVar;
    }

    /* renamed from: y */
    private void m32548y() {
        this.f23693r = 0;
        this.f23696u = null;
        this.f23695t = -1;
        this.f23700y = null;
        this.f23701z = null;
        this.f23698w = 0;
        this.f23699x = 0;
        this.f23671B = 0;
        this.f23673D = 7;
        this.f23672C = 4;
        this.f23674E = 10;
        this.f23676G = 0;
        this.f23683N = null;
        this.f23684O = null;
        this.f23685P = "";
        this.f23692X = null;
    }

    /* renamed from: z */
    private int m32549z() {
        if (this.f23698w <= 0 || this.f23699x < this.f23698w) {
            return 0;
        }
        return this.f23699x == this.f23698w ? this.f23699x : this.f23697v.nextInt((this.f23699x - this.f23698w) + 1) + this.f23698w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21107a() {
        super.mo21107a();
        m32548y();
        if (this.f23691W) {
            ArrayList arrayList = new ArrayList(this.f23660j);
            int i = this.f23659i;
            if (mo21156j("UTF8") || mo21156j("UTF-8")) {
                mo21127b("UTF-8");
                this.f23666p = new C6743a(new InputStreamReader(this.f23649d, mo21135i()));
                this.f23667q = new BufferedWriter(new OutputStreamWriter(this.f23650e, mo21135i()));
            }
            this.f23660j.clear();
            this.f23660j.addAll(arrayList);
            this.f23659i = i;
        }
    }

    /* renamed from: a */
    public void mo21145a(C6745c cVar) {
        this.f23687R = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo21146a(long j) {
        this.f23676G = 0;
        return C6742e.m32576c(mo21133f(Long.toString(j)));
    }

    /* renamed from: a */
    public boolean mo21147a(String str, InputStream inputStream) {
        return m32546a(FTPCmd.STOR, str, inputStream);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo21148a(String str, String str2, InputStream inputStream) {
        Socket c = mo21150c(str, str2);
        if (c == null) {
            return false;
        }
        OutputStream a = m32545a(c.getOutputStream());
        if (this.f23671B == 0) {
            a = new C6746d(a);
        }
        C6739a aVar = null;
        if (this.f23688S > 0) {
            aVar = new C6739a(this, this.f23688S, this.f23689T);
        }
        try {
            C6747e.m32580a(inputStream, a, mo21162v(), -1, m32547b(aVar), false);
            a.close();
            c.close();
            if (aVar != null) {
                aVar.mo21165a();
            }
            return mo21160t();
        } catch (IOException e) {
            C6747e.m32581a(c);
            if (aVar != null) {
                aVar.mo21165a();
            }
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Socket mo21149b(FTPCmd fTPCmd, String str) {
        return mo21150c(fTPCmd.getCommand(), str);
    }

    /* renamed from: b */
    public void mo21115b() {
        super.mo21115b();
        m32548y();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Socket mo21150c(String str, String str2) {
        Socket socket;
        if (this.f23693r != 0 && this.f23693r != 2) {
            return null;
        }
        boolean z = mo21120f() instanceof Inet6Address;
        boolean z2 = true;
        if (this.f23693r == 0) {
            ServerSocket createServerSocket = this.f23652g.createServerSocket(m32549z(), 1, m32542A());
            if (z) {
                if (!C6742e.m32575b(mo21130c(m32543B(), createServerSocket.getLocalPort()))) {
                    createServerSocket.close();
                    return null;
                }
            } else if (!C6742e.m32575b(mo21126b(m32543B(), createServerSocket.getLocalPort()))) {
                createServerSocket.close();
                return null;
            }
            try {
                if (this.f23676G > 0 && !mo21146a(this.f23676G)) {
                    return null;
                }
                if (!C6742e.m32574a(mo21125b(str, str2))) {
                    createServerSocket.close();
                    return null;
                }
                if (this.f23694s >= 0) {
                    createServerSocket.setSoTimeout(this.f23694s);
                }
                socket = createServerSocket.accept();
                if (this.f23694s >= 0) {
                    socket.setSoTimeout(this.f23694s);
                }
                if (this.f23680K > 0) {
                    socket.setReceiveBufferSize(this.f23680K);
                }
                if (this.f23679J > 0) {
                    socket.setSendBufferSize(this.f23679J);
                }
                createServerSocket.close();
            } finally {
                createServerSocket.close();
            }
        } else {
            if (!mo21164x() && !z) {
                z2 = false;
            }
            if (z2 && mo21142p() == 229) {
                mo21154h((String) this.f23660j.get(0));
            } else if (z || mo21141o() != 227) {
                return null;
            } else {
                mo21153g((String) this.f23660j.get(0));
            }
            Socket createSocket = this.f23651f.createSocket();
            if (this.f23680K > 0) {
                createSocket.setReceiveBufferSize(this.f23680K);
            }
            if (this.f23679J > 0) {
                createSocket.setSendBufferSize(this.f23679J);
            }
            if (this.f23670A != null) {
                createSocket.bind(new InetSocketAddress(this.f23670A, 0));
            }
            if (this.f23694s >= 0) {
                createSocket.setSoTimeout(this.f23694s);
            }
            createSocket.connect(new InetSocketAddress(this.f23696u, this.f23695t), this.f23653h);
            if (this.f23676G > 0 && !mo21146a(this.f23676G)) {
                createSocket.close();
                return null;
            } else if (!C6742e.m32574a(mo21125b(str, str2))) {
                createSocket.close();
                return null;
            } else {
                socket = createSocket;
            }
        }
        if (!this.f23675F || mo21114a(socket)) {
            return socket;
        }
        socket.close();
        StringBuilder sb = new StringBuilder();
        sb.append("Host attempting data connection ");
        sb.append(socket.getInetAddress().getHostAddress());
        sb.append(" is not same as server ");
        sb.append(mo21120f().getHostAddress());
        throw new IOException(sb.toString());
    }

    /* renamed from: d */
    public boolean mo21151d(int i) {
        if (!C6742e.m32575b(mo21128c(i))) {
            return false;
        }
        this.f23671B = i;
        this.f23672C = 4;
        return true;
    }

    /* renamed from: d */
    public boolean mo21152d(String str, String str2) {
        mo21129c(str);
        if (C6742e.m32575b(this.f23659i)) {
            return true;
        }
        if (!C6742e.m32576c(this.f23659i)) {
            return false;
        }
        return C6742e.m32575b(mo21131d(str2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo21153g(String str) {
        Matcher matcher = f23669V.matcher(str);
        if (matcher.find()) {
            this.f23696u = matcher.group(1).replace(',', '.');
            try {
                this.f23695t = Integer.parseInt(matcher.group(3)) | (Integer.parseInt(matcher.group(2)) << 8);
                if (this.f23690U) {
                    try {
                        if (InetAddress.getByName(this.f23696u).isSiteLocalAddress()) {
                            InetAddress f = mo21120f();
                            if (!f.isSiteLocalAddress()) {
                                String hostAddress = f.getHostAddress();
                                StringBuilder sb = new StringBuilder();
                                sb.append("[Replacing site local address ");
                                sb.append(this.f23696u);
                                sb.append(" with ");
                                sb.append(hostAddress);
                                sb.append("]\n");
                                mo21109a(0, sb.toString());
                                this.f23696u = hostAddress;
                            }
                        }
                    } catch (UnknownHostException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Could not parse passive host information.\nServer Reply: ");
                        sb2.append(str);
                        throw new MalformedServerReplyException(sb2.toString());
                    }
                }
            } catch (NumberFormatException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Could not parse passive port information.\nServer Reply: ");
                sb3.append(str);
                throw new MalformedServerReplyException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Could not parse passive host information.\nServer Reply: ");
            sb4.append(str);
            throw new MalformedServerReplyException(sb4.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo21154h(String str) {
        String trim = str.substring(str.indexOf(40) + 1, str.indexOf(41)).trim();
        char charAt = trim.charAt(0);
        char charAt2 = trim.charAt(1);
        char charAt3 = trim.charAt(2);
        char charAt4 = trim.charAt(trim.length() - 1);
        if (charAt == charAt2 && charAt2 == charAt3 && charAt3 == charAt4) {
            try {
                int parseInt = Integer.parseInt(trim.substring(3, trim.length() - 1));
                this.f23696u = mo21120f().getHostAddress();
                this.f23695t = parseInt;
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not parse extended passive host information.\nServer Reply: ");
                sb.append(trim);
                throw new MalformedServerReplyException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not parse extended passive host information.\nServer Reply: ");
            sb2.append(trim);
            throw new MalformedServerReplyException(sb2.toString());
        }
    }

    /* renamed from: i */
    public boolean mo21155i(String str) {
        return C6742e.m32575b(mo21132e(str));
    }

    /* renamed from: j */
    public boolean mo21156j(String str) {
        if (!m32544C()) {
            return false;
        }
        return this.f23692X.containsKey(str.toUpperCase(Locale.ENGLISH));
    }

    /* renamed from: k */
    public String[] mo21157k(String str) {
        Socket b = mo21149b(FTPCmd.NLST, mo21158l(str));
        if (b == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.getInputStream(), mo21135i()));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            arrayList.add(readLine);
        }
        bufferedReader.close();
        b.close();
        if (mo21160t()) {
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public String mo21158l(String str) {
        if (mo21163w()) {
            if (str != null) {
                StringBuilder sb = new StringBuilder(str.length() + 3);
                sb.append("-a ");
                sb.append(str);
                return sb.toString();
            }
            str = "-a";
        }
        return str;
    }

    /* renamed from: s */
    public void mo21159s() {
        this.f23693r = 2;
        this.f23696u = null;
        this.f23695t = -1;
    }

    /* renamed from: t */
    public boolean mo21160t() {
        return C6742e.m32575b(mo21138l());
    }

    /* renamed from: u */
    public String[] mo21161u() {
        return mo21157k(null);
    }

    /* renamed from: v */
    public int mo21162v() {
        return this.f23678I;
    }

    /* renamed from: w */
    public boolean mo21163w() {
        return this.f23681L;
    }

    /* renamed from: x */
    public boolean mo21164x() {
        return this.f23682M;
    }
}
