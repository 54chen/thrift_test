package com.xiaomi.miliao.thrift.service;

import com.xiaomi.miliao.thrift.Hello;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhen
 * Date: 14-5-28
 * Time: 下午5:24
 * To change this template use File | Settings | File Templates.
 */
public class ThriftNewClient {
    public static void main(String[] args) throws Exception {
        TTransport transport = new TSocket("localhost", 8888);
        TProtocol protocol = new TBinaryProtocol(transport);
        Hello.Client client = new Hello.Client(protocol);
        transport.open();
        System.out.println("Client calls hello()");
        client.hello();
        transport.close();
    }
}
