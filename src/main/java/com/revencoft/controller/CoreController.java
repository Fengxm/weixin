package com.revencoft.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revencoft.handler.MessageHandler;
import com.revencoft.util.MessageUtil;
import com.revencoft.util.SignUtil;

@Controller
@RequestMapping(value = "/core")
public class CoreController {
	
	private static Log logger = LogFactory.getLog(CoreController.class);
	
	@RequestMapping(method=RequestMethod.GET)
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		// 微信加密签名
		String signature = req.getParameter("signature");
		// 时间戳
		String timestamp = req.getParameter("timestamp");
		// 随机数
		String nonce = req.getParameter("nonce");
		// 随机字符串
		String echostr = req.getParameter("echostr");
		PrintWriter out = resp.getWriter();
		// 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			out.print(echostr);
		}
		out.close();
		out = null;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	private void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		req.setCharacterEncoding(MessageUtil.DEFAULT_ENCODING);
		resp.setCharacterEncoding(MessageUtil.DEFAULT_ENCODING);
		resp.setContentType(MessageUtil.DEFAULT_CONTENT_TYPE);
		PrintWriter out = resp.getWriter();
		try {
			Map<String, String> reqMap = MessageUtil.parseXml(req);
			String msgType = reqMap.get("MsgType");//消息类型
			String msgXml = "";
			if (MessageUtil.MESSAGE_TEXT.equals(msgType)) {
				msgXml = MessageHandler.textMessage(reqMap);
			}else if(MessageUtil.MESSAGE_IMAGE.equals(msgType)){
				msgXml = MessageHandler.imageMessage(reqMap);
			}else {
				msgXml = MessageHandler.unSupportedMessage(reqMap);
			}
			System.out.println(msgXml);
			out.print(msgXml);
		} catch (Exception e) {
			logger.error(e);
			e.printStackTrace();
		} finally {
			out.close();
		}

	}
	
	
}
