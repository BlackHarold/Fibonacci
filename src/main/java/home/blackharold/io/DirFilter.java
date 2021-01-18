package home.blackharold.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter {
	private Pattern pattern;

	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}

	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
} /*
	 * Output: DirectoryDemo.java DirList.java DirList2.java DirList3.java
	 */// :~