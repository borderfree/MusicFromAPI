package org.jsoup.parser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.helper.C6758a;
import org.jsoup.helper.C6759b;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.C6763c;
import org.jsoup.nodes.C6764d;
import org.jsoup.nodes.C6766f;
import org.jsoup.nodes.C6767g;
import org.jsoup.nodes.C6769h;
import org.jsoup.nodes.Document;

/* renamed from: org.jsoup.parser.f */
class C6874f {

    /* renamed from: c */
    static final /* synthetic */ boolean f23805c = (!C6874f.class.desiredAssertionStatus());

    /* renamed from: a */
    C6869a f23806a;

    /* renamed from: b */
    C6873e f23807b;

    /* renamed from: d */
    private TreeBuilderState f23808d;

    /* renamed from: e */
    private TreeBuilderState f23809e;

    /* renamed from: f */
    private Document f23810f;

    /* renamed from: g */
    private DescendableLinkedList<C6766f> f23811g;

    /* renamed from: h */
    private String f23812h;

    /* renamed from: i */
    private Token f23813i;

    /* renamed from: j */
    private C6766f f23814j;

    /* renamed from: k */
    private C6766f f23815k;

    /* renamed from: l */
    private C6766f f23816l;

    /* renamed from: m */
    private DescendableLinkedList<C6766f> f23817m = new DescendableLinkedList<>();

    /* renamed from: n */
    private List<C6771a> f23818n = new ArrayList();

    /* renamed from: o */
    private boolean f23819o = true;

    /* renamed from: p */
    private boolean f23820p = false;

    /* renamed from: q */
    private boolean f23821q = false;

    /* renamed from: r */
    private boolean f23822r = false;

    /* renamed from: s */
    private List<C6870b> f23823s = new ArrayList();

    C6874f() {
    }

    /* renamed from: a */
    private void m32826a(LinkedList<C6766f> linkedList, C6766f fVar, C6766f fVar2) {
        int lastIndexOf = linkedList.lastIndexOf(fVar);
        C6759b.m32604a(lastIndexOf != -1);
        linkedList.remove(lastIndexOf);
        linkedList.add(lastIndexOf, fVar2);
    }

    /* renamed from: a */
    private boolean m32827a(String str, String[] strArr, String[] strArr2) {
        return m32829a(new String[]{str}, strArr, strArr2);
    }

