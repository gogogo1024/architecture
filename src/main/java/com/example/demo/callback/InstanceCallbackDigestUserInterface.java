package com.example.demo.callback;

import java.util.Base64;

public class InstanceCallbackDigestUserInterface {
    private String filename;
    private byte[] digest;

    public InstanceCallbackDigestUserInterface(String filename) {
        this.filename = filename;
    }

    public void calculateDigest() {
        InstanceCallbackDigest cb = new InstanceCallbackDigest(filename, this);
        Thread t = new Thread(cb);
        t.start();
    }

    void receiveDigest(byte[] digest) {
        this.digest = digest;
        System.out.println(this);
    }

    @Override
    public String toString() {
        String result = filename + ": ";
        if (digest != null) {
            result += Base64.getEncoder().encodeToString(digest);
        } else {
            result += "digest not available";
        }
        return result;
    }

}
