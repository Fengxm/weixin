package com.revencoft.entity.message.response;

import java.util.List;

import com.revencoft.entity.Item;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 回复图文消息
 * 
 * @author fengxiaoming
 * 
 */
@XStreamAlias("xml")
public class ResponseItemMessage extends ResponseMessage {
	private int ArticleCount;

	@XStreamAlias("Articles")
	private List<Item> list;
	
	public int getArticleCount() {
		return ArticleCount;
	}

	public void setArticleCount(int articleCount) {
		ArticleCount = articleCount;
	}

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}

}
