package com.oaec.test.service.imple;

import java.util.List;

import com.oaec.test.bean.Dvd;
import com.oaec.test.dao.IDvdDao;
import com.oaec.test.dao.imple.DvdDaoImple;
import com.oaec.test.service.IDvdService;

public class DvdServiceImple implements IDvdService {

	@Override
	public List<Dvd> queryDvd() {
		IDvdDao dvdDaoImple = new DvdDaoImple();
		return dvdDaoImple.outDvd();
	}

}
