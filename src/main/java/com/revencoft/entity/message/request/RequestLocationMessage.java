package com.revencoft.entity.message.request;

import java.util.Map;

/**
 * 地理位置消息
 * 
 * @author fengxiaoming
 * 
 */
public class RequestLocationMessage extends RequestMessage {
	private String Location_X;
	private String Location_Y;
	private String Scale;
	private String Label;

	
	public RequestLocationMessage(Map<String, String> reqMap) {
		super(reqMap);
		this.Location_X = reqMap.get("Location_X");
		this.Location_Y = reqMap.get("Location_Y");
		this.Scale = reqMap.get("Scale");
		this.Label = reqMap.get("Label");
	}
	
	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

}
