package com.test.rmi.rpc;

/**
 * @author harry
 */
public class ServerDemo {
    public static void main(String[] args) {
        IGpHello iGpHello=new GpHelloImpl();
        RpcServer rpcServer=new RpcServer();
        rpcServer.publisher(iGpHello,8888);
    }
}
