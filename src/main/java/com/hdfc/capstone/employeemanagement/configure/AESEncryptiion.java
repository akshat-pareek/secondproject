package com.hdfc.capstone.employeemanagement.configure;

import java.security.Security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.util.Base64Utils;
import org.springframework.stereotype.Component;

@Component
public class AESEncryptiion {
	
	private static final String KEY = "32313029282726252423222120191817";
    
    public static String encrypt(String date) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        Cipher cipher = Cipher.getInstance("AES");
        SecretKeySpec key = new SecretKeySpec(KEY.getBytes(), "AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(date.getBytes());
        return Base64Utils.encodeToString(encrypted);
    }
}
