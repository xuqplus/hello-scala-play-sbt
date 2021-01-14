package domain

import com.google.gson.GsonBuilder

class User(_id: Long, _name: String) {
  val id: Long = _id
  val name: String = _name

  override def toString: String = {
    //    super.toString
    new GsonBuilder().create().toJson(this)
  }
}
