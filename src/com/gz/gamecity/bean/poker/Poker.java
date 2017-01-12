package com.gz.gamecity.bean.poker;

import java.util.Random;

public class Poker {
	
	public String num;
    public String suit;
    public byte point;
    
    public static final String SPADE = "♠";
    public static final String HEART = "♥";
    public static final String CLUB = "♣";
    public static final String DIAMOND = "♦";
    
    public String toString()
    {
        return suit+":"+num+"  ";
    }

    public Poker(String num, String suit, byte point) {
		super();
		this.num = num;
		this.suit = suit;
		this.point = point;
	}

	public static final Poker[] getShuffledPokers(){
    	Poker[] pokers = getPokers();
    	Random rd = new Random();
        for(int i=0;i<52;i++)
        {
            int j = rd.nextInt(52);//生成随机数
            Poker temp = pokers[i];//交换
            pokers[i]=pokers[j];
            pokers[j]=temp;
        }
    	
    	
//    	for(int i = 0; i < pokers.length; i++){
//    		System.out.print(pokers[i]);
//    	}
    	return pokers;
    }
    
	public static final Poker[] getPokers() {
		Poker[] pokers = new Poker[52];
		String num[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		byte point[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		String suit[] = { SPADE, HEART, CLUB, DIAMOND };
		for (int i = 0; i < pokers.length; i++) {
			pokers[i] = new Poker(num[i%13],suit[i/13],point[i%13]);
		//	System.out.print(pokers[i]);
		}
		return pokers;
	}
//	public static void main(String[] args) {
//		Poker.getPokers();
//		Poker.getShuffledPokers();
//	}
}
