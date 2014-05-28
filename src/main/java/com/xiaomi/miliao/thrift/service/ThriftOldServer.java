package com.xiaomi.miliao.thrift.service;

import com.xiaomi.miliao.thrift.Hello;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;

/**
 * Created with IntelliJ IDEA.
 * User: chenzhen
 * Date: 14-5-28
 * Time: 下午4:30
 * To change this template use File | Settings | File Templates.
 */
public class ThriftOldServer implements Hello.Iface{
    public static void main(String[] args) throws Exception {
//        TServerSocket serverTransport = new TServerSocket(7777);
//        Hello.Processor processor = new Hello.Processor(new ThriftOldServer());
//        TBinaryProtocol.Factory protFactory = new TBinaryProtocol.Factory(true, true);
//        TServer server = new TThreadPoolServer(processor, serverTransport, protFactory);
//        System.out.println("Starting server on port 7777 ...");
//        server.serve();
     }

    @Override
    public int hello() throws TException {
        System.out.println("hi client");
        return 0;
    }
}
