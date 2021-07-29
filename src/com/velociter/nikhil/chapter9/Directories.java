package com.velociter.nikhil.chapter9;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Date;

class FileListFilter implements FilenameFilter {
	private String name;
	private String extension;

//cunstructor created
	public FileListFilter(String name, String extension) {
		this.name = name;
		this.extension = extension;
	}

	public boolean accept(File directory, String filename) {
		boolean fileOK = true;

		if (name != null) {
			fileOK &= filename.startsWith(name);
		}

		if (extension != null) {
			fileOK &= filename.endsWith('.' + extension);
		}
		return fileOK;
	}
}

public class Exercise3 {
	public static void main(String args[]) {
//the listroots does represent a directory 
		File[] roots = File.listRoots();
		for (File root : roots) {
			System.out.println(root);
			// Create an object that is a directory
			File myDirectory = new File("C:/jdk1.5.0/src/java");

			FilenameFilter filenameFilter = new FileListFilter("F", "java");

			File[] contents = myDirectory.listFiles(filenameFilter);
//printing a directory 
			if (contents != null) {
				System.out.println("\nThe " + contents.length + " matching items in the directory, "
						+ myDirectory.getName() + ", are:");
				for (File file : contents) { // iterate the content of file
					System.out.println(file + " is a " + (file.isDirectory() ? "directory" : "file")
							+ " last modified on\n" + new Date(file.lastModified()));
				}
			} else {
				// getName return the name of the directory
				System.out.println(myDirectory.getName() + " is not a directory");
			}
			return;
		}
	}
}
