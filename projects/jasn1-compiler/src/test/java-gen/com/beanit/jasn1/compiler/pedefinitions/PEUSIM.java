/**
 * This class file was automatically generated by jASN1 v1.11.0 (http://www.beanit.com)
 */

package com.beanit.jasn1.compiler.pedefinitions;

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


public class PEUSIM implements BerType, Serializable {

	private static final long serialVersionUID = 1L;

	public static final BerTag tag = new BerTag(BerTag.UNIVERSAL_CLASS, BerTag.CONSTRUCTED, 16);

	public byte[] code = null;
	public PEHeader usimHeader = null;
	public BerObjectIdentifier templateID = null;
	public File adfUsim = null;
	public File efImsi = null;
	public File efArr = null;
	public File efKeys = null;
	public File efKeysPS = null;
	public File efHpplmn = null;
	public File efUst = null;
	public File efFdn = null;
	public File efSms = null;
	public File efSmsp = null;
	public File efSmss = null;
	public File efSpn = null;
	public File efEst = null;
	public File efStartHfn = null;
	public File efThreshold = null;
	public File efPsloci = null;
	public File efAcc = null;
	public File efFplmn = null;
	public File efLoci = null;
	public File efAd = null;
	public File efEcc = null;
	public File efNetpar = null;
	public File efEpsloci = null;
	public File efEpsnsc = null;
	
	public PEUSIM() {
	}

	public PEUSIM(byte[] code) {
		this.code = code;
	}

	public PEUSIM(PEHeader usimHeader, BerObjectIdentifier templateID, File adfUsim, File efImsi, File efArr, File efKeys, File efKeysPS, File efHpplmn, File efUst, File efFdn, File efSms, File efSmsp, File efSmss, File efSpn, File efEst, File efStartHfn, File efThreshold, File efPsloci, File efAcc, File efFplmn, File efLoci, File efAd, File efEcc, File efNetpar, File efEpsloci, File efEpsnsc) {
		this.usimHeader = usimHeader;
		this.templateID = templateID;
		this.adfUsim = adfUsim;
		this.efImsi = efImsi;
		this.efArr = efArr;
		this.efKeys = efKeys;
		this.efKeysPS = efKeysPS;
		this.efHpplmn = efHpplmn;
		this.efUst = efUst;
		this.efFdn = efFdn;
		this.efSms = efSms;
		this.efSmsp = efSmsp;
		this.efSmss = efSmss;
		this.efSpn = efSpn;
		this.efEst = efEst;
		this.efStartHfn = efStartHfn;
		this.efThreshold = efThreshold;
		this.efPsloci = efPsloci;
		this.efAcc = efAcc;
		this.efFplmn = efFplmn;
		this.efLoci = efLoci;
		this.efAd = efAd;
		this.efEcc = efEcc;
		this.efNetpar = efNetpar;
		this.efEpsloci = efEpsloci;
		this.efEpsnsc = efEpsnsc;
	}

	public int encode(OutputStream reverseOS) throws IOException {
		return encode(reverseOS, true);
	}

