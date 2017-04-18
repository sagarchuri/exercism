/**
An Atbash cipher for the Latin alphabet would be as follows:

Plain:  abcdefghijklmnopqrstuvwxyz
Cipher: zyxwvutsrqponmlkjihgfedcba

It is a very weak cipher because it only has one possible key, and it is a simple monoalphabetic substitution cipher. However, this may not have been an issue in the cipher's time.

Ciphertext is written out in groups of fixed length, the traditional group size being 5 letters, and punctuation is excluded. This is to make it harder to guess things based on word boundaries.

Examples

Encoding test gives gvhg
Decoding gvhg gives test
Decoding gsvjf rxpyi ldmul cqfnk hlevi gsvoz abwlt gives The quick brown fox jumps over the lazy dog.
*/

object Atbash {

  def encode(s: String): String = {
    val letters = ('a' to 'z')
    val p = (letters zip letters.reverse).toMap

    s.filter(_.isLetter)
    .toLowerCase.map(x => p.get(x).get)
    .mkString.grouped(5).mkString(" ")
  }

}