package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class DependencyCycleException extends DependencyException {
    private final List<C4900a<?>> zza;

    public DependencyCycleException(List<C4900a<?>> list) {
        StringBuilder sb = new StringBuilder("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.zza = list;
    }

    public List<C4900a<?>> getComponentsInCycle() {
        return this.zza;
    }
}
