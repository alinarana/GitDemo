package com.assignments;

import java.awt.Desktop;
import java.net.URI;

public class OpenLinks {

	public static void main(String args[]) throws Exception
	{
		// TODO Auto-generated method stub
		
		Desktop d = Desktop.getDesktop();
		d.browse(new URI("http://gmail.com"));

	}
}
