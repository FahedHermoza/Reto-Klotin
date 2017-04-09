package com.devart.fahed.developer.trainingappklotin

/**
 * Created by mac on 8/04/17.
 */

fun getItems() :  List<Item>{
  return (1..10).map { Item(it.toLong(), "Ciudad $it", "http://lorempixel.com/400/400/city/$it/") }
}

 data class Item (val id: Long, val title: String, val url:String)