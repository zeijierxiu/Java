package File.Filter;

import java.io.File;
import java.io.FileFilter;

/*
 * 创建FileFilter实现类，重写实现类，重写过滤的方法
 */
public class FileFilterImp implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// 过滤的规则：在accept方法中，判断File对象是否以.java结尾
		//是返回true，不是返回false
		
		//如果pathname是一个文件夹，返回true，继续遍历
		if(pathname.isDirectory()) {
			
			return true;
		}
		return pathname.getName().toLowerCase().endsWith(".java");
		
	}

}
