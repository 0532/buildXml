package buildxml.core;

/**
 * Created by Lichao.W At 2015/7/2 16:53
 * wanglichao@163.com
 */

public class BaseTiaHeader {
    /*
    INFO	TRX_CODE	���״���	C(1, 20)	100004	��
	VERSION	�汾	C(2)	04	��
	DATA_TYPE	���ݸ�ʽ	N(1)	2��xml��ʽ	��
	LEVEL	������	N(1)	0ʵʱ����
            Ĭ��0	��
	USER_NAME	�û���	C(1,20)		��
	USER_PASS	�û�����			��
	REQ_SN	������ˮ��	C(30)		��	���ظ���ˮ(�Դ��ո�ϵͳ��ҪΨһ)
	SIGNED_MSG	ǩ����Ϣ	C		��	�Ա����ĵ�������Ϣ����ǩ�����������⡪��Ҳ����<SIGNED_MSG> </SIGNED_MSG>��
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
