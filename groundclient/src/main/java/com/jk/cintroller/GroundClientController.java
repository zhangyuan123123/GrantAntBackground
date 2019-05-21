package com.jk.cintroller;

import com.jk.model.Area;
import com.jk.model.ComAndUser;
import com.jk.service.GroundServiceServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Controller
    @RequestMapping("ground")
public class GroundClientController {
    @Resource
    private GroundServiceServices groundServiceServices;

    @RequestMapping("zystotree")
    public String zystotree(){
        return "tree";
    }
    @RequestMapping("tree")
    @ResponseBody
    public String tree(){
        return groundServiceServices.tree();
    }

    @RequestMapping("zystohomepage")
    public String zystohomepage(){
        return "zyshomepage";
    }
    @RequestMapping("zysreferdata")
    @ResponseBody
    public HashMap<String,Object> zysreferdata(ComAndUser comAndUser,Integer page,Integer limit){
        return groundServiceServices.zysreferdata(comAndUser,page,limit);
    }
    @RequestMapping("getzysprovince")
    @ResponseBody
    public List<Area> getprovince(){
        return groundServiceServices.getprovince();
    }
    @RequestMapping("zysgetcity")
    @ResponseBody
    public List<Area> zysgetcity(Integer id){
        return groundServiceServices.zysgetcity(id);
    }

    @RequestMapping("zysgetcounty")
    @ResponseBody
    public List<Area> zysgetcounty(Integer id){
        return groundServiceServices.zysgetcounty(id);
    }
    @RequestMapping("todetailed")
    public String todetailed(Integer id, Model model){
        model.addAttribute("shouid",id);
        return "shompagedetailed";
    }
    @RequestMapping("referdetailed")
    @ResponseBody
    public HashMap<String,Object> referdetailed(Integer id){
        return groundServiceServices.referdetailed(id);
    }

    @RequestMapping("torefused")
    public String torefused(Model model,Integer id){
        model.addAttribute("gid",id);
        return "torefused";
    }

    @RequestMapping("updatedetailed")
    @ResponseBody
    public String updatedetailed(Integer id){
        groundServiceServices.updatedetailed(id);
        return "1";
    }
    @RequestMapping("zysaddliyou")
    @ResponseBody
    public String zysaddliyou(Integer gid,String liyou){
        groundServiceServices.zysaddliyou(gid,liyou);
        return "1";
    }
    @RequestMapping("updatestatus")
    @ResponseBody
    public String  updatestatus(Integer id){
        groundServiceServices. updatestatus(id);
        return "1";
    }

}
