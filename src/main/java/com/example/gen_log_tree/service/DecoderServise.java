package com.example.gen_log_tree.service;

import java.io.UnsupportedEncodingException;

public interface DecoderServise {
    String encoder(String text);
    String decoder(String text) throws UnsupportedEncodingException;
}
