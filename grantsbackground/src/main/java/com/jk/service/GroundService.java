package com.jk.service;

import com.jk.model.Area;
import com.jk.model.ComAndUser;
import com.jk.utils.MenuTree;

import java.util.HashMap;
import java.util.List;

public interface GroundService {

    List<MenuTree> tree();

    HashMap<String,Object> zysreferdata(ComAndUser comAndUser,Integer page,Integer limit);

    List<Area> getprovince();

    List<Area> zysgetcity(Integer id);

    List<Area> zysgetcounty(Integer id);

    HashMap<String,Object> referdetailed(Integer id);

    void updatedetailed(Integer id);

    void zysaddliyou(Integer gid, String liyou);

    void updatestatus(Integer id);
}
