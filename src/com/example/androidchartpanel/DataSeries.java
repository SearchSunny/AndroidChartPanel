package com.example.androidchartpanel;

import java.util.HashMap;
import java.util.List;

/**
 * DataSeries对象用来构造数据集，根据key来得到对应的数据系列
 * @author miaowei
 *
 */
public class DataSeries {

	private HashMap<String, List<DataElement>> map;
	
	public DataSeries() {
		
		       map = new HashMap<String, List<DataElement>>();
		   }

	public void addSeries(String key, List<DataElement> itemList) {
		        map.put(key, itemList);
		    }
	
	public List<DataElement> getItems(String key) {
		        return map.get(key);
		    }
	
	public int getSeriesCount() {
		        return map.size();
		    }

	public String[] getSeriesKeys() {
		        return map.keySet().toArray(new String[0]);
		    }

}
