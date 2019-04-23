package jiekou;

import rms.domain.food;
import rms.domain.foodtype;
import rms.domain.work;

public interface jiekou {
	 //添加职工
		public String addMan(work z);
		//删除职工
		public String removeMan(int eid);
		//修改职工
		public String updateMan(work z);
		//查询员工
		public work selectByEid(int eid);
		//添加菜品
		public String addFood(food z);
		//删除菜品
		public String removeFood(int fid);
		//修改菜品
		public String updateFood(food z);
		//查询菜品
		public food selectByFid(int fid);
		//添加菜品类
		public String addFoodfood(foodtype z);
}
