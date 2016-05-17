package com.revencoft.entity.message.request;

import java.util.Map;

/**
 * 视频消息
 * 
 * @author fengxiaoming
 * 
 */
public class RequestVideoMessage extends RequestMessage {
	private String MediaId;
	private String ThumbMediaId;

	public RequestVideoMessage(Map<String, String> reqMap) {
		super(reqMap);
		this.MediaId = reqMap.get("MediaId");
		this.ThumbMediaId = reqMap.get("ThumbMediaId");
	}
	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}
