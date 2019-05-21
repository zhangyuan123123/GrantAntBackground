package com.jk.controller;

import com.alibaba.fastjson.JSON;
import com.jk.model.Area;
import com.jk.model.ComAndUser;
import com.jk.service.GroundService;
import com.jk.utils.MenuTree;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("ground")
public class GroundServiceController {
    @Resource
    private GroundService groundService;

    @Resource
    private StringRedisTemplate redis;

    @RequestMapping("tree")
    @ResponseBody
    public String tree(){
        List<MenuTree> list=groundService.tree();
        Boolean tree = redis.hasKey("t_tree");
        if (tree){
            return  redis.opsForValue().get("t_tree");
        }else{
            String s = JSON.toJSONString(list);
            redis.opsForValue().set("t_tree",s);
            return s;
        }
    }

    @RequestMapping("zysreferdata")
    @ResponseBody
    public HashMap<String,Object> zysreferdata(@RequestBody ComAndUser comAndUser,Integer page,Integer limit){
        return groundService.zysreferdata(comAndUser,page,limit);
    }
    @RequestMapping("getzysprovince")
    @ResponseBody
    public List<Area> getprovince(){
        return groundService.getprovince();
    }

    @RequestMapping("zysgetcity")
    @ResponseBody
    public List<Area> zysgetcity(Integer id){
        return groundService.zysgetcity(id);
    }


    @RequestMapping("zysgetcounty")
    @ResponseBody
    public List<Area> zysgetcounty(Integer id){
        return groundService.zysgetcounty(id);
    }

    @RequestMapping("referdetailed")
    @ResponseBody
    public HashMap<String,Object> referdetailed(Integer id){
        return groundService.referdetailed(id);
    }
    @RequestMapping("updatedetailed")
    @ResponseBody
    public String updatedetailed(Integer id){
        groundService.updatedetailed(id);
        return "1";
    }

    @RequestMapping("zysaddliyou")
    @ResponseBody
    public String zysaddliyou(Integer gid,String liyou){
        groundService.zysaddliyou(gid,liyou);
        return "1";
    }
    @RequestMapping("updatestatus")
    @ResponseBody
    public String updatestatus(Integer id){
        groundService.updatestatus(id);
        return "1";
    }


}
