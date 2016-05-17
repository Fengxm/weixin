package com.revencoft.entity.message.request;

import java.util.Map;

import javax.persistence.Entity;

/**
 * 接收消息
 * 
 * @author fengxiaoming
 * 
 */

@Entity
public class RequestMessage {

	protected String ToUserName;
	protected String FromUserName;
	protected long CreateTime;
	protected String MsgType;
	protected long MsgId;

	public RequestMessage(Map<String, String> reqMap) {
		this.ToUserName = reqMap.get("ToUserName");
		this.FromUserName = reqMap.get("FromUserName");
		this.CreateTime = Long.valueOf(reqMap.get("CreateTime"));
		this.MsgType = reqMap.get("MsgType");
		this.MsgId = Long.valueOf(reqMap.get("MsgId"));
	}

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public long getMsgId() {
		return MsgId;
	}

	public void setMsgId(long msgId) {
		MsgId = msgId;
	}
}
