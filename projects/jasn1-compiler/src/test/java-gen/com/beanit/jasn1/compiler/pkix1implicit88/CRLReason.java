/**
 * This class file was automatically generated by jASN1 v1.11.0 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.pkix1implicit88;

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

import com.beanit.jasn1.compiler.pkix1explicit88.Attribute;
import com.beanit.jasn1.compiler.pkix1explicit88.CertificateSerialNumber;
import com.beanit.jasn1.compiler.pkix1explicit88.DirectoryString;
import com.beanit.jasn1.compiler.pkix1explicit88.Name;
import com.beanit.jasn1.compiler.pkix1explicit88.ORAddress;
import com.beanit.jasn1.compiler.pkix1explicit88.RelativeDistinguishedName;

public class CRLReason extends BerEnum {

	private static final long serialVersionUID = 1L;

	public CRLReason() {
	}

	public CRLReason(byte[] code) {
		super(code);
	}

	public CRLReason(BigInteger value) {
		super(value);
	}

	public CRLReason(long value) {
		super(value);
	}

}