	public int encode(OutputStream reverseOS, boolean withTag) throws IOException {

		if (code != null) {
			for (int i = code.length - 1; i >= 0; i--) {
				reverseOS.write(code[i]);
			}
			if (withTag) {
				return tag.encode(reverseOS) + code.length;
			}
			return code.length;
		}

		int codeLength = 0;
		if (efEpsnsc != null) {
			codeLength += efEpsnsc.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 25
			reverseOS.write(0xB9);
			codeLength += 1;
		}
		
		if (efEpsloci != null) {
			codeLength += efEpsloci.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 24
			reverseOS.write(0xB8);
			codeLength += 1;
		}
		
		if (efNetpar != null) {
			codeLength += efNetpar.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 23
			reverseOS.write(0xB7);
			codeLength += 1;
		}
		
		codeLength += efEcc.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 22
		reverseOS.write(0xB6);
		codeLength += 1;
		
		if (efAd != null) {
			codeLength += efAd.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 21
			reverseOS.write(0xB5);
			codeLength += 1;
		}
		
		if (efLoci != null) {
			codeLength += efLoci.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 20
			reverseOS.write(0xB4);
			codeLength += 1;
		}
		
		if (efFplmn != null) {
			codeLength += efFplmn.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 19
			reverseOS.write(0xB3);
			codeLength += 1;
		}
		
		codeLength += efAcc.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 18
		reverseOS.write(0xB2);
		codeLength += 1;
		
		if (efPsloci != null) {
			codeLength += efPsloci.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 17
			reverseOS.write(0xB1);
			codeLength += 1;
		}
		
		if (efThreshold != null) {
			codeLength += efThreshold.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 16
			reverseOS.write(0xB0);
			codeLength += 1;
		}
		
		if (efStartHfn != null) {
			codeLength += efStartHfn.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 15
			reverseOS.write(0xAF);
			codeLength += 1;
		}
		
		codeLength += efEst.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 14
		reverseOS.write(0xAE);
		codeLength += 1;
		
		codeLength += efSpn.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 13
		reverseOS.write(0xAD);
		codeLength += 1;
		
		if (efSmss != null) {
			codeLength += efSmss.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 12
			reverseOS.write(0xAC);
			codeLength += 1;
		}
		
		if (efSmsp != null) {
			codeLength += efSmsp.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 11
			reverseOS.write(0xAB);
			codeLength += 1;
		}
		
		if (efSms != null) {
			codeLength += efSms.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 10
			reverseOS.write(0xAA);
			codeLength += 1;
		}
		
		if (efFdn != null) {
			codeLength += efFdn.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 9
			reverseOS.write(0xA9);
			codeLength += 1;
		}
		
		codeLength += efUst.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 8
		reverseOS.write(0xA8);
		codeLength += 1;
		
		if (efHpplmn != null) {
			codeLength += efHpplmn.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 7
			reverseOS.write(0xA7);
			codeLength += 1;
		}
		
		if (efKeysPS != null) {
			codeLength += efKeysPS.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 6
			reverseOS.write(0xA6);
			codeLength += 1;
		}
		
		if (efKeys != null) {
			codeLength += efKeys.encode(reverseOS, false);
			// write tag: CONTEXT_CLASS, CONSTRUCTED, 5
			reverseOS.write(0xA5);
			codeLength += 1;
		}
		
		codeLength += efArr.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 4
		reverseOS.write(0xA4);
		codeLength += 1;
		
		codeLength += efImsi.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 3
		reverseOS.write(0xA3);
		codeLength += 1;
		
		codeLength += adfUsim.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 2
		reverseOS.write(0xA2);
		codeLength += 1;
		
		codeLength += templateID.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, PRIMITIVE, 1
		reverseOS.write(0x81);
		codeLength += 1;
		
		codeLength += usimHeader.encode(reverseOS, false);
		// write tag: CONTEXT_CLASS, CONSTRUCTED, 0
		reverseOS.write(0xA0);
		codeLength += 1;
		
		codeLength += BerLength.encodeLength(reverseOS, codeLength);

		if (withTag) {
			codeLength += tag.encode(reverseOS);
		}

		return codeLength;

	}

	public int decode(InputStream is) throws IOException {
		return decode(is, true);
	}

