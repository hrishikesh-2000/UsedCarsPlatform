package com.cars

import cask.MainRoutes
import scala.collection.mutable.ListBuffer
import ujson._
import com.cars.models.Car
import com.cars.services.CarService

object Main extends MainRoutes {


  @cask.get("/cars")
  def getCars() = {
    val jsonCars = CarService.getCars().map(car =>
      ujson.Obj(
        "brand" -> car.brand,
        "model" -> car.model,
        "price" -> car.price
      )
    )
 }

  @cask.postJson("/cars")
  def addCar(request : ujson.Value) = {
    val brand = request("brand").str
    val model = request("model").str
    val price : Int = request("price").num.toInt

    val car = Car(brand,model,price)

    CarService.addCar(car)

    ujson.Obj(
      "message" -> "Car Added Successfully"
    )
  }
  initialize()
}