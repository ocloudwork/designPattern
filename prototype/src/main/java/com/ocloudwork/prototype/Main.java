package com.ocloudwork.prototype;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Mail mail=new Mail();
		mail.setContent("初始邮件内容");
		
		for (int i = 0; i < 10; i++) {
			Mail tempMail=(Mail) mail.clone();
			tempMail.setName("jingfeng"+i);
			tempMail.setAddress("minghui"+i+"@163.com");
			tempMail.setContent("请您参加xx活动");
			MailUtil.sendMail(tempMail);
		}
		MailUtil.saveOriginMailRecode(mail);
	}

}
