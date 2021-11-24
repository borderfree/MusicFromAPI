package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: nl.siegmann.epublib.domain.Guide */
public class Guide implements Serializable {
    public static final String DEFAULT_COVER_TITLE = GuideReference.COVER;
    private static final long serialVersionUID = -6256645339915751189L;
    private int coverPageIndex = -1;
    private List<GuideReference> references = new ArrayList();

    /* renamed from: a */
    private void m32394a() {
        this.coverPageIndex = -2;
    }

    /* renamed from: b */
    private void m32395b() {
        if (this.coverPageIndex == -2) {
            m32396c();
        }
    }

    /* renamed from: c */
    private void m32396c() {
        int i = 0;
        while (true) {
            if (i >= this.references.size()) {
                i = -1;
                break;
            } else if (((GuideReference) this.references.get(i)).getType().equals(GuideReference.COVER)) {
                break;
            } else {
                i++;
            }
        }
        this.coverPageIndex = i;
    }

    public ResourceReference addReference(GuideReference guideReference) {
        this.references.add(guideReference);
        m32394a();
        return guideReference;
    }

    public Resource getCoverPage() {
        GuideReference coverReference = getCoverReference();
        if (coverReference == null) {
            return null;
        }
        return coverReference.getResource();
    }

    public GuideReference getCoverReference() {
        m32395b();
        if (this.coverPageIndex >= 0) {
            return (GuideReference) this.references.get(this.coverPageIndex);
        }
        return null;
    }

    public List<GuideReference> getGuideReferencesByType(String str) {
        ArrayList arrayList = new ArrayList();
        for (GuideReference guideReference : this.references) {
            if (str.equalsIgnoreCase(guideReference.getType())) {
                arrayList.add(guideReference);
            }
        }
        return arrayList;
    }

    public List<GuideReference> getReferences() {
        return this.references;
    }

    public void setCoverPage(Resource resource) {
        setCoverReference(new GuideReference(resource, GuideReference.COVER, DEFAULT_COVER_TITLE));
    }

    public int setCoverReference(GuideReference guideReference) {
        if (this.coverPageIndex >= 0) {
            this.references.set(this.coverPageIndex, guideReference);
        } else {
            this.references.add(0, guideReference);
            this.coverPageIndex = 0;
        }
        return this.coverPageIndex;
    }

    public void setReferences(List<GuideReference> list) {
        this.references = list;
        m32394a();
    }
}
