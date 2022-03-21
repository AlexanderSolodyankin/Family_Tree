package com.example.gen_log_tree.service.impl;

import com.example.gen_log_tree.service.DecoderServise;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class DecoderServiceImpl implements DecoderServise {

// преоброзование хешкода в чстроку
//    String str = String.valueOf((char) 1087);
//    //		String winString = new String(str.getBytes("windows-1252"), "windows-1251");
//    String winString = new String(str.getBytes("UTF-16"), "UTF-16");
//		System.out.println(winString);

    @Override
    public String encoder(String text) {
        String[] simbol = new String[10];
        simbol[0] = "a";
        simbol[1] = "A";
        simbol[2] = "b";
        simbol[3] = "c";
        simbol[4] = "D";
        simbol[5] = "e";
        simbol[6] = "Y";
        simbol[7] = "P";
        simbol[8] = "p";
        simbol[9] = "o";

        String encoder = "";
        for (int i = 0; i < text.length(); i++) {
            int hashCount = text.charAt(i);
            while (hashCount > 0) {

                encoder = encoder + simbol[hashCount % 10];
                hashCount = hashCount / 10;
            }
            encoder = encoder + "@";
        }
        return encoder;
    }

    @Override
    public String decoder(String text) throws UnsupportedEncodingException {

        char[] simbol = new char[10];
        simbol[0] = 'a';
        simbol[1] = 'A';
        simbol[2] = 'b';
        simbol[3] = 'c';
        simbol[4] = 'D';
        simbol[5] = 'e';
        simbol[6] = 'Y';
        simbol[7] = 'P';
        simbol[8] = 'p';
        simbol[9] = 'o';

        String decoder = "";
        int hashCodSymbole = 0;
        int registr = 1;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '@'){
                String str = String.valueOf((char) hashCodSymbole);
                decoder = decoder + new String(str.getBytes("UTF-16"), "UTF-16");
                registr = 1;
                hashCodSymbole = 0;

            }else {
                for (int j = 0; j < simbol.length; j++) {
                    if (text.charAt(i) == simbol[j]) {
                        hashCodSymbole = hashCodSymbole + (j * registr);
                    }
                }
                registr = registr * 10;
            }

        }
        return decoder;
    }
}
