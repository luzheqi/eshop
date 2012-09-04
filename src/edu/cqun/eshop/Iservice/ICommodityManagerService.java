package edu.cqun.eshop.Iservice;

import java.util.List;
import java.util.Set;

import edu.cqun.eshop.domain.Category;
import edu.cqun.eshop.domain.Commodity;

public interface ICommodityManagerService {
	
	/**
	 * 添加商品
	 * @param commodity
	 * @return
	 */
	boolean addCommodity(Commodity commodity);
	
	/**
	 * 删除商品
	 * @param commodity
	 * @return
	 */
	boolean deleteCommodity(long commodityId);
	
	/**
	 * 批量删除商品
	 * @param commodity
	 * @return
	 */
	boolean deleteCommoditys(Set<Long> commodityIds);
	
	/**
	 * 修改商品信息
	 * @param commodity
	 * @return
	 */
	boolean modifyCommodity(Commodity commodity);
	
	/**
	 * 查看某个商品的库存
	 * @param commodityId
	 * @return 
	 */
	long getCommodityQuantity(long commodityId);
	
	/**
	 * 根据标签查看商品
	 * @param categorys
	 * @return
	 */
	Set<Commodity> searchCommodity(Category category);
	
	/**
	 * 取得按照销量排序的商品
	 * @return
	 */
	List<Commodity> getCommodityOrderBysales();
	
	/**
	 * 取得推荐的商品
	 * @return
	 */
	List<Commodity> getRecommendCommodity();
	
	/**
	 * 取得特价的商品
	 * @return
	 */
	List<Commodity>getSpecialOffercommodity();

	/*
	 * 取得所有商品
	 * @return
	 */
	List<Commodity>getAllCommodities();
}

