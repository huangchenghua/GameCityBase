package com.gz.gamecity.protocol;

public class Protocols{


	public static final class C2l_login{
		public static final int mainCode_value = MainCode.PLAYER_LOGIN;
		public static final int subCode_value = 1;
		public static final String UUID = "uuid";
		public static final String SDKTOKEN = "sdkToken";

	}
	public static final class L2c_login{
		public static final int mainCode_value = MainCode.PLAYER_LOGIN;
		public static final int subCode_value = 2;
		public static final String GAMETOKEN = "gameToken";
		public static final String SERVERLIST = "serverlist";

		public static final class Serverlist{
			public static final String NAME = "name";
			public static final String ADDRESS = "address";
			public static final String PORT = "port";
			public static final String STATUS = "status";

		}
	}
	public static final class C2l_login_test{
		public static final int mainCode_value = MainCode.PLAYER_LOGIN;
		public static final int subCode_value = 3;
		public static final String UUID = "uuid";

	}
	public static final class C2g_login{
		public static final int mainCode_value = MainCode.PLAYER_GAME_LOGIN;
		public static final int subCode_value = 1;
		public static final String UUID = "uuid";
		public static final String GAMETOKEN = "gameToken";

	}
	public static final class G2c_login{
		public static final int mainCode_value = MainCode.PLAYER_GAME_LOGIN;
		public static final int subCode_value = 2;
		public static final String NAME = "name";
		public static final String COIN = "coin";
		public static final String HEAD = "head";
		public static final String VIP = "vip";
		public static final String CHARGE_TOTAL = "charge_total";
		public static final String SEX = "sex";
		public static final String LVL = "lvl";
		public static final String EXP = "exp";
		public static final String FINANCE = "finance";
		public static final String SIGN = "sign";
		public static final String CHARM = "charm";
		public static final String TIMESTAMP = "timestamp";
		public static final String FROZEN = "frozen";
		public static final String SILENT = "silent";
		public static final String LASTSIGNDATE = "lastSignDate";
		public static final String SIGNDAYS = "signDays";
		public static final String SIGNED = "signed";
		public static final String HEADS = "heads";

	}
	public static final class C2g_test_login{
		public static final int mainCode_value = MainCode.PLAYER_GAME_LOGIN;
		public static final int subCode_value = 4;
		public static final String COIN = "coin";
		public static final String TIMESTAMP = "timestamp";

	}
	public static final class G2c_kick{
		public static final int mainCode_value = MainCode.PLAYER_GAME_LOGIN;
		public static final int subCode_value = 5;

	}
	public static final class C2g_init_suc{
		public static final int mainCode_value = MainCode.PLAYER_GAME_LOGIN;
		public static final int subCode_value = 6;

	}
	public static final class G2c_coinChange{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 1;
		public static final String COIN = "coin";
		public static final String CHANGE = "change";

	}
	public static final class C2g_laba_enter{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 1;

	}
	public static final class G2c_laba_enter{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 2;

	}
	public static final class C2g_laba_bet{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 3;
		public static final String BET = "bet";

	}
	public static final class G2c_laba_bet{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 4;
		public static final String OPTION = "option";
		public static final String REWARD = "reward";

	}
	public static final class C2g_laba_guess{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 5;
		public static final String RATE = "rate";

	}
	public static final class G2c_laba_guess{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 6;
		public static final String OPTION = "option";
		public static final String STAR = "star";

	}
	public static final class C2g_laba_getpoint{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 7;

	}
	public static final class G2c_laba_getpoint{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 8;

	}
	public static final class C2g_laba_leave{
		public static final int mainCode_value = MainCode.LABA;
		public static final int subCode_value = 9;

	}
	public static final class C2g_mahjong_enter{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 1;

	}
	public static final class G2c_mahjong_enter{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 2;

	}
	public static final class C2g_mahjong_bet{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 3;
		public static final String BET = "bet";
		public static final String LOCK = "lock";
		public static final String PROBABILITY = "probability";

	}
	public static final class G2c_mahjong_bet{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 4;
		public static final String WIN = "win";
		public static final String RESULT = "result";

	}
	public static final class C2g_mahjong_getview{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 5;

	}
	public static final class G2c_mahjong_getview{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 6;
		public static final String RESULT = "result";

	}
	public static final class C2g_mahjong_getpoint{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 7;

	}
	public static final class G2c_mahjong_getpoint{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 8;

	}
	public static final class C2g_mahjong_leave{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 9;

	}
	public static final class C2g_mahjong_start{
		public static final int mainCode_value = MainCode.MAHJONG;
		public static final int subCode_value = 10;

	}
	public static final class C2g_luckyWheel_enter{
		public static final int mainCode_value = MainCode.LUCKYWHEEL;
		public static final int subCode_value = 1;

	}
	public static final class G2c_luckyWheel_enter{
		public static final int mainCode_value = MainCode.LUCKYWHEEL;
		public static final int subCode_value = 2;

	}
	public static final class C2g_luckyWheel_bet{
		public static final int mainCode_value = MainCode.LUCKYWHEEL;
		public static final int subCode_value = 3;
		public static final String BET = "bet";

	}
	public static final class C2g_luckyWheel_leave{
		public static final int mainCode_value = MainCode.LUCKYWHEEL;
		public static final int subCode_value = 8;

	}
	public static final class G2c_luckyWheel_reward{
		public static final int mainCode_value = MainCode.LUCKYWHEEL;
		public static final int subCode_value = 4;
		public static final String ID = "id";
		public static final String PROFIT = "profit";
		public static final String REWARD = "reward";
		public static final String RESULT = "result";

	}
	public static final class C2g_blackA_enter{
		public static final int mainCode_value = MainCode.BLACKA;
		public static final int subCode_value = 1;

	}
	public static final class G2c_blackA_enter{
		public static final int mainCode_value = MainCode.BLACKA;
		public static final int subCode_value = 2;

	}
	public static final class C2g_blackA_bet{
		public static final int mainCode_value = MainCode.BLACKA;
		public static final int subCode_value = 3;
		public static final String BET = "bet";

	}
	public static final class G2c_blackA_reward{
		public static final int mainCode_value = MainCode.BLACKA;
		public static final int subCode_value = 4;
		public static final String REWARD = "reward";
		public static final String RESULT = "result";
		public static final String STAR = "star";

	}
	public static final class C2g_blackA_getbet{
		public static final int mainCode_value = MainCode.BLACKA;
		public static final int subCode_value = 5;

	}
	public static final class C2g_blackA_leave{
		public static final int mainCode_value = MainCode.BLACKA;
		public static final int subCode_value = 8;

	}
	public static final class C2g_niuniu_enter{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 1;

	}
	public static final class G2c_niuniu_enter{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 2;

	}
	public static final class C2g_niuniu_choose_lvl{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 3;
		public static final String LVL = "lvl";

	}
	public static final class G2c_niuniu_tableInfo{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 4;
		public static final String LVL = "lvl";
		public static final String TABLESTATUS = "tableStatus";
		public static final String REMAIN_TIMESTAMP = "remain_timestamp";
		public static final String ISRECONNECT = "isReconnect";

	}
	public static final class G2c_niuniu_begin_bet{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 5;
		public static final String REMAIN_TIMESTAMP = "remain_timestamp";

	}
	public static final class C2g_niuniu_bet{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 6;
		public static final String ID = "id";
		public static final String BET_INDEX = "bet_index";

	}
	public static final class G2c_niuniu_bet{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 7;
		public static final String ID = "id";
		public static final String BETS = "bets";

	}
	public static final class G2c_niuniu_bet_refresh{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 8;
		public static final String BETINFO = "betInfo";

