package domain

case class Car(id: Long, name: String)

/**
 * {
 * // toString can also be overridden for case classes
 * override def toString: String = {
 * //    super.toString
 * new GsonBuilder().create().toJson(this)
 * }
 * }
 */
