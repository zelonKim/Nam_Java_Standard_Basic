package format1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatEx1 {
	public static void main(String[] args) {
//		DecimalFormat df = new DecimalFormat("#.#E0"); // new DecimalFormat("��ȯ�� ����") 
//		String result = df.format(123456.789); // .format(��ȯ�� ��)
//		System.out.println(result); // 1.2E5
		
		

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // new SimpleDateFormat("��ȯ�� ����")  
		 // �빮�� M = Month(��)  /  �ҹ��� m = minute(��)
		String result = sdf.format(new Date()); // .format(��ȯ�� ��¥)
		System.out.println(result); // 2023-12-01
		
		
		
	}

}



























