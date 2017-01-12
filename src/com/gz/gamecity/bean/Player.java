package com.gz.gamecity.bean;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.gz.util.TimeUpItem;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.AttributeKey;

public class Player extends TimeUpItem{
	
	public static final AttributeKey<Player> NETTY_CHANNEL_KEY = AttributeKey.valueOf("player");
	
	public static final String NAME="name";
	public static final String UUID="uuid";
	public static final String COIN="coin";
	public static final String HEAD="head";

	private String uuid;
	private String name;
	private byte sex;
	private long coin;
	private int head;
	private int lvl;
	private int finance;
	private int vip;
	private int charm;
	private String sign;
	private long charge_total;
	private Channel channel;
	private String gameToken;
	private String regTime;
	private String lastTime;
	private int serverId;
	private boolean onTable;
	private boolean online;
	private int roomId;
	private String tableId;
	
	
	public byte getSex() {
		return sex;
	}
	public void setSex(byte sex) {
		this.sex = sex;
	}
	public long getCharge_total() {
		return charge_total;
	}
	public void setCharge_total(long charge_total) {
		this.charge_total = charge_total;
	}
	public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public String getTableId() {
		return tableId;
	}
	public void setTableId(String tableId) {
		this.tableId = tableId;
	}
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public boolean isOnline() {
		return online;
	}
	public void setOnline(boolean online) {
		this.online = online;
	}
	public boolean isOnTable() {
		return onTable;
	}
	public void setOnTable(boolean onTable) {
		this.onTable = onTable;
	}
	public int getServerId() {
		return serverId;
	}
	public void setServerId(int serverId) {
		this.serverId = serverId;
	}
	public String getGameToken() {
		return gameToken;
	}
	public void setGameToken(String gameToken) {
		this.gameToken = gameToken;
	}

	
	
	public int getLvl() {
		return lvl;
	}
	public void setLvl(int lvl) {
		this.lvl = lvl;
	}
	public int getFinance() {
		return finance;
	}
	public void setFinance(int finance) {
		this.finance = finance;
	}
	public int getCharm() {
		return charm;
	}
	public void setCharm(int charm) {
		this.charm = charm;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
	public Channel getChannel() {
		return channel;
	}
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCoin() {
		return coin;
	}
	public void setCoin(long coin) {
		this.coin = coin;
	}
	
	public int getVip() {
		return vip;
	}
	public void setVip(int vip) {
		this.vip = vip;
	}
	
	public static Player createPlayer(String uuid){
		Player player = new Player();
		player.setUuid(uuid);
		player.setName("游客");
		player.setSex((byte) 2);
		player.setCoin(80000);
		player.setHead(0);
		player.setLvl(1);
		player.setFinance(0);
		player.setVip(0);
		player.setCharm(0);
		player.setSign("");
		player.setCharge_total(0);
		return player;
	}
	
	public void write(JSONObject json){
		try {
			channel.writeAndFlush(new TextWebSocketFrame(JSON.toJSONString(json)));
		} catch (Exception e) {
		}
		
	}
	@Override
	public void onTimeUp() {
		// TODO Auto-generated method stub
		
	}
}
