package com.cars.services

import com.cars.models.Car
import scala.collection.mutable.ListBuffer
import com.cars.repositories.CarRepository

object CarService {

  def getCars() = {
    CarRepository.getCars()
  }

  def addCar(car: Car): Unit = {

    // future business logic here
    // validations
    // duplicate checks
    // AI scoring
    // etc

    CarRepository.addCar(car)
  }

}
