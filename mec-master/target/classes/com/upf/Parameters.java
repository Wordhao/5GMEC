package com.upf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Parameters {

    @Value("{upf.ipaddr}")
    public static String IPADDR;
//    public static String IPADDR="192.168.2.157";

    @Value("${upf.portnumber}")
    public static String PortNumber;
//    public static String PortNumber ="8500";

    @Value("${upf.version}")
    public static String Version;
//    public static String Version="v2";
    public static String StartURL="http://"+IPADDR+":"+PortNumber+"/"+Version+"/";
    public static String StartURL2="http://"+IPADDR+":"+PortNumber+"/"+"v1/";

}


