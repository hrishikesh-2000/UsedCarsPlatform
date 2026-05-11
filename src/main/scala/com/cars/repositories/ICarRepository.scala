package com.cars.repositories


import com.cars.models.Car
import scala.collection.mutable.ListBuffer


trait ICarRepository  {

  def getCars() : ListBuffer[Car]

  def addCar(car : Car) : Unit

}
