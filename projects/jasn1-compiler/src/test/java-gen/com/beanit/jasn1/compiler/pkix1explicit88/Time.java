/**
 * This class file was automatically generated by jASN1 v1.11.0 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.pkix1explicit88;

import java.io.IOException;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.io.Serializable;
import com.beanit.jasn1.ber.*;
import com.beanit.jasn1.ber.types.*;
import com.beanit.jasn1.ber.types.string.*;


public class Time implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public byte[] code = null;
	public BerUtcTime utcTime = null;
	public BerGeneralizedTime generalTime = null;
	
	public Time() {
	}

	public Time(byte[] code) {
		this.code = code;
	}

	public Time(BerUtcTime utcTime, BerGeneralizedTime generalTime) {
		this.utcTime = utcTime;
		this.generalTime = generalTime;
	}

	public int encode(OutputStream reverseOS) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			return code.length;
		}

		int codeLength = 0;
		if (generalTime != null) {
			codeLength += generalTime.encode(reverseOS, true);
			return codeLength;
		}
		
		if (utcTime != null) {
			codeLength += utcTime.encode(reverseOS, true);
			return codeLength;
		}
		
		throw new IOException("Error encoding CHOICE: No element of CHOICE was selected.");
	}

	public int decode(InputStream is) throws IOException {
		return decode(is, null);
	}

	public int decode(InputStream is, BerTag berTag) throws IOException {

		int codeLength = 0;
		BerTag passedTag = berTag;

		if (berTag == null) {
			berTag = new BerTag();
			codeLength += berTag.decode(is);
		}

		if (berTag.equals(BerUtcTime.tag)) {
			utcTime = new BerUtcTime();
			codeLength += utcTime.decode(is, false);
			return codeLength;
		}

		if (berTag.equals(BerGeneralizedTime.tag)) {
			generalTime = new BerGeneralizedTime();
			codeLength += generalTime.decode(is, false);
			return codeLength;
		}

		if (passedTag != null) {
			return 0;
		}

		throw new IOException("Error decoding CHOICE: Tag " + berTag + " matched to no item.");
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		if (utcTime != null) {
			sb.append("utcTime: ").append(utcTime);
			return;
		}

		if (generalTime != null) {
			sb.append("generalTime: ").append(generalTime);
			return;
		}

		sb.append("<none>");
	}

}

