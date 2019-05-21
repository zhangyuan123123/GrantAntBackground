package com.jk.service;

import com.jk.model.Area;
import com.jk.model.ComAndUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient("service")
public interface GroundServiceServices {

    @RequestMapping("ground/tree")
    String tree();
    @RequestMapping("ground/zysreferdata")
    HashMap<String,Object> zysreferdata(@RequestBody ComAndUser comAndUser, @RequestParam("page") Integer page,@RequestParam("limit") Integer limit);
    @RequestMapping("ground/getzysprovince")
    List<Area> getprovince();
    @RequestMapping("ground/zysgetcity")
    List<Area> zysgetcity(@RequestParam("id") Integer id);
    @RequestMapping("ground/zysgetcounty")
    List<Area> zysgetcounty(@RequestParam("id") Integer id);
    @RequestMapping("ground/referdetailed")
    HashMap<String,Object> referdetailed(@RequestParam("id") Integer id);
    @RequestMapping("ground/updatedetailed")
    void updatedetailed(@RequestParam("id") Integer id);
    @RequestMapping("ground/zysaddliyou")
    void zysaddliyou(@RequestParam("gid") Integer gid,@RequestParam("liyou") String liyou);
    @RequestMapping("ground/updatestatus")
    void updatestatus(@RequestParam("id") Integer id);
}
