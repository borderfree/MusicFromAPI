package p194nl.siegmann.epublib.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p194nl.siegmann.epublib.p196b.C6721a;
import p194nl.siegmann.epublib.util.C6725c;

/* renamed from: nl.siegmann.epublib.domain.Resources */
public class Resources implements Serializable {
    private static final long serialVersionUID = 2450876953383871451L;
    private int lastId = 1;
    private Map<String, Resource> resources = new HashMap();

    /* renamed from: a */
    private String m32397a(String str, Resource resource) {
        if (!C6725c.m32421a(str) || Character.isJavaIdentifierStart(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m32399a(resource));
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private String m32398a(MediaType mediaType, int i) {
        StringBuilder sb;
        String str;
        if (C6721a.m32390a(mediaType)) {
            sb = new StringBuilder();
            str = "image_";
        } else {
            sb = new StringBuilder();
            str = "item_";
        }
        sb.append(str);
        sb.append(i);
        sb.append(mediaType.getDefaultExtension());
        return sb.toString();
    }

    /* renamed from: a */
    private String m32399a(Resource resource) {
        return C6721a.m32390a(resource.getMediaType()) ? "image_" : "item_";
    }

    /* renamed from: b */
    private String m32400b(Resource resource) {
        int i = this.lastId;
        if (i == Integer.MAX_VALUE) {
            if (this.resources.size() != Integer.MAX_VALUE) {
                i = 1;
            } else {
                throw new IllegalArgumentException("Resources contains 2147483647 elements: no new elements can be added");
            }
        }
        String a = m32399a(resource);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        while (true) {
            sb.append(i);
            String sb2 = sb.toString();
            if (containsId(sb2)) {
                sb = new StringBuilder();
                sb.append(a);
                i++;
            } else {
                this.lastId = i;
                return sb2;
            }
        }
    }

    /* renamed from: c */
    private void m32401c(Resource resource) {
        if ((!C6725c.m32421a(resource.getHref()) || this.resources.containsKey(resource.getHref())) && C6725c.m32425b(resource.getHref())) {
            if (resource.getMediaType() != null) {
                String a = m32398a(resource.getMediaType(), 1);
                int i = 1;
                while (this.resources.containsKey(a)) {
                    i++;
                    a = m32398a(resource.getMediaType(), i);
                }
                resource.setHref(a);
            } else {
                throw new IllegalArgumentException("Resource must have either a MediaType or a href");
            }
        }
    }

    public static Resource findFirstResourceByMediaType(Collection<Resource> collection, MediaType mediaType) {
        for (Resource resource : collection) {
            if (resource.getMediaType() == mediaType) {
                return resource;
            }
        }
        return null;
    }

    public Resource add(Resource resource) {
        m32401c(resource);
        fixResourceId(resource);
        this.resources.put(resource.getHref(), resource);
        return resource;
    }

    public void addAll(Collection<Resource> collection) {
        for (Resource resource : collection) {
            m32401c(resource);
            this.resources.put(resource.getHref(), resource);
        }
    }

    public boolean containsByHref(String str) {
        if (C6725c.m32425b(str)) {
            return false;
        }
        return this.resources.containsKey(C6725c.m32419a(str, '#'));
    }

    public boolean containsId(String str) {
        if (C6725c.m32425b(str)) {
            return false;
        }
        for (Resource id : this.resources.values()) {
            if (str.equals(id.getId())) {
                return true;
            }
        }
        return false;
    }

    public Resource findFirstResourceByMediaType(MediaType mediaType) {
        return findFirstResourceByMediaType(this.resources.values(), mediaType);
    }

    public void fixResourceId(Resource resource) {
        String id = resource.getId();
        if (C6725c.m32425b(resource.getId())) {
            id = C6725c.m32426c(C6725c.m32423b(resource.getHref(), '.'), '/');
        }
        String a = m32397a(id, resource);
        if (C6725c.m32425b(a) || containsId(a)) {
            a = m32400b(resource);
        }
        resource.setId(a);
    }

    public Collection<Resource> getAll() {
        return this.resources.values();
    }

    public Collection<String> getAllHrefs() {
        return this.resources.keySet();
    }

    public Resource getByHref(String str) {
        if (C6725c.m32425b(str)) {
            return null;
        }
        return (Resource) this.resources.get(C6725c.m32419a(str, '#'));
    }

    public Resource getById(String str) {
        if (C6725c.m32425b(str)) {
            return null;
        }
        for (Resource resource : this.resources.values()) {
            if (str.equals(resource.getId())) {
                return resource;
            }
        }
        return null;
    }

    public Resource getByIdOrHref(String str) {
        Resource byId = getById(str);
        return byId == null ? getByHref(str) : byId;
    }

    public Map<String, Resource> getResourceMap() {
        return this.resources;
    }

    public List<Resource> getResourcesByMediaType(MediaType mediaType) {
        ArrayList arrayList = new ArrayList();
        if (mediaType == null) {
            return arrayList;
        }
        for (Resource resource : getAll()) {
            if (resource.getMediaType() == mediaType) {
                arrayList.add(resource);
            }
        }
        return arrayList;
    }

    public List<Resource> getResourcesByMediaTypes(MediaType[] mediaTypeArr) {
        ArrayList arrayList = new ArrayList();
        if (mediaTypeArr == null) {
            return arrayList;
        }
        List asList = Arrays.asList(mediaTypeArr);
        for (Resource resource : getAll()) {
            if (asList.contains(resource.getMediaType())) {
                arrayList.add(resource);
            }
        }
        return arrayList;
    }

    public boolean isEmpty() {
        return this.resources.isEmpty();
    }

    public Resource remove(String str) {
        return (Resource) this.resources.remove(str);
    }

    public void set(Collection<Resource> collection) {
        this.resources.clear();
        addAll(collection);
    }

    public void set(Map<String, Resource> map) {
        this.resources = new HashMap(map);
    }

    public int size() {
        return this.resources.size();
    }
}
