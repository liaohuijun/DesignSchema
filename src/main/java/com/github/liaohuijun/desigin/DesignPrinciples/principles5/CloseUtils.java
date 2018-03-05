package com.github.liaohuijun.desigin.DesignPrinciples.principles5;

import java.io.Closeable;
import java.io.IOException;

/**
 * 关闭工具类
  * (用一句话描述类的主要功能)
  * @author LIAO  
  * @date 2018年1月13日
 */
public class CloseUtils {
	
	private CloseUtils() {}
	
	//关闭closeable对象
	public static void closeQuitely(Closeable closeable) {
		if (closeable != null) {
			try {
				
				closeable.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