    /* renamed from: a */
    private boolean m32828a(DescendableLinkedList<C6766f> descendableLinkedList, C6766f fVar) {
        Iterator descendingIterator = descendableLinkedList.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (((C6766f) descendingIterator.next()) == fVar) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m32829a(String[] strArr, String[] strArr2, String[] strArr3) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            String a = ((C6766f) descendingIterator.next()).mo21224a();
            if (C6758a.m32600a(a, strArr)) {
                return true;
            }
            if (C6758a.m32600a(a, strArr2)) {
                return false;
            }
            if (strArr3 != null && C6758a.m32600a(a, strArr3)) {
                return false;
            }
        }
        C6759b.m32608b("Should not be reachable");
        return false;
    }

    /* renamed from: b */
    private void m32830b(String str, String str2) {
        this.f23810f = new Document(str2);
        this.f23806a = new C6869a(str);
        this.f23807b = new C6873e(this.f23806a);
        this.f23811g = new DescendableLinkedList<>();
        this.f23812h = str2;
    }

    /* renamed from: b */
    private void m32831b(C6767g gVar) {
        if (this.f23811g.size() == 0) {
            this.f23810f.mo21276a(gVar);
        } else if (mo21455p()) {
            mo21405a(gVar);
        } else {
            mo21429e().mo21276a(gVar);
        }
    }

    /* renamed from: c */
    private void m32832c(String... strArr) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            C6766f fVar = (C6766f) descendingIterator.next();
            if (!C6758a.m32600a(fVar.mo21224a(), strArr) && !fVar.mo21224a().equals("html")) {
                descendingIterator.remove();
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private boolean m32833d(C6766f fVar, C6766f fVar2) {
        return fVar.mo21224a().equals(fVar2.mo21224a()) && fVar.mo21303p().equals(fVar2.mo21303p());
    }

    /* renamed from: x */
    private void m32834x() {
        Token a;
        do {
            a = this.f23807b.mo21382a();
            mo21412a(a);
        } while (a.f23750a != TokenType.EOF);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Document mo21399a(String str, String str2) {
        this.f23808d = TreeBuilderState.Initial;
        m32830b(str, str2);
        m32834x();
        return this.f23810f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6766f mo21400a(String str) {
        C6766f fVar = new C6766f(C6872d.m32796a(str), this.f23812h);
        mo21417b(fVar);
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6766f mo21401a(C6776f fVar) {
        if (!fVar.mo21340o() || C6872d.m32798b(fVar.mo21339n())) {
            C6766f fVar2 = new C6766f(C6872d.m32796a(fVar.mo21339n()), this.f23812h, fVar.f23760d);
            mo21417b(fVar2);
            return fVar2;
        }
        C6766f b = mo21415b(fVar);
        mo21412a((Token) new C6775e(b.mo21281h()));
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public TreeBuilderState mo21402a() {
        return this.f23808d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21403a(C6766f fVar) {
        String e = fVar.mo21300e("href");
        if (e.length() != 0) {
            this.f23812h = e;
            this.f23810f.mo21298d(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21404a(C6766f fVar, C6766f fVar2) {
        int lastIndexOf = this.f23811g.lastIndexOf(fVar);
        C6759b.m32604a(lastIndexOf != -1);
        this.f23811g.add(lastIndexOf + 1, fVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21405a(C6767g gVar) {
        C6766f fVar;
        C6766f b = mo21414b("table");
        boolean z = false;
        if (b == null) {
            fVar = (C6766f) this.f23811g.get(0);
        } else if (b.mo21289o() != null) {
            fVar = b.mo21289o();
            z = true;
        } else {
            fVar = mo21433f(b);
        }
        if (z) {
            C6759b.m32602a((Object) b);
            b.mo21279c(gVar);
            return;
        }
        fVar.mo21276a(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21406a(C6771a aVar) {
        mo21429e().mo21276a(C6758a.m32600a(mo21429e().mo21281h(), "script", "style") ? new C6764d(aVar.mo21320l(), this.f23812h) : new C6769h(aVar.mo21320l(), this.f23812h));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21407a(C6772b bVar) {
        m32831b((C6767g) new C6763c(bVar.mo21322l(), this.f23812h));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21408a(TreeBuilderState treeBuilderState) {
        this.f23808d = treeBuilderState;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21409a(boolean z) {
        this.f23819o = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo21410a(String... strArr) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (C6758a.m32600a(((C6766f) descendingIterator.next()).mo21224a(), strArr)) {
                descendingIterator.remove();
                return;
            }
            descendingIterator.remove();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21411a(String str, String[] strArr) {
        return m32827a(str, new String[]{"applet", "caption", "html", "table", "td", "th", "marquee", "object"}, strArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21412a(Token token) {
        this.f23813i = token;
        return this.f23808d.process(token, this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo21413a(Token token, TreeBuilderState treeBuilderState) {
        this.f23813i = token;
        return treeBuilderState.process(token, this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C6766f mo21414b(String str) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            C6766f fVar = (C6766f) descendingIterator.next();
            if (fVar.mo21224a().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C6766f mo21415b(C6776f fVar) {
        C6872d a = C6872d.m32796a(fVar.mo21339n());
        C6766f fVar2 = new C6766f(a, this.f23812h, fVar.f23760d);
        m32831b((C6767g) fVar2);
        if (fVar.mo21340o()) {
            this.f23807b.mo21387b();
            if (!a.mo21374d()) {
                a.mo21377f();
            }
        }
        return fVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21416b() {
        this.f23809e = this.f23808d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21417b(C6766f fVar) {
        m32831b((C6767g) fVar);
        this.f23811g.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21418b(C6766f fVar, C6766f fVar2) {
        m32826a((LinkedList<C6766f>) this.f23811g, fVar, fVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21419b(TreeBuilderState treeBuilderState) {
        if (this.f23822r) {
            this.f23823s.add(new C6870b("Unexpected token", treeBuilderState, this.f23813i, this.f23806a.mo21346a()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo21420b(boolean z) {
        this.f23820p = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo21421b(String[] strArr) {
        return m32829a(strArr, new String[]{"applet", "caption", "html", "table", "td", "th", "marquee", "object"}, (String[]) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public TreeBuilderState mo21422c() {
        return this.f23809e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo21423c(String str) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (((C6766f) descendingIterator.next()).mo21224a().equals(str)) {
                descendingIterator.remove();
                return;
            }
            descendingIterator.remove();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo21424c(C6766f fVar) {
        this.f23811g.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo21425c(C6766f fVar, C6766f fVar2) {
        m32826a((LinkedList<C6766f>) this.f23817m, fVar, fVar2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo21426d(String str) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext() && !((C6766f) descendingIterator.next()).mo21224a().equals(str)) {
            descendingIterator.remove();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo21427d() {
        return this.f23819o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo21428d(C6766f fVar) {
        return m32828a(this.f23811g, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C6766f mo21429e() {
        return (C6766f) this.f23811g.getLast();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo21430e(String str) {
        return mo21411a(str, (String[]) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo21431e(C6766f fVar) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (((C6766f) descendingIterator.next()) == fVar) {
                descendingIterator.remove();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public Document mo21432f() {
        return this.f23810f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C6766f mo21433f(C6766f fVar) {
        if (f23805c || mo21428d(fVar)) {
            Iterator descendingIterator = this.f23811g.descendingIterator();
            while (descendingIterator.hasNext()) {
                if (((C6766f) descendingIterator.next()) == fVar) {
                    return (C6766f) descendingIterator.next();
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo21434f(String str) {
        return mo21411a(str, new String[]{"ol", "ul"});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public String mo21435g() {
        return this.f23812h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo21436g(C6766f fVar) {
        this.f23814j = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo21437g(String str) {
        return mo21411a(str, new String[]{"button"});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo21438h(C6766f fVar) {
        this.f23815k = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo21439h() {
        return this.f23821q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo21440h(String str) {
        return m32827a(str, new String[]{"html", "table"}, (String[]) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C6766f mo21441i() {
        if (((C6766f) this.f23811g.peekLast()).mo21224a().equals("td") && !this.f23808d.name().equals("InCell")) {
            C6759b.m32605a(true, "pop td not in cell");
        }
        if (((C6766f) this.f23811g.peekLast()).mo21224a().equals("html")) {
            C6759b.m32605a(true, "popping html!");
        }
        return (C6766f) this.f23811g.pollLast();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo21442i(String str) {
        Iterator descendingIterator = this.f23811g.descendingIterator();
        while (descendingIterator.hasNext()) {
            String a = ((C6766f) descendingIterator.next()).mo21224a();
            if (a.equals(str)) {
                return true;
            }
            if (!C6758a.m32600a(a, "optgroup", "option")) {
                return false;
            }
        }
        C6759b.m32608b("Should not be reachable");
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo21443i(C6766f fVar) {
        return C6758a.m32600a(fVar.mo21224a(), "address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "section", "select", "style", "summary", "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public DescendableLinkedList<C6766f> mo21444j() {
        return this.f23811g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo21445j(String str) {
        while (str != null && !mo21429e().mo21224a().equals(str)) {
            if (C6758a.m32600a(mo21429e().mo21224a(), "dd", "dt", "li", "option", "optgroup", "p", "rp", "rt")) {
                mo21441i();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo21446j(C6766f fVar) {
        Iterator descendingIterator = this.f23817m.descendingIterator();
        int i = 0;
        while (true) {
            if (!descendingIterator.hasNext()) {
                break;
            }
            C6766f fVar2 = (C6766f) descendingIterator.next();
            if (fVar2 == null) {
                break;
            }
            if (m32833d(fVar, fVar2)) {
                i++;
            }
            if (i == 3) {
                descendingIterator.remove();
                break;
            }
        }
        this.f23817m.add(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public C6766f mo21447k(String str) {
        Iterator descendingIterator = this.f23817m.descendingIterator();
        while (descendingIterator.hasNext()) {
            C6766f fVar = (C6766f) descendingIterator.next();
            if (fVar == null) {
                break;
            } else if (fVar.mo21224a().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo21448k() {
        m32832c("table");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo21449k(C6766f fVar) {
        Iterator descendingIterator = this.f23817m.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (((C6766f) descendingIterator.next()) == fVar) {
                descendingIterator.remove();
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo21450l() {
        m32832c("tbody", "tfoot", "thead");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo21451l(C6766f fVar) {
        return m32828a(this.f23817m, fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo21452m() {
        m32832c("tr");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo21453n() {
        TreeBuilderState treeBuilderState;
        Iterator descendingIterator = this.f23811g.descendingIterator();
        boolean z = false;
        while (descendingIterator.hasNext()) {
            C6766f fVar = (C6766f) descendingIterator.next();
            if (!descendingIterator.hasNext()) {
                z = true;
                fVar = this.f23816l;
            }
            String a = fVar.mo21224a();
            if ("select".equals(a)) {
                treeBuilderState = TreeBuilderState.InSelect;
            } else if ("td".equals(a) || ("td".equals(a) && !z)) {
                treeBuilderState = TreeBuilderState.InCell;
            } else if ("tr".equals(a)) {
                treeBuilderState = TreeBuilderState.InRow;
            } else if ("tbody".equals(a) || "thead".equals(a) || "tfoot".equals(a)) {
                treeBuilderState = TreeBuilderState.InTableBody;
            } else if ("caption".equals(a)) {
                treeBuilderState = TreeBuilderState.InCaption;
            } else if ("colgroup".equals(a)) {
                treeBuilderState = TreeBuilderState.InColumnGroup;
            } else if ("table".equals(a)) {
                treeBuilderState = TreeBuilderState.InTable;
            } else if ("head".equals(a) || "body".equals(a)) {
                treeBuilderState = TreeBuilderState.InBody;
            } else if ("frameset".equals(a)) {
                treeBuilderState = TreeBuilderState.InFrameset;
            } else if ("html".equals(a)) {
                treeBuilderState = TreeBuilderState.BeforeHead;
            } else if (z) {
                treeBuilderState = TreeBuilderState.InBody;
            }
            mo21408a(treeBuilderState);
            return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public C6766f mo21454o() {
        return this.f23814j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo21455p() {
        return this.f23820p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public C6766f mo21456q() {
        return this.f23815k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo21457r() {
        this.f23818n = new ArrayList();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public List<C6771a> mo21458s() {
        return this.f23818n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo21459t() {
        mo21445j((String) null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TreeBuilder{currentToken=");
        sb.append(this.f23813i);
        sb.append(", state=");
        sb.append(this.f23808d);
        sb.append(", currentElement=");
        sb.append(mo21429e());
        sb.append('}');
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    void mo21461u() {
        /*
            r7 = this;
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r0 = r7.f23817m
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0073
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r1 = r7.f23817m
            java.lang.Object r1 = r1.getLast()
            if (r1 == 0) goto L_0x0073
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r1 = r7.f23817m
            java.lang.Object r1 = r1.getLast()
            org.jsoup.nodes.f r1 = (org.jsoup.nodes.C6766f) r1
            boolean r1 = r7.mo21428d(r1)
            if (r1 == 0) goto L_0x001f
            goto L_0x0073
        L_0x001f:
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r1 = r7.f23817m
            java.lang.Object r1 = r1.getLast()
            org.jsoup.nodes.f r1 = (org.jsoup.nodes.C6766f) r1
            r2 = 1
            int r0 = r0 - r2
            r3 = r1
            r1 = r0
        L_0x002b:
            r4 = 0
            if (r1 != 0) goto L_0x002f
            goto L_0x0042
        L_0x002f:
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r3 = r7.f23817m
            int r1 = r1 + -1
            java.lang.Object r3 = r3.get(r1)
            org.jsoup.nodes.f r3 = (org.jsoup.nodes.C6766f) r3
            if (r3 == 0) goto L_0x0041
            boolean r5 = r7.mo21428d(r3)
            if (r5 == 0) goto L_0x002b
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 != 0) goto L_0x004f
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r2 = r7.f23817m
            int r1 = r1 + 1
            java.lang.Object r2 = r2.get(r1)
            org.jsoup.nodes.f r2 = (org.jsoup.nodes.C6766f) r2
            r3 = r2
        L_0x004f:
            org.jsoup.helper.C6759b.m32602a(r3)
            java.lang.String r2 = r3.mo21224a()
            org.jsoup.nodes.f r2 = r7.mo21400a(r2)
            org.jsoup.nodes.b r5 = r2.mo21303p()
            org.jsoup.nodes.b r6 = r3.mo21303p()
            r5.mo21259a(r6)
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r5 = r7.f23817m
            r5.add(r1, r2)
            org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.f> r2 = r7.f23817m
            int r5 = r1 + 1
            r2.remove(r5)
            if (r1 != r0) goto L_0x0041
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.parser.C6874f.mo21461u():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo21462v() {
        while (!this.f23817m.isEmpty()) {
            C6766f fVar = (C6766f) this.f23817m.peekLast();
            this.f23817m.removeLast();
            if (fVar == null) {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public void mo21463w() {
        this.f23817m.add(null);
    }
}
