package maker.impl;

import maker.Maker;

public class Lexus implements Maker {
    @Override
    public void getMaker() {
        System.out.print(getClass());
    }
}
