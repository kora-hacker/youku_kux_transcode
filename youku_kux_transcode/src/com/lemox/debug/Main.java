package com.lemox.debug;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lemox.util.TranscodeThread;

public class Main
{
	public static final String src_path = "D:\\Youku Files\\download\\done\\";
	
	
	
	public static boolean is_kux_file(String str)
	{
		if (       str.charAt(str.length() - 4) == '.'
				&& str.charAt(str.length() - 3) == 'k'
				&& str.charAt(str.length() - 2) == 'u'
				&& str.charAt(str.length() - 1) == 'x')
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		ExecutorService thread_pool = Executors.newFixedThreadPool(1);
		for (int i = 0; i < 10; i++)
		{
			thread_pool.execute(new TranscodeThread());
		}
		thread_pool.shutdown();
	}

}
