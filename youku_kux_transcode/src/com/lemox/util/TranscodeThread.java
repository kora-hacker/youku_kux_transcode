package com.lemox.util;

public class TranscodeThread extends Thread
{
	public String src_path;
	public String des_path;
	
	public TranscodeThread(){}
	
	public void run ()
	{
		try
		{
			Runtime rt = Runtime.getRuntime();
			Process p = rt.exec("dddd");
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
