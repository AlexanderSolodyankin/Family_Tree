package com.example.gen_log_tree;

import com.example.gen_log_tree.service.DecoderServise;
import com.example.gen_log_tree.service.impl.DecoderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

@SpringBootApplication
public class GenLogTreeApplication {

	public static void main(String[] args) throws UnsupportedEncodingException {
		SpringApplication.run(GenLogTreeApplication.class, args);

	}

}
