package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: nl.siegmann.epublib.domain.Book */
public class Book implements Serializable {
    private static final long serialVersionUID = 2068355170895770100L;
    private Guide guide = new Guide();
    private Metadata metadata = new Metadata();
    private Resource ncxResource;
    private Resource opfResource;
    private Resources resources = new Resources();
    private Spine spine = new Spine();
    private TableOfContents tableOfContents = new TableOfContents();

    /* renamed from: a */
    private static void m32392a(Resource resource, Map<String, Resource> map) {
        if (resource != null && !map.containsKey(resource.getHref())) {
            map.put(resource.getHref(), resource);
        }
    }

    public Resource addResource(Resource resource) {
        return this.resources.add(resource);
    }

    public TOCReference addSection(String str, Resource resource) {
        getResources().add(resource);
        TOCReference addTOCReference = this.tableOfContents.addTOCReference(new TOCReference(str, resource));
        if (this.spine.findFirstResourceById(resource.getId()) < 0) {
            this.spine.addSpineReference(new SpineReference(resource));
        }
        return addTOCReference;
    }

    public TOCReference addSection(TOCReference tOCReference, String str, Resource resource) {
        getResources().add(resource);
        if (this.spine.findFirstResourceById(resource.getId()) < 0) {
            this.spine.addSpineReference(new SpineReference(resource));
        }
        return tOCReference.addChildSection(new TOCReference(str, resource));
    }

    public void generateSpineFromTableOfContents() {
        Spine spine2 = new Spine(this.tableOfContents);
        spine2.setTocResource(this.spine.getTocResource());
        this.spine = spine2;
    }

    public List<Resource> getContents() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m32392a(getCoverPage(), linkedHashMap);
        for (SpineReference resource : getSpine().getSpineReferences()) {
            m32392a(resource.getResource(), linkedHashMap);
        }
        for (Resource a : getTableOfContents().getAllUniqueResources()) {
            m32392a(a, linkedHashMap);
        }
        for (GuideReference resource2 : getGuide().getReferences()) {
            m32392a(resource2.getResource(), linkedHashMap);
        }
        return new ArrayList(linkedHashMap.values());
    }

    public Resource getCoverImage() {
        return this.metadata.getCoverImage();
    }

    public Resource getCoverPage() {
        Resource coverPage = this.guide.getCoverPage();
        return coverPage == null ? this.spine.getResource(0) : coverPage;
    }

    public Guide getGuide() {
        return this.guide;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public Resource getNcxResource() {
        return this.ncxResource;
    }

    public Resource getOpfResource() {
        return this.opfResource;
    }

    public Resources getResources() {
        return this.resources;
    }

    public Spine getSpine() {
        return this.spine;
    }

    public TableOfContents getTableOfContents() {
        return this.tableOfContents;
    }

    public String getTitle() {
        return getMetadata().getFirstTitle();
    }

    public void setCoverImage(Resource resource) {
        if (resource != null) {
            if (!this.resources.containsByHref(resource.getHref())) {
                this.resources.add(resource);
            }
            this.metadata.setCoverImage(resource);
        }
    }

    public void setCoverPage(Resource resource) {
        if (resource != null) {
            if (!this.resources.containsByHref(resource.getHref())) {
                this.resources.add(resource);
            }
            this.guide.setCoverPage(resource);
        }
    }

    public void setMetadata(Metadata metadata2) {
        this.metadata = metadata2;
    }

    public void setNcxResource(Resource resource) {
        this.ncxResource = resource;
    }

    public void setOpfResource(Resource resource) {
        this.opfResource = resource;
    }

    public void setResources(Resources resources2) {
        this.resources = resources2;
    }

    public void setSpine(Spine spine2) {
        this.spine = spine2;
    }

    public void setTableOfContents(TableOfContents tableOfContents2) {
        this.tableOfContents = tableOfContents2;
    }
}
