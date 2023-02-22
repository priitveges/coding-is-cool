package cipher;

import static cipher.Cipher.decodeROT13;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
class CipherTestTest {

  @Test
  void decodeROT13WorksWithSingleWord() {
    assertEquals(decodeROT13("VAONAX"), "INBANK");
  }

  @Test
  void decodeROT13WorksWithSentences() {
    assertEquals(decodeROT13("QB LBH UNIR NAL PNG CVPGHERF?"), "DO YOU HAVE ANY CAT PICTURES?");
  }
}
