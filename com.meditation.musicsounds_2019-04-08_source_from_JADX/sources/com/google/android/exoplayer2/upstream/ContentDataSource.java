package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ContentDataSource implements C2809d {

    /* renamed from: a */
    private final ContentResolver f9687a;

    /* renamed from: b */
    private final C2819l<? super ContentDataSource> f9688b;

    /* renamed from: c */
    private Uri f9689c;

    /* renamed from: d */
    private AssetFileDescriptor f9690d;

    /* renamed from: e */
    private InputStream f9691e;

    /* renamed from: f */
    private long f9692f;

    /* renamed from: g */
    private boolean f9693g;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context, C2819l<? super ContentDataSource> lVar) {
        this.f9687a = context.getContentResolver();
        this.f9688b = lVar;
    }

    /* renamed from: a */
    public int mo9518a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9692f == 0) {
            return -1;
        }
        try {
            if (this.f9692f != -1) {
                i2 = (int) Math.min(this.f9692f, (long) i2);
            }
            int read = this.f9691e.read(bArr, i, i2);
            if (read != -1) {
                if (this.f9692f != -1) {
                    this.f9692f -= (long) read;
                }
                if (this.f9688b != null) {
                    this.f9688b.mo9552a(this, read);
                }
                return read;
            } else if (this.f9692f == -1) {
                return -1;
            } else {
                throw new ContentDataSourceException(new EOFException());
            }
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    /* renamed from: a */
    public long mo9519a(C2811e eVar) {
        try {
            this.f9689c = eVar.f9717a;
            this.f9690d = this.f9687a.openAssetFileDescriptor(this.f9689c, "r");
            this.f9691e = new FileInputStream(this.f9690d.getFileDescriptor());
            if (this.f9691e.skip(eVar.f9720d) >= eVar.f9720d) {
                if (eVar.f9721e != -1) {
                    this.f9692f = eVar.f9721e;
                } else {
                    this.f9692f = (long) this.f9691e.available();
                    if (this.f9692f == 0) {
                        this.f9692f = -1;
                    }
                }
                this.f9693g = true;
                if (this.f9688b != null) {
                    this.f9688b.mo9553a(this, eVar);
                }
                return this.f9692f;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    /* renamed from: a */
    public Uri mo9520a() {
        return this.f9689c;
    }

    /* renamed from: b */
    public void mo9521b() {
        this.f9689c = null;
        try {
            if (this.f9691e != null) {
                this.f9691e.close();
            }
            this.f9691e = null;
            try {
                if (this.f9690d != null) {
                    this.f9690d.close();
                }
                this.f9690d = null;
                if (this.f9693g) {
                    this.f9693g = false;
                    if (this.f9688b != null) {
                        this.f9688b.mo9551a(this);
                    }
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            } catch (Throwable th) {
                this.f9690d = null;
                if (this.f9693g) {
                    this.f9693g = false;
                    if (this.f9688b != null) {
                        this.f9688b.mo9551a(this);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        } catch (Throwable th2) {
            this.f9691e = null;
            try {
                if (this.f9690d != null) {
                    this.f9690d.close();
                }
                this.f9690d = null;
                if (this.f9693g) {
                    this.f9693g = false;
                    if (this.f9688b != null) {
                        this.f9688b.mo9551a(this);
                    }
                }
                throw th2;
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3);
            } catch (Throwable th3) {
                this.f9690d = null;
                if (this.f9693g) {
                    this.f9693g = false;
                    if (this.f9688b != null) {
                        this.f9688b.mo9551a(this);
                    }
                }
                throw th3;
            }
        }
    }
}
