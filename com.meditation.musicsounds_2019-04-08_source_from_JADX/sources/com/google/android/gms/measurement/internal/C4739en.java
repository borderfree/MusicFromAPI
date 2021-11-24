package com.google.android.gms.measurement.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: com.google.android.gms.measurement.internal.en */
final class C4739en extends SSLSocket {

    /* renamed from: a */
    private final SSLSocket f17085a;

    C4739en(C4737el elVar, SSLSocket sSLSocket) {
        this.f17085a = sSLSocket;
    }

    public final void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f17085a.addHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void bind(SocketAddress socketAddress) {
        this.f17085a.bind(socketAddress);
    }

    public final synchronized void close() {
        this.f17085a.close();
    }

    public final void connect(SocketAddress socketAddress) {
        this.f17085a.connect(socketAddress);
    }

    public final void connect(SocketAddress socketAddress, int i) {
        this.f17085a.connect(socketAddress, i);
    }

    public final boolean equals(Object obj) {
        return this.f17085a.equals(obj);
    }

    public final SocketChannel getChannel() {
        return this.f17085a.getChannel();
    }

    public final boolean getEnableSessionCreation() {
        return this.f17085a.getEnableSessionCreation();
    }

    public final String[] getEnabledCipherSuites() {
        return this.f17085a.getEnabledCipherSuites();
    }

    public final String[] getEnabledProtocols() {
        return this.f17085a.getEnabledProtocols();
    }

    public final InetAddress getInetAddress() {
        return this.f17085a.getInetAddress();
    }

    public final InputStream getInputStream() {
        return this.f17085a.getInputStream();
    }

    public final boolean getKeepAlive() {
        return this.f17085a.getKeepAlive();
    }

    public final InetAddress getLocalAddress() {
        return this.f17085a.getLocalAddress();
    }

    public final int getLocalPort() {
        return this.f17085a.getLocalPort();
    }

    public final SocketAddress getLocalSocketAddress() {
        return this.f17085a.getLocalSocketAddress();
    }

    public final boolean getNeedClientAuth() {
        return this.f17085a.getNeedClientAuth();
    }

    public final boolean getOOBInline() {
        return this.f17085a.getOOBInline();
    }

    public final OutputStream getOutputStream() {
        return this.f17085a.getOutputStream();
    }

    public final int getPort() {
        return this.f17085a.getPort();
    }

    public final synchronized int getReceiveBufferSize() {
        return this.f17085a.getReceiveBufferSize();
    }

    public final SocketAddress getRemoteSocketAddress() {
        return this.f17085a.getRemoteSocketAddress();
    }

    public final boolean getReuseAddress() {
        return this.f17085a.getReuseAddress();
    }

    public final synchronized int getSendBufferSize() {
        return this.f17085a.getSendBufferSize();
    }

    public final SSLSession getSession() {
        return this.f17085a.getSession();
    }

    public final int getSoLinger() {
        return this.f17085a.getSoLinger();
    }

    public final synchronized int getSoTimeout() {
        return this.f17085a.getSoTimeout();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f17085a.getSupportedCipherSuites();
    }

    public final String[] getSupportedProtocols() {
        return this.f17085a.getSupportedProtocols();
    }

    public final boolean getTcpNoDelay() {
        return this.f17085a.getTcpNoDelay();
    }

    public final int getTrafficClass() {
        return this.f17085a.getTrafficClass();
    }

    public final boolean getUseClientMode() {
        return this.f17085a.getUseClientMode();
    }

    public final boolean getWantClientAuth() {
        return this.f17085a.getWantClientAuth();
    }

    public final boolean isBound() {
        return this.f17085a.isBound();
    }

    public final boolean isClosed() {
        return this.f17085a.isClosed();
    }

    public final boolean isConnected() {
        return this.f17085a.isConnected();
    }

    public final boolean isInputShutdown() {
        return this.f17085a.isInputShutdown();
    }

    public final boolean isOutputShutdown() {
        return this.f17085a.isOutputShutdown();
    }

    public final void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
        this.f17085a.removeHandshakeCompletedListener(handshakeCompletedListener);
    }

    public final void sendUrgentData(int i) {
        this.f17085a.sendUrgentData(i);
    }

    public final void setEnableSessionCreation(boolean z) {
        this.f17085a.setEnableSessionCreation(z);
    }

    public final void setEnabledCipherSuites(String[] strArr) {
        this.f17085a.setEnabledCipherSuites(strArr);
    }

    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null && Arrays.asList(strArr).contains("SSLv3")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(this.f17085a.getEnabledProtocols()));
            if (arrayList.size() > 1) {
                arrayList.remove("SSLv3");
            }
            strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
        }
        this.f17085a.setEnabledProtocols(strArr);
    }

    public final void setKeepAlive(boolean z) {
        this.f17085a.setKeepAlive(z);
    }

    public final void setNeedClientAuth(boolean z) {
        this.f17085a.setNeedClientAuth(z);
    }

    public final void setOOBInline(boolean z) {
        this.f17085a.setOOBInline(z);
    }

    public final void setPerformancePreferences(int i, int i2, int i3) {
        this.f17085a.setPerformancePreferences(i, i2, i3);
    }

    public final synchronized void setReceiveBufferSize(int i) {
        this.f17085a.setReceiveBufferSize(i);
    }

    public final void setReuseAddress(boolean z) {
        this.f17085a.setReuseAddress(z);
    }

    public final synchronized void setSendBufferSize(int i) {
        this.f17085a.setSendBufferSize(i);
    }

    public final void setSoLinger(boolean z, int i) {
        this.f17085a.setSoLinger(z, i);
    }

    public final synchronized void setSoTimeout(int i) {
        this.f17085a.setSoTimeout(i);
    }

    public final void setTcpNoDelay(boolean z) {
        this.f17085a.setTcpNoDelay(z);
    }

    public final void setTrafficClass(int i) {
        this.f17085a.setTrafficClass(i);
    }

    public final void setUseClientMode(boolean z) {
        this.f17085a.setUseClientMode(z);
    }

    public final void setWantClientAuth(boolean z) {
        this.f17085a.setWantClientAuth(z);
    }

    public final void shutdownInput() {
        this.f17085a.shutdownInput();
    }

    public final void shutdownOutput() {
        this.f17085a.shutdownOutput();
    }

    public final void startHandshake() {
        this.f17085a.startHandshake();
    }

    public final String toString() {
        return this.f17085a.toString();
    }
}
