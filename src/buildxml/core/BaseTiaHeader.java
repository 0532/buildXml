package buildxml.core;

/**
 * Created by Lichao.W At 2015/7/2 16:53
 * wanglichao@163.com
 */

public class BaseTiaHeader {
    /*
    INFO	TRX_CODE	交易代码	C(1, 20)	100004	否
	VERSION	版本	C(2)	04	否
	DATA_TYPE	数据格式	N(1)	2：xml格式	否
	LEVEL	处理级别	N(1)	0实时处理
            默认0	否
	USER_NAME	用户名	C(1,20)		否
	USER_PASS	用户密码			否
	REQ_SN	交易流水号	C(30)		否	不重复流水(对代收付系统需要唯一)
	SIGNED_MSG	签名信息	C		否	对本报文的所有信息进行签名（除本域外——也不含<SIGNED_MSG> </SIGNED_MSG>）
 */
    public String TRX_CODE = "";
    public String VERSION = "04";
    public String DATA_TYPE = "2";
    public String LEVEL = "0";

    public String USER_NAME = "";
    public String USER_PASS = "";


    public String REQ_SN = "";
    public String SIGNED_MSG = "";

}
