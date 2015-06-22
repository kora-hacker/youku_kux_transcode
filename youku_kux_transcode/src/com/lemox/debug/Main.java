package com.lemox.debug;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		System.out.println("test");
		Process p = rt.exec("ping www.baidu.com");
		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		while ((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
	}

}
