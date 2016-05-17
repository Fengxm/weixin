package com.revencoft.handler;



import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.revencoft.entity.menu.ClickButton;
import com.revencoft.entity.menu.ViewButton;

public class MenuHandler {
	
	private static String menuUrl = "https://api.weixin.qq.com/cgi-bin/menu/";
	private static String createAction = "create?access_token=";
	private static String access_token = "WGpCsEyFhWGg_AtyXs1Po_-iKTdLPHfjsXbVN5xLylC7c5e2140grY9rt8nmkBqdmj6dTHFrrcd2fjCRDRk4CL6mohNgFofNX6DJfNuuiJ-K_wVtevW1WGyRE_8e45IyMPBdAGAQTF";
	public static void getMenu(){
		ClickButton cbt = new ClickButton();
		cbt.setKey("image");
		cbt.setName("回复图片");
		cbt.setType("click");
		
		ViewButton vbt = new ViewButton();
		vbt.setUrl("https://www.baidu.com");
		vbt.setName("百度");
		vbt.setType("view");
		
		JSONArray sub_button = new JSONArray();
		sub_button.add(cbt);
		sub_button.add(vbt);
		
		JSONObject buttonOne = new JSONObject();
		buttonOne.put("name", "菜单");
		buttonOne.put("sub_button",sub_button);
		
		
		JSONArray button = new JSONArray();
		button.add(vbt);
		button.add(buttonOne);
		button.add(cbt);
		
		JSONObject menuJson = new JSONObject();
		menuJson.put("button", button);
		System.out.println(menuJson);
		String createUrl = menuUrl + createAction  + access_token;
	}
}
