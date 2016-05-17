package com.revencoft.entity.message.request;

import java.util.Map;

/**
 * 链接消息
 * 
 * @author fengxiaoming
 * 
 */
public class RequestLinkMessage extends RequestMessage {
	
	private String Title;
	private String Description;
	private String Url;

	public RequestLinkMessage(Map<String, String> reqMap) {
		super(reqMap);
		this.Title = reqMap.get("Title");
		this.Description = reqMap.get("Description");
		this.Url = reqMap.get("Url");
	}
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
