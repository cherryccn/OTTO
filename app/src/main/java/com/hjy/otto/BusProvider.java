package com.hjy.otto;

import com.squareup.otto.Bus;

/**
 * bus单例类
 */
public class BusProvider {

    private static final Bus  bus = new Bus();

    public static Bus getInstance(){
        return bus;
    }
}