		public static final class BetInfo{
			public static final String ID = "id";
			public static final String BETS = "bets";

		}
	}
	public static final class G2c_niuniu_result{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 9;
		public static final String REMAIN_TIMESTAMP = "remain_timestamp";
		public static final String RESULTINFO = "resultInfo";

		public static final class ResultInfo{
			public static final String ID = "id";
			public static final String INDEX_RANK = "index_rank";
			public static final String CARDTYPE = "cardType";
			public static final String POKER = "poker";

		}
	}
	public static final class C2g_niuniu_req_banker{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 10;

	}
	public static final class G2c_niuniu_req_banker{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 11;
		public static final String INDEX = "index";

	}
	public static final class G2c_niuniu_banker_list{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 12;
		public static final String LIST = "list";
		public static final String BANKER = "banker";

		public static final class Banker{
			public static final String UUID = "uuid";
			public static final String NAME = "name";
			public static final String COIN = "coin";
			public static final String HEAD = "head";
			public static final String SYSTEM = "system";

		}
	}
	public static final class C2g_niuniu_quit_banker{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 13;

	}
	public static final class G2c_niuniu_quit_banker{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 24;

	}
	public static final class G2c_niuniu_playerlist{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 14;
		public static final String PLAYERS = "players";

		public static final class Players{
			public static final String UUID = "uuid";
			public static final String NAME = "name";
			public static final String COIN = "coin";
			public static final String HEAD = "head";

		}
	}
	public static final class G2c_niuniu_player_bet_notify{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 15;
		public static final String UUID = "uuid";
		public static final String BET = "bet";
		public static final String ID = "id";

	}
	public static final class G2c_niuniu_8reward{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 16;
		public static final String PLAYER_REWARD = "player_reward";

		public static final class Player_reward{
			public static final String UUID = "uuid";
			public static final String REWARD = "reward";

		}
	}
	public static final class C2g_niuniu_leave_room{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 17;

	}
	public static final class G2c_niuniu_leave_room{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 18;

	}
	public static final class C2g_niuniu_leave_table{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 19;

	}
	public static final class G2c_niuniu_leave_table{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 20;

	}
	public static final class G2c_niuniu_kick_table{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 21;
		public static final String INFO = "info";

	}
	public static final class G2c_niuniu_banker_coin_refresh{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 22;
		public static final String COIN = "coin";

	}
	public static final class G2c_niuniu_banker_index{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 23;
		public static final String INDEX = "index";

	}
	public static final class C2g_texas_enter_room{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 1;

	}
	public static final class G2c_texas_enter_room{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 2;

	}
	public static final class C2g_texas_choose_lv{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 3;
		public static final String LV = "lv";

	}
	public static final class G2c_texas_choose_lv{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 4;
		public static final String LV = "lv";
		public static final String IS_RECONNECT = "is_reconnect";

	}
	public static final class G2c_texas_table_info{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 5;
		public static final String ROUND = "round";
		public static final String BUTTON_INDEX = "button_index";
		public static final String TABLE_CARD1 = "table_card1";
		public static final String TABLE_CARD2 = "table_card2";
		public static final String TABLE_CARD3 = "table_card3";
		public static final String TABLE_CARD4 = "table_card4";
		public static final String TABLE_CARD5 = "table_card5";
		public static final String POT_TOTAL = "pot_total";
		public static final String POT = "pot";

		public static final class Pot{
			public static final String COIN = "coin";
			public static final String WINNER = "winner";

			public static final class Winner{
				public static final String UUID = "uuid";
				public static final String SEAT_INDEX = "seat_index";

			}
		}		public static final String PLAYER_INFO = "player_info";

		public static final class Player_info{
			public static final String UUID = "uuid";
			public static final String HEAD = "head";
			public static final String NAME = "name";
			public static final String SEAT_INDEX = "seat_index";
			public static final String STATUS = "status";
			public static final String COIN = "coin";
			public static final String BET = "bet";
			public static final String ACTION = "action";

		}
	}
	public static final class G2c_texas_hand_card{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 6;
		public static final String HAND_CARD = "hand_card";

