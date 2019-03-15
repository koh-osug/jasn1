/**
 * This class file was automatically generated by jASN1 v1.11.0 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.modules.module1;

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

import com.beanit.jasn1.compiler.modules.module2.EmployeeNumberZ;
import com.beanit.jasn1.compiler.modules.module3.Datezz;
import com.beanit.jasn1.compiler.modules.module3.EmployeeNumberzz;

public class MyBitString extends BerBitString {

	private static final long serialVersionUID = 1L;

	public MyBitString() {
	}

	public MyBitString(byte[] code) {
		super(code);
	}

	public MyBitString(byte[] value, int numBits) {
		super(value, numBits);
	}

	public MyBitString(boolean[] value) {
		super(value);
	}

}
