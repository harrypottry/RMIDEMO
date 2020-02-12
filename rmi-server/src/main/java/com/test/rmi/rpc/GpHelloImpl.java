package com.test.rmi.rpc;

/**
 * @author harry
 *
 */
public class GpHelloImpl implements IGpHello{
    @Override
    public String sayHello(String msg) {
        return "Hello , "+msg;
    }
}
