package com.revencoft.entity.message.request;

import java.util.Map;

/**
 * 语音消息
 * 
 * @author fengxiaoming
 * 
 */
public class RequestVoiceMessage extends RequestMessage {
	private String MediaId;
	private String Format;
	private String Recognition;


	public RequestVoiceMessage(Map<String, String> reqMap) {
		super(reqMap);
		this.MediaId = reqMap.get("MediaId");
		this.Format = reqMap.get("Format");
		this.Recognition = reqMap.get("Recognition");
	}
	
	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getRecognition() {
		return Recognition;
	}

	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

}
