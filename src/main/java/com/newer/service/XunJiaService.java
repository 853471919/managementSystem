package com.newer.service;

import com.newer.domain.ShowUser;
import com.newer.domain.User;
import com.newer.domain.XunJia;
import com.newer.domain.xjdmxb;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface XunJiaService {


    List<XunJia>findxj();

   int xinzeng_1(XunJia xunJia);

    /*更改表单-询问单*/
    int xiugai_1(XunJia xunJia);

    /*ID询问单查询的方法*/
    XunJia xjFindId_1(int id);

    /*询问单删除*/
    int dei_xunjia(int id);

    /*根据询价单ID查询询价表细表(xjdmxb)*/
    List<xjdmxb>findxb(int id);

    /*询问单细表添加*/
    int xinzeng_2(xjdmxb xjxb);
    /*更改表单-询问单细表*/
  int xiugai_2(xjdmxb xjmx);

 /*ID询问单细表查询的方法*/
 xjdmxb xjFindId_2(String id);

 /*询价单细表删除*/
 int dei_xb(String id);

 /*收到报价单*/

  int gengxin_1();
 /*报价单过期*/
  int gengxin_2();
  /*更新有效时间*/
  int gengxin_3();

}
