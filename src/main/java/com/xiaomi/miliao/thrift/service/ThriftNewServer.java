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
 * Time: 下午4:31
 * To change this template use File | Settings | File Templates.
 */
public class ThriftNewServer implements Hello.Iface{
    public static void main(String[] args) throws Exception {
//        TServerSocket serverTransport = new TServerSocket(8888);
//        Hello.Processor processor = new Hello.Processor(new ThriftOldServer());
//        TThreadPoolServer.Args ags = new TThreadPoolServer.Args(serverTransport).processor(processor);
//        TServer server = new TThreadPoolServer(ags);
//        System.out.println("Starting server on port 8888 ...");
//        server.serve();
    }

    @Override
    public int hello() throws TException {
        System.out.println("hi client");
        return 0;
    }
}