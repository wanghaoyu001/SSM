package com.mapper;

import java.util.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.pojo.*;

@Service("BuyinMapper")
public interface BuyinMapper {
	//采购进货记录保存
	public int save(@Param("buyin")BuyIn buyin, @Param("productInfo")ProductInfo productInfo);
	//采购进货记录更新
	public int update(@Param("buyin")BuyIn buyin, @Param("productInfo")ProductInfo productInfo, @Param("BuyinProductId")String BuyinProductId);
	//根据产品ID删除
	public int delById(@Param("ProductId")String ProductId);

	//查找综合
	public List<BuyInSearch> find(Map<String,Object> param);

	// 获取采购进货信息总条数
	public int getTotalCount();
	
	 //解决模糊查询传空问题
	public List<BuyInSearch> findByproductName(String productName);
}
