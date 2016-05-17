package com.revencoft.entity.message.request;

import java.util.Map;

/**
 * 图片消息
 * 
 * @author fengxiaoming
 * 
 */
public class RequestImageMessage extends RequestMessage {
	private String PicUrl;
	private String MediaId;
	
	public RequestImageMessage(Map<String,String> reqMap) {
		super(reqMap);
		this.MediaId = reqMap.get("MediaId");
		this.PicUrl = reqMap.get("PicUrl");
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

}
