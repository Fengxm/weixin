package com.revencoft.entity.message.response;

import com.revencoft.entity.Voice;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复语音消息
 * 
 * @author fengxiaoming
 * 
 */
@XStreamAlias("xml")
public class ResponseVoiceMessage extends ResponseMessage {
	@XStreamAlias("Voice")
	private Voice voice;

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

}
