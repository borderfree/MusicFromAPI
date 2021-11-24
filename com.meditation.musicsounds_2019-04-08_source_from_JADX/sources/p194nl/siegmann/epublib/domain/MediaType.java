package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: nl.siegmann.epublib.domain.MediaType */
public class MediaType implements Serializable {
    private static final long serialVersionUID = -7256091153727506788L;
    private String defaultExtension;
    private Collection<String> extensions;
    private String name;

    public MediaType(String str, String str2) {
        this(str, str2, new String[]{str2});
    }

    public MediaType(String str, String str2, Collection<String> collection) {
        this.name = str;
        this.defaultExtension = str2;
        this.extensions = collection;
    }

    public MediaType(String str, String str2, String[] strArr) {
        this(str, str2, (Collection<String>) Arrays.asList(strArr));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaType)) {
            return false;
        }
        return this.name.equals(((MediaType) obj).getName());
    }

    public String getDefaultExtension() {
        return this.defaultExtension;
    }

    public Collection<String> getExtensions() {
        return this.extensions;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        if (this.name == null) {
            return 0;
        }
        return this.name.hashCode();
    }

    public String toString() {
        return this.name;
    }
}
