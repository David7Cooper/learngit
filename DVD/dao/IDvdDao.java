package com.oaec.test.dao;
import java.io.File;
import java.util.List;
import com.oaec.test.bean.Dvd;
public interface IDvdDao {
	public static final File file = new File("D://Dvd.java");
	
	public abstract List<Dvd> outDvd();
	
	public abstract void inDvd(Dvd dvd);
}
