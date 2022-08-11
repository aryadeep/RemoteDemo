package day01;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URLConnection;

	public class BrokenLinkChecker{
		
	public static void LinkChecker(String url) throws Exception
	{
	int code=0;
    String str="https://www.google.com";
	URL url1=new URL(str);
	HttpURLConnection httpurl = (HttpURLConnection)url1.openConnection();
	httpurl.connect();
	code = httpurl.getResponseCode();
	if(code<400)
	{
		System.out.println("Valid link and the status code is "+code+"");
		
	}
	else
	{
		System.out.println("Broken link and the status code is "+code+"");
	}


}

}
