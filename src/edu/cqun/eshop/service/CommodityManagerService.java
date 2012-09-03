package edu.cqun.eshop.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cqun.eshop.Iservice.ICommodityManagerService;
import edu.cqun.eshop.domain.Category;
import edu.cqun.eshop.domain.Commodity;
import edu.cqun.eshop.dao.*;

@Transactional
@Service("CommodityManagerService")
public class CommodityManagerService implements ICommodityManagerService {
	@Autowired
	private CommodityDAO commdityDAO;
	@Autowired
	private CategoryDAO categoryDAO;

	@Override
	public boolean addCommodity(Commodity commodity) {
		commdityDAO.save(commodity);
		return true;
	}

	@Override
	public boolean deleteCommodity(long commodityId) {
		try {
			commdityDAO.delete(commdityDAO.findById(commodityId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCommoditys(Set<Long> commodityIds) {
		
		try {
			for (Long commoithyid : commodityIds) {
				commdityDAO.delete(commdityDAO.findById(commoithyid));
			};
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyCommodity(Commodity commodity) {
		try {
			commdityDAO.attachDirty(commodity);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public long getCommodityQuantity(long commodityId) {
		try {
			long rest=commdityDAO.findById(commodityId).getRest();
			return rest;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public Set<Commodity> searchCommodity(Category category) {
		try {
			Set<Commodity> result;
			result=categoryDAO.findById(category.getCategoryId()).getCommodities();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Commodity> getCommodityOrderBysales() {
		try {
			List<Commodity> result=(List<Commodity>)commdityDAO.findAll();
			Collections.sort(result, new Comparator<Commodity>() {
				@Override
				public int compare(Commodity o1, Commodity o2) {
					return 	o1.getSales().compareTo(o2.getSales());
				}
			});
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Commodity> getRecommendCommodity() {
		try {
			List<Commodity> result;
			result=commdityDAO.findByIsRecommend(true);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Commodity> getSpecialOffercommodity() {
		try {
			List<Commodity> result;
			result=commdityDAO.findByIsSale(true);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}