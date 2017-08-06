package com.oaec.test.dao.imple;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.oaec.test.bean.Dvd;
import com.oaec.test.dao.IDvdDao;
public class DvdDaoImple implements IDvdDao {
	@Override
	public List<Dvd> outDvd() {
		List<Dvd> list = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			while(reader.ready()){
				String[] str = reader.readLine().split(",");
				list.add(new Dvd(Integer.valueOf(str[0]),
						str[1],
						Integer.valueOf(str[2]),
						Integer.valueOf(str[3]),
						Integer.valueOf(str[4])));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void inDvd(Dvd dvd) {
		List<Dvd> list = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			while(reader.ready()){
				String[] str = reader.readLine().split(",");
				list.add(new Dvd(Integer.valueOf(str[0]),
						str[1],
						Integer.valueOf(str[2]),
						Integer.valueOf(str[3]),
						Integer.valueOf(str[4])));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*++++++++++++++++++++++++++++++++++++++++++++++++++++++*/
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(file));
			list.add(dvd);
			for(Dvd dvd1 : list){
				writer.write(dvd1.input());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
