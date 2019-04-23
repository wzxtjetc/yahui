package rms.biz.impl;

import rms.biz.foodtypeBiz;
import rms.dao.foodDao;
import rms.dao.foodtypeDao;
import rms.dao.impl.foodtypeDaoImpl;
import rms.domain.food;
import rms.domain.foodtype;

public class foodtypeBizImpl implements foodtypeBiz{
	private foodtypeDao fd;
	
	public foodtypeBizImpl() {
		super();
		this.fd=new foodtypeDaoImpl();
	}

	@Override
	public String addFood(foodtype z) {
		// 查询id是否已经存在
		foodtype c = this.fd.selectByFid(z.getFtid());
		if (c != null) {
			return "添加的菜品id已存在";
		}

		return this.fd.addFood(z) ? "添加成功!" : "添加失败!";
		
	}

}
