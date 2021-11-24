package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.domain.Identifier */
public class Identifier implements Serializable {
    private static final long serialVersionUID = 955949951416391810L;
    private boolean bookId;
    private String scheme;
    private String value;

    public Identifier() {
        this("UUID", UUID.randomUUID().toString());
    }

    public Identifier(String str, String str2) {
        this.bookId = false;
        this.scheme = str;
        this.value = str2;
    }

    public static Identifier getBookIdIdentifier(List<Identifier> list) {
        Identifier identifier = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Identifier identifier2 = (Identifier) it.next();
            if (identifier2.isBookId()) {
                identifier = identifier2;
                break;
            }
        }
        return identifier == null ? (Identifier) list.get(0) : identifier;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Identifier)) {
            return false;
        }
        Identifier identifier = (Identifier) obj;
        if (C6725c.m32428c(this.scheme, identifier.scheme) && C6725c.m32428c(this.value, identifier.value)) {
            z = true;
        }
        return z;
    }

    public String getScheme() {
        return this.scheme;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return C6725c.m32429d(this.scheme).hashCode() ^ C6725c.m32429d(this.value).hashCode();
    }

    public boolean isBookId() {
        return this.bookId;
    }

    public void setBookId(boolean z) {
        this.bookId = z;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (C6725c.m32425b(this.scheme)) {
            sb = new StringBuilder();
            str = "";
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.scheme);
            str = ":";
        }
        sb.append(str);
        sb.append(this.value);
        return sb.toString();
    }
}
