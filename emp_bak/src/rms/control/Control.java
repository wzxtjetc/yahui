package rms.control;



import jiekou.jiekou;

import rms.dao.view.View;
import rms.domain.food;
import rms.domain.foodtype;
import rms.domain.work;
import rms.util.UserInput;
import rms.control.ProxyClient;

public class Control {
	//属性
	private View v;
	private UserInput ui;
	//创建套接字对象
	//private Socket client;
	//创建输入输出流
/*	private Scanner in;
	private PrintWriter out;*/
	public static final String IP="10.10.49.25";
	public static final int PORT=4869;
	private jiekou ji;
	
	//构造方法
	public Control() {
		this.v=new View();
		this.ui=new UserInput();
		//创建代理对象
				ji=ProxyClient.getClient(jiekou.class, IP, PORT);
				
			}
	public void select() {
		while(true){
			System.out.println("请选择角色：1、普通员工   2、经理");
			int select=this.ui.getInt("请选择：");
			//将指令发送给服务器端
			//this.sendInt(select);
			if(select==1){
				this.start1();
			}else if(select==2){
				this.start2();
			}else{
				System.out.println("输入有误，请重新选择！");
			}
		}
	}
	//1、自定义方法-项目流程方法
	public void start1(){
		while(true){
			//调用登录界面
			//this.v.logon1();
			//调用主界面
			this.v.welcome1();
			int select=this.ui.getInt("请选择：");
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==1){
				//点菜增删改查
				this.diancai();
			}else if(select==2){
				//结账分三个等级
				this.jiezhang();
			}else if(select==3){
				this.kaika();
			}else if(select==4){
				this.guashi();
			}else if(select==5){
				this.xiaopiao();
			}else if(select==6){
				this.chongzhi();
			}
		}
	}
	//2、自定义方法-项目流程方法
		public void start2(){
			while(true){
				//调用主界面
				this.v.welcome2();
				int select=this.ui.getInt("请选择：");
				//将指令发送给服务器端
				//this.sendInt(select);
				if(select==0){
					this.v.println("系统终止");
					System.exit(0);
				}else if(select==21){
					this.yuangong();
				}else if(select==22){
					//假条信息统计
					//this.show();
				}else if(select==23){
					//下载假条信息
					//this.download();
				}else if(select==24){
					//菜类管理
				this.addcaicai();
				}
				
			}
		}
		
		private void yuangong() {
			this.v.welcome21();
			int select=this.ui.getInt("请选择：");
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==211){
				this.addMan();
			}else if(select==212){
				this.removeMan();
			}else if(select==213){
				this.updateMan();
			}else if(select==214){
				this.selectById();
			}
	}
		private void selectById() {
			v.println(">>>员工信息查询:");
			work s = this.ji.selectByEid(this.ui.getInt("请输入eid:"));
			System.out.println("eid:" + s.getEid() + "\t" + "ejob:" + s.getEjob() + "\t" + "ename:" + s.getEname() + "\t"
					+ "epassword:" + s.getEpassword());
			
		}
		private void updateMan() {
			v.println(">>>员工信息修改:");
			String s = this.ji.updateMan(new work(this.ui.getInt("请输入修改的eid:"), this.ui.getInt("请输入修改的ejob:"),
					this.ui.getString("请输入修改的ename:"), this.ui.getString("请输入修改的epassword:")));
			System.out.println(s);
			
		}
		private void removeMan() {
			v.println(">>>员工信息删除");
			String s = this.ji.removeMan(this.ui.getInt("请输入eid:"));
			System.out.println(s);
		}
		private void addMan() {
			this.v.println(">>>员工信息添加");
			String s = this.ji.addMan(new work(this.ui.getInt("请输入eid:"),
					this.ui.getInt("请输入ejob:"), this.ui.getString("请输入ename:"),
					this.ui.getString("请输入epassword:")));
			System.out.println(s);
		}
		private void diancai(){
			this.v.welcome11();
			int select=this.ui.getInt("请选择：");
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==1){
				this.addcai();
			}else if(select==2){
	//		this.removecai();
			}else if(select==3){
	//			this.updatecai();
			}else if(select==4){
	//			this.selectcai();
			}
		}
		private void addcaicai() {
			this.v.println(">>>菜品类信息添加");
			String s = this.ji.addFoodfood(new foodtype(this.ui.getInt("请输入菜品类编号:"),
					this.ui.getString("请输人菜品类名称:")));
			System.out.println(s);
		}
		
		private void addcai() {
			this.v.println(">>>菜品信息添加");
			String s = this.ji.addFood(new food(this.ui.getInt("请输入菜单编号:"),
					this.ui.getInt("请输人菜品类编号:"), this.ui.getString("请输入菜名:"),
					this.ui.getInt("请输人菜价:"), this.ui.getInt("请输人库存:"), this.ui.getString("请输入是否是特菜:")));
			System.out.println(s);
		}
		private void jiezhang(){
			this.v.welcome12();
			
		}
		private void kaika(){
			this.v.welcome13();
			
		}
		private void guashi(){
			this.v.welcome14();
			
		}
		private void xiaopiao(){
			this.v.welcome15();
			
		}
		
		private void chongzhi(){
			this.v.welcome16();
			
		}

}





