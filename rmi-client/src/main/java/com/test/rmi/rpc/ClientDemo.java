package com.test.rmi.rpc;

/**
 * @author harry
 */
public class ClientDemo {

    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy=new RpcClientProxy();

        IGpHello hello=rpcClientProxy.clientProxy
                (IGpHello.class,"localhost",8888);
        System.out.println(hello.sayHello("mic"));
    }
}
