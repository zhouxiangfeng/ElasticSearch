package com.zxf.elasticsearch.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Mapping;

import java.io.Serializable;

/**
 * 搜索实体类
 * @author Administrator
 *
 */
@Document(indexName = "item",type = "itemsearch")
public class Item implements Serializable {
    @Id
	private Long id;//商品id，同时也是商品编号
    @Field(index = true,store = true,analyzer = "ik",searchAnalyzer = "ik",type = FieldType.Keyword)
	private String title;//商品标题
	private String sell_point;//商品卖点
    @Field(index = true,store = true,type = FieldType.Double)
	private Double price;//商品价格，单位为：元
	private Integer stock_count;//
	private Integer num;//库存数量
	private String barcode;//商品条形码
	private String image;//商品图片
	private Long categoryId;//所属类目，叶子类目
	private String status;//商品状态，1-正常，2-下架，3-删除
	private java.util.Date create_time;//创建时间
	private java.util.Date update_time;//更新时间
	private String item_sn;//
	private Double cost_pirce;//
	private Double market_price;//
	private String is_default;//
	private Long goods_id;//
	private String seller_id;//
	private String cart_thumbnail;//
    @Field(index = true,store = true,analyzer = "ik",searchAnalyzer = "ik",type = FieldType.Keyword)
	private String category;//
    @Field(index = true,store = true,analyzer = "ik",searchAnalyzer = "ik",type = FieldType.Keyword)
	private String brand;//
	private String spec;//
    @Field(index = true,store = true,analyzer = "ik",searchAnalyzer = "ik",type = FieldType.Keyword)
	private String seller;//

	
	public Long getId() {		
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {		
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getSell_point() {		
		return sell_point;
	}
	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}

	public Double getPrice() {		
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock_count() {		
		return stock_count;
	}
	public void setStock_count(Integer stock_count) {
		this.stock_count = stock_count;
	}

	public Integer getNum() {		
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}

	public String getBarcode() {		
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImage() {		
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public Long getCategoryId() {		
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getStatus() {		
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public java.util.Date getCreate_time() {		
		return create_time;
	}
	public void setCreate_time(java.util.Date create_time) {
		this.create_time = create_time;
	}

	public java.util.Date getUpdate_time() {		
		return update_time;
	}
	public void setUpdate_time(java.util.Date update_time) {
		this.update_time = update_time;
	}

	public String getItem_sn() {		
		return item_sn;
	}
	public void setItem_sn(String item_sn) {
		this.item_sn = item_sn;
	}

	public Double getCost_pirce() {		
		return cost_pirce;
	}
	public void setCost_pirce(Double cost_pirce) {
		this.cost_pirce = cost_pirce;
	}

	public Double getMarket_price() {		
		return market_price;
	}
	public void setMarket_price(Double market_price) {
		this.market_price = market_price;
	}

	public String getIs_default() {		
		return is_default;
	}
	public void setIs_default(String is_default) {
		this.is_default = is_default;
	}

	public Long getGoods_id() {		
		return goods_id;
	}
	public void setGoods_id(Long goods_id) {
		this.goods_id = goods_id;
	}

	public String getSeller_id() {		
		return seller_id;
	}
	public void setSeller_id(String seller_id) {
		this.seller_id = seller_id;
	}

	public String getCart_thumbnail() {		
		return cart_thumbnail;
	}
	public void setCart_thumbnail(String cart_thumbnail) {
		this.cart_thumbnail = cart_thumbnail;
	}

	public String getCategory() {		
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getBrand() {		
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSpec() {		
		return spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getSeller() {		
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}


	
}
