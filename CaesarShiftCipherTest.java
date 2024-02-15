package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;

public class CaesarShiftCipherTest {

    @Test
    public void testCaesarShiftCipherWithValidInput() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();

        // Test dịch chuyển 3 ký tự
        assertEquals("khoor", cipher.caesarShiftCipher("hello", 3));

        // Test dịch chuyển 1 ký tự
        assertEquals("ifmmp", cipher.caesarShiftCipher("hello", 1));

        // Test dịch chuyển 0 ký tự (không thay đổi)
        assertEquals("hello", cipher.caesarShiftCipher("hello", 0));

        // Test dịch chuyển -1 ký tự
        assertEquals("gdkkn", cipher.caesarShiftCipher("hello", -1));

        // Test dịch chuyển 26 ký tự (tương đương với 0 ký tự)
        assertEquals("hello", cipher.caesarShiftCipher("hello", 26));
    }

    @Test
    public void testCaesarShiftCipherWithInvalidInput() {
        CaesarShiftCipher cipher = new CaesarShiftCipher();

        // Test với chuỗi chứa kí tự không phải chữ cái
        assertEquals("invalid", cipher.caesarShiftCipher("hello1", 3));

        // Test với chuỗi rỗng
        assertEquals("", cipher.caesarShiftCipher("", 3));

        // Test với chuỗi chỉ chứa kí tự không phải chữ cái
        assertEquals("12345", cipher.caesarShiftCipher("12345", 3));
    }
}
