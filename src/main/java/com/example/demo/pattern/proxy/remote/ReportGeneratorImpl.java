package com.example.demo.pattern.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {

    public ReportGeneratorImpl() throws RemoteException {
    }

    /**
     * @return
     * @throws RemoteException
     */
    @Override
    public String generateDailyReport() throws RemoteException {
        StringBuilder sb = new StringBuilder();
        sb.append("********************Location X Daily Report********************");
        return sb.toString();
    }
//    public static void main(String[] args) {
//        try {
//            ReportGenerator reportGenerator = new ReportGeneratorImpl();
//            rebind("PizzaCoRemoteGenerator", reportGenerator);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
