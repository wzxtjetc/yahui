package rms.dao;

import rms.domain.foodtype;

public interface foodtypeDao {
	//添加菜品类
	public boolean addFood(foodtype z);
	//菜品编号查询的方法
		public foodtype selectByFid(int ftid);
}
