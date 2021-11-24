package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: nl.siegmann.epublib.domain.TableOfContents */
public class TableOfContents implements Serializable {
    public static final String DEFAULT_PATH_SEPARATOR = "/";
    private static final long serialVersionUID = -3147391239966275152L;
    private List<TOCReference> tocReferences;

    public TableOfContents() {
        this(new ArrayList());
    }

    public TableOfContents(List<TOCReference> list) {
        this.tocReferences = list;
    }

    /* renamed from: a */
    private static int m32403a(Collection<TOCReference> collection) {
        int size = collection.size();
        for (TOCReference children : collection) {
            size += m32403a(children.getChildren());
        }
        return size;
    }

    /* renamed from: a */
    private int m32404a(List<TOCReference> list, int i) {
        int i2 = 0;
        for (TOCReference children : list) {
            int a = m32404a(children.getChildren(), 1);
            if (a > i2) {
                i2 = a;
            }
        }
        return i + i2;
    }

    /* renamed from: a */
    private String m32405a(int[] iArr, int i, int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 > 0) {
                sb.append(str2);
            }
            sb.append(iArr[i3] + 1);
        }
        if (i > 0) {
            sb.append(str2);
        }
        sb.append(i2 + 1);
        return sb.toString();
    }

    /* renamed from: a */
    private static TOCReference m32406a(String str, List<TOCReference> list) {
        for (TOCReference tOCReference : list) {
            if (str.equals(tOCReference.getTitle())) {
                return tOCReference;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m32407a(List<TOCReference> list, int[] iArr, int i, String str, String str2) {
        for (int size = list.size(); size <= iArr[i]; size++) {
            list.add(new TOCReference(m32405a(iArr, i, size, str, str2), null));
        }
    }

    /* renamed from: a */
    private static void m32408a(Set<String> set, List<Resource> list, List<TOCReference> list2) {
        for (TOCReference tOCReference : list2) {
            Resource resource = tOCReference.getResource();
            if (resource != null && !set.contains(resource.getHref())) {
                set.add(resource.getHref());
                list.add(resource);
            }
            m32408a(set, list, tOCReference.getChildren());
        }
    }

    public TOCReference addSection(Resource resource, String str) {
        return addSection(resource, str, DEFAULT_PATH_SEPARATOR);
    }

    public TOCReference addSection(Resource resource, String str, String str2) {
        return addSection(resource, str.split(str2));
    }

    public TOCReference addSection(Resource resource, int[] iArr, String str, String str2) {
        if (iArr == null || iArr.length == 0) {
            return null;
        }
        List<TOCReference> list = this.tocReferences;
        TOCReference tOCReference = null;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            TOCReference tOCReference2 = (i2 <= 0 || i2 >= list.size() + -1) ? null : (TOCReference) list.get(i2);
            if (tOCReference2 == null) {
                m32407a(list, iArr, i, str, str2);
                tOCReference = (TOCReference) list.get(i2);
            } else {
                tOCReference = tOCReference2;
            }
            list = tOCReference.getChildren();
        }
        tOCReference.setResource(resource);
        return tOCReference;
    }

    public TOCReference addSection(Resource resource, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        List<TOCReference> list = this.tocReferences;
        TOCReference tOCReference = null;
        for (String str : strArr) {
            TOCReference a = m32406a(str, list);
            if (a == null) {
                a = new TOCReference(str, null);
                list.add(a);
            }
            tOCReference = a;
            list = tOCReference.getChildren();
        }
        tOCReference.setResource(resource);
        return tOCReference;
    }

    public TOCReference addTOCReference(TOCReference tOCReference) {
        if (this.tocReferences == null) {
            this.tocReferences = new ArrayList();
        }
        this.tocReferences.add(tOCReference);
        return tOCReference;
    }

    public int calculateDepth() {
        return m32404a(this.tocReferences, 0);
    }

    public List<Resource> getAllUniqueResources() {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        m32408a(hashSet, arrayList, this.tocReferences);
        return arrayList;
    }

    public List<TOCReference> getTocReferences() {
        return this.tocReferences;
    }

    public void setTocReferences(List<TOCReference> list) {
        this.tocReferences = list;
    }

    public int size() {
        return m32403a(this.tocReferences);
    }
}
