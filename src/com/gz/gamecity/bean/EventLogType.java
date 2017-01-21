package com.gz.gamecity.bean;

public enum EventLogType {
	
	unknown("未知",-1),create("新建账号",0),niuniu_bet("牛牛下注",1),niuniu_checkout("牛牛结算",2),fruit_bet("水果机下注",3),
	fruit_checkout("水果机结算",4),luckywheel_bet("大转盘下注",5),blackA_bet("黑桃A下注",6),
	texas_bet("德州下注", 7),
	texas_reward("德州结算", 8),
	laba_bet("拉霸下注",9),laba_checkout("拉霸结算",10),mahjong_bet("麻将下注",11),
	mahjong_checkout("麻将结算",12),test("测试加钱",13),take_mail("领取邮件",14),gm_add("GM添加",15),signin("签到",16),
	send_gift("赠送礼物",17),buy_head("购买头像",18);

	private String desc;
	private int type;
	public int getType() {
		return type;
	}
	private EventLogType(String desc,int type){
		this.desc = desc;
		this.type = type;
	}
	
	
}