		public static final class Hand_card{
			public static final String UUID = "uuid";
			public static final String CARD1 = "card1";
			public static final String CARD2 = "card2";
			public static final String RESULT = "result";

		}
	}
	public static final class C2g_texas_bet{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 7;
		public static final String ACTION_TYPE = "action_type";
		public static final String BET = "bet";

	}
	public static final class G2c_texas_bet{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 8;
		public static final String DESC = "desc";

	}
	public static final class C2g_texas_leave_room{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 9;

	}
	public static final class G2c_texas_leave_room{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 10;
		public static final String UUID = "uuid";

	}
	public static final class G2c_texas_kick_out_table{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 11;
		public static final String UUID = "uuid";
		public static final String DESC = "desc";

	}
	public static final class G2c_texas_match_result{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 12;
		public static final String POT = "pot";

		public static final class Pot{
			public static final String COIN = "coin";
			public static final String WINNER = "winner";

			public static final class Winner{
				public static final String UUID = "uuid";
				public static final String SEAT_INDEX = "seat_index";

			}
		}
	}
	public static final class G2c_texas_start_time_left{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 13;
		public static final String START_DELAY_SECOND = "start_delay_second";

	}
	public static final class G2c_texas_round_info{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 14;
		public static final String IS_CHECK = "is_check";

	}
	public static final class C2g_texas_levae_table{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 15;
		public static final String TABLEID = "tableId";

	}
	public static final class G2c_texas_levae_table{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 16;
		public static final String TABLEID = "tableId";

	}
	public static final class G2c_texas_remove_seat{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 17;
		public static final String SEAT_INDEX = "seat_index";

	}
	public static final class C2g_texas_show_card{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 18;
		public static final String IS_SHOW = "is_show";

	}
	public static final class G2c_texas_coin_call{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 19;
		public static final String COIN_CALL = "coin_call";

	}
	public static final class C2g_fruit_enter{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 1;

	}
	public static final class G2c_fruit_enter{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 2;
		public static final String RESULTS = "results";
		public static final String TABLESTATUS = "tableStatus";
		public static final String REMAIN_TIMESTAMP = "remain_timestamp";

	}
	public static final class C2g_fruit_bet{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 3;
		public static final String ID = "id";
		public static final String BET_INDEX = "bet_index";

	}
	public static final class G2c_fruit_bet{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 4;
		public static final String BETINFO = "betInfo";

		public static final class BetInfo{
			public static final String ID = "id";
			public static final String BETS = "bets";

		}
	}
	public static final class G2c_fruit_bet_refresh{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 5;
		public static final String BETINFO = "betInfo";

