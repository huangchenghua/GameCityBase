package com.gz.gamecity.protocol;

public class Protocols{


	public static final class C2l_login{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 1;
		public static final String UUID = "uuid";
		public static final String SDKTOKEN = "sdkToken";

	}
	public static final class L2c_login{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 2;
		public static final String NAME = "name";
		public static final String COIN = "coin";
		public static final String GAMETOKEN = "gameToken";
		public static final String SERVERLIST = "serverlist";

		public static final class Serverlist{
			public static final String NAME = "name";
			public static final String ADDRESS = "address";
			public static final String PORT = "port";
			public static final String STATUS = "status";

		}
	}
	public static final class C2g_login{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 1;
		public static final String UUID = "uuid";
		public static final String GAMETOKEN = "gameToken";

	}
	public static final class G2c_login{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 2;
		public static final String OPT = "opt";

	}
	public static final class G2l_login{
		public static final int mainCode_value = 1;
		public static final int subCode_value = 1;
		public static final String SERVERID = "serverId";

	}
	public static final class L2g_login{
		public static final int mainCode_value = 1;
		public static final int subCode_value = 2;
		public static final String OPT = "opt";

	}
	public static final class G2l_playerVerify{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 3;
		public static final String UUID = "uuid";
		public static final String GAMETOKEN = "gameToken";

	}
	public static final class L2g_playerVerify{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 3;
		public static final String NAME = "name";
		public static final String COIN = "coin";

	}
	public static final class Inner_login{
		public static final int mainCode_value = 8;
		public static final int subCode_value = 11;
		public static final String UUID = "uuid";

	}
	public static final class ProtocolConst {
		public static final String G2C_LOGIN_OPT_SUC ="1";
		public static final String L2G_LOGIN_OPT_SUC ="1";

	}
	public static final String MAINCODE = "mainCode";
	public static final String SUBCODE = "subCode";
	public static final String ERRORCODE = "errorCode";

}