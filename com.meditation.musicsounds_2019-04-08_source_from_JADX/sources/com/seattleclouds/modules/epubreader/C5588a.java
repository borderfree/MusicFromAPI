package com.seattleclouds.modules.epubreader;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p194nl.siegmann.epublib.domain.TableOfContents;

/* renamed from: com.seattleclouds.modules.epubreader.a */
public class C5588a {

    /* renamed from: a */
    private String f19880a;

    /* renamed from: b */
    private InputStream f19881b = null;

    public C5588a(InputStream inputStream, String str) {
        this.f19881b = inputStream;
        this.f19880a = str;
        m27749b("");
    }

    /* renamed from: a */
    private String m27748a(String str) {
        int lastIndexOf = str.lastIndexOf(TableOfContents.DEFAULT_PATH_SEPARATOR);
        return lastIndexOf > -1 ? str.substring(0, lastIndexOf) : "";
    }

    /* renamed from: b */
    private void m27749b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f19880a);
        sb.append(str);
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: a */
    public void mo18065a() {
        try {
            ZipInputStream zipInputStream = new ZipInputStream(this.f19881b);
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                } else if (nextEntry.isDirectory()) {
                    m27749b(nextEntry.getName());
                } else if (nextEntry.getName().contains("css") || nextEntry.getName().contains("js") || nextEntry.getName().contains("png") || nextEntry.getName().contains("gif") || nextEntry.getName().contains("jpg")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unzipping ");
                    sb.append(nextEntry.getName());
                    Log.v("Decompress", sb.toString());
                    m27749b(m27748a(nextEntry.getName()));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f19880a);
                    sb2.append(nextEntry.getName());
                    FileOutputStream fileOutputStream = new FileOutputStream(sb2.toString());
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = zipInputStream.read(bArr, 0, 1024);
                        if (read < 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    zipInputStream.closeEntry();
                    fileOutputStream.close();
                }
            }
        } catch (Exception e) {
            Log.e("Decompress", "unzip", e);
        }
    }
}
