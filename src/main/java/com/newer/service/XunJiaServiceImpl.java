package com.newer.service;

import com.newer.dao.UserMapper;
import com.newer.dao.XunJiaMapper;
import com.newer.domain.ShowUser;
import com.newer.domain.User;
import com.newer.domain.XunJia;
import com.newer.domain.xjdmxb;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("XunJiaService")
public class XunJiaServiceImpl implements XunJiaService{

    @Autowired
    private XunJiaMapper xunJiaMapper;
    @Override
    public List<XunJia> findxj() {
        return xunJiaMapper.findxj();
    }

   @Override
    public int xinzeng_1(XunJia xunJia){

        return xunJiaMapper.xinzeng_1(xunJia) ;
    }

    @Override
    public XunJia xjFindId_1(int id) {
        return xunJiaMapper.xjFindId_1(id);
    }

    @Override
    public int dei_xunjia(int id) {
        return xunJiaMapper.dei_xunjia(id);
    }

    @Override
    public List<xjdmxb> findxb(int id) {
        return xunJiaMapper.findxb(id);
    }

    @Override
    public int xinzeng_2(xjdmxb xjxb) {
        return xunJiaMapper.xinzeng_2(xjxb);
    }

    @Override
    public int xiugai_2(xjdmxb xjmx) {
        return xunJiaMapper.xiugai_2(xjmx);
    }

    @Override
    public  xjdmxb xjFindId_2(String id) {
        return xunJiaMapper.xjFindId_2(id);
    }

    @Override
    public int dei_xb(String id) {
        return xunJiaMapper.dei_xb(id);
    }

    @Override
    public int gengxin_1() {
        return xunJiaMapper.gengxin_1();
    }

    @Override
    public int gengxin_2() {
        return xunJiaMapper.gengxin_2();
    }

    @Override
    public int gengxin_3() {
        return xunJiaMapper.gengxin_3();
    }

    @Override
    public int xiugai_1(XunJia xunJia) {
        return xunJiaMapper.xiugai_1(xunJia);
    }
 /*
    @Override
    public int del_xunjia(int id) {
        return 0;
    }*/



}
