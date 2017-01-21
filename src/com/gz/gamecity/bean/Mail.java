package com.gz.gamecity.bean;

public class Mail {
	public static final int MAIL_TYPE_FRIEND=0;
	public static final int MAIL_TYPE_SYSTEM=1;
	
	private String title;
	private String content;
	private String attachments;
	private String send_time;
	private String player_uuid;
	private String mailId;
	private boolean read;
	private boolean taken;
	private int mail_type;
	private String sender;
	
	public int getMail_type() {
		return mail_type;
	}
	public void setMail_type(int mail_type) {
		this.mail_type = mail_type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	public String getSend_time() {
		return send_time;
	}
	public void setSend_time(String send_time) {
		this.send_time = send_time;
	}
	public String getPlayer_uuid() {
		return player_uuid;
	}
	public void setPlayer_uuid(String player_uuid) {
		this.player_uuid = player_uuid;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public boolean isRead() {
		return read;
	}
	public void setRead(boolean read) {
		this.read = read;
	}
	public boolean isTaken() {
		return taken;
	}
	public void setTaken(boolean taken) {
		this.taken = taken;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	
}