	public int decode(InputStream is, boolean withTag) throws IOException {
		int codeLength = 0;
		int subCodeLength = 0;
		BerTag berTag = new BerTag();

		if (withTag) {
			codeLength += tag.decodeAndCheck(is);
		}

		BerLength length = new BerLength();
		codeLength += length.decode(is);

		int totalLength = length.val;
		if (totalLength == -1) {
			subCodeLength += berTag.decode(is);

			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
				usimHeader = new PEHeader();
				subCodeLength += usimHeader.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
				templateID = new BerObjectIdentifier();
				subCodeLength += templateID.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
				adfUsim = new File();
				subCodeLength += adfUsim.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
				efImsi = new File();
				subCodeLength += efImsi.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
				efArr = new File();
				subCodeLength += efArr.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
				efKeys = new File();
				subCodeLength += efKeys.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
				efKeysPS = new File();
				subCodeLength += efKeysPS.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
				efHpplmn = new File();
				subCodeLength += efHpplmn.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
				efUst = new File();
				subCodeLength += efUst.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
				efFdn = new File();
				subCodeLength += efFdn.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
				efSms = new File();
				subCodeLength += efSms.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
				efSmsp = new File();
				subCodeLength += efSmsp.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
				efSmss = new File();
				subCodeLength += efSmss.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
				efSpn = new File();
				subCodeLength += efSpn.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 14)) {
				efEst = new File();
				subCodeLength += efEst.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
				efStartHfn = new File();
				subCodeLength += efStartHfn.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 16)) {
				efThreshold = new File();
				subCodeLength += efThreshold.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 17)) {
				efPsloci = new File();
				subCodeLength += efPsloci.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
				efAcc = new File();
				subCodeLength += efAcc.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 19)) {
				efFplmn = new File();
				subCodeLength += efFplmn.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 20)) {
				efLoci = new File();
				subCodeLength += efLoci.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
				efAd = new File();
				subCodeLength += efAd.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 22)) {
				efEcc = new File();
				subCodeLength += efEcc.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 23)) {
				efNetpar = new File();
				subCodeLength += efNetpar.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 24)) {
				efEpsloci = new File();
				subCodeLength += efEpsloci.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			if (berTag.tagNumber == 0 && berTag.tagClass == 0 && berTag.primitive == 0) {
				int nextByte = is.read();
				if (nextByte != 0) {
					if (nextByte == -1) {
						throw new EOFException("Unexpected end of input stream.");
					}
					throw new IOException("Decoded sequence has wrong end of contents octets");
				}
				codeLength += subCodeLength + 1;
				return codeLength;
			}
			if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 25)) {
				efEpsnsc = new File();
				subCodeLength += efEpsnsc.decode(is, false);
				subCodeLength += berTag.decode(is);
			}
			int nextByte = is.read();
			if (berTag.tagNumber != 0 || berTag.tagClass != 0 || berTag.primitive != 0
			|| nextByte != 0) {
				if (nextByte == -1) {
					throw new EOFException("Unexpected end of input stream.");
				}
				throw new IOException("Decoded sequence has wrong end of contents octets");
			}
			codeLength += subCodeLength + 1;
			return codeLength;
		}

		codeLength += totalLength;

		subCodeLength += berTag.decode(is);
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 0)) {
			usimHeader = new PEHeader();
			subCodeLength += usimHeader.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.PRIMITIVE, 1)) {
			templateID = new BerObjectIdentifier();
			subCodeLength += templateID.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 2)) {
			adfUsim = new File();
			subCodeLength += adfUsim.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 3)) {
			efImsi = new File();
			subCodeLength += efImsi.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 4)) {
			efArr = new File();
			subCodeLength += efArr.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 5)) {
			efKeys = new File();
			subCodeLength += efKeys.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 6)) {
			efKeysPS = new File();
			subCodeLength += efKeysPS.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 7)) {
			efHpplmn = new File();
			subCodeLength += efHpplmn.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 8)) {
			efUst = new File();
			subCodeLength += efUst.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 9)) {
			efFdn = new File();
			subCodeLength += efFdn.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 10)) {
			efSms = new File();
			subCodeLength += efSms.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 11)) {
			efSmsp = new File();
			subCodeLength += efSmsp.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 12)) {
			efSmss = new File();
			subCodeLength += efSmss.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 13)) {
			efSpn = new File();
			subCodeLength += efSpn.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 14)) {
			efEst = new File();
			subCodeLength += efEst.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 15)) {
			efStartHfn = new File();
			subCodeLength += efStartHfn.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 16)) {
			efThreshold = new File();
			subCodeLength += efThreshold.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 17)) {
			efPsloci = new File();
			subCodeLength += efPsloci.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 18)) {
			efAcc = new File();
			subCodeLength += efAcc.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 19)) {
			efFplmn = new File();
			subCodeLength += efFplmn.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 20)) {
			efLoci = new File();
			subCodeLength += efLoci.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 21)) {
			efAd = new File();
			subCodeLength += efAd.decode(is, false);
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 22)) {
			efEcc = new File();
			subCodeLength += efEcc.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		else {
			throw new IOException("Tag does not match the mandatory sequence element tag.");
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 23)) {
			efNetpar = new File();
			subCodeLength += efNetpar.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 24)) {
			efEpsloci = new File();
			subCodeLength += efEpsloci.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
			subCodeLength += berTag.decode(is);
		}
		
		if (berTag.equals(BerTag.CONTEXT_CLASS, BerTag.CONSTRUCTED, 25)) {
			efEpsnsc = new File();
			subCodeLength += efEpsnsc.decode(is, false);
			if (subCodeLength == totalLength) {
				return codeLength;
			}
		}
		throw new IOException("Unexpected end of sequence, length tag: " + totalLength + ", actual sequence length: " + subCodeLength);

		
	}

	public void encodeAndSave(int encodingSizeGuess) throws IOException {
		ReverseByteArrayOutputStream reverseOS = new ReverseByteArrayOutputStream(encodingSizeGuess);
		encode(reverseOS, false);
		code = reverseOS.getArray();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		appendAsString(sb, 0);
		return sb.toString();
	}

	public void appendAsString(StringBuilder sb, int indentLevel) {

		sb.append("{");
		sb.append("\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (usimHeader != null) {
			sb.append("usimHeader: ");
			usimHeader.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("usimHeader: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (templateID != null) {
			sb.append("templateID: ").append(templateID);
		}
		else {
			sb.append("templateID: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (adfUsim != null) {
			sb.append("adfUsim: ");
			adfUsim.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("adfUsim: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efImsi != null) {
			sb.append("efImsi: ");
			efImsi.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efImsi: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efArr != null) {
			sb.append("efArr: ");
			efArr.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efArr: <empty-required-field>");
		}
		
		if (efKeys != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efKeys: ");
			efKeys.appendAsString(sb, indentLevel + 1);
		}
		
		if (efKeysPS != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efKeysPS: ");
			efKeysPS.appendAsString(sb, indentLevel + 1);
		}
		
		if (efHpplmn != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efHpplmn: ");
			efHpplmn.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efUst != null) {
			sb.append("efUst: ");
			efUst.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efUst: <empty-required-field>");
		}
		
		if (efFdn != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efFdn: ");
			efFdn.appendAsString(sb, indentLevel + 1);
		}
		
		if (efSms != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efSms: ");
			efSms.appendAsString(sb, indentLevel + 1);
		}
		
		if (efSmsp != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efSmsp: ");
			efSmsp.appendAsString(sb, indentLevel + 1);
		}
		
		if (efSmss != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efSmss: ");
			efSmss.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efSpn != null) {
			sb.append("efSpn: ");
			efSpn.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efSpn: <empty-required-field>");
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efEst != null) {
			sb.append("efEst: ");
			efEst.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efEst: <empty-required-field>");
		}
		
		if (efStartHfn != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efStartHfn: ");
			efStartHfn.appendAsString(sb, indentLevel + 1);
		}
		
		if (efThreshold != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efThreshold: ");
			efThreshold.appendAsString(sb, indentLevel + 1);
		}
		
		if (efPsloci != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efPsloci: ");
			efPsloci.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efAcc != null) {
			sb.append("efAcc: ");
			efAcc.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efAcc: <empty-required-field>");
		}
		
		if (efFplmn != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efFplmn: ");
			efFplmn.appendAsString(sb, indentLevel + 1);
		}
		
		if (efLoci != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efLoci: ");
			efLoci.appendAsString(sb, indentLevel + 1);
		}
		
		if (efAd != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efAd: ");
			efAd.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append(",\n");
		for (int i = 0; i < indentLevel + 1; i++) {
			sb.append("\t");
		}
		if (efEcc != null) {
			sb.append("efEcc: ");
			efEcc.appendAsString(sb, indentLevel + 1);
		}
		else {
			sb.append("efEcc: <empty-required-field>");
		}
		
		if (efNetpar != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efNetpar: ");
			efNetpar.appendAsString(sb, indentLevel + 1);
		}
		
		if (efEpsloci != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efEpsloci: ");
			efEpsloci.appendAsString(sb, indentLevel + 1);
		}
		
		if (efEpsnsc != null) {
			sb.append(",\n");
			for (int i = 0; i < indentLevel + 1; i++) {
				sb.append("\t");
			}
			sb.append("efEpsnsc: ");
			efEpsnsc.appendAsString(sb, indentLevel + 1);
		}
		
		sb.append("\n");
		for (int i = 0; i < indentLevel; i++) {
			sb.append("\t");
		}
		sb.append("}");
	}

}

