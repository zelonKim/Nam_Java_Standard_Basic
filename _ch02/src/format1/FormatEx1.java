package format1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatEx1 {
	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat("#.#E0"); // new DecimalFormat("변환할 형식") 
//		String result = df.format(123456.789); // .format(변환할 값)
//		System.out.println(result); // 1.2E5
		
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // new SimpleDateFormat("변환할 형식")  
		 // 대문자 M = Month(월)  /  소문자 m = minute(분)
		String result = sdf.format(new Date()); // .format(변환할 날짜)
		System.out.println(result); // 2023-12-01
		
		
		
	}

}



























