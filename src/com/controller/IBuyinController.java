package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.BuyInSearch;

public interface IBuyinController {
	//采购进货记录保存
		public String save(HttpServletRequest request,HttpServletResponse response,BuyInSearch buyinsearch);
		
		//采购进货记录更新
		public String update(HttpServletRequest request,HttpServletResponse response,BuyInSearch buyinsearch);
		
		//根据产品ID删除
		public String delById(HttpServletRequest request,HttpServletResponse response,String ProductId);
		
		//根据采购ID查找
		public String findById(HttpServletRequest request,HttpServletResponse response,String BuyinId);

		//分页获取采购进货信息数据
		public void getPageBuyinList(HttpServletRequest request,HttpServletResponse response,String currentPageNo, String pageSize);
}
