package jiekoushixian;

import jiekou.jiekou;
import rms.biz.foodBiz;
import rms.biz.foodtypeBiz;
import rms.biz.workBiz;
import rms.biz.impl.foodBizImpl;
import rms.biz.impl.foodtypeBizImpl;
import rms.biz.impl.workBizImpl;
import rms.domain.food;
import rms.domain.foodtype;
import rms.domain.work;

public class jiekoushixian implements jiekou{
	private workBiz wbiz;
	private foodBiz fbiz;
	private foodtypeBiz fobiz;
	public jiekoushixian() {
		this.wbiz=new workBizImpl();
		this.fbiz=new foodBizImpl();
		this.fobiz=new foodtypeBizImpl();
	}

	@Override
	public String addMan(work z) {
		// TODO Auto-generated method stub
		return wbiz.addMan(z);
	}

	@Override
	public String removeMan(int eid) {
		// TODO Auto-generated method stub
		return wbiz.removeMan(eid);
	}

	@Override
	public String updateMan(work z) {
		// TODO Auto-generated method stub
		return wbiz.updateMan(z);
	}

	@Override
	public work selectByEid(int eid) {
		// TODO Auto-generated method stub
		return wbiz.selectByEid(eid);
	}

	@Override
	public String addFood(food z) {
		// TODO Auto-generated method stub
		return fbiz.addFood(z);
	}

	@Override
	public String removeFood(int fid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateFood(food z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public food selectByFid(int fid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addFoodfood(foodtype z) {
		// TODO Auto-generated method stub
		return fobiz.addFood(z);
	}
	
}
