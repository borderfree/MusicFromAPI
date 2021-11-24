package android.support.multidex;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* renamed from: android.support.multidex.c */
final class C0223c {

    /* renamed from: android.support.multidex.c$a */
    static class C0224a {

        /* renamed from: a */
        long f672a;

        /* renamed from: b */
        long f673b;

        C0224a() {
        }
    }

    /* renamed from: a */
    static long m877a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return m878a(randomAccessFile, m879a(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    /* renamed from: a */
    static long m878a(RandomAccessFile randomAccessFile, C0224a aVar) {
        CRC32 crc32 = new CRC32();
        long j = aVar.f673b;
        randomAccessFile.seek(aVar.f672a);
        int min = (int) Math.min(16384, j);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = randomAccessFile.read(bArr, 0, min);
            if (read == -1) {
                break;
            }
            crc32.update(bArr, 0, read);
            j -= (long) read;
            if (j == 0) {
                break;
            }
            min = (int) Math.min(16384, j);
        }
        return crc32.getValue();
    }

    /* renamed from: a */
    static C0224a m879a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - 65536;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C0224a aVar = new C0224a();
                    aVar.f673b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    aVar.f672a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File too short to be a zip file: ");
        sb.append(randomAccessFile.length());
        throw new ZipException(sb.toString());
    }
}
