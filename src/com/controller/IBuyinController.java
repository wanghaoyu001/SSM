package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.BuyInSearch;

public interface IBuyinController {
	//�ɹ�������¼����
		public String save(HttpServletRequest request,HttpServletResponse response,BuyInSearch buyinsearch);
		
		//�ɹ�������¼����
		public String update(HttpServletRequest request,HttpServletResponse response,BuyInSearch buyinsearch);
		
		//���ݲ�ƷIDɾ��
		public String delById(HttpServletRequest request,HttpServletResponse response,String ProductId);
		
		//���ݲɹ�ID����
		public String findById(HttpServletRequest request,HttpServletResponse response,String BuyinId);

		//��ҳ��ȡ�ɹ�������Ϣ����
		public void getPageBuyinList(HttpServletRequest request,HttpServletResponse response,String currentPageNo, String pageSize);
}
