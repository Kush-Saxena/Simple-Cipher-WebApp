package com.kk.util;

public interface ICrypterService {

	String getCryptMessage(String message, int displace);

	String getDecryptMessage(String message, int displace);

}
