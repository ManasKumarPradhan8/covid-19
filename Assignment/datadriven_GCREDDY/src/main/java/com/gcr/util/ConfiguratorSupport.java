package com.gcr.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfiguratorSupport {
static Properties props=new Properties();
String strFilename;
String strValue;
public String getproperty(String strKey)
{
	File f=new File(strFilename);
	if(f.exists())
	{
		FileInputStream in=new FileInputStream(f);
	props.load(in);
	strValue=props.getProperty(strKey);
	in.close();
	}	
	else
	{
		System.out.println("FILE NOT FOUND");
	}
}
}
