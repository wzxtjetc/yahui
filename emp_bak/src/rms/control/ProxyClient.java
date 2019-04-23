package rms.control;

import java.lang.reflect.Proxy;

public class ProxyClient {
	public static <T> T getClient(Class<T> clazz,String ip,int port){
		return (T) Proxy.newProxyInstance(ProxyClient.class.getClassLoader(),new Class[]{clazz},new ClientHandler(ip,port));
	}

}
