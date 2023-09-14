package com.example.watchfiles;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class WatchFiles {


	private static String fileName = "D:\\FileWatcher_log.txt";

	public static void main(String args[]) {
		Path path = Paths.get(fileName);

		Stream<String> contents = null;
		try {
			contents = Files.lines(path);
			path = Paths.get("D:\\1.txt");
			Files.write(path, contents.toList(),StandardOpenOption.CREATE);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			contents.close();
		}

	}


}