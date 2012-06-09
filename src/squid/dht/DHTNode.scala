package squid.dht

/**
 * User: Alejandro Peláez
 * Date: 23/05/12
 * Time: 07:38 PM
 */

/**
 * Abstract class that serves as an interface to connect
 * to an actual dht implementation.
 * @param id The id of this node, the implementation will convert the string to the needed data type.
 */
abstract class DHTNode(id : String) {
  /**
   * Puts some data into the dht.
   * @param id The id of the data to store.
   * @param data The data to insert.
   */
  def put(id : String, data : Array[Byte])

  /**
   * Get some data from the dht.
   * @param id The id of the data to look for.
   */
  def get(id : String)

  /**
   * Determines whether or not this node contains the given data in its local space.
   * @param id The id to look for.
   * @return True if it has the given id in the local space, False otherwise.
   */
  def contains(id : String) : Boolean

  /**
   * Receives some from the dht.
   * @param data The received data.
   */
  def receive(data : Array[Byte])
}
