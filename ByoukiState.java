package com.company;

class ByoukiState extends DogState{
    private static ByoukiState s = new ByoukiState();
    private ByoukiState(){}

    public static DogState getInstance() {
        return s;
    }

    @Override
    public void tukareta(Dog moto) {
        moto.changeState(ByoukiState.getInstance());
    }
    @Override
    public void tabeta(Dog moto) {
        moto.changeState(FutsuuState.getInstance());
    }

    public String toString() {
        return "病気状態";
    }
}
