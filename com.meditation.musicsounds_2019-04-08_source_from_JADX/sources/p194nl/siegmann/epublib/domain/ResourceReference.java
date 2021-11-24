package p194nl.siegmann.epublib.domain;

import java.io.Serializable;

/* renamed from: nl.siegmann.epublib.domain.ResourceReference */
public class ResourceReference implements Serializable {
    private static final long serialVersionUID = 2596967243557743048L;
    protected Resource resource;

    public ResourceReference(Resource resource2) {
        this.resource = resource2;
    }

    public Resource getResource() {
        return this.resource;
    }

    public String getResourceId() {
        if (this.resource != null) {
            return this.resource.getId();
        }
        return null;
    }

    public void setResource(Resource resource2) {
        this.resource = resource2;
    }
}
