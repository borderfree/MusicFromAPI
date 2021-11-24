package com.seattleclouds.modules.pollpage.Pacpie;

public enum PacpieState {
    WAIT(0),
    IS_READY_TO_DRAW(1),
    IS_DRAW(2),
    START_INC(3);
    
    public int stateCode;

    private PacpieState(int i) {
        this.stateCode = i;
    }
}
