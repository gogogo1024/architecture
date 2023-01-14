package com.example.demo.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import static java.rmi.Naming.bind;

public class ReportGeneratorServer {
    public static void main(String[] args) {
        try {
            ReportGeneratorImpl reportGeneratorServer = new ReportGeneratorImpl();
            LocateRegistry.createRegistry(9999);
            bind("rmi://127.0.0.1:9999/PizzaCoRemoteGenerator", reportGeneratorServer);
            System.out.println(">>>>>INFO:远程生成报告服务注册绑定成功！");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (AlreadyBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
