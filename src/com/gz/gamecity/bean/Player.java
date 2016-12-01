package com.gz.gamecity.bean;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.AttributeKey;

public class Player {
	
	public static final AttributeKey<Player> NETTY_CHANNEL_KEY = AttributeKey.valueOf("player");
	
	public static final String NAME="name";
	public static final String UUID="uuid";
	public static final String COIN="coin";
	
	private String name;
	private long coin;
	private String gameToken;
	private int serverId;
	private boolean onTable;
	private boolean online;
	
	
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

	private String uuid;
	private Channel channel;
	
	
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
	
	public static Player createPlayer(String uuid){
		Player player = new Player();
		player.setUuid(uuid);
		player.setCoin(50000);
		player.setName("游客");
		return player;
	}
	
	public void write(JSONObject json){
		try {
			channel.writeAndFlush(new TextWebSocketFrame(JSON.toJSONString(json)));
		} catch (Exception e) {
		}
		
	}
}
