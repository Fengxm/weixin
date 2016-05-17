package com.revencoft.entity.message.request;

import java.util.Map;

import javax.persistence.Entity;

/**
 * 文本消息
 * 
 * @author fengxiaoming
 * 
 */

@Entity
public class RequestTextMessage extends RequestMessage {
	
	private String Content;

	public RequestTextMessage(Map<String, String> reqMap) {
		super(reqMap);
		this.Content = reqMap.get("Content");
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
