package com.example.androidchartpanel;
/**
 * DataElement数据元素，属性有数据名称，值大小，显示颜色等
 * @author miaowei
 *
 */
public class DataElement {

	
	public DataElement(String name, float value, int color) {
		        this.itemName = name;
		        this.value = value;
		        this.color = color;
		    }
		    public String getItemName() {
		        return itemName;
		    }
		    public void setItemName(String itemName) {
		        this.itemName = itemName;
		    }
		    public float getValue() {
		        return value;
		    }
		    public void setValue(float value) {
		        this.value = value;
		    }
		     
		    public void setColor(int color) {
		        this.color = color;
		    }
		     
		    public int getColor() {
		        return this.color;
		    }
		     
		    private String itemName;
		    private int color;
		    private float value;

}
