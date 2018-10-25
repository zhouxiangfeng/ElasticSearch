package com.zxf.elasticsearch.service.impl;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.zxf.elasticsearch.dao.TbItemDao;
import com.zxf.elasticsearch.pojo.Item;

import com.zxf.elasticsearch.pojo.QTbItem;
import com.zxf.elasticsearch.pojo.TbItem;
import com.zxf.elasticsearch.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemDao tbItemDao;

    //实体类管理者
    @Autowired
    private EntityManager entityManager;

    //JAP查询工厂
    private JPAQueryFactory jpaQueryFactory;

    @PostConstruct
    public void initFactory(){
        jpaQueryFactory = new JPAQueryFactory(entityManager);
        System.out.println("初始化jpa工厂成功！");
    }

    @Override
    public List<TbItem> findAllItem() {

        QTbItem qItem = QTbItem.tbItem;

        return jpaQueryFactory
                .selectFrom(qItem)
                .orderBy(qItem.id.desc())
                .fetch();

    }

    @Override
    public Item findOneById(Long id) {
        /*QItem qItem = QItem.item;
        return jpaQueryFactory
                .selectFrom(qItem)//查询源
                .where(qItem.id.eq(id))//指定查询具体id的数据
                .fetchOne();//执行查询并返回单个结果*/
        return null;
    }

    @Override
    public void saveItem(Item item) {
        item.setCreate_time(new Date());

        //itemDao.save(item);
    }

    @Override
    public List<Map> findIdAndTitle() {
        return null;
    }
}
