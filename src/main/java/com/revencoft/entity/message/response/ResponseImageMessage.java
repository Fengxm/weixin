package com.revencoft.entity.message.response;

import com.revencoft.entity.Image;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复图片消息
 * 
 * @author fengxiaoming
 * 
 */
@XStreamAlias("xml")
public class ResponseImageMessage extends ResponseMessage {

	@XStreamAlias("Image")
	private Image image;

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

}
