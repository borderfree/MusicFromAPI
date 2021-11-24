package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: nl.siegmann.epublib.domain.TOCReference */
public class TOCReference extends TitledResourceReference implements Serializable {

    /* renamed from: a */
    private static final Comparator<TOCReference> f23607a = new Comparator<TOCReference>() {
        /* renamed from: a */
        public int compare(TOCReference tOCReference, TOCReference tOCReference2) {
            return String.CASE_INSENSITIVE_ORDER.compare(tOCReference.getTitle(), tOCReference2.getTitle());
        }
    };
    private static final long serialVersionUID = 5787958246077042456L;
    private List<TOCReference> children;

    public TOCReference() {
        this(null, null, null);
    }

    public TOCReference(String str, Resource resource) {
        this(str, resource, null);
    }

    public TOCReference(String str, Resource resource, String str2) {
        this(str, resource, str2, new ArrayList());
    }

    public TOCReference(String str, Resource resource, String str2, List<TOCReference> list) {
        super(resource, str, str2);
        this.children = list;
    }

    public static Comparator<TOCReference> getComparatorByTitleIgnoreCase() {
        return f23607a;
    }

    public TOCReference addChildSection(TOCReference tOCReference) {
        this.children.add(tOCReference);
        return tOCReference;
    }

    public List<TOCReference> getChildren() {
        return this.children;
    }

    public void setChildren(List<TOCReference> list) {
        this.children = list;
    }
}
