package com.jk.service.impl;

import com.jk.mapper.GroundServiceMapper;
import com.jk.service.GroundService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GroundServiceImpl implements GroundService {
    @Resource
    private GroundServiceMapper groundServiceMapper;

}
