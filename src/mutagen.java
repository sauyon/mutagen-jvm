package com.sauyon.mutagen;

import java.nio.file;
import java.nio.file.Files;
import java.util.ArrayList;
import com.sauyon.mutagen.Util;

public class File {
	public File(String filename) {
		File(Paths.get(filename));
	}

	public File(file.Path path) {
		File(path, ArrayList());
	}

	public File(file.File file) {
		File(file.toPath(), ArrayList());
	}

	public File(file.Path path, Vector<FileType> options) {
		ByteBuffer header = new ByteBuffer();
		//BufferedReader reader = Files.newBufferedReader(path, 
	}
}
