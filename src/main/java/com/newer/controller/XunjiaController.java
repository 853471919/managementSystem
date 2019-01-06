package com.newer.controller;

import com.newer.domain.User;
import com.newer.domain.XunJia;
import com.newer.domain.xjdmxb;
import com.newer.service.UserService;
import com.newer.service.XunJiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/XunJia")  //名称空间
public class XunjiaController {

    @Autowired
    private XunJiaService xunJiaService;
    /*查所以xjdb表*/
    @GetMapping
    public Map<String,Object> findxj(){
        List<XunJia> listxu=xunJiaService.findxj();
        Map<String,Object> results=new HashMap<>();
        results.put("data",listxu);
        System.out.println("tsetID->"+listxu.get(0).getId());
        return results;
    }
    /*添加xjdb表*/
   @RequestMapping("/addxj")
    public Map<String,Object> xinzeng_1(XunJia xunJia){

        Map<String,Object> results=new HashMap<>();
        int count=xunJiaService.xinzeng_1(xunJia);
        System.out.println("count->"+count);
        results.put("count",count);
        return results;
    }
    /*根据ID查找xjdb表*/
    @RequestMapping("/xjfindId")
    XunJia xjFindId_1(int id){
        XunJia xunJia=xunJiaService.xjFindId_1(id);
        return xunJia;
    }
    /*修改xjdb表*/
    @RequestMapping("/editxj")
     public Map<String,Object> xiugai_1(XunJia xunJia){
        Map<String,Object> results=new HashMap<>();
        int count=xunJiaService.xiugai_1(xunJia);
        System.out.println("修改->"+xunJia.getGysmc());
        results.put("count",count);
        return results;
    }
   /*删除xjdb表*/
    @RequestMapping("/delxj")
    public Map<String,Object> dei_xunjia(int id){
        int count=xunJiaService.dei_xunjia(id);
        System.out.println("删除->"+count);
        Map<String,Object> results=new HashMap<>();
        results.put("count",count);
        return results;
    }

    /*根据供应商ID查询询问的细表xjdmxb*/
    @RequestMapping("/Xjdmb")
   public Map<String,Object> findxb(int id){
        Map<String,Object> results=new HashMap<>();
        List<xjdmxb> listxu=xunJiaService.findxb(id);
        results.put("data",listxu);
        System.out.println("厂牌->"+listxu.get(0).getCp());
        return results;
    }
    /*生产流水号*/
   /* @RequestMapping("/Xjdmb_1")
    public List<xjdmxb>  findxb_1(int id) {
      List<xjdmxb> listxu = xunJiaService.findxb(id);
        System.out.println("流水号->" + listxu.get(0).getCp());
        return listxu;
    }*/
    /*询问单细表添加*/

    @RequestMapping("/addxb")
    public Map<String,Object>  xinzeng_2(xjdmxb xjxb){
        Map<String,Object> results=new HashMap<>();
        System.out.println("厂牌addxb"+xjxb.getCp());
        int count=xunJiaService.xinzeng_2(xjxb);
        results.put("count",count);
        return results;
    }
    /*修改xjdmxb表*/
    @RequestMapping("/editxb")

    public Map<String,Object> xiugai_2(xjdmxb xjmx){
        Map<String,Object> results=new HashMap<>();
        int count=xunJiaService.xiugai_2(xjmx);
        System.out.println("修改xjdmxb->"+xjmx.getId());
        results.put("count",count);
        return results;
    }

    /*根据ID查找xjdb表*/
    @RequestMapping("/xbfindId")
   public xjdmxb xjFindId_2(String id){
        xjdmxb xjb=xunJiaService.xjFindId_2(id);
        return xjb;
    }

    /*删除xjdb表*/
    @RequestMapping("/delxb")
    public Map<String,Object> dei_xb(String id){
        int count=xunJiaService.dei_xb(id);
        System.out.println("删除->"+count);
        Map<String,Object> results=new HashMap<>();
        results.put("count",count);
        return results;
    }

    /*更新状态*/
    @RequestMapping("/xbgx_1")
    public  Map<String,Object> gengxin_1(){
        int count=xunJiaService.gengxin_1();

        Map<String,Object> results=new HashMap<>();
        results.put("count",count);
        return results;
    }
   /*过期处理*/
    @RequestMapping("/xbgx_2")
    public  Map<String,Object> gengxin_2(){
        int count=xunJiaService.gengxin_2();

        Map<String,Object> results=new HashMap<>();
        results.put("count",count);
        return results;
    }
/*更新有效时间*/
    @RequestMapping("/xbgx_3")
    public  Map<String,Object> gengxin_3(){
        int count=xunJiaService.gengxin_2();
        System.out.println("报价单设置有效时间设置1分钟");
        Map<String,Object> results=new HashMap<>();
        results.put("count",count);
        return results;
    }
}
