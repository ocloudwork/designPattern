package com.ocloudwork.prototype;

import java.text.MessageFormat;

public class MailUtil {
	public static void sendMail(Mail mail) {
		String content="向{0}同学，邮件地址：{1},内容：{2}   发送邮件";
		System.out.println(MessageFormat.format(content, mail.getName(),mail.getAddress(),mail.getContent()));
	}
	public static void saveOriginMailRecode(Mail mail) {
		System.out.println("Origin Mail:"+mail.toString());
	}
}
