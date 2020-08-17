package com.itheima.dao;

import com.itheima.model.Items;

import java.util.List;

/**
 * @author：Jian Zhang
 * 日期：2020/8/16
 * 时间：20:00
 */
public interface ItemsDao {

    List<Items> findAllItems();
}
