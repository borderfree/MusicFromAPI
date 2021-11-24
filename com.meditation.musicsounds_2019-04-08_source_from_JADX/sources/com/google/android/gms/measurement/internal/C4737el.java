package com.google.android.gms.measurement.internal;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.el */
final class C4737el extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f17055a;

    C4737el() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C4737el(SSLSocketFactory sSLSocketFactory) {
        this.f17055a = sSLSocketFactory;
    }

    /* renamed from: a */
    private final SSLSocket m23587a(SSLSocket sSLSocket) {
        return new C4739en(this, sSLSocket);
    }

    public final Socket createSocket() {
        return m23587a((SSLSocket) this.f17055a.createSocket());
    }

    public final Socket createSocket(String str, int i) {
        return m23587a((SSLSocket) this.f17055a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m23587a((SSLSocket) this.f17055a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m23587a((SSLSocket) this.f17055a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m23587a((SSLSocket) this.f17055a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m23587a((SSLSocket) this.f17055a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f17055a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f17055a.getSupportedCipherSuites();
    }
}
