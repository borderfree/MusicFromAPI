package p194nl.siegmann.epublib.domain;

import java.io.Serializable;

/* renamed from: nl.siegmann.epublib.domain.SpineReference */
public class SpineReference extends ResourceReference implements Serializable {
    private static final long serialVersionUID = -7921609197351510248L;
    private boolean linear;

    public SpineReference(Resource resource) {
        this(resource, true);
    }

    public SpineReference(Resource resource, boolean z) {
        super(resource);
        this.linear = true;
        this.linear = z;
    }

    public boolean isLinear() {
        return this.linear;
    }

    public void setLinear(boolean z) {
        this.linear = z;
    }
}
