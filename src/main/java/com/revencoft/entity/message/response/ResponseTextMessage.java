package com.revencoft.entity.message.response;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复文本消息
 * 
 * @author fengxiaoming
 * 
 */

@XStreamAlias("xml")
public class ResponseTextMessage extends ResponseMessage {
	private String Content;

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

}
