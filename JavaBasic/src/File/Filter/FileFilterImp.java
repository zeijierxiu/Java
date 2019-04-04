package File.Filter;

import java.io.File;
import java.io.FileFilter;

/*
 * ����FileFilterʵ���࣬��дʵ���࣬��д���˵ķ���
 */
public class FileFilterImp implements FileFilter{

	@Override
	public boolean accept(File pathname) {
		// ���˵Ĺ�����accept�����У��ж�File�����Ƿ���.java��β
		//�Ƿ���true�����Ƿ���false
		
		//���pathname��һ���ļ��У�����true����������
		if(pathname.isDirectory()) {
			
			return true;
		}
		return pathname.getName().toLowerCase().endsWith(".java");
		
	}

}