		public static final class BetInfo{
			public static final String ID = "id";
			public static final String BETS = "bets";

		}
	}
	public static final class G2c_fruit_result{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 6;
		public static final String REMAIN_TIMESTAMP = "remain_timestamp";
		public static final String OPTION = "option";

	}
	public static final class C2g_fruit_leave_table{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 7;

	}
	public static final class G2c_fruit_leave_table{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 8;

	}
	public static final class G2c_fruit_begin_bet{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 9;
		public static final String REMAIN_TIMESTAMP = "remain_timestamp";

	}
	public static final class C2g_fruit_rebet{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 10;

	}
	public static final class C2g_heart_ping{
		public static final int mainCode_value = MainCode.HEART;
		public static final int subCode_value = 1;

	}
	public static final class G2c_heart_pong{
		public static final int mainCode_value = MainCode.HEART;
		public static final int subCode_value = 2;

	}
	public static final class C2g_data_change{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 2;
		public static final String NAME = "name";
		public static final String HEAD = "head";
		public static final String SEX = "sex";
		public static final String SIGN = "sign";

	}
	public static final class G2c_data_change{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 3;

	}
	public static final class G2c_player_refresh{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 4;
		public static final String NAME = "name";
		public static final String COIN = "coin";
		public static final String HEAD = "head";
		public static final String VIP = "vip";
		public static final String CHARGE_TOTAL = "charge_total";
		public static final String SEX = "sex";
		public static final String LVL = "lvl";
		public static final String EXP = "exp";
		public static final String FINANCE = "finance";
		public static final String SIGN = "sign";
		public static final String CHARM = "charm";
		public static final String FROZEN = "frozen";
		public static final String SILENT = "silent";
		public static final String LASTSIGNDATE = "lastSignDate";
		public static final String SIGNDAYS = "signDays";
		public static final String SIGNED = "signed";
		public static final String HEADS = "heads";

	}
	public static final class C2g_player_gift_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 5;

	}
	public static final class G2c_player_gift_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 6;
		public static final String COUNT = "count";

	}
	public static final class G2c_player_gift_change{
		public static final int mainCode_value = MainCode.PLAYER_DATA_GAME;
		public static final int subCode_value = 7;
		public static final String ID = "id";
		public static final String COUNT = "count";

	}
	public static final class C2g_shop{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 1;

	}
	public static final class G2c_shop{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 2;
		public static final String SHOPLIST = "shoplist";

		public static final class Shoplist{
			public static final String FEE = "fee";
			public static final String COIN = "coin";
			public static final String ICON = "icon";
			public static final String ITEMID = "itemId";

		}
	}
	public static final class C2g_req_signin_reward{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 3;

	}
	public static final class G2c_req_signin_reward{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 4;
		public static final String REWARD_INFO = "reward_info";

		public static final class Reward_info{
			public static final String VIP = "vip";
			public static final String REWARD = "reward";

		}
	}
	public static final class C2g_signin{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 5;

	}
	public static final class G2c_signin{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 6;

	}
	public static final class C2g_buy_head{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 7;
		public static final String ID = "id";

	}
	public static final class G2c_buy_head{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 8;

	}
	public static final class C2g_gonggao{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 9;

	}
	public static final class G2c_gonggao{
		public static final int mainCode_value = MainCode.HALL;
		public static final int subCode_value = 10;
		public static final String CONTENT = "content";

	}
	public static final class C2g_mail_list{
		public static final int mainCode_value = MainCode.MAIL;
		public static final int subCode_value = 1;

	}
	public static final class G2c_mail_list{
		public static final int mainCode_value = MainCode.MAIL;
		public static final int subCode_value = 2;
		public static final String MAIL_LIST = "mail_list";

		public static final class Mail_list{
			public static final String MAILID = "mailId";
			public static final String TITLE = "title";
			public static final String CONTENT = "content";
			public static final String SEND_TIME = "send_time";
			public static final String READ = "read";
			public static final String TAKEN = "taken";
			public static final String ATTACHMENTS = "attachments";
			public static final String MAIL_TYPE = "mail_type";
			public static final String SENDER = "sender";
			public static final String REMAIN = "remain";

		}
	}
	public static final class G2c_new_mail{
		public static final int mainCode_value = MainCode.MAIL;
		public static final int subCode_value = 3;
		public static final String MAILID = "mailId";
		public static final String TITLE = "title";
		public static final String CONTENT = "content";
		public static final String SEND_TIME = "send_time";
		public static final String READ = "read";
		public static final String TAKEN = "taken";
		public static final String ATTACHMENTS = "attachments";
		public static final String MAIL_TYPE = "mail_type";
		public static final String SENDER = "sender";
		public static final String REMAIN = "remain";

	}
	public static final class C2g_open_mail{
		public static final int mainCode_value = MainCode.MAIL;
		public static final int subCode_value = 4;
		public static final String MAILID = "mailId";

	}
	public static final class C2g_take_mail{
		public static final int mainCode_value = MainCode.MAIL;
		public static final int subCode_value = 5;
		public static final String MAILID = "mailId";

	}
	public static final class C2g_delete_mail{
		public static final int mainCode_value = MainCode.MAIL;
		public static final int subCode_value = 6;
		public static final String MAILIDS = "mailIds";

	}
	public static final class C2g_friend_add{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 1;
		public static final String UUID_OTHER = "uuid_other";

	}
	public static final class G2c_friend_add{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 2;
		public static final String UUID_OTHER = "uuid_other";
		public static final String IS_SUCC = "is_succ";

	}
	public static final class C2g_friend_del{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 3;
		public static final String UUID_OTHER = "uuid_other";

	}
	public static final class G2c_friend_del{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 4;
		public static final String UUID_OTHER = "uuid_other";

	}
	public static final class C2g_friend_list{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 5;

	}
	public static final class G2c_friend_list{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 6;
		public static final String PLAYER_LIST = "player_list";

		public static final class Player_list{
			public static final String UUID = "uuid";
			public static final String LV = "lv";
			public static final String NAME = "name";
			public static final String HEAD = "head";
			public static final String VIP = "vip";
			public static final String FINANCE = "finance";
			public static final String COIN = "coin";

		}
	}
	public static final class C2g_friend_other_info{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 7;
		public static final String NAME = "name";

	}
	public static final class G2c_friend_other_info{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 8;
		public static final String UUID = "uuid";
		public static final String SEX = "sex";
		public static final String LV = "lv";
		public static final String EXP = "exp";
		public static final String NAME = "name";
		public static final String HEAD = "head";
		public static final String VIP = "vip";
		public static final String FINANCE = "finance";
		public static final String COIN = "coin";
		public static final String CHARM = "charm";
		public static final String SIGN = "sign";

	}
	public static final class C2g_senf_gift{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 9;
		public static final String TARGET = "target";
		public static final String ID = "id";
		public static final String COUNT = "count";

	}
	public static final class G2c_senf_gift{
		public static final int mainCode_value = MainCode.FRIEND;
		public static final int subCode_value = 10;

	}
	public static final class C2g_alms_enter_hall{
		public static final int mainCode_value = MainCode.ALMS;
		public static final int subCode_value = 1;

	}
	public static final class G2c_alms_show_panel{
		public static final int mainCode_value = MainCode.ALMS;
		public static final int subCode_value = 2;
		public static final String LEFT_CNT = "left_cnt";
		public static final String COIN_REWARD = "coin_reward";
		public static final String TOTAL_CNT = "total_cnt";
		public static final String REQ_COIN = "req_coin";

	}
	public static final class C2g_alms_get_reward{
		public static final int mainCode_value = MainCode.ALMS;
		public static final int subCode_value = 3;

	}
	public static final class G2c_alms_get_reward{
		public static final int mainCode_value = MainCode.ALMS;
		public static final int subCode_value = 4;

	}
	public static final class C2g_charts_get_list{
		public static final int mainCode_value = MainCode.ALMS;
		public static final int subCode_value = 5;
		public static final String CHARTS_TYPE = "charts_type";

	}
	public static final class G2c_charts_get_list{
		public static final int mainCode_value = MainCode.ALMS;
		public static final int subCode_value = 6;
		public static final String CHARTS_TYPE = "charts_type";
		public static final String PLAYER_LIST = "player_list";

		public static final class Player_list{
			public static final String RANK = "rank";
			public static final String VALUE = "value";
			public static final String UUID = "uuid";
			public static final String NAME = "name";
			public static final String SEX = "sex";
			public static final String HEAD = "head";
			public static final String LVL = "lvl";
			public static final String VIP = "vip";
			public static final String FINANCE = "finance";

		}
	}
	public static final class C2g_test_charge{
		public static final int mainCode_value = MainCode.TEST;
		public static final int subCode_value = 1;
		public static final String COIN = "coin";

	}
	public static final class C2g_test_sendMail{
		public static final int mainCode_value = MainCode.TEST;
		public static final int subCode_value = 2;
		public static final String MAIL_TYPE = "mail_type";

	}
	public static final class C2g_send_msg{
		public static final int mainCode_value = MainCode.CHAT;
		public static final int subCode_value = 1;
		public static final String REVMSG = "revMsg";
		public static final String HORN = "horn";

	}
	public static final class G2c_send_msg{
		public static final int mainCode_value = MainCode.CHAT;
		public static final int subCode_value = 2;
		public static final String REVMSG = "revMsg";
		public static final String UUID = "uuid";
		public static final String NAME = "name";
		public static final String HEAD = "head";
		public static final String LVL = "lvl";
		public static final String VIP = "vip";
		public static final String FINANCE = "finance";
		public static final String HORN = "horn";

	}
	public static final class G2c_system_msg{
		public static final int mainCode_value = MainCode.CHAT;
		public static final int subCode_value = 3;
		public static final String REVMSG = "revMsg";

	}
	public static final class G2l_login{
		public static final int mainCode_value = MainCode.GAMESERVER_LOGIN;
		public static final int subCode_value = 1;
		public static final String SERVERID = "serverId";

	}
	public static final class L2g_login{
		public static final int mainCode_value = MainCode.GAMESERVER_LOGIN;
		public static final int subCode_value = 2;
		public static final String OPT = "opt";

	}
	public static final class G2l_playerVerify{
		public static final int mainCode_value = MainCode.PLAYERVERIFY;
		public static final int subCode_value = 1;
		public static final String UUID = "uuid";
		public static final String GAMETOKEN = "gameToken";

	}
	public static final class L2g_playerVerify{
		public static final int mainCode_value = MainCode.PLAYERVERIFY;
		public static final int subCode_value = 2;
		public static final String UUID = "uuid";
		public static final String GAMETOKEN = "gameToken";
		public static final String NAME = "name";
		public static final String COIN = "coin";
		public static final String HEAD = "head";
		public static final String VIP = "vip";
		public static final String CHARGE_TOTAL = "charge_total";
		public static final String SEX = "sex";
		public static final String LVL = "lvl";
		public static final String EXP = "exp";
		public static final String FINANCE = "finance";
		public static final String SIGN = "sign";
		public static final String CHARM = "charm";
		public static final String FROZEN = "frozen";
		public static final String SILENT = "silent";
		public static final String LASTSIGNDATE = "lastSignDate";
		public static final String SIGNDAYS = "signDays";
		public static final String SIGNED = "signed";
		public static final String ALMS_CNT = "alms_cnt";
		public static final String ALMS_TIME = "alms_time";
		public static final String HEADS = "heads";

	}
	public static final class G2l_playerLogout{
		public static final int mainCode_value = MainCode.PLAYERVERIFY;
		public static final int subCode_value = 3;
		public static final String UUID = "uuid";
		public static final String GAMETOKEN = "gameToken";

	}
	public static final class L2g_kickPlayer{
		public static final int mainCode_value = MainCode.PLAYERVERIFY;
		public static final int subCode_value = 4;
		public static final String UUID = "uuid";

	}
	public static final class G2l_coinChange{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 1;
		public static final String UUID = "uuid";
		public static final String LOG_UUID = "log_uuid";
		public static final String COIN = "coin";
		public static final String CHANGE = "change";
		public static final String TYPE = "type";

	}
	public static final class G2l_data_change{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 3;
		public static final String UUID = "uuid";
		public static final String NAME = "name";
		public static final String COIN = "coin";
		public static final String HEAD = "head";
		public static final String VIP = "vip";
		public static final String CHARGE_TOTAL = "charge_total";
		public static final String SEX = "sex";
		public static final String LVL = "lvl";
		public static final String EXP = "exp";
		public static final String FINANCE = "finance";
		public static final String SIGN = "sign";
		public static final String CHARM = "charm";
		public static final String FROZEN = "frozen";
		public static final String SILENT = "silent";
		public static final String LASTSIGNDATE = "lastSignDate";
		public static final String SIGNDAYS = "signDays";
		public static final String SIGNED = "signed";
		public static final String HEADS = "heads";
		public static final String ALMS_CNT = "alms_cnt";
		public static final String ALMS_TIME = "alms_time";

	}
	public static final class G2l_mail_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 4;
		public static final String UUID = "uuid";

	}
	public static final class L2g_mail_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 5;
		public static final String UUID = "uuid";
		public static final String MAIL_LIST = "mail_list";

		public static final class Mail_list{
			public static final String MAILID = "mailId";
			public static final String TITLE = "title";
			public static final String CONTENT = "content";
			public static final String SEND_TIME = "send_time";
			public static final String READ = "read";
			public static final String TAKEN = "taken";
			public static final String ATTACHMENTS = "attachments";
			public static final String MAIL_TYPE = "mail_type";
			public static final String SENDER = "sender";
			public static final String REMAIN = "remain";

		}
	}
	public static final class G2l_new_mail{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 6;
		public static final String UUID = "uuid";
		public static final String MAILID = "mailId";
		public static final String TITLE = "title";
		public static final String CONTENT = "content";
		public static final String SEND_TIME = "send_time";
		public static final String READ = "read";
		public static final String TAKEN = "taken";
		public static final String ATTACHMENTS = "attachments";
		public static final String MAIL_TYPE = "mail_type";
		public static final String SENDER = "sender";

	}
	public static final class G2l_open_mail{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 7;
		public static final String MAILID = "mailId";

	}
	public static final class G2l_take_mail{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 8;
		public static final String UUID = "uuid";
		public static final String MAILID = "mailId";

	}
	public static final class L2g_take_mail{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 9;
		public static final String UUID = "uuid";
		public static final String ATTACHMENTS = "attachments";

	}
	public static final class G2l_delete_mail{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 10;
		public static final String MAILIDS = "mailIds";

	}
	public static final class G2l_player_gift_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 11;
		public static final String UUID = "uuid";

	}
	public static final class L2g_player_gift_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 12;
		public static final String UUID = "uuid";
		public static final String COUNT = "count";

	}
	public static final class G2l_player_gift_change{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 13;
		public static final String UUID = "uuid";
		public static final String ID = "id";
		public static final String COUNT = "count";

	}
	public static final class L2g_silent{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 14;
		public static final String UUID = "uuid";

	}
	public static final class L2g_gm_add_coin{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 15;
		public static final String UUID = "uuid";
		public static final String COIN = "coin";

	}
	public static final class G2l_friend_add{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 20;
		public static final String SERVER_ID = "server_id";
		public static final String UUID_MY = "uuid_my";
		public static final String UUID_OTHER = "uuid_other";
		public static final String DATE_TIME = "date_time";

	}
	public static final class L2g_friend_add{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 21;
		public static final String RET = "ret";
		public static final String UUID_MY = "uuid_my";
		public static final String UUID_OTHER = "uuid_other";

	}
	public static final class G2l_friend_del{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 22;
		public static final String SERVER_ID = "server_id";
		public static final String UUID = "uuid";
		public static final String UUID_OTHER = "uuid_other";

	}
	public static final class L2g_friend_del{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 23;
		public static final String UUID = "uuid";
		public static final String RET = "ret";
		public static final String UUID_OTHER = "uuid_other";

	}
	public static final class G2l_friend_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 24;
		public static final String SERVER_ID = "server_id";
		public static final String UUID = "uuid";

	}
	public static final class L2g_friend_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 25;
		public static final String UUID = "uuid";
		public static final String PLAYER_LIST = "player_list";

		public static final class Player_list{
			public static final String UUID = "uuid";
			public static final String LV = "lv";
			public static final String NAME = "name";
			public static final String HEAD = "head";
			public static final String VIP = "vip";
			public static final String FINANCE = "finance";
			public static final String COIN = "coin";

		}
	}
	public static final class G2l_friend_other_info{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 26;
		public static final String SERVER_ID = "server_id";
		public static final String UUID_SELF = "uuid_self";
		public static final String NAME = "name";

	}
	public static final class L2g_friend_other_info{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 27;
		public static final String UUID_SELF = "uuid_self";
		public static final String UUID = "uuid";
		public static final String SEX = "sex";
		public static final String LV = "lv";
		public static final String EXP = "exp";
		public static final String NAME = "name";
		public static final String HEAD = "head";
		public static final String VIP = "vip";
		public static final String FINANCE = "finance";
		public static final String COIN = "coin";
		public static final String CHARM = "charm";
		public static final String SIGN = "sign";

	}
	public static final class G2l_player_signin{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 27;
		public static final String UUID = "uuid";
		public static final String DATE = "date";
		public static final String SIGN_DAYS = "sign_days";

	}
	public static final class L2g_unsilent{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 28;
		public static final String UUID = "uuid";

	}
	public static final class L2g_sendMail{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 29;
		public static final String UUID = "uuid";
		public static final String TITLE = "title";
		public static final String CONTENT = "content";
		public static final String ATTACHMENTS = "attachments";

	}
	public static final class L2g_sendGameNotice{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 30;
		public static final String CONTENT = "content";

	}
	public static final class L2g_player_charge{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 31;
		public static final String UUID = "uuid";
		public static final String COIN = "coin";

	}
	public static final class G2l_charts_get_list{
		public static final int mainCode_value = MainCode.CHARTS;
		public static final int subCode_value = 1;
		public static final String SERVER_ID = "server_id";
		public static final String UUID_SELF = "uuid_self";
		public static final String CHARTS_TYPE = "charts_type";

	}
	public static final class L2g_charts_get_list{
		public static final int mainCode_value = MainCode.PLAYER_DATA_LOGIN;
		public static final int subCode_value = 32;
		public static final String SERVER_ID = "server_id";
		public static final String UUID_SELF = "uuid_self";
		public static final String CHARTS_TYPE = "charts_type";
		public static final String PLAYER_LIST = "player_list";

		public static final class Player_list{
			public static final String RANK = "rank";
			public static final String VALUE = "value";
			public static final String UUID = "uuid";
			public static final String NAME = "name";
			public static final String SEX = "sex";
			public static final String HEAD = "head";
			public static final String LVL = "lvl";
			public static final String VIP = "vip";
			public static final String FINANCE = "finance";

		}
	}
	public static final class G2l_charts_update_record{
		public static final int mainCode_value = MainCode.CHARTS;
		public static final int subCode_value = 3;
		public static final String UUID = "uuid";
		public static final String CHARM_ADD = "charm_add";
		public static final String COIN_ADD = "coin_add";
		public static final String PAY_ADD = "pay_add";
		public static final String COIN_TOTAL = "coin_total";

	}
	public static final class Inner_sdk_verify_suc{
		public static final int mainCode_value = MainCode.PLAYER_LOGIN;
		public static final int subCode_value = 11;
		public static final String UUID = "uuid";

	}
	public static final class Inner_game_player_logout{
		public static final int mainCode_value = MainCode.PLAYER_GAME_LOGIN;
		public static final int subCode_value = 3;
		public static final String UUID = "uuid";

	}
	public static final class Inner_game_niuniu_start_bet{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 90;
		public static final String TABLEID = "tableId";

	}
	public static final class Inner_game_niuniu_checkout{
		public static final int mainCode_value = MainCode.NIUNIU;
		public static final int subCode_value = 91;
		public static final String TABLEID = "tableId";

	}
	public static final class Inner_game_fruit_start_bet{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 90;

	}
	public static final class Inner_game_fruit_checkout{
		public static final int mainCode_value = MainCode.FRUIT;
		public static final int subCode_value = 91;

	}
	public static final class Inner_game_texas_start{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 101;
		public static final String TABLEID = "tableId";

	}
	public static final class Inner_game_texas_player_action{
		public static final int mainCode_value = MainCode.TEXAS;
		public static final int subCode_value = 102;
		public static final String TABLEID = "tableId";
		public static final String SEAT_INDEX = "seat_index";
		public static final String ROUND = "round";

	}
	public static final class Inner_login_charts_update{
		public static final int mainCode_value = MainCode.CHARTS;
		public static final int subCode_value = 101;

	}
	public static final class DB_game_coin_change{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 1;
		public static final String PLAYER_UUID = "player_uuid";
		public static final String LOG_UUID = "log_uuid";
		public static final String COIN = "coin";
		public static final String CHANGE = "change";
		public static final String TYPE = "type";

	}
	public static final class DB_login_coin_change{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 2;
		public static final String PLAYER_UUID = "player_uuid";
		public static final String LOG_UUID = "log_uuid";
		public static final String COIN = "coin";
		public static final String CHANGE = "change";
		public static final String TYPE = "type";

	}
	public static final class DB_login_update_player_coin{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 3;
		public static final String PLAYER_UUID = "player_uuid";
		public static final String COIN = "coin";

	}
	public static final class DB_data_change{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 4;
		public static final String DATA = "data";

		public static final class Data{
			public static final String UUID = "uuid";
			public static final String NAME = "name";
			public static final String COIN = "coin";
			public static final String HEAD = "head";
			public static final String VIP = "vip";
			public static final String CHARGE_TOTAL = "charge_total";
			public static final String SEX = "sex";
			public static final String LVL = "lvl";
			public static final String EXP = "exp";
			public static final String FINANCE = "finance";
			public static final String SIGN = "sign";
			public static final String CHARM = "charm";
			public static final String FROZEN = "frozen";
			public static final String SILENT = "silent";
			public static final String LASTSIGNDATE = "lastSignDate";
			public static final String SIGNDAYS = "signDays";
			public static final String SIGNED = "signed";
			public static final String HEADS = "heads";

		}
	}
	public static final class DB_login_mail_list{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 5;
		public static final String PLAYER_UUID = "player_uuid";
		public static final String SERVERID = "serverId";

	}
	public static final class DB_login_new_mail{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 6;
		public static final String UUID = "uuid";
		public static final String MAILID = "mailId";
		public static final String TITLE = "title";
		public static final String CONTENT = "content";
		public static final String SEND_TIME = "send_time";
		public static final String READ = "read";
		public static final String TAKEN = "taken";
		public static final String ATTACHMENTS = "attachments";
		public static final String MAIL_TYPE = "mail_type";
		public static final String SENDER = "sender";

	}
	public static final class DB_login_open_mail{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 7;
		public static final String MAILID = "mailId";

	}
	public static final class DB_login_take_mail{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 8;
		public static final String SERVERID = "serverId";
		public static final String UUID = "uuid";
		public static final String MAILID = "mailId";

	}
	public static final class DB_login_delete_mail{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 9;
		public static final String MAILIDS = "mailIds";

	}
	public static final class DB_player_gift_list{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 10;
		public static final String SERVERID = "serverId";
		public static final String UUID = "uuid";

	}
	public static final class DB_player_gift_change{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 11;
		public static final String UUID = "uuid";
		public static final String ID = "id";
		public static final String COUNT = "count";

	}
	public static final class DB_friend_add{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 12;
		public static final String UUID = "uuid";

	}
	public static final class DB_friend_del{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 13;
		public static final String UUID = "uuid";
		public static final String SERVER_ID = "server_id";

	}
	public static final class DB_friend_list{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 14;
		public static final String UUID = "uuid";
		public static final String SERVER_ID = "server_id";

	}
	public static final class DB_friend_other_info{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 15;
		public static final String UUID = "uuid";
		public static final String SERVER_ID = "server_id";

	}
	public static final class DB_search_player{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 16;
		public static final String GM_UUID = "gm_uuid";
		public static final String NAME = "name";

	}
	public static final class DB_freeze{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 17;
		public static final String UUID = "uuid";

	}
	public static final class DB_silent{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 18;
		public static final String UUID = "uuid";

	}
	public static final class DB_unfreeze{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 19;
		public static final String UUID = "uuid";

	}
	public static final class DB_unsilent{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 20;
		public static final String UUID = "uuid";

	}
	public static final class DB_clean_mail{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 21;

	}
	public static final class DB_gm_add_coin{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 22;
		public static final String UUID = "uuid";
		public static final String COIN = "coin";

	}
	public static final class DB_player_signin{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 23;
		public static final String UUID = "uuid";
		public static final String DATE = "date";
		public static final String SIGN_DAYS = "sign_days";

	}
	public static final class DB_charge_record{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 24;
		public static final String AMOUNT = "amount";
		public static final String APPID = "appId";
		public static final String NOTIFYPARAMETERS = "notifyParameters";
		public static final String ORDERID = "orderId";
		public static final String PAYWAY = "payWay";
		public static final String STATUS = "status";
		public static final String UUID = "uuid";
		public static final String SIGN = "sign";

	}
	public static final class DB_req_charge_list{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 25;
		public static final String GM_UUID = "gm_uuid";
		public static final String UUID = "uuid";

	}
	public static final class DB_search_frozen_player{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 26;
		public static final String GM_UUID = "gm_uuid";

	}
	public static final class DB_search_silent_player{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 27;
		public static final String GM_UUID = "gm_uuid";

	}
	public static final class DB_charts_update_record{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 28;
		public static final String TIME = "time";
		public static final String UUID = "uuid";
		public static final String COLUMN_NAME = "column_name";
		public static final String COLUMN_VALUE = "column_value";

	}
	public static final class DB_charts_get_list{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 29;
		public static final String TIME = "time";
		public static final String COLUMN_NAME = "column_name";
		public static final String NUM = "num";
		public static final String CHARTS_TYPE = "charts_type";

	}
	public static final class DB_player_charge{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 30;
		public static final String UUID = "uuid";
		public static final String COIN = "coin";
		public static final String AMOUNT = "amount";

	}
	public static final class DB_charts_top_insert{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 31;
		public static final String PLAYER_LIST = "player_list";

		public static final class Player_list{
			public static final String TIME = "time";
			public static final String CHARTS_TYPE = "charts_type";
			public static final String RANK = "rank";
			public static final String UUID = "uuid";
			public static final String VALUE = "value";

		}
	}
	public static final class DB_charts_record_set{
		public static final int mainCode_value = MainCode.GAME_DB;
		public static final int subCode_value = 32;
		public static final String TIME = "time";
		public static final String UUID = "uuid";
		public static final String COLUMN_NAME = "column_name";
		public static final String COLUMN_VALUE = "column_value";

	}
	public static final class Gm2l_login{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 1;
		public static final String NAME = "name";
		public static final String PASSWORD = "password";

	}
	public static final class L2gm_login{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 2;

	}
	public static final class Gm2l_player_count{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 3;
		public static final String SERVERID = "serverId";

	}
	public static final class L2gm_player_count{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 4;
		public static final String COUNT = "count";

	}
	public static final class Gm2l_search_player{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 5;
		public static final String NAME = "name";

	}
	public static final class L2gm_search_player{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 6;
		public static final String PLAYER_INFO = "player_info";

		public static final class Player_info{
			public static final String UUID = "uuid";
			public static final String NAME = "name";
			public static final String COIN = "coin";
			public static final String HEAD = "head";
			public static final String VIP = "vip";
			public static final String CHARGE_TOTAL = "charge_total";
			public static final String SEX = "sex";
			public static final String LVL = "lvl";
			public static final String FINANCE = "finance";
			public static final String SIGN = "sign";
			public static final String CHARM = "charm";
			public static final String FROZEN = "frozen";
			public static final String SILENT = "silent";
			public static final String LASTSIGNDATE = "lastSignDate";
			public static final String SIGNDAYS = "signDays";

		}
	}
	public static final class Gm2l_freeze{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 7;
		public static final String UUID = "uuid";

	}
	public static final class L2gm_freeze{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 8;

	}
	public static final class Gm2l_silent{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 9;
		public static final String UUID = "uuid";

	}
	public static final class L2gm_silent{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 10;

	}
	public static final class Gm2l_add_coin{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 11;
		public static final String UUID = "uuid";
		public static final String COIN = "coin";

	}
	public static final class L2gm_add_coin{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 12;

	}
	public static final class Gm2l_req_charge{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 13;
		public static final String UUID = "uuid";

	}
	public static final class L2gm_req_charge{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 14;
		public static final String LIST = "list";

		public static final class List{
			public static final String AMOUNT = "amount";
			public static final String ORDERID = "orderId";
			public static final String PAYWAY = "payWay";
			public static final String STATUS = "status";
			public static final String CHARGE_TIME = "charge_time";

		}
	}
	public static final class Gm2l_unfreeze{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 15;
		public static final String UUID = "uuid";

	}
	public static final class L2gm_unfreeze{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 16;

	}
	public static final class Gm2l_unsilent{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 17;
		public static final String UUID = "uuid";

	}
	public static final class L2gm_unsilent{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 18;

	}
	public static final class Gm2l_search_frozen_player{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 19;

	}
	public static final class Gm2l_search_silent_player{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 20;

	}
	public static final class Gm2l_send_game_notice{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 21;
		public static final String CONTENT = "content";
		public static final String STARTTIME = "startTime";
		public static final String ENDTIME = "endTime";
		public static final String INTERVAL = "interval";

	}
	public static final class L2gm_send_game_notice{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 22;
		public static final String UUID = "uuid";

	}
	public static final class Gm2l_game_notice_list{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 23;

	}
	public static final class L2gm_game_notice_list{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 24;
		public static final String LIST = "list";

		public static final class List{
			public static final String UUID = "uuid";
			public static final String CONTENT = "content";
			public static final String STARTTIME = "startTime";
			public static final String ENDTIME = "endTime";
			public static final String INTERVAL = "interval";

		}
	}
	public static final class Gm2l_del_game_notice{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 25;
		public static final String UUID = "uuid";

	}
	public static final class L2gm_del_game_notice{
		public static final int mainCode_value = MainCode.GM_TOOL;
		public static final int subCode_value = 26;

	}
	public static final class ProtocolConst {
		public static final String L2G_LOGIN_OPT_SUC ="1";

	}
	public static final class MainCode {
		public static final int GAMESERVER_LOGIN =1;
		public static final int PLAYER_LOGIN =2;
		public static final int PLAYER_GAME_LOGIN =3;
		public static final int PLAYERVERIFY =4;
		public static final int PLAYER_DATA_GAME =5;
		public static final int PLAYER_DATA_LOGIN =6;
		public static final int HALL =7;
		public static final int LABA =8;
		public static final int LUCKYWHEEL =9;
		public static final int BLACKA =10;
		public static final int NIUNIU =11;
		public static final int MAHJONG =12;
		public static final int FRUIT =13;
		public static final int MAIL =14;
		public static final int TEXAS =15;
		public static final int CHAT =16;
		public static final int FRIEND =17;
		public static final int ALMS =18;
		public static final int CHARTS =19;
		public static final int TEST =70;
		public static final int HEART =80;
		public static final int GAME_DB =50;
		public static final int LOGIN_DB =51;
		public static final int GM_TOOL =66;

	}
	public static final String MAINCODE = "mainCode";
	public static final String SUBCODE = "subCode";
	public static final String ERRORCODE = "errorCode";

}