package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.bf */
final class C4649bf implements Callable<List<C4735ej>> {

    /* renamed from: a */
    private final /* synthetic */ String f16787a;

    /* renamed from: b */
    private final /* synthetic */ String f16788b;

    /* renamed from: c */
    private final /* synthetic */ String f16789c;

    /* renamed from: d */
    private final /* synthetic */ C4640ax f16790d;

    C4649bf(C4640ax axVar, String str, String str2, String str3) {
        this.f16790d = axVar;
        this.f16787a = str;
        this.f16788b = str2;
        this.f16789c = str3;
    }

    public final /* synthetic */ Object call() {
        
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0006: INVOKE  (wrap: com.google.android.gms.measurement.internal.eb
              0x0002: INVOKE  (r0v1 com.google.android.gms.measurement.internal.eb) = (wrap: com.google.android.gms.measurement.internal.ax
              0x0000: IGET  (r0v0 com.google.android.gms.measurement.internal.ax) = (r4v0 'this' com.google.android.gms.measurement.internal.bf A[THIS]) com.google.android.gms.measurement.internal.bf.d com.google.android.gms.measurement.internal.ax) com.google.android.gms.measurement.internal.ax.a(com.google.android.gms.measurement.internal.ax):com.google.android.gms.measurement.internal.eb type: STATIC) com.google.android.gms.measurement.internal.eb.l():void type: VIRTUAL in method: com.google.android.gms.measurement.internal.bf.call():java.lang.Object, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
            	at jadx.core.ProcessClass.process(ProcessClass.java:36)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: INVOKE  (r0v1 com.google.android.gms.measurement.internal.eb) = (wrap: com.google.android.gms.measurement.internal.ax
              0x0000: IGET  (r0v0 com.google.android.gms.measurement.internal.ax) = (r4v0 'this' com.google.android.gms.measurement.internal.bf A[THIS]) com.google.android.gms.measurement.internal.bf.d com.google.android.gms.measurement.internal.ax) com.google.android.gms.measurement.internal.ax.a(com.google.android.gms.measurement.internal.ax):com.google.android.gms.measurement.internal.eb type: STATIC in method: com.google.android.gms.measurement.internal.bf.call():java.lang.Object, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:88)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:682)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
            	... 19 more
            Caused by: java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1714)
            	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1689)
            	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:86)
            	at jadx.core.dex.instructions.args.SSAVar.use(SSAVar.java:79)
            	at jadx.core.dex.nodes.InsnNode.attachArg(InsnNode.java:87)
            	at jadx.core.dex.nodes.InsnNode.addArg(InsnNode.java:73)
            	at jadx.core.dex.nodes.InsnNode.copyCommonParams(InsnNode.java:335)
            	at jadx.core.dex.instructions.IndexInsnNode.copy(IndexInsnNode.java:24)
            	at jadx.core.dex.instructions.IndexInsnNode.copy(IndexInsnNode.java:9)
            	at jadx.core.dex.nodes.InsnNode.copyCommonParams(InsnNode.java:333)
            	at jadx.core.dex.nodes.InsnNode.copy(InsnNode.java:350)
            	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:880)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:669)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
            	... 24 more
            */
        /*
            this = this;
            com.google.android.gms.measurement.internal.ax r0 = r4.f16790d
            com.google.android.gms.measurement.internal.eb r0 = r0.f16762a
            r0.mo15555l()
            com.google.android.gms.measurement.internal.ax r0 = r4.f16790d
            com.google.android.gms.measurement.internal.eb r0 = r0.f16762a
            com.google.android.gms.measurement.internal.ev r0 = r0.mo15546d()
            java.lang.String r1 = r4.f16787a
            java.lang.String r2 = r4.f16788b
            java.lang.String r3 = r4.f16789c
            java.util.List r0 = r0.mo15777a(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4649bf.call():java.lang.Object");
    }
}
