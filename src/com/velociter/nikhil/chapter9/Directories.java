package com.velociter.nikhil.chapter9;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

class FileListFilter implements FilenameFilter {
	private String name;
	private String directroy;

//constructor created
	public FileListFilter(String name, String directroy) {
		this.name = name;
		this.directroy = directroy;
	}

	@Override
	public boolean accept(File dir, String filename) {
		boolean fileOk = false;
		if (name != null || directroy != null) {
			fileOk = filename.startsWith(name);
			fileOk = filename.endsWith('.' + directroy);
			return fileOk = true;
		}
		return fileOk;
	}

}

public class Directories {
	public static void main(String args[]) {
		// the list roots does represent a root directory
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println("The Root is:" + root);
			// Create an object that is a directory
			
			File myDirectory = new File("E:\\VelociterNikhilTraining\\src\\com\\velociter\\nikhil");
			FilenameFilter filenameFilter = new FileListFilter("E:/",
					"E:\\VelociterNikhilTraining\\src\\com\\velociter\\nikhil");

			File[] contents = myDirectory.listFiles(filenameFilter);
			// printing a directory
			if (contents != null) {
				System.out.println("\nThe " + contents.length + " matching items in the directory, "
						                    + myDirectory.getName() + ", are:");
				for (File file : contents) {             // iterate the content of file
					System.out.println(file + " is a " + (file.isDirectory() ? "directory" : "file")
							                + " last modified on\n" + new Date(file.lastModified()));
				}

			} else {
				// getName return the name of the directory
				System.out.println(myDirectory.getName() + " is not a directory");
			}
		}
	}
}
