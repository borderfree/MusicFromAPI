package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileDataSource implements C2809d {

    /* renamed from: a */
    private final C2819l<? super FileDataSource> f9694a;

    /* renamed from: b */
    private RandomAccessFile f9695b;

    /* renamed from: c */
    private Uri f9696c;

    /* renamed from: d */
    private long f9697d;

    /* renamed from: e */
    private boolean f9698e;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public FileDataSource() {
        this(null);
    }

    public FileDataSource(C2819l<? super FileDataSource> lVar) {
        this.f9694a = lVar;
    }

    /* renamed from: a */
    public int mo9518a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9697d == 0) {
            return -1;
        }
        try {
            int read = this.f9695b.read(bArr, i, (int) Math.min(this.f9697d, (long) i2));
            if (read > 0) {
                this.f9697d -= (long) read;
                if (this.f9694a != null) {
                    this.f9694a.mo9552a(this, read);
                }
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    /* renamed from: a */
    public long mo9519a(C2811e eVar) {
        try {
            this.f9696c = eVar.f9717a;
            this.f9695b = new RandomAccessFile(eVar.f9717a.getPath(), "r");
            this.f9695b.seek(eVar.f9720d);
            this.f9697d = eVar.f9721e == -1 ? this.f9695b.length() - eVar.f9720d : eVar.f9721e;
            if (this.f9697d >= 0) {
                this.f9698e = true;
                if (this.f9694a != null) {
                    this.f9694a.mo9553a(this, eVar);
                }
                return this.f9697d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    /* renamed from: a */
    public Uri mo9520a() {
        return this.f9696c;
    }

    /* renamed from: b */
    public void mo9521b() {
        this.f9696c = null;
        try {
            if (this.f9695b != null) {
                this.f9695b.close();
            }
            this.f9695b = null;
            if (this.f9698e) {
                this.f9698e = false;
                if (this.f9694a != null) {
                    this.f9694a.mo9551a(this);
                }
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.f9695b = null;
            if (this.f9698e) {
                this.f9698e = false;
                if (this.f9694a != null) {
                    this.f9694a.mo9551a(this);
                }
            }
            throw th;
        }
    }
}
