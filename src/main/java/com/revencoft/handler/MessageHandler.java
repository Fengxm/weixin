package com.revencoft.handler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.revencoft.entity.Image;
import com.revencoft.entity.Item;
import com.revencoft.entity.message.request.RequestImageMessage;
import com.revencoft.entity.message.request.RequestMessage;
import com.revencoft.entity.message.request.RequestTextMessage;
import com.revencoft.entity.message.response.ResponseImageMessage;
import com.revencoft.entity.message.response.ResponseItemMessage;
import com.revencoft.entity.message.response.ResponseTextMessage;
import com.revencoft.util.MessageUtil;

/**
 * 消息处理
 * @author xiaoming
 *
 */
public class MessageHandler {
	/**
	 * 文本消息处理
	 * @param reqMap
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static String textMessage(Map<String,String> reqMap) throws InstantiationException, IllegalAccessException{
		String msgXml = "";
		RequestTextMessage reqTm = new RequestTextMessage(reqMap);
		if("toms".equals(reqTm.getContent())){
			ResponseItemMessage repsIm = new ResponseItemMessage();
			repsIm.setToUserName(reqTm.getFromUserName());
			repsIm.setFromUserName(reqTm.getToUserName());
			repsIm.setMsgType(MessageUtil.MESSAGE_NEWS);
			repsIm.setCreateTime(new Date().getTime());
			Item item = new Item();
			item.setDescription("交易运营管理系统");
			item.setPicUrl("http://mmbiz.qpic.cn/mmbiz/wzp2eaC3YVQVa1XIaHsbHtWFjhicFRBkPxm9Xt9373hGIfaerIxfGetYFsZ1GLJbDunianE2NCAUGC3v4usXLDiaQ/0");
			item.setTitle("toms");
			item.setUrl("https://toms.pmec.com");
			List<Item> list = new ArrayList<Item>();
			list.add(item);
			repsIm.setArticleCount(list.size());
			repsIm.setList(list);
			msgXml = MessageUtil.getMessageXml(repsIm);
		}else{
			ResponseTextMessage respTm = new ResponseTextMessage();
			String msg = "您输入的消息是: " + reqTm.getContent();
			respTm.setToUserName(reqTm.getFromUserName());
			respTm.setFromUserName(reqTm.getToUserName());
			respTm.setMsgType(MessageUtil.MESSAGE_TEXT);
			respTm.setCreateTime(new Date().getTime());
			respTm.setContent(msg);
			msgXml = MessageUtil.getMessageXml(respTm);
		}
		return msgXml;
	}
	
	/**
	 * 图片消息处理
	 * @param reqMap
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static String imageMessage(Map<String,String> reqMap) throws InstantiationException, IllegalAccessException{
		String msgXml = "";
		RequestImageMessage reqIm = new RequestImageMessage(reqMap);
		ResponseImageMessage respIm = new ResponseImageMessage();
		respIm.setToUserName(reqIm.getFromUserName());
		respIm.setFromUserName(reqIm.getToUserName());
		respIm.setMsgType(MessageUtil.MESSAGE_IMAGE);
		respIm.setCreateTime(new Date().getTime());
		Image image = new Image();
		image.setMediaId(reqIm.getMediaId());
		respIm.setImage(image);
		msgXml = MessageUtil.getMessageXml(respIm);
		return msgXml;
	}
	
	/**
	 * 不支持类型消息处理
	 * @param reqMap
	 * @return
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static String unSupportedMessage(Map<String,String> reqMap) throws InstantiationException, IllegalAccessException{
		String msgXml = "";
		String msg = "暂不支持此类型消息的自动回复";
		RequestMessage reqMsg = new RequestMessage(reqMap);
		ResponseTextMessage respTm = new ResponseTextMessage();
		respTm.setToUserName(reqMsg.getFromUserName());
		respTm.setFromUserName(reqMsg.getToUserName());
		respTm.setMsgType(MessageUtil.MESSAGE_TEXT);
		respTm.setCreateTime(new Date().getTime());
		respTm.setContent(msg);
		msgXml = MessageUtil.getMessageXml(respTm);
		return msgXml;
	}
}
