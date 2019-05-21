package com.jk.service.impl;

import com.jk.mapper.GroundServiceMapper;
import com.jk.model.Area;
import com.jk.model.ComAndUser;
import com.jk.model.SupperDataModel;
import com.jk.service.GroundService;
import com.jk.utils.MenuTree;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@Service
public class GroundServiceImpl implements GroundService {
    @Resource
    private GroundServiceMapper groundServiceMapper;

    @Override
    public List<MenuTree> tree() {
        return groundServiceMapper.tree();
    }

    @Override
    public HashMap<String, Object> zysreferdata(ComAndUser comAndUser,Integer page,Integer limit) {
        List<ComAndUser> list=groundServiceMapper.zysreferdata(comAndUser,(page-1)*limit,limit);
        Long countcom=groundServiceMapper.countcomanduser();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("data",list);
        hashMap.put("code",0);
        hashMap.put("msg","");
        hashMap.put("count",countcom);
        return hashMap;
    }

    @Override
    public List<Area> getprovince() {
        return groundServiceMapper.getprovince();
    }

    @Override
    public List<Area> zysgetcity(Integer id) {
        return groundServiceMapper.zysgetcity(id);
    }

    @Override
    public List<Area> zysgetcounty(Integer id) {
        return groundServiceMapper.zysgetcounty(id);
    }

    @Override
    public HashMap<String, Object> referdetailed(Integer id) {
        List<SupperDataModel> list=groundServiceMapper.referdetailed(id);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("data",list);
        hashMap.put("code",0);
        hashMap.put("msg","");
        return hashMap;
    }

    @Override
    public void updatedetailed(Integer id) {
        groundServiceMapper.updatedetailed(id);
    }

    @Override
    public void zysaddliyou(Integer gid, String liyou) {
        groundServiceMapper.zysaddliyou(gid,liyou);
    }

    @Override
    public void updatestatus(Integer id) {
        groundServiceMapper.updatestatus(id);
    }
}
