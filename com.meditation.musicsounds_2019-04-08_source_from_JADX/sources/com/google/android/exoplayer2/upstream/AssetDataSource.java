package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import p194nl.siegmann.epublib.domain.TableOfContents;

public final class AssetDataSource implements C2809d {

    /* renamed from: a */
    private final AssetManager f9681a;

    /* renamed from: b */
    private final C2819l<? super AssetDataSource> f9682b;

    /* renamed from: c */
    private Uri f9683c;

    /* renamed from: d */
    private InputStream f9684d;

    /* renamed from: e */
    private long f9685e;

    /* renamed from: f */
    private boolean f9686f;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context, C2819l<? super AssetDataSource> lVar) {
        this.f9681a = context.getAssets();
        this.f9682b = lVar;
    }

    /* renamed from: a */
    public int mo9518a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f9685e == 0) {
            return -1;
        }
        try {
            if (this.f9685e != -1) {
                i2 = (int) Math.min(this.f9685e, (long) i2);
            }
            int read = this.f9684d.read(bArr, i, i2);
            if (read != -1) {
                if (this.f9685e != -1) {
                    this.f9685e -= (long) read;
                }
                if (this.f9682b != null) {
                    this.f9682b.mo9552a(this, read);
                }
                return read;
            } else if (this.f9685e == -1) {
                return -1;
            } else {
                throw new AssetDataSourceException(new EOFException());
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    /* renamed from: a */
    public long mo9519a(C2811e eVar) {
        try {
            this.f9683c = eVar.f9717a;
            String path = this.f9683c.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(TableOfContents.DEFAULT_PATH_SEPARATOR)) {
                path = path.substring(1);
            }
            this.f9684d = this.f9681a.open(path, 1);
            if (this.f9684d.skip(eVar.f9720d) >= eVar.f9720d) {
                if (eVar.f9721e != -1) {
                    this.f9685e = eVar.f9721e;
                } else {
                    this.f9685e = (long) this.f9684d.available();
                    if (this.f9685e == 2147483647L) {
                        this.f9685e = -1;
                    }
                }
                this.f9686f = true;
                if (this.f9682b != null) {
                    this.f9682b.mo9553a(this, eVar);
                }
                return this.f9685e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    /* renamed from: a */
    public Uri mo9520a() {
        return this.f9683c;
    }

    /* renamed from: b */
    public void mo9521b() {
        this.f9683c = null;
        try {
            if (this.f9684d != null) {
                this.f9684d.close();
            }
            this.f9684d = null;
            if (this.f9686f) {
                this.f9686f = false;
                if (this.f9682b != null) {
                    this.f9682b.mo9551a(this);
                }
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.f9684d = null;
            if (this.f9686f) {
                this.f9686f = false;
                if (this.f9682b != null) {
                    this.f9682b.mo9551a(this);
                }
            }
            throw th;
        }
    }
}
