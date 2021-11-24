package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.domain.TitledResourceReference */
public class TitledResourceReference extends ResourceReference implements Serializable {
    private static final long serialVersionUID = 3918155020095190080L;
    private String fragmentId;
    private String title;

    public TitledResourceReference(Resource resource) {
        this(resource, null);
    }

    public TitledResourceReference(Resource resource, String str) {
        this(resource, str, null);
    }

    public TitledResourceReference(Resource resource, String str, String str2) {
        super(resource);
        this.title = str;
        this.fragmentId = str2;
    }

    public String getCompleteHref() {
        if (C6725c.m32425b(this.fragmentId)) {
            return this.resource.getHref();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.resource.getHref());
        sb.append('#');
        sb.append(this.fragmentId);
        return sb.toString();
    }

    public String getFragmentId() {
        return this.fragmentId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setFragmentId(String str) {
        this.fragmentId = str;
    }

    public void setResource(Resource resource) {
        setResource(resource, null);
    }

    public void setResource(Resource resource, String str) {
        super.setResource(resource);
        this.fragmentId = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
