package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.domain.Author */
public class Author implements Serializable {
    private static final long serialVersionUID = 6663408501416574200L;
    private String firstname;
    private String lastname;
    private Relator relator;

    public Author(String str) {
        this("", str);
    }

    public Author(String str, String str2) {
        this.relator = Relator.AUTHOR;
        this.firstname = str;
        this.lastname = str2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        if (C6725c.m32428c(this.firstname, author.firstname) && C6725c.m32428c(this.lastname, author.lastname)) {
            z = true;
        }
        return z;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public Relator getRelator() {
        return this.relator;
    }

    public int hashCode() {
        return C6725c.m32418a(this.firstname, this.lastname);
    }

    public void setFirstname(String str) {
        this.firstname = str;
    }

    public void setLastname(String str) {
        this.lastname = str;
    }

    public void setRelator(Relator relator2) {
        this.relator = relator2;
    }

    public Relator setRole(String str) {
        Relator byCode = Relator.byCode(str);
        if (byCode == null) {
            byCode = Relator.AUTHOR;
        }
        this.relator = byCode;
        return byCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.lastname);
        sb.append(", ");
        sb.append(this.firstname);
        return sb.toString();
    }
}
