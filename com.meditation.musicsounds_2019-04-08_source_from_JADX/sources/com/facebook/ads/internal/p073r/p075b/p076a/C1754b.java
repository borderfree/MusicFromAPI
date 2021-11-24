package com.facebook.ads.internal.p073r.p075b.p076a;

import com.facebook.ads.internal.p073r.p075b.C1752a;
import com.facebook.ads.internal.p073r.p075b.C1781l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* renamed from: com.facebook.ads.internal.r.b.a.b */
public class C1754b implements C1752a {

    /* renamed from: a */
    public File f5756a;

    /* renamed from: b */
    private final C1753a f5757b;

    /* renamed from: c */
    private RandomAccessFile f5758c;

    public C1754b(File file, C1753a aVar) {
        File file2;
        if (aVar != null) {
            try {
                this.f5757b = aVar;
                C1756d.m8774a(file.getParentFile());
                boolean exists = file.exists();
                if (exists) {
                    file2 = file;
                } else {
                    File parentFile = file.getParentFile();
                    StringBuilder sb = new StringBuilder();
                    sb.append(file.getName());
                    sb.append(".download");
                    file2 = new File(parentFile, sb.toString());
                }
                this.f5756a = file2;
                this.f5758c = new RandomAccessFile(this.f5756a, exists ? "r" : "rw");
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error using file ");
                sb2.append(file);
                sb2.append(" as disc cache");
                throw new C1781l(sb2.toString(), e);
            }
        } else {
            throw new NullPointerException();
        }
    }

    /* renamed from: a */
    private boolean m8766a(File file) {
        return file.getName().endsWith(".download");
    }

    /* renamed from: a */
    public synchronized int mo7014a() {
        try {
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error reading length of file ");
            sb.append(this.f5756a);
            throw new C1781l(sb.toString(), e);
        }
        return (int) this.f5758c.length();
    }

    /* renamed from: a */
    public synchronized int mo7015a(byte[] bArr, long j, int i) {
        try {
            this.f5758c.seek(j);
        } catch (IOException e) {
            throw new C1781l(String.format(Locale.US, "Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", new Object[]{Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(mo7014a()), Integer.valueOf(bArr.length)}), e);
        }
        return this.f5758c.read(bArr, 0, i);
    }

    /* renamed from: a */
    public synchronized void mo7016a(byte[] bArr, int i) {
        try {
            if (!mo7019d()) {
                this.f5758c.seek((long) mo7014a());
                this.f5758c.write(bArr, 0, i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Error append cache: cache file ");
                sb.append(this.f5756a);
                sb.append(" is completed!");
                throw new C1781l(sb.toString());
            }
        } catch (IOException e) {
            String str = "Error writing %d bytes to %s from buffer with size %d";
            throw new C1781l(String.format(Locale.US, str, new Object[]{Integer.valueOf(i), this.f5758c, Integer.valueOf(bArr.length)}), e);
        }
    }

    /* renamed from: b */
    public synchronized void mo7017b() {
        try {
            this.f5758c.close();
            this.f5757b.mo7020a(this.f5756a);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error closing file ");
            sb.append(this.f5756a);
            throw new C1781l(sb.toString(), e);
        }
    }

    /* renamed from: c */
    public synchronized void mo7018c() {
        if (!mo7019d()) {
            mo7017b();
            File file = new File(this.f5756a.getParentFile(), this.f5756a.getName().substring(0, this.f5756a.getName().length() - ".download".length()));
            if (this.f5756a.renameTo(file)) {
                this.f5756a = file;
                try {
                    this.f5758c = new RandomAccessFile(this.f5756a, "r");
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error opening ");
                    sb.append(this.f5756a);
                    sb.append(" as disc cache");
                    throw new C1781l(sb.toString(), e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Error renaming file ");
                sb2.append(this.f5756a);
                sb2.append(" to ");
                sb2.append(file);
                sb2.append(" for completion!");
                throw new C1781l(sb2.toString());
            }
        }
    }

    /* renamed from: d */
    public synchronized boolean mo7019d() {
        return !m8766a(this.f5756a);
    }
}
