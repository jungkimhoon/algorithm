import java.util.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws Exception{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(sdf.format(date));
		
	}
}