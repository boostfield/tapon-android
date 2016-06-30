package com.boostfield.tapon.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.boostfield.tapon.BuildConfig;
import com.boostfield.tapon.R;
import com.boostfield.tapon.utils.ChinaTvPay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void testConnection(View v) {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        String time = df.format(date);
        userId = "qky1412";

        String traceNum = new String("123456");
        Random random = new Random();
        long s = random.nextInt(999999);

//        String currentResourtString = ChinaTvPay.getInstance().processTxn(BuildConfig.HOST, BuildConfig.PORT,
//                timeout, xml, Code, aucAccountIn, passwd,
//				validate, dynamicpasswd, CVN2);
       // traceNum = RandomUtil.toFixdLengthString(s, 6);
//        String msgSndMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
//                + "<Quan><Quanbody>"
//                +
//                "<Msg><version>1.0.0</version><type>0010</type><flag>00</flag></Msg>"
//                + "<User><id>"
//                + userId
//                + "</id></User>"
//                + "<chInfo><telephone>"
//                + userId
//                + "</telephone></chInfo>"
//                + "<Purchase><acqBIN>"+ Consts.acqBIN + "</acqBIN><date>"
//                + time
//                + "</date><traceNum>"+ traceNum + "</traceNum></Purchase>"
//                + "<extInfo></extInfo><PubKeyIndex>020</PubKeyIndex>"
//                + "</Quanbody>"
//                + "<SecureData></SecureData>"
//                + "</Quan>";

//		String loginMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
//				+ "<CardPay>" + "<CardPaybody>" + "<Msg>"
//				+ "<version>1.0.0</version>" + "<type>0002</type>"
//				+ "<flag>00</flag>" + "</Msg>" + "<User>" + "<id>" + userId
//				+ "</id>" + "</User>" + "<Purchase>"
//				+ "<acqBIN>29002004</acqBIN>" + "<date>" + time + "</date>"
//				+ "<traceNum>" + traceNum + "</traceNum>" + "</Purchase>"
//				+ "<extInfo></extInfo><PubKeyIndex>020</PubKeyIndex>"
//				+ "</CardPaybody>" + "<SecureData></SecureData>" + "</CardPay>";

//        StringTemplate template = new StringTemplate(msgSndMessage);
//        String xml = template.toString();
//        int timeout = Consts.tppTimeOut;
//        String tppAddress = Consts.tppAddrCC;
//        int tppPort = Consts.tppPortCC;
//        String CVN2 = "";
//        String validate = "";
//        String Code = ed_pass.getText().toString();
//        String aucAccountIn = "";
//        String passwd = "";
//        String dynamicpasswd = "";
//
//        ret = 0;

//		ISOUtil.log("@@@@ sendxml:" + xml);
//		String currentResourtString = ChinaTvPay.getInstance().processTxn(
//				tppAddress, tppPort, timeout, xml, Code, aucAccountIn, passwd,
//				validate, dynamicpasswd, CVN2);
//
//		ISOUtil.log("@@@@ resultxml:" + currentResourtString);
//
//		CheckCardResultInfo resultInfo = ConfigureParser
//				.parse_checkCard(currentResourtString);
//		cardCheckInfo = resultInfo;
//		ISOUtil.log("@@@@ resp code is " + resultInfo.getRespCode());
    }
}
