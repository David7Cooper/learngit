package com.oaec.test.view;

import java.util.Scanner;

import com.oaec.test.bean.Dvd;
import com.oaec.test.service.IDvdService;
import com.oaec.test.service.imple.DvdServiceImple;

public class ViewDvd {
	private Scanner input;
	
	/**查*/
	public void queryView(){
		IDvdService dvdServiceImple = new DvdServiceImple();
		for(Dvd dvd : dvdServiceImple.queryDvd()){
			System.out.println(dvd.toString());
		}
	}
	
}
