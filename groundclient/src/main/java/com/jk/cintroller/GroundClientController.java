package com.jk.cintroller;

import com.jk.service.GroundServiceServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("ground")
public class GroundClientController {
    @Resource
    private GroundServiceServices groundServiceServices;

}
