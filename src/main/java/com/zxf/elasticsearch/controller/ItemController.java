package com.zxf.elasticsearch.controller;
import java.util.List;
import java.util.Map;
import com.zxf.elasticsearch.common.entity.Result;
import com.zxf.elasticsearch.pojo.Item;
import com.zxf.elasticsearch.pojo.TbItem;
import com.zxf.elasticsearch.service.ItemSearchService;
import com.zxf.elasticsearch.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 控制器层
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/item")
public class ItemController {

	@Autowired
	private ItemService itemService;

	@Autowired
	private ItemSearchService itemSearchService;

	@RequestMapping("/findAllItem")
	public Result findAllItem(){
		List<TbItem> allItem = itemService.findAllItem();

		return new Result(true,200,"查询成功",allItem);
	}

	@RequestMapping("/findIdAndTitle")
	public Result findIdAndTitle(){
		List<Map> idAndTitle = itemService.findIdAndTitle();

		return new Result(true,200,"查询成功",idAndTitle);
	}

	@RequestMapping("insertSearch")
	public Result insertSearch(){
		itemSearchService.importAllItem();
		return new Result(true,200,"插入成功");
	}
}
