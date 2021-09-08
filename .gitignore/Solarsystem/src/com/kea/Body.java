package com.kea;

abstract class Body {

    public abstract void rotateRate();


}

class Star extends Body {

    @Override
    public void rotateRate() {

    }
}

class Planet extends Body {

    @Override
    public void rotateRate() {

    }
}

class Moon extends Body {

    @Override
    public void rotateRate(){

    }
}

class Comet extends Body {
    
}
