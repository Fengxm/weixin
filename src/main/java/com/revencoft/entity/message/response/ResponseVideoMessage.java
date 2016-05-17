package com.revencoft.entity.message.response;

import com.revencoft.entity.Video;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复视频消息
 * 
 * @author fengxiaoming
 * 
 */
@XStreamAlias("xml")
public class ResponseVideoMessage extends ResponseMessage {
	@XStreamAlias("Video")
	private Video video;

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

}
