package javaproject;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;

import java.util.Base64;

/**
 *
 * @author BORRAT Joan et SERRE Loïc
 */
/** encryption class */
public class AES {
	private Cipher ecipher;
	private Cipher dcipher;

	/** constructor of the class and generates ciphers from the given key */
	AES(SecretKey key) {

		try {
			ecipher = Cipher.getInstance("AES");
			dcipher = Cipher.getInstance("AES");
			ecipher.init(Cipher.ENCRYPT_MODE, key);
			dcipher.init(Cipher.DECRYPT_MODE, key);
		} catch (Exception e) {
		}
	}

	/** encrypt the given string */
	public String encrypt(String str) {

		try {
			byte[] utf8 = str.getBytes("UTF-8");
			byte[] enc = ecipher.doFinal(utf8);

			// return new sun.misc.BASE64Encoder().encode(enc);
			return Base64.getMimeEncoder().encodeToString(enc);
		} catch (Exception e) {
		}
		return null;
	}

	/** decrypt the string crypter */
	public String decrypt(String str) {

		try {
			// byte[] dec = new sun.misc.BASE64Decoder().decodeBuffer(str);
			byte[] dec = Base64.getMimeDecoder().decode(str);
			byte[] utf8 = dcipher.doFinal(dec);
			return new String(utf8, "UTF-8");
		} catch (Exception e) {
		}
		return null;
	}
}