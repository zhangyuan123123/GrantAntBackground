package com.jk.controller;

import com.jk.service.GroundService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("ground")
public class GroundServiceController {
    @Resource
    private GroundService groundService;

}
