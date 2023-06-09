/**

An interface representing a container for storing objects of type T.
 */
interface Container<T> {
    /**

    Adds an element of type T to the container.
    @param element The element to be added to the container.
     */
    fun add(element: T)

    /**

    Removes an element from the container at the specified index.
    @param index The index of the element to be removed.
     */
    fun remove(index: Int)

    /**

    Updates an element in the container at the specified index with a new element of type T.
    @param index The index of the element to be updated.
    @param element The new element to replace the existing element at the specified index.
     */
    fun update(index: Int, element: T)

    /**

    Retrieves the element at the specified index from the container.
    @param index The index of the element to be retrieved.
    @return The element at the specified index.
     */
    fun get(index: Int): T

    /**

    Retrieves all elements from the container.
    @return A list of all elements in the container.
     */
    fun getAll(): List<T>
}

/**

A class representing a container for storing Train objects.
 */
class TrainContainer : Container<Train> {
    private val trains: MutableList<Train> = mutableListOf()

    /**

    Adds a Train object to the container.
    @param element The Train object to be added to the container.
     */
    override fun add(element: Train) {
        trains.add(element)
    }

    /**

    Removes a Train object from the container at the specified index.
    @param index The index of the Train object to be removed.
     */
    override fun remove(index: Int) {
        trains.removeAt(index)
    }

    /**

    Updates a Train object in the container at the specified index with a new Train object.
    @param index The index of the Train object to be updated.
    @param element The new Train object to replace the existing Train object at the specified index.
     */
    override fun update(index: Int, element: Train) {
        trains[index] = element
    }

    /**

    Retrieves a Train object from the container at the specified index.
    @param index The index of the Train object to be retrieved.
    @return The Train object at the specified index.
     */
    override fun get(index: Int): Train {
        return trains[index]
    }

    /**

    Retrieves all Train objects from the container.
    @return A list of all Train objects in the container.
     */
    override fun getAll(): List<Train> {
        return trains
    }
}