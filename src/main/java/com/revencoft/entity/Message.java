package com.revencoft.entity;

import java.util.Map;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * 消息
 * 
 * @author fengxiaoming
 * 
 */

@Entity
public class Message {
	@Autowired
	protected String ToUserName;
	@Autowired
	protected String FromUserName;
	@Autowired
	protected long CreateTime;
	@Autowired
	protected String MsgType;

	
	public Message(Map<String, String> reqMap) {
		this.ToUserName = reqMap.get("ToUserName");
		this.FromUserName = reqMap.get("FromUserName");
		this.CreateTime = Long.valueOf(reqMap.get("CreateTime"));
		this.MsgType = reqMap.get("MsgType");
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

}
