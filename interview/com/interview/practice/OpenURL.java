package com.interview.practice;

import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class OpenURL {

	public static void main(String[] args) throws Exception {
		/*try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI("http://www.google.com");
			  desktop.browse(oURL);
			} catch (Exception e) {
			  e.printStackTrace();
			}*/
		
		URL url = new URL("https://magento.com/");
		URLConnection con = url.openConnection();
		InputStream in = con.getInputStream();
		String encoding = con.getContentEncoding();  // ** WRONG: should use "con.getContentType()" instead but it returns something like "text/html; charset=UTF-8" so this value must be parsed to extract the actual encoding
		encoding = encoding == null ? "UTF-8" : encoding;
		/*String body = IOUtils.toString(in, encoding);
		System.out.println(body);*/
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		byte[] buf = new byte[8192];
		int len = 0;
		while ((len = in.read(buf)) != -1) {
		    baos.write(buf, 0, len);
		}
		String body = new String(baos.toByteArray(), encoding);
		System.out.println(body);
	}

}
