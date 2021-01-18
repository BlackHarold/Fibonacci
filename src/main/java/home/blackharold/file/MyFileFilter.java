package home.blackharold.file;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	private String[] arg;

	public MyFileFilter(String... arg) {
		super();
		this.arg = arg;
	}

	private boolean check(String ext) {
		for (String stringExt : arg) {
			if (stringExt.equals(ext)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File pathname) {
		int pointerIndex = pathname.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String ext = pathname.getName().substring(pointerIndex + 1);
		return check(ext);
	}
}
