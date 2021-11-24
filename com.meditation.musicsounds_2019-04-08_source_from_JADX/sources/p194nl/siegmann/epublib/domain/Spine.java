package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.domain.Spine */
public class Spine implements Serializable {
    private static final long serialVersionUID = 3878483958947357246L;
    private List<SpineReference> spineReferences;
    private Resource tocResource;

    public Spine() {
        this((List<SpineReference>) new ArrayList<SpineReference>());
    }

    public Spine(List<SpineReference> list) {
        this.spineReferences = list;
    }

    public Spine(TableOfContents tableOfContents) {
        this.spineReferences = createSpineReferences(tableOfContents.getAllUniqueResources());
    }

    public static List<SpineReference> createSpineReferences(Collection<Resource> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Resource spineReference : collection) {
            arrayList.add(new SpineReference(spineReference));
        }
        return arrayList;
    }

    public SpineReference addResource(Resource resource) {
        return addSpineReference(new SpineReference(resource));
    }

    public SpineReference addSpineReference(SpineReference spineReference) {
        if (this.spineReferences == null) {
            this.spineReferences = new ArrayList();
        }
        this.spineReferences.add(spineReference);
        return spineReference;
    }

    public int findFirstResourceById(String str) {
        if (C6725c.m32425b(str)) {
            return -1;
        }
        for (int i = 0; i < this.spineReferences.size(); i++) {
            if (str.equals(((SpineReference) this.spineReferences.get(i)).getResourceId())) {
                return i;
            }
        }
        return -1;
    }

    public Resource getResource(int i) {
        if (i < 0 || i >= this.spineReferences.size()) {
            return null;
        }
        return ((SpineReference) this.spineReferences.get(i)).getResource();
    }

    public int getResourceIndex(String str) {
        if (C6725c.m32425b(str)) {
            return -1;
        }
        int i = 0;
        while (true) {
            if (i >= this.spineReferences.size()) {
                i = -1;
                break;
            } else if (str.equals(((SpineReference) this.spineReferences.get(i)).getResource().getHref())) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    public int getResourceIndex(Resource resource) {
        if (resource == null) {
            return -1;
        }
        return getResourceIndex(resource.getHref());
    }

    public List<SpineReference> getSpineReferences() {
        return this.spineReferences;
    }

    public Resource getTocResource() {
        return this.tocResource;
    }

    public boolean isEmpty() {
        return this.spineReferences.isEmpty();
    }

    public void setSpineReferences(List<SpineReference> list) {
        this.spineReferences = list;
    }

    public void setTocResource(Resource resource) {
        this.tocResource = resource;
    }

    public int size() {
        return this.spineReferences.size();
    }
}
