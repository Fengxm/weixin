package com.revencoft.entity.message.response;

import com.revencoft.entity.Music;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复音乐消息
 * 
 * @author fengxiaoming
 * 
 */
@XStreamAlias("xml")
public class ResponseMusicMessage extends ResponseMessage {
	@XStreamAlias("Music")
	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}

}
