package com.revencoft.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 图文
 * 
 * @author fengxiaoming
 * 
 */
@XStreamAlias("item")
public class Item {
	private String Title;
	private String Description;
	private String PicUrl;
	private String Url;

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

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
