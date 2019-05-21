package com.jk.mapper;

import com.jk.model.Area;
import com.jk.model.ComAndUser;
import com.jk.model.SupperDataModel;
import com.jk.utils.MenuTree;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GroundServiceMapper {

    List<MenuTree> tree();

    List<ComAndUser> zysreferdata(@Param("comAndUser") ComAndUser comAndUser, @Param("page") Integer page,@Param("limit") Integer limit);

    @Select("select count(1) from deliverylist")
    Long countcomanduser();

    List<Area> getprovince();

    List<Area> zysgetcity(@Param("id") Integer id);

    List<Area> zysgetcounty(@Param("id") Integer id);

    List<SupperDataModel> referdetailed(@Param("id")Integer id);

    void updatedetailed(Integer id);

    void zysaddliyou(@Param("gid") Integer gid,@Param("liyou") String liyou);

    void updatestatus(Integer id);
}
