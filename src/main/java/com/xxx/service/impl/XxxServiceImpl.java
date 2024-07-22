package com.xxx.service.impl;

import com.xxx.service.XxxService;
import org.springframework.stereotype.Service;

@Service
public class XxxServiceImpl implements XxxService {
    @Override
    public String get() {
        return "Hello World";
    }
}
