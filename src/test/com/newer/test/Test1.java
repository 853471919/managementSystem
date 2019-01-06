package com.newer.test;

import com.newer.domain.XunJia;
import com.newer.domain.xjdmxb;
import com.newer.service.XunJiaService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test1 {
    @Test
    public void test1() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        XunJiaService xunJiaService = ctx.getBean("XunJiaService", XunJiaService.class);

        List<XunJia> listxu = xunJiaService.findxj();
        System.out.println("tset->" + listxu.get(0).getGysmc());
    }

    @Test
    public void test2() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        XunJiaService xunJiaService = ctx.getBean("XunJiaService", XunJiaService.class);

        XunJia xunJia = new XunJia();
        xunJia.setGysid(102);
        xunJia.setGysmc("跑车111");
        xunJia.setId(301);
        int count = xunJiaService.xiugai_1(xunJia);
        System.out.println("tset->" + count);
    }
@Test
    public void test3(){
    ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    XunJiaService xunJiaService = ctx.getBean("XunJiaService", XunJiaService.class);
    List<xjdmxb> list= xunJiaService.findxb(100);
    System.out.println("list"+list.get(0).getCp());

}
}