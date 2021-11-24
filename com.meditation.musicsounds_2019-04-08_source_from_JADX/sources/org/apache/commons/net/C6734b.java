package org.apache.commons.net;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;

/* renamed from: org.apache.commons.net.b */
public abstract class C6734b {

    /* renamed from: i */
    private static final SocketFactory f23644i = SocketFactory.getDefault();

    /* renamed from: j */
    private static final ServerSocketFactory f23645j = ServerSocketFactory.getDefault();

    /* renamed from: a */
    protected int f23646a = 0;

    /* renamed from: b */
    protected Socket f23647b = null;

    /* renamed from: c */
    protected int f23648c = 0;

    /* renamed from: d */
    protected InputStream f23649d = null;

    /* renamed from: e */
    protected OutputStream f23650e = null;

    /* renamed from: f */
    protected SocketFactory f23651f = f23644i;

    /* renamed from: g */
    protected ServerSocketFactory f23652g = f23645j;

    /* renamed from: h */
    protected int f23653h = 0;

    /* renamed from: k */
    private ProtocolCommandSupport f23654k;

    /* renamed from: l */
    private int f23655l = -1;

    /* renamed from: m */
    private int f23656m = -1;

    /* renamed from: n */
    private Charset f23657n = Charset.defaultCharset();

    /* renamed from: a */
    private void m32494a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    private void m32495b(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21107a() {
        this.f23647b.setSoTimeout(this.f23646a);
        this.f23649d = this.f23647b.getInputStream();
        this.f23650e = this.f23647b.getOutputStream();
    }

    /* renamed from: a */
    public void mo21108a(int i) {
        this.f23648c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21109a(int i, String str) {
        if (mo21121g().getListenerCount() > 0) {
            mo21121g().fireReplyReceived(i, str);
        }
    }

    /* renamed from: a */
    public void mo21110a(String str) {
        mo21111a(str, this.f23648c);
    }

    /* renamed from: a */
    public void mo21111a(String str, int i) {
        mo21113a(InetAddress.getByName(str), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21112a(String str, String str2) {
        if (mo21121g().getListenerCount() > 0) {
            mo21121g().fireCommandSent(str, str2);
        }
    }

    /* renamed from: a */
    public void mo21113a(InetAddress inetAddress, int i) {
        this.f23647b = this.f23651f.createSocket();
        if (this.f23655l != -1) {
            this.f23647b.setReceiveBufferSize(this.f23655l);
        }
        if (this.f23656m != -1) {
            this.f23647b.setSendBufferSize(this.f23656m);
        }
        this.f23647b.connect(new InetSocketAddress(inetAddress, i), this.f23653h);
        mo21107a();
    }

    /* renamed from: a */
    public boolean mo21114a(Socket socket) {
        return socket.getInetAddress().equals(mo21120f());
    }

    /* renamed from: b */
    public void mo21115b() {
        m32495b(this.f23647b);
        m32494a((Closeable) this.f23649d);
        m32494a((Closeable) this.f23650e);
        this.f23647b = null;
        this.f23649d = null;
        this.f23650e = null;
    }

    /* renamed from: b */
    public void mo21116b(int i) {
        this.f23647b.setSoTimeout(i);
    }

    /* renamed from: c */
    public boolean mo21117c() {
        if (this.f23647b == null) {
            return false;
        }
        return this.f23647b.isConnected();
    }

    /* renamed from: d */
    public int mo21118d() {
        return this.f23647b.getSoTimeout();
    }

    /* renamed from: e */
    public InetAddress mo21119e() {
        return this.f23647b.getLocalAddress();
    }

    /* renamed from: f */
    public InetAddress mo21120f() {
        return this.f23647b.getInetAddress();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ProtocolCommandSupport mo21121g() {
        return this.f23654k;
    }
}
