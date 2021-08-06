package maker.impl;

import maker.Maker;

public class Toyota implements Maker {
    @Override
    public void getMaker() {
        System.out.print(getClass());
    }
}
