package HomeWork8;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FilenameFilter;

public class DirFileCountWithPath {
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
  public static void main(String args[]) {
     List<String> fileNames = new ArrayList<>();
     try {
    	    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get("C:\\Users\\Nikolai\\eclipse-workspace2019\\Домашние задания\\src"));
    	    for (Path path : directoryStream) {
    	      fileNames.add(path.toString());
    	    }
    	  } catch (IOException ex) {
    	  }
    System.out.println("Количество файлов в каталоге:"+fileNames.size());
  }
}