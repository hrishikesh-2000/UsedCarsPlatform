package com.cars.repositories

import scala.collection.mutable.ListBuffer
import com.cars.models.Car
import com.cars.repositories.ICarRepository

object CarRepository extends ICarRepository  {
    private val cars = ListBuffer(
    Car("Maruti", "Baleno", 630000),
    Car("Maruti", "Swift", 550000),
    Car("Hyundai", "i20", 710000)
  )

  def getCars(): ListBuffer[Car] = {
    cars
  }

  def addCar(car: Car): Unit = {
    cars += car
  }
}
