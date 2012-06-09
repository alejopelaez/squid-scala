package squid.mapper

/**
 * User: Alejandro Peláez
 * Date: 9/06/12
 * Time: 02:36 PM
 */

/**
 * Abstract class which describes the a function that maps from a keyspace to a identifier  space (N^n -> N)
 * along with some other functionality that allow recursive construction to allow distributing the search
 * algorithm.
 * @param bitsPerDimension
 */
abstract class Mapper(bitsPerDimension : Int) {
  /**
   * Transforms the given coordinates from the keyspace to the id space.
   * @param coords The coordinate of an element in the keyspace.
   * @return The corresponding id according to the mapping function.
   */
  def coordinatesToId(coords : Array[BigInt]) : BigInt

  /**
   * Transforms the given id from the id space to the keyspace.
   * @param id The id of an element in the id space.
   * @return The corresponding coordinates according to the inverse mapping function.
   *         The inverse function may not exist, in that case a representative of the inverse image is selected.
   */
  def idToCoordinates(id : BigInt) : Array[BigInt]
}
