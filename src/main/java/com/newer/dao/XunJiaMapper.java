package com.newer.dao;

import com.newer.domain.ShowUser;
import com.newer.domain.User;
import com.newer.domain.XunJia;
import com.newer.domain.xjdmxb;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface XunJiaMapper {

    /*查所有*/

    List<XunJia>findxj();
   /*新增*/
    @Insert("insert into xjdb values (null,0,0,#{gysid},#{gysmc},null,null,null)")
    int xinzeng_1(XunJia xunJia);

 /*更改表单-询问单*/
    @Update("update xjdb set gysid=#{gysid},gysmc=#{gysmc} where id=#{id} ")
      int xiugai_1(XunJia xunJia);


 /*询问单Id查询*/

    @Select("select * from xjdb where id=#{id}")
    XunJia xjFindId_1(@Param("id") int id);

   /*询价单删除*/

    @Delete("delete from xjdb where id=#{id}")
    int dei_xunjia(@Param("id") int id);

    /*根据询价单ID查询询价表细表(xjdmxb)*/

    List<xjdmxb>findxb(@Param("id") int id);

    /*询问单细表添加*/
    @Insert("insert into xjdmxb values(#{id},#{xjdid},#{cp}" +
            ",#{clgg},#{clxx},#{ys},now(),null,null,null,null)")
    int xinzeng_2(xjdmxb xjxb);

    /*更改表单-询问单细表*/
    @Update("update xjdmxb set cp=#{cp},clgg=#{clgg},clxx=#{clxx}," +
            "ys=#{ys} where id=#{id} ")
    int xiugai_2(xjdmxb xjmx);


    /*询问单细表Id查询*/

    @Select("select * from xjdmxb where id=#{id}")
    xjdmxb xjFindId_2(@Param("id") String id);

    /*询价单细表删除*/
    @Delete("delete from xjdmxb where id=#{id}")
    int dei_xb(@Param("id") String id);
    /*已建报价单*/
   @Update("update xjdb x1  set x1.zt=1 where x1.id= (select xjdid from bjdb b where  b.xjdid= x1.id  and  b.bjecrq>subtime( now(),'00:00') )")
    int gengxin_1();
    /*过期处理*/
   @Update("update xjdb x1  set x1.zt=0 where x1.id=(select xjdid from bjdb b where  b.xjdid= x1.id  and  b.bjecrq<subtime( now(),'00:00') )")
    int gengxin_2();
  /*更新有效时间*/
     @Update("update bjdb b  set b.bjrq=subtime( now(),'00:00'),b.bjecrq=(DATE_ADD(now(),INTERVAL 1 MINUTE ))  where b.xjdid= ( select  id from xjdb x where  x.id=b.xjdid)and b.bjecrq<subtime( now(),'00:00')")
    int gengxin_3();




}
