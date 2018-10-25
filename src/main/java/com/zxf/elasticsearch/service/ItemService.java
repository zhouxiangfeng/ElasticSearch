package com.zxf.elasticsearch.service;

import com.zxf.elasticsearch.pojo.Item;
import com.zxf.elasticsearch.pojo.TbItem;

import java.util.List;
import java.util.Map;

/**
 * 服务层接口
 * 
 * @author Administrator
 *
 */

public interface ItemService {

	List<TbItem> findAllItem();

	Item findOneById(Long id);

	void saveItem(Item item);

	List<Map> findIdAndTitle();
}
