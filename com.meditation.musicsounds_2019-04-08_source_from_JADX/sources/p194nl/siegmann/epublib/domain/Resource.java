package p194nl.siegmann.epublib.domain;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.slf4j.C6876b;
import org.slf4j.C6877c;
import p194nl.siegmann.epublib.p196b.C6721a;
import p194nl.siegmann.epublib.util.C6723a;
import p194nl.siegmann.epublib.util.C6725c;
import p194nl.siegmann.epublib.util.commons.p197io.C6728c;

/* renamed from: nl.siegmann.epublib.domain.Resource */
public class Resource implements Serializable {

    /* renamed from: a */
    private static final C6876b f23605a = C6877c.m32901a(Resource.class);
    private static final long serialVersionUID = 1043946707835004037L;
    private long cachedSize;
    private byte[] data;
    private String fileName;
    private String href;

    /* renamed from: id */
    private String f23606id;
    private String inputEncoding;
    private MediaType mediaType;
    private String title;

    public Resource(InputStream inputStream, String str) {
        this(null, C6723a.m32412a(inputStream), str, C6721a.m32389a(str));
    }

    public Resource(Reader reader, String str) {
        this(null, C6723a.m32413a(reader, "UTF-8"), str, C6721a.m32389a(str), "UTF-8");
    }

    public Resource(String str) {
        this(null, new byte[0], str, C6721a.m32389a(str));
    }

    public Resource(String str, long j, String str2) {
        this(null, null, str2, C6721a.m32389a(str2));
        this.fileName = str;
        this.cachedSize = j;
    }

    public Resource(String str, byte[] bArr, String str2, MediaType mediaType2) {
        this(str, bArr, str2, mediaType2, "UTF-8");
    }

    public Resource(String str, byte[] bArr, String str2, MediaType mediaType2, String str3) {
        this.inputEncoding = "UTF-8";
        this.f23606id = str;
        this.href = str2;
        this.mediaType = mediaType2;
        this.inputEncoding = str3;
        this.data = bArr;
    }

    public Resource(byte[] bArr, String str) {
        this(null, bArr, str, C6721a.m32389a(str), "UTF-8");
    }

    public Resource(byte[] bArr, MediaType mediaType2) {
        this(null, bArr, null, mediaType2);
    }

    public void close() {
        if (this.fileName != null) {
            this.data = null;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Resource)) {
            return false;
        }
        return this.href.equals(((Resource) obj).getHref());
    }

    public byte[] getData() {
        if (this.data == null) {
            C6876b bVar = f23605a;
            StringBuilder sb = new StringBuilder();
            sb.append("Initializing lazy resource ");
            sb.append(this.fileName);
            sb.append("#");
            sb.append(this.href);
            bVar.info(sb.toString());
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(this.fileName));
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                } else if (!nextEntry.isDirectory() && nextEntry.getName().endsWith(this.href)) {
                    this.data = C6723a.m32412a(zipInputStream);
                }
            }
            zipInputStream.close();
        }
        return this.data;
    }

    public String getHref() {
        return this.href;
    }

    public String getId() {
        return this.f23606id;
    }

    public String getInputEncoding() {
        return this.inputEncoding;
    }

    public InputStream getInputStream() {
        return new ByteArrayInputStream(getData());
    }

    public MediaType getMediaType() {
        return this.mediaType;
    }

    public Reader getReader() {
        return new C6728c(new ByteArrayInputStream(getData()), this.inputEncoding);
    }

    public long getSize() {
        return this.data != null ? (long) this.data.length : this.cachedSize;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.href.hashCode();
    }

    public boolean isInitialized() {
        return this.data != null;
    }

    public void setData(byte[] bArr) {
        this.data = bArr;
    }

    public void setHref(String str) {
        this.href = str;
    }

    public void setId(String str) {
        this.f23606id = str;
    }

    public void setInputEncoding(String str) {
        this.inputEncoding = str;
    }

    public void setMediaType(MediaType mediaType2) {
        this.mediaType = mediaType2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        Object[] objArr = new Object[12];
        int i = 0;
        objArr[0] = "id";
        objArr[1] = this.f23606id;
        objArr[2] = "title";
        objArr[3] = this.title;
        objArr[4] = "encoding";
        objArr[5] = this.inputEncoding;
        objArr[6] = "mediaType";
        objArr[7] = this.mediaType;
        objArr[8] = "href";
        objArr[9] = this.href;
        objArr[10] = "size";
        if (this.data != null) {
            i = this.data.length;
        }
        objArr[11] = Integer.valueOf(i);
        return C6725c.m32420a(objArr);
    }
}
