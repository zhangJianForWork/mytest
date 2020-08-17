package com.itheima.test;

import com.itheima.dao.ItemsDao;
import com.itheima.model.Items;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author：Jian Zhang
 * 日期：2020/8/16
 * 时间：20:19
 */
public class DaoTest {

    @Test
    public void findAllItems(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:mybatis-spring.xml");

        ItemsDao itemsDao = (ItemsDao) ac.getBean(ItemsDao.class);

        List<Items> allItems = itemsDao.findAllItems();

        System.out.println(allItems.toString());
    }

}
