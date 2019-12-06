package HomeWork8;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	static class MyFileFilter implements FilenameFilter {
		private String ext;

		public MyFileFilter(String ext) {
			this.ext = ext;
		}

		public boolean accept(File dir, String name) {
			int p = name.indexOf(ext);
			return ((p >= 0) && (p + ext.length() == name.length()));
		}
	}

	private static void findFiles(String srcPath, String ext, ArrayList<String> list) throws IOException {
		

		File dir = new File(srcPath);
		File[] files = dir.listFiles(new MyFileFilter(ext));
		for (int i = 0; i < files.length;i++) {
			list.add(srcPath+ files[i].getName());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		try {
			findFiles("c:\\Users\\Nikolai\\eclipse-workspace2019\\Домашние задания\\src", ".java", list);
		} catch (IOException e) {
			e.printStackTrace();
		}
			   System.out.println(list.size());
	}
}
