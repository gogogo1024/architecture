package com.example.demo.callback;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class InstanceCallbackDigest implements Runnable {
    private String filename;
    private InstanceCallbackDigestUserInterface callback;

    public InstanceCallbackDigest(String filename, InstanceCallbackDigestUserInterface callback) {
        this.filename = filename;
        this.callback = callback;
    }

    /**
     *
     */
    @Override
    public void run() {
        try {
            FileInputStream fileInputStream = new FileInputStream(filename);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, messageDigest);
            while (digestInputStream.read() != -1) ;
            digestInputStream.close();
            byte[] digest = messageDigest.digest();
            callback.receiveDigest(digest);
        } catch (FileNotFoundException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
