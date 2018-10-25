package com.zxf.elasticsearch.service.impl;

import com.zxf.elasticsearch.common.util.IdWorker;
import com.zxf.elasticsearch.dao.ItemRepository;
import com.zxf.elasticsearch.pojo.Item;
import com.zxf.elasticsearch.pojo.TbItem;
import com.zxf.elasticsearch.service.ItemSearchService;
import com.zxf.elasticsearch.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ItemSearchServiceImpl implements ItemSearchService {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private ItemService itemService;

    @Override
    public void importAllItem() {
        Item item = new Item();
        item.setId(idWorker.nextId());
        item.setTitle("赵文欢");
        item.setBrand("小米");
        item.setCategory("手机");
        item.setCreate_time(new Date());
        item.setGoods_id(idWorker.nextId());
        item.setSeller("周湘锋");

        itemRepository.save(item);
    }

   /* @Override
    public void importAllItem() {

        *//*List<TbItem> itemList = itemService.findAllItem();
        itemRepository.save(itemList.get(0));*//*
    }*/
}
