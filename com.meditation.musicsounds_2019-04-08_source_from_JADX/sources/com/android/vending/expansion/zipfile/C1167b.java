package com.android.vending.expansion.zipfile;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.util.Collection;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.android.vending.expansion.zipfile.b */
public class C1167b {

    /* renamed from: a */
    public HashMap<File, ZipFile> f4205a = new HashMap<>();

    /* renamed from: b */
    ByteBuffer f4206b = ByteBuffer.allocate(4);

    /* renamed from: c */
    private HashMap<String, C1168a> f4207c = new HashMap<>();

    /* renamed from: com.android.vending.expansion.zipfile.b$a */
    public static final class C1168a {

        /* renamed from: a */
        public final File f4208a;

        /* renamed from: b */
        public final String f4209b;

        /* renamed from: c */
        public final String f4210c;

        /* renamed from: d */
        public long f4211d;

        /* renamed from: e */
        public int f4212e;

        /* renamed from: f */
        public long f4213f;

        /* renamed from: g */
        public long f4214g;

        /* renamed from: h */
        public long f4215h;

        /* renamed from: i */
        public long f4216i;

        /* renamed from: j */
        public long f4217j = -1;

        public C1168a(String str, File file, String str2) {
            this.f4209b = str2;
            this.f4210c = str;
            this.f4208a = file;
        }

        /* renamed from: a */
        public long mo5664a() {
            return this.f4217j;
        }

        /* renamed from: a */
        public void mo5665a(RandomAccessFile randomAccessFile, ByteBuffer byteBuffer) {
            long j = this.f4211d;
            try {
                randomAccessFile.seek(j);
                randomAccessFile.readFully(byteBuffer.array());
                if (byteBuffer.getInt(0) == 67324752) {
                    this.f4217j = j + 30 + ((long) (byteBuffer.getShort(26) & 65535)) + ((long) (byteBuffer.getShort(28) & 65535));
                    return;
                }
                Log.w("zipro", "didn't find signature at start of lfh");
                throw new IOException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }

        /* renamed from: b */
        public boolean mo5666b() {
            return this.f4212e == 0;
        }

        /* renamed from: c */
        public AssetFileDescriptor mo5667c() {
            if (this.f4212e == 0) {
                try {
                    AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.open(this.f4208a, 268435456), mo5664a(), this.f4216i);
                    return assetFileDescriptor;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        /* renamed from: d */
        public String mo5668d() {
            return this.f4210c;
        }

        /* renamed from: e */
        public File mo5669e() {
            return this.f4208a;
        }
    }

    public C1167b(String str) {
        mo5663c(str);
    }

    /* renamed from: a */
    private static int m6308a(int i) {
        return ((i & 255) << 24) + ((65280 & i) << 8) + ((16711680 & i) >>> 8) + ((i >>> 24) & 255);
    }

    /* renamed from: a */
    private static int m6309a(RandomAccessFile randomAccessFile) {
        return m6308a(randomAccessFile.readInt());
    }

    /* renamed from: a */
    public AssetFileDescriptor mo5660a(String str) {
        C1168a aVar = (C1168a) this.f4207c.get(str);
        if (aVar != null) {
            return aVar.mo5667c();
        }
        return null;
    }

    /* renamed from: a */
    public C1168a[] mo5661a() {
        Collection values = this.f4207c.values();
        return (C1168a[]) values.toArray(new C1168a[values.size()]);
    }

    /* renamed from: b */
    public InputStream mo5662b(String str) {
        C1168a aVar = (C1168a) this.f4207c.get(str);
        if (aVar != null) {
            if (aVar.mo5666b()) {
                return aVar.mo5667c().createInputStream();
            }
            ZipFile zipFile = (ZipFile) this.f4205a.get(aVar.mo5669e());
            if (zipFile == null) {
                zipFile = new ZipFile(aVar.mo5669e(), 1);
                this.f4205a.put(aVar.mo5669e(), zipFile);
            }
            ZipEntry entry = zipFile.getEntry(str);
            if (entry != null) {
                return zipFile.getInputStream(entry);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5663c(String str) {
        String str2 = str;
        File file = new File(str2);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        long length = randomAccessFile.length();
        if (length >= 22) {
            long j = 65557;
            if (65557 > length) {
                j = length;
            }
            randomAccessFile.seek(0);
            int a = m6309a(randomAccessFile);
            if (a == 101010256) {
                Log.i("zipro", "Found Zip archive, but it looks empty");
                throw new IOException();
            } else if (a == 67324752) {
                randomAccessFile.seek(length - j);
                ByteBuffer allocate = ByteBuffer.allocate((int) j);
                byte[] array = allocate.array();
                randomAccessFile.readFully(array);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                int length2 = array.length - 22;
                while (length2 >= 0 && (array[length2] != 80 || allocate.getInt(length2) != 101010256)) {
                    length2--;
                }
                if (length2 < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Zip: EOCD not found, ");
                    sb.append(str2);
                    sb.append(" is not zip");
                    Log.d("zipro", sb.toString());
                }
                short s = allocate.getShort(length2 + 8);
                long j2 = ((long) allocate.getInt(length2 + 12)) & 4294967295L;
                long j3 = ((long) allocate.getInt(length2 + 16)) & 4294967295L;
                if (j3 + j2 > length) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("bad offsets (dir ");
                    sb2.append(j3);
                    sb2.append(", size ");
                    sb2.append(j2);
                    sb2.append(", eocd ");
                    sb2.append(length2);
                    sb2.append(")");
                    Log.w("zipro", sb2.toString());
                    throw new IOException();
                } else if (s != 0) {
                    MappedByteBuffer map = randomAccessFile.getChannel().map(MapMode.READ_ONLY, j3, j2);
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    short s2 = 65535;
                    byte[] bArr = new byte[65535];
                    ByteBuffer allocate2 = ByteBuffer.allocate(30);
                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                    int i = 0;
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < s) {
                        if (map.getInt(i3) == 33639248) {
                            short s3 = map.getShort(i3 + 28) & s2;
                            short s4 = map.getShort(i3 + 30) & s2;
                            short s5 = map.getShort(i3 + 32) & s2;
                            map.position(i3 + 46);
                            map.get(bArr, i, s3);
                            map.position(i);
                            String str3 = new String(bArr, i, s3);
                            C1168a aVar = new C1168a(str2, file, str3);
                            aVar.f4212e = map.getShort(i3 + 10) & s2;
                            byte[] bArr2 = bArr;
                            aVar.f4213f = ((long) map.getInt(i3 + 12)) & 4294967295L;
                            aVar.f4214g = map.getLong(i3 + 16) & 4294967295L;
                            aVar.f4215h = map.getLong(i3 + 20) & 4294967295L;
                            aVar.f4216i = map.getLong(i3 + 24) & 4294967295L;
                            aVar.f4211d = ((long) map.getInt(i3 + 42)) & 4294967295L;
                            allocate2.clear();
                            aVar.mo5665a(randomAccessFile, allocate2);
                            this.f4207c.put(str3, aVar);
                            i3 += s3 + 46 + s4 + s5;
                            i2++;
                            bArr = bArr2;
                            s2 = 65535;
                            i = 0;
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Missed a central dir sig (at ");
                            sb3.append(i3);
                            sb3.append(")");
                            Log.w("zipro", sb3.toString());
                            throw new IOException();
                        }
                    }
                } else {
                    Log.w("zipro", "empty archive?");
                    throw new IOException();
                }
            } else {
                Log.v("zipro", "Not a Zip archive");
                throw new IOException();
            }
        } else {
            throw new IOException();
        }
    }
}
